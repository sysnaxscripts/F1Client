package com.example.f1.setting;

import com.google.gson.JsonPrimitive;

/** A switch. Drawn as a glossy toggle in the ClickGUI. */
public final class BoolSetting extends Setting<Boolean> {
	public BoolSetting(String name, boolean defaultValue) {
		super(name, defaultValue);
	}

	/** Flips the value. */
	public void toggle() {
		set(!get());
	}

	@Override
	public BoolSetting describe(String text) {
		super.describe(text);
		return this;
	}

	@Override
	public BoolSetting group(String groupName) {
		super.group(groupName);
		return this;
	}

	@Override
	protected String toStringValue(Boolean value) {
		return value.toString();
	}

	@Override
	protected Boolean parse(JsonPrimitive json) {
		if (json.isBoolean()) {
			return json.getAsBoolean();
		}
		if (json.isString()) {
			String text = json.getAsString();
			if ("true".equalsIgnoreCase(text)) {
				return Boolean.TRUE;
			}
			if ("false".equalsIgnoreCase(text)) {
				return Boolean.FALSE;
			}
		}
		return null;
	}
}
