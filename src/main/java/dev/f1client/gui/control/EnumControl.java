package dev.f1client.gui.control;

import dev.f1client.gui.widget.Widgets;
import dev.f1client.render.Fonts;
import dev.f1client.setting.EnumSetting;
import dev.f1client.util.UiSounds;
import java.util.Locale;
import net.minecraft.client.gui.DrawContext;

/** Label with a value pill that cycles through the options on click. */
final class EnumControl extends SettingControl<EnumSetting<?>> {
	private Object shownValue;
	private String shownText = "";

	EnumControl(EnumSetting<?> setting) {
		super(setting);
	}

	@Override
	public void render(DrawContext context, int mouseX, int mouseY) {
		Object value = setting.get();
		if (value != shownValue) {
			shownValue = value;
			shownText = pretty(String.valueOf(value));
		}
		label(context);
		int pill = Math.max(44, Fonts.REGULAR.width(shownText) + 18);
		Widgets.valuePill(context, x + width - pill, y + 4, pill, 16, shownText, contains(mouseX, mouseY));
	}

	@Override
	protected boolean onClick(int mouseX, int mouseY) {
		setting.cycle(1);
		UiSounds.click();
		return true;
	}

	private static String pretty(String constant) {
		String lower = constant.toLowerCase(Locale.ROOT).replace('_', ' ');
		return lower.isEmpty() ? lower : Character.toUpperCase(lower.charAt(0)) + lower.substring(1);
	}
}
