package dev.f1client.hud;

import dev.f1client.F1Client;
import dev.f1client.module.Module;
import dev.f1client.module.impl.Freecam;
import dev.f1client.module.impl.Hud;
import dev.f1client.module.impl.OreDetection;
import dev.f1client.module.impl.SoundDetection;
import dev.f1client.ore.OreType;
import dev.f1client.render.Fonts;
import dev.f1client.render.Icons;
import dev.f1client.render.RoundedRenderer;
import dev.f1client.render.Theme;
import dev.f1client.sound.OreAlert;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;

/**
 * In-game overlay in the same glass style as the ClickGUI.
 *
 * <p>All strings are cached and rebuilt only when their inputs change, so a frame costs a
 * handful of rectangle and text draws and no allocation.
 */
public final class HudRenderer implements HudElement {
	private static final int MARGIN = 6;
	private static final int PILL_HEIGHT = 18;
	private static final int ROW_HEIGHT = 13;
	private static final long ALERT_FADE_MS = 30_000L;
	private static final OreType[] ORES = OreType.all();

	private final F1Client mod;
	private final List<Module> enabled = new ArrayList<>();
	private final List<String> alertLines = new ArrayList<>();
	private String watermarkText = "";
	private String watermarkUser = "";
	private int watermarkFps = -1;
	private int shownAlertVersion = -1;
	private int shownAlertRows = -1;
	private long lastListRefreshMs;

	public HudRenderer(F1Client mod) {
		this.mod = mod;
	}

	@Override
	public void render(DrawContext context, RenderTickCounter tickCounter) {
		MinecraftClient client = MinecraftClient.getInstance();
		Hud hud = mod.hud();
		if (!mod.auth().isUnlocked() || !hud.isEnabled() || client.options.hudHidden || client.player == null) {
			return;
		}
		RoundedRenderer.setPixelsPerUnit(client.getWindow().getScaleFactor());
		Fonts.setPixelsPerUnit(client.getWindow().getScaleFactor());
		int width = context.getScaledWindowWidth();
		int y = MARGIN;
		if (hud.watermark()) {
			drawWatermark(context, client);
			y += PILL_HEIGHT + 4;
		}
		if (hud.oreCounts() && mod.oreDetection().isEnabled()) {
			y = drawOreCounts(context, y);
		}
		if (hud.alertList() && mod.soundDetection().isEnabled()) {
			drawAlerts(context, y, hud.alertRows());
		}
		if (hud.moduleList()) {
			drawModuleList(context, width);
		}
		Freecam freecam = mod.freecam();
		if (hud.freecamInfo() && freecam.isEnabled()) {
			String text = freecam.readout();
			int pillWidth = Fonts.REGULAR.width(text) + 20;
			int x = (width - pillWidth) / 2;
			pill(context, x, MARGIN, pillWidth, PILL_HEIGHT);
			Fonts.REGULAR.drawMiddle(context, text, x + pillWidth / 2, MARGIN + PILL_HEIGHT / 2, Theme.TEXT);
		}
	}

	private void drawWatermark(DrawContext context, MinecraftClient client) {
		int fps = client.getCurrentFps();
		String user = mod.auth().username();
		if (fps != watermarkFps || !user.equals(watermarkUser)) {
			watermarkFps = fps;
			watermarkUser = user;
			watermarkText = user + "   ·   " + fps + " fps";
		}
		int nameWidth = Fonts.BOLD.width(F1Client.NAME);
		int width = 8 + 10 + 5 + nameWidth + 10 + Fonts.REGULAR.width(watermarkText) + 10;
		pill(context, MARGIN, MARGIN, width, PILL_HEIGHT);
		int center = MARGIN + PILL_HEIGHT / 2;
		Icons.LOGO.draw(context, MARGIN + 8, center - 5, 10, Theme.get().accentColor());
		Fonts.BOLD.drawCentered(context, F1Client.NAME, MARGIN + 23, center, Theme.TEXT);
		Fonts.REGULAR.drawCentered(context, watermarkText, MARGIN + 33 + nameWidth, center, Theme.TEXT_MUTED);
	}

