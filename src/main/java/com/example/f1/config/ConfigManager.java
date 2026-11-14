package com.example.f1.config;

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
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

/**
 * Reads and writes {@code config/f1client/config.json}: the client's profiles.
 *
 * <p>The file holds any number of named profiles plus the name of the one in use:
 *
 * <pre>
 * { "version": 1, "active": "default",
 *   "profiles": { "default": { "global": {...}, "modules": {...} } } }
 * </pre>
 *
 * <p>Each profile carries named sections. This client registers two, {@code global} for the
 * client-wide settings and {@code modules} for every module's enabled flag, favourite pin
 * and settings, so switching profile swaps the whole client over at once: colours, keys,
 * what is on and how each of those behaves.
 *
 * <p>Saving is debounced: {@link #markDirty()} starts a {@value #DEBOUNCE_MS} ms timer that
 * restarts on every further change, {@link #tick()} writes once it elapses, and
 * {@link #flush()} writes immediately (used on exit and before a profile switch). Snapshots
 * are taken on the calling thread; only the file write is handed to the executor. The write
 * goes to a temporary file and is moved into place, so a crash mid-save cannot leave a
 * half-written profile behind.
 */
public final class ConfigManager {
	/** Quiet period after the last change before the file is written. */
	public static final long DEBOUNCE_MS = 500L;
	/** Name of the profile created when the file is empty. */
	public static final String DEFAULT_PROFILE = "default";
	/** Longest accepted profile name. */
	public static final int MAX_NAME_LENGTH = 32;

	private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

	private record Section(Supplier<JsonElement> writer, Consumer<JsonElement> reader) {
	}

	private final Path file;
	private final LongSupplier clock;
	private final Executor io;
	private final Map<String, Section> sections = new LinkedHashMap<>();
	private final Object writeLock = new Object();
	private JsonObject root = new JsonObject();
	private String active = DEFAULT_PROFILE;
	private boolean dirty;
	private long dirtySinceMs;
	private int saveCount;

	/**
	 * Creates a manager that writes to {@code file} using its own single-threaded writer.
	 *
	 * @param file location of {@code config.json}
	 */
	public ConfigManager(Path file) {
		this(file, System::currentTimeMillis,
				Executors.newSingleThreadExecutor(runnable -> {
					Thread thread = new Thread(runnable, "F1 Client config writer");
					thread.setDaemon(true);
					return thread;
				}));
	}

	/**
	 * @param file  location of {@code config.json}
	 * @param clock millisecond time source, so the debounce can be tested
	 * @param io    executor that performs the file write
	 */
	public ConfigManager(Path file, LongSupplier clock, Executor io) {
		this.file = file;
		this.clock = clock;
		this.io = io;
	}

	/**
	 * Registers a named part of a profile.
	 *
	 * @param key    JSON key inside the profile
	 * @param writer produces the current state
	 * @param reader applies stored state; receives {@code null} when nothing was stored
	 */
	public void registerSection(String key, Supplier<JsonElement> writer, Consumer<JsonElement> reader) {
		sections.put(key, new Section(writer, reader));
	}

	/** Reads the file and applies the active profile to every registered section. */
	public void load() {
		root = readRoot();
		String stored = root.has("active") && root.get("active").isJsonPrimitive()
				? root.get("active").getAsString()
				: DEFAULT_PROFILE;
		active = profiles().contains(stored) ? stored : DEFAULT_PROFILE;
		applyProfile();
	}

	/** @return the profile names, in the order they appear in the file. */
	public List<String> profiles() {
		List<String> names = new ArrayList<>();
		JsonObject profiles = profilesObject(false);
		if (profiles != null) {
			for (String key : profiles.keySet()) {
				if (profiles.get(key).isJsonObject()) {
					names.add(key);
				}
			}
		}
		if (names.isEmpty()) {
			names.add(DEFAULT_PROFILE);
		}
		return names;
	}

	/** @return the profile currently applied. */
	public String activeProfile() {
		return active;
	}

	/** @return how many times the file has been written; used by diagnostics and tests. */
	public int saveCount() {
		return saveCount;
	}

	/**
	 * Switches to another profile, saving the current one first.
	 *
	 * @return whether the profile exists and was applied
	 */
	public boolean switchProfile(String name) {
		String key = sanitize(name);
		if (key.equals(active) || !profiles().contains(key)) {
			return false;
		}
		flush();
		active = key;
		root.addProperty("active", active);
		applyProfile();
		markDirty();
		return true;
	}

	/**
	 * Adds an empty profile and switches to it.
	 *
	 * @return whether it was created; a duplicate or unusable name creates nothing
	 */
	public boolean createProfile(String name) {
		String key = sanitize(name);
		if (key.isEmpty() || profiles().contains(key)) {
			return false;
		}
		flush();
		profilesObject(true).add(key, new JsonObject());
		active = key;
		root.addProperty("active", active);
		// The sections read "nothing stored", so every value falls back to its default.
		applyProfile();
		markDirty();
		return true;
	}

