package com.example.f1.gui;

import com.example.f1.Category;
import com.example.f1.F1Client;
import com.example.f1.Module;
import com.example.f1.Modules;
import com.example.f1.config.ConfigManager;
import com.example.f1.core.ClientSettings;
import com.example.f1.gui.widget.TextBox;
import com.example.f1.gui.widget.Widgets;
import com.example.f1.render.Fonts;
import com.example.f1.render.Icons;
import com.example.f1.render.RoundedRenderer;
import com.example.f1.render.Theme;
import com.example.f1.setting.Setting;
import com.example.f1.util.UiSounds;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.network.chat.Component;

/**
 * The ClickGUI: a sidebar of categories, a grid of module cards, and the settings of
 * whatever is selected.
 *
 * <p>It is laid out in fixed design units and scaled to the window by {@link UiScreen}, so
 * it looks the same at every GUI scale and resolution. Everything on it is drawn by this
 * client: rounded glass panels, the bundled Inter typeface and the bundled icon set. No
 * vanilla widget is used, which is what lets a card glow when its module is on instead of
 * looking like a grey button.
 *
 * <h2>Using it</h2>
 * <ul>
 * <li>Left click a card to switch the module on or off.</li>
 * <li>Right click a card to open its settings on the right.</li>
 * <li>Middle click a card, or click its star, to pin it to Favourites.</li>
 * <li>Right click a setting to put it back to its default.</li>
 * <li>Scroll over a cycle setting to change it without clicking.</li>
 * <li>Type in the search box to find a module or a setting by name.</li>
 * <li>Escape, or the client key again, closes the screen.</li>
 * </ul>
 *
 * <p>The footer carries the profiles: switching, creating, copying and deleting. Switching
 * a profile saves the current one first, so nothing is lost by clicking through them.
 */
public final class ClickGuiScreen extends UiScreen {
	private static final int DESIGN_WIDTH = 680;
	private static final int DESIGN_HEIGHT = 420;
	private static final int HEADER_HEIGHT = 42;
	private static final int FOOTER_HEIGHT = 28;
	private static final int PAD = 12;
	private static final int SIDEBAR_X = PAD;
	private static final int SIDEBAR_WIDTH = 128;
	private static final int CARDS_X = SIDEBAR_X + SIDEBAR_WIDTH + 8;
	private static final int CARDS_WIDTH = 292;
	private static final int SETTINGS_X = CARDS_X + CARDS_WIDTH + 8;
	private static final int SETTINGS_WIDTH = DESIGN_WIDTH - SETTINGS_X - PAD;
	private static final int BODY_Y = HEADER_HEIGHT + 6;
	private static final int BODY_HEIGHT = DESIGN_HEIGHT - BODY_Y - FOOTER_HEIGHT - 6;
	private static final int CARD_GAP = 8;
	private static final int CARD_WIDTH = (CARDS_WIDTH - CARD_GAP - 16) / 2;
	private static final int CARD_HEIGHT = 46;
	private static final int ROW_HEIGHT = 26;
	/** Width of a small square footer button, including the gap to the next one. */
	private static final int FOOTER_STEP = 26;
	private static final int FOOTER_BUTTON = 22;

	/** Sidebar ids that are not categories. */
	private static final int FAVOURITES = -1;
	private static final int CLIENT = -2;

	private final TextBox search = new TextBox(48).placeholder("Search modules and settings")
			.leadingIcon(Icons.SEARCH);
	private final TextBox profileName = new TextBox(ConfigManager.MAX_NAME_LENGTH).placeholder("New profile name")
			.onEnter(this::submitProfileName);
	private final SettingList settings = new SettingList();
	private final SmoothScroll cards = new SmoothScroll();
	private final List<Module> visible = new ArrayList<>();

	private int sidebarSelection = FAVOURITES;
	private Module selected;
	private boolean showingClientSettings;
	private boolean creatingProfile;
	private String query = "";
	private String hint = "";
	private Setting<?> hoveredSetting;

	public ClickGuiScreen() {
		super(Component.literal("F1 Client"), DESIGN_WIDTH, DESIGN_HEIGHT);
		search.onChange(() -> {
			query = search.text();
			cards.reset();
		});
		// Only characters a profile name may contain reach the field, so the name that is
		// created is always the name that was typed.
		profileName.filter(character -> character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z'
				|| character >= '0' && character <= '9' || character == ' ' || character == '_' || character == '-');
	}

	@Override
	protected void init() {
		super.init();
		// A module selected in a previous visit stays selected, so reopening the screen does
		// not throw away the panel the player was reading.
		if (selected == null && !showingClientSettings && !Modules.all().isEmpty()) {
			select(Modules.all().get(0));
		}
		if (showingClientSettings) {
			selectClientSettings();
		}
	}

