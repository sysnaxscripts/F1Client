package dev.f1client.mixin;

import dev.f1client.module.impl.Freecam;
import net.minecraft.client.input.Input;
import net.minecraft.client.input.KeyboardInput;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.math.Vec2f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/** Withholds movement keys from the player while Freecam uses them to fly the camera. */
@Mixin(KeyboardInput.class)
public abstract class KeyboardInputMixin extends Input {
	@Unique
	private static final PlayerInput F1CLIENT_IDLE = new PlayerInput(false, false, false, false, false, false, false);

	@Inject(method = "tick", at = @At("TAIL"))
	private void f1client$freezeInput(CallbackInfo ci) {
		Freecam freecam = Freecam.active();
		if (freecam != null && freecam.freezesInput()) {
			this.playerInput = F1CLIENT_IDLE;
			this.movementVector = Vec2f.ZERO;
		}
	}
}
