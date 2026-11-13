package dev.f1client.render;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Style;
import net.minecraft.text.StyleSpriteSource;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.joml.Matrix3x2fStack;

/**
 * Text drawing with the bundled Inter typeface instead of the vanilla bitmap font.
 *
 * <p>The TTF files live in {@code assets/f1client/font/}. Each role (regular, bold, small,
 * title) exists as several font definitions that differ only in rasterisation density.
 * The game samples glyph textures without filtering, so glyphs must be rasterised at the
 * size they appear on screen or thin strokes drop out; {@link #setPixelsPerUnit} picks the
 * matching density for the current transform. Laid-out strings and their widths are
 * cached, so drawing a label that was drawn before allocates nothing.
 */
public enum Fonts {
	REGULAR("regular", 9f),
	BOLD("bold", 9f),
	SMALL("small", 7.5f),
	TITLE("title", 14f);

	/** Cap height of Inter as a fraction of the font size. */
	private static final float CAP_HEIGHT = 0.727f;
	/** Distance from the top of a text line to the baseline, as vanilla lays glyphs out. */
	private static final float BASELINE = 7f;
	private static final int CACHE_LIMIT = 4096;

	private record Line(OrderedText text, int width) {
	}

	/** Held in a nested class because enum constructors may not read the enum's own static fields. */
	private static final class Density {
		/** Rasterisation densities shipped as font definitions ({@code <role>_<density*100>.json}). */
		static final float[] VALUES = {1f, 1.25f, 1.5f, 1.75f, 2f, 2.25f, 2.5f, 2.75f, 3f, 3.5f, 4f};
		static int current = 4;
	}

	private final Style[] styles = new Style[Density.VALUES.length];
	private final float size;
	@SuppressWarnings("unchecked")
	private final Map<String, Line>[] caches = new Map[Density.VALUES.length];

	Fonts(String name, float size) {
		for (int i = 0; i < Density.VALUES.length; i++) {
			Identifier id = Identifier.of("f1client", name + "_" + Math.round(Density.VALUES[i] * 100));
			styles[i] = Style.EMPTY.withFont(new StyleSpriteSource.Font(id));
			caches[i] = new HashMap<>();
		}
		this.size = size;
	}

	/**
	 * Selects the glyph density for subsequent text.
	 *
	 * @param pixelsPerUnit device pixels covered by one drawing unit under the current transform
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

	/** @return width of the string in drawing units. */
	public int width(String text) {
		return line(text).width();
	}

	/** @return visual height of capital letters, used for vertical centring. */
	public int capHeight() {
		return Math.round(size * CAP_HEIGHT);
	}

	/** Draws text with its line box starting at {@code y}. */
	public void draw(DrawContext context, String text, int x, int y, int color) {
		if (text.isEmpty() || (color >>> 24) == 0) {
			return;
		}
		// Glyph textures are sampled unfiltered and are rasterised at screen density, so a
		// line that starts between two device pixels loses or doubles rows. Snap the line
		// origin (the baseline vertically) to whole device pixels under the current transform.
		Matrix3x2fStack matrices = context.getMatrices();
		float pixels = MinecraftClient.getInstance().getWindow().getScaleFactor();
		float scaleX = matrices.m00() * pixels;
		float scaleY = matrices.m11() * pixels;
		float deviceX = matrices.m20() * pixels + x * scaleX;
		float deviceY = matrices.m21() * pixels + (y + BASELINE) * scaleY;
		float shiftX = scaleX > 0f ? (Math.round(deviceX) - deviceX) / scaleX : 0f;
		float shiftY = scaleY > 0f ? (Math.round(deviceY) - deviceY) / scaleY : 0f;
		if (shiftX == 0f && shiftY == 0f) {
			context.drawText(renderer(), line(text).text(), x, y, color, false);
			return;
		}
		matrices.pushMatrix();
		matrices.translate(shiftX, shiftY);
		context.drawText(renderer(), line(text).text(), x, y, color, false);
		matrices.popMatrix();
	}

	/** Draws text so its capital letters are vertically centred on {@code centerY}. */
	public void drawCentered(DrawContext context, String text, int x, int centerY, int color) {
		draw(context, text, x, Math.round(centerY - BASELINE + size * CAP_HEIGHT / 2f), color);
	}

	/** Draws text right-aligned to {@code right}, vertically centred on {@code centerY}. */
	public void drawRight(DrawContext context, String text, int right, int centerY, int color) {
		drawCentered(context, text, right - width(text), centerY, color);
	}

	/** Draws text horizontally centred on {@code centerX} and vertically on {@code centerY}. */
	public void drawMiddle(DrawContext context, String text, int centerX, int centerY, int color) {
		drawCentered(context, text, centerX - width(text) / 2, centerY, color);
	}

	/**
	 * Shortens a string with an ellipsis so it fits a width.
	 *
	 * @return the original string when it already fits
	 */
	public String ellipsize(String text, int maxWidth) {
		if (width(text) <= maxWidth) {
			return text;
		}
		int end = text.length();
		while (end > 0 && width(text.substring(0, end).stripTrailing() + "…") > maxWidth) {
			end--;
		}
		return text.substring(0, end).stripTrailing() + "…";
	}

	private Line line(String text) {
		Map<String, Line> cache = caches[Density.current];
		Line line = cache.get(text);
		if (line == null) {
			if (cache.size() >= CACHE_LIMIT) {
				cache.clear();
			}
			OrderedText ordered = Text.literal(text).setStyle(styles[Density.current]).asOrderedText();
			line = new Line(ordered, renderer().getWidth(ordered));
			cache.put(text, line);
		}
		return line;
	}

	private static TextRenderer renderer() {
		return MinecraftClient.getInstance().textRenderer;
	}
}
