package dev.f1client.module.impl;

import dev.f1client.module.Category;
import dev.f1client.module.Module;
import dev.f1client.setting.BoolSetting;
import dev.f1client.setting.DoubleSetting;
import dev.f1client.setting.IntSetting;
import dev.f1client.setting.Setting;
import java.util.Locale;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.GameOptions;
import net.minecraft.util.math.Vec3d;

/**
 * Detached spectator-style camera.
 *
 * <p>The camera is moved purely on the render side: the player entity is never moved or
 * rotated by this module and no packet is created, altered or suppressed. While active,
 * movement keys steer the camera (and, with "Freeze player input" on, are withheld from
 * the player) and mouse movement turns the camera instead of the player. Disabling the
 * module simply stops overriding the camera, which returns it exactly to the player's
 * own view.
 */
public final class Freecam extends Module {
	private static final double BLOCKS_PER_TICK_PER_SPEED = 0.2;
	private static final float MOUSE_SCALE = 0.15f;
	private static Freecam instance;

	private final DoubleSetting speed = add(new DoubleSetting("Speed", 3.0, 1.0, 10.0, 0.5)
			.describe("Flight speed; 1 is about 4 blocks per second."));
	private final DoubleSetting sprintMultiplier = add(new DoubleSetting("Sprint multiplier", 2.0, 1.0, 5.0, 0.5)
			.describe("Speed factor while the sprint key is held."));
	private final BoolSetting hideHand = add(new BoolSetting("Hide hand", true));
	private final BoolSetting freezeInput = add(new BoolSetting("Freeze player input", true)
			.describe("Keep the player still while the camera flies."));
	private final BoolSetting returnOnDamage = add(new BoolSetting("Return on damage", true)
			.describe("Leave Freecam as soon as the player is hurt."));
	private final BoolSetting returnOnRelease = add(new BoolSetting("Return on key release", false)
			.describe("Freecam stays on only while its keybind is held."));
	private final IntSetting extraChunks = add(new IntSetting("Extra render distance", 4, 0, 16)
			.describe("Chunks added to the client-side render distance so terrain stays drawn around the camera. Not sent to the server."));

	private boolean active;
	private double x;
	private double y;
	private double z;
	private double lastX;
	private double lastY;
	private double lastZ;
	private float yaw;
	private float pitch;
	private int lastHurtTime;
	private int lastSectionX;
	private int lastSectionY;
	private int lastSectionZ;
	private double shownX = Double.NaN;
	private double shownY;
	private double shownZ;
	private double shownDistance;
	private String readout = "";

	public Freecam() {
		super("Freecam", "Fly the camera away from your body. Your player stays where it is.", Category.PLAYER);
		instance = this;
	}

	/** @return the Freecam module when it is currently steering the camera, otherwise {@code null}. */
	public static Freecam active() {
		Freecam freecam = instance;
		return freecam != null && freecam.active ? freecam : null;
	}

	@Override
	public boolean persistsEnabledState() {
		return false;
	}

	@Override
	public boolean isHoldBind() {
		return returnOnRelease.get();
	}

	@Override
	protected void onEnable() {
		MinecraftClient client = MinecraftClient.getInstance();
		ClientPlayerEntity player = client.player;
		if (player == null || client.world == null) {
			return;
		}
		Vec3d eye = player.getEyePos();
		x = lastX = eye.x;
		y = lastY = eye.y;
		z = lastZ = eye.z;
		yaw = player.getYaw();
		pitch = player.getPitch();
		lastHurtTime = player.hurtTime;
		lastSectionX = floor(x) >> 4;
		lastSectionY = floor(y) >> 4;
		lastSectionZ = floor(z) >> 4;
		shownX = Double.NaN;
		active = true;
	}

	@Override
	protected void onDisable() {
		active = false;
	}

	@Override
	public void onWorldChange() {
		if (isEnabled()) {
			setEnabled(false);
		}
	}

	@Override
	protected void onSettingChanged(Setting<?> setting) {
		if (setting == extraChunks && active) {
			MinecraftClient.getInstance().worldRenderer.scheduleTerrainUpdate();
		}
	}

