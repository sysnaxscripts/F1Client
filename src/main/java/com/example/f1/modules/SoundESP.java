package com.example.f1.modules;

import com.example.f1.Category;
import com.example.f1.Module;
import com.example.f1.setting.BoolSetting;
import com.example.f1.setting.ColorSetting;
import com.example.f1.setting.DoubleSetting;
import com.example.f1.setting.IntSetting;
import com.example.f1.util.UiSounds;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import net.minecraft.ChatFormatting;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.gizmos.GizmoStyle;
import net.minecraft.gizmos.Gizmos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.vehicle.minecart.AbstractMinecart;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.lwjgl.glfw.GLFW;

/**
 * Sound ESP (default key F8): marks where interesting sounds come from, through terrain.
 *
 * <p>Markers are fed from three directions:
 *
 * <ol>
 * <li>{@code ClientLevelMixin} forwards every {@code ClientLevel#playLocalSound} call,
 * which is where the sounds the local client starts itself end up;</li>
 * <li>{@code SoundManagerMixin} forwards every sound that reaches
 * {@code SoundManager#play}, which is the real funnel: server sound packets go there
 * without touching {@code ClientLevel}, so chests, pistons and doors operated by other
 * players are covered too, and an entity-attached sound arrives with its position already
 * resolved;</li>
 * <li>{@link #tick()} additionally scans the loaded entities for moving minecarts, because
 * a minecart's rolling sound is started by the client itself ({@code AbstractMinecart}
 * plays it into the level) and never arrives as a packet.</li>
 * </ol>
 *
 * <p>Local sounds reach both of the first two hooks, so {@link #add} drops a marker that
 * duplicates one added moments earlier at the same spot.
 *
 * <p>Each marker is drawn as one stroked cuboid that grows from a quarter block to a full
 * block and fades out over its lifetime, after which {@link #tick()} drops it. Which sounds
 * count as interesting, and what colour each family is drawn in, are settings; every marker
 * keeps the family it was matched against, so a chest and a cart never share a colour. Like
 * the other ESP module this draws into the game's gizmo pass with always-on-top set per
 * shape, and performs no line-of-sight check of any kind.
 */
public final class SoundESP extends Module {
	/** Set by the constructor so the mixins can reach the module. */
	public static SoundESP INSTANCE;

	/** Inclusive Y window; -64 reaches bedrock in the Overworld. */
	private static final int MIN_Y = -64;
	private static final int MAX_Y = 320;
	/** Ticks between minecart entity scans. */
	private static final int MINECART_SCAN_TICKS = 2;
	/** Squared speed below which a minecart counts as standing still. */
	private static final double MINECART_MIN_MOVEMENT_SQ = 0.001;
	/** Ring buffer size: the oldest marker is overwritten once this is reached. */
	private static final int MAX_MARKERS = 512;
	/** Alerts kept for the HUD list. */
	private static final int MAX_ALERTS = 24;
	/**
	 * A sound younger than this window and within 0.35 blocks of an existing marker is the
	 * same event seen twice: {@code ClientLevel#playLocalSound} and {@code SoundManager#play}
	 * are on the same path for anything the client plays locally.
	 */
	private static final long DEDUPE_WINDOW_MS = 60;
	private static final double DEDUPE_DISTANCE = 0.35;

