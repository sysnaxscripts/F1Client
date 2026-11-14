package com.example.f1.render;

/**
 * The one place colours and metrics come from.
 *
 * <p>The look is glossy, vibrant and transparent: panels are dark glass with a bright
 * top-edge gloss and a coloured rim, cards lift on hover, and a single vibrant accent
 * drives everything that is enabled, active or selected. Accent tints are derived from the
 * chosen accent rather than hardcoded per element, so switching the accent recolours the
 * whole client consistently.
 */
public final class Theme {
	/** Accent presets. Each one is a vibrant colour plus the ink to draw on top of it. */
	public enum Accent {
		AURORA("Aurora", 0xFF4AEDD9, 0xFF04140F),
		ICE("Ice", 0xFF6FC3FF, 0xFF04121D),
		VIOLET("Violet", 0xFFB08CFF, 0xFF10061D),
		MINT("Mint", 0xFF7DE8B4, 0xFF06170F),
		AMBER("Amber", 0xFFFFC66B, 0xFF1C1203),
		ROSE("Rose", 0xFFFF7FA6, 0xFF1D070C),
		WHITE("White", 0xFFF2F3F5, 0xFF101114);

		private static final Accent[] VALUES = values();

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

		/** @return the constants without the defensive copy made by {@link #values()}. */
		public static Accent[] all() {
			return VALUES;
		}
	}

	/** Corner radii, in design units. */
	public static final int RADIUS_WINDOW = 14;
	public static final int RADIUS_PANEL = 11;
	public static final int RADIUS_CARD = 9;
	public static final int RADIUS_CONTROL = 7;
	/** Duration of toggle, slider and panel transitions. */
	public static final float ANIMATION_MS = 160f;

	// --- glass ---
	/** Window body: dark, translucent enough for the world to read through it. */
	public static final int WINDOW = 0xB40C0E13;
	/** Second window layer, drawn inside the first to fake depth. */
	public static final int WINDOW_INNER = 0x59151A24;
	/** Sidebar and settings panel. */
	public static final int PANEL = 0x6E12151C;
	/** Card body. */
	public static final int CARD = 0x8C0A0C11;
	public static final int CARD_HOVER = 0xB4111725;
	public static final int CARD_SELECTED = 0xC7162033;
	/** Text field and slider track. */
	public static final int INPUT = 0xA6070910;

	// --- gloss and rims ---
	/** Bright band along the top edge of a glossy surface. */
	public static final int GLOSS_TOP = 0x2EFFFFFF;
	/** Fainter band a few units below it, which is what makes the gloss look curved. */
	public static final int GLOSS_BOTTOM = 0x0AFFFFFF;
	/** Inner highlight along the top of a control. */
	public static final int HIGHLIGHT = 0x1FFFFFFF;
	public static final int OUTLINE = 0x2AFFFFFF;
	public static final int OUTLINE_STRONG = 0x66FFFFFF;
	public static final int DIVIDER = 0x18FFFFFF;
	public static final int SHADOW = 0x8C000000;
	public static final int BACKDROP_DIM = 0x73000000;

	// --- selection ---
	public static final int ROW_SELECTED = 0x24FFFFFF;
	public static final int ROW_HOVER = 0x12FFFFFF;

	// --- text ---
	public static final int TEXT = 0xFFF4F6FA;
	public static final int TEXT_MUTED = 0xFF9AA0AE;
	public static final int TEXT_DISABLED = 0xFF5C616D;

	// --- controls ---
	public static final int TRACK_OFF = 0xC61B1F29;
	public static final int KNOB = 0xFFFFFFFF;
	public static final int ONLINE = 0xFF4ADE80;
	public static final int OFFLINE = 0xFFE0B341;

	private static final Theme INSTANCE = new Theme();

	private Accent accent = Accent.AURORA;

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
	public void setAccent(Accent value) {
		accent = value == null ? Accent.AURORA : value;
	}

	/** @return the accent colour, opaque. */
	public int accentColor() {
		return accent.color();
	}

	/** @return colour for content drawn on top of the accent. */
	public int onAccent() {
		return accent.onColor();
	}

	/** @return the accent at a given alpha, for glows, rims and fills behind text. */
	public int accent(int alpha) {
		return withAlpha(accent.color(), alpha);
	}

	/** @return a soft glow colour for the accent, used under a selected card. */
	public int accentGlow() {
		return withAlpha(accent.color(), 0x30);
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

	/** @return {@code argb} lightened towards white by {@code t}. */
	public static int lighten(int argb, float t) {
		return mix(argb, 0xFFFFFFFF, t);
	}

	/** @return {@code argb} darkened towards black by {@code t}. */
	public static int darken(int argb, float t) {
		return mix(argb, 0xFF000000, t);
	}

	/** @return a horizontal gradient's colour at {@code t}, from {@code left} to {@code right}. */
	public static int gradient(int left, int right, float t) {
		return mix(left, right, t);
	}
}
