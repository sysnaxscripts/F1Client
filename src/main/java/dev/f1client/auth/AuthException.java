package dev.f1client.auth;

/** Checked failure of a backend call. Never carries credentials in its message. */
public final class AuthException extends Exception {
	private static final long serialVersionUID = 1L;

	private final AuthError error;

	public AuthException(AuthError error) {
		super(error.message());
		this.error = error;
	}

	public AuthException(AuthError error, Throwable cause) {
		super(error.message(), cause);
		this.error = error;
	}

	/** @return the failure category. */
	public AuthError error() {
		return error;
	}
}
