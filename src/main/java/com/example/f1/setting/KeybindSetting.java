package com.example.f1.setting;

import com.google.gson.JsonPrimitive;
import java.util.Locale;
import java.util.function.BooleanSupplier;
import org.lwjgl.glfw.GLFW;

/**
 * A GLFW keycode. Drawn as a button that listens for the next key press.
 *
 * <p>{@value #UNBOUND} means no key. {@link #displayName()} asks GLFW for the localized
 * name once the window exists, so a remapped layout shows the label the player's keyboard
 * actually has. {@link #nameOf(int)} is the static fallback and never touches GLFW, so it
 * is safe before the library is initialized.
 *
 * <p>Fabric runs {@code client} entrypoints before the game window is created. A GLFW
 * query that early ( {@code glfwGetKeyName} / {@code glfwGetKeyScancode} ) queues
 * {@code GLFW_NOT_INITIALIZED}, which vanilla's {@code Window.checkGlfwError} then reports
 * as {@code "GLFW error before init: [0x10001]"} and crashes the game during startup. The
 * localized lookup is therefore gated on a window-ready check that {@code F1Client}
 * installs; until then every caller gets the static name.
 */
public final class KeybindSetting extends Setting<Integer> {
	/** Value meaning "no key bound". */
	public static final int UNBOUND = 0;

	/**
	 * Whether GLFW may be queried. Defaults to "not yet" so the class is safe to use in
	 * isolation (and in tests); {@code F1Client} replaces it with a real window check.
	 */
	private static volatile BooleanSupplier windowReady = () -> false;

	public KeybindSetting(String name) {
		this(name, UNBOUND);
	}

	public KeybindSetting(String name, int defaultKey) {
		super(name, defaultKey);
	}

	/**
	 * Installs the check that decides when GLFW is safe to query. Called once during client
	 * initialisation with a supplier that reports whether the Minecraft window exists.
	 *
	 * @param check readiness check, or {@code null} to restore the safe default
	 */
	public static void setWindowReadyCheck(BooleanSupplier check) {
		windowReady = check == null ? () -> false : check;
	}

	/** @return whether a key is bound. */
	public boolean isBound() {
		return get() != UNBOUND;
	}

	/** Unbinds the key. */
	public void unbind() {
		set(UNBOUND);
	}

	/**
	 * @return the key name to display, e.g. {@code "RIGHT SHIFT"} or {@code "None"}. Uses
	 *         the localized GLFW name once the window exists, otherwise the static
	 *         fallback. Call from the render thread.
	 */
	public String displayName() {
		int key = get();
		if (key == UNBOUND) {
			return "None";
		}
		// Only query GLFW after the window exists; see the class note. The scancode is
		// ignored for a known key token, so -1 avoids a second native call.
		if (windowReady.getAsBoolean() && key >= GLFW.GLFW_KEY_SPACE && key <= GLFW.GLFW_KEY_LAST) {
			String name = GLFW.glfwGetKeyName(key, -1);
			if (name != null && !name.isBlank()) {
				return name.toUpperCase(Locale.ROOT);
			}
		}
		return nameOf(key);
	}

	/**
	 * Static, native-free name for a GLFW keycode. Safe before GLFW is initialized, so
	 * startup logging and any other early caller can use it without queuing a GLFW error.
	 *
	 * @return a readable name for a GLFW keycode
	 */
	public static String nameOf(int key) {
		if (key == UNBOUND) {
			return "None";
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
		default -> printableName(key);
		};
	}

	/**
	 * GLFW key tokens for printable keys match their uppercase ASCII codepoints, so the
	 * static fallback can still show {@code "A"} or {@code "7"} before the window exists.
	 * The localized layout name comes from {@link #displayName()} once GLFW is ready.
	 */
	private static String printableName(int key) {
		if (key >= GLFW.GLFW_KEY_SPACE && key <= GLFW.GLFW_KEY_GRAVE_ACCENT) {
			return String.valueOf((char) key);
		}
		return "KEY " + key;
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