	/** Selects a module and shows its settings. */
	private void select(Module module) {
		selected = module;
		showingClientSettings = false;
		settings.build(module, module.settings());
	}

	/** Shows the client-wide settings instead of a module's. */
	private void selectClientSettings() {
		selected = null;
		showingClientSettings = true;
		ClientSettings client = F1Client.get().settings();
		settings.build(client, client.all());
	}

	@Override
	protected void draw(GuiGraphics context, int mouseX, int mouseY) {
		float open = openAnimation().value();
		drawWindow(context, open);
		drawHeader(context, mouseX, mouseY, open);
		drawSidebar(context, mouseX, mouseY, open);
		drawCards(context, mouseX, mouseY, open);
		drawSettingsPanel(context, mouseX, mouseY, open);
		drawFooter(context, mouseX, mouseY, open);
	}

	/** The glass the whole screen sits on. */
	private void drawWindow(GuiGraphics context, float open) {
		Theme theme = Theme.get();
		RoundedRenderer.shadow(context, 0, 0, DESIGN_WIDTH, DESIGN_HEIGHT, Theme.RADIUS_WINDOW, 10,
				Theme.fade(Theme.SHADOW, open));
		RoundedRenderer.fill(context, 0, 0, DESIGN_WIDTH, DESIGN_HEIGHT, Theme.RADIUS_WINDOW,
				Theme.fade(Theme.WINDOW, open));
		RoundedRenderer.fill(context, 0, 0, DESIGN_WIDTH, DESIGN_HEIGHT / 2, Theme.RADIUS_WINDOW,
				Theme.fade(Theme.WINDOW_INNER, open));
		// The gloss band along the top edge is the brightest thing on the screen, which is
		// what makes the whole window read as a sheet of glass lit from above.
		RoundedRenderer.fill(context, Theme.RADIUS_WINDOW, 1, DESIGN_WIDTH - Theme.RADIUS_WINDOW * 2, 1, 0,
				Theme.fade(Theme.GLOSS_TOP, open));
		RoundedRenderer.outline(context, 0, 0, DESIGN_WIDTH, DESIGN_HEIGHT, Theme.RADIUS_WINDOW,
				theme.accent(Math.round(0x40 * open)));
	}

	private void drawHeader(GuiGraphics context, int mouseX, int mouseY, float open) {
		Theme theme = Theme.get();
		Icons.LOGO.draw(context, PAD + 4, 12, 18, theme.accentColor());
		Fonts.TITLE.drawCentered(context, F1Client.NAME, PAD + 28, 21, Theme.TEXT);
		Fonts.SMALL.drawCentered(context, "client", PAD + 30 + Fonts.TITLE.width(F1Client.NAME), 22,
				theme.accent(0xB4));

		search.render(context, 200, 11, 220, 20, true);

		int closeX = DESIGN_WIDTH - PAD - 22;
		boolean closeHovered = inside(mouseX, mouseY, closeX, 10, 22, 22);
		RoundedRenderer.fill(context, closeX, 10, 22, 22, 11, closeHovered ? 0x66FF5A6E : Theme.ROW_HOVER);
		RoundedRenderer.outline(context, closeX, 10, 22, 22, 11,
				closeHovered ? Theme.withAlpha(0xFFFF5A6E, 0x99) : Theme.OUTLINE);
		Icons.CLOSE.draw(context, closeX + 6, 15, 11, closeHovered ? 0xFFFFFFFF : Theme.TEXT_MUTED);

		int modulesOn = 0;
		for (Module module : Modules.all()) {
			if (module.isEnabled()) {
				modulesOn++;
			}
		}
		String status = modulesOn + " of " + Modules.all().size() + " on";
		Fonts.SMALL.drawRight(context, status, closeX - 10, 21, Theme.TEXT_MUTED);
		RoundedRenderer.circle(context, closeX - 14 - Fonts.SMALL.width(status) - 8, 21, 3,
				modulesOn == 0 ? Theme.TEXT_DISABLED : theme.accentColor());

		context.fill(PAD, HEADER_HEIGHT - 1, DESIGN_WIDTH - PAD, HEADER_HEIGHT, Theme.fade(Theme.DIVIDER, open));
	}

