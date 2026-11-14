package com.example.f1.setting;

import com.google.gson.JsonPrimitive;

/**
 * A colour as ARGB. Drawn as a swatch that opens the colour editor.
 *
 * <p>Whether the alpha channel is editable is part of the setting, so a highlight colour
 * can offer transparency while an outline colour stays opaque.
 */
public final class ColorSetting extends Setting<Integer> {
	private final boolean alpha;

	/** @param defaultValue opaque or translucent ARGB */
	public ColorSetting(String name, int defaultValue, boolean alpha) {
		super(name, defaultValue);
		this.alpha = alpha;
	}

	public ColorSetting(String name, int defaultValue) {
		this(name, defaultValue, false);
	}

	/** @return whether the alpha channel is editable. */
	public boolean hasAlpha() {
		return alpha;
	}

	/** @return the colour with a fully opaque alpha, for text and outlines. */
	public int opaque() {
		return get() | 0xFF000000;
	}

	/** @return the red channel, 0..255. */
	public int red() {
		return (get() >> 16) & 0xFF;
	}

	/** @return the green channel, 0..255. */
	public int green() {
		return (get() >> 8) & 0xFF;
	}

	/** @return the blue channel, 0..255. */
	public int blue() {
		return get() & 0xFF;
	}

	/** @return the alpha channel, 0..255. */
	public int alpha() {
		return (get() >>> 24) & 0xFF;
	}

	/** @return the colour as {@code #RRGGBB}, or {@code #AARRGGBB} when alpha is editable. */
	public String hex() {
		return alpha ? String.format("#%08X", get()) : String.format("#%06X", get() & 0x00FFFFFF);
	}

	/** Stores one channel, leaving the others alone. */
	public void setChannel(int index, int value) {
		int clamped = Math.max(0, Math.min(255, value));
		int argb = get();
		switch (index) {
		case 0 -> argb = (argb & 0x00FFFFFF) | (clamped << 24);
		case 1 -> argb = (argb & 0xFF00FFFF) | (clamped << 16);
		case 2 -> argb = (argb & 0xFFFF00FF) | (clamped << 8);
		default -> argb = (argb & 0xFFFFFF00) | clamped;
		}
		set(argb);
	}

	@Override
	public ColorSetting describe(String text) {
		super.describe(text);
		return this;
	}

	@Override
	public ColorSetting group(String groupName) {
		super.group(groupName);
		return this;
	}

	@Override
	protected String toStringValue(Integer value) {
		return String.format("%08X", value);
	}

	@Override
	protected Integer parse(JsonPrimitive json) {
		try {
			if (json.isNumber()) {
				return json.getAsInt();
			}
			if (json.isString()) {
				String text = json.getAsString().trim();
				if (text.startsWith("#")) {
					text = text.substring(1);
				}
				long parsed = Long.parseLong(text, 16);
				// Six digits are read as opaque RGB, eight as ARGB.
				return text.length() <= 6 ? (int) (0xFF000000L | parsed) : (int) parsed;
			}
		} catch (NumberFormatException e) {
			return null;
		}
		return null;
	}
}
