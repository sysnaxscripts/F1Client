package com.example.f1.render;

import com.mojang.blaze3d.platform.NativeImage;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.resources.ResourceLocation;

/**
 * Rounded rectangles for the HUD and the ClickGUI.
 *
 * <p>A rounded rectangle is nine draws: four corner quads from a generated quarter-disc
 * texture, two fills for the left and right of the body, one for the top band and one for
 * the bottom band. The corners are the only curved part, so they are rasterised once per
 * radius, at the display's own device-pixel scale, and cached.
 *
 * <p>Rasterising at device scale is what keeps the curve smooth: the corner texture is a
 * coverage mask, so scaling a texture generated for one DPI onto another makes the curve
 * visibly stair-step. {@link #setPixelsPerUnit(double)} is called every frame with the
 * current scale factor; when the scale changes the cache is dropped and rebuilt.
 *
 * <p>Nothing here touches the depth state, so the HUD and the GUI compose with vanilla
 * rendering exactly as a normal screen would.
 */
public final class RoundedRenderer {
	/** Cap on the generated corner texture, so a huge radius cannot allocate a huge image. */
	private static final int MAX_RADIUS_PX = 512;
	/** Texture kinds, packed into the cache key. */
	private static final int KIND_DISC = 0;
	private static final int KIND_RING = 1;
	private static final int KIND_SHADOW = 2;

	private static final Int2ObjectOpenHashMap<ResourceLocation> CACHE = new Int2ObjectOpenHashMap<>();
	private static float pixelsPerUnit = 2f;

	private RoundedRenderer() {
	}

	/**
	 * Sets the device pixels per design unit. Called once per frame, before any draw.
	 *
	 * <p>Changing the scale invalidates the cache, because the cached textures are keyed on
	 * the radius in device pixels rather than in units.
	 */
	public static void setPixelsPerUnit(float value) {
		float clamped = Math.max(0.25f, Math.min(8f, value));
		if (Math.abs(clamped - pixelsPerUnit) > 1e-3f) {
			pixelsPerUnit = clamped;
			// The cached textures were rasterised for the old scale and would stair-step.
			CACHE.clear();
		}
	}

	/** @return the current device pixels per design unit. */
	public static float pixelsPerUnit() {
		return pixelsPerUnit;
	}

	/**
	 * Draws a filled rounded rectangle.
	 *
	 * @param x left edge
	 * @param y top edge
	 * @param width width; values below 1 draw nothing
	 * @param height height; values below 1 draw nothing
	 * @param radius corner radius, clamped to half the smaller side
	 * @param color ARGB colour
	 */
	public static void fill(GuiGraphics context, int x, int y, int width, int height, int radius, int color) {
		if (width <= 0 || height <= 0 || (color >>> 24) == 0) {
			return;
		}
		int r = Math.max(0, Math.min(radius, Math.min(width, height) / 2));
		if (r == 0) {
			context.fill(x, y, x + width, y + height, color);
			return;
		}
		ResourceLocation id = texture(KIND_DISC, r, 0);
		int size = r * 2;
		// Four corners.
		quad(context, id, x, y, 0, 0, r, r, size, color);
		quad(context, id, x + width - r, y, r, 0, r, r, size, color);
		quad(context, id, x, y + height - r, 0, r, r, r, size, color);
		quad(context, id, x + width - r, y + height - r, r, r, r, r, size, color);
		// Body: top band, bottom band, then the middle.
		int middle = width - 2 * r;
		if (middle > 0) {
			context.fill(x + r, y, x + r + middle, y + r, color);
			context.fill(x + r, y + height - r, x + r + middle, y + height, color);
		}
		int band = height - 2 * r;
		if (band > 0) {
			context.fill(x, y + r, x + width, y + r + band, color);
		}
	}

