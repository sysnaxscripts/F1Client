package com.example.f1.modules;

import com.example.f1.Category;
import com.example.f1.Module;
import com.example.f1.ore.OreType;
import com.example.f1.setting.BoolSetting;
import com.example.f1.setting.ColorSetting;
import com.example.f1.setting.DoubleSetting;
import com.example.f1.setting.IntSetting;
import com.example.f1.setting.Setting;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.gizmos.GizmoStyle;
import net.minecraft.gizmos.Gizmos;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.lwjgl.glfw.GLFW;

/**
 * Ore ESP (default key F7): highlights ore blocks through terrain, one colour per ore.
 *
 * <p>Ores are collected into a position-to-type map instead of being looked up per frame.
 * The map is filled by a full rescan of the chunks around the player every so many ticks;
 * nothing else maintains it, so there is no block-update hook, no block entity per ore and
 * no worker thread. Which blocks are collected is decided by a lookup map that is rebuilt
 * whenever an ore switch changes, so the scan itself stays one identity hash per block.
 *
 * <p>Shapes go through the game's gizmo pass with always-on-top set per shape, which is
 * what makes them visible through walls. There is deliberately no raycast, {@code canSee}
 * or any other line-of-sight test here: on 1.21.9+ the depth state is baked into the render
 * pipeline, so {@code RenderSystem.disableDepthTest()} would not help either.
 *
 * <p>The Y window is inclusive and reaches from {@value #MIN_Y} to {@value #MAX_Y}, so a
 * scan goes down to bedrock and up past the highest stone in the Overworld.
 */
public final class OreESP extends Module {
	/** Inclusive Y window. -64 reaches bedrock in the Overworld, 320 covers the world height. */
	private static final int MIN_Y = -64;
	private static final int MAX_Y = 320;
	/** Ore types, indexed by ordinal. */
	private static final OreType[] TYPES = OreType.all();

	private final IntSetting range = add(new IntSetting("Range", 64, 8, 128, 4)
			.describe("Blocks from your eyes an ore is still drawn for.")
			.group("Detection"));
	private final IntSetting rescan = add(new IntSetting("Rescan", 40, 5, 200, 5)
			.describe("Ticks between full scans of the loaded chunks. Lower is quicker to react, higher is cheaper.")
			.group("Detection"));
	private final DoubleSetting lineWidth = add(new DoubleSetting("Line width", 2.0, 0.5, 6.0, 0.5)
			.describe("Thickness of the outline, in pixels.")
			.group("Drawing"));
	private final BoolSetting fade = add(new BoolSetting("Fade with distance", true)
			.describe("Dim an ore the further away it is, so the closest ones stand out.")
			.group("Drawing"));

	private final BoolSetting[] shown = new BoolSetting[TYPES.length];
	private final ColorSetting[] colors = new ColorSetting[TYPES.length];
	/** Block to ore type, holding only the ores that are switched on. */
	private final Map<Block, OreType> lookup = new Reference2ObjectOpenHashMap<>();
	/** Found positions and the type each one is, cleared on every rescan cycle. */
	private final Map<BlockPos, OreType> found = new Object2ObjectOpenHashMap<>();
	/** Live counts per type, for the HUD. */
	private final Map<OreType, Integer> counts = new EnumMap<>(OreType.class);
	private final BlockPos.MutableBlockPos cursor = new BlockPos.MutableBlockPos();
	private int ticks;
	/** Hash of the dimension the cached positions belong to; 0 means "not in a world". */
	private int dimension;

	public OreESP() {
		super("OreESP", "Highlights ore blocks through terrain, in a colour per ore.", Category.WORLD,
				GLFW.GLFW_KEY_F7);
		for (OreType type : TYPES) {
			shown[type.ordinal()] = add(new BoolSetting(type.label(), type.enabledByDefault())
					.describe("Highlight " + type.label().toLowerCase(Locale.ROOT) + ".")
					.group("Ores"));
			colors[type.ordinal()] = add(new ColorSetting(type.label() + " colour", type.color())
					.group("Colours"));
		}
		rebuildLookup();
	}

	/** @return how many ore blocks are currently indexed; used by diagnostics and the HUD. */
	public int size() {
		return found.size();
	}

	/** @return how many indexed blocks are of that type. */
	public int count(OreType type) {
		Integer value = counts.get(type);
		return value == null ? 0 : value;
	}

	/** @return the colour that type is currently drawn in, opaque. */
	public int colorOf(OreType type) {
		return colors[type.ordinal()].opaque();
	}

	/** @return whether that type is switched on. */
	public boolean shows(OreType type) {
		return shown[type.ordinal()].get();
	}

	@Override
	protected void onSettingChanged(Setting<?> setting) {
		// A switch moving changes which blocks the next scan collects.
		rebuildLookup();
	}

	private void rebuildLookup() {
		lookup.clear();
		for (OreType type : TYPES) {
			if (shown[type.ordinal()].get()) {
				for (Block block : type.blocks()) {
					lookup.put(block, type);
				}
			}
		}
	}

