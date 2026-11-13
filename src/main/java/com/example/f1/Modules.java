package com.example.f1;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;

/**
 * The module registry and the only place that reads module keybinds.
 *
 * <p>{@link #tick()} is called from the tail of {@code Minecraft#tick} by
 * {@code MinecraftMixin}: it polls every bound key straight from GLFW so a tap shorter
 * than one tick is still seen, toggles on the press edge, and then ticks the enabled
 * modules. {@link #render(float)} is called from {@code WorldRenderEvents.AFTER_ENTITIES}.
 *
 * <p>Keys are polled rather than taken from key events on purpose: no {@code Keyboard}
 * mixin is needed, and a module key never fights the vanilla keybind system. Polling also
 * means the toggle still works while a screen is open; a key held across a window focus
 * change does not produce a second edge, because the poll is gated on the window being
 * active.
 */
public final class Modules {
	/** The client. Assigned once, during class initialisation, and never null afterwards. */
	static Minecraft mc = Minecraft.getInstance();

	private static final List<Module> MODULES = new ArrayList<>();
	private static final List<Module> KEY_BOUND = new ArrayList<>();

	/** Parallel to {@link #KEY_BOUND}: whether the key was down on the previous tick. */
	private static final boolean[] KEY_DOWN = new boolean[32];
	private static int keyBoundCount;

	private Modules() {
	}

	/**
	 * Adds a module.
	 *
	 * @return the same module, so registration can be assigned in one line
	 */
	public static <T extends Module> T register(T module) {
		MODULES.add(module);
		if (module.getKey() != GLFW.GLFW_KEY_UNKNOWN && module.getKey() != 0) {
			if (keyBoundCount == KEY_BOUND.size()) {
				throw new IllegalStateException("More than " + KEY_BOUND.size() + " key-bound modules");
			}
			KEY_BOUND.add(module);
			keyBoundCount++;
		}
		F1Client.LOGGER.info("Registered module {} (key {})", module.getName(),
				module.getKey() == 0 ? "unbound" : GLFW.glfwGetKeyName(module.getKey(), 0));
		return module;
	}

	/** @return every registered module, in registration order. The list is live. */
	public static List<Module> all() {
		return MODULES;
	}

	/** @return the registered instance of that class, or {@code null}. */
	@SuppressWarnings("unchecked")
	public static <T extends Module> T get(Class<T> type) {
		for (Module module : MODULES) {
			if (type.isInstance(module)) {
				return (T) module;
			}
		}
		return null;
	}

	/** @return whether a module of that class is registered and enabled. */
	public static boolean enabled(Class<? extends Module> type) {
		Module module = get(type);
		return module != null && module.isEnabled();
	}

	/** Polls the module keys and ticks every enabled module. Called once per client tick. */
	public static void tick() {
		if (mc == null) {
			return;
		}
		pollKeys();
		for (int i = 0; i < MODULES.size(); i++) {
			Module module = MODULES.get(i);
			if (module.isEnabled()) {
				module.tick();
			}
		}
	}

	/**
	 * Renders every enabled module.
	 *
	 * @param tickDelta partial tick in {@code [0,1)}
	 */
	public static void render(float tickDelta) {
		for (int i = 0; i < MODULES.size(); i++) {
			Module module = MODULES.get(i);
			if (module.isEnabled()) {
				module.render(tickDelta);
			}
		}
	}

	private static void pollKeys() {
		// The GLFW window handle. MAPPING NOTE: the blaze3d Window accessor is getHandle()
		// in the mapped 1.21.11 jar; older versions called it getWindow().
		long window = mc.getWindow() == null ? 0L : mc.getWindow().getHandle();
		if (window == 0L) {
			return;
		}
		// While a screen eats the keyboard GLFW still reports the physical key state, so a
		// key held across a focus change must not look like a fresh press afterwards.
		boolean focused = mc.isWindowActive();
		for (int i = 0; i < keyBoundCount; i++) {
			Module module = KEY_BOUND.get(i);
			boolean down = focused && GLFW.glfwGetKey(window, module.getKey()) == GLFW.GLFW_PRESS;
			if (down && !KEY_DOWN[i]) {
				boolean enabled = module.toggle();
				F1Client.LOGGER.info("{} {}", module.getName(), enabled ? "enabled" : "disabled");
			}
			KEY_DOWN[i] = down;
		}
	}
}
