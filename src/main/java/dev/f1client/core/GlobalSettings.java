package dev.f1client.core;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dev.f1client.render.Theme;
import dev.f1client.setting.BoolSetting;
import dev.f1client.setting.EnumSetting;
import dev.f1client.setting.KeybindSetting;
import dev.f1client.setting.Setting;
import dev.f1client.util.UiSounds;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.lwjgl.glfw.GLFW;

/**
 * Client-wide settings that are not owned by a module: the client key, the theme accent,
 * interface sounds and favourite modules. Stored in the {@code global} config section.
 */
public final class GlobalSettings {
	private final KeybindSetting clientKey = new KeybindSetting("Open client", GLFW.GLFW_KEY_RIGHT_SHIFT);
	private final EnumSetting<Theme.Accent> accent = new EnumSetting<>("Accent", Theme.Accent.WHITE);
	private final BoolSetting uiSounds = new BoolSetting("Interface sounds", true);
	private final List<Setting<?>> all = List.of(clientKey, accent, uiSounds);
	private final Set<String> favorites = new LinkedHashSet<>();
	private final Runnable changeListener;

	/** @param changeListener invoked after any value changes (used to schedule a config save) */
	public GlobalSettings(Runnable changeListener) {
		this.changeListener = changeListener;
		accent.onChange(() -> {
			Theme.get().setAccent(accent.get());
			changeListener.run();
		});
		uiSounds.onChange(() -> {
			UiSounds.setEnabled(uiSounds.get());
			changeListener.run();
		});
		clientKey.onChange(changeListener);
	}

	/** @return the key that opens the client (auth screen or ClickGUI). */
	public KeybindSetting clientKey() {
		return clientKey;
	}

	/** @return the theme accent preset. */
	public EnumSetting<Theme.Accent> accent() {
		return accent;
	}

	/** @return whether buttons and toggles make a click sound. */
	public BoolSetting uiSounds() {
		return uiSounds;
	}

	/** @return whether the module is starred. */
	public boolean isFavorite(String moduleName) {
		return favorites.contains(moduleName);
	}

	/** Stars or un-stars a module. */
	public void toggleFavorite(String moduleName) {
		if (!favorites.remove(moduleName)) {
			favorites.add(moduleName);
		}
		changeListener.run();
	}

	/** Restores defaults and clears favourites. */
	public void reset() {
		for (Setting<?> setting : all) {
			setting.reset();
		}
		favorites.clear();
		changeListener.run();
	}

	/** @return the section as JSON. */
	public JsonElement toJson() {
		JsonObject json = new JsonObject();
		for (Setting<?> setting : all) {
			json.add(setting.key(), setting.toJson());
		}
		JsonArray stars = new JsonArray();
		favorites.forEach(stars::add);
		json.add("favorites", stars);
		return json;
	}

	/** Applies stored values; {@code null} or malformed input restores the defaults. */
	public void fromJson(JsonElement element) {
		for (Setting<?> setting : all) {
			setting.reset();
		}
		favorites.clear();
		if (element != null && element.isJsonObject()) {
			JsonObject json = element.getAsJsonObject();
			for (Setting<?> setting : all) {
				if (json.has(setting.key())) {
					setting.fromJson(json.get(setting.key()));
				}
			}
			JsonElement stars = json.get("favorites");
			if (stars != null && stars.isJsonArray()) {
				for (JsonElement star : stars.getAsJsonArray()) {
					if (star.isJsonPrimitive()) {
						favorites.add(star.getAsString());
					}
				}
			}
		}
		Theme.get().setAccent(accent.get());
		UiSounds.setEnabled(uiSounds.get());
	}
}