	/**
	 * Draws a one-unit outline following a rounded rectangle.
	 *
	 * <p>The stroke is a ring texture: the same quarter-disc coverage mask with the inner
	 * part cut away, so the line follows the curve instead of stepping around it.
	 */
	public static void outline(GuiGraphics context, int x, int y, int width, int height, int radius, int color) {
		if (width <= 1 || height <= 1 || (color >>> 24) == 0) {
			return;
		}
		int r = Math.max(1, Math.min(radius, Math.min(width, height) / 2));
		ResourceLocation ring = texture(KIND_RING, r, 0);
		int size = r * 2;
		quad(context, ring, x, y, 0, 0, r, r, size, color);
		quad(context, ring, x + width - r, y, r, 0, r, r, size, color);
		quad(context, ring, x, y + height - r, 0, r, r, r, size, color);
		quad(context, ring, x + width - r, y + height - r, r, r, r, r, size, color);
		context.fill(x + r, y, x + width - r, y + 1, color);
		context.fill(x + r, y + height - 1, x + width - r, y + height, color);
		context.fill(x, y + r, x + 1, y + height - r, color);
		context.fill(x + width - 1, y + r, x + width, y + height - r, color);
	}

	/**
	 * Draws an outline of any whole width, as nested one-unit strokes. Each stroke shrinks
	 * the rectangle and its radius by one unit, so the corners stay concentric.
	 */
	public static void outline(GuiGraphics context, int x, int y, int width, int height, int radius, int thickness,
			int color) {
		for (int i = 0; i < thickness; i++) {
			outline(context, x + i, y + i, width - i * 2, height - i * 2, Math.max(0, radius - i), color);
		}
	}

	/** Fills a rounded rectangle and outlines it: the standard glass panel. */
	public static void panel(GuiGraphics context, int x, int y, int width, int height, int radius, int fill,
			int outline) {
		fill(context, x, y, width, height, radius, fill);
		outline(context, x, y, width, height, radius, outline);
	}

	/**
	 * Draws the glossy panel surface: a vertical gradient with a bright band under the top
	 * edge and a rim along it. This is what makes a surface read as glass rather than as a
	 * flat rectangle.
	 *
	 * @param top     colour of the upper half
	 * @param bottom  colour of the lower half
	 * @param gloss   colour of the highlight band; alpha 0 skips it
	 * @param rim     colour of the one-unit outline; alpha 0 skips it
	 */
	public static void glossyPanel(GuiGraphics context, int x, int y, int width, int height, int radius, int top,
			int bottom, int gloss, int rim) {
		if (width < 1 || height < 1) {
			return;
		}
		fill(context, x, y, width, height, radius, bottom);
		int half = Math.max(1, height / 2);
		fill(context, x, y, width, half, radius, top);
		if ((gloss >>> 24) != 0 && height > radius * 2) {
			fill(context, x + radius, y + 1, Math.max(1, width - radius * 2), Math.max(1, radius / 2),
					Math.max(1, radius / 2), gloss);
		}
		if ((rim >>> 24) != 0) {
			outline(context, x, y, width, height, radius, rim);
		}
	}

	/**
	 * Draws a filled circle.
	 *
	 * @param cx centre x
	 * @param cy centre y
	 * @param radius radius; below 1 nothing is drawn
	 */
	public static void circle(GuiGraphics context, int centerX, int centerY, int radius, int color) {
		fill(context, centerX - radius, centerY - radius, radius * 2, radius * 2, radius, color);
	}

