package dev.f1client.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

/**
 * Reads and writes {@code config/f1client/config.json}.
 *
 * <p>The file keeps one profile per account ({@code accounts.<name>}) holding named
 * sections such as {@code global} and {@code modules}. A profile is only loaded after
 * authentication and is unloaded on logout, so a signed-out client never inherits
 * another account's module states.
 *
 * <p>Saving is debounced: {@link #markDirty()} starts a {@value #DEBOUNCE_MS} ms timer that
 * restarts on every further change, {@link #tick()} writes once it elapses, and
 * {@link #flush()} writes immediately (used on exit and logout). Snapshots are taken on
 * the calling thread; only file IO is handed to the executor.
 */
public final class ConfigManager {
	/** Quiet period after the last change before the file is written. */
	public static final long DEBOUNCE_MS = 500L;
	private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

	private record Section(Supplier<JsonElement> writer, Consumer<JsonElement> reader) {
	}

	private final Path file;
	private final LongSupplier clock;
	private final Executor io;
	private final Map<String, Section> sections = new LinkedHashMap<>();
	private final Object writeLock = new Object();
	private JsonObject root = new JsonObject();
	private String account;
	private boolean dirty;
	private long dirtySinceMs;
	private int saveCount;

	/**
	 * @param file  location of {@code config.json}
	 * @param clock millisecond time source
	 * @param io    executor that performs the file write
	 */
	public ConfigManager(Path file, LongSupplier clock, Executor io) {
		this.file = file;
		this.clock = clock;
		this.io = io;
	}

	/**
	 * Registers a named part of the profile.
	 *
	 * @param key    JSON key inside the account profile
	 * @param writer produces the current state
	 * @param reader applies stored state; receives {@code null} when nothing was stored
	 */
	public void registerSection(String key, Supplier<JsonElement> writer, Consumer<JsonElement> reader) {
		sections.put(key, new Section(writer, reader));
	}

	/** @return whether an account profile is currently loaded. */
	public boolean isLoaded() {
		return account != null;
	}

	/** @return how many times the file has been written (diagnostics and tests). */
	public int saveCount() {
		return saveCount;
	}

	/** Loads the profile of the given account and hands each section its stored data. */
	public void load(String accountName) {
		root = readRoot();
		account = accountName.toLowerCase(Locale.ROOT);
		dirty = false;
		JsonObject profile = profile(false);
		for (Map.Entry<String, Section> entry : sections.entrySet()) {
			entry.getValue().reader().accept(profile == null ? null : profile.get(entry.getKey()));
		}
		dirty = false;
	}

	/** Writes pending changes and forgets the loaded profile. */
	public void unload() {
		flush();
		account = null;
		dirty = false;
	}

	/** Notes that something changed; the write happens after the debounce period. */
	public void markDirty() {
		if (account == null) {
			return;
		}
		dirty = true;
		dirtySinceMs = clock.getAsLong();
	}

	/** Call regularly (once per client tick); writes when the debounce period has passed. */
	public void tick() {
		if (dirty && clock.getAsLong() - dirtySinceMs >= DEBOUNCE_MS) {
			save(false);
		}
	}

	/** Writes pending changes now, on the calling thread. */
	public void flush() {
		if (dirty) {
			save(true);
		}
	}

	private void save(boolean synchronous) {
		if (account == null) {
			return;
		}
		dirty = false;
		JsonObject profile = profile(true);
		for (Map.Entry<String, Section> entry : sections.entrySet()) {
			profile.add(entry.getKey(), entry.getValue().writer().get());
		}
		root.addProperty("version", 1);
		String text = GSON.toJson(root);
		saveCount++;
		if (synchronous) {
			write(text);
		} else {
			io.execute(() -> write(text));
		}
	}

	private JsonObject profile(boolean create) {
		JsonElement accounts = root.get("accounts");
		if (accounts == null || !accounts.isJsonObject()) {
			if (!create) {
				return null;
			}
			accounts = new JsonObject();
			root.add("accounts", accounts);
		}
		JsonElement profile = accounts.getAsJsonObject().get(account);
		if (profile == null || !profile.isJsonObject()) {
			if (!create) {
				return null;
			}
			profile = new JsonObject();
			accounts.getAsJsonObject().add(account, profile);
		}
		return profile.getAsJsonObject();
	}

	private JsonObject readRoot() {
		synchronized (writeLock) {
			try {
				if (Files.isRegularFile(file)) {
					return JsonParser.parseString(Files.readString(file, StandardCharsets.UTF_8)).getAsJsonObject();
				}
			} catch (IOException | RuntimeException e) {
				backupCorruptFile();
			}
			return new JsonObject();
		}
	}

	private void backupCorruptFile() {
		try {
			Files.move(file, file.resolveSibling(file.getFileName() + ".corrupt"), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException ignored) {
			// The unreadable file is simply overwritten on the next save.
		}
	}

	private void write(String text) {
		synchronized (writeLock) {
			try {
				Files.createDirectories(file.toAbsolutePath().getParent());
				Path temp = file.resolveSibling(file.getFileName() + ".tmp");
				Files.writeString(temp, text, StandardCharsets.UTF_8);
				try {
					Files.move(temp, file, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
				} catch (IOException atomicMoveFailed) {
					Files.move(temp, file, StandardCopyOption.REPLACE_EXISTING);
				}
			} catch (IOException ignored) {
				// Settings stay live in memory; the next change retries the write.
			}
		}
	}
}
