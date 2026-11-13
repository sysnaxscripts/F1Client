package dev.f1client.mixin;

import dev.f1client.module.impl.Freecam;
import net.minecraft.client.option.GameOptions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Widens the render distance the renderer uses while Freecam is active, so terrain stays
 * drawn around a camera that has left the player. This value is only read locally; the
 * view distance reported to the server comes from the option itself and is unchanged.
 */
@Mixin(GameOptions.class)
public abstract class GameOptionsMixin {
	@Inject(method = "getClampedViewDistance", at = @At("RETURN"), cancellable = true)
	private void f1client$widenForFreecam(CallbackInfoReturnable<Integer> cir) {
		Freecam freecam = Freecam.active();
		if (freecam != null && freecam.extraRenderDistance() > 0) {
			cir.setReturnValue(cir.getReturnValue() + freecam.extraRenderDistance());
		}
	}
}
