package dev.f1client.gui.widget;

import dev.f1client.render.Fonts;
import dev.f1client.render.Icons;
import dev.f1client.render.RoundedRenderer;
import dev.f1client.render.Theme;
import java.util.Arrays;
import java.util.function.IntPredicate;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.input.CharInput;
import net.minecraft.client.input.KeyInput;
import org.lwjgl.glfw.GLFW;

/**
 * Single-line text input drawn in the F1Client style.
 *
 * <p>Supports caret movement, select-all, clipboard paste, an optional character filter
 * and a masked mode with a reveal toggle for passwords. A masked field never copies its
 * content to the clipboard.
 */
public final class TextBox {
	private static final String BULLETS = "•".repeat(160);
	private static final int EYE_SIZE = 10;

	private final StringBuilder value = new StringBuilder();
	private final int maxLength;
	private final boolean masked;
	private String placeholder = "";
	private IntPredicate filter = codePoint -> true;
	private Runnable onChange = () -> { };
	private Icons leadingIcon;
	private boolean focused;
	private boolean revealed;
	private boolean allSelected;
	private int caret;
	private int scroll;
	private int x;
	private int y;
	private int width;
	private int height;
	private String shown = "";
	private boolean shownDirty = true;

	/**
	 * @param maxLength maximum number of characters
	 * @param masked    whether the content is hidden behind bullets
	 */
	public TextBox(int maxLength, boolean masked) {
		this.maxLength = maxLength;
		this.masked = masked;
	}

	public TextBox placeholder(String text) {
		this.placeholder = text;
		return this;
	}

	/** Restricts which characters may be typed or pasted. */
	public TextBox filter(IntPredicate allowed) {
		this.filter = allowed;
		return this;
	}

	public TextBox onChange(Runnable listener) {
		this.onChange = listener;
		return this;
	}

	public TextBox leadingIcon(Icons icon) {
		this.leadingIcon = icon;
		return this;
	}

	/** @return the current content. */
	public String text() {
		return value.toString();
	}

	/** @return the content as a live character sequence (no copy). */
	public CharSequence chars() {
		return value;
	}

	/** @return the content copied into a fresh array the caller may wipe. */
	public char[] toCharArray() {
		char[] copy = new char[value.length()];
		value.getChars(0, value.length(), copy, 0);
		return copy;
	}

	public boolean isEmpty() {
		return value.length() == 0;
	}

	/** Replaces the content. */
	public void setText(String text) {
		value.setLength(0);
		value.append(text, 0, Math.min(text.length(), maxLength));
		caret = value.length();
		allSelected = false;
		changed();
	}

	/** Empties the field, overwriting the old characters first. */
	public void clear() {
		for (int i = 0; i < value.length(); i++) {
			value.setCharAt(i, '\0');
		}
		value.setLength(0);
		caret = 0;
		scroll = 0;
		allSelected = false;
		changed();
	}

	public boolean isFocused() {
		return focused;
	}

	public void setFocused(boolean focused) {
		this.focused = focused;
		if (!focused) {
			allSelected = false;
		}
	}

	/** @return whether the point is inside the field as last drawn. */
	public boolean contains(int mouseX, int mouseY) {
		return mouseX >= x && mouseY >= y && mouseX < x + width && mouseY < y + height;
	}

	/**
	 * Handles a click: focuses the field, toggles password reveal, or places the caret.
	 *
	 * @return whether the click landed on the field
	 */
	public boolean mouseClicked(int mouseX, int mouseY) {
		if (!contains(mouseX, mouseY)) {
			return false;
		}
		focused = true;
		allSelected = false;
		if (masked && mouseX >= x + width - EYE_SIZE - 10) {
			revealed = !revealed;
			shownDirty = true;
			return true;
		}
		int local = mouseX - textLeft() + scroll;
		String display = display();
		int index = 0;
		while (index < display.length() && Fonts.REGULAR.width(display.substring(0, index + 1)) <= local) {
			index++;
		}
		caret = index;
		return true;
	}

