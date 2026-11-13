package dev.f1client.input;

import dev.f1client.auth.AuthState;
import dev.f1client.auth.ClientGate;
import dev.f1client.gui.UiScreen;
import dev.f1client.module.Module;
import dev.f1client.module.ModuleManager;
import dev.f1client.setting.KeybindSetting;
import dev.f1client.util.UiSounds;
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
 * <p>Keys are sampled once per client tick and acted on when they go down (or up, for
 * hold-binds). The client key is routed through {@link ClientGate}: it opens the auth
 * screen while the gate is closed and the ClickGUI once it is open. Module binds are
 * ignored entirely unless the gate is open, a world is loaded and no screen has focus.
 */
public final class KeybindManager {
	private final MinecraftClient client;
	private final Supplier<AuthState> authState;
	private final ModuleManager modules;
	private final KeybindSetting clientKey;
	private final Runnable openAuthScreen;
	private final Runnable openClickGui;
	private final boolean[] down = new boolean[GLFW.GLFW_KEY_LAST + 1];

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

	/** Samples the keyboard; call once per client tick. */
	public void tick() {
		if (client.getWindow() == null) {
			return;
		}
		boolean clientKeyPressed = pressed(clientKey.get());
		if (clientKeyPressed && acceptsClientKey()) {
			openClient();
		}
		boolean dispatch = ClientGate.allowsClientFeatures(authState.get())
				&& client.world != null && client.player != null && client.currentScreen == null;
		List<Module> all = modules.all();
		for (int i = 0; i < all.size(); i++) {
			Module module = all.get(i);
			int key = module.keybind().get();
			if (key <= KeybindSetting.UNBOUND || key >= down.length) {
				continue;
			}
			boolean now = InputUtil.isKeyPressed(client.getWindow(), key);
			boolean before = down[key];
			if (dispatch && now != before && key != clientKey.get()) {
				if (module.isHoldBind()) {
					setEnabled(module, now);
				} else if (now) {
					setEnabled(module, !module.isEnabled());
				}
			}
		}
		for (int i = 0; i < all.size(); i++) {
			int key = all.get(i).keybind().get();
			if (key > KeybindSetting.UNBOUND && key < down.length) {
				down[key] = InputUtil.isKeyPressed(client.getWindow(), key);
			}
		}
	}

	private void setEnabled(Module module, boolean enabled) {
		if (module.isEnabled() != enabled) {
			module.setEnabled(enabled);
			UiSounds.toggle(module.isEnabled());
		}
	}

	/** @return {@code true} on the tick the key goes down. */
	private boolean pressed(int key) {
		if (key <= KeybindSetting.UNBOUND || key >= down.length) {
			return false;
		}
		boolean now = InputUtil.isKeyPressed(client.getWindow(), key);
		boolean before = down[key];
		down[key] = now;
		return now && !before;
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
