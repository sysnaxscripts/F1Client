package dev.f1client.world;

import dev.f1client.ore.OreType;
import dev.f1client.sound.BlockResolver;
import dev.f1client.sound.SoundAction;
import java.util.Set;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.BlockPos;

/**
 * {@link BlockResolver} backed by the client world.
 *
 * <p>For place, hit and step sounds it searches the blocks around the origin. For break
 * sounds an intact neighbouring ore is not evidence, so it first consults a short history
 * of ore blocks that just disappeared, and otherwise accepts only an ore sitting at the
 * origin itself (the block update may simply not have arrived yet).
 */
public final class WorldBlockResolver implements BlockResolver {
	private static final int HISTORY = 64;
	private static final long REMOVAL_MEMORY_MS = 1_500L;

	private final long[] removedPos = new long[HISTORY];
	private final byte[] removedOre = new byte[HISTORY];
	private final long[] removedAt = new long[HISTORY];
	private final BlockPos.Mutable probe = new BlockPos.Mutable();
	private int next;
	private int size;

	/** Records that an ore block was replaced by something else. */
	public void noteRemoved(BlockPos pos, OreType ore, long timeMs) {
		removedPos[next] = pos.asLong();
		removedOre[next] = (byte) ore.ordinal();
		removedAt[next] = timeMs;
		next = (next + 1) % HISTORY;
		if (size < HISTORY) {
			size++;
		}
	}

	/** Forgets the removal history. */
	public void clear() {
		size = 0;
		next = 0;
	}

	@Override
	public Resolution resolve(Set<OreType> candidates, SoundAction action, double x, double y, double z, double radius) {
		ClientWorld world = MinecraftClient.getInstance().world;
		if (world == null) {
			return null;
		}
		if (action == SoundAction.BREAK) {
			Resolution removed = recentlyRemoved(candidates, x, y, z, Math.max(radius, 1.0));
			return removed != null ? removed : at(world, candidates, floor(x), floor(y), floor(z), x, y, z);
		}
		Resolution best = null;
		int reach = (int) Math.ceil(radius);
		int originX = floor(x);
		int originY = floor(y);
		int originZ = floor(z);
		for (int dx = -reach; dx <= reach; dx++) {
			for (int dy = -reach; dy <= reach; dy++) {
				for (int dz = -reach; dz <= reach; dz++) {
					Resolution found = at(world, candidates, originX + dx, originY + dy, originZ + dz, x, y, z);
					if (found != null && found.offset() <= radius + 0.87 && (best == null || found.offset() < best.offset())) {
						best = found;
					}
				}
			}
		}
		return best;
	}

	private Resolution at(ClientWorld world, Set<OreType> candidates, int bx, int by, int bz, double x, double y, double z) {
		if (!world.isChunkLoaded(bx >> 4, bz >> 4)) {
			return null;
		}
		OreType ore = OreBlocks.of(world.getBlockState(probe.set(bx, by, bz)));
		if (ore == null || !candidates.contains(ore)) {
			return null;
		}
		return new Resolution(ore, bx, by, bz, distance(bx, by, bz, x, y, z));
	}

	private Resolution recentlyRemoved(Set<OreType> candidates, double x, double y, double z, double radius) {
		long now = System.currentTimeMillis();
		OreType[] ores = OreType.all();
		Resolution best = null;
		for (int i = 0; i < size; i++) {
			if (now - removedAt[i] > REMOVAL_MEMORY_MS) {
				continue;
			}
			OreType ore = ores[removedOre[i]];
			if (!candidates.contains(ore)) {
				continue;
			}
			int bx = BlockPos.unpackLongX(removedPos[i]);
			int by = BlockPos.unpackLongY(removedPos[i]);
			int bz = BlockPos.unpackLongZ(removedPos[i]);
			double offset = distance(bx, by, bz, x, y, z);
			if (offset <= radius + 0.87 && (best == null || offset < best.offset())) {
				best = new Resolution(ore, bx, by, bz, offset);
			}
		}
		return best;
	}

	private static double distance(int bx, int by, int bz, double x, double y, double z) {
		double dx = bx + 0.5 - x;
		double dy = by + 0.5 - y;
		double dz = bz + 0.5 - z;
		return Math.sqrt(dx * dx + dy * dy + dz * dz);
	}

	private static int floor(double value) {
		return (int) Math.floor(value);
	}
}
