package dev.f1client.mixin;

import dev.f1client.module.impl.Freecam;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/** Redirects mouse-look from the local player to the Freecam camera. */
@Mixin(Entity.class)
public abstract class EntityMixin {
	@Inject(method = "changeLookDirection", at = @At("HEAD"), cancellable = true)
	private void f1client$turnFreecam(double cursorDeltaX, double cursorDeltaY, CallbackInfo ci) {
		Freecam freecam = Freecam.active();
		if (freecam != null && (Object) this == MinecraftClient.getInstance().player) {
			freecam.turn(cursorDeltaX, cursorDeltaY);
			ci.cancel();
		}
	}
}
