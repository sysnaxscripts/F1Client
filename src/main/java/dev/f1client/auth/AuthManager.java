package dev.f1client.auth;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.LongSupplier;

/**
 * State machine behind the account gate.
 *
 * <p>Owns the current {@link AuthSession}, restores it silently on startup, refreshes the
 * access token {@value #REFRESH_LEAD_MS} ms before it expires, keeps the client unlocked
 * through backend outages for up to seven days, and flips to {@link AuthState#EXPIRED}
 * the moment the backend rejects the session.
 *
 * <p>All blocking work runs on the supplied {@link Scheduler}; state reads are lock-free
 * so render and input code can consult {@link #state()} every frame.
 */
public final class AuthManager {
	/** How long before access-token expiry the silent refresh fires. */
	public static final long REFRESH_LEAD_MS = 60_000L;
	/** How long a cached session keeps the client unlocked without backend contact. */
	public static final long OFFLINE_GRACE_MS = 7L * 24 * 60 * 60_000L;
	/** Delay between revalidation attempts while the backend is unreachable. */
	public static final long RETRY_DELAY_MS = 30_000L;
	private static final long MIN_REFRESH_DELAY_MS = 1_000L;

	/** Runs background work and timers. Abstracted so tests can drive time by hand. */
	public interface Scheduler {
		/** Runs a blocking task off the caller's thread. */
		void execute(Runnable task);

		/**
		 * Runs a task after a delay.
		 *
		 * @return a handle that cancels the task when run
		 */
		Runnable schedule(long delayMs, Runnable task);
	}

	/** Receives every state transition, possibly on a background thread. */
	public interface Listener {
		void onAuthStateChanged(AuthState previous, AuthState current);
	}

	private final AuthBackend backend;
	private final SessionStore store;
	private final AuthPrefs prefs;
	private final LongSupplier clock;
	private final Scheduler scheduler;
	private final List<Listener> listeners = new CopyOnWriteArrayList<>();
	private final Object lock = new Object();

	private volatile AuthState state = AuthState.UNAUTHENTICATED;
	private volatile String username = "";
	private volatile String notice = "";
	private AuthSession session;
	private long lastValidatedAtMs;
	private boolean persist;
	private Runnable pendingTimer;
	private int generation;

	/**
	 * @param backend   account service (real or mock)
	 * @param store     encrypted session persistence
	 * @param prefs     pre-login preferences
	 * @param clock     epoch-millisecond time source
	 * @param scheduler background executor and timer
	 */
	public AuthManager(AuthBackend backend, SessionStore store, AuthPrefs prefs, LongSupplier clock, Scheduler scheduler) {
		this.backend = backend;
		this.store = store;
		this.prefs = prefs;
		this.clock = clock;
		this.scheduler = scheduler;
	}

	/** @return the current gate state. */
	public AuthState state() {
		return state;
	}

	/** @return {@code true} when client features may be used. */
	public boolean isUnlocked() {
		return state.isUnlocked();
	}

	/** @return the signed-in account name, or an empty string. */
	public String username() {
		return username;
	}

	/** @return the reason to show on the auth screen after an involuntary sign-out, or empty. */
	public String notice() {
		return notice;
	}

	/** Clears the notice once the auth screen has displayed it and the user acted. */
	public void clearNotice() {
		notice = "";
	}

	/** @return pre-login preferences (default tab, last username, backend address). */
	public AuthPrefs prefs() {
		return prefs;
	}

	public void addListener(Listener listener) {
		listeners.add(listener);
	}

