package dev.f1client.mixin;

import dev.f1client.module.impl.Freecam;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/** Places the render camera at the Freecam position after vanilla has positioned it. */
@Mixin(Camera.class)
public abstract class CameraMixin {
	@Shadow
	private boolean thirdPerson;

	@Shadow
	protected abstract void setPos(double x, double y, double z);

	@Shadow
	protected abstract void setRotation(float yaw, float pitch);

	@Inject(method = "update", at = @At("TAIL"))
	private void f1client$applyFreecam(World area, Entity focusedEntity, boolean thirdPerson, boolean inverseView,
			float tickProgress, CallbackInfo ci) {
		Freecam freecam = Freecam.active();
		if (freecam != null) {
			this.thirdPerson = true;
			setRotation(freecam.cameraYaw(), freecam.cameraPitch());
			setPos(freecam.cameraX(tickProgress), freecam.cameraY(tickProgress), freecam.cameraZ(tickProgress));
		}
	}
}
