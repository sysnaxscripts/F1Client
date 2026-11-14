package com.example.f1.gui.widget;

import com.example.f1.render.Fonts;
import com.example.f1.render.Icons;
import com.example.f1.render.RoundedRenderer;
import com.example.f1.render.Theme;
import net.minecraft.client.gui.GuiGraphics;

/**
 * Stateless drawing routines for the small controls shared by every screen and the HUD.
 *
 * <p>Everything here composes {@link RoundedRenderer} and {@link Fonts} into the pieces the
 * interface repeats: glass panels, pill toggles, sliders, chips and buttons. The routines
 * take colours from {@link Theme}, so switching the accent recolours all of them.
 *
 * <p>None of these allocate per call and none of them touch the depth state, so drawing a
 * screen costs nothing beyond the quads themselves.
 */
public final class Widgets {
	/** Size of the toggle pill. */
	public static final int TOGGLE_WIDTH = 26;
	public static final int TOGGLE_HEIGHT = 14;
	/** Height of a standard row. */
	public static final int ROW = 24;
	/** Height of a small chip. */
	public static final int CHIP_HEIGHT = 15;

	private Widgets() {
	}

	/**
	 * A glass panel: soft shadow, translucent body with a bright band under the top edge,
	 * and a rim that catches the accent.
	 *
	 * @param accentRim when true the rim is tinted with the accent, which reads as "active"
	 */
	public static void panel(GuiGraphics context, int x, int y, int width, int height, int radius,
			boolean accentRim) {
		Theme theme = Theme.get();
		RoundedRenderer.shadow(context, x, y, width, height, radius, 6, Theme.SHADOW);
		RoundedRenderer.glossyPanel(context, x, y, width, height, radius, Theme.lighten(Theme.WINDOW, 0.05f),
				Theme.WINDOW, Theme.GLOSS_TOP, accentRim ? theme.accent(0x59) : Theme.OUTLINE);
	}

	/**
	 * An inset surface: darker than its surroundings with a highlight along the top, used for
	 * text fields, value pills and slider tracks.
	 */
	public static void inset(GuiGraphics context, int x, int y, int width, int height, int radius, int rim) {
		RoundedRenderer.fill(context, x, y, width, height, radius, Theme.INPUT);
		RoundedRenderer.fill(context, x + radius, y, width - radius * 2, 1, 0, Theme.HIGHLIGHT);
		RoundedRenderer.outline(context, x, y, width, height, radius, rim);
	}

	/**
	 * Pill toggle: the track fills with the accent as it switches on, the knob slides across
	 * and a soft glow appears under the whole thing.
	 *
	 * @param progress 0 = off, 1 = on, values between are mid-animation
	 */
	public static void toggle(GuiGraphics context, int x, int y, float progress) {
		Theme theme = Theme.get();
		int track = Theme.mix(Theme.TRACK_OFF, theme.accentColor(), progress);
		int knob = Theme.mix(Theme.KNOB, theme.onAccent(), progress * 0.35f);
		if (progress > 0.01f) {
			RoundedRenderer.shadow(context, x, y, TOGGLE_WIDTH, TOGGLE_HEIGHT, TOGGLE_HEIGHT / 2, 3,
					Theme.fade(theme.accent(0x48), progress));
		}
		RoundedRenderer.fill(context, x, y, TOGGLE_WIDTH, TOGGLE_HEIGHT, TOGGLE_HEIGHT / 2, track);
		// Gloss along the top of the track is what makes it look like a lit pill.
		RoundedRenderer.fill(context, x + 3, y + 1, TOGGLE_WIDTH - 6, 2, 1, Theme.GLOSS_BOTTOM);
		RoundedRenderer.outline(context, x, y, TOGGLE_WIDTH, TOGGLE_HEIGHT, TOGGLE_HEIGHT / 2,
				Theme.mix(Theme.OUTLINE, theme.accent(0x66), progress));
		int knobSize = TOGGLE_HEIGHT - 4;
		int travel = TOGGLE_WIDTH - knobSize - 4;
		int knobX = x + 2 + Math.round(travel * progress);
		RoundedRenderer.circle(context, knobX + knobSize / 2, y + TOGGLE_HEIGHT / 2, knobSize / 2, knob);
	}

	/**
	 * Slider track with a filled portion and a knob.
	 *
	 * @param fraction 0..1 position of the value in its range
	 * @param dragging whether the knob is being held, which enlarges it
	 */
	public static void slider(GuiGraphics context, int x, int y, int width, float fraction, boolean dragging) {
		Theme theme = Theme.get();
		int clamped = Math.round(Math.max(0f, Math.min(1f, fraction)) * (width - 8));
		RoundedRenderer.fill(context, x, y, width, 4, 2, Theme.TRACK_OFF);
		RoundedRenderer.fill(context, x, y, clamped + 4, 4, 2, theme.accent(0xE6));
		RoundedRenderer.fill(context, x, y, clamped + 4, 2, 1, Theme.lighten(theme.accentColor(), 0.35f));
		if (dragging) {
			RoundedRenderer.circle(context, x + 4 + clamped, y + 2, 7, theme.accent(0x33));
		}
		RoundedRenderer.circle(context, x + 4 + clamped, y + 2, dragging ? 5 : 4, Theme.KNOB);
	}

