package com.example.f1.setting;

import com.google.gson.JsonPrimitive;
import org.lwjgl.glfw.GLFW;

/**
 * A GLFW keycode. Drawn as a button that listens for the next key press.
 *
 * <p>{@value #UNBOUND} means no key. Names come from GLFW, so a remapped layout shows the
 * label the player's keyboard actually has.
 */
public final class KeybindSetting extends Setting<Integer> {
	/** Value meaning "no key bound". */
	public static final int UNBOUND = 0;

	public KeybindSetting(String name) {
		this(name, UNBOUND);
	}

	public KeybindSetting(String name, int defaultKey) {
		super(name, defaultKey);
	}

	/** @return whether a key is bound. */
	public boolean isBound() {
		return get() != UNBOUND;
	}

	/** Unbinds the key. */
	public void unbind() {
		set(UNBOUND);
	}

	/** @return the key name to display, e.g. {@code "RIGHT SHIFT"} or {@code "None"}. */
	public String displayName() {
		return nameOf(get());
	}

	/**
	 * @return a readable name for a GLFW keycode
	 */
	public static String nameOf(int key) {
		if (key == UNBOUND) {
			return "None";
		}
		String name = GLFW.glfwGetKeyName(key, GLFW.glfwGetKeyScancode(key));
		if (name != null && !name.isBlank()) {
			return name.toUpperCase(java.util.Locale.ROOT);
		}
		// Function keys, modifiers and mouse buttons have no printable name.
		if (key >= GLFW.GLFW_KEY_F1 && key <= GLFW.GLFW_KEY_F25) {
			return "F" + (key - GLFW.GLFW_KEY_F1 + 1);
		}
		return switch (key) {
		case GLFW.GLFW_KEY_LEFT_SHIFT, GLFW.GLFW_KEY_RIGHT_SHIFT -> "SHIFT";
		case GLFW.GLFW_KEY_LEFT_CONTROL, GLFW.GLFW_KEY_RIGHT_CONTROL -> "CTRL";
		case GLFW.GLFW_KEY_LEFT_ALT, GLFW.GLFW_KEY_RIGHT_ALT -> "ALT";
		case GLFW.GLFW_KEY_LEFT_SUPER, GLFW.GLFW_KEY_RIGHT_SUPER -> "SUPER";
		case GLFW.GLFW_KEY_ESCAPE -> "ESC";
		case GLFW.GLFW_KEY_ENTER, GLFW.GLFW_KEY_KP_ENTER -> "ENTER";
		case GLFW.GLFW_KEY_SPACE -> "SPACE";
		case GLFW.GLFW_KEY_TAB -> "TAB";
		case GLFW.GLFW_KEY_BACKSPACE -> "BACKSPACE";
		case GLFW.GLFW_KEY_DELETE -> "DELETE";
		case GLFW.GLFW_KEY_INSERT -> "INSERT";
		case GLFW.GLFW_KEY_HOME -> "HOME";
		case GLFW.GLFW_KEY_END -> "END";
		case GLFW.GLFW_KEY_PAGE_UP -> "PAGE UP";
		case GLFW.GLFW_KEY_PAGE_DOWN -> "PAGE DOWN";
		case GLFW.GLFW_KEY_UP -> "UP";
		case GLFW.GLFW_KEY_DOWN -> "DOWN";
		case GLFW.GLFW_KEY_LEFT -> "LEFT";
		case GLFW.GLFW_KEY_RIGHT -> "RIGHT";
		default -> "KEY " + key;
		};
	}

	@Override
	public KeybindSetting describe(String text) {
		super.describe(text);
		return this;
	}

	@Override
	public KeybindSetting group(String groupName) {
		super.group(groupName);
		return this;
	}

	@Override
	protected String toStringValue(Integer value) {
		return value.toString();
	}

	@Override
	protected Integer parse(JsonPrimitive json) {
		try {
			if (json.isNumber()) {
				return json.getAsInt();
			}
			if (json.isString()) {
				String text = json.getAsString().trim();
				if (text.isEmpty() || "none".equalsIgnoreCase(text)) {
					return UNBOUND;
				}
				return Integer.valueOf(text);
			}
		} catch (NumberFormatException e) {
			return null;
		}
		return null;
	}
}
