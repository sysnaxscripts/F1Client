package dev.f1client.module.impl;

import dev.f1client.module.Category;
import dev.f1client.module.Module;
import dev.f1client.world.OreCache;
import dev.f1client.ore.OreType;
import dev.f1client.setting.BoolSetting;
import dev.f1client.setting.ColorSetting;
import dev.f1client.setting.DoubleSetting;
import dev.f1client.setting.IntSetting;
import dev.f1client.setting.Setting;
import java.util.Arrays;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.DrawStyle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.debug.gizmo.GizmoDrawing;
import org.joml.Vector3fc;

/**
 * Block ESP for ores.
 *
 * <p>Ore positions come from {@link OreCache}, which scans chunks as they load and follows
 * single block changes. A draw list (nearest ores, sorted far to near) is rebuilt only
 * when the cache, the settings or the viewer position change; the per-frame work is one
 * pass over that list. Boxes and tracers are submitted as see-through world gizmos, so
 * they are depth-sorted by the game and visible through walls.
 */
public final class OreDetection extends Module {
	private static final OreType[] ORES = OreType.all();
	private static final long SCAN_BUDGET_NANOS = 1_500_000L;
	private static final int REBUILD_INTERVAL_TICKS = 10;
	private static final double REBUILD_MOVE_DISTANCE = 2.0;
	private static final int MAX_HIGHLIGHTS = 64;

	private final BoolSetting outline = add(new BoolSetting("Outline", true).describe("Draw box edges."));
	private final BoolSetting filled = add(new BoolSetting("Filled", true).describe("Draw translucent box faces."));
	private final BoolSetting tracers = add(new BoolSetting("Tracers", false).describe("Draw a line from the crosshair to each ore."));
	private final DoubleSetting lineWidth = add(new DoubleSetting("Line width", 2.0, 0.5, 6.0, 0.5));
	private final IntSetting fillAlpha = add(new IntSetting("Fill alpha", 40, 0, 255, 5));
	private final IntSetting maxDistance = add(new IntSetting("Max distance", 64, 8, 256, 4)
			.describe("Ores further away than this are not drawn."));
	private final IntSetting minY = add(new IntSetting("Min Y", -64, -64, 320));
	private final IntSetting maxY = add(new IntSetting("Max Y", 320, -64, 320));
	private final BoolSetting onlyExposed = add(new BoolSetting("Only exposed ores", false)
			.describe("Show only ores that touch a non-solid block."));
	private final BoolSetting skipInView = add(new BoolSetting("Skip ores in view frustum", false)
			.describe("Hide highlights for ores inside the camera's field of view."));
	private final IntSetting maxBoxes = add(new IntSetting("Max boxes", 256, 16, 2048, 16)
			.describe("Upper bound on highlights drawn per frame (nearest first)."));

	private final BoolSetting[] oreEnabled = new BoolSetting[ORES.length];
	private final ColorSetting[] oreColor = new ColorSetting[ORES.length];
	private final IntSetting[] oreDistance = new IntSetting[ORES.length];

	private final OreCache cache = new OreCache();
	private final OreCache.Visitor collector = this::collect;
	private final BlockPos.Mutable probe = new BlockPos.Mutable();
	private final DrawStyle[] styles = new DrawStyle[ORES.length];
	private final int[] counts = new int[ORES.length];
	private final int[] shownCounts = new int[ORES.length];
	private final String[] countLabels = new String[ORES.length];

	private long[] candidateKeys = new long[1024];
	private long[] candidatePos = new long[1024];
	private byte[] candidateOre = new byte[1024];
	private int candidates;
	private Box[] boxes = new Box[0];
	private Vec3d[] centers = new Vec3d[0];
	private byte[] boxOre = new byte[0];
	private int boxCount;
	private int submitted;

	private final long[] highlightPos = new long[MAX_HIGHLIGHTS];
	private final byte[] highlightOre = new byte[MAX_HIGHLIGHTS];
	private final long[] highlightStart = new long[MAX_HIGHLIGHTS];
	private final long[] highlightEnd = new long[MAX_HIGHLIGHTS];
	private final Box[] highlightBox = new Box[MAX_HIGHLIGHTS];
	private int highlightCount;

	private int builtVersion = -1;
	private boolean stylesDirty = true;
	private boolean listDirty = true;
	private int ticksSinceBuild;
	private double builtX;
	private double builtY;
	private double builtZ;
	private double viewX;
	private double viewY;
	private double viewZ;
	private ClientWorld viewWorld;

