package com.example.f1.render;

import com.mojang.blaze3d.platform.Window;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.FontDescription;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.Identifier;
import net.minecraft.util.FormattedCharSequence;
import org.joml.Matrix3x2fStack;

/**
 * Text drawing with the bundled Inter typeface instead of the vanilla bitmap font.
 *
 * <p>The TTF files live in {@code assets/f1client/font/}. Each role (regular, bold, small,
 * title) exists as several font definitions that differ only in rasterisation density:
 * {@code <role>_<density*100>.json}. The game samples glyph textures without filtering, so
 * glyphs must be rasterised at the size they appear on screen or thin strokes drop out;
 * {@link #setPixelsPerUnit(float)} picks the matching density for the current transform.
 * That is why there are forty-odd font definitions rather than four.
 *
 * <p>Laid-out strings and their widths are cached per density, so drawing a label that was
 * drawn before allocates nothing.
 */
public enum Fonts {
	/** Body text: settings labels, values, descriptions. */
	REGULAR("regular", 9f),
	/** Emphasis: titles, module names, active values. */
	BOLD("bold", 9f),
	/** Secondary text: hints, badges, axis labels. */
	SMALL("small", 7.5f),
	/** Screen and panel headings. */
	TITLE("title", 14f);

	/** Cap height of Inter as a fraction of the font size. */
	private static final float CAP_HEIGHT = 0.727f;
	/** Distance from the top of a text line to the baseline, as vanilla lays glyphs out. */
	private static final float BASELINE = 7f;
	/** Entries kept per density before the cache is dropped. */
	private static final int CACHE_LIMIT = 4096;

	private record Line(FormattedCharSequence text, int width) {
	}

	/**
	 * Held in a nested class because enum constructors may not read the enum's own static
	 * fields.
	 */
	private static final class Density {
		/** Rasterisation densities shipped as font definitions. */
		static final float[] VALUES = {1f, 1.25f, 1.5f, 1.75f, 2f, 2.25f, 2.5f, 2.75f, 3f, 3.5f, 4f};
		static int current = 4;
	}

	private final Style[] styles = new Style[Density.VALUES.length];
	private final Identifier[] fontIds = new Identifier[Density.VALUES.length];
	private final float size;
	@SuppressWarnings("unchecked")
	private final Map<String, Line>[] caches = new Map[Density.VALUES.length];

	Fonts(String name, float size) {
		for (int i = 0; i < Density.VALUES.length; i++) {
			fontIds[i] = Identifier.fromNamespaceAndPath(com.example.f1.F1Client.ID,
					name + "_" + Math.round(Density.VALUES[i] * 100));
			styles[i] = Style.EMPTY.withFont(new FontDescription.Resource(fontIds[i]));
			caches[i] = new HashMap<>();
		}
		this.size = size;
	}

	/**
	 * Selects the glyph density for subsequent text.
	 *
	 * @param pixelsPerUnit device pixels covered by one drawing unit under the current
	 *                      transform
	 */
	public static void setPixelsPerUnit(float pixelsPerUnit) {
		int best = 0;
		for (int i = 1; i < Density.VALUES.length; i++) {
			if (Math.abs(Density.VALUES[i] - pixelsPerUnit) <= Math.abs(Density.VALUES[best] - pixelsPerUnit)) {
				best = i;
			}
		}
		Density.current = best;
	}

	/** @return the density currently in use, as a scale multiplier. */
	public static float pixelsPerUnit() {
		return Density.VALUES[Density.current];
	}

	/** @return the font definition used for the current density. */
	public Identifier fontId() {
		return fontIds[Density.current];
	}

	/** @return width of the string in drawing units. */
	public int width(String text) {
		return line(text).width();
	}

	/** @return visual height of capital letters, used for vertical centring. */
	public int capHeight() {
		return Math.round(size * CAP_HEIGHT);
	}

	/** @return the design size of this role. */
	public float size() {
		return size;
	}

	/**
	 * Draws text with its line box starting at {@code y}.
	 *
	 * <p>Glyph textures are sampled unfiltered and are rasterised at screen density, so a
	 * line that starts between two device pixels loses or doubles rows. The line origin (the
	 * baseline vertically) is snapped to whole device pixels under the current transform.
	 */
	public void draw(GuiGraphics context, String text, int x, int y, int color) {
		if (text.isEmpty() || (color >>> 24) == 0) {
			return;
		}
		Matrix3x2fStack matrices = context.pose();
		float pixels = windowScale();
		float scaleX = matrices.m00() * pixels;
		float scaleY = matrices.m11() * pixels;
		float deviceX = matrices.m20() * pixels + x * scaleX;
		float deviceY = matrices.m21() * pixels + (y + BASELINE) * scaleY;
		float shiftX = scaleX > 0f ? (Math.round(deviceX) - deviceX) / scaleX : 0f;
		float shiftY = scaleY > 0f ? (Math.round(deviceY) - deviceY) / scaleY : 0f;
		if (shiftX == 0f && shiftY == 0f) {
			context.drawString(font(), line(text).text(), x, y, color, false);
			return;
		}
		matrices.pushMatrix();
		matrices.translate(shiftX, shiftY);
		context.drawString(font(), line(text).text(), x, y, color, false);
		matrices.popMatrix();
	}

	/** Draws text so its capital letters are vertically centred on {@code centerY}. */
	public void drawCentered(GuiGraphics context, String text, int x, int centerY, int color) {
		draw(context, text, x, Math.round(centerY - BASELINE + size * CAP_HEIGHT / 2f), color);
	}

	/** Draws text right-aligned to {@code right}, vertically centred on {@code centerY}. */
	public void drawRight(GuiGraphics context, String text, int right, int centerY, int color) {
		drawCentered(context, text, right - width(text), centerY, color);
	}

	/** Draws text horizontally centred on {@code centerX} and vertically on {@code centerY}. */
	public void drawMiddle(GuiGraphics context, String text, int centerX, int centerY, int color) {
		drawCentered(context, text, centerX - width(text) / 2, centerY, color);
	}

	/**
	 * Shortens a string with an ellipsis so it fits a width.
	 *
	 * @return the original string when it already fits
	 */
	public String ellipsize(String text, int maxWidth) {
		if (maxWidth <= 0 || width(text) <= maxWidth) {
			return text;
		}
		int end = text.length();
		while (end > 0 && width(text.substring(0, end).stripTrailing() + "\u2026") > maxWidth) {
			end--;
		}
		return text.substring(0, end).stripTrailing() + "\u2026";
	}

	private Line line(String text) {
		Map<String, Line> cache = caches[Density.current];
		Line line = cache.get(text);
		if (line == null) {
			if (cache.size() >= CACHE_LIMIT) {
				cache.clear();
			}
			FormattedCharSequence ordered = Component.literal(text).setStyle(styles[Density.current])
					.getVisualOrderText();
			line = new Line(ordered, font().width(ordered));
			cache.put(text, line);
		}
		return line;
	}

	private static Font font() {
		return Minecraft.getInstance().font;
	}

	/**
	 * @return device pixels per GUI unit, derived from the window's own pixel and unit sizes
	 *         so no scale-specific accessor is needed
	 */
	public static float windowScale() {
		Window window = Minecraft.getInstance().getWindow();
		int scaled = window.getGuiScaledWidth();
		return scaled <= 0 ? 1f : Math.max(0.25f, (float) window.getWidth() / scaled);
	}
}
