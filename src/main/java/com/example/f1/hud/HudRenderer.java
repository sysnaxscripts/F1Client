package com.example.f1.hud;

import com.example.f1.F1Client;
import com.example.f1.Module;
import com.example.f1.Modules;
import com.example.f1.modules.Freecam;
import com.example.f1.modules.Hud;
import com.example.f1.modules.OreESP;
import com.example.f1.modules.SoundESP;
import com.example.f1.ore.OreType;
import com.example.f1.render.Fonts;
import com.example.f1.render.Icons;
import com.example.f1.render.RoundedRenderer;
import com.example.f1.render.Theme;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;

/**
 * The in-game overlay, in the same glass style as the ClickGUI.
 *
 * <p>Drawn from {@code GuiMixin} at the tail of the vanilla HUD, so it sits on top of the
 * hotbar and the crosshair and disappears with them when the game hides the HUD. It reads
 * its layout from the {@link Hud} module every frame; nothing is cached between frames
 * except the strings, which are rebuilt only when their inputs change.
 *
 * <p>The panels stack from one corner. Bottom corners stack upwards, which is why each
 * panel measures itself before it is drawn rather than being laid out in a list first.
 */
public final class HudRenderer {
	/** Gap between the screen edge and a panel. */
	private static final int MARGIN = 6;
	/** Gap between two stacked panels. */
	private static final int GAP = 4;
	/** Height of a one-line pill. */
	private static final int PILL_HEIGHT = 18;
	/** Height of a row inside a panel. */
	private static final int ROW_HEIGHT = 13;
	/** Age at which an alert has faded to its dimmest. */
	private static final long ALERT_FADE_MS = 30_000L;
	private static final OreType[] ORES = OreType.all();

	private static final List<String> ALERT_LINES = new ArrayList<>();
	private static final List<Module> ENABLED = new ArrayList<>();
	private static String watermarkText = "";
	private static String watermarkKey = "";
	private static String coordinateText = "";
	private static BlockPos lastCoordinatePos;
	private static String lastDimension = "";
	private static int shownAlertVersion = -1;
	private static int shownAlertRows = -1;
	private static long lastAlertRefreshMs;

	private HudRenderer() {
	}

	/**
	 * Draws the overlay for one frame.
	 *
	 * @param context      the GUI context of the current frame
	 * @param screenWidth  screen width in GUI units
	 * @param screenHeight screen height in GUI units
	 */
	public static void render(GuiGraphics context, int screenWidth, int screenHeight) {
		Minecraft mc = Minecraft.getInstance();
		F1Client client = F1Client.get();
		Hud hud = Modules.get(Hud.class);
		if (client == null || hud == null || !hud.isEnabled() || mc.player == null || mc.level == null
				|| mc.options == null || mc.options.hideGui) {
			return;
		}
		// The HUD draws straight into GUI units, so one GUI unit covers exactly the window's
		// scale factor in device pixels.
		float scale = Fonts.windowScale();
		RoundedRenderer.setPixelsPerUnit(scale);
		Fonts.setPixelsPerUnit(scale);

		boolean top = hud.corner() == Hud.Corner.TOP_LEFT || hud.corner() == Hud.Corner.TOP_RIGHT;
		boolean left = hud.corner() == Hud.Corner.TOP_LEFT || hud.corner() == Hud.Corner.BOTTOM_LEFT;
		int cursor = top ? MARGIN : screenHeight - MARGIN;
		if (hud.watermark()) {
			cursor = drawWatermark(context, hud, screenWidth, left, cursor, top);
		}
		if (hud.coordinates()) {
			cursor = drawCoordinates(context, hud, screenWidth, left, cursor, top);
		}
		OreESP ores = Modules.get(OreESP.class);
		if (hud.oreCounts() && ores != null && ores.isEnabled()) {
			cursor = drawOreCounts(context, hud, ores, screenWidth, left, cursor, top);
		}
		SoundESP sounds = Modules.get(SoundESP.class);
		if (hud.alertList() && sounds != null && sounds.isEnabled()) {
			cursor = drawAlerts(context, hud, sounds, screenWidth, left, cursor, top);
		}
		Freecam freecam = Modules.get(Freecam.class);
		if (hud.freecamInfo() && freecam != null && freecam.isEnabled()) {
			drawFreecam(context, hud, freecam, screenWidth, left, cursor, top);
		}
		if (hud.moduleList()) {
			drawModuleList(context, hud, screenWidth, screenHeight);
		}
	}

