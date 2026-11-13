package dev.f1client.gui.control;

import dev.f1client.gui.widget.TextBox;
import dev.f1client.setting.StringSetting;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.input.CharInput;
import net.minecraft.client.input.KeyInput;

/** Label with an inline text field. */
final class StringControl extends SettingControl<StringSetting> {
	private final TextBox box;

	StringControl(StringSetting setting) {
		super(setting);
		this.box = new TextBox(setting.maxLength(), false);
		this.box.setText(setting.get());
		this.box.onChange(() -> setting.set(box.text()));
	}

	@Override
	public void render(DrawContext context, int mouseX, int mouseY) {
		label(context);
		int boxWidth = Math.min(110, width / 2);
		box.render(context, x + width - boxWidth, y + 3, boxWidth, 18, true);
	}

	@Override
	protected boolean onClick(int mouseX, int mouseY) {
		if (!box.mouseClicked(mouseX, mouseY)) {
			box.setFocused(false);
		}
		return true;
	}

	@Override
	protected boolean onClickOutside() {
		box.setFocused(false);
		return false;
	}

	@Override
	protected void onReset() {
		box.setText(setting.get());
	}

	@Override
	public boolean keyPressed(KeyInput input) {
		if (input.isEnter() || input.isEscape()) {
			boolean was = box.isFocused();
			box.setFocused(false);
			return was;
		}
		return box.keyPressed(input) || box.isFocused();
	}

	@Override
	public boolean charTyped(CharInput input) {
		return box.charTyped(input);
	}

	@Override
	public boolean capturesKeyboard() {
		return box.isFocused();
	}
}