	@Override
	public void onTick() {
		MinecraftClient client = MinecraftClient.getInstance();
		ClientPlayerEntity player = client.player;
		if (!active || player == null || client.world == null) {
			setEnabled(false);
			return;
		}
		if (returnOnDamage.get() && player.hurtTime > lastHurtTime) {
			setEnabled(false);
			return;
		}
		lastHurtTime = player.hurtTime;
		lastX = x;
		lastY = y;
		lastZ = z;
		if (client.currentScreen == null) {
			move(client.options);
		}
		int sectionX = floor(x) >> 4;
		int sectionY = floor(y) >> 4;
		int sectionZ = floor(z) >> 4;
		if (sectionX != lastSectionX || sectionY != lastSectionY || sectionZ != lastSectionZ) {
			lastSectionX = sectionX;
			lastSectionY = sectionY;
			lastSectionZ = sectionZ;
			client.worldRenderer.scheduleTerrainUpdate();
		}
	}

	private void move(GameOptions options) {
		double forward = (options.forwardKey.isPressed() ? 1 : 0) - (options.backKey.isPressed() ? 1 : 0);
		double strafe = (options.leftKey.isPressed() ? 1 : 0) - (options.rightKey.isPressed() ? 1 : 0);
		double vertical = (options.jumpKey.isPressed() ? 1 : 0) - (options.sneakKey.isPressed() ? 1 : 0);
		if (forward == 0 && strafe == 0 && vertical == 0) {
			return;
		}
		double step = speed.get() * BLOCKS_PER_TICK_PER_SPEED * (options.sprintKey.isPressed() ? sprintMultiplier.get() : 1.0);
		double horizontal = Math.sqrt(forward * forward + strafe * strafe);
		if (horizontal > 1.0) {
			forward /= horizontal;
			strafe /= horizontal;
		}
		double radians = Math.toRadians(yaw);
		double sin = Math.sin(radians);
		double cos = Math.cos(radians);
		x += (-sin * forward + cos * strafe) * step;
		z += (cos * forward + sin * strafe) * step;
		y += vertical * step;
	}

	/** Mouse-look: turns the camera instead of the player. Called from the look-direction mixin. */
	public void turn(double deltaX, double deltaY) {
		yaw += (float) deltaX * MOUSE_SCALE;
		pitch = Math.max(-90f, Math.min(90f, pitch + (float) deltaY * MOUSE_SCALE));
	}

	/** @return interpolated camera X for the frame. */
	public double cameraX(float tickDelta) {
		return lastX + (x - lastX) * tickDelta;
	}

	/** @return interpolated camera Y for the frame. */
	public double cameraY(float tickDelta) {
		return lastY + (y - lastY) * tickDelta;
	}

	/** @return interpolated camera Z for the frame. */
	public double cameraZ(float tickDelta) {
		return lastZ + (z - lastZ) * tickDelta;
	}

	public float cameraYaw() {
		return yaw;
	}

	public float cameraPitch() {
		return pitch;
	}

	/** @return whether the first-person hand should be hidden right now. */
	public boolean hidesHand() {
		return hideHand.get();
	}

	/** @return whether movement input is withheld from the player right now. */
	public boolean freezesInput() {
		return freezeInput.get();
	}

	/** @return chunks added to the client-side render distance right now. */
	public int extraRenderDistance() {
		return extraChunks.get();
	}

	/**
	 * @return HUD text with the camera position and its distance from the body; rebuilt
	 *         only when a shown digit changes
	 */
	public String readout() {
		ClientPlayerEntity player = MinecraftClient.getInstance().player;
		if (player == null) {
			return readout;
		}
		double dx = x - player.getX();
		double dy = y - player.getEyeY();
		double dz = z - player.getZ();
		double distance = Math.round(Math.sqrt(dx * dx + dy * dy + dz * dz) * 10.0) / 10.0;
		double rx = Math.round(x * 10.0) / 10.0;
		double ry = Math.round(y * 10.0) / 10.0;
		double rz = Math.round(z * 10.0) / 10.0;
		if (rx != shownX || ry != shownY || rz != shownZ || distance != shownDistance) {
			shownX = rx;
			shownY = ry;
			shownZ = rz;
			shownDistance = distance;
			readout = String.format(Locale.ROOT, "Freecam  %.1f  %.1f  %.1f   ·   %.1f m from body", rx, ry, rz, distance);
		}
		return readout;
	}

	private static int floor(double value) {
		return (int) Math.floor(value);
	}
}
