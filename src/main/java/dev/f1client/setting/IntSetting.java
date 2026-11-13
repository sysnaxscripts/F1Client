package dev.f1client.setting;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

/** Whole-number option with inclusive bounds, drawn as a slider. */
public final class IntSetting extends Setting<Integer> {
	private final int min;
	private final int max;
	private final int step;

	public IntSetting(String name, int defaultValue, int min, int max) {
		this(name, defaultValue, min, max, 1);
	}

	public IntSetting(String name, int defaultValue, int min, int max, int step) {
		super(name, defaultValue);
		if (min > max || step <= 0) {
			throw new IllegalArgumentException("Invalid range for " + name);
		}
		this.min = min;
		this.max = max;
		this.step = step;
	}

	public int min() {
		return min;
	}

	public int max() {
		return max;
	}

	public int step() {
		return step;
	}

	@Override
	protected Integer sanitize(Integer candidate) {
		if (candidate == null) {
			return defaultValue();
		}
		int snapped = min + Math.round((candidate - min) / (float) step) * step;
		return Math.max(min, Math.min(max, snapped));
	}

	@Override
	public JsonElement toJson() {
		return new JsonPrimitive(get());
	}

	@Override
	public void fromJson(JsonElement json) {
		if (json != null && json.isJsonPrimitive() && json.getAsJsonPrimitive().isNumber()) {
			set(json.getAsInt());
		}
	}
}
