package dev.f1client.mixin;

import dev.f1client.F1Client;
import net.minecraft.block.Block;
import net.minecraft.client.world.WorldEventHandler;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Secondary sound source for SoundDetection: the block-break world event, which is how
 * vanilla servers tell other players that a block was broken (the break sound itself is
 * then played locally and never arrives as a sound packet).
 */
@Mixin(WorldEventHandler.class)
public abstract class WorldEventHandlerMixin {
	@Unique
	private static final int F1CLIENT_BLOCK_BROKEN = 2001;

	@Inject(method = "processWorldEvent", at = @At("HEAD"))
	private void f1client$onWorldEvent(int eventId, BlockPos pos, int data, CallbackInfo ci) {
		if (eventId == F1CLIENT_BLOCK_BROKEN) {
			F1Client.get().onBlockBreakEvent(pos, Block.getStateFromRawId(data));
		}
	}
}
