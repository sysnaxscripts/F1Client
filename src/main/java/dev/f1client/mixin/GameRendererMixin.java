package dev.f1client.mixin;

import dev.f1client.module.impl.Freecam;
import net.minecraft.client.render.GameRenderer;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/** Skips drawing the first-person hand while Freecam asks for it to be hidden. */
@Mixin(GameRenderer.class)
public abstract class GameRendererMixin {
	@Inject(method = "renderHand", at = @At("HEAD"), cancellable = true)
	private void f1client$hideHand(float tickProgress, boolean sleeping, Matrix4f positionMatrix, CallbackInfo ci) {
		Freecam freecam = Freecam.active();
		if (freecam != null && freecam.hidesHand()) {
			ci.cancel();
		}
	}
}