	private int drawOreCounts(DrawContext context, int top) {
		OreDetection ores = mod.oreDetection();
		int rows = 0;
		int widest = 0;
		for (OreType ore : ORES) {
			if (ores.countInRange(ore) > 0) {
				rows++;
				widest = Math.max(widest, Fonts.REGULAR.width(ores.countLabel(ore)));
			}
		}
		if (rows == 0) {
			return top;
		}
		int width = widest + 28;
		int height = rows * ROW_HEIGHT + 8;
		panel(context, MARGIN, top, width, height);
		int y = top + 4;
		for (OreType ore : ORES) {
			if (ores.countInRange(ore) > 0) {
				RoundedRenderer.fill(context, MARGIN + 8, y + ROW_HEIGHT / 2 - 3, 6, 6, 3, ores.colorOf(ore) | 0xFF000000);
				Fonts.REGULAR.drawCentered(context, ores.countLabel(ore), MARGIN + 20, y + ROW_HEIGHT / 2, Theme.TEXT);
				y += ROW_HEIGHT;
			}
		}
		return top + height + 4;
	}

	private void drawAlerts(DrawContext context, int top, int maxRows) {
		SoundDetection sounds = mod.soundDetection();
		List<OreAlert> alerts = sounds.alerts();
		if (alerts.isEmpty()) {
			return;
		}
		long now = System.currentTimeMillis();
		if (sounds.alertVersion() != shownAlertVersion || maxRows != shownAlertRows || now - lastListRefreshMs >= 1000) {
			shownAlertVersion = sounds.alertVersion();
			shownAlertRows = maxRows;
			lastListRefreshMs = now;
			alertLines.clear();
			for (int i = 0; i < alerts.size() && i < maxRows; i++) {
				OreAlert alert = alerts.get(i);
				alertLines.add(alert.ore().label() + " " + alert.action().verb() + "  " + alert.coordinates() + "  "
						+ age(now - alert.timeMs()));
			}
		}
		int rows = Math.min(alertLines.size(), alerts.size());
		int widest = Fonts.SMALL.width("SOUND ALERTS");
		for (int i = 0; i < rows; i++) {
			widest = Math.max(widest, Fonts.REGULAR.width(alertLines.get(i)));
		}
		int width = widest + 28;
		int height = rows * ROW_HEIGHT + 22;
		panel(context, MARGIN, top, width, height);
		Fonts.SMALL.drawCentered(context, "SOUND ALERTS", MARGIN + 8, top + 9, Theme.TEXT_MUTED);
		int y = top + 17;
		for (int i = 0; i < rows; i++) {
			OreAlert alert = alerts.get(i);
			float fresh = 1f - Math.min(1f, (now - alert.timeMs()) / (float) ALERT_FADE_MS) * 0.55f;
			int color = mod.oreDetection().colorOf(alert.ore()) | 0xFF000000;
			RoundedRenderer.fill(context, MARGIN + 8, y + ROW_HEIGHT / 2 - 3, 6, 6, 3, Theme.fade(color, fresh));
			Fonts.REGULAR.drawCentered(context, alertLines.get(i), MARGIN + 20, y + ROW_HEIGHT / 2,
					Theme.fade(alert.resolved() ? Theme.TEXT : Theme.TEXT_MUTED, fresh));
			y += ROW_HEIGHT;
		}
	}

	private void drawModuleList(DrawContext context, int screenWidth) {
		enabled.clear();
		List<Module> all = mod.modules().all();
		for (int i = 0; i < all.size(); i++) {
			Module module = all.get(i);
			if (module.isEnabled() && module != mod.hud()) {
				enabled.add(module);
			}
		}
		int y = MARGIN;
		for (int i = 0; i < enabled.size(); i++) {
			String name = enabled.get(i).name();
			int width = Fonts.REGULAR.width(name) + 14;
			int x = screenWidth - MARGIN - width;
			RoundedRenderer.fill(context, x, y, width, ROW_HEIGHT + 2, 5, Theme.CARD);
			RoundedRenderer.fill(context, x + width - 3, y + 3, 1, ROW_HEIGHT - 4, 0, Theme.get().accentColor());
			Fonts.REGULAR.drawRight(context, name, x + width - 7, y + (ROW_HEIGHT + 2) / 2, Theme.TEXT);
			y += ROW_HEIGHT + 4;
		}
	}

	private static void pill(DrawContext context, int x, int y, int width, int height) {
		RoundedRenderer.panel(context, x, y, width, height, height / 2, Theme.CARD, Theme.OUTLINE);
	}

	private static void panel(DrawContext context, int x, int y, int width, int height) {
		RoundedRenderer.panel(context, x, y, width, height, Theme.RADIUS_CARD, Theme.CARD, Theme.OUTLINE);
	}

	private static String age(long millis) {
		long seconds = Math.max(0, millis / 1000);
		return seconds < 60 ? seconds + "s" : (seconds / 60) + "m";
	}
}