	private void drawSidebar(GuiGraphics context, int mouseX, int mouseY, float open) {
		RoundedRenderer.fill(context, SIDEBAR_X, BODY_Y, SIDEBAR_WIDTH, BODY_HEIGHT, Theme.RADIUS_PANEL,
				Theme.fade(Theme.PANEL, open));
		RoundedRenderer.outline(context, SIDEBAR_X, BODY_Y, SIDEBAR_WIDTH, BODY_HEIGHT, Theme.RADIUS_PANEL,
				Theme.fade(Theme.OUTLINE, open));

		int y = BODY_Y + 6;
		y = sidebarRow(context, mouseX, mouseY, y, FAVOURITES, Icons.FAVORITES, "Favourites", countFavourites());
		divider(context, y + 2, open);
		y += 7;
		for (Category category : Category.all()) {
			y = sidebarRow(context, mouseX, mouseY, y, category.ordinal(), iconOf(category), category.label(),
					countIn(category));
		}
		divider(context, y + 2, open);
		y += 7;
		sidebarRow(context, mouseX, mouseY, y, CLIENT, Icons.CONFIG, "Client",
				F1Client.get().settings().all().size());
	}

	private void divider(GuiGraphics context, int y, float open) {
		context.fill(SIDEBAR_X + 10, y, SIDEBAR_X + SIDEBAR_WIDTH - 10, y + 1, Theme.fade(Theme.DIVIDER, open));
	}

	/**
	 * @return the y of the next row
	 */
	private int sidebarRow(GuiGraphics context, int mouseX, int mouseY, int y, int id, Icons icon, String label,
			int count) {
		Theme theme = Theme.get();
		int x = SIDEBAR_X + 6;
		int width = SIDEBAR_WIDTH - 12;
		boolean hovered = inside(mouseX, mouseY, x, y, width, ROW_HEIGHT);
		boolean active = sidebarSelection == id;
		if (active) {
			RoundedRenderer.fill(context, x, y, width, ROW_HEIGHT, Theme.RADIUS_CONTROL, theme.accent(0x29));
			RoundedRenderer.fill(context, x, y + 4, 2, ROW_HEIGHT - 8, 1, theme.accentColor());
			RoundedRenderer.outline(context, x, y, width, ROW_HEIGHT, Theme.RADIUS_CONTROL, theme.accent(0x4D));
		} else if (hovered) {
			RoundedRenderer.fill(context, x, y, width, ROW_HEIGHT, Theme.RADIUS_CONTROL, Theme.ROW_HOVER);
		}
		int tint = active ? theme.accentColor() : hovered ? Theme.TEXT : Theme.TEXT_MUTED;
		icon.draw(context, x + 8, y + (ROW_HEIGHT - 11) / 2, 11, tint);
		Fonts.REGULAR.drawCentered(context, label, x + 25, y + ROW_HEIGHT / 2,
				active || hovered ? Theme.TEXT : Theme.TEXT_MUTED);
		if (count > 0) {
			Fonts.SMALL.drawRight(context, Integer.toString(count), x + width - 8, y + ROW_HEIGHT / 2,
					active ? theme.accentColor() : Theme.TEXT_DISABLED);
		}
		return y + ROW_HEIGHT + 2;
	}

	private void drawCards(GuiGraphics context, int mouseX, int mouseY, float open) {
		RoundedRenderer.fill(context, CARDS_X, BODY_Y, CARDS_WIDTH, BODY_HEIGHT, Theme.RADIUS_PANEL,
				Theme.fade(Theme.PANEL, open));
		RoundedRenderer.outline(context, CARDS_X, BODY_Y, CARDS_WIDTH, BODY_HEIGHT, Theme.RADIUS_PANEL,
				Theme.fade(Theme.OUTLINE, open));

		Fonts.BOLD.drawCentered(context, titleOfSelection(), CARDS_X + 10, BODY_Y + 13, Theme.TEXT);
		rebuildVisible();
		Fonts.SMALL.drawRight(context, visible.size() + (visible.size() == 1 ? " module" : " modules"),
				CARDS_X + CARDS_WIDTH - 10, BODY_Y + 13, Theme.TEXT_MUTED);
		context.fill(CARDS_X + 8, BODY_Y + 24, CARDS_X + CARDS_WIDTH - 8, BODY_Y + 25,
				Theme.fade(Theme.DIVIDER, open));

		int listY = BODY_Y + 30;
		int listHeight = BODY_HEIGHT - 38;
		int rows = (visible.size() + 1) / 2;
		int contentHeight = Math.max(0, rows * (CARD_HEIGHT + CARD_GAP) - CARD_GAP + 4);
		cards.update(contentHeight, listHeight);
		int offset = cards.offset();

		context.enableScissor(CARDS_X + 1, listY, CARDS_X + CARDS_WIDTH - 1, listY + listHeight);
		for (int i = 0; i < visible.size(); i++) {
			int x = cardX(i);
			int y = cardY(i) - offset;
			if (y + CARD_HEIGHT < listY || y > listY + listHeight) {
				continue;
			}
			drawCard(context, visible.get(i), x, y, mouseX, mouseY);
		}
		context.disableScissor();
		if (visible.isEmpty()) {
			SettingList.placeholder(context, CARDS_X, listY, CARDS_WIDTH, listHeight,
					query.isEmpty() ? "Nothing here yet" : "Nothing matches \u201c" + query + "\u201d");
		}
		Widgets.scrollbar(context, CARDS_X + CARDS_WIDTH - 5, listY + 2, listHeight - 4, contentHeight, offset);
	}

