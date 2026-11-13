package dev.f1client.gui.control;

import dev.f1client.setting.BoolSetting;
import dev.f1client.setting.ColorSetting;
import dev.f1client.setting.DoubleSetting;
import dev.f1client.setting.EnumSetting;
import dev.f1client.setting.IntSetting;
import dev.f1client.setting.KeybindSetting;
import dev.f1client.setting.Setting;
import dev.f1client.setting.StringSetting;

/** Maps each setting type to its UI control. */
public final class SettingControls {
	private SettingControls() {
	}

	/**
	 * @return a new control editing {@code setting}
	 * @throws IllegalArgumentException for a setting type without a control
	 */
	public static SettingControl<?> create(Setting<?> setting) {
		if (setting instanceof BoolSetting bool) {
			return new BoolControl(bool);
		}
		if (setting instanceof IntSetting integer) {
			return new SliderControl(integer);
		}
		if (setting instanceof DoubleSetting decimal) {
			return new SliderControl(decimal);
		}
		if (setting instanceof EnumSetting<?> choice) {
			return new EnumControl(choice);
		}
		if (setting instanceof ColorSetting color) {
			return new ColorControl(color);
		}
		if (setting instanceof StringSetting string) {
			return new StringControl(string);
		}
		if (setting instanceof KeybindSetting key) {
			return new KeybindControl(key);
		}
		throw new IllegalArgumentException("No control for " + setting.getClass().getSimpleName());
	}
}
