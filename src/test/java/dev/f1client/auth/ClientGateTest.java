package dev.f1client.auth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ClientGateTest {
	@Test
	public void clientKeyOpensAuthScreenWhileLocked() {
		assertEquals(ClientGate.Route.AUTH_SCREEN, ClientGate.routeClientKey(AuthState.UNAUTHENTICATED));
		assertEquals(ClientGate.Route.AUTH_SCREEN, ClientGate.routeClientKey(AuthState.AUTHENTICATING));
		assertEquals(ClientGate.Route.AUTH_SCREEN, ClientGate.routeClientKey(AuthState.EXPIRED));
	}

	@Test
	public void clientKeyOpensClickGuiWhileUnlocked() {
		assertEquals(ClientGate.Route.CLICK_GUI, ClientGate.routeClientKey(AuthState.AUTHENTICATED));
		assertEquals(ClientGate.Route.CLICK_GUI, ClientGate.routeClientKey(AuthState.OFFLINE_GRACE));
	}

	@Test
	public void featuresFollowTheSameRule() {
		for (AuthState state : AuthState.values()) {
			boolean unlocked = state == AuthState.AUTHENTICATED || state == AuthState.OFFLINE_GRACE;
			assertEquals(state.name(), unlocked, ClientGate.allowsClientFeatures(state));
			assertEquals(state.name(), unlocked, state.isUnlocked());
		}
		assertFalse(ClientGate.allowsClientFeatures(AuthState.EXPIRED));
		assertTrue(ClientGate.allowsClientFeatures(AuthState.OFFLINE_GRACE));
	}
}
