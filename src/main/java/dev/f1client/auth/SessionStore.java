package dev.f1client.auth;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Encrypted, device-locked persistence of the session tokens.
 *
 * <p>File layout: {@code "F1S1" | salt[16] | iv[12] | AES-256-GCM ciphertext+tag}. The key
 * is PBKDF2-HMAC-SHA256 (210,000 iterations) over the {@link DeviceFingerprint} with the
 * per-install salt. The header doubles as GCM associated data, so a file copied to another
 * machine, or tampered with, fails authentication and reads as "no session".
 */
public final class SessionStore {
	static final int ITERATIONS = 210_000;
	private static final byte[] MAGIC = {'F', '1', 'S', '1'};
	private static final int SALT_BYTES = 16;
	private static final int IV_BYTES = 12;
	private static final int TAG_BITS = 128;
	private static final int HEADER_BYTES = MAGIC.length + SALT_BYTES;

	private final Path file;
	private final Supplier<String> fingerprint;
	private final SecureRandom random = new SecureRandom();
	private byte[] keySalt;
	private SecretKey key;

	/**
	 * @param file        location of {@code session.dat}
	 * @param fingerprint supplier of the device fingerprint, evaluated lazily off-thread
	 */
	public SessionStore(Path file, Supplier<String> fingerprint) {
		this.file = file;
		this.fingerprint = fingerprint;
	}

	/** @return the stored session, or empty when missing, corrupt or bound to another device. */
	public synchronized Optional<StoredSession> load() {
		try {
			if (!Files.isRegularFile(file)) {
				return Optional.empty();
			}
			byte[] data = Files.readAllBytes(file);
			if (data.length <= HEADER_BYTES + IV_BYTES || !Arrays.equals(Arrays.copyOf(data, MAGIC.length), MAGIC)) {
				return Optional.empty();
			}
			byte[] salt = Arrays.copyOfRange(data, MAGIC.length, HEADER_BYTES);
			byte[] iv = Arrays.copyOfRange(data, HEADER_BYTES, HEADER_BYTES + IV_BYTES);
			Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
			cipher.init(Cipher.DECRYPT_MODE, keyFor(salt), new GCMParameterSpec(TAG_BITS, iv));
			cipher.updateAAD(data, 0, HEADER_BYTES);
			byte[] plain = cipher.doFinal(data, HEADER_BYTES + IV_BYTES, data.length - HEADER_BYTES - IV_BYTES);
			JsonObject json = JsonParser.parseString(new String(plain, StandardCharsets.UTF_8)).getAsJsonObject();
			Arrays.fill(plain, (byte) 0);
			return Optional.of(StoredSession.fromJson(json));
		} catch (IOException | GeneralSecurityException | RuntimeException e) {
			return Optional.empty();
		}
	}

	/** Encrypts and atomically replaces the session file. */
	public synchronized void save(StoredSession session) throws IOException {
		try {
			byte[] salt = existingSalt();
			byte[] iv = new byte[IV_BYTES];
			random.nextBytes(iv);
			byte[] header = ByteBuffer.allocate(HEADER_BYTES).put(MAGIC).put(salt).array();
			Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
			cipher.init(Cipher.ENCRYPT_MODE, keyFor(salt), new GCMParameterSpec(TAG_BITS, iv));
			cipher.updateAAD(header);
			byte[] plain = session.toJson().toString().getBytes(StandardCharsets.UTF_8);
			byte[] encrypted = cipher.doFinal(plain);
			Arrays.fill(plain, (byte) 0);

			Files.createDirectories(file.toAbsolutePath().getParent());
			Path temp = file.resolveSibling(file.getFileName() + ".tmp");
			Files.write(temp, ByteBuffer.allocate(header.length + iv.length + encrypted.length)
					.put(header).put(iv).put(encrypted).array());
			try {
				Files.move(temp, file, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
			} catch (IOException atomicMoveFailed) {
				Files.move(temp, file, StandardCopyOption.REPLACE_EXISTING);
			}
		} catch (GeneralSecurityException e) {
			throw new IOException("Could not encrypt the session", e);
		}
	}

	/** Deletes the session file. Missing files are fine. */
	public synchronized void clear() {
		try {
			Files.deleteIfExists(file);
		} catch (IOException ignored) {
			// Nothing sensible to do; a stale file fails to refresh and is replaced on next login.
		}
	}

	/** Reuses the per-install salt of an existing file so the derived key stays cached. */
	private byte[] existingSalt() {
		if (keySalt != null) {
			return keySalt;
		}
		try {
			if (Files.isRegularFile(file)) {
				byte[] data = Files.readAllBytes(file);
				if (data.length > HEADER_BYTES && Arrays.equals(Arrays.copyOf(data, MAGIC.length), MAGIC)) {
					return Arrays.copyOfRange(data, MAGIC.length, HEADER_BYTES);
				}
			}
		} catch (IOException ignored) {
			// Fall through to a fresh salt.
		}
		byte[] salt = new byte[SALT_BYTES];
		random.nextBytes(salt);
		return salt;
	}

	private SecretKey keyFor(byte[] salt) throws GeneralSecurityException {
		if (key != null && Arrays.equals(salt, keySalt)) {
			return key;
		}
		char[] secret = fingerprint.get().toCharArray();
		PBEKeySpec spec = new PBEKeySpec(secret, salt, ITERATIONS, 256);
		try {
			byte[] raw = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(spec).getEncoded();
			key = new SecretKeySpec(raw, "AES");
			keySalt = salt.clone();
			Arrays.fill(raw, (byte) 0);
			return key;
		} finally {
			spec.clearPassword();
			Arrays.fill(secret, '\0');
		}
	}
}
