package dev.f1client.sound;

import dev.f1client.ore.OreType;
import java.util.Set;

/** Maps a sound origin to the real ore block behind it. Implemented against the client world. */
public interface BlockResolver {
	/**
	 * A resolved block.
	 *
	 * @param ore    the ore found
	 * @param x      block X
	 * @param y      block Y
	 * @param z      block Z
	 * @param offset distance from the sound origin to the block centre
	 */
	record Resolution(OreType ore, int x, int y, int z, double offset) {
	}

	/**
	 * Searches around a sound origin for the nearest block matching the classified ores.
	 *
	 * <p>For {@link SoundAction#BREAK} an implementation must only accept a block that
	 * sits at the origin itself or an ore that disappeared moments ago; an intact ore
	 * next to the origin is not the block that broke.
	 *
	 * @param candidates ores the sound may belong to
	 * @param action     what the sound means
	 * @param x          origin X
	 * @param y          origin Y
	 * @param z          origin Z
	 * @param radius     search radius in blocks
	 * @return the nearest match, or {@code null} when nothing matches
	 */
	Resolution resolve(Set<OreType> candidates, SoundAction action, double x, double y, double z, double radius);
}
