package dev.f1client.module;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dev.f1client.setting.KeybindSetting;
import dev.f1client.setting.Setting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Base class of every feature module.
 *
 * <p>A module has a name, description, {@link Category}, an enabled flag, a keybind and
 * a list of {@link Setting}s. Subclasses override the lifecycle hooks they need; all hooks
 * run on the client thread and are only dispatched while the account gate is open.
 *
 * <p>To add a module: extend this class, declare settings with {@link #add}, and register
 * an instance in {@code F1Client}.
 */
public abstract class Module {
	/** Callbacks into the owning {@link ModuleManager}. */
	interface Host {
		boolean featuresUnlocked();

		void moduleChanged(Module module);
	}

	private final String name;
	private final String description;
	private final Category category;
	private final KeybindSetting keybind;
	private final List<Setting<?>> settings = new ArrayList<>();
	private boolean enabled;
	private Host host;

	protected Module(String name, String description, Category category) {
		this(name, description, category, KeybindSetting.UNBOUND);
	}

	protected Module(String name, String description, Category category, int defaultKey) {
		this.name = name;
		this.description = description;
		this.category = category;
		this.keybind = new KeybindSetting("Keybind", defaultKey);
		this.keybind.onChange(this::notifyChanged);
	}

	/** Registers a setting; call from field initialisers or the constructor. */
	protected final <S extends Setting<?>> S add(S setting) {
		settings.add(setting);
		setting.onChange(() -> {
			onSettingChanged(setting);
			notifyChanged();
		});
		return setting;
	}

	public final String name() {
		return name;
	}

	public final String description() {
		return description;
	}

	public final Category category() {
		return category;
	}

	public final KeybindSetting keybind() {
		return keybind;
	}

	/** @return the settings in declaration order (read-only view). */
	public final List<Setting<?>> settings() {
		return Collections.unmodifiableList(settings);
	}

	public final boolean isEnabled() {
		return enabled;
	}

	/**
	 * Enables or disables the module. Enabling is refused while the account gate is
	 * closed, so an unauthenticated user can never switch a module on.
	 */
	public final void setEnabled(boolean value) {
		if (value == enabled) {
			return;
		}
		if (value && host != null && !host.featuresUnlocked()) {
			return;
		}
		enabled = value;
		if (value) {
			onEnable();
		} else {
			onDisable();
		}
		notifyChanged();
	}

	/** Flips the enabled state. */
	public final void toggle() {
		setEnabled(!enabled);
	}

	/** Restores every setting (not the keybind) to its default. */
	public final void resetSettings() {
		for (Setting<?> setting : settings) {
			setting.reset();
		}
	}

	/** Called after the module was switched on. */
	protected void onEnable() {
	}

	/** Called after the module was switched off. Must restore everything it altered. */
	protected void onDisable() {
	}

	/** Called once per client tick while enabled. */
	public void onTick() {
	}

	/**
	 * Called once per rendered world frame while enabled, at the point where world-space
	 * debug geometry may be submitted.
	 *
	 * @param tickDelta partial tick in {@code [0,1)}
	 */
	public void onRender(float tickDelta) {
	}

	/** Called when the client leaves or swaps its world, whether enabled or not. */
	public void onWorldChange() {
	}

	/** Called after one of this module's settings changed. */
	protected void onSettingChanged(Setting<?> setting) {
	}

	/**
	 * @return whether the enabled flag is written to the config. Modules that only make
	 *         sense inside a running world session (such as Freecam) return {@code false}.
	 */
	public boolean persistsEnabledState() {
		return true;
	}

	/** @return whether the keybind acts as push-to-hold instead of a toggle. */
	public boolean isHoldBind() {
		return false;
	}

	/** @return the persisted form: enabled flag, keybind and every setting. */
	public JsonObject toJson() {
		JsonObject json = new JsonObject();
		json.addProperty("enabled", enabled && persistsEnabledState());
		json.add("keybind", keybind.toJson());
		JsonObject values = new JsonObject();
		for (Setting<?> setting : settings) {
			values.add(setting.key(), setting.toJson());
		}
		json.add("settings", values);
		return json;
	}

	/** Applies a persisted form; unknown keys are ignored and missing keys keep their value. */
	public void fromJson(JsonObject json) {
		if (json == null) {
			return;
		}
		keybind.fromJson(json.get("keybind"));
		JsonElement values = json.get("settings");
		if (values != null && values.isJsonObject()) {
			for (Setting<?> setting : settings) {
				setting.fromJson(values.getAsJsonObject().get(setting.key()));
			}
		}
		JsonElement flag = json.get("enabled");
		if (flag != null && flag.isJsonPrimitive() && persistsEnabledState()) {
			setEnabled(flag.getAsBoolean());
		}
	}

	final void attach(Host owner) {
		this.host = owner;
	}

	private void notifyChanged() {
		if (host != null) {
			host.moduleChanged(this);
		}
	}
}