	/**
	 * The families of sound this module can mark.
	 *
	 * <p>Matching is on the lowercased registry id, so {@code minecraft:block.chest.open}
	 * matches the {@code chest} keyword. Keywords are deliberately broad: a family should
	 * catch the blocks and entities a player thinks of together, not a single sound.
	 */
	public enum SoundKind {
		/** Minecarts rolling, and the rails they run on. */
		MINECART("Minecarts", 0xFFFFB347, "minecart", "rail"),
		/** Chests, barrels and shulker boxes opening or closing. */
		CONTAINER("Containers", 0xFF4AE0D9, "chest", "barrel", "shulker", "ender"),
		/** Pistons, doors, trapdoors, levers, buttons, dispensers and hoppers. */
		MECHANISM("Mechanisms", 0xFFB08CFF, "piston", "door", "lever", "button", "dispenser", "hopper"),
		/** Primed TNT and ignited creepers. */
		EXPLOSIVE("Explosives", 0xFFFF5A6E, "tnt", "creeper.primed", "fuse"),
		/** Nether portals, and anything travelling through one. */
		PORTAL("Portals", 0xFF5AA8FF, "portal"),
		/** Anvils landing and being used. */
		ANVIL("Anvils", 0xFFD8DAE0, "anvil"),
		/** Other players: attacks, hurt, eating, level-ups and death. */
		PLAYER("Players", 0xFF4ADE80, "player"),
		/** Anything else that reached the sound engine inside range. */
		OTHER("Everything else", 0xFFFFDC00, "");

		private static final SoundKind[] VALUES = values();

		private final String label;
		private final int color;
		private final String[] keywords;

		SoundKind(String label, int color, String... keywords) {
			this.label = label;
			this.color = color;
			this.keywords = keywords;
		}

		/** @return the display name. */
		public String label() {
			return label;
		}

		/** @return the default marker colour, opaque ARGB. */
		public int color() {
			return color;
		}

		/** @return whether a lowercased sound id belongs to this family. */
		public boolean matches(String lowercasedId) {
			for (String keyword : keywords) {
				if (!keyword.isEmpty() && lowercasedId.contains(keyword)) {
					return true;
				}
			}
			return false;
		}

		/** @return the constants without the defensive copy made by {@link #values()}. */
		public static SoundKind[] all() {
			return VALUES;
		}
	}

	/** One marked position: where, when and which family. */
	private static final class Marker {
		final double x;
		final double y;
		final double z;
		final long time;
		final SoundKind kind;

