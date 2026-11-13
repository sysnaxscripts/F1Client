package dev.f1client.sound;

import dev.f1client.ore.OreType;

/**
 * One de-duplicated detection.
 *
 * @param ore        the ore that was affected
 * @param action     what happened to it
 * @param x          block X when resolved, otherwise the floored sound origin
 * @param y          block Y
 * @param z          block Z
 * @param resolved   whether the position is a real ore block (or one that just disappeared)
 * @param confidence score in {@code [0,1]}
 * @param distance   distance from the listener when the alert fired, in blocks
 * @param timeMs     detection time
 */
public record OreAlert(OreType ore, SoundAction action, int x, int y, int z, boolean resolved,
		double confidence, double distance, long timeMs) {
	/** @return coordinates as {@code "x y z"}, the form copied to the clipboard. */
	public String coordinates() {
		return x + " " + y + " " + z;
	}
}
