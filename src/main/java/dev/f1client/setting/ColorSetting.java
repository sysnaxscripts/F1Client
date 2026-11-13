package dev.f1client.setting;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Locale;

/** ARGB colour option, stored as {@code #AARRGGBB} and drawn as a swatch with a picker. */
public final class ColorSetting extends Setting<Integer> {
	public ColorSetting(String name, int defaultArgb) {
		super(name, defaultArgb);
	}

	/** @return the colour with its alpha replaced. */
	public int withAlpha(int alpha) {
		return (get() & 0x00FFFFFF) | ((alpha & 0xFF) << 24);
	}

	/** @return the colour as {@code #AARRGGBB}. */
	public String hex() {
		return String.format(Locale.ROOT, "#%08X", get());
	}

	/**
	 * Parses {@code #RRGGBB} or {@code #AARRGGBB} (the leading {@code #} is optional).
	 *
	 * @return the ARGB value, or {@code null} when the text is not a colour
	 */
	public static Integer parse(String text) {
		if (text == null) {
			return null;
		}
		String hex = text.trim();
		if (hex.startsWith("#")) {
			hex = hex.substring(1);
		}
		try {
			if (hex.length() == 6) {
				return 0xFF000000 | Integer.parseInt(hex, 16);
			}
			if (hex.length() == 8) {
				return (int) Long.parseLong(hex, 16);
			}
		} catch (NumberFormatException ignored) {
			// Reported as null below.
		}
		return null;
	}

	@Override
	public JsonElement toJson() {
		return new JsonPrimitive(hex());
	}

	@Override
	public void fromJson(JsonElement json) {
		if (json == null || !json.isJsonPrimitive()) {
			return;
		}
		Integer parsed = json.getAsJsonPrimitive().isNumber() ? Integer.valueOf(json.getAsInt()) : parse(json.getAsString());
		if (parsed != null) {
			set(parsed);
		}
	}
}
