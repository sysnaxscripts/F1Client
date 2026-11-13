package dev.f1client.setting;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

/** On/off option, drawn as a toggle switch. */
public final class BoolSetting extends Setting<Boolean> {
	public BoolSetting(String name, boolean defaultValue) {
		super(name, defaultValue);
	}

	/** Flips the value. */
	public void toggle() {
		set(!get());
	}

	@Override
	public JsonElement toJson() {
		return new JsonPrimitive(get());
	}

	@Override
	public void fromJson(JsonElement json) {
		if (json != null && json.isJsonPrimitive() && json.getAsJsonPrimitive().isBoolean()) {
			set(json.getAsBoolean());
		}
	}
}
