package dev.f1client.setting;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

/**
 * Keyboard binding stored as a GLFW key code, {@link #UNBOUND} when empty.
 *
 * <p>Drawn as a "press a key" button; Escape or Backspace clears it while listening.
 */
public final class KeybindSetting extends Setting<Integer> {
	/** Sentinel for "no key" (matches {@code GLFW_KEY_UNKNOWN}). */
	public static final int UNBOUND = -1;

	public KeybindSetting(String name, int defaultKey) {
		super(name, defaultKey);
	}

	/** @return whether a key is assigned. */
	public boolean isBound() {
		return get() != UNBOUND;
	}

	/** @return whether the given GLFW key code triggers this binding. */
	public boolean matches(int keyCode) {
		return isBound() && get() == keyCode;
	}

	@Override
	protected Integer sanitize(Integer candidate) {
		return candidate == null || candidate < 0 ? UNBOUND : candidate;
	}

	@Override
	public JsonElement toJson() {
		return new JsonPrimitive(get());
	}

	@Override
	public void fromJson(JsonElement json) {
		if (json != null && json.isJsonPrimitive() && json.getAsJsonPrimitive().isNumber()) {
			set(json.getAsInt());
		}
	}
}
