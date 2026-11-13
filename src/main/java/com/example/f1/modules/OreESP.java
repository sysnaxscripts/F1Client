package com.example.f1.modules;

import com.example.f1.Module;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Set;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.debug.gizmo.DrawStyle;
import net.minecraft.world.debug.gizmo.GizmoDrawing;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.lwjgl.glfw.GLFW;

/**
 * Ore ESP (default key F7): highlights ore blocks through terrain.
 *
 * <p>Ores are collected into a {@link BlockPos} set instead of being looked up per frame.
 * The set is filled by a full rescan of the chunks around the player every
 * {@value #RESCAN_TICKS} ticks; nothing else maintains it, so there is no block-update
 * hook, no block entity per ore and no worker thread.
 *
 * <p>Shapes go through the Fabric gizmo pass with always-on-top set, which is what makes
 * them visible through walls. There is deliberately no raycast, {@code canSee} or any
 * other line-of-sight test here: on 1.21.9+ depth state is baked into the render pipeline,
 * so {@code RenderSystem.disableDepthTest()} would not help either.
 */
public final class OreESP extends Module {
	// --- tunables (no settings GUI; change and rebuild) ---
	/**
	 * Blocks to highlight. Add {@code Blocks.COAL_ORE} / {@code Blocks.DEEPSLATE_COAL_ORE}
	 * for coal. A reference set because the scan calls {@code contains} once per block in
	 * every column it visits: identity hashing keeps that O(1) instead of a linear walk.
	 */
	private static final Set<Block> ORE_BLOCKS = new ReferenceOpenHashSet<>(Set.of(
			Blocks.DIAMOND_ORE, Blocks.DEEPSLATE_DIAMOND_ORE,
			Blocks.EMERALD_ORE, Blocks.DEEPSLATE_EMERALD_ORE,
			Blocks.ANCIENT_DEBRIS,
			Blocks.GOLD_ORE, Blocks.DEEPSLATE_GOLD_ORE,
			Blocks.REDSTONE_ORE, Blocks.DEEPSLATE_REDSTONE_ORE,
			Blocks.LAPIS_ORE, Blocks.DEEPSLATE_LAPIS_ORE));
	/** Highlight colour, RGB; drawn opaque. */
	private static final int COLOR = 0x35E0D0;
	/** Outline width in pixels. */
	private static final float LINE_WIDTH = 2.0f;
	/** Render range in blocks from the eye position. */
	private static final int RANGE = 64;
	/** Inclusive Y window. -64 reaches bedrock in the Overworld, 320 covers the world height. */
	private static final int MIN_Y = -64;
	private static final int MAX_Y = 320;
	/** Ticks between full rescans of the loaded chunks. */
	private static final int RESCAN_TICKS = 40;

	private final ObjectOpenHashSet<BlockPos> found = new ObjectOpenHashSet<>();
	private final BlockPos.MutableBlockPos mp = new BlockPos.MutableBlockPos();
	private int ticks;
	/** Hash of the dimension the cached positions belong to; 0 means "not in a world". */
	private int dimension;

	public OreESP() {
		super("OreESP", GLFW.GLFW_KEY_F7);
	}

	/** @return how many ore blocks are currently indexed (diagnostics). */
	public int size() {
		return found.size();
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
		// Scan on the first tick after enabling so the ESP is not empty for 2 seconds.
		if (ticks++ % RESCAN_TICKS != 0) {
			return;
		}
		scan(level);
	}

	private void scan(ClientLevel level) {
		int radius = (RANGE >> 4) + 1;
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
					BlockState state = chunk.getBlockState(mp.set(baseX + lx, y, baseZ + lz));
					if (ORE_BLOCKS.contains(state.getBlock())) {
						found.add(mp.immutable());
					}
				}
			}
		}
	}

	@Override
	public void render(float tickDelta) {
		if (found.isEmpty() || mc.level == null || mc.player == null) {
			return;
		}
		Vec3 eye = mc.player.getEyePosition();
		double maxDistanceSq = (double) RANGE * RANGE;
		DrawStyle style = DrawStyle.stroked(COLOR | 0xFF000000, LINE_WIDTH);
		for (BlockPos pos : found) {
			if (pos.getY() < MIN_Y || pos.getY() > MAX_Y) {
				continue;
			}
			double dx = pos.getX() + 0.5 - eye.x;
			double dy = pos.getY() + 0.5 - eye.y;
			double dz = pos.getZ() + 0.5 - eye.z;
			if (dx * dx + dy * dy + dz * dz > maxDistanceSq) {
				continue;
			}
			// ignoreOcclusion is what draws this through terrain.
			GizmoDrawing.box(new AABB(pos), style).ignoreOcclusion();
		}
	}
}
