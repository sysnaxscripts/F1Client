package com.example.f1.gui.control;

import com.example.f1.gui.widget.Widgets;
import com.example.f1.render.Fonts;
import com.example.f1.render.Theme;
import com.example.f1.setting.Setting;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;

/**
 * UI control for one {@link Setting}: draws the row and turns mouse and keyboard input into
 * value changes. One subclass exists per setting type; {@link SettingControls} picks the
 * right one for a setting.
 *
 * <p>A control is positioned every frame by {@link #place(int, int, int)} and then drawn,
 * which lets a row change height while it animates without the screen re-laying out.
 *
 * @param <S> the setting type this control edits
 */
public abstract class SettingControl<S extends Setting<?>> {
	/** Height of a plain single-line row. */
	protected static final int ROW = Widgets.ROW;

	protected final S setting;
	protected int x;
	protected int y;
	protected int width;

	protected SettingControl(S setting) {
		this.setting = setting;
	}

	/** @return the setting behind this control. */
	public final S setting() {
		return setting;
	}

	/** @return current height of the control in design units; may change while expanded. */
	public int height() {
		return ROW;
	}

	/** Positions the control; called every frame before {@link #render}. */
	public final void place(int x, int y, int width) {
		this.x = x;
		this.y = y;
		this.width = width;
	}

	/** Draws the control at its placed position. */
	public abstract void render(GuiGraphics context, int mouseX, int mouseY);

	/**
	 * Handles a click inside the row. A right click resets the setting, as the hint bar
	 * promises; other buttons go to {@link #onClick}.
	 *
	 * @return whether the click was used
	 */
	public final boolean mouseClicked(int mouseX, int mouseY, int button) {
		if (!contains(mouseX, mouseY)) {
			return onClickOutside();
		}
		if (button == 1) {
			setting.reset();
			onReset();
			return true;
		}
		return button == 0 && onClick(mouseX, mouseY);
	}

	protected boolean onClick(int mouseX, int mouseY) {
		return false;
	}

	/** Called for clicks that miss the row, so controls can drop keyboard focus. */
	protected boolean onClickOutside() {
		return false;
	}

	protected void onReset() {
	}

	public void mouseDragged(int mouseX, int mouseY) {
	}

	public void mouseReleased() {
	}

	/** @return whether the key was used. */
	public boolean keyPressed(KeyEvent input) {
		return false;
	}

	/** @return whether the character was used. */
	public boolean charTyped(CharacterEvent input) {
		return false;
	}

	/** @return whether the control currently wants all keyboard input (text entry, key capture). */
	public boolean capturesKeyboard() {
		return false;
	}

	/** @return whether the point is inside the row. */
	public final boolean contains(int mouseX, int mouseY) {
		return mouseX >= x && mouseX < x + width && mouseY >= y && mouseY < y + height();
	}

	/** Draws the setting name on the left of the first row. */
	protected final void label(GuiGraphics context) {
		Fonts.REGULAR.drawCentered(context, setting.getName(), x, y + ROW / 2, Theme.TEXT);
	}
}
