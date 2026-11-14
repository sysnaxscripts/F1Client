package com.example.f1.setting;

import com.google.gson.JsonPrimitive;

/**
 * A single line of text. Drawn as a text field.
 *
 * <p>An optional maximum length keeps the value inside whatever reads it, which for the
 * profile names in {@code config.json} matters because they become file names.
 */
public final class StringSetting extends Setting<String> {
	/** Length cap used when none is given. */
	public static final int DEFAULT_MAX_LENGTH = 64;

	private final int maxLength;

	public StringSetting(String name, String defaultValue) {
		this(name, defaultValue, DEFAULT_MAX_LENGTH);
	}

	public StringSetting(String name, String defaultValue, int maxLength) {
		super(name, defaultValue == null ? "" : defaultValue);
		this.maxLength = Math.max(1, maxLength);
	}

	/** @return the length cap. */
	public int getMaxLength() {
		return maxLength;
	}

	@Override
	public boolean set(String newValue) {
		return super.set(newValue == null ? "" : newValue.substring(0, Math.min(newValue.length(), maxLength)));
	}

	@Override
	public StringSetting describe(String text) {
		super.describe(text);
		return this;
	}

	@Override
	public StringSetting group(String groupName) {
		super.group(groupName);
		return this;
	}

	@Override
	protected String toStringValue(String value) {
		return value;
	}

	@Override
	protected String parse(JsonPrimitive json) {
		return json.isString() ? json.getAsString() : null;
	}
}
