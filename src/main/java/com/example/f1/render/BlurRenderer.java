package com.example.f1.render;

import net.minecraft.client.gui.GuiGraphics;

/**
 * Backdrop for F1 screens.
 *
 * <p>Two parts, deliberately split: the blur pass belongs to the screen, because
 * {@code GuiGraphics} has no blur call of its own in these mappings and the pass may run
 * only once per frame. {@code UiScreen} therefore calls the game's own
 * {@code Screen#renderBlurredBackground}, which blurs everything rendered so far (the world
 * and the HUD) and follows the vanilla "Menu Background Blurriness" video setting, and then
 * calls {@link #backdrop} to dim and tint what is left. The client's own "Menu blur" switch
 * skips the pass entirely for players who would rather keep the world sharp behind the
 * glass; the dim stays either way. Both fade with the screen's own open animation.
 */
public final class BlurRenderer {
	private BlurRenderer() {
	}

	/**
	 * Dims and tints what is behind the screen.
	 *
	 * @param context drawing context of the current frame
	 * @param width   screen width in GUI units
	 * @param height  screen height in GUI units
	 * @param opacity fade-in factor of the screen, 0..1
	 */
	public static void backdrop(GuiGraphics context, int width, int height, float opacity) {
		if (opacity <= 0.01f) {
			return;
		}
		int dim = Theme.fade(Theme.BACKDROP_DIM, opacity);
		if ((dim >>> 24) != 0) {
			context.fill(0, 0, width, height, dim);
		}
		// A wash of the accent colour over the dim keeps the backdrop from going grey and
		// is what carries the "vibrant" part of the look behind the glass.
		int tint = Theme.fade(Theme.get().accent(0x14), opacity);
		if ((tint >>> 24) != 0) {
			context.fill(0, 0, width, height, tint);
		}
	}
}
