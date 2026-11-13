package dev.f1client.auth;

import java.util.regex.Pattern;

/**
 * Inline validation rules of the auth screen. Runs before any network call.
 *
 * <p>Each method returns {@code null} for valid input or the per-field error text.
 */
public final class AuthValidator {
	public static final int USERNAME_MIN = 3;
	public static final int USERNAME_MAX = 20;
	public static final int PASSWORD_MIN = 8;
	public static final int PASSWORD_MAX = 128;

	private static final Pattern USERNAME = Pattern.compile("[A-Za-z0-9_]{" + USERNAME_MIN + "," + USERNAME_MAX + "}");

	private AuthValidator() {
	}

	/** @return error text or {@code null} when the username is acceptable. */
	public static String username(String username) {
		if (username == null || username.isEmpty()) {
			return "Enter a username.";
		}
		if (username.length() < USERNAME_MIN) {
			return "At least " + USERNAME_MIN + " characters.";
		}
		if (username.length() > USERNAME_MAX) {
			return "At most " + USERNAME_MAX + " characters.";
		}
		if (!USERNAME.matcher(username).matches()) {
			return "Letters, numbers and underscore only.";
		}
		return null;
	}

	/** @return error text or {@code null} when the password is acceptable. */
	public static String password(CharSequence password) {
		if (password == null || password.length() == 0) {
			return "Enter a password.";
		}
		if (password.length() < PASSWORD_MIN) {
			return "At least " + PASSWORD_MIN + " characters.";
		}
		if (password.length() > PASSWORD_MAX) {
			return "At most " + PASSWORD_MAX + " characters.";
		}
		return null;
	}

	/** @return error text or {@code null} when the confirmation matches the password. */
	public static String confirmation(CharSequence password, CharSequence confirmation) {
		if (confirmation == null || confirmation.length() == 0) {
			return "Repeat the password.";
		}
		if (password == null || !contentEquals(password, confirmation)) {
			return "Passwords don't match.";
		}
		return null;
	}

	/** @return {@code true} when a login form may be submitted. */
	public static boolean canLogin(String username, CharSequence password) {
		return username(username) == null && password(password) == null;
	}

	/** @return {@code true} when a register form may be submitted. */
	public static boolean canRegister(String username, CharSequence password, CharSequence confirmation) {
		return canLogin(username, password) && confirmation(password, confirmation) == null;
	}

	private static boolean contentEquals(CharSequence a, CharSequence b) {
		if (a.length() != b.length()) {
			return false;
		}
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
