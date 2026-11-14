package com.example.f1.util;

import java.util.Optional;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

/**
 * Short local sound cues for the interface. They play on this client only: a sound
 * instance is handed to the client's own sound manager, so nothing is sent to the server
 * and no other player hears it.
 *
 * <p>The events are built from vanilla's own ids rather than pulled out of
 * {@code SoundEvents}, because that class declares some of its fields as holders and some
 * as plain events; constructing the record directly keeps the calls the same everywhere.
 */
public final class UiSounds {
	/** Vanilla's interface click. */
	private static final SoundEvent CLICK = event("ui.button.click");
	/** Vanilla's note-block pling, used for alerts. */
	private static final SoundEvent PLING = event("block.note_block.pling");

	private static boolean enabled = true;

	private UiSounds() {
	}

	/** Turns interface cues on or off. */
	public static void setEnabled(boolean value) {
		enabled = value;
	}

	/** @return whether interface cues are on. */
	public static boolean isEnabled() {
		return enabled;
	}

	/** Soft click for buttons and toggles. */
	public static void click() {
		play(1.0f);
	}

	/** Cue for a module switching on or off; higher pitch for on. */
	public static void toggle(boolean on) {
		play(on ? 1.25f : 0.85f);
	}

	/**
	 * Alert beep.
	 *
	 * @param pitch playback pitch, clamped to the 0.5..2.0 range the game accepts
	 */
	public static void beep(float pitch) {
		Minecraft.getInstance().getSoundManager()
				.play(SimpleSoundInstance.forUI(PLING, Math.max(0.5f, Math.min(2.0f, pitch))));
	}

	private static void play(float pitch) {
		if (!enabled) {
			return;
		}
		Minecraft.getInstance().getSoundManager().play(SimpleSoundInstance.forUI(CLICK, pitch));
	}

	/** @return a variable-range sound event for a vanilla id. */
	private static SoundEvent event(String path) {
		return new SoundEvent(ResourceLocation.withDefaultNamespace(path), Optional.empty());
	}
}
