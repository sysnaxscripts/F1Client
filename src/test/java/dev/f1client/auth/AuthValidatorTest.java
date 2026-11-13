package dev.f1client.auth;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AuthValidatorTest {
	@Test
	public void usernameLengthBounds() {
		assertNotNull(AuthValidator.username("ab"));
		assertNull(AuthValidator.username("abc"));
		assertNull(AuthValidator.username("a".repeat(20)));
		assertNotNull(AuthValidator.username("a".repeat(21)));
		assertNotNull(AuthValidator.username(""));
	}

	@Test
	public void usernameCharset() {
		assertNull(AuthValidator.username("Driver_44"));
		assertNotNull(AuthValidator.username("no spaces"));
		assertNotNull(AuthValidator.username("dash-ed"));
		assertNotNull(AuthValidator.username("ünïcode"));
	}

	@Test
	public void passwordMinimumLength() {
		assertNotNull(AuthValidator.password("1234567"));
		assertNull(AuthValidator.password("12345678"));
	}

	@Test
	public void confirmationMustMatch() {
		assertNull(AuthValidator.confirmation("hunter2hunter2", "hunter2hunter2"));
		assertNotNull(AuthValidator.confirmation("hunter2hunter2", "hunter2hunter3"));
	}

	@Test
	public void submitEnabledOnlyWhenEveryFieldIsValid() {
		assertTrue(AuthValidator.canLogin("driver", "password1"));
		assertFalse(AuthValidator.canLogin("dr", "password1"));
		assertFalse(AuthValidator.canLogin("driver", "short"));
		assertTrue(AuthValidator.canRegister("driver", "password1", "password1"));
		assertFalse(AuthValidator.canRegister("driver", "password1", "password2"));
		assertFalse(AuthValidator.canRegister("driver", "password1", ""));
	}
}
