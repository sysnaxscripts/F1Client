package dev.f1client.render;

import net.minecraft.client.gui.DrawContext;

/**
 * Backdrop blur for F1Client screens.
 *
 * <p>Uses the game's own framebuffer blur post-effect: everything rendered so far (the
 * world and the HUD) is blurred in place, then dimmed so the glass panels read clearly.
 * The pass may run only once per frame, so screens call this exactly once from their
 * background step. Blur strength follows the vanilla "Menu Background Blurriness" video
 * setting; at zero only the dimming remains.
 */
public final class BlurRenderer {
	private BlurRenderer() {
	}

	/**
	 * Blurs what is behind the screen and dims it.
	 *
	 * @param context drawing context of the current frame
	 * @param width   screen width in GUI units
	 * @param height  screen height in GUI units
	 * @param opacity fade-in factor of the screen, 0..1
	 */
	public static void backdrop(DrawContext context, int width, int height, float opacity) {
		context.applyBlur();
		int dim = Theme.fade(Theme.BACKDROP_DIM, opacity);
		if ((dim >>> 24) != 0) {
			context.fill(0, 0, width, height, dim);
		}
	}
}
