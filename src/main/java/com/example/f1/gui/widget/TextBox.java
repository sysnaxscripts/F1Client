package com.example.f1.gui.widget;

import com.example.f1.render.Fonts;
import com.example.f1.render.Icons;
import com.example.f1.render.Theme;
import java.util.function.IntPredicate;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;
import org.lwjgl.glfw.GLFW;

/**
 * A single-line text field in the client's own style.
 *
 * <p>Vanilla's {@code EditBox} carries its own rendering and its own focus model, which
 * would not match the rest of the interface and would fight the design-unit transform.
 * This one draws with {@link Widgets#inset}, keeps a caret and a horizontal scroll offset,
 * and accepts a filter so a profile-name field can reject characters that would not be
 * valid in a file name.
 *
 * <p>Editing is keyboard-driven: arrows, Home, End, Backspace, Delete and Enter. Escape is
 * reported rather than consumed so the screen can decide whether it closes or blurs.
 */
public final class TextBox {
	/** Height of the caret, in units. */
	private static final int CARET_HEIGHT = 9;
	/** Caret blink period in milliseconds. */
	private static final long BLINK_MS = 1000L;

	private final StringBuilder value = new StringBuilder();
	private final int maxLength;
	private String placeholder = "";
	private IntPredicate filter = codePoint -> true;
	private Runnable onChange = () -> {
	};
	private Runnable onEnter = () -> {
	};
	private Icons leadingIcon;
	private boolean focused;
	private int caret;
	private int scroll;
	private int x;
	private int y;
	private int width;
	private int height;
	private String shown = "";
	private boolean shownDirty = true;

	/**
	 * @param maxLength longest accepted text
	 */
	public TextBox(int maxLength) {
		this.maxLength = Math.max(1, maxLength);
	}

	/** Sets the grey text shown while the field is empty. @return this, for chaining. */
	public TextBox placeholder(String text) {
		placeholder = text == null ? "" : text;
		return this;
	}

	/** Restricts which code points may be typed. @return this, for chaining. */
	public TextBox filter(IntPredicate allowed) {
		filter = allowed == null ? codePoint -> true : allowed;
		return this;
	}

	/** Called after every edit. @return this, for chaining. */
	public TextBox onChange(Runnable listener) {
		onChange = listener == null ? () -> {
		} : listener;
		return this;
	}

	/** Called when Enter is pressed. @return this, for chaining. */
	public TextBox onEnter(Runnable listener) {
		onEnter = listener == null ? () -> {
		} : listener;
		return this;
	}

	/** Sets the icon drawn at the left of the field. @return this, for chaining. */
	public TextBox leadingIcon(Icons icon) {
		leadingIcon = icon;
		return this;
	}

	/** @return the current text. */
	public String text() {
		return value.toString();
	}

	/** @return whether the field is empty. */
	public boolean isEmpty() {
		return value.length() == 0;
	}

	/** Replaces the text, clamping the caret and dropping the cached layout. */
	public void setText(String text) {
		value.setLength(0);
		if (text != null) {
			value.append(text, 0, Math.min(text.length(), maxLength));
		}
		caret = value.length();
		shownDirty = true;
	}

	/** Empties the field. */
	public void clear() {
		setText("");
	}

	/** @return whether the field holds keyboard focus. */
	public boolean isFocused() {
		return focused;
	}

	/** Gives or takes focus; taking it moves the caret to the end. */
	public void setFocused(boolean value) {
		focused = value;
		if (value) {
			caret = this.value.length();
		}
	}

	/** @return whether the point lies inside the field at its last drawn position. */
	public boolean contains(int mouseX, int mouseY) {
		return mouseX >= x && mouseX < x + width && mouseY >= y && mouseY < y + height;
	}

	/**
	 * Handles a click: focuses the field and puts the caret under the cursor.
	 *
	 * @return whether the click landed inside the field
	 */
	public boolean mouseClicked(int mouseX, int mouseY) {
		if (!contains(mouseX, mouseY)) {
			return false;
		}
		focused = true;
		caret = indexAt(mouseX);
		return true;
	}