	public OreDetection() {
		super("OreDetection", "Highlights ores through walls with boxes and tracers.", Category.WORLD);
		for (int i = 0; i < ORES.length; i++) {
			OreType ore = ORES[i];
			oreEnabled[i] = add(new BoolSetting(ore.label(), true).group(ore.label()));
			oreColor[i] = add(new ColorSetting(ore.label() + " color", ore.defaultColor()).group(ore.label()));
			oreDistance[i] = add(new IntSetting(ore.label() + " range", 0, 0, 256, 4).group(ore.label())
					.describe("Max distance for this ore; 0 uses the global max distance."));
		}
	}

	/** @return the configured highlight colour of an ore (ARGB). */
	public int colorOf(OreType ore) {
		return oreColor[ore.ordinal()].get();
	}

	/** @return how many ores of this type are currently in range. */
	/** @return how many ores were handed to the renderer in the most recent frame. */
	public int submittedLastFrame() {
		return submitted;
	}

	public int countInRange(OreType ore) {
		return counts[ore.ordinal()];
	}

	/**
	 * @return the HUD line for an ore, e.g. {@code "Diamonds: 12 in range"}; the string is
	 *         rebuilt only when the count changes
	 */
	public String countLabel(OreType ore) {
		int index = ore.ordinal();
		if (countLabels[index] == null || shownCounts[index] != counts[index]) {
			shownCounts[index] = counts[index];
			countLabels[index] = ore.plural() + ": " + counts[index] + " in range";
		}
		return countLabels[index];
	}

	/** @return the ore index, shared with SoundDetection for block resolution. */
	public OreCache cache() {
		return cache;
	}

	/**
	 * Adds a temporary highlight that fades out, used by SoundDetection for detections.
	 *
	 * @param durationMs how long the box stays visible
	 */
	public void pushHighlight(int x, int y, int z, OreType ore, long durationMs) {
		long now = System.currentTimeMillis();
		long pos = BlockPos.asLong(x, y, z);
		int slot = -1;
		for (int i = 0; i < highlightCount; i++) {
			if (highlightPos[i] == pos) {
				slot = i;
				break;
			}
		}
		if (slot < 0) {
			if (highlightCount == MAX_HIGHLIGHTS) {
				removeHighlight(0);
			}
			slot = highlightCount++;
			highlightBox[slot] = new Box(x, y, z, x + 1, y + 1, z + 1).expand(0.02);
		}
		highlightPos[slot] = pos;
		highlightOre[slot] = (byte) ore.ordinal();
		highlightStart[slot] = now;
		highlightEnd[slot] = now + Math.max(1, durationMs);
	}

	/** Forgets all temporary highlights. */
	public void clearHighlights() {
		highlightCount = 0;
	}

	/** Chunk finished loading: queue it for scanning. */
	public void onChunkLoad(int chunkX, int chunkZ) {
		if (isEnabled()) {
			cache.queueChunk(chunkX, chunkZ);
		}
	}

	/** Chunk unloaded: evict its entries. */
	public void onChunkUnload(int chunkX, int chunkZ) {
		cache.removeChunk(chunkX, chunkZ);
	}

	/** A block changed on the client: update the index incrementally. */
	public void onBlockUpdate(BlockPos pos, BlockState newState) {
		if (isEnabled()) {
			cache.onBlockUpdate(pos, newState);
		}
	}

	@Override
	protected void onEnable() {
		MinecraftClient client = MinecraftClient.getInstance();
		cache.clear();
		if (client.world != null && client.player != null) {
			int radius = client.options.getClampedViewDistance() + 1;
			cache.queueAround(client.world, client.player.getBlockX() >> 4, client.player.getBlockZ() >> 4, radius);
		}
		listDirty = true;
		stylesDirty = true;
	}

	@Override
	protected void onDisable() {
		cache.clear();
		boxCount = 0;
		submitted = 0;
		Arrays.fill(counts, 0);
	}

	@Override
	public void onWorldChange() {
		cache.clear();
		boxCount = 0;
		highlightCount = 0;
		Arrays.fill(counts, 0);
		listDirty = true;
	}

	@Override
	protected void onSettingChanged(Setting<?> setting) {
		stylesDirty = true;
		listDirty = true;
	}

