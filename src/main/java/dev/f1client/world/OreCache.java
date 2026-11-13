package dev.f1client.world;

import dev.f1client.ore.OreType;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import net.minecraft.block.BlockState;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.chunk.ChunkSection;
import net.minecraft.world.chunk.WorldChunk;

/**
 * Per-chunk index of ore positions in the loaded world.
 *
 * <p>Chunks are queued when they load and scanned a few per tick within a time budget,
 * nearest first, so joining a server never stalls a frame. Single block changes update
 * the index in place, and an unloaded chunk drops its entries. Everything runs on the
 * client thread.
 */
public final class OreCache {
	/** Receives one cached ore. */
	public interface Visitor {
		void visit(int x, int y, int z, OreType ore);
	}

	private static final OreType[] ORES = OreType.all();

	private final Long2ObjectOpenHashMap<Long2ByteOpenHashMap> chunks = new Long2ObjectOpenHashMap<>();
	private final LongArrayList pending = new LongArrayList();
	private int version;

	/** @return a counter that changes whenever the cached data changes. */
	public int version() {
		return version;
	}

	/** @return number of chunks waiting to be scanned. */
	public int pendingChunks() {
		return pending.size();
	}

	/** Queues a freshly loaded chunk for scanning. */
	public void queueChunk(int chunkX, int chunkZ) {
		long key = ChunkPos.toLong(chunkX, chunkZ);
		if (!pending.contains(key)) {
			pending.add(key);
		}
	}

	/** Evicts a chunk that was unloaded. */
	public void removeChunk(int chunkX, int chunkZ) {
		long key = ChunkPos.toLong(chunkX, chunkZ);
		pending.rem(key);
		if (chunks.remove(key) != null) {
			version++;
		}
	}

	/** Drops everything, e.g. on world change. */
	public void clear() {
		chunks.clear();
		pending.clear();
		version++;
	}

	/** Queues every chunk in a square around a position; used when the module is switched on mid-session. */
	public void queueAround(ClientWorld world, int centerChunkX, int centerChunkZ, int radius) {
		for (int dx = -radius; dx <= radius; dx++) {
			for (int dz = -radius; dz <= radius; dz++) {
				if (world.isChunkLoaded(centerChunkX + dx, centerChunkZ + dz)) {
					queueChunk(centerChunkX + dx, centerChunkZ + dz);
				}
			}
		}
	}

	/**
	 * Scans queued chunks, nearest to the given chunk first, until the budget is used up.
	 * At least one chunk is scanned per call when any is queued.
	 */
	public void scanPending(ClientWorld world, int nearChunkX, int nearChunkZ, long budgetNanos) {
		long deadline = System.nanoTime() + budgetNanos;
		while (!pending.isEmpty()) {
			int best = 0;
			long bestDistance = Long.MAX_VALUE;
			for (int i = 0; i < pending.size(); i++) {
				long key = pending.getLong(i);
				long dx = ChunkPos.getPackedX(key) - nearChunkX;
				long dz = ChunkPos.getPackedZ(key) - nearChunkZ;
				long distance = dx * dx + dz * dz;
				if (distance < bestDistance) {
					bestDistance = distance;
					best = i;
				}
			}
			long key = pending.removeLong(best);
			int chunkX = ChunkPos.getPackedX(key);
			int chunkZ = ChunkPos.getPackedZ(key);
			if (world.isChunkLoaded(chunkX, chunkZ)) {
				scan(world.getChunk(chunkX, chunkZ), key);
			}
			if (System.nanoTime() >= deadline) {
				return;
			}
		}
	}

	private void scan(WorldChunk chunk, long key) {
		Long2ByteOpenHashMap found = null;
		ChunkSection[] sections = chunk.getSectionArray();
		int baseX = chunk.getPos().x << 4;
		int baseZ = chunk.getPos().z << 4;
		int bottomY = chunk.getBottomY();
		for (int index = 0; index < sections.length; index++) {
			ChunkSection section = sections[index];
			if (section == null || section.isEmpty() || !section.hasAny(OreBlocks.IS_ORE)) {
				continue;
			}
			int baseY = bottomY + (index << 4);
			for (int y = 0; y < 16; y++) {
				for (int z = 0; z < 16; z++) {
					for (int x = 0; x < 16; x++) {
						OreType ore = OreBlocks.of(section.getBlockState(x, y, z));
						if (ore != null) {
							if (found == null) {
								found = new Long2ByteOpenHashMap();
							}
							found.put(BlockPos.asLong(baseX + x, baseY + y, baseZ + z), (byte) ore.ordinal());
						}
					}
				}
			}
		}
		Long2ByteOpenHashMap previous = found == null ? chunks.remove(key) : chunks.put(key, found);
		if (found != null || previous != null) {
			version++;
		}
	}

	/** Applies one block change to the index. */
	public void onBlockUpdate(BlockPos pos, BlockState newState) {
		long chunkKey = ChunkPos.toLong(pos);
		long posKey = pos.asLong();
		Long2ByteOpenHashMap chunk = chunks.get(chunkKey);
		OreType ore = OreBlocks.of(newState);
		if (ore == null) {
			if (chunk != null && chunk.containsKey(posKey)) {
				chunk.remove(posKey);
				if (chunk.isEmpty()) {
					chunks.remove(chunkKey);
				}
			}
		} else if (!pending.contains(chunkKey)) {
			if (chunk == null) {
				chunk = new Long2ByteOpenHashMap();
				chunks.put(chunkKey, chunk);
			}
			chunk.put(posKey, (byte) ore.ordinal());
		}
		version++;
	}

	/** @return the cached ore at a position, or {@code null}. */
	public OreType get(int x, int y, int z) {
		Long2ByteOpenHashMap chunk = chunks.get(ChunkPos.toLong(x >> 4, z >> 4));
		if (chunk == null) {
			return null;
		}
		long key = BlockPos.asLong(x, y, z);
		return chunk.containsKey(key) ? ORES[chunk.get(key)] : null;
	}

	/**
	 * Visits every cached ore in chunks that intersect a square around a point.
	 *
	 * @param centerX block X of the centre
	 * @param centerZ block Z of the centre
	 * @param radius  radius in blocks
	 */
	public void forEachNear(double centerX, double centerZ, double radius, Visitor visitor) {
		int minChunkX = (int) Math.floor((centerX - radius) / 16.0);
		int maxChunkX = (int) Math.floor((centerX + radius) / 16.0);
		int minChunkZ = (int) Math.floor((centerZ - radius) / 16.0);
		int maxChunkZ = (int) Math.floor((centerZ + radius) / 16.0);
		ObjectIterator<Long2ObjectMap.Entry<Long2ByteOpenHashMap>> iterator = chunks.long2ObjectEntrySet().fastIterator();
		while (iterator.hasNext()) {
			Long2ObjectMap.Entry<Long2ByteOpenHashMap> entry = iterator.next();
			int chunkX = ChunkPos.getPackedX(entry.getLongKey());
			int chunkZ = ChunkPos.getPackedZ(entry.getLongKey());
			if (chunkX < minChunkX || chunkX > maxChunkX || chunkZ < minChunkZ || chunkZ > maxChunkZ) {
				continue;
			}
			ObjectIterator<Long2ByteMap.Entry> ores = entry.getValue().long2ByteEntrySet().fastIterator();
			while (ores.hasNext()) {
				Long2ByteMap.Entry ore = ores.next();
				long pos = ore.getLongKey();
				visitor.visit(BlockPos.unpackLongX(pos), BlockPos.unpackLongY(pos), BlockPos.unpackLongZ(pos), ORES[ore.getByteValue()]);
			}
		}
	}
}
