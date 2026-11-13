package com.example.f1.modules;

import com.example.f1.Module;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.vehicle.minecart.AbstractMinecart;
import net.minecraft.world.debug.gizmo.DrawStyle;
import net.minecraft.world.debug.gizmo.GizmoDrawing;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.lwjgl.glfw.GLFW;

/**
 * Sound ESP (default key F8): marks where interesting sounds come from, through terrain.
 *
 * <p>Markers are fed from two directions:
 *
 * <ol>
 * <li>{@code ClientLevelMixin} forwards every {@code ClientLevel#playLocalSound} call,
 * which is the funnel point where entity sounds, sound packets and level events all end
 * up, so chests, pistons, doors and levers are covered as well;</li>
 * <li>{@link #tick()} additionally scans the loaded entities for moving minecarts, because
 * a minecart's rolling sound is started by the client itself
 * ({@code AbstractMinecart} plays it into the level) and never arrives as a packet.</li>
 * </ol>
 *
 * <p>Each marker is drawn as one stroked cuboid that grows from a quarter block to a full
 * block and fades out over {@value #LIFETIME_MS} ms, after which {@link #tick()} drops it.
 * Like the other ESP module it draws into the game's world-gizmo pass with occlusion
 * ignored, and performs no line-of-sight check of any kind.
 */
public final class SoundESP extends Module {
	/** Set by the constructor so {@code ClientLevelMixin} can reach the module. */
	public static SoundESP INSTANCE;

	// --- tunables (no settings GUI; change and rebuild) ---
	/** Sound ID substrings worth marking, matched against the lowercased ID. */
	private static final List<String> SOUND_IDS = List.of("minecart", "rail", "piston", "chest", "door", "lever",
			"button", "tnt", "anvil", "portal");
	/** Marker colour before fading, RGB. */
	private static final int COLOR = 0xFFDC00;
	/** Outline width in pixels. */
	private static final float LINE_WIDTH = 2.0f;
	/** How far from the eye position a sound is still marked, in blocks. */
	private static final int RANGE = 48;
	/** Inclusive Y window; -64 reaches bedrock in the Overworld. */
	private static final int MIN_Y = -64;
	private static final int MAX_Y = 320;
	/** How long a marker lives, in milliseconds. */
	private static final int LIFETIME_MS = 1500;
	/** Ticks between minecart entity scans. */
	private static final int MINECART_SCAN_TICKS = 2;
	/** Squared speed below which a minecart counts as standing still. */
	private static final double MINECART_MIN_MOVEMENT_SQ = 0.001;
	/** Ring buffer size: the oldest marker is overwritten once this is reached. */
	private static final int MAX_MARKERS = 512;

	/** One marked position and the moment it was marked. */
	private static final class Marker {
		final double x;
		final double y;
		final double z;
		final long time;

		Marker(double x, double y, double z, long time) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.time = time;
		}
	}

	private final Marker[] markers = new Marker[MAX_MARKERS];
	private int next;
	private int count;
	private int ticks;

	public SoundESP() {
		super("SoundESP", GLFW.GLFW_KEY_F8);
		INSTANCE = this;
	}

	/** @return how many markers are currently alive (diagnostics). */
	public int size() {
		return count;
	}

	@Override
	protected void onEnable() {
		clear();
	}

	@Override
	protected void onDisable() {
		clear();
	}

	private void clear() {
		for (int i = 0; i < count; i++) {
			markers[i] = null;
		}
		next = 0;
		count = 0;
		ticks = 0;
	}

	/**
	 * Called by {@code ClientLevelMixin} for every locally played sound. Runs on the render
	 * thread, from the same call the sound engine uses, so no synchronisation is needed.
	 *
	 * @param soundId the sound's registry ID, e.g. {@code minecraft:block.chest.open}
	 */
	public void onSound(double x, double y, double z, String soundId) {
		if (!isEnabled() || mc.level == null || mc.player == null || soundId == null) {
			return;
		}
		if (y < MIN_Y || y > MAX_Y) {
			return;
		}
		if (!isInteresting(soundId)) {
			return;
		}
		Vec3 eye = mc.player.getEyePosition();
		double dx = x - eye.x;
		double dy = y - eye.y;
		double dz = z - eye.z;
		if (dx * dx + dy * dy + dz * dz > (double) RANGE * RANGE) {
			return;
		}
		add(x, y, z, System.currentTimeMillis());
	}

	private static boolean isInteresting(String soundId) {
		String id = soundId.toLowerCase(Locale.ROOT);
		for (int i = 0; i < SOUND_IDS.size(); i++) {
			if (id.contains(SOUND_IDS.get(i))) {
				return true;
			}
		}
		return false;
	}

	private void add(double x, double y, double z, long time) {
		// Ring buffer: once full, the slot about to be written holds the oldest marker.
		markers[next] = new Marker(x, y, z, time);
		next = (next + 1) % MAX_MARKERS;
		if (count < MAX_MARKERS) {
			count++;
		}
	}

	@Override
	public void tick() {
		if (mc.level == null || mc.player == null) {
			clear();
			return;
		}
		long now = System.currentTimeMillis();
		long cutoff = now - LIFETIME_MS;
		// Compact the ring in place, dropping everything older than the lifetime.
		int write = 0;
		for (int i = 0; i < count; i++) {
			Marker marker = markers[i];
			if (marker != null && marker.time >= cutoff) {
				markers[write++] = marker;
			}
		}
		for (int i = write; i < count; i++) {
			markers[i] = null;
		}
		count = write;
		next = count;

		ticks++;
		if (ticks % MINECART_SCAN_TICKS != 0) {
			return;
		}
		scanMinecarts(mc.level, now);
	}

	private void scanMinecarts(ClientLevel level, long now) {
		Vec3 eye = mc.player.getEyePosition();
		double maxDistanceSq = (double) RANGE * RANGE;
		for (Entity entity : level.entitiesForRendering()) {
			// Rolling sounds are client-side, so a moving cart is the reliable signal.
			if (!(entity instanceof AbstractMinecart)) {
				continue;
			}
			if (entity.getDeltaMovement().lengthSqr() <= MINECART_MIN_MOVEMENT_SQ) {
				continue;
			}
			if (entity.getY() < MIN_Y || entity.getY() > MAX_Y) {
				continue;
			}
			Vec3 pos = entity.position();
			double dx = pos.x - eye.x;
			double dy = pos.y - eye.y;
			double dz = pos.z - eye.z;
			if (dx * dx + dy * dy + dz * dz > maxDistanceSq) {
				continue;
			}
			add(pos.x, pos.y, pos.z, now);
		}
	}

	@Override
	public void render(float tickDelta) {
		if (count == 0 || mc.level == null || mc.player == null) {
			return;
		}
		long now = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			Marker marker = markers[i];
			if (marker == null) {
				continue;
			}
			float progress = (now - marker.time) / (float) LIFETIME_MS;
			if (progress < 0f) {
				progress = 0f;
			}
			if (progress >= 1f) {
				// tick() removes these by age; skipping keeps the frame free of ghosts.
				continue;
			}
			double grow = 0.25 + progress * 0.75;
			int alpha = (int) ((1f - progress) * 255f);
			DrawStyle style = DrawStyle.stroked((alpha << 24) | COLOR, LINE_WIDTH);
			// ignoreOcclusion is what draws this through terrain.
			GizmoDrawing.box(new AABB(marker.x - grow, marker.y - grow, marker.z - grow,
					marker.x + grow, marker.y + grow, marker.z + grow), style).ignoreOcclusion();
		}
	}
}
