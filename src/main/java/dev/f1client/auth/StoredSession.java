package dev.f1client.auth;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 * A session as persisted on disk, plus the time it was last confirmed online.
 *
 * @param session           the token pair
 * @param lastValidatedAtMs epoch milliseconds of the last successful backend contact,
 *                          the anchor of the offline grace window
 */
public record StoredSession(AuthSession session, long lastValidatedAtMs) {
	JsonObject toJson() {
		JsonObject json = new JsonObject();
		json.addProperty("username", session.username());
		json.addProperty("accessToken", session.accessToken());
		json.addProperty("refreshToken", session.refreshToken());
		json.addProperty("accessExpiresAtMs", session.accessExpiresAtMs());
		json.addProperty("lastValidatedAtMs", lastValidatedAtMs);
		return json;
	}

	static StoredSession fromJson(JsonObject json) {
		try {
			AuthSession session = new AuthSession(
					json.get("username").getAsString(),
					json.get("accessToken").getAsString(),
					json.get("refreshToken").getAsString(),
					json.get("accessExpiresAtMs").getAsLong());
			return new StoredSession(session, json.get("lastValidatedAtMs").getAsLong());
		} catch (RuntimeException e) {
			throw new JsonParseException("Malformed session payload");
		}
	}
}
