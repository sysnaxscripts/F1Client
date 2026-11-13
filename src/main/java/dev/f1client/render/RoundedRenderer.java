package dev.f1client.render;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.util.Identifier;

/**
 * Anti-aliased rounded rectangles, outlines, circles and soft shadows for the GUI.
 *
 * <p>Corners come from small textures generated on demand at the exact device-pixel
 * radius, so edges stay crisp at every GUI scale and resolution. A texture is built once
 * per radius and cached; drawing itself only issues textured and solid quads and does
 * not allocate.
 */
public final class RoundedRenderer {
	private static final int KIND_DISC = 0;
	private static final int KIND_RING = 1;
	private static final int KIND_SHADOW = 2;
	private static final int MAX_RADIUS_PX = 512;

	private static final Int2ObjectOpenHashMap<Identifier> CACHE = new Int2ObjectOpenHashMap<>();
	private static float pixelsPerUnit = 2f;

	private RoundedRenderer() {
	}

	/**
	 * Tells the renderer how many device pixels one drawing unit covers under the current
	 * transform, so corner textures are generated at native resolution.
	 */
	public static void setPixelsPerUnit(float value) {
		pixelsPerUnit = Math.max(0.25f, value);
	}

	/** Fills a rounded rectangle. */
	public static void fill(DrawContext context, int x, int y, int width, int height, int radius, int color) {
		if (width <= 0 || height <= 0 || (color >>> 24) == 0) {
			return;
		}
		int r = Math.max(0, Math.min(radius, Math.min(width, height) / 2));
		if (r == 0) {
			context.fill(x, y, x + width, y + height, color);
			return;
		}
		Identifier disc = texture(KIND_DISC, r, 0);
		int d = r * 2;
		quad(context, disc, x, y, 0, 0, r, r, d, color);
		quad(context, disc, x + width - r, y, r, 0, r, r, d, color);
		quad(context, disc, x, y + height - r, 0, r, r, r, d, color);
		quad(context, disc, x + width - r, y + height - r, r, r, r, r, d, color);
		context.fill(x + r, y, x + width - r, y + r, color);
		context.fill(x, y + r, x + width, y + height - r, color);
		context.fill(x + r, y + height - r, x + width - r, y + height, color);
	}

	/** Draws a one-unit outline following a rounded rectangle. */
	public static void outline(DrawContext context, int x, int y, int width, int height, int radius, int color) {
		if (width <= 1 || height <= 1 || (color >>> 24) == 0) {
			return;
		}
		int r = Math.max(1, Math.min(radius, Math.min(width, height) / 2));
		Identifier ring = texture(KIND_RING, r, 0);
		int d = r * 2;
		quad(context, ring, x, y, 0, 0, r, r, d, color);
		quad(context, ring, x + width - r, y, r, 0, r, r, d, color);
		quad(context, ring, x, y + height - r, 0, r, r, r, d, color);
		quad(context, ring, x + width - r, y + height - r, r, r, r, r, d, color);
		context.fill(x + r, y, x + width - r, y + 1, color);
		context.fill(x + r, y + height - 1, x + width - r, y + height, color);
		context.fill(x, y + r, x + 1, y + height - r, color);
		context.fill(x + width - 1, y + r, x + width, y + height - r, color);
	}

	/** Fills a rounded rectangle and outlines it. */
	public static void panel(DrawContext context, int x, int y, int width, int height, int radius, int fill, int outline) {
		fill(context, x, y, width, height, radius, fill);
		outline(context, x, y, width, height, radius, outline);
	}

	/** Fills a circle centred on {@code (centerX, centerY)}. */
	public static void circle(DrawContext context, int centerX, int centerY, int radius, int color) {
		fill(context, centerX - radius, centerY - radius, radius * 2, radius * 2, radius, color);
	}

