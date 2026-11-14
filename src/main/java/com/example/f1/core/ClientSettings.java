package com.example.f1.core;

import com.example.f1.render.Theme;
import com.example.f1.setting.BoolSetting;
import com.example.f1.setting.EnumSetting;
import com.example.f1.setting.KeybindSetting;
import com.example.f1.setting.Setting;
import com.example.f1.util.UiSounds;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.lwjgl.glfw.GLFW;

/**
 * Client-wide settings, as opposed to the per-module ones.
 *
 * <p>These are the values that shape the whole interface: the accent colour, the key that
 * opens the ClickGUI, whether the interface makes sounds and whether the menu blurs the
 * world behind it. They live in the {@code global} section of the active profile, so each
 * profile can look and feel different.
 *
 * <p>Values are pushed to their consumers as they change, which is why the theme is a
 * singleton and the sound cues a static flag rather than something read on every draw.
 */
public final class ClientSettings {
	private final List<Setting<?>> settings = new ArrayList<>();

	private final EnumSetting<Theme.Accent> accent = add(new EnumSetting<>("Accent", Theme.Accent.AURORA,
			Theme.Accent.class).describe("Colour of every highlight, glow and switch that is on."));
	private final KeybindSetting clientKey = add(new KeybindSetting("Client key", GLFW.GLFW_KEY_RIGHT_SHIFT)
			.describe("Opens the ClickGUI. Hold Right Shift by default; Escape closes it again."));
	private final BoolSetting uiSounds = add(new BoolSetting("Interface sounds", true)
			.describe("Soft click when a switch or button is used."));
	private final BoolSetting descriptions = add(new BoolSetting("Setting descriptions", true)
			.describe("Show the one-line hint under a switch in the settings panel."));
	private final BoolSetting menuBlur = add(new BoolSetting("Menu blur", true)
			.describe("Blur the world behind the ClickGUI. The dim stays either way."));
	private final BoolSetting hudShadow = add(new BoolSetting("HUD shadows", true)
			.describe("Drop shadow under every HUD panel. Turn off for a flatter overlay."));

	/** Applies the defaults to the consumers, so the theme matches before any config load. */
	public ClientSettings() {
		apply();
	}

	/** @return the settings, in display order. The list is immutable. */
	public List<Setting<?>> all() {
		return Collections.unmodifiableList(settings);
	}

	/** @return the accent setting. */
	public EnumSetting<Theme.Accent> accent() {
		return accent;
	}

	/** @return the key that opens the ClickGUI. */
	public KeybindSetting clientKey() {
		return clientKey;
	}

	/** @return whether interface sounds are on. */
	public boolean uiSounds() {
		return uiSounds.get();
	}

	/** @return whether the settings panel shows hints under each row. */
	public boolean descriptions() {
		return descriptions.get();
	}

	/** @return whether the backdrop blurs the world. */
	public boolean menuBlur() {
		return menuBlur.get();
	}

	/** @return whether HUD panels cast a shadow. */
	public boolean hudShadow() {
		return hudShadow.get();
	}

	/** Pushes the current values to the theme and the sound cues. */
	public void apply() {
		Theme.get().setAccent(accent.get());
		UiSounds.setEnabled(uiSounds.get());
	}

	/** @return these settings as JSON, for the {@code global} section of a profile. */
	public JsonElement toJson() {
		JsonObject json = new JsonObject();
		for (Setting<?> setting : settings) {
			JsonElement element = setting.toJson();
			if (element != null) {
				json.add(setting.getName(), element);
			}
		}
		return json;
	}

	/** Applies the {@code global} section of a profile, or restores defaults when absent. */
	public void fromJson(JsonElement json) {
		if (json != null && json.isJsonObject()) {
			JsonObject object = json.getAsJsonObject();
			for (Setting<?> setting : settings) {
				if (setting.fromJson(object.get(setting.getName()))) {
					setting.notifyChanged();
				}
			}
		} else {
			for (Setting<?> setting : settings) {
				setting.reset();
			}
		}
		apply();
	}

	private <S extends Setting<?>> S add(S setting) {
		settings.add(setting);
		setting.onChanged(this::apply);
		return setting;
	}
}
