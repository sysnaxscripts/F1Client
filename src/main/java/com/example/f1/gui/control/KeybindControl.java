package com.example.f1.gui.control;

import com.example.f1.gui.widget.Widgets;
import com.example.f1.render.Fonts;
import com.example.f1.render.Theme;
import com.example.f1.setting.KeybindSetting;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.input.KeyEvent;
import org.lwjgl.glfw.GLFW;

/**
 * Label with a key pill: click it, then press a key to bind. Escape or Backspace unbinds.
 *
 * <p>While listening the control reports {@link #capturesKeyboard()}, so the screen routes
 * every key here instead of closing itself or toggling a module.
 */
public final class KeybindControl extends SettingControl<KeybindSetting> {
	private boolean listening;

	public KeybindControl(KeybindSetting setting) {
		super(setting);
	}

	@Override
	public void render(GuiGraphics context, int mouseX, int mouseY) {
		label(context);
		String text = listening ? "Press a key\u2026" : setting.displayName();
		int pill = Math.max(58, Fonts.REGULAR.width(text) + 18);
		int pillX = x + width - pill;
		Widgets.inset(context, pillX, y + 4, pill, 16, 8, listening ? Theme.get().accent(0xB4)
				: contains(mouseX, mouseY) ? Theme.OUTLINE_STRONG : Theme.OUTLINE);
		Fonts.SMALL.drawMiddle(context, text, pillX + pill / 2, y + 12,
				listening ? Theme.get().accentColor() : Theme.TEXT);
	}

	@Override
	protected boolean onClick(int mouseX, int mouseY) {
		listening = !listening;
		return true;
	}

	@Override
	protected boolean onClickOutside() {
		listening = false;
		return false;
	}

	@Override
	protected void onReset() {
		listening = false;
	}

	@Override
	public boolean keyPressed(KeyEvent input) {
		if (!listening) {
			return false;
		}
		int key = input.key();
		if (input.isEscape() || key == GLFW.GLFW_KEY_BACKSPACE || key == GLFW.GLFW_KEY_DELETE) {
			setting.unbind();
		} else {
			setting.set(key);
		}
		listening = false;
		return true;
	}

	@Override
	public boolean capturesKeyboard() {
		return listening;
	}

	/** @return whether the control is waiting for a key. */
	public boolean isListening() {
		return listening;
	}

	/** Drops the listening state without changing the binding. */
	public void cancel() {
		listening = false;
	}
}
