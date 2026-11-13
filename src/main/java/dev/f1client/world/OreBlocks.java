package dev.f1client.world;

import dev.f1client.ore.OreType;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.function.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

/** Resolves game blocks to {@link OreType}s by registry identity (never by name matching). */
public final class OreBlocks {
	private static final Reference2ObjectOpenHashMap<Block, OreType> BY_BLOCK = new Reference2ObjectOpenHashMap<>();
	/** Matches any block state that is a known ore; allocation-free for palette pre-checks. */
	public static final Predicate<BlockState> IS_ORE = state -> BY_BLOCK.containsKey(state.getBlock());

	static {
		for (OreType ore : OreType.all()) {
			for (String id : ore.blockIds()) {
				Block block = Registries.BLOCK.get(Identifier.of(id));
				if (id.equals(Registries.BLOCK.getId(block).toString())) {
					BY_BLOCK.put(block, ore);
				}
			}
		}
	}

	private OreBlocks() {
	}

	/** @return the ore this block state belongs to, or {@code null}. */
	public static OreType of(BlockState state) {
		return BY_BLOCK.get(state.getBlock());
	}

	/** @return the exact registry ID of the state's block, e.g. {@code minecraft:stone}. */
	public static String idOf(BlockState state) {
		return Registries.BLOCK.getId(state.getBlock()).toString();
	}
}
