package dev.f1client.ore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The ores OreDetection and SoundDetection know about.
 *
 * <p>Each ore lists the exact block registry IDs it covers; nothing is matched by
 * substring. Iron, redstone, lapis and copper include their deepslate variants, while
 * diamond, emerald, gold and coal keep stone and deepslate apart as separate entries.
 *
 * <p>Constants are append-only: {@link #ordinal()} is stored as a byte in the ore cache and
 * in the sound resolver's removal history, and settings are persisted by
 * {@link #label()}, so inserting a constant in the middle would re-colour existing
 * profiles.
 */
public enum OreType {
	DIAMOND("diamond", "Diamond", "Diamonds", 0xFF4AEDD9, "minecraft:diamond_ore"),
	DEEPSLATE_DIAMOND("deepslate_diamond", "Deepslate Diamond", "Deepslate Diamonds", 0xFF2BB8E6,
			"minecraft:deepslate_diamond_ore"),
	ANCIENT_DEBRIS("ancient_debris", "Ancient Debris", "Ancient Debris", 0xFFC98A5E, "minecraft:ancient_debris"),
	EMERALD("emerald", "Emerald", "Emeralds", 0xFF17DD62, "minecraft:emerald_ore"),
	DEEPSLATE_EMERALD("deepslate_emerald", "Deepslate Emerald", "Deepslate Emeralds", 0xFF0FB07A,
			"minecraft:deepslate_emerald_ore"),
	GOLD("gold", "Gold", "Gold", 0xFFFCEE4B, "minecraft:gold_ore"),
	DEEPSLATE_GOLD("deepslate_gold", "Deepslate Gold", "Deepslate Gold", 0xFFE8B62C, "minecraft:deepslate_gold_ore"),
	IRON("iron", "Iron", "Iron", 0xFFD8AF93, "minecraft:iron_ore", "minecraft:deepslate_iron_ore"),
	REDSTONE("redstone", "Redstone", "Redstone", 0xFFFF3B30, "minecraft:redstone_ore",
			"minecraft:deepslate_redstone_ore"),
	LAPIS("lapis", "Lapis", "Lapis", 0xFF3F6BFF, "minecraft:lapis_ore", "minecraft:deepslate_lapis_ore"),
	NETHER_GOLD("nether_gold", "Nether Gold", "Nether Gold", 0xFFFFB02E, "minecraft:nether_gold_ore"),
	NETHER_QUARTZ("nether_quartz", "Nether Quartz", "Nether Quartz", 0xFFEDE6DA, "minecraft:nether_quartz_ore"),
	COPPER("copper", "Copper", "Copper", 0xFFE77C56, "minecraft:copper_ore", "minecraft:deepslate_copper_ore"),
	COAL("coal", "Coal", "Coal", 0xFF54585E, "minecraft:coal_ore"),
	DEEPSLATE_COAL("deepslate_coal", "Deepslate Coal", "Deepslate Coal", 0xFF383B42, "minecraft:deepslate_coal_ore");

	private static final OreType[] VALUES = values();
	private static final Map<String, OreType> BY_BLOCK = new HashMap<>();
	private static final Map<String, OreType> BY_ID = new HashMap<>();

	static {
		for (OreType ore : VALUES) {
			BY_ID.put(ore.id, ore);
			for (String block : ore.blockIds) {
				BY_BLOCK.put(block, ore);
			}
		}
	}

	private final String id;
	private final String label;
	private final String plural;
	private final int defaultColor;
	private final List<String> blockIds;

	OreType(String id, String label, String plural, int defaultColor, String... blockIds) {
		this.id = id;
		this.label = label;
		this.plural = plural;
		this.defaultColor = defaultColor;
		this.blockIds = List.of(blockIds);
	}

	/** @return stable identifier used in config and the sound table. */
	public String id() {
		return id;
	}

	/** @return singular display name, e.g. "Deepslate Diamond". */
	public String label() {
		return label;
	}

	/** @return name used in count readouts, e.g. "Diamonds". */
	public String plural() {
		return plural;
	}

	/** @return default highlight colour (opaque ARGB). */
	public int defaultColor() {
		return defaultColor;
	}

	/** @return exact block registry IDs covered by this ore. */
	public List<String> blockIds() {
		return blockIds;
	}

	/** @return the constants without the defensive copy made by {@link #values()}. */
	public static OreType[] all() {
		return VALUES;
	}

	/** @return the ore covering that exact block registry ID, or {@code null}. */
	public static OreType fromBlockId(String blockId) {
		return blockId == null ? null : BY_BLOCK.get(blockId);
	}

	/** @return the ore with that identifier, or {@code null}. */
	public static OreType fromId(String id) {
		return id == null ? null : BY_ID.get(id);
	}
}
