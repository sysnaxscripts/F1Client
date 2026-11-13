package dev.f1client.auth;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Locale;
import java.util.function.LongSupplier;

/**
 * {@link AuthBackend} speaking JSON over HTTPS to {@code apiBaseUrl}.
 *
 * <p>Wire contract (documented in full in the README):
 * <pre>
 * POST /auth/register {"username","password"}       -> 200/201 token response
 * POST /auth/login    {"username","password"}       -> 200 token response
 * POST /auth/refresh  {"refreshToken"}              -> 200 token response
 * GET  /auth/me       Authorization: Bearer access  -> 200 {"username"}
 * POST /auth/logout   Bearer access, {"refreshToken"} -> 200/204
 * token response: {"username","accessToken","refreshToken","expiresIn": seconds}
 * </pre>
 * Request bodies are never logged, and plain HTTP is refused for anything but loopback.
 */
public final class HttpAuthBackend implements AuthBackend {
	private static final Duration CONNECT_TIMEOUT = Duration.ofSeconds(8);
	private static final Duration REQUEST_TIMEOUT = Duration.ofSeconds(12);

	private final URI base;
	private final LongSupplier clock;
	private final HttpClient http;

	/**
	 * @param baseUrl API root, for example {@code https://api.example.com}
	 * @param clock   epoch-millisecond time source used to turn {@code expiresIn} into a deadline
	 * @throws IllegalArgumentException when the URL is malformed or not HTTPS
	 */
	public HttpAuthBackend(String baseUrl, LongSupplier clock) {
		String trimmed = baseUrl.trim();
		while (trimmed.endsWith("/")) {
			trimmed = trimmed.substring(0, trimmed.length() - 1);
		}
		this.base = URI.create(trimmed);
		String scheme = base.getScheme() == null ? "" : base.getScheme().toLowerCase(Locale.ROOT);
		String host = base.getHost() == null ? "" : base.getHost().toLowerCase(Locale.ROOT);
		boolean loopback = host.equals("localhost") || host.equals("127.0.0.1") || host.equals("[::1]");
		if (!scheme.equals("https") && !(scheme.equals("http") && loopback)) {
			throw new IllegalArgumentException("apiBaseUrl must use https");
		}
		this.clock = clock;
		this.http = HttpClient.newBuilder().connectTimeout(CONNECT_TIMEOUT).build();
	}

	@Override
	public AuthSession register(String username, char[] password) throws AuthException {
		return session(post("/auth/register", credentials(username, password), null, AuthError.INVALID_REQUEST));
	}

	@Override
	public AuthSession login(String username, char[] password) throws AuthException {
		return session(post("/auth/login", credentials(username, password), null, AuthError.INVALID_CREDENTIALS));
	}

	@Override
	public AuthSession refresh(String refreshToken) throws AuthException {
		JsonObject body = new JsonObject();
		body.addProperty("refreshToken", refreshToken);
		return session(post("/auth/refresh", body, null, AuthError.UNAUTHORIZED));
	}

	@Override
	public String me(String accessToken) throws AuthException {
		HttpRequest request = HttpRequest.newBuilder(base.resolve(base.getPath() + "/auth/me"))
				.timeout(REQUEST_TIMEOUT)
				.header("Accept", "application/json")
				.header("Authorization", "Bearer " + accessToken)
				.GET()
				.build();
		JsonObject json = send(request, AuthError.UNAUTHORIZED);
		return string(json, "username");
	}

	@Override
	public void logout(String accessToken, String refreshToken) throws AuthException {
		JsonObject body = new JsonObject();
		body.addProperty("refreshToken", refreshToken);
		post("/auth/logout", body, accessToken, AuthError.UNAUTHORIZED);
	}

	private static JsonObject credentials(String username, char[] password) {
		JsonObject body = new JsonObject();
		body.addProperty("username", username);
		body.addProperty("password", new String(password));
		return body;
	}

	private JsonObject post(String path, JsonObject body, String bearer, AuthError onUnauthorized) throws AuthException {
		HttpRequest.Builder builder = HttpRequest.newBuilder(base.resolve(base.getPath() + path))
				.timeout(REQUEST_TIMEOUT)
				.header("Content-Type", "application/json; charset=utf-8")
				.header("Accept", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString(body.toString(), StandardCharsets.UTF_8));
		if (bearer != null) {
			builder.header("Authorization", "Bearer " + bearer);
		}
		return send(builder.build(), onUnauthorized);
	}

	private JsonObject send(HttpRequest request, AuthError onUnauthorized) throws AuthException {
		HttpResponse<String> response;
		try {
			response = http.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
		} catch (IOException e) {
			throw new AuthException(AuthError.OFFLINE);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new AuthException(AuthError.OFFLINE);
		}
		int status = response.statusCode();
		if (status >= 200 && status < 300) {
			String text = response.body();
			if (text == null || text.isBlank()) {
				return new JsonObject();
			}
			try {
				return JsonParser.parseString(text).getAsJsonObject();
			} catch (RuntimeException e) {
				throw new AuthException(AuthError.SERVER_ERROR);
			}
		}
		throw new AuthException(switch (status) {
			case 401, 403 -> onUnauthorized;
			case 409 -> AuthError.NAME_TAKEN;
			case 429 -> AuthError.RATE_LIMITED;
			case 400, 404, 422 -> AuthError.INVALID_REQUEST;
			default -> AuthError.SERVER_ERROR;
		});
	}

	private AuthSession session(JsonObject json) throws AuthException {
		try {
			long expiresInSeconds = json.get("expiresIn").getAsLong();
			return new AuthSession(string(json, "username"), string(json, "accessToken"),
					string(json, "refreshToken"), clock.getAsLong() + expiresInSeconds * 1000L);
		} catch (RuntimeException e) {
			throw new AuthException(AuthError.SERVER_ERROR);
		}
	}

	private static String string(JsonObject json, String key) throws AuthException {
		if (!json.has(key) || !json.get(key).isJsonPrimitive()) {
			throw new AuthException(AuthError.SERVER_ERROR);
		}
		return json.get(key).getAsString();
	}
}
