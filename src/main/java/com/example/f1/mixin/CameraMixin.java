package com.example.f1.mixin;

import com.example.f1.Modules;
import com.example.f1.modules.Freecam;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.Camera;
import net.minecraft.world.phys.Vec3;
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
 * <p>Three changes to {@code Camera}, all no-ops while Freecam is off, all verified against
 * the Mojang-mapped 1.21.11 signatures:
 *
 * <ol>
 * <li>{@code private float getMaxZoom(float)} returns 0, so the third-person clip does not
 * pull the camera towards the player;</li>
 * <li>the {@code detached} flag is set after vanilla finished aligning the camera, which is
 * the flag vanilla itself uses for spectator-style viewing and keeps terrain from being
 * culled around a camera that sits inside blocks;</li>
 * <li>the {@code setPosition} call is redirected to the interpolated Freecam position.</li>
 * </ol>
 *
 * <p>Rotation is deliberately untouched: the mouse keeps turning the player and the camera
 * keeps following the player's head, which is what Freecam wants.
 *
 * <p>The method this hooks is {@code setup(Level, Entity, boolean, boolean, float)}. Older
 * versions and other mappings call it {@code alignWithEntity} or {@code update}; the shape
 * of the three hooks does not change, only the method name in the annotations.
 */
@Mixin(Camera.class)
public abstract class CameraMixin {
	@Shadow
	private boolean detached;

	/**
	 * Freecam flies through blocks, so the camera must not be clipped towards the player.
	 *
	 * <p>Targeted by ordinal rather than by name: {@code getMaxZoom} has exactly one float
	 * parameter, so ordinal 0 is that parameter in every mapping, while its name
	 * ({@code cameraDist}, {@code startingDistance}, ...) is not stable and resolving it
	 * needs the local variable table.
	 */
	@ModifyVariable(method = "getMaxZoom(F)F", at = @At("HEAD"), argsOnly = true, ordinal = 0)
	private float f1$noClipZoom(float cameraDist) {
		return Modules.enabled(Freecam.class) ? 0f : cameraDist;
	}

	/** Detached cameras are not frustum-culled against the player's position. */
	@Inject(method = "setup(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;ZZF)V",
			at = @At("TAIL"))
	private void f1$detachForFreecam(CallbackInfo ci) {
		if (Modules.enabled(Freecam.class)) {
			detached = true;
		}
	}

	/**
	 * Replaces the position vanilla just computed with the Freecam position.
	 *
	 * <p>Both {@code setPosition} overloads are hooked because which one {@code setup} calls
	 * is an implementation detail, and {@code require = 0} keeps the game bootable when only
	 * one of them is on the path. {@code setPosition(Vec3)} delegates to
	 * {@code setPosition(double, double, double)}, so a {@code setup} that goes through the
	 * {@code Vec3} overload is still caught by the second hook.
	 *
	 * <p>If {@code @Local} cannot capture the float parameter in your mappings, drop the
	 * annotation and pass {@code 1.0f}: the camera is then one tick behind while flying,
	 * which is barely visible at 0.5 blocks per tick.
	 */
	@ModifyArgs(method = "setup(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;ZZF)V",
			at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Camera;setPosition(DDD)V"), require = 0)
	private void f1$moveCameraByCoordinates(Args args, @Local(argsOnly = true, ordinal = 4) float partialTickTime) {
		Freecam freecam = Modules.get(Freecam.class);
		if (freecam == null || !freecam.isEnabled()) {
			return;
		}
		args.set(0, freecam.getX(partialTickTime));
		args.set(1, freecam.getY(partialTickTime));
		args.set(2, freecam.getZ(partialTickTime));
	}

	/** @see #f1$moveCameraByCoordinates(Args, float) */
	@ModifyArgs(method = "setup(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;ZZF)V",
			at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Camera;setPosition(Lnet/minecraft/world/phys/Vec3;)V"),
			require = 0)
	private void f1$moveCameraByVector(Args args, @Local(argsOnly = true, ordinal = 4) float partialTickTime) {
		Freecam freecam = Modules.get(Freecam.class);
		if (freecam == null || !freecam.isEnabled()) {
			return;
		}
		args.set(0, new Vec3(freecam.getX(partialTickTime), freecam.getY(partialTickTime),
				freecam.getZ(partialTickTime)));
	}
}