	/**
	 * Draws a soft drop shadow around a rounded rectangle.
	 *
	 * @param spread how far the shadow reaches beyond the rectangle, in units
	 */
	public static void shadow(DrawContext context, int x, int y, int width, int height, int radius, int spread, int color) {
		if (spread <= 0 || (color >>> 24) == 0) {
			return;
		}
		int r = Math.max(1, Math.min(radius, Math.min(width, height) / 2));
		int s = r + spread;
		int size = s * 2;
		Identifier id = texture(KIND_SHADOW, r, spread);
		int left = x - spread;
		int top = y - spread;
		int right = x + width + spread;
		int bottom = y + height + spread;
		int innerWidth = width - 2 * r;
		int innerHeight = height - 2 * r;
		quad(context, id, left, top, 0, 0, s, s, size, color);
		quad(context, id, right - s, top, s, 0, s, s, size, color);
		quad(context, id, left, bottom - s, 0, s, s, s, size, color);
		quad(context, id, right - s, bottom - s, s, s, s, s, size, color);
		if (innerWidth > 0) {
			stretched(context, id, left + s, top, innerWidth, s, s - 0.5f, 0, 1, s, size, color);
			stretched(context, id, left + s, bottom - s, innerWidth, s, s - 0.5f, s, 1, s, size, color);
		}
		if (innerHeight > 0) {
			stretched(context, id, left, top + s, s, innerHeight, 0, s - 0.5f, s, 1, size, color);
			stretched(context, id, right - s, top + s, s, innerHeight, s, s - 0.5f, s, 1, size, color);
			if (innerWidth > 0) {
				context.fill(left + s, top + s, right - s, bottom - s, color);
			}
		}
	}

	private static void quad(DrawContext context, Identifier id, int x, int y, int u, int v, int width, int height,
			int textureSize, int color) {
		context.drawTexture(RenderPipelines.GUI_TEXTURED, id, x, y, u, v, width, height, textureSize, textureSize, color);
	}

	private static void stretched(DrawContext context, Identifier id, int x, int y, int width, int height, float u, float v,
			int regionWidth, int regionHeight, int textureSize, int color) {
		context.drawTexture(RenderPipelines.GUI_TEXTURED, id, x, y, u, v, width, height, regionWidth, regionHeight,
				textureSize, textureSize, color);
	}

	private static Identifier texture(int kind, int radiusUnits, int spreadUnits) {
		int radiusPx = Math.max(1, Math.min(MAX_RADIUS_PX, Math.round(radiusUnits * pixelsPerUnit)));
		int spreadPx = Math.max(0, Math.min(MAX_RADIUS_PX, Math.round(spreadUnits * pixelsPerUnit)));
		int key = (kind << 20) | (radiusPx << 10) | spreadPx;
		Identifier id = CACHE.get(key);
		if (id == null) {
			id = Identifier.of("f1client", "dynamic/rounded_" + kind + "_" + radiusPx + "_" + spreadPx);
			NativeImage image = switch (kind) {
				case KIND_RING -> ring(radiusPx, Math.max(1, Math.round(pixelsPerUnit)));
				case KIND_SHADOW -> shadowImage(radiusPx, spreadPx);
				default -> disc(radiusPx);
			};
			String label = id.toString();
			NativeImageBackedTexture texture = new NativeImageBackedTexture(() -> label, image);
			texture.upload();
			MinecraftClient.getInstance().getTextureManager().registerTexture(id, texture);
			CACHE.put(key, id);
		}
		return id;
	}

	private static NativeImage disc(int radius) {
		int size = radius * 2;
		NativeImage image = new NativeImage(size, size, true);
		for (int y = 0; y < size; y++) {
			for (int x = 0; x < size; x++) {
				double distance = Math.hypot(x + 0.5 - radius, y + 0.5 - radius);
				image.setColorArgb(x, y, white(coverage(radius - distance)));
			}
		}
		return image;
	}

	private static NativeImage ring(int radius, int thickness) {
		int size = radius * 2;
		NativeImage image = new NativeImage(size, size, true);
		for (int y = 0; y < size; y++) {
			for (int x = 0; x < size; x++) {
				double distance = Math.hypot(x + 0.5 - radius, y + 0.5 - radius);
				double outer = coverage(radius - distance);
				double inner = coverage(radius - thickness - distance);
				image.setColorArgb(x, y, white(Math.max(0, outer - inner)));
			}
		}
		return image;
	}

	private static NativeImage shadowImage(int radius, int spread) {
		int half = radius + spread;
		int size = half * 2;
		NativeImage image = new NativeImage(size, size, true);
		for (int y = 0; y < size; y++) {
			for (int x = 0; x < size; x++) {
				double distance = Math.hypot(x + 0.5 - half, y + 0.5 - half) - radius;
				double t = spread == 0 ? 0 : 1 - Math.max(0, Math.min(1, distance / spread));
				image.setColorArgb(x, y, white(distance <= 0 ? 1 : t * t * (3 - 2 * t) * 0.9));
			}
		}
		return image;
	}

	private static double coverage(double signedDistance) {
		return Math.max(0, Math.min(1, signedDistance + 0.5));
	}

	private static int white(double alpha) {
		return ((int) Math.round(alpha * 255) << 24) | 0x00FFFFFF;
	}
}
