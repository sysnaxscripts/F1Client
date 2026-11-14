package com.example.f1.render;

import com.example.f1.F1Client;
import net.minecraft.client.gui.GuiGraphics;

/**
 * Backdrop for F1 screens.
 *
 * <p>Uses the game's own framebuffer blur post-effect: everything rendered so far (the
 * world and the HUD) is blurred in place, then dimmed so the glass panels read clearly.
 * The pass may run only once per frame, so screens call this exactly once from their
 * background step. Blur strength follows the vanilla "Menu Background Blurriness" video
 * setting, and the client's own "Menu blur" switch turns the pass off entirely for players
 * who would rather keep the world sharp behind the glass; the dim stays either way. Both
 * are faded with the screen's own open animation.
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
	public static void backdrop(GuiGraphics context, int width, int height, float opacity) {
		if (opacity <= 0.01f) {
			return;
		}
		F1Client client = F1Client.get();
		if (client == null || client.settings().menuBlur()) {
			context.applyBlur();
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
