package dev.f1client.module.impl;

import dev.f1client.module.Category;
import dev.f1client.module.Module;
import dev.f1client.setting.BoolSetting;
import dev.f1client.setting.IntSetting;

/** Switches the on-screen overlay and its parts on and off. Drawn by {@code HudRenderer}. */
public final class Hud extends Module {
	private final BoolSetting watermark = add(new BoolSetting("Watermark", true)
			.describe("Pill in the top-left corner with the client name, your account and the frame rate."));
	private final BoolSetting moduleList = add(new BoolSetting("Module list", true)
			.describe("Enabled modules along the right edge."));
	private final BoolSetting oreCounts = add(new BoolSetting("Ore counts", true)
			.describe("Per-ore totals in range while OreDetection is on."));
	private final BoolSetting alertList = add(new BoolSetting("Alert list", true)
			.describe("Recent SoundDetection alerts."));
	private final IntSetting alertRows = add(new IntSetting("Alert rows", 6, 1, 15));
	private final BoolSetting freecamInfo = add(new BoolSetting("Freecam info", true)
			.describe("Camera coordinates and distance from your body while Freecam is on."));

	public Hud() {
		super("HUD", "On-screen overlay: watermark, module list, ore counts and alerts.", Category.VISUALS);
	}

	public boolean watermark() {
		return watermark.get();
	}

	public boolean moduleList() {
		return moduleList.get();
	}

	public boolean oreCounts() {
		return oreCounts.get();
	}

	public boolean alertList() {
		return alertList.get();
	}

	public int alertRows() {
		return alertRows.get();
	}

	public boolean freecamInfo() {
		return freecamInfo.get();
	}
}
