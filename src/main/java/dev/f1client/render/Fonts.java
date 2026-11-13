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

/**
 * Text drawing with the bundled Inter typeface instead of the vanilla bitmap font.
 *
 * <p>The TTF files live in {@code assets/f1client/font/} and are exposed to the game as
 * four font definitions (regular, bold, small, title). Laid-out strings and their widths
 * are cached, so drawing a label that was drawn before allocates nothing.
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

	private final Style style;
	private final float size;
	private final Map<String, Line> cache = new HashMap<>();

	Fonts(String name, float size) {
		this.style = Style.EMPTY.withFont(new StyleSpriteSource.Font(Identifier.of("f1client", name)));
		this.size = size;
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
		context.drawText(renderer(), line(text).text(), x, y, color, false);
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
		Line line = cache.get(text);
		if (line == null) {
			if (cache.size() >= CACHE_LIMIT) {
				cache.clear();
			}
			OrderedText ordered = Text.literal(text).setStyle(style).asOrderedText();
			line = new Line(ordered, renderer().getWidth(ordered));
			cache.put(text, line);
		}
		return line;
	}

	private static TextRenderer renderer() {
		return MinecraftClient.getInstance().textRenderer;
	}
}
