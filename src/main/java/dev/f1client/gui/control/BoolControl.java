package dev.f1client.gui.control;

import dev.f1client.gui.Anim;
import dev.f1client.gui.widget.Widgets;
import dev.f1client.setting.BoolSetting;
import dev.f1client.util.UiSounds;
import net.minecraft.client.gui.DrawContext;

/** Label with a pill toggle. */
final class BoolControl extends SettingControl<BoolSetting> {
	private final Anim state;

	BoolControl(BoolSetting setting) {
		super(setting);
		this.state = new Anim(setting.get() ? 1f : 0f);
	}

	@Override
	public void render(DrawContext context, int mouseX, int mouseY) {
		state.set(setting.get());
		label(context);
		Widgets.toggle(context, x + width - Widgets.TOGGLE_WIDTH, y + (ROW - Widgets.TOGGLE_HEIGHT) / 2, state.value());
	}

	@Override
	protected boolean onClick(int mouseX, int mouseY) {
		setting.toggle();
		UiSounds.click();
		return true;
	}
}
