package dev.f1client.auth;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.Base64;
import java.util.Deque;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.LongSupplier;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 * Self-contained stand-in for the real account service.
 *
 * <p>It implements the full {@link AuthBackend} contract (accounts, short-lived access
 * tokens, rotating refresh tokens, rate limiting) so the client can be demoed and tested
 * with no server. Accounts and refresh tokens can be persisted to a JSON file; passwords
 * are only ever stored as salted PBKDF2 hashes and refresh tokens as SHA-256 digests.
 *
 * <p>The switches {@link #setOffline}, {@link #setRateLimited} and {@link #revokeAllSessions}
 * exist so tests and demos can drive every error path of the client.
 */
public final class MockAuthBackend implements AuthBackend {
	/** Default access token lifetime: 15 minutes. */
	public static final long DEFAULT_ACCESS_TTL_MS = 15 * 60_000L;
	/** Default refresh token lifetime: 30 days. */
	public static final long DEFAULT_REFRESH_TTL_MS = 30L * 24 * 60 * 60_000L;

	private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
	private static final int HASH_ITERATIONS = 60_000;
	private static final int MAX_FAILURES = 5;
	private static final long FAILURE_WINDOW_MS = 60_000L;

	private final LongSupplier clock;
	private final Path file;
	private final SecureRandom random = new SecureRandom();
	private final Map<String, Account> accounts = new HashMap<>();
	private final Map<String, Grant> refreshGrants = new HashMap<>();
	private final Map<String, Grant> accessGrants = new HashMap<>();
	private final Deque<Long> recentFailures = new ArrayDeque<>();

	private long accessTtlMs = DEFAULT_ACCESS_TTL_MS;
	private long refreshTtlMs = DEFAULT_REFRESH_TTL_MS;
	private long latencyMs;
	private boolean offline;
	private boolean rateLimited;
	private int refreshCalls;

	private record Account(String username, String salt, String hash) {
	}

	private record Grant(String username, long expiresAtMs) {
	}

	/**
	 * @param clock epoch-millisecond time source
	 * @param file  JSON file used to keep accounts across launches, or {@code null} for memory only
	 */
	public MockAuthBackend(LongSupplier clock, Path file) {
		this.clock = clock;
		this.file = file;
		loadFromDisk();
	}

	/** Overrides token lifetimes; useful to watch refresh behaviour in a demo. */
	public synchronized MockAuthBackend withTokenLifetimes(long accessTtlMs, long refreshTtlMs) {
		this.accessTtlMs = accessTtlMs;
		this.refreshTtlMs = refreshTtlMs;
		return this;
	}

	/** Adds artificial latency to every call so the UI spinner is visible in a demo. */
	public synchronized MockAuthBackend withLatency(long latencyMs) {
		this.latencyMs = latencyMs;
		return this;
	}

	/** While offline every call fails with {@link AuthError#OFFLINE}. */
	public synchronized void setOffline(boolean offline) {
		this.offline = offline;
	}

	/** While rate limited every credential call fails with {@link AuthError#RATE_LIMITED}. */
	public synchronized void setRateLimited(boolean rateLimited) {
		this.rateLimited = rateLimited;
	}

	/** Invalidates every issued token, as a server-side "sign out everywhere" would. */
	public synchronized void revokeAllSessions() {
		refreshGrants.clear();
		accessGrants.clear();
		saveToDisk();
	}

	/** @return how many times {@link #refresh} was called. */
	public synchronized int refreshCalls() {
		return refreshCalls;
	}

	@Override
	public AuthSession register(String username, char[] password) throws AuthException {
		simulateNetwork();
		synchronized (this) {
			if (AuthValidator.username(username) != null || AuthValidator.password(new String(password)) != null) {
				throw new AuthException(AuthError.INVALID_REQUEST);
			}
			String key = key(username);
			if (accounts.containsKey(key)) {
				throw new AuthException(AuthError.NAME_TAKEN);
			}
			byte[] salt = new byte[16];
			random.nextBytes(salt);
			accounts.put(key, new Account(username, encode(salt), encode(hash(password, salt))));
			return issue(username);
		}
	}

	@Override
	public AuthSession login(String username, char[] password) throws AuthException {
		simulateNetwork();
		synchronized (this) {
			long now = clock.getAsLong();
			while (!recentFailures.isEmpty() && now - recentFailures.peekFirst() > FAILURE_WINDOW_MS) {
				recentFailures.pollFirst();
			}
			if (recentFailures.size() >= MAX_FAILURES) {
				throw new AuthException(AuthError.RATE_LIMITED);
			}
			Account account = accounts.get(key(username));
			if (account == null
					|| !MessageDigest.isEqual(hash(password, decode(account.salt())), decode(account.hash()))) {
				recentFailures.addLast(now);
				throw new AuthException(AuthError.INVALID_CREDENTIALS);
			}
			return issue(account.username());
		}
	}

	@Override
	public AuthSession refresh(String refreshToken) throws AuthException {
		simulateNetwork();
		synchronized (this) {
			refreshCalls++;
			Grant grant = refreshGrants.remove(digest(refreshToken));
			if (grant == null || grant.expiresAtMs() <= clock.getAsLong()) {
				saveToDisk();
				throw new AuthException(AuthError.UNAUTHORIZED);
			}
			return issue(grant.username());
		}
	}

	@Override
	public String me(String accessToken) throws AuthException {
		simulateNetwork();
		synchronized (this) {
			Grant grant = accessGrants.get(digest(accessToken));
			if (grant == null || grant.expiresAtMs() <= clock.getAsLong()) {
				throw new AuthException(AuthError.UNAUTHORIZED);
			}
			return grant.username();
		}
	}

	@Override
	public void logout(String accessToken, String refreshToken) throws AuthException {
		simulateNetwork();
		synchronized (this) {
			accessGrants.remove(digest(accessToken));
			refreshGrants.remove(digest(refreshToken));
			saveToDisk();
		}
	}

	private void simulateNetwork() throws AuthException {
		long delay;
		synchronized (this) {
			delay = latencyMs;
		}
		if (delay > 0) {
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		synchronized (this) {
			if (offline) {
				throw new AuthException(AuthError.OFFLINE);
			}
			if (rateLimited) {
				throw new AuthException(AuthError.RATE_LIMITED);
			}
		}
	}

	private AuthSession issue(String username) {
		long now = clock.getAsLong();
		String access = newToken();
		String refresh = newToken();
		accessGrants.put(digest(access), new Grant(username, now + accessTtlMs));
		refreshGrants.put(digest(refresh), new Grant(username, now + refreshTtlMs));
		accessGrants.values().removeIf(grant -> grant.expiresAtMs() <= now);
		refreshGrants.values().removeIf(grant -> grant.expiresAtMs() <= now);
		saveToDisk();
		return new AuthSession(username, access, refresh, now + accessTtlMs);
	}

	private String newToken() {
		byte[] bytes = new byte[32];
		random.nextBytes(bytes);
		return Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
	}

	private static String key(String username) {
		return username == null ? "" : username.toLowerCase(Locale.ROOT);
	}

	private static byte[] hash(char[] password, byte[] salt) {
		PBEKeySpec spec = new PBEKeySpec(password, salt, HASH_ITERATIONS, 256);
		try {
			return SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(spec).getEncoded();
		} catch (GeneralSecurityException e) {
			throw new IllegalStateException("PBKDF2 unavailable", e);
		} finally {
			spec.clearPassword();
		}
	}

	private static String digest(String token) {
		try {
			MessageDigest sha = MessageDigest.getInstance("SHA-256");
			return encode(sha.digest(token == null ? new byte[0] : token.getBytes(StandardCharsets.UTF_8)));
		} catch (GeneralSecurityException e) {
			throw new IllegalStateException("SHA-256 unavailable", e);
		}
	}

	private static String encode(byte[] bytes) {
		return Base64.getEncoder().encodeToString(bytes);
	}

	private static byte[] decode(String text) {
		return Base64.getDecoder().decode(text);
	}

	private void loadFromDisk() {
		if (file == null || !Files.isRegularFile(file)) {
			return;
		}
		try {
			JsonObject root = JsonParser.parseString(Files.readString(file, StandardCharsets.UTF_8)).getAsJsonObject();
			for (JsonElement element : root.getAsJsonArray("accounts")) {
				JsonObject json = element.getAsJsonObject();
				Account account = new Account(json.get("username").getAsString(),
						json.get("salt").getAsString(), json.get("hash").getAsString());
				accounts.put(key(account.username()), account);
			}
			for (Map.Entry<String, JsonElement> entry : root.getAsJsonObject("refreshTokens").entrySet()) {
				JsonObject json = entry.getValue().getAsJsonObject();
				refreshGrants.put(entry.getKey(),
						new Grant(json.get("username").getAsString(), json.get("expiresAtMs").getAsLong()));
			}
		} catch (IOException | RuntimeException ignored) {
			accounts.clear();
			refreshGrants.clear();
		}
	}

	private void saveToDisk() {
		if (file == null) {
			return;
		}
		JsonObject root = new JsonObject();
		root.addProperty("note", "F1Client mock auth backend. Password hashes and token digests only.");
		com.google.gson.JsonArray list = new com.google.gson.JsonArray();
		for (Account account : accounts.values()) {
			JsonObject json = new JsonObject();
			json.addProperty("username", account.username());
			json.addProperty("salt", account.salt());
			json.addProperty("hash", account.hash());
			list.add(json);
		}
		root.add("accounts", list);
		JsonObject tokens = new JsonObject();
		for (Map.Entry<String, Grant> entry : refreshGrants.entrySet()) {
			JsonObject json = new JsonObject();
			json.addProperty("username", entry.getValue().username());
			json.addProperty("expiresAtMs", entry.getValue().expiresAtMs());
			tokens.add(entry.getKey(), json);
		}
		root.add("refreshTokens", tokens);
		try {
			Files.createDirectories(file.toAbsolutePath().getParent());
			Files.writeString(file, GSON.toJson(root), StandardCharsets.UTF_8);
		} catch (IOException ignored) {
			// The mock keeps working from memory for this launch.
		}
	}
}
