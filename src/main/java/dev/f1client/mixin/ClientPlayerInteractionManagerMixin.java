package dev.f1client.mixin;

import dev.f1client.F1Client;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/** Notes blocks the local player breaks so SoundDetection can ignore its own actions. */
@Mixin(ClientPlayerInteractionManager.class)
public abstract class ClientPlayerInteractionManagerMixin {
	@Inject(method = "breakBlock", at = @At("HEAD"))
	private void f1client$onLocalBreak(BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
		F1Client.get().onLocalBlockAction(pos);
	}
}