	private static int cardX(int index) {
		return CARDS_X + 8 + (index % 2) * (CARD_WIDTH + CARD_GAP);
	}

	private static int cardY(int index) {
		return BODY_Y + 32 + (index / 2) * (CARD_HEIGHT + CARD_GAP);
	}

	/** One module card: star, name, description, key and the toggle. */
	private void drawCard(GuiGraphics context, Module module, int x, int y, int mouseX, int mouseY) {
		Theme theme = Theme.get();
		boolean hovered = inside(mouseX, mouseY, x, y, CARD_WIDTH, CARD_HEIGHT);
		boolean on = module.isEnabled();
		boolean isSelected = module == selected && !showingClientSettings;

		if (on) {
			RoundedRenderer.shadow(context, x, y, CARD_WIDTH, CARD_HEIGHT, Theme.RADIUS_CARD, hovered ? 7 : 5,
					theme.accentGlow());
		} else if (hovered) {
			RoundedRenderer.shadow(context, x, y, CARD_WIDTH, CARD_HEIGHT, Theme.RADIUS_CARD, 4, Theme.SHADOW);
		}
		int body = on ? Theme.CARD_SELECTED : hovered ? Theme.CARD_HOVER : Theme.CARD;
		RoundedRenderer.fill(context, x, y, CARD_WIDTH, CARD_HEIGHT, Theme.RADIUS_CARD, body);
		RoundedRenderer.fill(context, x + Theme.RADIUS_CARD, y, CARD_WIDTH - Theme.RADIUS_CARD * 2, 1, 0,
				Theme.GLOSS_TOP);
		int rim = isSelected ? theme.accentColor() : on ? theme.accent(0x8C)
				: hovered ? Theme.OUTLINE_STRONG : Theme.OUTLINE;
		RoundedRenderer.outline(context, x, y, CARD_WIDTH, CARD_HEIGHT, Theme.RADIUS_CARD, rim);
		if (on) {
			// A slim accent bar down the left edge reads as "on" from across the screen.
			RoundedRenderer.fill(context, x + 2, y + 8, 2, CARD_HEIGHT - 16, 1, theme.accentColor());
		}

		boolean starHovered = inside(mouseX, mouseY, x + 8, y + 7, 12, 12);
		if (module.isFavourite()) {
			Icons.STAR_FILLED.draw(context, x + 8, y + 7, 12, theme.accentColor());
		} else {
			Icons.STAR.draw(context, x + 8, y + 7, 12, starHovered ? Theme.TEXT_MUTED : Theme.TEXT_DISABLED);
		}

		Fonts.BOLD.drawCentered(context, Fonts.BOLD.ellipsize(module.getName(), CARD_WIDTH - 62), x + 24, y + 14,
				on ? Theme.TEXT : Theme.TEXT_MUTED);
		Fonts.SMALL.drawCentered(context, Fonts.SMALL.ellipsize(module.getDescription(), CARD_WIDTH - 22), x + 11,
				y + 27, Theme.TEXT_DISABLED);
		Fonts.SMALL.drawRight(context, module.keybind().displayName(), x + CARD_WIDTH - 10, y + 38,
				hovered ? Theme.TEXT_MUTED : Theme.TEXT_DISABLED);

		Widgets.toggle(context, x + CARD_WIDTH - Widgets.TOGGLE_WIDTH - 9, y + 8, on ? 1f : 0f);
	}

