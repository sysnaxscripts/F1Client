package com.example.f1.setting;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

/**
 * One configurable value of a module.
 *
 * <p>A setting owns its name (which is also its key in {@code config.json}, so renaming a
 * setting orphans the stored value), an optional description shown in the ClickGUI, an
 * optional group for folding related settings under a heading, and the conversion to and
 * from JSON. Subclasses add their range or option list and the widget that edits them.
 *
 * @param <T> the value type
 */
public abstract class Setting<T> {
	private final String name;
	private String description = "";
	private String group = "";
	private T value;
	private final T defaultValue;
	private Runnable changed = () -> {
	};

	protected Setting(String name, T defaultValue) {
		this.name = name;
		this.value = defaultValue;
		this.defaultValue = defaultValue;
	}

	/** @return the name, also used as the config key and the widget label. */
	public String getName() {
		return name;
	}

	/** @return the description shown under the label, or an empty string. */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description shown in the ClickGUI.
	 *
	 * <p>Overridden in every subclass with a covariant return type, so
	 * {@code add(new BoolSetting(...).describe(...))} still yields a {@code BoolSetting}.
	 */
	public Setting<T> describe(String text) {
		this.description = text == null ? "" : text;
		return this;
	}

	/** @return the group heading this setting belongs to, or an empty string for none. */
	public String getGroup() {
		return group;
	}

	/** Folds this setting under a heading in the settings panel. */
	public Setting<T> group(String groupName) {
		this.group = groupName == null ? "" : groupName;
		return this;
	}

	/** @return the current value; never {@code null}. */
	public T get() {
		return value;
	}

	/** @return the value a reset restores. */
	public T getDefaultValue() {
		return defaultValue;
	}

	/**
	 * Stores a new value.
	 *
	 * @return whether the value actually changed
	 */
	public boolean set(T newValue) {
		if (newValue == null || newValue.equals(value)) {
			return false;
		}
		value = newValue;
		changed.run();
		return true;
	}

	/** Restores the default and tells the module, so a reset takes effect immediately. */
	public void reset() {
		value = defaultValue;
		changed.run();
	}

	/** Registers a callback run whenever the value changes, including from the config. */
	public Setting<T> onChanged(Runnable listener) {
		this.changed = listener == null ? () -> {
		} : listener;
		return this;
	}

	/** Notifies the change callback without altering the value; used after loading a config. */
	public void notifyChanged() {
		changed.run();
	}

	/** @return this setting as a JSON value, or {@code null} when it is at its default. */
	public JsonElement toJson() {
		return new JsonPrimitive(toStringValue(value));
	}

	/**
	 * Reads a stored value.
	 *
	 * @return whether something was applied
	 */
	public boolean fromJson(JsonElement json) {
		if (json == null || !json.isJsonPrimitive()) {
			return false;
		}
		T parsed = parse(json.getAsJsonPrimitive());
		if (parsed == null) {
			return false;
		}
		value = parsed;
		return true;
	}

	/** @return the value in its stored string form. */
	protected abstract String toStringValue(T value);

	/** @return the parsed value, or {@code null} when the stored form is unusable. */
	protected abstract T parse(JsonPrimitive json);

	@Override
	public String toString() {
		return name + "=" + value;
	}
}