	/**
	 * Copies a profile under a new name and switches to the copy.
	 *
	 * @return whether it was created
	 */
	public boolean duplicateProfile(String source, String name) {
		String from = sanitize(source);
		String to = sanitize(name);
		JsonObject profiles = profilesObject(false);
		if (to.isEmpty() || profiles == null || !profiles.has(from) || profiles().contains(to)) {
			return false;
		}
		flush();
		JsonElement copy = JsonParser.parseString(GSON.toJson(profiles.get(from)));
		profilesObject(true).add(to, copy);
		active = to;
		root.addProperty("active", active);
		applyProfile();
		markDirty();
		return true;
	}

	/**
	 * Removes a profile. The active one is removed last, so deleting it switches to another
	 * profile rather than leaving the client with none.
	 *
	 * @return whether it was removed; the only remaining profile cannot be removed
	 */
	public boolean deleteProfile(String name) {
		String key = sanitize(name);
		List<String> names = profiles();
		if (!names.contains(key) || names.size() <= 1) {
			return false;
		}
		flush();
		JsonObject profiles = profilesObject(true);
		profiles.remove(key);
		if (key.equals(active)) {
			active = names.stream().filter(other -> !other.equals(key)).findFirst().orElse(DEFAULT_PROFILE);
			root.addProperty("active", active);
			applyProfile();
		}
		markDirty();
		return true;
	}

	/** Restores every setting of the active profile to its default. */
	public void resetProfile() {
		for (Section section : sections.values()) {
			section.reader().accept(null);
		}
		markDirty();
	}

	/** Notes that something changed; the write happens after the debounce period. */
	public void markDirty() {
		dirty = true;
		dirtySinceMs = clock.getAsLong();
	}

	/** Call once per client tick; writes when the debounce period has passed. */
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

	private void applyProfile() {
		JsonObject profile = profile(active, false);
		for (Map.Entry<String, Section> entry : sections.entrySet()) {
			entry.getValue().reader().accept(profile == null ? null : profile.get(entry.getKey()));
		}
		dirty = false;
	}

	private void save(boolean synchronous) {
		dirty = false;
		JsonObject profile = profile(active, true);
		for (Map.Entry<String, Section> entry : sections.entrySet()) {
			profile.add(entry.getKey(), entry.getValue().writer().get());
		}
		root.addProperty("version", 1);
		root.addProperty("active", active);
		String text = GSON.toJson(root);
		saveCount++;
		if (synchronous) {
			write(text);
		} else {
			io.execute(() -> write(text));
		}
	}

	/** @return the profile object, creating it when asked to. */
	private JsonObject profile(String name, boolean create) {
		JsonObject profiles = profilesObject(create);
		if (profiles == null) {
			return null;
		}
		JsonElement profile = profiles.get(name);
		if (profile == null || !profile.isJsonObject()) {
			if (!create) {
				return null;
			}
			profile = new JsonObject();
			profiles.add(name, profile);
		}
		return profile.getAsJsonObject();
	}

	private JsonObject profilesObject(boolean create) {
		JsonElement profiles = root.get("profiles");
		if (profiles == null || !profiles.isJsonObject()) {
			if (!create) {
				return null;
			}
			JsonObject created = new JsonObject();
			root.add("profiles", created);
			return created;
		}
		return profiles.getAsJsonObject();
	}

	/**
	 * Turns a player-typed name into something safe to store and to read back: lower case,
	 * letters, digits, space, underscore and hyphen only, trimmed and length-capped.
	 */
	public static String sanitize(String name) {
		if (name == null) {
			return "";
		}
		StringBuilder text = new StringBuilder();
		for (int i = 0; i < name.length() && text.length() < MAX_NAME_LENGTH; i++) {
			char character = name.charAt(i);
			boolean allowed = character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z'
					|| character >= '0' && character <= '9' || character == ' ' || character == '_'
					|| character == '-';
			if (allowed) {
				text.append(character);
			}
		}
		return text.toString().trim().toLowerCase(Locale.ROOT).replace(' ', '-');
	}

	private JsonObject readRoot() {
		synchronized (writeLock) {
			try {
				if (Files.isRegularFile(file)) {
					JsonElement parsed = JsonParser.parseString(Files.readString(file, StandardCharsets.UTF_8));
					if (parsed.isJsonObject()) {
						return parsed.getAsJsonObject();
					}
				}
			} catch (IOException | RuntimeException e) {
				backupCorruptFile();
			}
			return new JsonObject();
		}
	}

	/** Moves an unreadable file aside so the player can recover it by hand. */
	private void backupCorruptFile() {
		try {
			Files.move(file, file.resolveSibling(file.getFileName() + ".corrupt"),
					StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException ignored) {
			// The unreadable file is simply overwritten on the next save.
		}
	}

	private void write(String text) {
		synchronized (writeLock) {
			try {
				Path parent = file.toAbsolutePath().getParent();
				if (parent != null) {
					Files.createDirectories(parent);
				}
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
