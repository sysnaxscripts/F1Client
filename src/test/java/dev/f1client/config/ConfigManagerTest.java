package dev.f1client.config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class ConfigManagerTest {
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	private long now;
	private Path file;
	private int value;
	private JsonElement lastRead;
	private boolean readCalled;

	@Before
	public void setUp() {
		file = folder.getRoot().toPath().resolve("f1client").resolve("config.json");
	}

	private ConfigManager manager() {
		ConfigManager config = new ConfigManager(file, () -> now, Runnable::run);
		config.registerSection("value", () -> new JsonPrimitive(value), json -> {
			readCalled = true;
			lastRead = json;
			if (json != null) {
				value = json.getAsInt();
			}
		});
		return config;
	}

	@Test
	public void nothingIsReadOrWrittenBeforeAnAccountLoads() {
		ConfigManager config = manager();
		config.markDirty();
		now += 10_000;
		config.tick();
		config.flush();

		assertFalse(readCalled);
		assertFalse(config.isLoaded());
		assertFalse(Files.exists(file));
	}

	@Test
	public void savesAreDebouncedByHalfASecond() {
		ConfigManager config = manager();
		config.load("driver");
		value = 1;
		config.markDirty();
		now += 499;
		config.tick();
		assertEquals(0, config.saveCount());

		value = 2;
		config.markDirty();
		now += 499;
		config.tick();
		assertEquals(0, config.saveCount());

		now += 1;
		config.tick();
		assertEquals(1, config.saveCount());
		assertTrue(Files.exists(file));

		now += 5_000;
		config.tick();
		assertEquals(1, config.saveCount());
	}

	@Test
	public void flushWritesImmediatelyAndRoundTrips() {
		ConfigManager config = manager();
		config.load("driver");
		assertNull(lastRead);
		value = 42;
		config.markDirty();
		config.flush();

		value = 0;
		ConfigManager reloaded = manager();
		reloaded.load("Driver");
		assertEquals(42, value);
	}

	@Test
	public void profilesAreSeparatePerAccount() {
		ConfigManager config = manager();
		config.load("alice");
		value = 7;
		config.markDirty();
		config.unload();

		value = 0;
		config.load("bob");
		assertNull(lastRead);
		value = 9;
		config.markDirty();
		config.unload();

		config.load("alice");
		assertEquals(7, value);
	}

	@Test
	public void corruptFileIsSetAsideNotFatal() throws Exception {
		Files.createDirectories(file.getParent());
		Files.writeString(file, "{ this is not json");
		ConfigManager config = manager();
		config.load("driver");

		assertTrue(config.isLoaded());
		assertTrue(Files.exists(file.resolveSibling("config.json.corrupt")));
	}
}