	private void drawSettingsPanel(GuiGraphics context, int mouseX, int mouseY, float open) {
		Theme theme = Theme.get();
		RoundedRenderer.fill(context, SETTINGS_X, BODY_Y, SETTINGS_WIDTH, BODY_HEIGHT, Theme.RADIUS_PANEL,
				Theme.fade(Theme.PANEL, open));
		RoundedRenderer.outline(context, SETTINGS_X, BODY_Y, SETTINGS_WIDTH, BODY_HEIGHT, Theme.RADIUS_PANEL,
				Theme.fade(Theme.OUTLINE, open));

		String title = showingClientSettings ? "Client" : selected == null ? "No module" : selected.getName();
		Fonts.BOLD.drawCentered(context, Fonts.BOLD.ellipsize(title, SETTINGS_WIDTH - 60), SETTINGS_X + 10,
				BODY_Y + 13, Theme.TEXT);
		if (selected != null && !showingClientSettings) {
			boolean starHovered = inside(mouseX, mouseY, SETTINGS_X + SETTINGS_WIDTH - 24, BODY_Y + 6, 14, 14);
			Icons icon = selected.isFavourite() ? Icons.STAR_FILLED : Icons.STAR;
			icon.draw(context, SETTINGS_X + SETTINGS_WIDTH - 24, BODY_Y + 7, 13, selected.isFavourite()
					? theme.accentColor()
					: starHovered ? Theme.TEXT_MUTED : Theme.TEXT_DISABLED);
		}
		context.fill(SETTINGS_X + 8, BODY_Y + 24, SETTINGS_X + SETTINGS_WIDTH - 8, BODY_Y + 25,
				Theme.fade(Theme.DIVIDER, open));

		hoveredSetting = settings.render(context, SETTINGS_X + 8, listY(), SETTINGS_WIDTH - 18, listHeight(), mouseX,
				mouseY);
		if (settings.isEmpty()) {
			SettingList.placeholder(context, SETTINGS_X, listY(), SETTINGS_WIDTH, listHeight(),
					"Nothing to configure");
		}

		int footerY = BODY_Y + BODY_HEIGHT - 26;
		context.fill(SETTINGS_X + 8, footerY - 2, SETTINGS_X + SETTINGS_WIDTH - 8, footerY - 1,
				Theme.fade(Theme.DIVIDER, open));
		boolean resetHovered = inside(mouseX, mouseY, SETTINGS_X + 8, footerY + 2, 62, 18);
		Widgets.outlinedButton(context, SETTINGS_X + 8, footerY + 2, 62, 18, "Reset", resetHovered,
				!settings.isEmpty());
		Fonts.SMALL.drawRight(context, settings.summary(), SETTINGS_X + SETTINGS_WIDTH - 10, footerY + 11,
				Theme.TEXT_DISABLED);
	}

	private static int listY() {
		return BODY_Y + 30;
	}

	private static int listHeight() {
		return BODY_HEIGHT - 38 - 20;
	}

	private void drawFooter(GuiGraphics context, int mouseX, int mouseY, float open) {
		Theme theme = Theme.get();
		ConfigManager config = F1Client.get().config();
		int y = DESIGN_HEIGHT - FOOTER_HEIGHT;
		context.fill(PAD, y, DESIGN_WIDTH - PAD, y + 1, Theme.fade(Theme.DIVIDER, open));

		String hintText = hoveredSetting != null && F1Client.get().settings().descriptions()
				? hoveredSetting.getDescription()
				: hint.isEmpty() ? "Left click toggles  \u00b7  Right click opens settings  \u00b7  Middle click pins"
						: hint;
		Fonts.SMALL.drawCentered(context, Fonts.SMALL.ellipsize(hintText, 380), PAD, y + 14,
				hoveredSetting != null ? Theme.TEXT_MUTED : Theme.TEXT_DISABLED);

		int buttonY = y + 6;
		int right = DESIGN_WIDTH - PAD;
		right -= footerButton(context, mouseX, mouseY, right, buttonY, Icons.TRASH, null);
		right -= footerButton(context, mouseX, mouseY, right, buttonY, Icons.COPY, null);
		right -= footerButton(context, mouseX, mouseY, right, buttonY, null, "+");
		if (creatingProfile) {
			profileName.render(context, right - 132, buttonY - 1, 128, FOOTER_BUTTON - 2, true);
			right -= 136;
		} else {
			int width = Fonts.REGULAR.width(config.activeProfile()) + 34;
			right -= width + 4;
			boolean hovered = inside(mouseX, mouseY, right, buttonY - 1, width, FOOTER_BUTTON - 2);
			RoundedRenderer.panel(context, right, buttonY - 1, width, FOOTER_BUTTON - 2, (FOOTER_BUTTON - 2) / 2,
					Theme.INPUT, hovered ? theme.accent(0x8C) : Theme.OUTLINE);
			Icons.USER.draw(context, right + 7, buttonY + 2, 10, theme.accentColor());
			Fonts.REGULAR.drawCentered(context, config.activeProfile(), right + 21, buttonY + 7, Theme.TEXT);
		}
		right -= footerButton(context, mouseX, mouseY, right, buttonY, null, "<");
		right -= footerButton(context, mouseX, mouseY, right, buttonY, null, ">");
		Fonts.SMALL.drawRight(context, "Profile", right - 2, buttonY + 7, Theme.TEXT_DISABLED);
	}

