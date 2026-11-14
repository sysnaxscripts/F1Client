package com.example.f1.ore;

import java.util.Set;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

/**
 * The ores {@code OreESP} can highlight, with the blocks each one covers and the colour it
 * is drawn in by default.
 *
 * <p>Stone and deepslate variants of the same ore are one type: a player looking for
 * diamonds does not care which stone the ore sits in, and splitting them would double the
 * number of switches for no gain. Deepslate coal and nether gold are included, which is why
 * the block sets are not simply "one ore block plus its deepslate twin".
 *
 * <p>The default colour of each type is chosen to be readable against dark stone and to be
 * tellable apart at a glance; every one of them can be changed in the ClickGUI.
 */
public enum OreType {
	/** Diamond, in stone and deepslate. */
	DIAMOND("Diamond", 0xFF4AE0D9, true, Blocks.DIAMOND_ORE, Blocks.DEEPSLATE_DIAMOND_ORE),
	/** Emerald, in stone and deepslate. */
	EMERALD("Emerald", 0xFF4ADE80, true, Blocks.EMERALD_ORE, Blocks.DEEPSLATE_EMERALD_ORE),
	/** Ancient debris, the only ore worth finding in the Nether by scanning. */
	DEBRIS("Ancient Debris", 0xFFB08CFF, true, Blocks.ANCIENT_DEBRIS),
	/** Gold, including the nether variant, which generates in large clusters. */
	GOLD("Gold", 0xFFFFC66B, true, Blocks.GOLD_ORE, Blocks.DEEPSLATE_GOLD_ORE, Blocks.NETHER_GOLD_ORE),
	/** Redstone, in stone and deepslate. */
	REDSTONE("Redstone", 0xFFFF5A6E, true, Blocks.REDSTONE_ORE, Blocks.DEEPSLATE_REDSTONE_ORE),
	/** Lapis, in stone and deepslate. */
	LAPIS("Lapis", 0xFF5AA8FF, true, Blocks.LAPIS_ORE, Blocks.DEEPSLATE_LAPIS_ORE),
	/** Coal, including deepslate coal. Off by default: it is everywhere. */
	COAL("Coal", 0xFF9AA0AE, false, Blocks.COAL_ORE, Blocks.DEEPSLATE_COAL_ORE),
	/** Copper, in stone and deepslate. Off by default. */
	COPPER("Copper", 0xFFE0875A, false, Blocks.COPPER_ORE, Blocks.DEEPSLATE_COPPER_ORE),
	/** Iron, in stone and deepslate. Off by default. */
	IRON("Iron", 0xFFD8B49A, false, Blocks.IRON_ORE, Blocks.DEEPSLATE_IRON_ORE),
	/** Nether quartz. Off by default. */
	QUARTZ("Nether Quartz", 0xFFF2F3F5, false, Blocks.NETHER_QUARTZ_ORE);

	private static final OreType[] VALUES = values();

	private final String label;
	private final int color;
	private final boolean enabledByDefault;
	private final Set<Block> blocks;

	OreType(String label, int color, boolean enabledByDefault, Block... blocks) {
		this.label = label;
		this.color = color;
		this.enabledByDefault = enabledByDefault;
		this.blocks = Set.of(blocks);
	}

	/** @return the display name. */
	public String label() {
		return label;
	}

	/** @return the default highlight colour, opaque ARGB. */
	public int color() {
		return color;
	}

	/** @return whether this ore is highlighted out of the box. */
	public boolean enabledByDefault() {
		return enabledByDefault;
	}

	/** @return every block that counts as this ore. */
	public Set<Block> blocks() {
		return blocks;
	}

	/** @return the constants without the defensive copy made by {@link #values()}. */
	public static OreType[] all() {
		return VALUES;
	}

	/** @return the type a block belongs to, or {@code null} when it is not an ore here. */
	public static OreType of(Block block) {
		for (OreType type : VALUES) {
			if (type.blocks.contains(block)) {
				return type;
			}
		}
		return null;
	}
}
