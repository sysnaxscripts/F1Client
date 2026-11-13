package dev.f1client.setting;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

/** Free-text option with a maximum length, drawn as a text field. */
public final class StringSetting extends Setting<String> {
	private final int maxLength;

	public StringSetting(String name, String defaultValue, int maxLength) {
		super(name, defaultValue);
		this.maxLength = maxLength;
	}

	public int maxLength() {
		return maxLength;
	}

	@Override
	protected String sanitize(String candidate) {
		if (candidate == null) {
			return defaultValue();
		}
		return candidate.length() > maxLength ? candidate.substring(0, maxLength) : candidate;
	}

	@Override
	public JsonElement toJson() {
		return new JsonPrimitive(get());
	}

	@Override
	public void fromJson(JsonElement json) {
		if (json != null && json.isJsonPrimitive()) {
			set(json.getAsString());
		}
	}
}
