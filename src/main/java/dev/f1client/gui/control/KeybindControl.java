package dev.f1client.gui.control;

import dev.f1client.gui.widget.Widgets;
import dev.f1client.render.Fonts;
import dev.f1client.setting.KeybindSetting;
import dev.f1client.util.KeyNames;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.input.KeyInput;

/** Label with a key pill: click, then press a key to bind; Escape or Backspace unbinds. */
public final class KeybindControl extends SettingControl<KeybindSetting> {
	private boolean listening;

	public KeybindControl(KeybindSetting setting) {
		super(setting);
	}

	@Override
	public void render(DrawContext context, int mouseX, int mouseY) {
		label(context);
		String text = listening ? "Press a key…" : KeyNames.of(setting.get());
		int pill = Math.max(54, Fonts.REGULAR.width(text) + 18);
		Widgets.valuePill(context, x + width - pill, y + 4, pill, 16, text, listening || contains(mouseX, mouseY));
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
	public boolean keyPressed(KeyInput input) {
		if (!listening) {
			return false;
		}
		setting.set(input.isEscape() || input.key() == org.lwjgl.glfw.GLFW.GLFW_KEY_BACKSPACE ? KeybindSetting.UNBOUND : input.key());
		listening = false;
		return true;
	}

	@Override
	public boolean capturesKeyboard() {
		return listening;
	}
}