	/**
	 * One small square footer button.
	 *
	 * @param right the right edge of the button
	 * @param icon  icon to draw, or {@code null} to draw the label instead
	 * @param label text to draw when there is no icon
	 * @return how much width it occupied, including the gap to the next one
	 */
	private int footerButton(GuiGraphics context, int mouseX, int mouseY, int right, int y, Icons icon,
			String label) {
		int height = FOOTER_BUTTON - 2;
		int x = right - FOOTER_BUTTON;
		boolean hovered = inside(mouseX, mouseY, x, y - 1, FOOTER_BUTTON, height + 2);
		RoundedRenderer.panel(context, x, y - 1, FOOTER_BUTTON, height + 2, (height + 2) / 2,
				hovered ? Theme.ROW_HOVER : Theme.INPUT, hovered ? Theme.OUTLINE_STRONG : Theme.OUTLINE);
		int tint = hovered ? Theme.TEXT : Theme.TEXT_MUTED;
		if (icon != null) {
			icon.draw(context, x + (FOOTER_BUTTON - 9) / 2, y + (height - 9) / 2, 9, tint);
		} else {
			Fonts.BOLD.drawMiddle(context, label, x + FOOTER_BUTTON / 2, y + height / 2, tint);
		}
		return FOOTER_STEP;
	}

	private String titleOfSelection() {
		if (!query.isEmpty()) {
			return "Search";
		}
		if (sidebarSelection == FAVOURITES) {
			return "Favourites";
		}
		if (sidebarSelection == CLIENT) {
			return "Client";
		}
		return Category.all()[sidebarSelection].label();
	}

	private static Icons iconOf(Category category) {
		return switch (category) {
		case WORLD -> Icons.WORLD;
		case PLAYER -> Icons.PLAYER;
		case COMBAT -> Icons.COMBAT;
		case MOVEMENT -> Icons.MOVEMENT;
		case VISUALS -> Icons.VISUALS;
		case MISC -> Icons.MISC;
		};
	}

	/** Fills {@link #visible} with the modules the sidebar and the search box ask for. */
	private void rebuildVisible() {
		visible.clear();
		String needle = query.toLowerCase(Locale.ROOT);
		for (Module module : Modules.all()) {
			if (matches(module, needle)) {
				visible.add(module);
			}
		}
	}

	private boolean matches(Module module, String needle) {
		if (sidebarSelection == CLIENT) {
			return false;
		}
		if (sidebarSelection == FAVOURITES && !module.isFavourite()) {
			return false;
		}
		if (sidebarSelection >= 0 && module.category().ordinal() != sidebarSelection) {
			return false;
		}
		if (needle.isEmpty()) {
			return true;
		}
		if (module.getName().toLowerCase(Locale.ROOT).contains(needle)
				|| module.getDescription().toLowerCase(Locale.ROOT).contains(needle)) {
			return true;
		}
		for (Setting<?> setting : module.settings()) {
			if (setting.getName().toLowerCase(Locale.ROOT).contains(needle)) {
				return true;
			}
		}
		return false;
	}

	private int countFavourites() {
		int count = 0;
		for (Module module : Modules.all()) {
			if (module.isFavourite()) {
				count++;
			}
		}
		return count;
	}

	private int countIn(Category category) {
		int count = 0;
		for (Module module : Modules.all()) {
			if (module.category() == category) {
				count++;
			}
		}
		return count;
	}

	@Override
	protected boolean onClick(int mouseX, int mouseY, int button) {
		hint = "";
		if (inside(mouseX, mouseY, DESIGN_WIDTH - PAD - 22, 10, 22, 22)) {
			UiSounds.click();
			close();
			return true;
		}
		if (search.mouseClicked(mouseX, mouseY)) {
			creatingProfile = false;
			profileName.setFocused(false);
			return true;
		}
		search.setFocused(false);
		if (creatingProfile && profileName.mouseClicked(mouseX, mouseY)) {
			return true;
		}
		if (clickSidebar(mouseX, mouseY)) {
			return true;
		}
		if (clickCards(mouseX, mouseY, button)) {
			return true;
		}
		if (clickSettingsPanel(mouseX, mouseY, button)) {
			return true;
		}
		if (clickFooter(mouseX, mouseY)) {
			return true;
		}
		if (creatingProfile) {
			creatingProfile = false;
			profileName.setFocused(false);
		}
		return false;
	}

