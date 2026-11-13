package dev.f1client.auth;

/** Failure categories reported by an {@link AuthBackend}, each with a banner message. */
public enum AuthError {
	INVALID_CREDENTIALS("Wrong username or password."),
	NAME_TAKEN("That username is already taken."),
	RATE_LIMITED("Too many attempts. Wait a moment and try again."),
	OFFLINE("Can't reach the F1Client servers. Check your connection."),
	UNAUTHORIZED("Your session expired. Sign in again."),
	INVALID_REQUEST("The server rejected the request."),
	SERVER_ERROR("The server had a problem. Try again shortly."),
	BUSY("Still signing in. One moment.");

	private final String message;

	AuthError(String message) {
		this.message = message;
	}

	/** @return text suitable for the auth screen error banner. */
	public String message() {
		return message;
	}
}
