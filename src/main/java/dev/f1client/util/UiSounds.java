package dev.f1client.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.sound.SoundEvents;

/** Short local sound cues. They play on this client only. */
public final class UiSounds {
	private static boolean enabled = true;

	private UiSounds() {
	}

	/** Turns interface cues on or off (alert beeps are controlled by their own setting). */
	public static void setEnabled(boolean value) {
		enabled = value;
	}

	/** Soft click for buttons and toggles. */
	public static void click() {
		if (enabled) {
			MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance.ui(SoundEvents.UI_BUTTON_CLICK, 1.0f));
		}
	}

	/** Cue for a module switching on or off; higher pitch for on. */
	public static void toggle(boolean on) {
		if (enabled) {
			MinecraftClient.getInstance().getSoundManager()
					.play(PositionedSoundInstance.ui(SoundEvents.UI_BUTTON_CLICK, on ? 1.25f : 0.85f));
		}
	}

	/**
	 * Alert beep.
	 *
	 * @param pitch playback pitch, 0.5..2.0
	 */
	public static void beep(float pitch) {
		MinecraftClient.getInstance().getSoundManager()
				.play(PositionedSoundInstance.ui(SoundEvents.BLOCK_NOTE_BLOCK_PLING, Math.max(0.5f, Math.min(2.0f, pitch))));
	}
}