	/**
	 * @return the new stack cursor after the panel
	 */
	private static int drawWatermark(GuiGraphics context, Hud hud, int screenWidth, boolean left, int cursor,
			boolean top) {
		F1Client client = F1Client.get();
		int fps = Minecraft.getInstance().getFps();
		String key = hud.showFps() ? fps + "|" + client.config().activeProfile() : client.config().activeProfile();
		if (!key.equals(watermarkKey)) {
			watermarkKey = key;
			watermarkText = hud.showFps()
					? client.config().activeProfile() + "   \u00b7   " + fps + " fps"
					: client.config().activeProfile();
		}
		int nameWidth = Fonts.BOLD.width(F1Client.NAME);
		int width = 10 + 12 + 6 + nameWidth + 10 + Fonts.REGULAR.width(watermarkText) + 12;
		int x = left ? MARGIN : screenWidth - MARGIN - width;
		int y = stackY(cursor, PILL_HEIGHT, top);
		Theme theme = Theme.get();
		pill(context, hud, x, y, width, PILL_HEIGHT);
		int center = y + PILL_HEIGHT / 2;
		Icons.LOGO.draw(context, x + 10, center - 6, 12, theme.accentColor());
		Fonts.BOLD.drawCentered(context, F1Client.NAME, x + 28, center, Theme.TEXT);
		Fonts.REGULAR.drawCentered(context, watermarkText, x + 38 + nameWidth, center, Theme.TEXT_MUTED);
		return advance(cursor, PILL_HEIGHT, top);
	}

	private static int drawCoordinates(GuiGraphics context, Hud hud, int screenWidth, boolean left, int cursor,
			boolean top) {
		Minecraft mc = Minecraft.getInstance();
		Vec3 pos = mc.player.position();
		BlockPos block = mc.player.blockPosition();
		String dimensionName = mc.level.dimension().location().getPath();
		if (!block.equals(lastCoordinatePos) || !dimensionName.equals(lastDimension)) {
			lastCoordinatePos = block;
			lastDimension = dimensionName;
			coordinateText = String.format(Locale.ROOT, "XYZ %.0f %.0f %.0f   \u00b7   %s", pos.x, pos.y, pos.z,
					dimensionName);
		}
		int width = Fonts.REGULAR.width(coordinateText) + 20;
		int x = left ? MARGIN : screenWidth - MARGIN - width;
		int y = stackY(cursor, PILL_HEIGHT, top);
		pill(context, hud, x, y, width, PILL_HEIGHT);
		Fonts.REGULAR.drawMiddle(context, coordinateText, x + width / 2, y + PILL_HEIGHT / 2, Theme.TEXT);
		return advance(cursor, PILL_HEIGHT, top);
	}

	private static int drawOreCounts(GuiGraphics context, Hud hud, OreESP ores, int screenWidth, boolean left,
			int cursor, boolean top) {
		int rows = 0;
		int widest = 0;
		for (OreType ore : ORES) {
			if (ores.count(ore) > 0) {
				rows++;
				widest = Math.max(widest, Fonts.REGULAR.width(countLabel(ores, ore)));
			}
		}
		if (rows == 0) {
			return cursor;
		}
		int width = widest + 30;
		int height = rows * ROW_HEIGHT + 8;
		int x = left ? MARGIN : screenWidth - MARGIN - width;
		int y = stackY(cursor, height, top);
		panel(context, hud, x, y, width, height);
		int rowY = y + 4;
		for (OreType ore : ORES) {
			if (ores.count(ore) <= 0) {
				continue;
			}
			RoundedRenderer.circle(context, x + 11, rowY + ROW_HEIGHT / 2, 3, ores.colorOf(ore));
			Fonts.REGULAR.drawCentered(context, countLabel(ores, ore), x + 20, rowY + ROW_HEIGHT / 2, Theme.TEXT);
			rowY += ROW_HEIGHT;
		}
		return advance(cursor, height, top);
	}

