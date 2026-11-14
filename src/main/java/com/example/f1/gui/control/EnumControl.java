package com.example.f1.gui.control;

import com.example.f1.gui.widget.Widgets;
import com.example.f1.render.Fonts;
import com.example.f1.setting.EnumSetting;
import com.example.f1.util.UiSounds;
import net.minecraft.client.gui.GuiGraphics;

/**
 * Label with a value pill that cycles through the options.
 *
 * <p>Left click goes forwards, right click resets to the default (handled by the base
 * class), and scrolling over the row cycles in both directions from the screen, which is
 * why {@link com.example.f1.gui.SettingList} needs this class to be public.
 */
public final class EnumControl extends SettingControl<EnumSetting<?>> {
	private Object shownValue;
	private String shownText = "";

	public EnumControl(EnumSetting<?> setting) {
		super(setting);
	}

	@Override
	public void render(GuiGraphics context, int mouseX, int mouseY) {
		Object value = setting.get();
		if (value != shownValue) {
			shownValue = value;
			shownText = setting.label();
		}
		label(context);
		int pill = pillWidth(shownText);
		Widgets.valuePill(context, x + width - pill, y + 4, pill, 16, shownText, contains(mouseX, mouseY));
	}

	@Override
	protected boolean onClick(int mouseX, int mouseY) {
		setting.next();
		UiSounds.click();
		return true;
	}

	/** Cycles the option; a negative amount goes backwards. */
	public void scroll(double amount) {
		if (amount > 0) {
			setting.next();
		} else if (amount < 0) {
			setting.previous();
		} else {
			return;
		}
		UiSounds.click();
	}

	/** @return a pill wide enough for the text, never narrower than the chevron plus label. */
	private static int pillWidth(String text) {
		return Math.max(48, Fonts.REGULAR.width(text) + 18);
	}
}