	/**
	 * Handles a key press.
	 *
	 * @return whether the key was used
	 */
	public boolean keyPressed(KeyEvent input) {
		if (!focused) {
			return false;
		}
		int key = input.key();
		if (key == GLFW.GLFW_KEY_BACKSPACE) {
			if (caret > 0) {
				value.deleteCharAt(caret - 1);
				caret--;
				changed();
			}
			return true;
		}
		if (key == GLFW.GLFW_KEY_DELETE) {
			if (caret < value.length()) {
				value.deleteCharAt(caret);
				changed();
			}
			return true;
		}
		if (key == GLFW.GLFW_KEY_LEFT) {
			caret = Math.max(0, caret - 1);
			shownDirty = true;
			return true;
		}
		if (key == GLFW.GLFW_KEY_RIGHT) {
			caret = Math.min(value.length(), caret + 1);
			shownDirty = true;
			return true;
		}
		if (key == GLFW.GLFW_KEY_HOME) {
			caret = 0;
			shownDirty = true;
			return true;
		}
		if (key == GLFW.GLFW_KEY_END) {
			caret = value.length();
			shownDirty = true;
			return true;
		}
		if (key == GLFW.GLFW_KEY_ENTER || key == GLFW.GLFW_KEY_KP_ENTER) {
			onEnter.run();
			return true;
		}
		return false;
	}

	/**
	 * Handles a typed character.
	 *
	 * @return whether the character was used
	 */
	public boolean charTyped(CharacterEvent input) {
		if (!focused || !input.isAllowedChatCharacter()) {
			return false;
		}
		insert(input.codepointAsString());
		return true;
	}

	/** Inserts text at the caret, dropping whatever the filter rejects. */
	private void insert(String text) {
		for (int i = 0; i < text.length(); i++) {
			if (value.length() >= maxLength) {
				return;
			}
			char character = text.charAt(i);
			if (!filter.test(character)) {
				continue;
			}
			value.insert(caret, character);
			caret++;
		}
		changed();
	}

	private void changed() {
		shownDirty = true;
		onChange.run();
	}

	/** @return the text to draw: the value, or the placeholder while empty and unfocused. */
	private String display() {
		if (value.length() == 0) {
			return focused ? "" : placeholder;
		}
		return value.toString();
	}

	/** @return the x of the first character, after the icon and the left padding. */
	private int textLeft() {
		return x + 6 + (leadingIcon == null ? 0 : 13);
	}

	/** @return the caret index nearest to a mouse x coordinate. */
	private int indexAt(int mouseX) {
		String text = display();
		int available = mouseX - textLeft() + scroll;
		int best = 0;
		for (int i = 1; i <= text.length(); i++) {
			if (Math.abs(Fonts.REGULAR.width(text.substring(0, i)) - available)
					< Math.abs(Fonts.REGULAR.width(text.substring(0, best)) - available)) {
				best = i;
			}
		}
		return best;
	}

	/**
	 * Draws the field. Also records the position, so a later click can be mapped onto it.
	 *
	 * @param enabled when false the field is drawn dimmed and cannot be focused
	 */
	public void render(GuiGraphics context, int x, int y, int width, int height, boolean enabled) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		if (shownDirty) {
			shownDirty = false;
			shown = display();
		}
		// Keep the caret inside the field.
		int caretX = Fonts.REGULAR.width(shown.substring(0, Math.min(caret, shown.length())));
		int available = width - 12 - (leadingIcon == null ? 0 : 13);
		if (caretX - scroll > available) {
			scroll = caretX - available;
		} else if (caretX - scroll < 0) {
			scroll = caretX;
		}
		scroll = Math.max(0, scroll);

		Widgets.inset(context, x, y, width, height, height / 2,
				!enabled ? Theme.OUTLINE : focused ? Theme.get().accent(0xB4) : Theme.OUTLINE);
		if (leadingIcon != null) {
			leadingIcon.draw(context, x + 6, y + (height - 9) / 2, 9,
					value.length() == 0 && !focused ? Theme.TEXT_DISABLED : Theme.TEXT_MUTED);
		}
		int centerY = y + height / 2;
		if (shown.isEmpty()) {
			return;
		}
		int color = value.length() == 0 ? Theme.TEXT_DISABLED : enabled ? Theme.TEXT : Theme.TEXT_MUTED;
		context.enableScissor(textLeft(), y, x + width - 6, y + height);
		Fonts.REGULAR.drawCentered(context, shown, textLeft() - scroll, centerY, color);
		if (focused && enabled && (System.currentTimeMillis() / BLINK_MS) % 2 == 0) {
			int barX = textLeft() + caretX - scroll;
			context.fill(barX, centerY - CARET_HEIGHT / 2, barX + 1, centerY + CARET_HEIGHT / 2 + 1,
					Theme.get().accentColor());
		}
		context.disableScissor();
	}

	@Override
	public String toString() {
		return value.toString();
	}
}