	/** Outlined pill button with a centred label. */
	public static void outlinedButton(GuiGraphics context, int x, int y, int width, int height, String label,
			boolean hovered, boolean enabled) {
		RoundedRenderer.panel(context, x, y, width, height, height / 2,
				hovered && enabled ? Theme.ROW_HOVER : 0, hovered && enabled ? Theme.OUTLINE_STRONG : Theme.OUTLINE);
		RoundedRenderer.fill(context, x + height / 2, y + 1, Math.max(1, width - height), 1, 0, Theme.GLOSS_BOTTOM);
		Fonts.REGULAR.drawMiddle(context, label, x + width / 2, y + height / 2,
				enabled ? Theme.TEXT : Theme.TEXT_DISABLED);
	}

	/** Outlined pill button with an icon before the label. */
	public static void iconButton(GuiGraphics context, int x, int y, int width, int height, Icons icon, String label,
			boolean hovered) {
		RoundedRenderer.panel(context, x, y, width, height, height / 2, hovered ? Theme.ROW_HOVER : 0,
				hovered ? Theme.OUTLINE_STRONG : Theme.OUTLINE);
		int content = 9 + 4 + Fonts.REGULAR.width(label);
		int left = x + (width - content) / 2;
		icon.draw(context, left, y + (height - 9) / 2, 9, hovered ? Theme.TEXT : Theme.TEXT_MUTED);
		Fonts.REGULAR.drawCentered(context, label, left + 13, y + height / 2, Theme.TEXT);
	}

	/** Solid accent button: the primary action of a screen. */
	public static void primaryButton(GuiGraphics context, int x, int y, int width, int height, String label,
			boolean hovered, boolean enabled) {
		Theme theme = Theme.get();
		int accent = theme.accentColor();
		if (!enabled) {
			RoundedRenderer.fill(context, x, y, width, height, Theme.RADIUS_CONTROL, Theme.TRACK_OFF);
			RoundedRenderer.outline(context, x, y, width, height, Theme.RADIUS_CONTROL, Theme.OUTLINE);
			Fonts.BOLD.drawMiddle(context, label, x + width / 2, y + height / 2, Theme.TEXT_DISABLED);
			return;
		}
		int top = Theme.lighten(accent, hovered ? 0.28f : 0.16f);
		int bottom = Theme.darken(accent, hovered ? 0.02f : 0.14f);
		RoundedRenderer.shadow(context, x, y, width, height, Theme.RADIUS_CONTROL, hovered ? 7 : 4,
				theme.accent(hovered ? 0x59 : 0x33));
		RoundedRenderer.glossyPanel(context, x, y, width, height, Theme.RADIUS_CONTROL, top, bottom,
				Theme.withAlpha(0xFFFFFFFF, 0x4D), Theme.withAlpha(0xFFFFFFFF, 0x33));
		Fonts.BOLD.drawMiddle(context, label, x + width / 2, y + height / 2, theme.onAccent());
	}

	/** Small-caps section label followed by a divider line. */
	public static void sectionLabel(GuiGraphics context, int x, int y, int width, String label) {
		Fonts.SMALL.drawCentered(context, label, x, y + 4, Theme.TEXT_MUTED);
		int start = x + Fonts.SMALL.width(label) + 6;
		if (start < x + width) {
			context.fill(start, y + 4, x + width, y + 5, Theme.DIVIDER);
		}
	}

	/** Thin vertical scrollbar; draws nothing when the content fits. */
	public static void scrollbar(GuiGraphics context, int x, int y, int height, int contentHeight, int offset) {
		if (contentHeight <= height || height <= 0) {
			return;
		}
		int thumb = Math.max(12, height * height / contentHeight);
		int travel = height - thumb;
		int thumbY = y + Math.round(travel * (offset / (float) (contentHeight - height)));
		RoundedRenderer.fill(context, x, y, 3, height, 1, Theme.DIVIDER);
		RoundedRenderer.fill(context, x, thumbY, 3, thumb, 1, Theme.get().accent(0xB4));
	}

	/**
	 * Dark value pill with centred text, used on the right of a setting row.
	 *
	 * @param active whether the row is hovered or being edited, which brightens the rim
	 */
	public static void valuePill(GuiGraphics context, int x, int y, int width, int height, String text,
			boolean active) {
		inset(context, x, y, width, height, height / 2, active ? Theme.OUTLINE_STRONG : Theme.OUTLINE);
		Fonts.REGULAR.drawMiddle(context, text, x + width / 2, y + height / 2,
				active ? Theme.TEXT : Theme.TEXT_MUTED);
	}

	/**
	 * A small rounded badge with a label, drawn in the given colour.
	 *
	 * @return the width it occupied, so a row of badges can be laid out
	 */
	public static int chip(GuiGraphics context, int x, int y, String label, int color, boolean filled) {
		int width = Fonts.SMALL.width(label) + 12;
		int height = CHIP_HEIGHT;
		RoundedRenderer.fill(context, x, y, width, height, height / 2, filled ? color : Theme.withAlpha(color, 0x29));
		RoundedRenderer.outline(context, x, y, width, height, height / 2, Theme.withAlpha(color, filled ? 0x66 : 0x4D));
		Fonts.SMALL.drawMiddle(context, label, x + width / 2, y + height / 2, filled ? 0xFF0B0D12 : color);
		return width;
	}
}