	/**
	 * Silently restores a stored session. Call once during client start-up: if a valid
	 * refresh token exists the client is unlocked before the title screen is usable.
	 */
	public void startup() {
		int ticket;
		synchronized (lock) {
			ticket = ++generation;
		}
		transition(AuthState.AUTHENTICATING);
		scheduler.execute(() -> {
			Optional<StoredSession> stored = store.load();
			if (stored.isEmpty()) {
				synchronized (lock) {
					if (ticket != generation) {
						return;
					}
				}
				transition(AuthState.UNAUTHENTICATED);
				return;
			}
			synchronized (lock) {
				if (ticket != generation) {
					return;
				}
				session = stored.get().session();
				lastValidatedAtMs = stored.get().lastValidatedAtMs();
				persist = true;
				username = session.username();
			}
			revalidate(ticket);
		});
	}

	/**
	 * Signs in. The password array is wiped when the call finishes.
	 *
	 * @return a future completing with {@code null} on success or the failure category
	 */
	public CompletableFuture<AuthError> login(String name, char[] password, boolean staySignedIn) {
		return authenticate(name, password, staySignedIn, false);
	}

	/**
	 * Creates an account and signs in. The password array is wiped when the call finishes.
	 *
	 * @return a future completing with {@code null} on success or the failure category
	 */
	public CompletableFuture<AuthError> register(String name, char[] password, boolean staySignedIn) {
		return authenticate(name, password, staySignedIn, true);
	}

	/** Signs out: clears tokens from memory and disk and revokes them server-side if reachable. */
	public void logout() {
		AuthSession old;
		synchronized (lock) {
			generation++;
			cancelTimer();
			old = session;
			session = null;
			username = "";
			notice = "";
		}
		store.clear();
		transition(AuthState.UNAUTHENTICATED);
		if (old != null) {
			scheduler.execute(() -> {
				try {
					backend.logout(old.accessToken(), old.refreshToken());
				} catch (AuthException ignored) {
					// Best effort: local tokens are already gone.
				}
			});
		}
	}

	/**
	 * Reports that some authenticated call got an HTTP 401 mid-session. The gate closes
	 * immediately and the auth screen explains why on the next client-key press.
	 */
	public void reportUnauthorized() {
		synchronized (lock) {
			if (session == null) {
				return;
			}
			generation++;
		}
		expire(AuthError.UNAUTHORIZED.message());
	}

	private CompletableFuture<AuthError> authenticate(String name, char[] password, boolean staySignedIn, boolean create) {
		CompletableFuture<AuthError> result = new CompletableFuture<>();
		AuthState before = state;
		if (before == AuthState.AUTHENTICATING) {
			Arrays.fill(password, '\0');
			result.complete(AuthError.BUSY);
			return result;
		}
		int ticket;
		synchronized (lock) {
			ticket = ++generation;
			cancelTimer();
			session = null;
			username = "";
		}
		transition(AuthState.AUTHENTICATING);
		scheduler.execute(() -> {
			try {
				AuthSession fresh = create ? backend.register(name, password) : backend.login(name, password);
				synchronized (lock) {
					if (ticket != generation) {
						result.complete(AuthError.SERVER_ERROR);
						return;
					}
					session = fresh;
					lastValidatedAtMs = clock.getAsLong();
					persist = staySignedIn;
					username = fresh.username();
					notice = "";
				}
				if (staySignedIn) {
					persistSession();
				} else {
					store.clear();
				}
				prefs.rememberSignIn(fresh.username(), staySignedIn);
				transition(AuthState.AUTHENTICATED);
				scheduleRefresh(ticket);
				result.complete(null);
			} catch (AuthException e) {
				boolean current;
				synchronized (lock) {
					current = ticket == generation;
				}
				if (current) {
					transition(before == AuthState.EXPIRED ? AuthState.EXPIRED : AuthState.UNAUTHENTICATED);
				}
				result.complete(e.error());
			} finally {
				Arrays.fill(password, '\0');
			}
		});
		return result;
	}

