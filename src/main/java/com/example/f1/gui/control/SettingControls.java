package com.example.f1.gui.control;

import com.example.f1.setting.BoolSetting;
import com.example.f1.setting.ColorSetting;
import com.example.f1.setting.DoubleSetting;
import com.example.f1.setting.EnumSetting;
import com.example.f1.setting.IntSetting;
import com.example.f1.setting.KeybindSetting;
import com.example.f1.setting.Setting;
import com.example.f1.setting.StringSetting;

/** Maps each setting type to its UI control. */
public final class SettingControls {
	private SettingControls() {
	}

	/**
	 * Creates the control for a setting. Called once per module when the ClickGUI opens, so
	 * the control can hold animation state between frames.
	 *
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