	@Override
	public void onTick() {
		MinecraftClient client = MinecraftClient.getInstance();
		if (client.world == null || client.player == null) {
			return;
		}
		Vec3d eye = client.gameRenderer.getCamera().getCameraPos();
		cache.scanPending(client.world, client.player.getBlockX() >> 4, client.player.getBlockZ() >> 4, SCAN_BUDGET_NANOS);
		ticksSinceBuild++;
		double dx = eye.x - builtX;
		double dy = eye.y - builtY;
		double dz = eye.z - builtZ;
		boolean moved = dx * dx + dy * dy + dz * dz >= REBUILD_MOVE_DISTANCE * REBUILD_MOVE_DISTANCE;
		boolean changed = cache.version() != builtVersion;
		if (listDirty || ((moved || changed) && ticksSinceBuild >= REBUILD_INTERVAL_TICKS)) {
			rebuild(client.world, eye);
		}
	}

	private void rebuild(ClientWorld world, Vec3d eye) {
		listDirty = false;
		ticksSinceBuild = 0;
		builtVersion = cache.version();
		builtX = eye.x;
		builtY = eye.y;
		builtZ = eye.z;
		viewX = eye.x;
		viewY = eye.y;
		viewZ = eye.z;
		viewWorld = world;
		candidates = 0;
		Arrays.fill(counts, 0);
		double reach = maxDistance.get();
		for (int i = 0; i < ORES.length; i++) {
			if (oreEnabled[i].get() && oreDistance[i].get() > reach) {
				reach = oreDistance[i].get();
			}
		}
		cache.forEachNear(eye.x, eye.z, reach, collector);
		viewWorld = null;

		Arrays.sort(candidateKeys, 0, candidates);
		int keep = Math.min(candidates, maxBoxes.get());
		if (boxes.length < keep) {
			boxes = new Box[keep];
			centers = new Vec3d[keep];
			boxOre = new byte[keep];
		}
		for (int i = 0; i < keep; i++) {
			int index = (int) candidateKeys[keep - 1 - i];
			long pos = candidatePos[index];
			int x = BlockPos.unpackLongX(pos);
			int y = BlockPos.unpackLongY(pos);
			int z = BlockPos.unpackLongZ(pos);
			boxes[i] = new Box(x, y, z, x + 1, y + 1, z + 1);
			centers[i] = new Vec3d(x + 0.5, y + 0.5, z + 0.5);
			boxOre[i] = candidateOre[index];
		}
		boxCount = keep;
	}

	/** Cache visitor: applies the filters and records a draw candidate. */
	private void collect(int x, int y, int z, OreType ore) {
		int index = ore.ordinal();
		if (!oreEnabled[index].get() || y < minY.get() || y > maxY.get()) {
			return;
		}
		double dx = x + 0.5 - viewX;
		double dy = y + 0.5 - viewY;
		double dz = z + 0.5 - viewZ;
		double distanceSq = dx * dx + dy * dy + dz * dz;
		int range = oreDistance[index].get() > 0 ? oreDistance[index].get() : maxDistance.get();
		if (distanceSq > (double) range * range) {
			return;
		}
		if (onlyExposed.get() && !isExposed(x, y, z)) {
			return;
		}
		counts[index]++;
		if (candidates == candidateKeys.length) {
			candidateKeys = Arrays.copyOf(candidateKeys, candidates * 2);
			candidatePos = Arrays.copyOf(candidatePos, candidates * 2);
			candidateOre = Arrays.copyOf(candidateOre, candidates * 2);
		}
		candidateKeys[candidates] = ((long) Float.floatToIntBits((float) distanceSq) << 32) | candidates;
		candidatePos[candidates] = BlockPos.asLong(x, y, z);
		candidateOre[candidates] = (byte) index;
		candidates++;
	}

	private boolean isExposed(int x, int y, int z) {
		return open(x + 1, y, z) || open(x - 1, y, z) || open(x, y + 1, z) || open(x, y - 1, z)
				|| open(x, y, z + 1) || open(x, y, z - 1);
	}

	private boolean open(int x, int y, int z) {
		if (!viewWorld.isChunkLoaded(x >> 4, z >> 4)) {
			return false;
		}
		return !viewWorld.getBlockState(probe.set(x, y, z)).isOpaqueFullCube();
	}

