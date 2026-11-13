package dev.f1client.auth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import dev.f1client.testutil.ManualScheduler;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class AuthManagerTest {
	private static final long ACCESS_TTL = 15 * 60_000L;
	private static final long REFRESH_TTL = 30L * 24 * 60 * 60_000L;
	private static final long DAY = 24 * 60 * 60_000L;

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	private ManualScheduler time;
	private MockAuthBackend backend;
	private Path sessionFile;
	private Path prefsFile;

	@Before
	public void setUp() throws Exception {
		time = new ManualScheduler(1_700_000_000_000L);
		backend = new MockAuthBackend(time, null).withTokenLifetimes(ACCESS_TTL, REFRESH_TTL);
		sessionFile = folder.getRoot().toPath().resolve("session.dat");
		prefsFile = folder.getRoot().toPath().resolve("auth.json");
	}

	private AuthManager manager() {
		AuthPrefs prefs = new AuthPrefs(prefsFile);
		prefs.load();
		return new AuthManager(backend, new SessionStore(sessionFile, () -> "machine-a"), prefs, time, time);
	}

	private static char[] pw() {
		return "correct horse".toCharArray();
	}

	@Test
	public void registerUnlocksAndPersists() throws Exception {
		AuthManager auth = manager();
		assertEquals(AuthState.UNAUTHENTICATED, auth.state());
		assertFalse(auth.prefs().everSignedIn());

		assertNull(auth.register("driver", pw(), true).get());

		assertEquals(AuthState.AUTHENTICATED, auth.state());
		assertEquals("driver", auth.username());
		assertTrue(Files.isRegularFile(sessionFile));
		assertTrue(auth.prefs().everSignedIn());
	}

	@Test
	public void passwordArrayIsWipedAfterSubmit() throws Exception {
		AuthManager auth = manager();
		char[] password = pw();
		auth.register("driver", password, true).get();
		for (char c : password) {
			assertEquals('\0', c);
		}
	}

	@Test
	public void sessionFileNeverContainsPasswordOrTokensInPlaintext() throws Exception {
		AuthManager auth = manager();
		auth.register("driver", pw(), true).get();
		String raw = new String(Files.readAllBytes(sessionFile), java.nio.charset.StandardCharsets.ISO_8859_1);
		assertFalse(raw.contains("correct horse"));
		assertFalse(raw.contains("driver"));
		assertFalse(raw.contains("accessToken"));
	}

	@Test
	public void wrongPasswordAndTakenNameAreReported() throws Exception {
		AuthManager auth = manager();
		auth.register("driver", pw(), false).get();
		auth.logout();

		assertEquals(AuthError.INVALID_CREDENTIALS, auth.login("driver", "wrong password".toCharArray(), true).get());
		assertEquals(AuthState.UNAUTHENTICATED, auth.state());
		assertEquals(AuthError.NAME_TAKEN, auth.register("Driver", pw(), true).get());
		assertEquals(AuthState.UNAUTHENTICATED, auth.state());
	}

	@Test
	public void offlineAndRateLimitedAreReported() throws Exception {
		AuthManager auth = manager();
		backend.setOffline(true);
		assertEquals(AuthError.OFFLINE, auth.login("driver", pw(), true).get());
		backend.setOffline(false);
		backend.setRateLimited(true);
		assertEquals(AuthError.RATE_LIMITED, auth.login("driver", pw(), true).get());
		assertEquals(AuthState.UNAUTHENTICATED, auth.state());
	}

	@Test
	public void refreshIsScheduledSixtySecondsBeforeExpiry() throws Exception {
		AuthManager auth = manager();
		auth.register("driver", pw(), true).get();

		assertEquals(ACCESS_TTL - AuthManager.REFRESH_LEAD_MS, time.nextDelay());
		assertEquals(0, backend.refreshCalls());

		time.advance(ACCESS_TTL - AuthManager.REFRESH_LEAD_MS - 1);
		assertEquals(0, backend.refreshCalls());
		time.advance(1);
		assertEquals(1, backend.refreshCalls());
		assertEquals(AuthState.AUTHENTICATED, auth.state());
		assertEquals(ACCESS_TTL - AuthManager.REFRESH_LEAD_MS, time.nextDelay());

		time.advance(ACCESS_TTL - AuthManager.REFRESH_LEAD_MS);
		assertEquals(2, backend.refreshCalls());
	}

	@Test
	public void startupRestoresSessionSilently() throws Exception {
		manager().register("driver", pw(), true).get();
		time.jump(1_000L);

		AuthManager restarted = manager();
		restarted.startup();

		assertEquals(AuthState.AUTHENTICATED, restarted.state());
		assertEquals("driver", restarted.username());
		assertEquals(0, backend.refreshCalls());
	}

	@Test
	public void startupWithExpiredAccessTokenFallsBackToRefreshToken() throws Exception {
		manager().register("driver", pw(), true).get();
		time.jump(ACCESS_TTL + DAY);

		AuthManager restarted = manager();
		restarted.startup();

		assertEquals(AuthState.AUTHENTICATED, restarted.state());
		assertEquals(1, backend.refreshCalls());
	}

	@Test
	public void startupWithExpiredRefreshTokenRequiresSignIn() throws Exception {
		manager().register("driver", pw(), true).get();
		time.jump(REFRESH_TTL + DAY);

		AuthManager restarted = manager();
		restarted.startup();

		assertEquals(AuthState.EXPIRED, restarted.state());
		assertFalse(restarted.notice().isEmpty());
		assertFalse(Files.exists(sessionFile));
		assertEquals(ClientGate.Route.AUTH_SCREEN, ClientGate.routeClientKey(restarted.state()));
	}

	@Test
	public void staySignedInOffKeepsSessionInMemoryOnly() throws Exception {
		AuthManager auth = manager();
		auth.register("driver", pw(), false).get();
		assertEquals(AuthState.AUTHENTICATED, auth.state());
		assertFalse(Files.exists(sessionFile));

		time.advance(ACCESS_TTL);
		assertEquals(AuthState.AUTHENTICATED, auth.state());
		assertFalse(Files.exists(sessionFile));

		AuthManager restarted = manager();
		restarted.startup();
		assertEquals(AuthState.UNAUTHENTICATED, restarted.state());
	}

	@Test
	public void copiedSessionFileFailsOnAnotherMachine() throws Exception {
		manager().register("driver", pw(), true).get();

		AuthPrefs prefs = new AuthPrefs(prefsFile);
		AuthManager other = new AuthManager(backend, new SessionStore(sessionFile, () -> "machine-b"), prefs, time, time);
		other.startup();

		assertEquals(AuthState.UNAUTHENTICATED, other.state());
	}

	@Test
	public void backendOutageEntersOfflineGraceAndRecovers() throws Exception {
		manager().register("driver", pw(), true).get();
		backend.setOffline(true);
		time.jump(DAY);

		AuthManager restarted = manager();
		restarted.startup();
		assertEquals(AuthState.OFFLINE_GRACE, restarted.state());
		assertTrue(restarted.isUnlocked());
		assertEquals(AuthManager.RETRY_DELAY_MS, time.nextDelay());

		backend.setOffline(false);
		time.advance(AuthManager.RETRY_DELAY_MS);
		assertEquals(AuthState.AUTHENTICATED, restarted.state());
	}

	@Test
	public void offlineGraceExpiresAfterSevenDays() throws Exception {
		manager().register("driver", pw(), true).get();
		backend.setOffline(true);
		time.jump(AuthManager.OFFLINE_GRACE_MS - 60_000L);

		AuthManager within = manager();
		within.startup();
		assertEquals(AuthState.OFFLINE_GRACE, within.state());

		time.advance(2 * 60_000L);
		assertEquals(AuthState.EXPIRED, within.state());
		assertFalse(within.isUnlocked());
		assertFalse(Files.exists(sessionFile));
	}

	@Test
	public void offlineGraceIsRefusedWhenAlreadyPastSevenDays() throws Exception {
		manager().register("driver", pw(), true).get();
		backend.setOffline(true);
		time.jump(AuthManager.OFFLINE_GRACE_MS + 1);

		AuthManager late = manager();
		late.startup();
		assertEquals(AuthState.EXPIRED, late.state());
	}

	@Test
	public void midSessionUnauthorizedExpiresWithReason() throws Exception {
		AuthManager auth = manager();
		auth.register("driver", pw(), true).get();
		List<AuthState> seen = new ArrayList<>();
		auth.addListener((previous, current) -> seen.add(current));

		auth.reportUnauthorized();

		assertEquals(AuthState.EXPIRED, auth.state());
		assertEquals(List.of(AuthState.EXPIRED), seen);
		assertFalse(auth.notice().isEmpty());
		assertEquals("", auth.username());
		assertFalse(Files.exists(sessionFile));
		assertEquals(-1, time.nextDelay());
	}

	@Test
	public void revokedSessionExpiresAtNextRefresh() throws Exception {
		AuthManager auth = manager();
		auth.register("driver", pw(), true).get();
		backend.revokeAllSessions();

		time.advance(ACCESS_TTL);

		assertEquals(AuthState.EXPIRED, auth.state());
	}

	@Test
	public void logoutClearsSessionAndStopsRefreshing() throws Exception {
		AuthManager auth = manager();
		auth.register("driver", pw(), true).get();

		auth.logout();

		assertEquals(AuthState.UNAUTHENTICATED, auth.state());
		assertEquals("", auth.username());
		assertFalse(Files.exists(sessionFile));
		assertEquals(-1, time.nextDelay());
		assertEquals(ClientGate.Route.AUTH_SCREEN, ClientGate.routeClientKey(auth.state()));

		AuthManager restarted = manager();
		restarted.startup();
		assertEquals(AuthState.UNAUTHENTICATED, restarted.state());
	}

	@Test
	public void clientKeyRouteFollowsLiveState() throws Exception {
		AuthManager auth = manager();
		assertEquals(ClientGate.Route.AUTH_SCREEN, ClientGate.routeClientKey(auth.state()));
		auth.register("driver", pw(), true).get();
		assertEquals(ClientGate.Route.CLICK_GUI, ClientGate.routeClientKey(auth.state()));
		auth.reportUnauthorized();
		assertEquals(ClientGate.Route.AUTH_SCREEN, ClientGate.routeClientKey(auth.state()));
		assertNull(auth.login("driver", pw(), true).get());
		assertEquals(ClientGate.Route.CLICK_GUI, ClientGate.routeClientKey(auth.state()));
	}
}
