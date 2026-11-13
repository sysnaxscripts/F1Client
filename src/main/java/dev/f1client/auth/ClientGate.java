package dev.f1client.auth;

/**
 * The single place that decides what the client key and module binds may do.
 *
 * <p>Input handling, the screen opener, module toggles and HUD rendering all route
 * through these methods so the gate cannot drift between call sites.
 */
public final class ClientGate {
	/** Destination of the client key (Right Shift by default). */
	public enum Route {
		/** Show the register / login screen. */
		AUTH_SCREEN,
		/** Show the ClickGUI. */
		CLICK_GUI
	}

	private ClientGate() {
	}

	/** @return where the client key leads in the given state. */
	public static Route routeClientKey(AuthState state) {
		return state.isUnlocked() ? Route.CLICK_GUI : Route.AUTH_SCREEN;
	}

	/** @return whether per-module keybinds, module toggles and HUD output are permitted. */
	public static boolean allowsClientFeatures(AuthState state) {
		return state.isUnlocked();
	}
}
