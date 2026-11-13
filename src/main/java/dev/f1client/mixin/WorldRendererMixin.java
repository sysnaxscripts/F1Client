package dev.f1client.mixin;

import dev.f1client.F1Client;
import dev.f1client.module.impl.Freecam;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/** Feeds client-side block changes to the ore modules and keeps terrain visible for Freecam. */
@Mixin(WorldRenderer.class)
public abstract class WorldRendererMixin {
	@Inject(method = "updateBlock", at = @At("HEAD"))
	private void f1client$onBlockUpdate(BlockView world, BlockPos pos, BlockState oldState, BlockState newState, int flags,
			CallbackInfo ci) {
		F1Client.get().onBlockUpdate(pos, oldState, newState);
	}

	/**
	 * Vanilla culls terrain that cannot be seen from inside solid blocks unless the
	 * viewer is a spectator. A Freecam camera is routinely inside blocks, so it gets the
	 * spectator treatment for this one visibility pass.
	 */
	@ModifyArg(method = "render",
			at = @At(value = "INVOKE",
					target = "Lnet/minecraft/client/render/WorldRenderer;updateCamera(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/Frustum;Z)V"),
			index = 2, require = 0)
	private boolean f1client$seeThroughTerrain(boolean spectator) {
		return spectator || Freecam.active() != null;
	}
}
