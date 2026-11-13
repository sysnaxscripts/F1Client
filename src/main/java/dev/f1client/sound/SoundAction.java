package dev.f1client.sound;

import java.util.Locale;

/** What a block sound says happened to the block. */
public enum SoundAction {
	BREAK("broken"),
	PLACE("placed"),
	HIT("hit"),
	STEP("stepped on");

	private final String verb;

	SoundAction(String verb) {
		this.verb = verb;
	}

	/** @return past-tense verb for alert messages. */
	public String verb() {
		return verb;
	}

	/** @return the action named in the sound table, or {@code null} for unknown names. */
	public static SoundAction fromName(String name) {
		if (name == null) {
			return null;
		}
		try {
			return valueOf(name.trim().toUpperCase(Locale.ROOT));
		} catch (IllegalArgumentException e) {
			return null;
		}
	}
}