	@Override
	public void onRender(float tickDelta) {
		MinecraftClient client = MinecraftClient.getInstance();
		if (client.world == null) {
			return;
		}
		if (stylesDirty) {
			rebuildStyles();
		}
		Camera camera = client.gameRenderer.getCamera();
		Vec3d eye = camera.getCameraPos();
		Vector3fc forward = camera.getHorizontalPlane();
		boolean boxesOn = outline.get() || filled.get();
		boolean tracersOn = tracers.get() && boxCount > 0;
		boolean skip = skipInView.get();
		Vec3d tracerStart = tracersOn
				? new Vec3d(eye.x + forward.x() * 0.6, eye.y + forward.y() * 0.6, eye.z + forward.z() * 0.6)
				: null;
		float width = lineWidth.get().floatValue();
		double tanVertical = 0;
		double tanHorizontal = 0;
		Vector3fc up = null;
		Vector3fc side = null;
		if (skip) {
			up = camera.getVerticalPlane();
			side = camera.getDiagonalPlane();
			tanVertical = Math.tan(Math.toRadians(client.options.getFov().getValue()) / 2.0);
			tanHorizontal = tanVertical * client.getWindow().getFramebufferWidth()
					/ Math.max(1, client.getWindow().getFramebufferHeight());
		}
		int drawn = 0;
		for (int i = 0; i < boxCount; i++) {
			Vec3d center = centers[i];
			if (skip && inFrustum(center, eye, forward, up, side, tanHorizontal, tanVertical)) {
				continue;
			}
			drawn++;
			int ore = boxOre[i];
			if (boxesOn) {
				GizmoDrawing.box(boxes[i], styles[ore]).ignoreOcclusion();
			}
			if (tracersOn) {
				GizmoDrawing.line(tracerStart, center, oreColor[ore].get() | 0xFF000000, width).ignoreOcclusion();
			}
		}
		submitted = drawn;
		renderHighlights();
	}

	/**
	 * Draws the temporary fading highlights. Called from {@link #onRender} while this
	 * module is enabled, and by SoundDetection while it is not.
	 */
	public void renderHighlights() {
		if (highlightCount == 0) {
			return;
		}
		long now = System.currentTimeMillis();
		float width = lineWidth.get().floatValue() + 1f;
		for (int i = highlightCount - 1; i >= 0; i--) {
			if (now >= highlightEnd[i]) {
				removeHighlight(i);
				continue;
			}
			float life = 1f - (now - highlightStart[i]) / (float) (highlightEnd[i] - highlightStart[i]);
			int rgb = oreColor[highlightOre[i]].get() & 0xFFFFFF;
			int stroke = (Math.round(255 * life) << 24) | rgb;
			int fill = (Math.round(110 * life) << 24) | rgb;
			GizmoDrawing.box(highlightBox[i], DrawStyle.filledAndStroked(stroke, width, fill)).ignoreOcclusion();
		}
	}

	private void removeHighlight(int index) {
		int last = --highlightCount;
		highlightPos[index] = highlightPos[last];
		highlightOre[index] = highlightOre[last];
		highlightStart[index] = highlightStart[last];
		highlightEnd[index] = highlightEnd[last];
		highlightBox[index] = highlightBox[last];
		highlightBox[last] = null;
	}

	private void rebuildStyles() {
		stylesDirty = false;
		float width = lineWidth.get().floatValue();
		for (int i = 0; i < ORES.length; i++) {
			int rgb = oreColor[i].get() & 0xFFFFFF;
			int stroke = 0xFF000000 | rgb;
			int fill = (fillAlpha.get() << 24) | rgb;
			if (outline.get() && filled.get()) {
				styles[i] = DrawStyle.filledAndStroked(stroke, width, fill);
			} else if (filled.get()) {
				styles[i] = DrawStyle.filled(fill);
			} else {
				styles[i] = DrawStyle.stroked(stroke, width);
			}
		}
	}

	private static boolean inFrustum(Vec3d point, Vec3d eye, Vector3fc forward, Vector3fc up, Vector3fc side,
			double tanHorizontal, double tanVertical) {
		double dx = point.x - eye.x;
		double dy = point.y - eye.y;
		double dz = point.z - eye.z;
		double depth = dx * forward.x() + dy * forward.y() + dz * forward.z();
		if (depth <= 0.1) {
			return false;
		}
		double horizontal = Math.abs(dx * side.x() + dy * side.y() + dz * side.z());
		double vertical = Math.abs(dx * up.x() + dy * up.y() + dz * up.z());
		return horizontal <= depth * tanHorizontal + 0.9 && vertical <= depth * tanVertical + 0.9;
	}
}
