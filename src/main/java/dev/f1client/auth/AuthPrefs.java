package dev.f1client.auth;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Pre-login settings stored in {@code auth.json}.
 *
 * <p>These live outside {@code config.json} on purpose: the main config is only read
 * after authentication, while the backend address and the "has this device ever signed
 * in" flag are needed to show the auth screen in the first place. No secrets are kept here.
 */
public final class AuthPrefs {
	private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

	/** Value shipped in {@code auth.json} until a real API address is filled in. */
	public static final String API_URL_PLACEHOLDER = "[YOUR API URL]";

	private final Path file;
	private String apiBaseUrl = API_URL_PLACEHOLDER;
	private String backend = "auto";
	private boolean everSignedIn;
	private boolean staySignedIn = true;
	private String lastUsername = "";

	public AuthPrefs(Path file) {
		this.file = file;
	}

	/** Reads the file if present; unknown or malformed content keeps the defaults. */
	public synchronized void load() {
		if (file == null || !Files.isRegularFile(file)) {
			return;
		}
		try {
			JsonObject json = JsonParser.parseString(Files.readString(file, StandardCharsets.UTF_8)).getAsJsonObject();
			if (json.has("apiBaseUrl")) {
				apiBaseUrl = json.get("apiBaseUrl").getAsString().trim();
			}
			if (json.has("backend")) {
				backend = json.get("backend").getAsString().trim();
			}
			if (json.has("everSignedIn")) {
				everSignedIn = json.get("everSignedIn").getAsBoolean();
			}
			if (json.has("staySignedIn")) {
				staySignedIn = json.get("staySignedIn").getAsBoolean();
			}
			if (json.has("lastUsername")) {
				lastUsername = json.get("lastUsername").getAsString();
			}
		} catch (IOException | RuntimeException ignored) {
			// Keep defaults; the file is rewritten on the next save.
		}
	}

	/** Writes the file, creating the directory when needed. */
	public synchronized void save() {
		if (file == null) {
			return;
		}
		JsonObject json = new JsonObject();
		json.addProperty("apiBaseUrl", apiBaseUrl);
		json.addProperty("backend", backend);
		json.addProperty("everSignedIn", everSignedIn);
		json.addProperty("staySignedIn", staySignedIn);
		json.addProperty("lastUsername", lastUsername);
		try {
			Files.createDirectories(file.toAbsolutePath().getParent());
			Files.writeString(file, GSON.toJson(json), StandardCharsets.UTF_8);
		} catch (IOException ignored) {
			// Preferences are a convenience; failing to persist them must not break login.
		}
	}

	/** @return base URL of the auth API; the placeholder or blank when not configured. */
	public synchronized String apiBaseUrl() {
		return apiBaseUrl;
	}

	/** @return whether a real API address replaced the placeholder. */
	public synchronized boolean hasApiUrl() {
		return !apiBaseUrl.isBlank() && !API_URL_PLACEHOLDER.equalsIgnoreCase(apiBaseUrl);
	}

	/** @return {@code true} when the bundled mock backend should be used. */
	public synchronized boolean useMockBackend() {
		return "mock".equalsIgnoreCase(backend) || (!"http".equalsIgnoreCase(backend) && !hasApiUrl());
	}

	/** @return whether any account ever signed in on this device (selects the default tab). */
	public synchronized boolean everSignedIn() {
		return everSignedIn;
	}

	/** @return last choice of the "stay signed in" checkbox. */
	public synchronized boolean staySignedIn() {
		return staySignedIn;
	}

	/** @return the last account name that signed in, for pre-filling the login form. */
	public synchronized String lastUsername() {
		return lastUsername;
	}

	/** Records a successful sign-in and persists it. */
	public synchronized void rememberSignIn(String username, boolean staySignedIn) {
		this.everSignedIn = true;
		this.lastUsername = username;
		this.staySignedIn = staySignedIn;
		save();
	}
}