	private static int drawAlerts(GuiGraphics context, Hud hud, SoundESP sounds, int screenWidth, boolean left,
			int cursor, boolean top) {
		List<SoundESP.Alert> alerts = sounds.alerts();
		if (alerts.isEmpty()) {
			return cursor;
		}
		long now = System.currentTimeMillis();
		int maxRows = hud.alertRows();
		if (sounds.alertVersion() != shownAlertVersion || maxRows != shownAlertRows
				|| now - lastAlertRefreshMs >= 1000) {
			shownAlertVersion = sounds.alertVersion();
			shownAlertRows = maxRows;
			lastAlertRefreshMs = now;
			ALERT_LINES.clear();
			for (int i = 0; i < alerts.size() && i < maxRows; i++) {
				SoundESP.Alert alert = alerts.get(i);
				ALERT_LINES.add(alert.kind().label() + "  " + alert.coordinates() + "  "
						+ age(now - alert.timeMs()));
			}
		}
		int rows = Math.min(ALERT_LINES.size(), alerts.size());
		int widest = Fonts.SMALL.width("SOUND ALERTS");
		for (int i = 0; i < rows; i++) {
			widest = Math.max(widest, Fonts.REGULAR.width(ALERT_LINES.get(i)));
		}
		int width = widest + 30;
		int height = rows * ROW_HEIGHT + 22;
		int x = left ? MARGIN : screenWidth - MARGIN - width;
		int y = stackY(cursor, height, top);
		panel(context, hud, x, y, width, height);
		Fonts.SMALL.drawCentered(context, "SOUND ALERTS", x + 10, y + 9, Theme.TEXT_MUTED);
		int rowY = y + 17;
		for (int i = 0; i < rows; i++) {
			SoundESP.Alert alert = alerts.get(i);
			float fresh = 1f - Math.min(1f, (now - alert.timeMs()) / (float) ALERT_FADE_MS) * 0.55f;
			int color = kindColor(alert.kind());
			RoundedRenderer.circle(context, x + 11, rowY + ROW_HEIGHT / 2, 3, Theme.fade(color, fresh));
			Fonts.REGULAR.drawCentered(context, ALERT_LINES.get(i), x + 20, rowY + ROW_HEIGHT / 2,
					Theme.fade(Theme.TEXT, fresh));
			rowY += ROW_HEIGHT;
		}
		return advance(cursor, height, top);
	}

	private static int drawFreecam(GuiGraphics context, Hud hud, Freecam freecam, int screenWidth, boolean left,
			int cursor, boolean top) {
		String text = freecam.readout();
		int width = Fonts.REGULAR.width(text) + 20;
		int x = left ? MARGIN : screenWidth - MARGIN - width;
		int y = stackY(cursor, PILL_HEIGHT, top);
		pill(context, hud, x, y, width, PILL_HEIGHT);
		Fonts.REGULAR.drawMiddle(context, text, x + width / 2, y + PILL_HEIGHT / 2, Theme.TEXT);
		return advance(cursor, PILL_HEIGHT, top);
	}

