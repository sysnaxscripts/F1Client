package dev.f1client.input;

import dev.f1client.auth.AuthState;
import dev.f1client.auth.ClientGate;
import dev.f1client.gui.UiScreen;
import dev.f1client.module.Module;
import dev.f1client.module.ModuleManager;
import dev.f1client.setting.KeybindSetting;
import dev.f1client.util.UiSounds;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

/**
 * Dispatches the client key and per-module keybinds.
 *
 * <p>Key presses and releases arrive as events from the keyboard handler, so even a tap
 * shorter than a tick is seen. The client key is routed through {@link ClientGate}: it
 * opens the auth screen while the gate is closed and the ClickGUI once it is open. Module
 * binds are ignored entirely unless the gate is open, a world is loaded and no screen has
 * focus.
 */
public final class KeybindManager {
	private final MinecraftClient client;
	private final Supplier<AuthState> authState;
	private final ModuleManager modules;
	private final KeybindSetting clientKey;
	private final Runnable openAuthScreen;
	private final Runnable openClickGui;
	private final List<Module> held = new ArrayList<>();

	/**
	 * @param client         game instance
	 * @param authState      current gate state
	 * @param modules        module registry
	 * @param clientKey      the rebindable client key (Right Shift by default)
	 * @param openAuthScreen opens the register/login screen
	 * @param openClickGui   opens the ClickGUI
	 */
	public KeybindManager(MinecraftClient client, Supplier<AuthState> authState, ModuleManager modules,
			KeybindSetting clientKey, Runnable openAuthScreen, Runnable openClickGui) {
		this.client = client;
		this.authState = authState;
		this.modules = modules;
		this.clientKey = clientKey;
		this.openAuthScreen = openAuthScreen;
		this.openClickGui = openClickGui;
	}

	/**
	 * The single routing point for the client key: auth screen while locked, ClickGUI
	 * while unlocked.
	 */
	public void openClient() {
		switch (ClientGate.routeClientKey(authState.get())) {
			case AUTH_SCREEN -> openAuthScreen.run();
			case CLICK_GUI -> openClickGui.run();
		}
	}

	/**
	 * Handles one keyboard event.
	 *
	 * @param key    GLFW key code
	 * @param action {@code GLFW_PRESS}, {@code GLFW_RELEASE} or {@code GLFW_REPEAT}
	 * @return {@code true} when the event was consumed and must not reach the game
	 */
	public boolean onKey(int key, int action) {
		if (key <= KeybindSetting.UNBOUND || action == GLFW.GLFW_REPEAT) {
			return false;
		}
		if (key == clientKey.get()) {
			if (action == GLFW.GLFW_PRESS && acceptsClientKey()) {
				openClient();
				return true;
			}
			return false;
		}
		if (!ClientGate.allowsClientFeatures(authState.get()) || client.world == null || client.player == null) {
			return false;
		}
		boolean pressed = action == GLFW.GLFW_PRESS;
		if (pressed && client.currentScreen != null) {
			return false;
		}
		List<Module> all = modules.all();
		for (int i = 0; i < all.size(); i++) {
			Module module = all.get(i);
			if (module.keybind().get() != key) {
				continue;
			}
			if (module.isHoldBind()) {
				setEnabled(module, pressed);
				held.remove(module);
				if (pressed && module.isEnabled()) {
					held.add(module);
				}
			} else if (pressed) {
				setEnabled(module, !module.isEnabled());
			}
		}
		return false;
	}

	/**
	 * Safety net for hold-binds; call once per client tick. A release event can be lost
	 * (for example when the window loses focus), so a module that is on only because its
	 * key was held is switched off here once the key is no longer down.
	 */
	public void tick() {
		if (held.isEmpty() || client.getWindow() == null) {
			return;
		}
		for (int i = held.size() - 1; i >= 0; i--) {
			Module module = held.get(i);
			if (!module.isEnabled() || !module.isHoldBind() || !module.keybind().isBound()) {
				held.remove(i);
			} else if (!InputUtil.isKeyPressed(client.getWindow(), module.keybind().get())) {
				held.remove(i);
				setEnabled(module, false);
			}
		}
	}

	private void setEnabled(Module module, boolean enabled) {
		if (module.isEnabled() != enabled) {
			module.setEnabled(enabled);
			UiSounds.toggle(module.isEnabled());
		}
	}

	/** The client key is ignored while typing and inside F1Client's own screens (they close on it themselves). */
	private boolean acceptsClientKey() {
		if (client.getOverlay() != null) {
			return false;
		}
		Screen screen = client.currentScreen;
		if (screen == null) {
			return true;
		}
		if (screen instanceof UiScreen || screen instanceof ChatScreen) {
			return false;
		}
		return !(screen.getFocused() instanceof TextFieldWidget);
	}
}
