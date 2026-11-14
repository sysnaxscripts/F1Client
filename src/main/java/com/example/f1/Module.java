package com.example.f1;

import com.example.f1.setting.KeybindSetting;
import com.example.f1.setting.Setting;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Base class of every feature of this client.
 *
 * <p>A module owns a name, an optional GLFW keycode and an enabled flag. {@link Modules}
 * drives it: it polls the key once per client tick, toggles on the press edge, and calls
 * {@link #tick()} and {@link #render(float)} only while the module is enabled.
 *
 * <p>Implementations must tolerate being ticked or rendered with no world loaded, so every
 * hook starts with a null check on {@code mc.level} / {@code mc.player}.
 */
public abstract class Module {
	/**
	 * The client instance. Valid from mod initialisation onwards, which is when modules are
	 * constructed; spelled out so this base class needs no imports of its own.
	 */
	protected static final net.minecraft.client.Minecraft mc = net.minecraft.client.Minecraft.getInstance();

	private final String name;
	private final String description;
	private final Category category;
	private final List<Setting<?>> settings = new ArrayList<>();
	private final KeybindSetting keybind;
	private boolean enabled;
	private boolean favourite;
	/**
	 * Whether this module's key was down when {@link Modules} last polled it. Kept here
	 * rather than in a parallel array so a key can be rebound at any time without the
	 * registry having to be rebuilt.
	 */
	boolean keyWasDown;

	/**
	 * @param name        name shown in the ClickGUI and the log, and used as the config key
	 * @param description one line shown on the module card
	 * @param category    sidebar category the card is filed under
	 * @param defaultKey  GLFW keycode that toggles it, or {@code GLFW_KEY_UNKNOWN} for none
	 */
	protected Module(String name, String description, Category category, int defaultKey) {
		this.name = name;
		this.description = description == null ? "" : description;
		this.category = category == null ? Category.MISC : category;
		this.keybind = add(new KeybindSetting("Keybind", defaultKey)
				.describe("Key that toggles this module. Polled once per tick, so a quick tap is never missed."));
	}

	/**
	 * Registers a setting.
	 *
	 * <p>Call from the subclass constructor; the returned setting is the one passed in, so a
	 * field can be assigned in the same statement.
	 */
	protected <S extends Setting<?>> S add(S setting) {
		settings.add(setting);
		setting.onChanged(() -> onSettingChanged(setting));
		return setting;
	}

	/** @return the settings of this module, in registration order. The list is immutable. */
	public List<Setting<?>> settings() {
		return Collections.unmodifiableList(settings);
	}

	/** @return the keybind setting; its value is the key polled by {@link Modules}. */
	public KeybindSetting keybind() {
		return keybind;
	}

	/** @return the GLFW keycode that toggles this module, or 0 when unbound. */
	public int getKey() {
		return keybind.get();
	}

	/** @return the one-line description shown on the module card. */
	public String getDescription() {
		return description;
	}

	/** @return the sidebar category. */
	public Category category() {
		return category;
	}

	/** @return whether the card is pinned to Favourites. */
	public boolean isFavourite() {
		return favourite;
	}

	/** Pins or unpins the card. */
	public void setFavourite(boolean value) {
		favourite = value;
	}

	/** Called after any of this module's settings changed, including from a loaded config. */
	protected void onSettingChanged(Setting<?> setting) {
	}

	/** @return this module's settings as JSON, omitting everything left at its default. */
	public JsonObject toJson() {
		JsonObject json = new JsonObject();
		json.addProperty("enabled", enabled);
		json.addProperty("favourite", favourite);
		JsonObject values = new JsonObject();
		for (Setting<?> setting : settings) {
			JsonElement element = setting.toJson();
			if (element != null) {
				values.add(setting.getName(), element);
			}
		}
		json.add("settings", values);
		return json;
	}

	/**
	 * Applies stored settings. Unknown keys are ignored, so a config written by an older
	 * build still loads and a setting that disappeared costs nothing.
	 */
	public void fromJson(JsonObject json) {
		if (json == null) {
			return;
		}
		if (json.has("favourite")) {
			favourite = json.get("favourite").getAsBoolean();
		}
		JsonObject values = json.getAsJsonObject("settings");
		if (values != null) {
			for (Setting<?> setting : settings) {
				if (setting.fromJson(values.get(setting.getName()))) {
					setting.notifyChanged();
				}
			}
		}
		if (json.has("enabled") && json.get("enabled").getAsBoolean() != enabled) {
			toggle();
		}
	}

	/** Restores every setting and the enabled state to the defaults. */
	public void resetSettings() {
		for (Setting<?> setting : settings) {
			setting.reset();
		}
		favourite = false;
		if (enabled) {
			toggle();
		}
	}

	/**
	 * @return whether the module switches itself on when it is registered, before any config
	 *         is read. Overridden by the HUD, which would otherwise leave a fresh install
	 *         with no overlay at all.
	 */
	public boolean enabledByDefault() {
		return false;
	}

	/** @return the module's name. */
	public String getName() {
		return name;
	}

	/** @return whether the module is currently enabled. */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Switches the module on or off without looking at its key.
	 *
	 * <p>Fails safely: an {@link #onEnable()} that throws (most often because no world is
	 * loaded) leaves the module disabled and logs, rather than leaving a half-enabled module
	 * behind. An {@link IllegalStateException} is treated as "not now" and logged without a
	 * stack trace, which is what a module throws when the world it needs is missing.
	 *
	 * @return the resulting state
	 */
	public boolean toggle() {
		if (enabled) {
			enabled = false;
			try {
				onDisable();
			} catch (IllegalStateException e) {
				F1Client.LOGGER.info("{} could not disable cleanly: {}", name, e.getMessage());
			} catch (RuntimeException e) {
				F1Client.LOGGER.error("Error disabling {}", name, e);
			}
			return false;
		}
		try {
			onEnable();
			enabled = true;
		} catch (IllegalStateException e) {
			enabled = false;
			F1Client.LOGGER.info("{} stays off: {}", name, e.getMessage());
		} catch (RuntimeException e) {
			enabled = false;
			F1Client.LOGGER.error("Error enabling {}", name, e);
		}
		return enabled;
	}

	/** Switches the module on. */
	public void setEnabled(boolean value) {
		if (value != enabled) {
			toggle();
		}
	}

	/** Called after the module became enabled. */
	protected void onEnable() {
	}

	/** Called after the module became disabled. */
	protected void onDisable() {
	}

	/**
	 * Called once per client tick while enabled, from the tail of {@code Minecraft#tick},
	 * so it runs on the render thread with the world ticked for this frame.
	 */
	public void tick() {
	}

	/**
	 * Called once per frame while enabled, from
	 * {@code WorldRenderEvents.AFTER_ENTITIES}.
	 *
	 * @param tickDelta partial tick in {@code [0,1)}
	 */
	public void render(float tickDelta) {
	}

	@Override
	public String toString() {
		return name + "(" + (enabled ? "on" : "off") + ")";
	}
}