	private boolean clickSidebar(int mouseX, int mouseY) {
		int y = BODY_Y + 6;
		if (inside(mouseX, mouseY, SIDEBAR_X + 6, y, SIDEBAR_WIDTH - 12, ROW_HEIGHT)) {
			setSidebar(FAVOURITES);
			return true;
		}
		y += ROW_HEIGHT + 2 + 7;
		for (Category category : Category.all()) {
			if (inside(mouseX, mouseY, SIDEBAR_X + 6, y, SIDEBAR_WIDTH - 12, ROW_HEIGHT)) {
				setSidebar(category.ordinal());
				return true;
			}
			y += ROW_HEIGHT + 2;
		}
		y += 2 + 7;
		if (inside(mouseX, mouseY, SIDEBAR_X + 6, y, SIDEBAR_WIDTH - 12, ROW_HEIGHT)) {
			setSidebar(CLIENT);
			return true;
		}
		return false;
	}

	private void setSidebar(int id) {
		sidebarSelection = id;
		if (id == CLIENT) {
			selectClientSettings();
		} else if (selected == null && !showingClientSettings) {
			List<Module> all = Modules.all();
			if (!all.isEmpty()) {
				select(all.get(0));
			}
		}
		cards.reset();
		UiSounds.click();
	}

	private boolean clickCards(int mouseX, int mouseY, int button) {
		int offset = cards.offset();
		for (int i = 0; i < visible.size(); i++) {
			int x = cardX(i);
			int y = cardY(i) - offset;
			if (!inside(mouseX, mouseY, x, y, CARD_WIDTH, CARD_HEIGHT)) {
				continue;
			}
			Module module = visible.get(i);
			if (button == 0) {
				boolean enabled = module.toggle();
				UiSounds.toggle(enabled);
				F1Client.LOGGER.info("{} {}", module.getName(), enabled ? "enabled" : "disabled");
				F1Client.get().config().markDirty();
				hint = module.getName() + (enabled ? " enabled" : " disabled");
			} else if (button == 1) {
				select(module);
				UiSounds.click();
				hint = module.getName() + " settings";
			} else if (button == 2) {
				module.setFavourite(!module.isFavourite());
				UiSounds.click();
				F1Client.get().config().markDirty();
				hint = module.getName() + (module.isFavourite() ? " pinned to Favourites" : " unpinned");
			}
			return true;
		}
		return false;
	}

	private boolean clickSettingsPanel(int mouseX, int mouseY, int button) {
		if (!inside(mouseX, mouseY, SETTINGS_X, BODY_Y, SETTINGS_WIDTH, BODY_HEIGHT)) {
			return false;
		}
		int footerY = BODY_Y + BODY_HEIGHT - 26;
		if (inside(mouseX, mouseY, SETTINGS_X + 8, footerY + 2, 62, 18) && !settings.isEmpty()) {
			settings.resetAll();
			UiSounds.click();
			F1Client.get().config().markDirty();
			hint = "Reset " + (showingClientSettings ? "the client" : selected.getName()) + " to its defaults";
			return true;
		}
		if (selected != null && !showingClientSettings
				&& inside(mouseX, mouseY, SETTINGS_X + SETTINGS_WIDTH - 24, BODY_Y + 6, 14, 14)) {
			selected.setFavourite(!selected.isFavourite());
			UiSounds.click();
			F1Client.get().config().markDirty();
			return true;
		}
		settings.mouseClicked(mouseX, mouseY, button, SETTINGS_X + 8, listY(), SETTINGS_WIDTH - 18, listHeight());
		F1Client.get().config().markDirty();
		return true;
	}

	private boolean clickFooter(int mouseX, int mouseY) {
		ConfigManager config = F1Client.get().config();
		int y = DESIGN_HEIGHT - FOOTER_HEIGHT + 6;
		int right = DESIGN_WIDTH - PAD;
		if (footerHit(mouseX, mouseY, right, y)) {
			// Delete the active profile, unless it is the only one.
			String gone = config.activeProfile();
			if (config.deleteProfile(gone)) {
				reloadPanel();
				hint = "Deleted " + gone + "; " + config.activeProfile() + " is active";
			} else {
				hint = "The last profile cannot be deleted";
			}
			UiSounds.click();
			return true;
		}
		right -= FOOTER_STEP;
		if (footerHit(mouseX, mouseY, right, y)) {
			String copy = freeCopyName(config, config.activeProfile());
			if (config.duplicateProfile(config.activeProfile(), copy)) {
				reloadPanel();
				hint = "Copied to " + config.activeProfile();
			}
			UiSounds.click();
			return true;
		}
		right -= FOOTER_STEP;
		if (footerHit(mouseX, mouseY, right, y)) {
			creatingProfile = !creatingProfile;
			profileName.setFocused(creatingProfile);
			if (creatingProfile) {
				profileName.clear();
				search.setFocused(false);
				hint = "Type a name, then press Enter";
			}
			UiSounds.click();
			return true;
		}
		if (creatingProfile) {
			right -= 136;
			if (profileName.mouseClicked(mouseX, mouseY)) {
				return true;
			}
		} else {
			int width = Fonts.REGULAR.width(config.activeProfile()) + 34;
			right -= width + 4;
			if (inside(mouseX, mouseY, right, y - 1, width, FOOTER_BUTTON - 2)) {
				cycleProfile(config, 1);
				UiSounds.click();
				return true;
			}
		}
		right -= FOOTER_STEP;
		if (footerHit(mouseX, mouseY, right, y)) {
			cycleProfile(config, -1);
			UiSounds.click();
			return true;
		}
		right -= FOOTER_STEP;
		if (footerHit(mouseX, mouseY, right, y)) {
			cycleProfile(config, 1);
			UiSounds.click();
			return true;
		}
		return false;
	}

