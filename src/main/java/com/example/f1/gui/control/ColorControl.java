package com.example.f1.gui.control;

import com.example.f1.render.Anim;
import com.example.f1.render.Fonts;
import com.example.f1.render.RoundedRenderer;
import com.example.f1.render.Theme;
import com.example.f1.setting.ColorSetting;
import net.minecraft.client.gui.GuiGraphics;

/**
 * Label with a colour swatch; clicking it unfolds red, green, blue and, when the setting
 * allows transparency, alpha sliders.
 *
 * <p>The sliders draw over a checkerboard-free dark track, so a low alpha reads as a dimmer
 * bar rather than as a gap.
 */
final class ColorControl extends SettingControl<ColorSetting> {
	private static final int CHANNEL_ROW = 15;
	private static final String[] CHANNELS = {"R", "G", "B", "A"};
	private static final int[] SHIFTS = {16, 8, 0, 24};
	private static final int[] TINTS = {0xFFFF5A6E, 0xFF4AE08A, 0xFF5AA8FF, 0xFFD8DAE0};

	private final Anim expand = new Anim(0f);
	private boolean expanded;
	private int dragging = -1;
	private int shownValue;
	private String shownHex;

	ColorControl(ColorSetting setting) {
		super(setting);
		shownValue = setting.get();
		shownHex = setting.hex();
	}

	@Override
	public int height() {
		return ROW + Math.round(channelCount() * CHANNEL_ROW * expand.value());
	}

	@Override
	public void render(GuiGraphics context, int mouseX, int mouseY) {
		expand.set(expanded);
		int value = setting.get();
		if (value != shownValue) {
			shownValue = value;
			shownHex = setting.hex();
		}
		label(context);
		int pill = 82;
		int pillX = x + width - pill;
		RoundedRenderer.panel(context, pillX, y + 4, pill, 16, 8, Theme.INPUT,
				expanded ? Theme.get().accent(0xB4) : Theme.OUTLINE);
		RoundedRenderer.circle(context, pillX + 11, y + 12, 5, value | 0xFF000000);
		RoundedRenderer.outline(context, pillX + 6, y + 7, 10, 10, 5, Theme.OUTLINE_STRONG);
		Fonts.SMALL.drawCentered(context, shownHex, pillX + 22, y + 12, Theme.TEXT);

		int visible = height() - ROW;
		if (visible <= 0) {
			return;
		}
		context.enableScissor(x, y + ROW, x + width, y + ROW + visible);
		for (int i = 0; i < channelCount(); i++) {
			int rowY = y + ROW + i * CHANNEL_ROW;
			int channel = (value >>> SHIFTS[i]) & 0xFF;
			Fonts.SMALL.drawCentered(context, CHANNELS[i], x + 2, rowY + CHANNEL_ROW / 2, Theme.TEXT_MUTED);
			int trackX = x + 14;
			int trackWidth = width - 14;
			RoundedRenderer.fill(context, trackX, rowY + 6, trackWidth, 3, 1, Theme.TRACK_OFF);
			int filled = Math.round((trackWidth - 6) * (channel / 255f));
			RoundedRenderer.fill(context, trackX, rowY + 6, filled + 3, 3, 1, TINTS[i]);
			RoundedRenderer.circle(context, trackX + 3 + filled, rowY + 7, dragging == i ? 5 : 4, Theme.KNOB);
		}
		context.disableScissor();
	}

	@Override
	protected boolean onClick(int mouseX, int mouseY) {
		if (mouseY < y + ROW) {
			expanded = !expanded;
			return true;
		}
		int row = (mouseY - y - ROW) / CHANNEL_ROW;
		if (expanded && row >= 0 && row < channelCount()) {
			dragging = row;
			apply(mouseX);
			return true;
		}
		return false;
	}

	@Override
	protected boolean onClickOutside() {
		expanded = false;
		return false;
	}

	@Override
	public void mouseDragged(int mouseX, int mouseY) {
		if (dragging >= 0) {
			apply(mouseX);
		}
	}

	@Override
	public void mouseReleased() {
		dragging = -1;
	}

	/** Collapses the channel sliders, e.g. when the settings panel scrolls away. */
	public void collapse() {
		expanded = false;
		dragging = -1;
	}

	private int channelCount() {
		return setting.hasAlpha() ? CHANNELS.length : CHANNELS.length - 1;
	}

	private void apply(int mouseX) {
		int trackX = x + 17;
		int trackWidth = Math.max(1, width - 20);
		int channel = Math.round(255f * Math.max(0f, Math.min(1f, (mouseX - trackX) / (float) trackWidth)));
		// Rows are R, G, B, A; the setting numbers its channels alpha first.
		setting.setChannel(dragging == 3 ? 0 : dragging + 1, channel);
	}
}
