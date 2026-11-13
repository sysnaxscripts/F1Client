package dev.f1client.gui;

import dev.f1client.F1Client;
import dev.f1client.auth.AuthError;
import dev.f1client.auth.AuthManager;
import dev.f1client.auth.AuthState;
import dev.f1client.auth.AuthValidator;
import dev.f1client.gui.widget.TextBox;
import dev.f1client.gui.widget.Widgets;
import dev.f1client.render.Fonts;
import dev.f1client.render.Icons;
import dev.f1client.render.RoundedRenderer;
import dev.f1client.render.Theme;
import dev.f1client.util.UiSounds;
import java.util.concurrent.CompletableFuture;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.input.CharInput;
import net.minecraft.client.input.KeyInput;
import net.minecraft.text.Text;

/**
 * Register / sign-in screen. This is the only client screen reachable while the account
 * gate is closed.
 *
 * <p>Passwords live in the masked {@link TextBox} buffers only for as long as the form is
 * open; they are handed to {@link AuthManager} as a {@code char[]} that it wipes, and the
 * fields are cleared after every attempt and when the screen closes.
 */
public final class AuthScreen extends UiScreen {
	private static final int WIDTH = 300;
	private static final int HEIGHT = 318;
	private static final int PAD = 28;
	private static final int FIELD_HEIGHT = 26;
	private static final int ERROR_COLOR = 0xFFFF7A7A;

	private final AuthManager auth = F1Client.get().auth();
	private final TextBox username = new TextBox(AuthValidator.USERNAME_MAX, false).placeholder("Username")
			.leadingIcon(Icons.USER).filter(c -> c == '_' || (c < 128 && Character.isLetterOrDigit(c)));
	private final TextBox password = new TextBox(AuthValidator.PASSWORD_MAX, true).placeholder("Password");
	private final TextBox confirm = new TextBox(AuthValidator.PASSWORD_MAX, true).placeholder("Repeat password");
	private final Anim stayAnim;
	private boolean registerMode;
	private boolean staySignedIn;
	private boolean busy;
	private boolean submitted;
	private String message = "";
	private boolean messageIsError;
	private int buttonY;
	private int toggleY;
	private int linkY;

	public AuthScreen() {
		super(Text.literal("F1Client account"), WIDTH, HEIGHT);
		registerMode = !auth.prefs().everSignedIn();
		staySignedIn = auth.prefs().staySignedIn();
		stayAnim = new Anim(staySignedIn ? 1f : 0f);
		username.setText(auth.prefs().lastUsername());
		Runnable clearMessage = () -> {
			if (messageIsError) {
				message = "";
			}
		};
		username.onChange(clearMessage);
		password.onChange(clearMessage);
		confirm.onChange(clearMessage);
		if (username.isEmpty()) {
			username.setFocused(true);
		} else {
			password.setFocused(true);
		}
		String notice = auth.notice();
		if (!notice.isEmpty()) {
			message = notice;
			messageIsError = true;
			auth.clearNotice();
		}
	}

	@Override
	protected void draw(DrawContext context, int mouseX, int mouseY) {
		busy = submitted || auth.state() == AuthState.AUTHENTICATING;
		RoundedRenderer.shadow(context, 0, 0, WIDTH, HEIGHT, Theme.RADIUS_WINDOW, 18, Theme.SHADOW);
		RoundedRenderer.panel(context, 0, 0, WIDTH, HEIGHT, Theme.RADIUS_WINDOW, Theme.WINDOW, Theme.OUTLINE);

		Icons.LOGO.draw(context, WIDTH / 2 - 13, 22, 26, Theme.get().accentColor());
		Fonts.TITLE.drawMiddle(context, registerMode ? "Create your account" : "Welcome back", WIDTH / 2, 64, Theme.TEXT);
		Fonts.REGULAR.drawMiddle(context, registerMode ? "An account unlocks F1Client." : "Sign in to unlock F1Client.",
				WIDTH / 2, 80, Theme.TEXT_MUTED);

		int fieldWidth = WIDTH - PAD * 2;
		int y = 98;
		username.render(context, PAD, y, fieldWidth, FIELD_HEIGHT, !busy);
		y += FIELD_HEIGHT + 8;
		password.render(context, PAD, y, fieldWidth, FIELD_HEIGHT, !busy);
		y += FIELD_HEIGHT + 8;
		if (registerMode) {
			confirm.render(context, PAD, y, fieldWidth, FIELD_HEIGHT, !busy);
			y += FIELD_HEIGHT + 8;
		}

		String hint = message.isEmpty() ? validationHint() : message;
		boolean error = !message.isEmpty() && messageIsError;
		Fonts.SMALL.drawCentered(context, Fonts.SMALL.ellipsize(hint, fieldWidth), PAD, y + 5, error ? ERROR_COLOR : Theme.TEXT_MUTED);
		y += 18;

		toggleY = y;
		stayAnim.set(staySignedIn);
		Fonts.REGULAR.drawCentered(context, "Stay signed in", PAD, y + Widgets.TOGGLE_HEIGHT / 2, Theme.TEXT);
		Widgets.toggle(context, WIDTH - PAD - Widgets.TOGGLE_WIDTH, y, stayAnim.value());
		y += Widgets.TOGGLE_HEIGHT + 14;

		buttonY = y;
		String label = busy ? (registerMode ? "Creating account…" : "Signing in…") : (registerMode ? "Create account" : "Sign in");
		Widgets.primaryButton(context, PAD, y, fieldWidth, 28, label, inside(mouseX, mouseY, PAD, y, fieldWidth, 28),
				canSubmit());
		y += 28 + 12;

		linkY = y;
		String question = registerMode ? "Already have an account?  " : "New to F1Client?  ";
		String action = registerMode ? "Sign in" : "Create an account";
		int total = Fonts.REGULAR.width(question) + Fonts.REGULAR.width(action);
		int left = (WIDTH - total) / 2;
		boolean linkHover = inside(mouseX, mouseY, PAD, y - 2, fieldWidth, 14);
		Fonts.REGULAR.drawCentered(context, question, left, y + 5, Theme.TEXT_MUTED);
		int actionX = left + Fonts.REGULAR.width(question);
		Fonts.REGULAR.drawCentered(context, action, actionX, y + 5, Theme.TEXT);
		if (linkHover) {
			context.fill(actionX, y + 11, actionX + Fonts.REGULAR.width(action), y + 12, Theme.TEXT);
		}

		if (F1Client.get().usesMockBackend()) {
			Fonts.SMALL.drawMiddle(context, "Local test accounts: no account server is configured", WIDTH / 2, HEIGHT - 12,
					Theme.TEXT_DISABLED);
		}
	}

