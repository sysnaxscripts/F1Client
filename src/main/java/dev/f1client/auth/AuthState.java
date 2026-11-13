package dev.f1client.auth;

/**
 * Lifecycle of the client account gate.
 *
 * <p>Only {@link #AUTHENTICATED} and {@link #OFFLINE_GRACE} unlock the client; every
 * gated feature asks {@link #isUnlocked()} instead of comparing states itself.
 */
public enum AuthState {
	/** No session. The client key opens the auth screen. */
	UNAUTHENTICATED,
	/** A register, login or silent refresh is in flight. */
	AUTHENTICATING,
	/** Tokens are valid and were confirmed by the backend. */
	AUTHENTICATED,
	/** The session was rejected by the backend or the offline grace period ran out. */
	EXPIRED,
	/** The backend is unreachable but a cached session is still inside its grace window. */
	OFFLINE_GRACE;

	/** @return {@code true} when the client features may be used. */
	public boolean isUnlocked() {
		return this == AUTHENTICATED || this == OFFLINE_GRACE;
	}
}
