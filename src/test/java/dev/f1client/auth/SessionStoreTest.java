package dev.f1client.auth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class SessionStoreTest {
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	private static StoredSession sample() {
		return new StoredSession(new AuthSession("driver", "access-token-value", "refresh-token-value", 123_456L), 99L);
	}

	@Test
	public void roundTripsOnTheSameMachine() throws Exception {
		Path file = folder.getRoot().toPath().resolve("session.dat");
		new SessionStore(file, () -> "fp").save(sample());

		Optional<StoredSession> loaded = new SessionStore(file, () -> "fp").load();

		assertTrue(loaded.isPresent());
		assertEquals(sample(), loaded.get());
	}

	@Test
	public void differentFingerprintCannotDecrypt() throws Exception {
		Path file = folder.getRoot().toPath().resolve("session.dat");
		new SessionStore(file, () -> "fp").save(sample());

		assertFalse(new SessionStore(file, () -> "other machine").load().isPresent());
	}

	@Test
	public void tamperedFileIsRejected() throws Exception {
		Path file = folder.getRoot().toPath().resolve("session.dat");
		new SessionStore(file, () -> "fp").save(sample());
		byte[] bytes = Files.readAllBytes(file);
		bytes[bytes.length - 1] ^= 0x01;
		Files.write(file, bytes);

		assertFalse(new SessionStore(file, () -> "fp").load().isPresent());
	}

	@Test
	public void everySaveUsesFreshSaltAndNonce() throws Exception {
		Path file = folder.getRoot().toPath().resolve("session.dat");
		SessionStore store = new SessionStore(file, () -> "fp");
		store.save(sample());
		byte[] first = Files.readAllBytes(file);
		store.save(sample());
		byte[] second = Files.readAllBytes(file);

		assertFalse(java.util.Arrays.equals(first, second));
		String raw = new String(first, java.nio.charset.StandardCharsets.ISO_8859_1);
		assertFalse(raw.contains("refresh-token-value"));
	}

	@Test
	public void clearRemovesTheFile() throws Exception {
		Path file = folder.getRoot().toPath().resolve("session.dat");
		SessionStore store = new SessionStore(file, () -> "fp");
		store.save(sample());
		store.clear();

		assertFalse(Files.exists(file));
		assertFalse(store.load().isPresent());
	}
}
