package dev.f1client.auth;

/**
 * Transport-independent contract of the account service.
 *
 * <p>All methods block and are called off the render thread by {@link AuthManager}.
 * Password arrays are owned by the caller, which wipes them after the call returns.
 */
public interface AuthBackend {
	/** {@code POST /auth/register}: creates an account and signs it in. */
	AuthSession register(String username, char[] password) throws AuthException;

	/** {@code POST /auth/login}: signs an existing account in. */
	AuthSession login(String username, char[] password) throws AuthException;

	/** {@code POST /auth/refresh}: trades a refresh token for a fresh token pair. */
	AuthSession refresh(String refreshToken) throws AuthException;

	/** {@code GET /auth/me}: returns the account name the access token belongs to. */
	String me(String accessToken) throws AuthException;

	/** {@code POST /auth/logout}: revokes the session server-side. */
	void logout(String accessToken, String refreshToken) throws AuthException;
}
