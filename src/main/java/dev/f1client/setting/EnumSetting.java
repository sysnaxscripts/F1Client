package dev.f1client.setting;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

/**
 * One-of-many option backed by an enum, drawn as a segmented selector.
 *
 * @param <E> the enum type; {@code toString()} supplies the display label
 */
public final class EnumSetting<E extends Enum<E>> extends Setting<E> {
	private final E[] values;

	public EnumSetting(String name, E defaultValue) {
		super(name, defaultValue);
		this.values = defaultValue.getDeclaringClass().getEnumConstants();
	}

	/** @return all selectable constants in declaration order. */
	public E[] values() {
		return values;
	}

	/** Selects the next constant, wrapping around. */
	public void cycle(int direction) {
		int index = Math.floorMod(get().ordinal() + direction, values.length);
		set(values[index]);
	}

	@Override
	public JsonElement toJson() {
		return new JsonPrimitive(get().name());
	}

	@Override
	public void fromJson(JsonElement json) {
		if (json == null || !json.isJsonPrimitive()) {
			return;
		}
		String name = json.getAsString();
		for (E candidate : values) {
			if (candidate.name().equalsIgnoreCase(name)) {
				set(candidate);
				return;
			}
		}
	}
}
