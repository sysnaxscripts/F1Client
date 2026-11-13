package com.example.f1.mixin;

import com.example.f1.Modules;
import com.example.f1.modules.Freecam;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

/**
 * Moves the render camera to the {@link Freecam} position.
 *
 * <p>Three small changes to {@code Camera}, all no-ops while Freecam is off:
 *
 * <ol>
 * <li>the zoom clip returns 0, so the camera is not pushed out of the block it is in;</li>
 * <li>the camera is marked detached after vanilla aligned it, which is the flag vanilla
 * itself uses for spectator-style viewing and keeps terrain from being culled around a
 * camera that sits inside blocks;</li>
 * <li>the {@code setPosition} call inside the alignment method is redirected to the
 * interpolated Freecam coordinates.</li>
 * </ol>
 *
 * <p>Rotation is deliberately untouched: the mouse keeps turning the player and the camera
 * keeps following the player's head, which is what Freecam wants.
 *
 * <p>MAPPING NOTE: {@code alignWithEntity}, {@code getMaxZoom}, the {@code cameraDist}
 * argument name, the {@code detached} field and the {@code partialTicks} parameter name are
 * the Mojang-mapped names this is written against. Verify them with
 * {@code ./gradlew genSources} (search {@code client/Camera.java}) if a mixin fails to
 * apply; in mappings that lack {@code alignWithEntity} the same three hooks go on
 * {@code setup(BlockGetter, Entity, boolean, boolean, float)} (Yarn: {@code update}).
 */
@Mixin(Camera.class)
public abstract class CameraMixin {
	@Shadow
	private boolean detached;

	/** Freecam flies through blocks, so the camera must not be clipped out of them. */
	@ModifyVariable(method = "getMaxZoom", at = @At("HEAD"), argsOnly = true, name = "cameraDist")
	private float f1$noClipZoom(float cameraDist) {
		return Modules.enabled(Freecam.class) ? 0f : cameraDist;
	}

	/** Detached cameras are not frustum-culled against the player's position. */
	@Inject(method = "alignWithEntity", at = @At("TAIL"))
	private void f1$detachForFreecam(CallbackInfo ci) {
		if (Modules.enabled(Freecam.class)) {
			detached = true;
		}
	}

	/**
	 * Replaces the position vanilla just computed with the Freecam position.
	 *
	 * <p>If {@code @Local} cannot capture {@code partialTicks} in your mappings, the
	 * equivalent is {@code @ModifyVariable(method = "alignWithEntity", ordinal = 0,
	 * argsOnly = true)} on the float parameter, or passing {@code 1.0f} here: the camera is
	 * then one tick behind while flying, which is barely visible at 0.5 blocks per tick.
	 */
	@ModifyArgs(method = "alignWithEntity",
			at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Camera;setPosition(DDD)V"))
	private void f1$moveCamera(Args args, @Local(argsOnly = true, name = "partialTicks") float partialTicks) {
		Freecam freecam = Modules.get(Freecam.class);
		if (freecam == null || !freecam.isEnabled()) {
			return;
		}
		args.set(0, freecam.getX(partialTicks));
		args.set(1, freecam.getY(partialTicks));
		args.set(2, freecam.getZ(partialTicks));
	}
}
