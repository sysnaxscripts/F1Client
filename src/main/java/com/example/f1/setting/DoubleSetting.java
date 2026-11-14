package com.example.f1.setting;

import com.google.gson.JsonPrimitive;
import java.util.Locale;

/** A decimal inside a range. Drawn as a slider with a numeric read-out. */
public final class DoubleSetting extends Setting<Double> {
	private final double min;
	private final double max;
	private final double step;

	/**
	 * @param min smallest accepted value
	 * @param max largest accepted value
	 * @param step slider granularity
	 */
	public DoubleSetting(String name, double defaultValue, double min, double max, double step) {
		super(name, clamp(defaultValue, min, max));
		this.min = min;
		this.max = max;
		this.step = step > 0 ? step : 0.01;
	}

	/** @return the smallest accepted value. */
	public double getMin() {
		return min;
	}

	/** @return the largest accepted value. */
	public double getMax() {
		return max;
	}

	/** @return the slider granularity. */
	public double getStep() {
		return step;
	}

	@Override
	public boolean set(Double newValue) {
		return super.set(newValue == null ? null : clamp(newValue, min, max));
	}

	/** @return the value as a fraction of the range, in {@code [0,1]}. */
	public double fraction() {
		return max == min ? 0 : (get() - min) / (max - min);
	}

	/** @return the current value formatted for a read-out, without trailing noise. */
	public String format() {
		return format(get());
	}

	/** @return the given value formatted for a read-out, without trailing noise. */
	public String format(double value) {
		if (value == Math.rint(value)) {
			return String.valueOf((long) value);
		}
		return String.format(Locale.ROOT, "%.2f", value);
	}

	private static double clamp(double value, double min, double max) {
		return Math.max(min, Math.min(max, value));
	}

	@Override
	public DoubleSetting describe(String text) {
		super.describe(text);
		return this;
	}

	@Override
	public DoubleSetting group(String groupName) {
		super.group(groupName);
		return this;
	}

	@Override
	protected String toStringValue(Double value) {
		return value.toString();
	}

	@Override
	protected Double parse(JsonPrimitive json) {
		try {
			if (json.isNumber()) {
				return json.getAsDouble();
			}
			if (json.isString()) {
				return Double.valueOf(json.getAsString().trim());
			}
		} catch (NumberFormatException e) {
			return null;
		}
		return null;
	}
}
