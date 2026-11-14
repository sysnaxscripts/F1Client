package com.example.f1;

import com.example.f1.gui.ClickGuiScreen;
import com.example.f1.setting.KeybindSetting;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import org.lwjgl.glfw.GLFW;

/**
 * The module registry, the only place that reads keybinds, and the tick that drives
 * everything the client does per game tick.
 *
 * <p>{@link #tick()} is called from the tail of {@code Minecraft#tick} by
 * {@code MinecraftMixin}: it polls the client key and every module key straight from GLFW
 * so a tap shorter than one tick is still seen, toggles on the press edge, ticks the
 * enabled modules, and lets the config write anything that has been pending.
 * {@link #render(float)} is called from {@code WorldRenderEvents.AFTER_ENTITIES}.
 *
 * <p>Keys are polled rather than taken from key events on purpose: no {@code Keyboard}
 * mixin is needed, and a module key never fights the vanilla keybind system, which means a
 * player's own bindings keep working. Polling also means a toggle still works while a
 * screen is open; a key held across a window focus change does not produce a second edge,
 * because the poll is gated on the window being active.
 *
 * <p>Keybinds are settings, so they can be changed in the ClickGUI at any time. Each module
 * carries its own previous-key state, which is what makes a rebind safe: no parallel array
 * has to be rebuilt when a key moves.
 */
public final class Modules {
	/** The client. Assigned once, during class initialisation, and never null afterwards. */
	static Minecraft mc = Minecraft.getInstance();

	private static final List<Module> MODULES = new ArrayList<>();
	private static boolean clientKeyWasDown;

	private Modules() {
	}

	/**
	 * Adds a module and switches it on when it asks to be on by default.
	 *
	 * @return the same module, so registration can be assigned in one line
	 */
	public static <T extends Module> T register(T module) {
		MODULES.add(module);
		if (module.enabledByDefault()) {
			module.setEnabled(true);
		}
		// nameOf is native-free: this runs during client init, before GLFW is initialised,
		// so it must not call displayName() (which would query GLFW and crash startup).
		F1Client.LOGGER.info("Registered module {} (key {})", module.getName(), KeybindSetting.nameOf(module.getKey()));
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

	/** Polls the keys, ticks every enabled module and lets the config save. */
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
		F1Client client = F1Client.get();
		if (client != null) {
			client.config().tick();
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
		// The GLFW window handle. Verified against the mapped 1.21.11 jar: blaze3d's Window
		// exposes it as handle(); older versions called it getWindow() or getHandle().
		long window = mc.getWindow() == null ? 0L : mc.getWindow().handle();
		if (window == 0L) {
			return;
		}
		// While a screen eats the keyboard GLFW still reports the physical key state, so a
		// key held across a focus change must not look like a fresh press afterwards.
		boolean focused = mc.isWindowActive();
		pollClientKey(window, focused);
		for (int i = 0; i < MODULES.size(); i++) {
			Module module = MODULES.get(i);
			int key = module.getKey();
			// Zero is "unbound"; anything negative cannot be a GLFW keycode either.
			if (key <= KeybindSetting.UNBOUND) {
				module.keyWasDown = false;
				continue;
			}
			boolean down = focused && GLFW.glfwGetKey(window, key) == GLFW.GLFW_PRESS;
			if (down && !module.keyWasDown) {
				boolean enabled = module.toggle();
				F1Client.LOGGER.info("{} {}", module.getName(), enabled ? "enabled" : "disabled");
				F1Client client = F1Client.get();
				if (client != null) {
					client.config().markDirty();
				}
			}
			module.keyWasDown = down;
		}
	}

	/** The client key opens the ClickGUI, and closes it again when it is already open. */
	private static void pollClientKey(long window, boolean focused) {
		F1Client client = F1Client.get();
		if (client == null) {
			return;
		}
		int key = client.settings().clientKey().get();
		if (key <= KeybindSetting.UNBOUND) {
			clientKeyWasDown = false;
			return;
		}
		boolean down = focused && GLFW.glfwGetKey(window, key) == GLFW.GLFW_PRESS;
		if (down && !clientKeyWasDown) {
			toggleClickGui();
		}
		clientKeyWasDown = down;
	}

	/** Opens the ClickGUI, or closes it when it is the screen already open. */
	public static void toggleClickGui() {
		Screen screen = mc.screen;
		if (screen instanceof ClickGuiScreen clickGui) {
			clickGui.close();
			return;
		}
		// Another of this client's screens, or a vanilla one the player was using: replace
		// it, and let the new screen remember it as its parent so closing goes back.
		mc.setScreen(new ClickGuiScreen());
	}

	/** Opens the ClickGUI unless it is already open. */
	public static void openClickGui() {
		if (!(mc.screen instanceof ClickGuiScreen)) {
			mc.setScreen(new ClickGuiScreen());
		}
	}

	/** @return every module's state and settings, for the {@code modules} config section. */
	public static JsonElement toJson() {
		JsonObject json = new JsonObject();
		for (Module module : MODULES) {
			json.add(module.getName(), module.toJson());
		}
		return json;
	}

	/**
	 * Applies the {@code modules} config section. Modules missing from it keep their
	 * defaults, and entries for modules that no longer exist are ignored.
	 */
	public static void fromJson(JsonElement json) {
		for (Module module : MODULES) {
			module.resetSettings();
			if (module.enabledByDefault()) {
				module.setEnabled(true);
			}
		}
		if (json == null || !json.isJsonObject()) {
			return;
		}
		JsonObject object = json.getAsJsonObject();
		for (Module module : MODULES) {
			JsonElement element = object.get(module.getName());
			if (element != null && element.isJsonObject()) {
				module.fromJson(element.getAsJsonObject());
			}
		}
	}

	/** @return how many modules are currently enabled; used by the HUD and the log. */
	public static int enabledCount() {
		int count = 0;
		for (Module module : MODULES) {
			if (module.isEnabled()) {
				count++;
			}
		}
		return count;
	}
}
