package dev.f1client.sound;

/**
 * One incoming sound, normalised from whichever packet carried it.
 *
 * @param soundId         exact sound event registry ID, e.g. {@code minecraft:block.deepslate.break}
 * @param category        sound category name, e.g. {@code BLOCKS}
 * @param volume          volume as sent
 * @param pitch           pitch as sent
 * @param x               origin X (resolved from the source entity for entity-attached sounds)
 * @param y               origin Y
 * @param z               origin Z
 * @param fromLocalPlayer whether the local player caused the sound
 * @param blockHint       exact block registry ID when the packet names the block
 *                        (block-broken world event), otherwise {@code null}
 * @param timeMs          arrival time in milliseconds
 */
public record SoundSample(String soundId, String category, float volume, float pitch,
		double x, double y, double z, boolean fromLocalPlayer, String blockHint, long timeMs) {
}