	/** Confirms the stored session with the backend, refreshing the tokens when needed. */
	private void revalidate(int ticket) {
		AuthSession current;
		synchronized (lock) {
			if (ticket != generation || session == null) {
				return;
			}
			current = session;
		}
		long now = clock.getAsLong();
		try {
			AuthSession fresh;
			if (current.accessExpiresAtMs() - now > REFRESH_LEAD_MS) {
				try {
					backend.me(current.accessToken());
					fresh = current;
				} catch (AuthException e) {
					if (e.error() != AuthError.UNAUTHORIZED) {
						throw e;
					}
					fresh = backend.refresh(current.refreshToken());
				}
			} else {
				fresh = backend.refresh(current.refreshToken());
			}
			synchronized (lock) {
				if (ticket != generation) {
					return;
				}
				session = fresh;
				lastValidatedAtMs = clock.getAsLong();
				username = fresh.username();
				notice = "";
			}
			persistSession();
			transition(AuthState.AUTHENTICATED);
			scheduleRefresh(ticket);
		} catch (AuthException e) {
			handleRevalidationFailure(ticket, e.error());
		}
	}

	private void handleRevalidationFailure(int ticket, AuthError error) {
		boolean unreachable = error == AuthError.OFFLINE || error == AuthError.SERVER_ERROR || error == AuthError.RATE_LIMITED;
		long validated;
		synchronized (lock) {
			if (ticket != generation) {
				return;
			}
			validated = lastValidatedAtMs;
		}
		if (!unreachable) {
			expire(AuthError.UNAUTHORIZED.message());
			return;
		}
		if (clock.getAsLong() - validated > OFFLINE_GRACE_MS) {
			expire("Offline for more than 7 days. Sign in again.");
			return;
		}
		transition(AuthState.OFFLINE_GRACE);
		synchronized (lock) {
			if (ticket != generation) {
				return;
			}
			cancelTimer();
			pendingTimer = scheduler.schedule(RETRY_DELAY_MS, () -> scheduler.execute(() -> revalidate(ticket)));
		}
	}

	private void scheduleRefresh(int ticket) {
		synchronized (lock) {
			if (ticket != generation || session == null) {
				return;
			}
			cancelTimer();
			long delay = Math.max(MIN_REFRESH_DELAY_MS, session.accessExpiresAtMs() - clock.getAsLong() - REFRESH_LEAD_MS);
			pendingTimer = scheduler.schedule(delay, () -> scheduler.execute(() -> refreshNow(ticket)));
		}
	}

	private void refreshNow(int ticket) {
		AuthSession current;
		synchronized (lock) {
			if (ticket != generation || session == null) {
				return;
			}
			current = session;
		}
		try {
			AuthSession fresh = backend.refresh(current.refreshToken());
			synchronized (lock) {
				if (ticket != generation) {
					return;
				}
				session = fresh;
				lastValidatedAtMs = clock.getAsLong();
				username = fresh.username();
			}
			persistSession();
			transition(AuthState.AUTHENTICATED);
			scheduleRefresh(ticket);
		} catch (AuthException e) {
			handleRevalidationFailure(ticket, e.error());
		}
	}

	private void expire(String reason) {
		synchronized (lock) {
			generation++;
			cancelTimer();
			session = null;
			username = "";
			notice = reason;
		}
		store.clear();
		transition(AuthState.EXPIRED);
	}

	private void persistSession() {
		StoredSession snapshot;
		synchronized (lock) {
			if (!persist || session == null) {
				return;
			}
			snapshot = new StoredSession(session, lastValidatedAtMs);
		}
		try {
			store.save(snapshot);
		} catch (IOException ignored) {
			// The session stays valid in memory; only "stay signed in" is lost for this launch.
		}
	}

	private void cancelTimer() {
		if (pendingTimer != null) {
			pendingTimer.run();
			pendingTimer = null;
		}
	}

	private void transition(AuthState next) {
		AuthState previous;
		synchronized (lock) {
			previous = state;
			if (previous == next) {
				return;
			}
			state = next;
		}
		for (Listener listener : listeners) {
			listener.onAuthStateChanged(previous, next);
		}
	}
}