	private String validationHint() {
		if (username.isEmpty() && password.isEmpty()) {
			return registerMode
					? "3 to 20 letters, numbers or _  ·  password of 8 or more characters"
					: "";
		}
		String problem = AuthValidator.username(username.text());
		if (problem == null && registerMode) {
			problem = AuthValidator.password(password.chars());
			if (problem == null) {
				problem = AuthValidator.confirmation(password.chars(), confirm.chars());
			}
		}
		return problem == null || !registerMode ? "" : problem;
	}

	private boolean canSubmit() {
		if (busy) {
			return false;
		}
		return registerMode
				? AuthValidator.canRegister(username.text(), password.chars(), confirm.chars())
				: !username.isEmpty() && !password.isEmpty();
	}

	private void submit() {
		if (!canSubmit()) {
			return;
		}
		UiSounds.click();
		submitted = true;
		message = "";
		char[] secret = password.toCharArray();
		String name = username.text();
		CompletableFuture<AuthError> attempt = registerMode
				? auth.register(name, secret, staySignedIn)
				: auth.login(name, secret, staySignedIn);
		password.clear();
		confirm.clear();
		attempt.whenComplete((error, failure) -> client.execute(() -> finished(error, failure)));
	}

	private void finished(AuthError error, Throwable failure) {
		submitted = false;
		if (failure != null) {
			error = AuthError.SERVER_ERROR;
		}
		if (error == null) {
			if (client.currentScreen == this) {
				client.setScreen(new ClickGuiScreen());
			}
			return;
		}
		message = error.message();
		messageIsError = true;
		focus(password);
	}

	private void focus(TextBox box) {
		username.setFocused(box == username);
		password.setFocused(box == password);
		confirm.setFocused(box == confirm);
	}

	@Override
	protected boolean onClick(int mouseX, int mouseY, int button) {
		if (button != 0 || busy) {
			return true;
		}
		int fieldWidth = WIDTH - PAD * 2;
		if (username.mouseClicked(mouseX, mouseY)) {
			focus(username);
		} else if (password.mouseClicked(mouseX, mouseY)) {
			focus(password);
		} else if (registerMode && confirm.mouseClicked(mouseX, mouseY)) {
			focus(confirm);
		} else if (inside(mouseX, mouseY, PAD, toggleY - 3, fieldWidth, Widgets.TOGGLE_HEIGHT + 6)) {
			staySignedIn = !staySignedIn;
			UiSounds.toggle(staySignedIn);
		} else if (inside(mouseX, mouseY, PAD, buttonY, fieldWidth, 28)) {
			submit();
		} else if (inside(mouseX, mouseY, PAD, linkY - 2, fieldWidth, 14)) {
			registerMode = !registerMode;
			message = "";
			confirm.clear();
			UiSounds.click();
			focus(username.isEmpty() ? username : password);
		}
		return true;
	}

	@Override
	protected boolean onKey(KeyInput input) {
		if (input.isEscape()) {
			return false;
		}
		if (busy) {
			return true;
		}
		if (input.isTab()) {
			TextBox[] order = registerMode ? new TextBox[] {username, password, confirm} : new TextBox[] {username, password};
			int current = 0;
			for (int i = 0; i < order.length; i++) {
				if (order[i].isFocused()) {
					current = i;
				}
			}
			int step = input.hasShift() ? order.length - 1 : 1;
			focus(order[(current + step) % order.length]);
			return true;
		}
		if (input.isEnter()) {
			if (username.isFocused() && password.isEmpty()) {
				focus(password);
			} else if (registerMode && password.isFocused() && confirm.isEmpty()) {
				focus(confirm);
			} else {
				submit();
			}
			return true;
		}
		if (username.isFocused()) {
			username.keyPressed(input);
		} else if (password.isFocused()) {
			password.keyPressed(input);
		} else if (confirm.isFocused()) {
			confirm.keyPressed(input);
		}
		return true;
	}

	@Override
	protected boolean onChar(CharInput input) {
		if (busy) {
			return true;
		}
		if (username.isFocused()) {
			return username.charTyped(input);
		}
		if (password.isFocused()) {
			return password.charTyped(input);
		}
		return registerMode && confirm.isFocused() && confirm.charTyped(input);
	}

	@Override
	public void tick() {
		// A silent session restore can finish while this screen is open.
		if (!submitted && auth.isUnlocked() && client.currentScreen == this) {
			client.setScreen(new ClickGuiScreen());
		}
	}

	@Override
	public void removed() {
		password.clear();
		confirm.clear();
		super.removed();
	}
}