	/**
	 * Draws a soft drop shadow around a rounded rectangle.
	 *
	 * @param spread how far the shadow reaches beyond the rectangle, in units
	 */
	public static void shadow(GuiGraphics context, int x, int y, int width, int height, int radius, int spread,
			int color) {
		if (spread <= 0 || (color >>> 24) == 0) {
			return;
		}
		int r = Math.max(1, Math.min(radius, Math.min(width, height) / 2));
		int s = r + spread;
		int size = s * 2;
		ResourceLocation id = texture(KIND_SHADOW, r, spread);
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

	/** Draws one corner quadrant of a generated texture. */
	private static void quad(GuiGraphics context, ResourceLocation id, int x, int y, int u, int v, int width,
			int height, int textureSize, int color) {
		context.blit(RenderPipelines.GUI_TEXTURED, id, x, y, u, v, width, height, textureSize, textureSize, color);
	}

	/** Draws a one-unit-wide slice of a generated texture, stretched to {@code width}. */
	private static void stretched(GuiGraphics context, ResourceLocation id, int x, int y, int width, int height,
			float u, float v, int regionWidth, int regionHeight, int textureSize, int color) {
		context.blit(RenderPipelines.GUI_TEXTURED, id, x, y, width, height, u, v, regionWidth, regionHeight,
				textureSize, textureSize, color);
	}

	/**
	 * Returns the cached texture for a kind and radius, generating and uploading it on first
	 * use. The key packs kind, radius and spread in device pixels.
	 */
	private static ResourceLocation texture(int kind, int radiusUnits, int spreadUnits) {
		int radiusPx = Math.max(1, Math.min(MAX_RADIUS_PX, (int) Math.round(radiusUnits * pixelsPerUnit)));
		int spreadPx = Math.max(0, Math.min(MAX_RADIUS_PX, (int) Math.round(spreadUnits * pixelsPerUnit)));
		int key = (kind << 20) | (radiusPx << 10) | spreadPx;
		ResourceLocation id = CACHE.get(key);
		if (id == null) {
			id = ResourceLocation.fromNamespaceAndPath(com.example.f1.F1Client.ID,
					"dynamic/rounded_" + kind + "_" + radiusPx + "_" + spreadPx);
			NativeImage image = switch (kind) {
			case KIND_RING -> ring(radiusPx, Math.max(1, (int) Math.round(pixelsPerUnit)));
			case KIND_SHADOW -> shadowImage(radiusPx, spreadPx);
			default -> disc(radiusPx);
			};
			DynamicTexture texture = new DynamicTexture(image);
			texture.upload();
			Minecraft.getInstance().getTextureManager().register(id, texture);
			CACHE.put(key, id);
		}
		return id;
	}

	/** Builds a quarter-disc coverage mask in a square image. */
	private static NativeImage disc(int radius) {
		int size = radius * 2;
		NativeImage image = new NativeImage(size, size, true);
		for (int y = 0; y < size; y++) {
			for (int x = 0; x < size; x++) {
				double distance = Math.hypot(x + 0.5 - radius, y + 0.5 - radius);
				putPixel(image, x, y, white(coverage(radius - distance)));
			}
		}
		return image;
	}

	/** Builds a ring coverage mask: the disc minus the disc {@code thickness} units smaller. */
	private static NativeImage ring(int radius, int thickness) {
		int size = radius * 2;
		NativeImage image = new NativeImage(size, size, true);
		for (int y = 0; y < size; y++) {
			for (int x = 0; x < size; x++) {
				double distance = Math.hypot(x + 0.5 - radius, y + 0.5 - radius);
				double outer = coverage(radius - distance);
				double inner = coverage(radius - thickness - distance);
				putPixel(image, x, y, white(Math.max(0, outer - inner)));
			}
		}
		return image;
	}

	/** Builds a shadow mask: solid inside the radius, smoothstepping out over the spread. */
	private static NativeImage shadowImage(int radius, int spread) {
		int half = radius + spread;
		int size = half * 2;
		NativeImage image = new NativeImage(size, size, true);
		for (int y = 0; y < size; y++) {
			for (int x = 0; x < size; x++) {
				double distance = Math.hypot(x + 0.5 - half, y + 0.5 - half) - radius;
				double t = spread == 0 ? 0 : 1 - Math.max(0, Math.min(1, distance / spread));
				putPixel(image, x, y, white(distance <= 0 ? 1 : t * t * (3 - 2 * t) * 0.9));
			}
		}
		return image;
	}

	/**
	 * Converts a signed distance to coverage, antialiasing the half-unit band around the edge.
	 */
	private static double coverage(double signedDistance) {
		return Math.max(0, Math.min(1, signedDistance + 0.5));
	}

	/** @return white at the given alpha; the mask's colour comes from the draw call. */
	private static int white(double alpha) {
		return ((int) Math.round(alpha * 255) << 24) | 0x00FFFFFF;
	}

	/**
	 * Writes one pixel. {@link NativeImage} stores pixels as ABGR, so red and blue are
	 * swapped on the way in.
	 */
	private static void putPixel(NativeImage image, int x, int y, int argb) {
		int alpha = (argb >>> 24) & 0xFF;
		int red = (argb >> 16) & 0xFF;
		int green = (argb >> 8) & 0xFF;
		int blue = argb & 0xFF;
		image.setPixelRGBA(x, y, (alpha << 24) | (blue << 16) | (green << 8) | red);
	}
}