	private static void drawModuleList(GuiGraphics context, Hud hud, int screenWidth, int screenHeight) {
		ENABLED.clear();
		List<Module> all = Modules.all();
		for (int i = 0; i < all.size(); i++) {
			Module module = all.get(i);
			if (module.isEnabled() && !(module instanceof Hud)) {
				ENABLED.add(module);
			}
		}
		if (ENABLED.isEmpty()) {
			return;
		}
		boolean top = hud.listCorner() == Hud.Corner.TOP_LEFT || hud.listCorner() == Hud.Corner.TOP_RIGHT;
		boolean left = hud.listCorner() == Hud.Corner.TOP_LEFT || hud.listCorner() == Hud.Corner.BOTTOM_LEFT;
		Theme theme = Theme.get();
		int y = top ? MARGIN : screenHeight - MARGIN - (ROW_HEIGHT + 2);
		for (int i = 0; i < ENABLED.size(); i++) {
			String name = ENABLED.get(i).getName();
			int width = Fonts.REGULAR.width(name) + 16;
			int x = left ? MARGIN : screenWidth - MARGIN - width;
			int rowHeight = ROW_HEIGHT + 2;
			RoundedRenderer.fill(context, x, y, width, rowHeight, 5, Theme.fade(Theme.CARD, hud.opacity()));
			RoundedRenderer.fill(context, x + 1, y + 1, width - 2, 1, 0, Theme.fade(Theme.GLOSS_TOP, hud.opacity()));
			// The accent bar sits on the side the list hangs from, so the names line up
			// against the screen edge whichever corner it is.
			int barX = left ? x + 2 : x + width - 3;
			RoundedRenderer.fill(context, barX, y + 3, 1, rowHeight - 6, 0, theme.accentColor());
			if (left) {
				Fonts.REGULAR.drawCentered(context, name, x + 9, y + rowHeight / 2, Theme.TEXT);
			} else {
				Fonts.REGULAR.drawRight(context, name, x + width - 7, y + rowHeight / 2, Theme.TEXT);
			}
			y += top ? rowHeight + 2 : -(rowHeight + 2);
		}
	}

	/** A one-line glass pill. */
	private static void pill(GuiGraphics context, Hud hud, int x, int y, int width, int height) {
		Theme theme = Theme.get();
		if (F1Client.get().settings().hudShadow()) {
			RoundedRenderer.shadow(context, x, y, width, height, height / 2, 4, Theme.SHADOW);
		}
		RoundedRenderer.fill(context, x, y, width, height, height / 2, Theme.fade(Theme.CARD, hud.opacity()));
		RoundedRenderer.fill(context, x + height / 2, y, Math.max(1, width - height), 1, 0,
				Theme.fade(Theme.GLOSS_TOP, hud.opacity()));
		RoundedRenderer.outline(context, x, y, width, height, height / 2, theme.accent(0x29));
	}

	/** A glass panel with the card radius. */
	private static void panel(GuiGraphics context, Hud hud, int x, int y, int width, int height) {
		Theme theme = Theme.get();
		if (F1Client.get().settings().hudShadow()) {
			RoundedRenderer.shadow(context, x, y, width, height, Theme.RADIUS_CARD, 5, Theme.SHADOW);
		}
		RoundedRenderer.fill(context, x, y, width, height, Theme.RADIUS_CARD,
				Theme.fade(Theme.CARD, hud.opacity()));
		RoundedRenderer.fill(context, x + Theme.RADIUS_CARD, y, Math.max(1, width - Theme.RADIUS_CARD * 2), 1, 0,
				Theme.fade(Theme.GLOSS_TOP, hud.opacity()));
		RoundedRenderer.outline(context, x, y, width, height, Theme.RADIUS_CARD, theme.accent(0x29));
	}

	/** @return the y a panel of this height occupies at the stack cursor. */
	private static int stackY(int cursor, int height, boolean top) {
		return top ? cursor : cursor - height;
	}

	/** @return the stack cursor after a panel of this height. */
	private static int advance(int cursor, int height, boolean top) {
		return top ? cursor + height + GAP : cursor - height - GAP;
	}

	private static String countLabel(OreESP ores, OreType ore) {
		return ore.label() + " " + ores.count(ore);
	}

	/** @return the colour a sound family is drawn in, read from its own colour setting. */
	private static int kindColor(SoundESP.SoundKind kind) {
		SoundESP sounds = Modules.get(SoundESP.class);
		return sounds == null ? kind.color() : sounds.colorOf(kind);
	}

	private static String age(long millis) {
		long seconds = Math.max(0, millis / 1000);
		return seconds < 60 ? seconds + "s" : (seconds / 60) + "m";
	}
}
