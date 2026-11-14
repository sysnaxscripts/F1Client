package com.example.f1.mixin;

import com.example.f1.Modules;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Drives the modules once per client tick.
 *
 * <p>The tail of {@code Minecraft#tick} is the point where the world, the player and the
 * GUI have all been ticked for this frame, so modules see consistent state. The mixin only
 * adds a call; it never cancels or changes vanilla behaviour.
 */
@Mixin(Minecraft.class)
public abstract class MinecraftMixin {
	@Inject(method = "tick()V", at = @At("TAIL"))
	private void f1$onTick(CallbackInfo ci) {
		Modules.tick();
	}
}