	/** @return whether the key was consumed. */
	public boolean keyPressed(KeyInput input) {
		if (!focused) {
			return false;
		}
		if (input.isSelectAll()) {
			allSelected = value.length() > 0;
			caret = value.length();
			return true;
		}
		if (input.isPaste()) {
			insert(MinecraftClient.getInstance().keyboard.getClipboard());
			return true;
		}
		if (input.isCopy() || input.isCut()) {
			if (!masked && value.length() > 0) {
				MinecraftClient.getInstance().keyboard.setClipboard(value.toString());
				if (input.isCut()) {
					clear();
				}
			}
			return true;
		}
		switch (input.key()) {
			case GLFW.GLFW_KEY_BACKSPACE -> {
				if (allSelected) {
					clear();
				} else if (caret > 0) {
					value.deleteCharAt(--caret);
					changed();
				}
				return true;
			}
			case GLFW.GLFW_KEY_DELETE -> {
				if (allSelected) {
					clear();
				} else if (caret < value.length()) {
					value.deleteCharAt(caret);
					changed();
				}
				return true;
			}
			case GLFW.GLFW_KEY_LEFT -> {
				caret = allSelected ? 0 : Math.max(0, caret - 1);
				allSelected = false;
				return true;
			}
			case GLFW.GLFW_KEY_RIGHT -> {
				caret = allSelected ? value.length() : Math.min(value.length(), caret + 1);
				allSelected = false;
				return true;
			}
			case GLFW.GLFW_KEY_HOME -> {
				caret = 0;
				allSelected = false;
				return true;
			}
			case GLFW.GLFW_KEY_END -> {
				caret = value.length();
				allSelected = false;
				return true;
			}
			default -> {
				return false;
			}
		}
	}

	/** @return whether the character was consumed. */
	public boolean charTyped(CharInput input) {
		if (!focused || !input.isValidChar()) {
			return false;
		}
		insert(input.asString());
		return true;
	}

	private void insert(String text) {
		if (text == null || text.isEmpty()) {
			return;
		}
		if (allSelected) {
			clear();
		}
		boolean any = false;
		for (int i = 0; i < text.length() && value.length() < maxLength; i++) {
			char c = text.charAt(i);
			if (c >= ' ' && c != 127 && filter.test(c)) {
				value.insert(caret++, c);
				any = true;
			}
		}
		if (any) {
			changed();
		}
	}

	private void changed() {
		shownDirty = true;
		caret = Math.min(caret, value.length());
		onChange.run();
	}

	private String display() {
		if (shownDirty) {
			shown = masked && !revealed ? BULLETS.substring(0, Math.min(BULLETS.length(), value.length())) : value.toString();
			shownDirty = false;
		}
		return shown;
	}

	private int textLeft() {
		return x + (leadingIcon != null ? 24 : 9);
	}

	/**
	 * Draws the field and remembers its bounds for hit testing.
	 *
	 * @param enabled dimmed and without caret when {@code false}
	 */
	public void render(DrawContext context, int x, int y, int width, int height, boolean enabled) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		RoundedRenderer.panel(context, x, y, width, height, Math.min(Theme.RADIUS_CARD, height / 2), Theme.INPUT,
				focused && enabled ? Theme.OUTLINE_STRONG : Theme.OUTLINE);
		int centerY = y + height / 2;
		if (leadingIcon != null) {
			leadingIcon.draw(context, x + 9, centerY - 5, 10, Theme.TEXT_MUTED);
		}
		int left = textLeft();
		int right = x + width - (masked ? EYE_SIZE + 14 : 9);
		String display = display();
		if (display.isEmpty()) {
			Fonts.REGULAR.drawCentered(context, placeholder, left, centerY, Theme.TEXT_DISABLED);
		}
		int caretOffset = caret >= display.length() ? Fonts.REGULAR.width(display) : Fonts.REGULAR.width(display.substring(0, caret));
		int visible = right - left;
		if (caretOffset - scroll > visible - 2) {
			scroll = caretOffset - visible + 2;
		} else if (caretOffset - scroll < 0) {
			scroll = caretOffset;
		}
		if (Fonts.REGULAR.width(display) <= visible) {
			scroll = 0;
		}
		context.enableScissor(left, y, right, y + height);
		if (allSelected && !display.isEmpty()) {
			context.fill(left - scroll, centerY - 6, left - scroll + Fonts.REGULAR.width(display), centerY + 6,
					Theme.withAlpha(Theme.get().accentColor(), 0x40));
		}
		Fonts.REGULAR.drawCentered(context, display, left - scroll, centerY, enabled ? Theme.TEXT : Theme.TEXT_MUTED);
		context.disableScissor();
		if (focused && enabled && (System.currentTimeMillis() / 530L) % 2L == 0L) {
			int caretX = left + caretOffset - scroll;
			context.fill(caretX, centerY - 5, caretX + 1, centerY + 5, Theme.get().accentColor());
		}
		if (masked) {
			(revealed ? Icons.EYE_OFF : Icons.EYE).draw(context, x + width - EYE_SIZE - 8, centerY - EYE_SIZE / 2, EYE_SIZE,
					Theme.TEXT_MUTED);
		}
	}

	@Override
	public String toString() {
		char[] hidden = new char[value.length()];
		Arrays.fill(hidden, '*');
		return "TextBox[" + new String(hidden) + "]";
	}
}
