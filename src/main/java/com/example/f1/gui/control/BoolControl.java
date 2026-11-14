package com.example.f1.gui.control;

import com.example.f1.gui.widget.Widgets;
import com.example.f1.render.Anim;
import com.example.f1.setting.BoolSetting;
import com.example.f1.util.UiSounds;
import net.minecraft.client.gui.GuiGraphics;

/** Label with a glossy pill toggle. */
final class BoolControl extends SettingControl<BoolSetting> {
	private final Anim state;

	BoolControl(BoolSetting setting) {
		super(setting);
		this.state = new Anim(setting.get() ? 1f : 0f);
	}

	@Override
	public void render(GuiGraphics context, int mouseX, int mouseY) {
		state.set(setting.get());
		label(context);
		Widgets.toggle(context, x + width - Widgets.TOGGLE_WIDTH, y + (ROW - Widgets.TOGGLE_HEIGHT) / 2,
				state.value());
	}

	@Override
	protected boolean onClick(int mouseX, int mouseY) {
		setting.toggle();
		UiSounds.toggle(setting.get());
		return true;
	}
}
