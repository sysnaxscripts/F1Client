package dev.f1client.auth;

import java.util.Objects;

/**
 * Tokens issued by the backend for one account.
 *
 * @param username          canonical account name as returned by the server
 * @param accessToken       short-lived bearer token
 * @param refreshToken      long-lived token used to mint new access tokens
 * @param accessExpiresAtMs epoch milliseconds at which the access token stops working
 */
public record AuthSession(String username, String accessToken, String refreshToken, long accessExpiresAtMs) {
	public AuthSession {
		Objects.requireNonNull(username, "username");
		Objects.requireNonNull(accessToken, "accessToken");
		Objects.requireNonNull(refreshToken, "refreshToken");
	}

	/** Tokens are secrets, so they are deliberately left out of the string form. */
	@Override
	public String toString() {
		return "AuthSession[username=" + username + ", accessExpiresAtMs=" + accessExpiresAtMs + "]";
	}
}
