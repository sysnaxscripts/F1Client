package dev.f1client.setting;

import com.google.gson.JsonElement;
import java.util.Locale;
import java.util.Objects;
import java.util.function.BooleanSupplier;

/**
 * A typed, named, persistable option of a module or of the client itself.
 *
 * <p>Settings are plain data: they know their value, default, bounds and JSON form.
 * Drawing and editing them is the job of the matching control in
 * {@code dev.f1client.gui.control}, selected by {@code SettingControls}.
 *
 * @param <T> value type
 */
public abstract class Setting<T> {
	private final String name;
	private final String key;
	private final T defaultValue;
	private T value;
	private String description = "";
	private String group = "";
	private BooleanSupplier visibility = () -> true;
	private Runnable changeListener = () -> { };

	protected Setting(String name, T defaultValue) {
		this.name = Objects.requireNonNull(name, "name");
		this.key = name.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]+", "-").replaceAll("(^-|-$)", "");
		this.defaultValue = defaultValue;
		this.value = defaultValue;
	}

	/** @return display name. */
	public final String name() {
		return name;
	}

	/** @return stable JSON key derived from the name. */
	public final String key() {
		return key;
	}

	/** @return current value. */
	public final T get() {
		return value;
	}

	/** @return the value this setting resets to. */
	public final T defaultValue() {
		return defaultValue;
	}

	/** Stores a new value after {@link #sanitize}; listeners fire only on real changes. */
	public final void set(T newValue) {
		T clean = sanitize(newValue);
		if (!Objects.equals(clean, value)) {
			value = clean;
			changeListener.run();
		}
	}

	/** Restores the default value. */
	public final void reset() {
		set(defaultValue);
	}

	/** @return tooltip text, possibly empty. */
	public final String description() {
		return description;
	}

	/** @return section header this setting is listed under, possibly empty. */
	public final String group() {
		return group;
	}

	/** @return whether the setting should currently be shown in the GUI. */
	public final boolean isVisible() {
		return visibility.getAsBoolean();
	}

	/** Sets the tooltip text. */
	@SuppressWarnings("unchecked")
	public final <S extends Setting<T>> S describe(String text) {
		this.description = text;
		return (S) this;
	}

	/** Sets the section header. */
	@SuppressWarnings("unchecked")
	public final <S extends Setting<T>> S group(String text) {
		this.group = text;
		return (S) this;
	}

	/** Shows the setting only while the condition holds. */
	@SuppressWarnings("unchecked")
	public final <S extends Setting<T>> S visibleWhen(BooleanSupplier condition) {
		this.visibility = condition;
		return (S) this;
	}

	/** Installs the single owner callback fired after each change. */
	public final void onChange(Runnable listener) {
		this.changeListener = listener == null ? () -> { } : listener;
	}

	/** Clamps or otherwise normalises an incoming value. */
	protected T sanitize(T candidate) {
		return candidate == null ? defaultValue : candidate;
	}

	/** @return the JSON form of the current value. */
	public abstract JsonElement toJson();

	/** Loads a value from JSON; malformed input leaves the current value untouched. */
	public abstract void fromJson(JsonElement json);
}
