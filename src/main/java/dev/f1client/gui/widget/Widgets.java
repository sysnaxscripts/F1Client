package dev.f1client.gui.widget;

import dev.f1client.render.Fonts;
import dev.f1client.render.Icons;
import dev.f1client.render.RoundedRenderer;
import dev.f1client.render.Theme;
import net.minecraft.client.gui.DrawContext;

/** Stateless drawing routines for the small controls shared by all screens. */
public final class Widgets {
	/** Size of the toggle pill. */
	public static final int TOGGLE_WIDTH = 24;
	public static final int TOGGLE_HEIGHT = 13;

	private Widgets() {
	}

	/**
	 * Pill toggle as in the reference: accent track with a dark knob when on, dark track
	 * with a light knob when off.
	 *
	 * @param progress 0 = off, 1 = on, values between are mid-animation
	 */
	public static void toggle(DrawContext context, int x, int y, float progress) {
		Theme theme = Theme.get();
		int track = Theme.mix(Theme.TRACK_OFF, theme.accentColor(), progress);
		int knob = Theme.mix(Theme.KNOB_OFF, theme.onAccent(), progress);
		if (progress > 0.01f) {
			RoundedRenderer.shadow(context, x, y, TOGGLE_WIDTH, TOGGLE_HEIGHT, TOGGLE_HEIGHT / 2, 3,
					Theme.fade(Theme.withAlpha(theme.accentColor(), 0x40), progress));
		}
		RoundedRenderer.fill(context, x, y, TOGGLE_WIDTH, TOGGLE_HEIGHT, TOGGLE_HEIGHT / 2, track);
		RoundedRenderer.outline(context, x, y, TOGGLE_WIDTH, TOGGLE_HEIGHT, TOGGLE_HEIGHT / 2,
				Theme.fade(Theme.OUTLINE, 1f - progress));
		int knobSize = TOGGLE_HEIGHT - 4;
		int travel = TOGGLE_WIDTH - knobSize - 4;
		int knobX = x + 2 + Math.round(travel * progress);
		RoundedRenderer.fill(context, knobX, y + 2, knobSize, knobSize, knobSize / 2, knob);
	}

	/** Outlined pill button with a centred label. */
	public static void outlinedButton(DrawContext context, int x, int y, int width, int height, String label,
			boolean hovered, boolean enabled) {
		RoundedRenderer.panel(context, x, y, width, height, height / 2, hovered && enabled ? Theme.ROW_HOVER : 0,
				hovered && enabled ? Theme.OUTLINE_STRONG : Theme.OUTLINE);
		Fonts.REGULAR.drawMiddle(context, label, x + width / 2, y + height / 2, enabled ? Theme.TEXT : Theme.TEXT_DISABLED);
	}

	/** Outlined pill button with an icon before the label. */
	public static void iconButton(DrawContext context, int x, int y, int width, int height, Icons icon, String label,
			boolean hovered) {
		RoundedRenderer.panel(context, x, y, width, height, height / 2, hovered ? Theme.ROW_HOVER : 0,
				hovered ? Theme.OUTLINE_STRONG : Theme.OUTLINE);
		int content = 9 + 4 + Fonts.REGULAR.width(label);
		int left = x + (width - content) / 2;
		icon.draw(context, left, y + (height - 9) / 2, 9, Theme.TEXT);
		Fonts.REGULAR.drawCentered(context, label, left + 13, y + height / 2, Theme.TEXT);
	}

	/** Solid accent button (the primary action), as the "Send" button in the reference. */
	public static void primaryButton(DrawContext context, int x, int y, int width, int height, String label,
			boolean hovered, boolean enabled) {
		Theme theme = Theme.get();
		int fill = enabled ? (hovered ? theme.accentColor() : Theme.withAlpha(theme.accentColor(), 0xE6)) : Theme.TRACK_OFF;
		RoundedRenderer.fill(context, x, y, width, height, Theme.RADIUS_CONTROL, fill);
		if (!enabled) {
			RoundedRenderer.outline(context, x, y, width, height, Theme.RADIUS_CONTROL, Theme.OUTLINE);
		}
		Fonts.BOLD.drawMiddle(context, label, x + width / 2, y + height / 2, enabled ? theme.onAccent() : Theme.TEXT_DISABLED);
	}

	/** Small-caps section label followed by a divider line, as "KEYBIND" in the reference. */
	public static void sectionLabel(DrawContext context, int x, int y, int width, String label) {
		Fonts.SMALL.drawCentered(context, label, x, y + 4, Theme.TEXT_MUTED);
		int start = x + Fonts.SMALL.width(label) + 6;
		if (start < x + width) {
			context.fill(start, y + 4, x + width, y + 5, Theme.DIVIDER);
		}
	}

	/** Thin vertical scrollbar; draws nothing when the content fits. */
	public static void scrollbar(DrawContext context, int x, int y, int height, int contentHeight, int offset) {
		if (contentHeight <= height || height <= 0) {
			return;
		}
		int thumb = Math.max(12, height * height / contentHeight);
		int travel = height - thumb;
		int thumbY = y + Math.round(travel * (offset / (float) (contentHeight - height)));
		RoundedRenderer.fill(context, x, y, 2, height, 1, Theme.DIVIDER);
		RoundedRenderer.fill(context, x, thumbY, 2, thumb, 1, Theme.OUTLINE_STRONG);
	}

	/** Dark value pill with centred text, used on the right of setting rows. */
	public static void valuePill(DrawContext context, int x, int y, int width, int height, String text, boolean active) {
		RoundedRenderer.panel(context, x, y, width, height, height / 2, Theme.INPUT, active ? Theme.OUTLINE_STRONG : Theme.OUTLINE);
		Fonts.REGULAR.drawMiddle(context, text, x + width / 2, y + height / 2, Theme.TEXT);
	}
}