	@Override
	protected void onEnable() {
		reset();
	}

	@Override
	protected void onDisable() {
		reset();
	}

	private void reset() {
		found.clear();
		counts.clear();
		ticks = 0;
		dimension = 0;
	}

	@Override
	public void tick() {
		ClientLevel level = mc.level;
		if (level == null || mc.player == null) {
			reset();
			return;
		}
		// Every cached position belongs to one dimension, and the Y window of the Nether
		// and the End differs from the Overworld's, so a change drops the lot.
		int current = level.dimension().hashCode();
		if (dimension == 0) {
			dimension = current;
		} else if (dimension != current) {
			reset();
			dimension = current;
		}
		// Scan on the first tick after enabling so the ESP is not empty for two seconds.
		if (ticks++ % rescan.get() != 0) {
			return;
		}
		scan(level);
	}

	private void scan(ClientLevel level) {
		found.clear();
		counts.clear();
		if (lookup.isEmpty()) {
			return;
		}
		int radius = (range.get() >> 4) + 1;
		int centerX = mc.player.getBlockX() >> 4;
		int centerZ = mc.player.getBlockZ() >> 4;
		for (int x = centerX - radius; x <= centerX + radius; x++) {
			for (int z = centerZ - radius; z <= centerZ + radius; z++) {
				if (!level.hasChunk(x, z)) {
					continue;
				}
				scanChunk(level, level.getChunk(x, z));
			}
		}
	}

	private void scanChunk(ClientLevel level, LevelChunk chunk) {
		if (chunk == null) {
			return;
		}
		int bottom = Math.max(MIN_Y, level.getMinY());
		int top = Math.min(MAX_Y, level.getMaxY());
		ChunkPos pos = chunk.getPos();
		int baseX = pos.getMinBlockX();
		int baseZ = pos.getMinBlockZ();
		Heightmap heightmap = chunk.getOrCreateHeightmapUnprimed(Heightmap.Types.WORLD_SURFACE);
		for (int lx = 0; lx < 16; lx++) {
			for (int lz = 0; lz < 16; lz++) {
				// Ore never generates above the surface, so the heightmap caps the column.
				int highest = Math.min(top, heightmap.getFirstAvailable(lx, lz));
				for (int y = bottom; y < highest; y++) {
					BlockState state = chunk.getBlockState(cursor.set(baseX + lx, y, baseZ + lz));
					OreType type = lookup.get(state.getBlock());
					if (type != null) {
						found.put(cursor.immutable(), type);
					}
				}
			}
		}
		for (Map.Entry<BlockPos, OreType> entry : found.entrySet()) {
			counts.merge(entry.getValue(), 1, Integer::sum);
		}
	}

	@Override
	public void render(float tickDelta) {
		if (found.isEmpty() || mc.level == null || mc.player == null) {
			return;
		}
		Vec3 eye = mc.player.getEyePosition();
		int maxRange = range.get();
		double maxDistanceSq = (double) maxRange * maxRange;
		float width = (float) lineWidth.get();
		boolean fadeWithDistance = fade.get();
		// Without fading the style depends on the ore alone, so one per type is reused for
		// every block of that ore instead of being rebuilt per block.
		GizmoStyle[] shared = fadeWithDistance ? null : new GizmoStyle[TYPES.length];
		for (Map.Entry<BlockPos, OreType> entry : found.entrySet()) {
			BlockPos pos = entry.getKey();
			if (pos.getY() < MIN_Y || pos.getY() > MAX_Y) {
				continue;
			}
			double dx = pos.getX() + 0.5 - eye.x;
			double dy = pos.getY() + 0.5 - eye.y;
			double dz = pos.getZ() + 0.5 - eye.z;
			double distanceSq = dx * dx + dy * dy + dz * dz;
			if (distanceSq > maxDistanceSq) {
				continue;
			}
			OreType type = entry.getValue();
			GizmoStyle style;
			if (shared == null) {
				style = GizmoStyle.stroke(
						alphaFor(colors[type.ordinal()].opaque(), distanceSq, maxDistanceSq), width);
			} else {
				style = shared[type.ordinal()];
				if (style == null) {
					style = GizmoStyle.stroke(colors[type.ordinal()].opaque(), width);
					shared[type.ordinal()] = style;
				}
			}
			// setAlwaysOnTop is what draws this through terrain.
			Gizmos.cuboid(new AABB(pos), style).setAlwaysOnTop();
		}
	}

	/** @return the colour dimmed towards the far end of the range. */
	private static int alphaFor(int color, double distanceSq, double maxDistanceSq) {
		float t = (float) Math.sqrt(distanceSq / maxDistanceSq);
		int alpha = Math.round(255f * (1f - 0.55f * Math.max(0f, Math.min(1f, t))));
		return (alpha << 24) | (color & 0x00FFFFFF);
	}
}
