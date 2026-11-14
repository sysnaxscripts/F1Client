package com.example.f1.modules;

import com.example.f1.Category;
import com.example.f1.Module;
import com.example.f1.setting.BoolSetting;
import com.example.f1.setting.DoubleSetting;
import com.example.f1.setting.EnumSetting;
import com.example.f1.setting.IntSetting;
import com.example.f1.setting.KeybindSetting;

/**
 * HUD: switches the on-screen overlay and its parts on and off.
 *
 * <p>It has no key of its own, because every function key that would suit it belongs to
 * vanilla already (F5 is the perspective toggle). It is switched from its card in the
 * ClickGUI, and a key can be bound to it there.
 *
 * <p>This module does not draw anything itself. {@code HudRenderer} reads its settings once
 * per frame from the tail of the vanilla HUD, which keeps the overlay in the same pass as
 * the crosshair and the hotbar and means no separate hook has to know when the game hides
 * the HUD.
 *
 * <p>It is enabled by default: the overlay is the visible half of the client, and a client
 * that starts with no HUD looks broken.
 */
public final class Hud extends Module {
	/** Which corner the stacked panels sit in. */
	public enum Corner {
		/** Top left, under the watermark. */
		TOP_LEFT,
		/** Top right, above the module list. */
		TOP_RIGHT,
		/** Bottom left, above the chat. */
		BOTTOM_LEFT,
		/** Bottom right, above the hotbar's right end. */
		BOTTOM_RIGHT
	}

	private final BoolSetting watermark = add(new BoolSetting("Watermark", true)
			.describe("Pill with the client name, the active profile and the frame rate.")
			.group("Panels"));
	private final BoolSetting showFps = add(new BoolSetting("Frame rate", true)
			.describe("Add the frame rate to the watermark.")
			.group("Panels"));
	private final BoolSetting coordinates = add(new BoolSetting("Coordinates", true)
			.describe("Your position and the dimension you are in.")
			.group("Panels"));
	private final BoolSetting oreCounts = add(new BoolSetting("Ore counts", true)
			.describe("Per-ore totals in range, while OreESP is on.")
			.group("Panels"));
	private final BoolSetting alertList = add(new BoolSetting("Alert list", true)
			.describe("Recent SoundESP alerts, newest first.")
			.group("Panels"));
	private final IntSetting alertRows = add(new IntSetting("Alert rows", 6, 1, 15, 1)
			.describe("How many alerts the list keeps on screen.")
			.group("Panels"));
	private final BoolSetting freecamInfo = add(new BoolSetting("Freecam info", true)
			.describe("Camera position and how far it is from your body, while Freecam is on.")
			.group("Panels"));
	private final BoolSetting moduleList = add(new BoolSetting("Module list", true)
			.describe("Enabled modules along one edge, newest first.")
			.group("Panels"));
	private final EnumSetting<Corner> corner = add(new EnumSetting<>("Panel corner", Corner.TOP_LEFT, Corner.class)
			.describe("Corner the stacked panels sit in.")
			.group("Layout"));
	private final EnumSetting<Corner> listCorner = add(new EnumSetting<>("Module list corner", Corner.TOP_RIGHT,
			Corner.class).describe("Corner the module list hangs from.").group("Layout"));
	private final DoubleSetting opacity = add(new DoubleSetting("Panel opacity", 0.85, 0.2, 1.0, 0.05)
			.describe("How see-through the HUD panels are. 1 is the theme's own glass.")
			.group("Layout"));

	public Hud() {
		super("HUD", "The on-screen overlay: watermark, coordinates, ore counts and alerts.", Category.VISUALS,
				KeybindSetting.UNBOUND);
	}

	@Override
	public boolean enabledByDefault() {
		return true;
	}

	/** @return whether the watermark pill is drawn. */
	public boolean watermark() {
		return watermark.get();
	}

	/** @return whether the watermark carries the frame rate. */
	public boolean showFps() {
		return showFps.get();
	}

	/** @return whether the coordinate panel is drawn. */
	public boolean coordinates() {
		return coordinates.get();
	}

	/** @return whether the per-ore totals are drawn. */
	public boolean oreCounts() {
		return oreCounts.get();
	}

	/** @return whether the sound alert list is drawn. */
	public boolean alertList() {
		return alertList.get();
	}

	/** @return how many alert rows are drawn at most. */
	public int alertRows() {
		return alertRows.get();
	}

	/** @return whether the freecam read-out is drawn. */
	public boolean freecamInfo() {
		return freecamInfo.get();
	}

	/** @return whether the module list is drawn. */
	public boolean moduleList() {
		return moduleList.get();
	}

	/** @return the corner the stacked panels sit in. */
	public Corner corner() {
		return corner.get();
	}

	/** @return the corner the module list hangs from. */
	public Corner listCorner() {
		return listCorner.get();
	}

	/** @return the panel opacity multiplier, 0.2..1. */
	public float opacity() {
		return opacity.get().floatValue();
	}
}
