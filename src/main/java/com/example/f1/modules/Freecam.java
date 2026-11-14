package com.example.f1.modules;

import com.example.f1.Category;
import com.example.f1.Module;
import com.example.f1.Modules;
import com.example.f1.setting.BoolSetting;
import com.example.f1.setting.DoubleSetting;
import java.util.Locale;
import net.minecraft.client.CameraType;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector3d;
import org.lwjgl.glfw.GLFW;

/**
 * Freecam (default key F6): detaches the camera from the player.
 *
 * <p>The camera position is kept here and handed to {@code CameraMixin}, which overrides
 * {@code Camera#setPosition} while this module is enabled. Rotation is left alone, so the
 * mouse still turns the player and the view follows the player's head as usual.
 *
 * <p>Movement is read from the vanilla key states and the body is snapped back to the
 * position the camera started from every tick, with its motion and fall distance cleared.
 * Snapping rather than swallowing the input means no {@code KeyboardInput} mixin is needed
 * and the server keeps seeing a player that stands still: no movement packet is ever
 * created, changed or suppressed by this client.
 *
 * <p>Cost of that choice: the local player is visibly pulled back each tick, so a third
 * person view shows the body jittering at the anchor. Nothing is sent, so nobody else can
 * see it.
 */
public final class Freecam extends Module {
	/** Current camera position, updated once per tick. */
	private final Vector3d pos = new Vector3d();
	/** Camera position at the previous tick, for interpolation. */
	private final Vector3d prev = new Vector3d();
	/** Where the player is held while the camera flies; {@code null} when disabled. */
	private Vec3 anchor;
	private CameraType previousCameraType;

	private final DoubleSetting speed = add(new DoubleSetting("Speed", 0.5, 0.05, 5.0, 0.05)
			.describe("Blocks per tick the camera moves."));
	private final DoubleSetting sprint = add(new DoubleSetting("Sprint multiplier", 3.0, 1.0, 10.0, 0.5)
			.describe("How much faster the camera flies while the sprint key is held."));
	private final BoolSetting smooth = add(new BoolSetting("Smooth camera", true)
			.describe("Interpolate between ticks. Turn off for a camera that steps once per tick."));

	public Freecam() {
		super("Freecam", "Detaches the camera and flies it around while your body stays put.",
				Category.PLAYER, GLFW.GLFW_KEY_F6);
	}

	/** @return one line for the HUD: the camera position and how far it is from the body. */
	public String readout() {
		if (anchor == null) {
			return "Freecam";
		}
		double distance = Math.sqrt(anchor.distanceToSqr(new Vec3(pos.x, pos.y, pos.z)));
		return String.format(Locale.ROOT, "Freecam  %.0f %.0f %.0f  \u00b7  %.1f m out", pos.x, pos.y, pos.z,
				distance);
	}

	/** @return the module while it is enabled, otherwise {@code null}. Used by the mixins. */
	public static Freecam active() {
		Freecam freecam = Modules.get(Freecam.class);
		return freecam != null && freecam.isEnabled() ? freecam : null;
	}

	@Override
	protected void onEnable() {
		if (mc.player == null || mc.level == null || mc.gameRenderer == null) {
			// No world: enabling is meaningless. Throwing is how Module#toggle rolls the
			// enabled flag back; calling toggle() from here would fight the state change the
			// caller is in the middle of and leave the camera flying with no anchor.
			throw new IllegalStateException("Freecam needs a loaded world");
		}
		anchor = mc.player.position();
		Vec3 camera = mc.gameRenderer.getMainCamera().position();
		pos.set(camera.x, camera.y, camera.z);
		prev.set(pos);
		previousCameraType = mc.options.getCameraType();
		if (!previousCameraType.isFirstPerson()) {
			mc.options.setCameraType(CameraType.FIRST_PERSON);
		}
		// Rebuild the visible chunks: the camera is about to leave the player's frustum.
		refreshTerrain();
	}

	@Override
	protected void onDisable() {
		anchor = null;
		if (mc.options != null && previousCameraType != null) {
			mc.options.setCameraType(previousCameraType);
		}
		previousCameraType = null;
		refreshTerrain();
	}

	/**
	 * Asks the level renderer to rebuild every visible chunk.
	 *
	 * <p>MAPPING NOTE: the level renderer field is {@code levelRenderer} in the Mojang
	 * mappings this is written against ({@code LevelRenderer#allChanged()}). In mappings
	 * where it is named {@code levelExtractor} this is the one line to change; verify with
	 * {@code ./gradlew genSources} and a search for {@code allChanged}.
	 */
	private static void refreshTerrain() {
		if (mc.levelRenderer != null) {
			mc.levelRenderer.allChanged();
		}
	}

	@Override
	public void tick() {
		if (mc.player == null || mc.level == null || anchor == null) {
			return;
		}
		prev.set(pos);

		double step = speed.get() * (mc.options.keySprint.isDown() ? sprint.get() : 1.0);
		// Flat directions only: up and down are bound to their own keys, and the vanilla
		// yaw is what the camera rotation still uses.
		Vec3 forward = Vec3.directionFromRotation(0, mc.player.getYRot());
		Vec3 right = Vec3.directionFromRotation(0, mc.player.getYRot() + 90);
		double dx = 0;
		double dy = 0;
		double dz = 0;
		if (mc.options.keyUp.isDown()) {
			dx += forward.x * step;
			dz += forward.z * step;
		}
		if (mc.options.keyDown.isDown()) {
			dx -= forward.x * step;
			dz -= forward.z * step;
		}
		if (mc.options.keyRight.isDown()) {
			dx += right.x * step;
			dz += right.z * step;
		}
		if (mc.options.keyLeft.isDown()) {
			dx -= right.x * step;
			dz -= right.z * step;
		}
		if (mc.options.keyJump.isDown()) {
			dy += step;
		}
		if (mc.options.keyShift.isDown()) {
			dy -= step;
		}
		pos.set(pos.x + dx, pos.y + dy, pos.z + dz);

		// Hold the body where the camera started, so nothing is sent to the server.
		mc.player.setPos(anchor);
		mc.player.setDeltaMovement(Vec3.ZERO);
		mc.player.resetFallDistance();
	}

	/** @return interpolated camera X for this frame. */
	public double getX(float tickDelta) {
		return smooth.get() ? lerp(prev.x, pos.x, tickDelta) : pos.x;
	}

	/** @return interpolated camera Y for this frame. */
	public double getY(float tickDelta) {
		return smooth.get() ? lerp(prev.y, pos.y, tickDelta) : pos.y;
	}

	/** @return interpolated camera Z for this frame. */
	public double getZ(float tickDelta) {
		return smooth.get() ? lerp(prev.z, pos.z, tickDelta) : pos.z;
	}

	private static double lerp(double from, double to, float tickDelta) {
		double delta = tickDelta < 0f ? 0f : tickDelta > 1f ? 1f : tickDelta;
		return from + (to - from) * delta;
	}
}