		Marker(double x, double y, double z, long time, SoundKind kind) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.time = time;
			this.kind = kind;
		}
	}

	/**
	 * A recent sound, in the form the HUD list and the chat message show it.
	 *
	 * @param kind   the family that matched
	 * @param x      block x
	 * @param y      block y
	 * @param z      block z
	 * @param timeMs when it was heard
	 */
	public record Alert(SoundKind kind, int x, int y, int z, long timeMs) {
		/** @return the position as {@code x, y, z}. */
		public String coordinates() {
			return x + ", " + y + ", " + z;
		}
	}

	private final IntSetting range = add(new IntSetting("Range", 48, 8, 128, 4)
			.describe("Blocks from your eyes a sound is still marked for.")
			.group("Detection"));
	private final IntSetting lifetime = add(new IntSetting("Marker life", 1500, 200, 10000, 100)
			.describe("Milliseconds a marker stays on screen, growing and fading as it goes.")
			.group("Detection"));
	private final BoolSetting everythingElse = add(new BoolSetting("Mark unmatched sounds", false)
			.describe("Also mark sounds that match none of the families above, in yellow.")
			.group("Detection"));
	private final BoolSetting chatMessage = add(new BoolSetting("Chat message", false)
			.describe("Print one line per new sound into your own chat. Nobody else sees it.")
			.group("Alerts"));
	private final BoolSetting beep = add(new BoolSetting("Alert beep", false)
			.describe("Play a short note when a new sound is marked.")
			.group("Alerts"));
	private final DoubleSetting lineWidth = add(new DoubleSetting("Line width", 2.0, 0.5, 6.0, 0.5)
			.describe("Thickness of the marker outline, in pixels.")
			.group("Drawing"));

	private final BoolSetting[] kinds = new BoolSetting[SoundKind.VALUES.length];
	private final ColorSetting[] colors = new ColorSetting[SoundKind.VALUES.length];

	private final Marker[] markers = new Marker[MAX_MARKERS];
	private final List<Alert> alerts = new ArrayList<>();
	private int next;
	private int count;
	private int ticks;
	private int alertVersion;

	public SoundESP() {
		super("SoundESP", "Marks where carts, chests, pistons and players make noise.", Category.WORLD,
				GLFW.GLFW_KEY_F8);
		for (SoundKind kind : SoundKind.VALUES) {
			if (kind == SoundKind.OTHER) {
				// Its switch is the "Mark unmatched sounds" setting above.
				colors[kind.ordinal()] = add(new ColorSetting(kind.label() + " colour", kind.color())
						.group("Colours"));
				continue;
			}
			kinds[kind.ordinal()] = add(new BoolSetting(kind.label(), true)
					.describe("Mark " + kind.label().toLowerCase(Locale.ROOT) + ".")
					.group("Sounds"));
			colors[kind.ordinal()] = add(new ColorSetting(kind.label() + " colour", kind.color())
					.group("Colours"));
		}
		INSTANCE = this;
	}

	/** @return how many markers are currently alive; used by diagnostics. */
	public int size() {
		return count;
	}

	/** @return the most recent alerts first, for the HUD list. The list is immutable. */
	public List<Alert> alerts() {
		return Collections.unmodifiableList(alerts);
	}

	/** @return a counter that changes whenever the alert list does, so the HUD can cache. */
	public int alertVersion() {
		return alertVersion;
	}

	/** @return the colour that family is currently drawn in, opaque. */
	public int colorOf(SoundKind kind) {
		return colors[kind.ordinal()].opaque();
	}

	/** @return whether that family is currently marked. */
	public boolean marks(SoundKind kind) {
		return kind == SoundKind.OTHER ? everythingElse.get() : kinds[kind.ordinal()].get();
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
		alerts.clear();
		alertVersion++;
	}

	/**
	 * Called by {@code ClientLevelMixin} for every locally played sound and by
	 * {@code SoundManagerMixin} for every sound that reaches the sound engine, which is what
	 * covers the sounds other players cause. Both run on the client thread, from the same
	 * call the sound engine uses, so no synchronisation is needed.
	 *
	 * @param soundId the sound's registry id, e.g. {@code minecraft:block.chest.open}
	 */
	public void onSound(double x, double y, double z, String soundId) {
		if (!isEnabled() || mc.level == null || mc.player == null || soundId == null) {
			return;
		}
		if (y < MIN_Y || y > MAX_Y) {
			return;
		}
		SoundKind kind = classify(soundId);
		if (kind == null) {
			return;
		}
		Vec3 eye = mc.player.getEyePosition();
		double dx = x - eye.x;
		double dy = y - eye.y;
		double dz = z - eye.z;
		int maxRange = range.get();
		if (dx * dx + dy * dy + dz * dz > (double) maxRange * maxRange) {
			return;
		}
		add(x, y, z, System.currentTimeMillis(), kind, soundId);
	}

	/** @return the family a sound belongs to, or {@code null} when it should not be marked. */
	private SoundKind classify(String soundId) {
		String id = soundId.toLowerCase(Locale.ROOT);
		for (SoundKind kind : SoundKind.VALUES) {
			if (kind == SoundKind.OTHER) {
				continue;
			}
			if (kind.matches(id)) {
				return kinds[kind.ordinal()].get() ? kind : null;
			}
		}
		return everythingElse.get() ? SoundKind.OTHER : null;
	}

	private void add(double x, double y, double z, long time, SoundKind kind, String soundId) {
		if (isDuplicate(x, y, z, time)) {
			return;
		}
		// Ring buffer: once full, the slot about to be written holds the oldest marker.
		markers[next] = new Marker(x, y, z, time, kind);
		next = (next + 1) % MAX_MARKERS;
		if (count < MAX_MARKERS) {
			count++;
		}
		pushAlert(kind, x, y, z, time, soundId);
	}

	/**
	 * Records the sound for the HUD list and, if asked, for the player's own chat.
	 *
	 * <p>The chat line is added through the client's own chat widget, so it never travels to
	 * the server and no other player sees it.
	 */
	private void pushAlert(SoundKind kind, double x, double y, double z, long time, String soundId) {
		Alert alert = new Alert(kind, (int) Math.floor(x), (int) Math.floor(y), (int) Math.floor(z), time);
		alerts.add(0, alert);
		while (alerts.size() > MAX_ALERTS) {
			alerts.remove(alerts.size() - 1);
		}
		alertVersion++;
		int rgb = colors[kind.ordinal()].opaque() & 0x00FFFFFF;
		if (chatMessage.get() && mc.gui != null) {
			mc.gui.getChat().addMessage(Component.literal("[F1] " + kind.label() + " at " + alert.coordinates())
					.withStyle(style -> style.withColor(rgb).withItalic(false))
					.append(Component.literal("  (" + soundId + ")").withStyle(ChatFormatting.DARK_GRAY)));
		}
		if (beep.get()) {
			UiSounds.beep(kind == SoundKind.EXPLOSIVE ? 1.6f : 1.0f);
		}
	}

	private boolean isDuplicate(double x, double y, double z, long time) {
		for (int i = 0; i < count; i++) {
			Marker marker = markers[i];
			if (marker == null || time - marker.time > DEDUPE_WINDOW_MS) {
				continue;
			}
			double dx = marker.x - x;
			double dy = marker.y - y;
			double dz = marker.z - z;
			if (dx * dx + dy * dy + dz * dz <= DEDUPE_DISTANCE * DEDUPE_DISTANCE) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void tick() {
		if (mc.level == null || mc.player == null) {
			clear();
			return;
		}
		long now = System.currentTimeMillis();
		long cutoff = now - lifetime.get();
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

		// The alert list is not the marker list: alerts outlive their markers, so they are
		// dropped on a much longer window than the drawing lifetime.
		while (!alerts.isEmpty() && now - alerts.get(alerts.size() - 1).timeMs() > 60_000L) {
			alerts.remove(alerts.size() - 1);
			alertVersion++;
		}

		ticks++;
		if (ticks % MINECART_SCAN_TICKS != 0) {
			return;
		}
		scanMinecarts(mc.level, now);
	}

	private void scanMinecarts(ClientLevel level, long now) {
		if (!kinds[SoundKind.MINECART.ordinal()].get()) {
			return;
		}
		Vec3 eye = mc.player.getEyePosition();
		int maxRange = range.get();
		double maxDistanceSq = (double) maxRange * maxRange;
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
			add(pos.x, pos.y, pos.z, now, SoundKind.MINECART, "entity.minecart.riding");
		}
	}

	@Override
	public void render(float tickDelta) {
		if (count == 0 || mc.level == null || mc.player == null) {
			return;
		}
		long now = System.currentTimeMillis();
		int life = lifetime.get();
		float width = (float) lineWidth.get();
		for (int i = 0; i < count; i++) {
			Marker marker = markers[i];
			if (marker == null) {
				continue;
			}
			float progress = (now - marker.time) / (float) life;
			if (progress < 0f) {
				progress = 0f;
			}
			if (progress >= 1f) {
				// tick() removes these by age; skipping keeps the frame free of ghosts.
				continue;
			}
			double grow = 0.25 + progress * 0.75;
			int alpha = (int) ((1f - progress) * 255f);
			int color = colors[marker.kind.ordinal()].opaque();
			GizmoStyle style = GizmoStyle.stroke((alpha << 24) | (color & 0x00FFFFFF), width);
			// setAlwaysOnTop is what draws this through terrain.
			Gizmos.cuboid(new AABB(marker.x - grow, marker.y - grow, marker.z - grow,
					marker.x + grow, marker.y + grow, marker.z + grow), style).setAlwaysOnTop();
		}
	}
}
