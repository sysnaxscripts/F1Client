package dev.f1client.setting;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

/** Decimal option with inclusive bounds and a step, drawn as a slider. */
public final class DoubleSetting extends Setting<Double> {
	private final double min;
	private final double max;
	private final double step;

	public DoubleSetting(String name, double defaultValue, double min, double max, double step) {
		super(name, defaultValue);
		if (min > max || step <= 0) {
			throw new IllegalArgumentException("Invalid range for " + name);
		}
		this.min = min;
		this.max = max;
		this.step = step;
	}

	public double min() {
		return min;
	}

	public double max() {
		return max;
	}

	public double step() {
		return step;
	}

	/** @return number of decimals needed to print values on the step grid. */
	public int decimals() {
		String text = Double.toString(step);
		int dot = text.indexOf('.');
		if (dot < 0 || text.contains("E")) {
			return step < 1 ? 3 : 0;
		}
		String fraction = text.substring(dot + 1).replaceAll("0+$", "");
		return Math.min(4, fraction.length());
	}

	@Override
	protected Double sanitize(Double candidate) {
		if (candidate == null || candidate.isNaN()) {
			return defaultValue();
		}
		double snapped = min + Math.round((candidate - min) / step) * step;
		double clamped = Math.max(min, Math.min(max, snapped));
		double scale = 1e6;
		return Math.round(clamped * scale) / scale;
	}

	@Override
	public JsonElement toJson() {
		return new JsonPrimitive(get());
	}

	@Override
	public void fromJson(JsonElement json) {
		if (json != null && json.isJsonPrimitive() && json.getAsJsonPrimitive().isNumber()) {
			set(json.getAsDouble());
		}
	}
}
