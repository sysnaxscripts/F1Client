package dev.f1client.render;

/**
 * The one place colours and metrics come from.
 *
 * <p>The palette is the monochrome glass look of the reference screenshots: near-black
 * translucent panels, thin light outlines, and a single accent that is used only for
 * enabled, active and selected elements. Everything else is a neutral grey.
 */
public final class Theme {
	/** Accent presets offered by the theme picker. {@link #WHITE} matches the screenshots. */
	public enum Accent {
		WHITE("White", 0xFFF2F3F5, 0xFF101114),
		ICE("Ice", 0xFF8FD3FF, 0xFF07141D),
		MINT("Mint", 0xFF7DE8B4, 0xFF06170F),
		AMBER("Amber", 0xFFFFC66B, 0xFF1C1203),
		ROSE("Rose", 0xFFFF8FA8, 0xFF1D070C);

		private final String label;
		private final int color;
		private final int onColor;

		Accent(String label, int color, int onColor) {
			this.label = label;
			this.color = color;
			this.onColor = onColor;
		}

		/** @return display name. */
		public String label() {
			return label;
		}

		/** @return the accent colour (opaque ARGB). */
		public int color() {
			return color;
		}

		/** @return colour for content drawn on top of the accent. */
		public int onColor() {
			return onColor;
		}
	}

	private static final Theme INSTANCE = new Theme();

	/** Corner radius of windows and cards, in design units. */
	public static final int RADIUS_WINDOW = 12;
	public static final int RADIUS_PANEL = 10;
	public static final int RADIUS_CARD = 8;
	public static final int RADIUS_CONTROL = 6;
	/** Duration of toggle, slider and panel transitions. */
	public static final float ANIMATION_MS = 150f;

	public static final int WINDOW = 0xD00D0E11;
	public static final int PANEL = 0x8C15161A;
	public static final int CARD = 0xE608090B;
	public static final int CARD_HOVER = 0xE60F1013;
	public static final int INPUT = 0xF007080A;
	public static final int ROW_SELECTED = 0x24FFFFFF;
	public static final int ROW_HOVER = 0x10FFFFFF;
	public static final int OUTLINE = 0x26FFFFFF;
	public static final int OUTLINE_STRONG = 0x70FFFFFF;
	public static final int DIVIDER = 0x1AFFFFFF;
	public static final int SHADOW = 0x99000000;
	public static final int BACKDROP_DIM = 0x66000000;
	public static final int TEXT = 0xFFF2F3F5;
	public static final int TEXT_MUTED = 0xFF8D9099;
	public static final int TEXT_DISABLED = 0xFF5B5E66;
	public static final int TRACK_OFF = 0xFF202226;
	public static final int KNOB_OFF = 0xFFC9CBD0;
	public static final int ONLINE = 0xFF4ADE80;
	public static final int OFFLINE = 0xFFE0B341;

	private Accent accent = Accent.WHITE;

	private Theme() {
	}

	/** @return the shared theme. */
	public static Theme get() {
		return INSTANCE;
	}

	/** @return the active accent preset. */
	public Accent accent() {
		return accent;
	}

	/** Switches the accent preset. */
	public void setAccent(Accent accent) {
		this.accent = accent == null ? Accent.WHITE : accent;
	}

	/** @return the accent colour. */
	public int accentColor() {
		return accent.color();
	}

	/** @return colour for content drawn on top of the accent. */
	public int onAccent() {
		return accent.onColor();
	}

	/** @return {@code argb} with its alpha multiplied by {@code factor} (0..1). */
	public static int fade(int argb, float factor) {
		int alpha = Math.round((argb >>> 24) * Math.max(0f, Math.min(1f, factor)));
		return (alpha << 24) | (argb & 0x00FFFFFF);
	}

	/** @return {@code argb} with the given alpha (0..255). */
	public static int withAlpha(int argb, int alpha) {
		return ((alpha & 0xFF) << 24) | (argb & 0x00FFFFFF);
	}

	/** @return per-channel blend from {@code a} to {@code b}. */
	public static int mix(int a, int b, float t) {
		float k = Math.max(0f, Math.min(1f, t));
		int alpha = Math.round((a >>> 24) + ((b >>> 24) - (a >>> 24)) * k);
		int red = Math.round(((a >> 16) & 0xFF) + (((b >> 16) & 0xFF) - ((a >> 16) & 0xFF)) * k);
		int green = Math.round(((a >> 8) & 0xFF) + (((b >> 8) & 0xFF) - ((a >> 8) & 0xFF)) * k);
		int blue = Math.round((a & 0xFF) + ((b & 0xFF) - (a & 0xFF)) * k);
		return (alpha << 24) | (red << 16) | (green << 8) | blue;
	}
}
