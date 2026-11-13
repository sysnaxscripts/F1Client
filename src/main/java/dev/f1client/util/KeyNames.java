package dev.f1client.util;

import dev.f1client.setting.KeybindSetting;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.lwjgl.glfw.GLFW;

/** Short display names for GLFW key codes. */
public final class KeyNames {
	private static final Map<Integer, String> SPECIAL = new HashMap<>();
	private static final Map<Integer, String> CACHE = new HashMap<>();

	static {
		SPECIAL.put(GLFW.GLFW_KEY_RIGHT_SHIFT, "RShift");
		SPECIAL.put(GLFW.GLFW_KEY_LEFT_SHIFT, "LShift");
		SPECIAL.put(GLFW.GLFW_KEY_RIGHT_CONTROL, "RCtrl");
		SPECIAL.put(GLFW.GLFW_KEY_LEFT_CONTROL, "LCtrl");
		SPECIAL.put(GLFW.GLFW_KEY_RIGHT_ALT, "RAlt");
		SPECIAL.put(GLFW.GLFW_KEY_LEFT_ALT, "LAlt");
		SPECIAL.put(GLFW.GLFW_KEY_SPACE, "Space");
		SPECIAL.put(GLFW.GLFW_KEY_ENTER, "Enter");
		SPECIAL.put(GLFW.GLFW_KEY_TAB, "Tab");
		SPECIAL.put(GLFW.GLFW_KEY_BACKSPACE, "Backspace");
		SPECIAL.put(GLFW.GLFW_KEY_INSERT, "Insert");
		SPECIAL.put(GLFW.GLFW_KEY_DELETE, "Delete");
		SPECIAL.put(GLFW.GLFW_KEY_HOME, "Home");
		SPECIAL.put(GLFW.GLFW_KEY_END, "End");
		SPECIAL.put(GLFW.GLFW_KEY_PAGE_UP, "PgUp");
		SPECIAL.put(GLFW.GLFW_KEY_PAGE_DOWN, "PgDn");
		SPECIAL.put(GLFW.GLFW_KEY_UP, "Up");
		SPECIAL.put(GLFW.GLFW_KEY_DOWN, "Down");
		SPECIAL.put(GLFW.GLFW_KEY_LEFT, "Left");
		SPECIAL.put(GLFW.GLFW_KEY_RIGHT, "Right");
		SPECIAL.put(GLFW.GLFW_KEY_CAPS_LOCK, "Caps");
		SPECIAL.put(GLFW.GLFW_KEY_GRAVE_ACCENT, "`");
		for (int i = 0; i < 25; i++) {
			SPECIAL.put(GLFW.GLFW_KEY_F1 + i, "F" + (i + 1));
		}
		for (int i = 0; i <= 9; i++) {
			SPECIAL.put(GLFW.GLFW_KEY_KP_0 + i, "Num" + i);
		}
	}

	private KeyNames() {
	}

	/** @return a short label such as {@code "RShift"}, {@code "G"} or {@code "Unbound"}. */
	public static String of(int keyCode) {
		if (keyCode == KeybindSetting.UNBOUND) {
			return "Unbound";
		}
		return CACHE.computeIfAbsent(keyCode, KeyNames::resolve);
	}

	private static String resolve(int keyCode) {
		String special = SPECIAL.get(keyCode);
		if (special != null) {
			return special;
		}
		String name = GLFW.glfwGetKeyName(keyCode, 0);
		if (name != null && !name.isBlank()) {
			return name.toUpperCase(Locale.ROOT);
		}
		return "Key " + keyCode;
	}
}
