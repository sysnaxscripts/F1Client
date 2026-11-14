package com.example.f1.gui.control;

import com.example.f1.gui.widget.TextBox;
import com.example.f1.setting.StringSetting;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;

/** Label with a text field. */
final class StringControl extends SettingControl<StringSetting> {
	private final TextBox field;
	private boolean active;

	StringControl(StringSetting setting) {
		super(setting);
		// Built through a local first: the change listener reads the field, and a blank final
		// may not be read from its own initialiser.
		TextBox box = new TextBox(setting.getMaxLength()).placeholder("Empty");
		this.field = box;
		box.onChange(() -> setting.set(box.text()));
		box.setText(setting.get());
	}

	@Override
	public void render(GuiGraphics context, int mouseX, int mouseY) {
		// A value changed from outside (a reset, a loaded profile) has to reach the field.
		if (!active && !setting.get().equals(field.text())) {
			field.setText(setting.get());
		}
		label(context);
		int fieldWidth = Math.min(width - 100, 150);
		field.render(context, x + width - fieldWidth, y + 4, fieldWidth, 16, true);
	}

	@Override
	protected boolean onClick(int mouseX, int mouseY) {
		active = field.mouseClicked(mouseX, mouseY);
		return active;
	}

	@Override
	protected boolean onClickOutside() {
		active = false;
		field.setFocused(false);
		return false;
	}

	@Override
	protected void onReset() {
		active = false;
		field.setFocused(false);
		field.setText(setting.get());
	}

	@Override
	public boolean keyPressed(KeyEvent input) {
		return field.keyPressed(input);
	}

	@Override
	public boolean charTyped(CharacterEvent input) {
		return field.charTyped(input);
	}

	@Override
	public boolean capturesKeyboard() {
		return field.isFocused();
	}

	/** Drops focus, e.g. when the settings panel scrolls away. */
	public void blur() {
		active = false;
		field.setFocused(false);
	}
}
