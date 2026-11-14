package com.example.f1.mixin;

import com.example.f1.hud.HudRenderer;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiGraphics;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Draws the client's overlay at the tail of the vanilla HUD.
 *
 * <p>Tail of {@code Gui#render} is the last thing drawn before a screen covers the game, so
 * the overlay sits on top of the hotbar, the crosshair and the chat, and disappears with
 * them when the game hides the HUD (F1) — which is why {@link HudRenderer} does not have to
 * check for that itself beyond its own guard.
 *
 * <p>The mixin only adds a call. Nothing vanilla is cancelled, reordered or changed, and no
 * depth or blend state is touched: the overlay is plain GUI drawing in the same pass as the
 * hotbar.
 */
@Mixin(Gui.class)
public abstract class GuiMixin {
	@Inject(method = "render", at = @At("TAIL"))
	private void f1$onRenderHud(GuiGraphics context, DeltaTracker deltaTracker, CallbackInfo ci) {
		Minecraft mc = Minecraft.getInstance();
		if (mc.getWindow() == null) {
			return;
		}
		HudRenderer.render(context, mc.getWindow().getGuiScaledWidth(), mc.getWindow().getGuiScaledHeight());
	}
}