	private static boolean footerHit(int mouseX, int mouseY, int right, int y) {
		return inside(mouseX, mouseY, right - FOOTER_BUTTON, y - 1, FOOTER_BUTTON, FOOTER_BUTTON);
	}

	private void cycleProfile(ConfigManager config, int direction) {
		List<String> names = config.profiles();
		int index = names.indexOf(config.activeProfile());
		if (index < 0) {
			return;
		}
		String next = names.get((index + direction + names.size()) % names.size());
		if (config.switchProfile(next)) {
			reloadPanel();
			hint = "Profile " + next;
		}
	}

	/**
	 * Rebuilds the settings panel after the profile under it changed, so no control keeps
	 * animation state or a text value from the profile that was just left.
	 */
	private void reloadPanel() {
		settings.clear();
		if (showingClientSettings || selected == null) {
			selectClientSettings();
		} else {
			select(selected);
		}
	}

	/** @return a name for a copy that does not exist yet. */
	private static String freeCopyName(ConfigManager config, String source) {
		String base = ConfigManager.sanitize(source + "-copy");
		String candidate = base;
		int counter = 2;
		while (config.profiles().contains(candidate)) {
			candidate = base + "-" + counter++;
		}
		return candidate;
	}

	/** Applies the profile name typed into the footer field. */
	private void submitProfileName() {
		ConfigManager config = F1Client.get().config();
		String name = ConfigManager.sanitize(profileName.text());
		creatingProfile = false;
		profileName.setFocused(false);
		profileName.clear();
		if (name.isEmpty()) {
			hint = "A profile needs a name";
			return;
		}
		if (config.createProfile(name)) {
			reloadPanel();
			hint = "Created profile " + name;
		} else {
			hint = "There is already a profile called " + name;
		}
	}

	@Override
	protected void onRelease(int mouseX, int mouseY, int button) {
		settings.releaseAll();
	}

	@Override
	protected void onDrag(int mouseX, int mouseY, int button) {
		settings.mouseDragged(mouseX, mouseY, SETTINGS_X + 8, listY(), SETTINGS_WIDTH - 18);
	}

	@Override
	protected void onScroll(int mouseX, int mouseY, double amount) {
		if (amount == 0) {
			return;
		}
		if (inside(mouseX, mouseY, SETTINGS_X, BODY_Y, SETTINGS_WIDTH, BODY_HEIGHT)) {
			settings.scroll(amount, mouseX, mouseY, SETTINGS_X + 8, listY(), SETTINGS_WIDTH - 18, listHeight());
			return;
		}
		if (inside(mouseX, mouseY, CARDS_X, BODY_Y, CARDS_WIDTH, BODY_HEIGHT)) {
			cards.scroll(amount);
		}
	}

	@Override
	protected boolean onKey(KeyEvent input) {
		if (creatingProfile && profileName.isFocused()) {
			if (input.isEscape()) {
				creatingProfile = false;
				profileName.setFocused(false);
				profileName.clear();
				return true;
			}
			return profileName.keyPressed(input);
		}
		if (search.isFocused()) {
			if (input.isEscape()) {
				search.setFocused(false);
				search.clear();
				return true;
			}
			return search.keyPressed(input);
		}
		if (settings.keyPressed(input)) {
			F1Client.get().config().markDirty();
			return true;
		}
		return false;
	}

	@Override
	protected boolean onChar(CharacterEvent input) {
		if (creatingProfile && profileName.charTyped(input)) {
			return true;
		}
		if (search.isFocused() && search.charTyped(input)) {
			return true;
		}
		return settings.charTyped(input);
	}

	/** Saves before the screen goes away, so a profile is never left half-written. */
	@Override
	public void close() {
		F1Client.get().config().flush();
		super.close();
	}

	@Override
	public void removed() {
		F1Client.get().config().flush();
	}
}
