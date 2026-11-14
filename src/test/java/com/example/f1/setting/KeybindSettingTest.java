package com.example.f1.setting;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.lwjgl.glfw.GLFW;

/**
 * Regression tests for the startup crash {@code GLFW error before init: [0x10001]}.
 *
 * <p>Fabric invokes {@code client} entrypoints before {@code glfwInit}, so any GLFW query
 * during module registration queues {@code GLFW_NOT_INITIALIZED} and vanilla crashes when
 * it checks for pending GLFW errors. These tests exercise the key-name paths with GLFW
 * deliberately uninitialised: they reference only {@code GLFW_KEY_*} constants (compile-time
 * ints, so the native library is never loaded) and must resolve every name without touching
 * GLFW. If a future change reintroduces an unguarded native lookup, these tests fail instead
 * of the game crashing on launch.
 */
public final class KeybindSettingTest {
	@Before
	public void forceWindowNotReady() {
		KeybindSetting.setWindowReadyCheck(null);
	}

	@After
	public void restoreDefault() {
		KeybindSetting.setWindowReadyCheck(null);
	}

	@Test
	public void staticNamesCoverTheStartupKeysWithoutGlfw() {
		assertEquals("F6", KeybindSetting.nameOf(GLFW.GLFW_KEY_F6));
		assertEquals("F7", KeybindSetting.nameOf(GLFW.GLFW_KEY_F7));
		assertEquals("F8", KeybindSetting.nameOf(GLFW.GLFW_KEY_F8));
		assertEquals("SHIFT", KeybindSetting.nameOf(GLFW.GLFW_KEY_RIGHT_SHIFT));
		assertEquals("None", KeybindSetting.nameOf(KeybindSetting.UNBOUND));
	}

	@Test
	public void displayNameFallsBackToStaticNamesBeforeTheWindowExists() {
		assertEquals("F7", new KeybindSetting("Keybind", GLFW.GLFW_KEY_F7).displayName());
		assertEquals("F8", new KeybindSetting("Keybind", GLFW.GLFW_KEY_F8).displayName());
		assertEquals("SHIFT", new KeybindSetting("Client key", GLFW.GLFW_KEY_RIGHT_SHIFT).displayName());
		assertEquals("A", new KeybindSetting("Keybind", GLFW.GLFW_KEY_A).displayName());
	}

	@Test
	public void unboundKeyIsNoneWithoutGlfw() {
		KeybindSetting setting = new KeybindSetting("Keybind");
		assertEquals("None", setting.displayName());
		setting.set(GLFW.GLFW_KEY_F6);
		setting.unbind();
		assertEquals("None", setting.displayName());
	}

	@Test
	public void everyFunctionKeyHasAStaticName() {
		for (int key = GLFW.GLFW_KEY_F1; key <= GLFW.GLFW_KEY_F25; key++) {
			assertEquals("F" + (key - GLFW.GLFW_KEY_F1 + 1), KeybindSetting.nameOf(key));
		}
	}

	@Test
	public void printableKeysHaveAnAsciiFallback() {
		assertEquals("A", KeybindSetting.nameOf(GLFW.GLFW_KEY_A));
		assertEquals("Z", KeybindSetting.nameOf(GLFW.GLFW_KEY_Z));
		assertEquals("0", KeybindSetting.nameOf(GLFW.GLFW_KEY_0));
		assertEquals("9", KeybindSetting.nameOf(GLFW.GLFW_KEY_9));
		assertEquals("SPACE", KeybindSetting.nameOf(GLFW.GLFW_KEY_SPACE));
	}

	@Test
	public void outOfRangeKeysNeverReachGlfwEvenWhenTheWindowIsReady() {
		// A ready window would normally allow a native lookup, but invalid key tokens must
		// still be resolved statically so a corrupt config cannot queue a GLFW error.
		KeybindSetting.setWindowReadyCheck(() -> true);
		int[] invalid = {-1, 1, GLFW.GLFW_KEY_SPACE - 1, GLFW.GLFW_KEY_LAST + 1, Integer.MIN_VALUE, Integer.MAX_VALUE};
		for (int key : invalid) {
			assertEquals("KEY " + key, new KeybindSetting("Keybind", key).displayName());
		}
	}

	@Test
	public void nullReadyCheckRestoresTheSafeDefault() {
		KeybindSetting.setWindowReadyCheck(() -> true);
		KeybindSetting.setWindowReadyCheck(null);
		// Would hit GLFW (and fail without a native library) if null did not restore false.
		assertEquals("A", new KeybindSetting("Keybind", GLFW.GLFW_KEY_A).displayName());
	}
}
