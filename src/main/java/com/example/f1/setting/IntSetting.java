package com.example.f1.setting;

import com.google.gson.JsonPrimitive;

/** A whole number inside a range. Drawn as a slider with a numeric read-out. */
public final class IntSetting extends Setting<Integer> {
	private final int min;
	private final int max;
	private final int step;

	/**
	 * @param min smallest accepted value
	 * @param max largest accepted value
	 * @param step slider granularity; a click moves the value by this much
	 */
	public IntSetting(String name, int defaultValue, int min, int max, int step) {
		super(name, clamp(defaultValue, min, max));
		this.min = min;
		this.max = max;
		this.step = Math.max(1, step);
	}

	public IntSetting(String name, int defaultValue, int min, int max) {
		this(name, defaultValue, min, max, 1);
	}

	/** @return the smallest accepted value. */
	public int getMin() {
		return min;
	}

	/** @return the largest accepted value. */
	public int getMax() {
		return max;
	}

	/** @return the slider granularity. */
	public int getStep() {
		return step;
	}

	@Override
	public boolean set(Integer newValue) {
		return super.set(newValue == null ? null : clamp(newValue, min, max));
	}

	/** @return the value as a fraction of the range, in {@code [0,1]}. */
	public double fraction() {
		return max == min ? 0 : (double) (get() - min) / (max - min);
	}

	private static int clamp(int value, int min, int max) {
		return Math.max(min, Math.min(max, value));
	}

	@Override
	public IntSetting describe(String text) {
		super.describe(text);
		return this;
	}

	@Override
	public IntSetting group(String groupName) {
		super.group(groupName);
		return this;
	}

	@Override
	protected String toStringValue(Integer value) {
		return value.toString();
	}

	@Override
	protected Integer parse(JsonPrimitive json) {
		try {
			if (json.isNumber()) {
				return json.getAsInt();
			}
			if (json.isString()) {
				return Integer.valueOf(json.getAsString().trim());
			}
		} catch (NumberFormatException e) {
			return null;
		}
		return null;
	}
}
