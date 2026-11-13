package dev.f1client.gui;

import dev.f1client.F1Client;
import dev.f1client.auth.AuthState;
import dev.f1client.core.GlobalSettings;
import dev.f1client.gui.control.SettingControl;
import dev.f1client.gui.control.SettingControls;
import dev.f1client.gui.widget.TextBox;
import dev.f1client.gui.widget.Widgets;
import dev.f1client.module.Category;
import dev.f1client.module.Module;
import dev.f1client.render.Fonts;
import dev.f1client.render.Icons;
import dev.f1client.render.RoundedRenderer;
import dev.f1client.render.Theme;
import dev.f1client.setting.Setting;
import dev.f1client.util.UiSounds;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.input.CharInput;
import net.minecraft.client.input.KeyInput;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

/**
 * The ClickGUI: one glass window with a category sidebar, a searchable two-column grid
 * of module cards and a settings panel for the selected module.
 *
 * <p>It can only be opened through {@code KeybindManager.openClient()}, which routes to
 * the auth screen instead while the account gate is closed.
 */
public final class ClickGuiScreen extends UiScreen {
	private static final int WIDTH = 700;
	private static final int HEIGHT = 400;
	private static final int SIDEBAR = 136;
	private static final int BOTTOM = 28;
	private static final int PANEL_WIDTH = 236;
	private static final int ROW = 20;
	private static final int CARD_HEIGHT = 44;
	private static final int GAP = 6;
	private static final int SEARCH_HEIGHT = 24;

	private static final int TAB_FAVORITES = 0;
	private static final int TAB_SETTINGS = 1 + Category.values().length;
	private static final Icons[] CATEGORY_ICONS = {Icons.COMBAT, Icons.MOVEMENT, Icons.PLAYER, Icons.VISUALS, Icons.WORLD, Icons.MISC};
	private static final String HINT = "Enter opens settings  ·  Space toggles  ·  Tab navigates  ·  Right click resets a setting";

	private static int lastTab = 1 + Category.WORLD.ordinal();

	private final F1Client mod = F1Client.get();
	private final GlobalSettings globals = mod.globals();
	private final TextBox search = new TextBox(40, false).placeholder("Search modules...").leadingIcon(Icons.SEARCH);
	private final List<Module> visible = new ArrayList<>();
	private final Map<Module, Anim> toggleAnims = new IdentityHashMap<>();
	private final List<SettingControl<?>> controls = new ArrayList<>();
	private final List<SettingControl<?>> globalControls = new ArrayList<>();
	private final List<String> descriptionLines = new ArrayList<>();
	private final SmoothScroll gridScroll = new SmoothScroll();
	private final SmoothScroll panelScroll = new SmoothScroll();
	private final Anim panelAnim = new Anim(0f);
	private final Anim enabledAnim = new Anim(0f);

	private int tab = lastTab;
	private int highlighted = -1;
	private Module selected;
	private SettingControl<?> keybindControl;
	private SettingControl<?> dragging;
	private String hoverHint = "";
	private int gridTop;
	private int gridHeight;
	private int gridLeft;
	private int gridWidth;
	private int panelViewTop;
	private int panelViewHeight;
	private int globalButtonsY;

	public ClickGuiScreen() {
		super(Text.literal("F1Client"), WIDTH, HEIGHT);
		search.onChange(() -> {
			gridScroll.reset();
			highlighted = -1;
		});
		globalControls.add(SettingControls.create(globals.clientKey()));
		globalControls.add(SettingControls.create(globals.accent()));
		globalControls.add(SettingControls.create(globals.uiSounds()));
	}

	// ------------------------------------------------------------------ drawing

	@Override
	protected void draw(DrawContext context, int mouseX, int mouseY) {
		hoverHint = "";
		RoundedRenderer.shadow(context, 0, 0, WIDTH, HEIGHT, Theme.RADIUS_WINDOW, 22, Theme.SHADOW);
		RoundedRenderer.panel(context, 0, 0, WIDTH, HEIGHT, Theme.RADIUS_WINDOW, Theme.WINDOW, Theme.OUTLINE);
		drawSidebar(context, mouseX, mouseY);

		panelAnim.set(selected != null && tab != TAB_SETTINGS);
		int panelSpace = Math.round((PANEL_WIDTH + 8) * panelAnim.value());
		gridLeft = SIDEBAR + 8;
		gridWidth = WIDTH - 8 - gridLeft - panelSpace;
		if (tab == TAB_SETTINGS) {
			drawGlobalSettings(context, mouseX, mouseY);
		} else {
			search.render(context, gridLeft, 8, gridWidth, SEARCH_HEIGHT, true);
			drawGrid(context, mouseX, mouseY);
			if (selected != null && panelAnim.value() > 0.02f) {
				drawPanel(context, mouseX, mouseY);
			}
		}

		context.fill(SIDEBAR, HEIGHT - BOTTOM, WIDTH - 1, HEIGHT - BOTTOM + 1, Theme.DIVIDER);
		String hint = hoverHint.isEmpty() ? HINT : hoverHint;
		Fonts.SMALL.drawCentered(context, Fonts.SMALL.ellipsize(hint, WIDTH - SIDEBAR - 24), SIDEBAR + 12, HEIGHT - BOTTOM / 2,
				hoverHint.isEmpty() ? Theme.TEXT_DISABLED : Theme.TEXT_MUTED);
	}

	private void drawSidebar(DrawContext context, int mouseX, int mouseY) {
		context.fill(SIDEBAR, 1, SIDEBAR + 1, HEIGHT - 1, Theme.DIVIDER);
		Icons.LOGO.draw(context, 14, 13, 20, Theme.get().accentColor());
		Fonts.BOLD.drawCentered(context, F1Client.NAME, 40, 19, Theme.TEXT);
		Fonts.SMALL.drawCentered(context, "Version " + mod.version(), 40, 29, Theme.TEXT_MUTED);

		int y = 48;
		Fonts.SMALL.drawCentered(context, "FEATURES", 14, y + 4, Theme.TEXT_DISABLED);
		y += 14;
		sidebarRow(context, mouseX, mouseY, y, TAB_FAVORITES, Icons.FAVORITES, "Favorites");
		y += ROW + 2;
		Category[] categories = Category.values();
		for (int i = 0; i < categories.length; i++) {
			sidebarRow(context, mouseX, mouseY, y, 1 + i, CATEGORY_ICONS[i], categories[i].label());
			y += ROW + 2;
		}
		y += 8;
		Fonts.SMALL.drawCentered(context, "OTHERS", 14, y + 4, Theme.TEXT_DISABLED);
		y += 14;
		sidebarRow(context, mouseX, mouseY, y, TAB_SETTINGS, Icons.CONFIG, "Settings");

		int userY = HEIGHT - 38;
		context.fill(1, userY - 6, SIDEBAR, userY - 5, Theme.DIVIDER);
		RoundedRenderer.fill(context, 12, userY, 24, 24, 12, Theme.TRACK_OFF);
		Icons.USER.draw(context, 18, userY + 6, 12, Theme.TEXT);
		boolean online = mod.auth().state() == AuthState.AUTHENTICATED;
		RoundedRenderer.fill(context, 29, userY + 17, 7, 7, 3, online ? Theme.ONLINE : Theme.OFFLINE);
		Fonts.REGULAR.drawCentered(context, Fonts.REGULAR.ellipsize(mod.auth().username(), SIDEBAR - 72), 42, userY + 7, Theme.TEXT);
		Fonts.SMALL.drawCentered(context, online ? "Online" : "Offline mode", 42, userY + 18, Theme.TEXT_MUTED);
		boolean logoutHover = inside(mouseX, mouseY, SIDEBAR - 28, userY + 2, 20, 20);
		if (logoutHover) {
			RoundedRenderer.fill(context, SIDEBAR - 28, userY + 2, 20, 20, Theme.RADIUS_CONTROL, Theme.ROW_HOVER);
			hoverHint = "Sign out of this account";
		}
		Icons.LOGOUT.draw(context, SIDEBAR - 23, userY + 7, 10, logoutHover ? Theme.TEXT : Theme.TEXT_MUTED);
	}

	private void sidebarRow(DrawContext context, int mouseX, int mouseY, int y, int index, Icons icon, String label) {
		boolean active = tab == index;
		boolean hovered = inside(mouseX, mouseY, 8, y, SIDEBAR - 16, ROW);
		if (active || hovered) {
			RoundedRenderer.fill(context, 8, y, SIDEBAR - 16, ROW, Theme.RADIUS_CONTROL, active ? Theme.ROW_SELECTED : Theme.ROW_HOVER);
		}
		int color = active ? Theme.TEXT : Theme.TEXT_MUTED;
		icon.draw(context, 15, y + (ROW - 10) / 2, 10, color);
		Fonts.REGULAR.drawCentered(context, label, 32, y + ROW / 2, color);
	}

	private void collectVisible() {
		visible.clear();
		String query = search.text().trim().toLowerCase(Locale.ROOT);
		List<Module> all = mod.modules().all();
		for (int i = 0; i < all.size(); i++) {
			Module module = all.get(i);
			boolean match;
			if (!query.isEmpty()) {
				match = module.name().toLowerCase(Locale.ROOT).contains(query)
						|| module.description().toLowerCase(Locale.ROOT).contains(query);
			} else if (tab == TAB_FAVORITES) {
				match = globals.isFavorite(module.name());
			} else {
				match = module.category().ordinal() == tab - 1;
			}
			if (match) {
				visible.add(module);
			}
		}
		if (highlighted >= visible.size()) {
			highlighted = visible.size() - 1;
		}
	}

	/** Two columns, or one while the settings panel leaves too little room for two readable cards. */
	private int columns() {
		return gridWidth >= 440 ? 2 : 1;
	}

	private int cardWidth() {
		int columns = columns();
		return (gridWidth - GAP * (columns - 1)) / columns;
	}

	private int cardX(int index) {
		return gridLeft + (index % columns()) * (cardWidth() + GAP);
	}

	private int cardY(int index) {
		return gridTop + (index / columns()) * (CARD_HEIGHT + GAP) - gridScroll.offset();
	}

	private void drawGrid(DrawContext context, int mouseX, int mouseY) {
		collectVisible();
		gridTop = 8 + SEARCH_HEIGHT + 8;
		gridHeight = HEIGHT - BOTTOM - 6 - gridTop;
		int rows = (visible.size() + columns() - 1) / columns();
		int contentHeight = rows * (CARD_HEIGHT + GAP) - (rows > 0 ? GAP : 0);
		gridScroll.update(contentHeight, gridHeight);

		if (visible.isEmpty()) {
			String empty = !search.isEmpty() ? "No modules match \"" + search.text() + "\"."
					: tab == TAB_FAVORITES ? "Star a module to pin it here." : "No modules in this category yet.";
			Fonts.REGULAR.drawMiddle(context, Fonts.REGULAR.ellipsize(empty, gridWidth - 16), gridLeft + gridWidth / 2,
					gridTop + 40, Theme.TEXT_MUTED);
			return;
		}
		context.enableScissor(gridLeft - 4, gridTop, gridLeft + gridWidth + 4, gridTop + gridHeight);
		boolean mouseInGrid = inside(mouseX, mouseY, gridLeft, gridTop, gridWidth, gridHeight);
		int width = cardWidth();
		for (int i = 0; i < visible.size(); i++) {
			int x = cardX(i);
			int y = cardY(i);
			if (y + CARD_HEIGHT < gridTop || y > gridTop + gridHeight) {
				continue;
			}
			Module module = visible.get(i);
			boolean hovered = mouseInGrid && inside(mouseX, mouseY, x, y, width, CARD_HEIGHT);
			boolean focus = module == selected || i == highlighted;
			Anim anim = toggleAnim(module);
			anim.set(module.isEnabled());
			float on = anim.value();
			int outline = Theme.mix(focus ? Theme.OUTLINE_STRONG : Theme.OUTLINE, Theme.OUTLINE_STRONG, on * 0.8f);
			RoundedRenderer.panel(context, x, y, width, CARD_HEIGHT, Theme.RADIUS_CARD, hovered ? Theme.CARD_HOVER : Theme.CARD, outline);

			int textWidth = width - 12 - 14 - 8 - Widgets.TOGGLE_WIDTH - 12;
			Fonts.BOLD.drawCentered(context, Fonts.BOLD.ellipsize(module.name(), textWidth), x + 12, y + 15, Theme.TEXT);
			Fonts.SMALL.drawCentered(context, Fonts.SMALL.ellipsize(module.description(), textWidth), x + 12, y + 29, Theme.TEXT_MUTED);

			boolean favorite = globals.isFavorite(module.name());
			int starX = x + width - 12 - Widgets.TOGGLE_WIDTH - 8 - 11;
			boolean starHover = hovered && inside(mouseX, mouseY, starX - 3, y + 10, 17, 24);
			(favorite ? Icons.STAR_FILLED : Icons.STAR).draw(context, starX, y + (CARD_HEIGHT - 11) / 2, 11,
					favorite ? Theme.get().accentColor() : starHover ? Theme.TEXT : Theme.TEXT_DISABLED);
			Widgets.toggle(context, x + width - 12 - Widgets.TOGGLE_WIDTH, y + (CARD_HEIGHT - Widgets.TOGGLE_HEIGHT) / 2, on);
			if (hovered) {
				hoverHint = module.description();
			}
		}
		context.disableScissor();
		Widgets.scrollbar(context, gridLeft + gridWidth + 2, gridTop, gridHeight, contentHeight, gridScroll.offset());
	}

	private Anim toggleAnim(Module module) {
		Anim anim = toggleAnims.get(module);
		if (anim == null) {
			anim = new Anim(module.isEnabled() ? 1f : 0f);
			toggleAnims.put(module, anim);
		}
		return anim;
	}

	private int panelX() {
		return WIDTH - 8 - Math.round(PANEL_WIDTH * panelAnim.value());
	}

	private void drawPanel(DrawContext context, int mouseX, int mouseY) {
		int x = panelX();
		int y = 8;
		int height = HEIGHT - BOTTOM - 6 - y;
		int inner = PANEL_WIDTH - 24;
		context.enableScissor(x, y, WIDTH - 8, y + height);
		RoundedRenderer.panel(context, x, y, PANEL_WIDTH, height, Theme.RADIUS_PANEL, Theme.PANEL, Theme.OUTLINE);

		Fonts.TITLE.drawCentered(context, Fonts.TITLE.ellipsize(selected.name(), inner - 90), x + 12, y + 18, Theme.TEXT);
		boolean closeHover = inside(mouseX, mouseY, x + PANEL_WIDTH - 26, y + 8, 20, 20);
		if (closeHover) {
			RoundedRenderer.fill(context, x + PANEL_WIDTH - 26, y + 8, 20, 20, Theme.RADIUS_CONTROL, Theme.ROW_HOVER);
		}
		Icons.CLOSE.draw(context, x + PANEL_WIDTH - 21, y + 13, 10, closeHover ? Theme.TEXT : Theme.TEXT_MUTED);
		enabledAnim.set(selected.isEnabled());
		int toggleX = x + PANEL_WIDTH - 34 - Widgets.TOGGLE_WIDTH;
		Widgets.toggle(context, toggleX, y + 18 - Widgets.TOGGLE_HEIGHT / 2, enabledAnim.value());
		Fonts.SMALL.drawRight(context, "Enabled", toggleX - 6, y + 18, Theme.TEXT_MUTED);

		int cursor = y + 34;
		for (int i = 0; i < descriptionLines.size(); i++) {
			Fonts.REGULAR.drawCentered(context, descriptionLines.get(i), x + 12, cursor + 5, Theme.TEXT_MUTED);
			cursor += 11;
		}
		cursor += 6;
		context.fill(x + 12, cursor, x + PANEL_WIDTH - 12, cursor + 1, Theme.DIVIDER);
		cursor += 5;

		int footer = 34;
		panelViewTop = cursor;
		panelViewHeight = y + height - footer - cursor;
		context.enableScissor(x, panelViewTop, x + PANEL_WIDTH, panelViewTop + panelViewHeight);
		boolean mouseInView = inside(mouseX, mouseY, x, panelViewTop, PANEL_WIDTH, panelViewHeight);
		int controlMouseX = mouseInView || dragging != null ? mouseX : Integer.MIN_VALUE / 2;
		int controlMouseY = mouseInView || dragging != null ? mouseY : Integer.MIN_VALUE / 2;
		int contentY = panelViewTop - panelScroll.offset();
		int start = contentY;
		String group = "";
		for (int i = 0; i < controls.size(); i++) {
			SettingControl<?> control = controls.get(i);
			Setting<?> setting = control.setting();
			if (!setting.isVisible()) {
				control.place(Integer.MIN_VALUE / 2, Integer.MIN_VALUE / 2, 0);
				continue;
			}
			if (!setting.group().equals(group)) {
				group = setting.group();
				if (!group.isEmpty()) {
					contentY += 6;
					Widgets.sectionLabel(context, x + 12, contentY, inner, group.toUpperCase(Locale.ROOT));
					contentY += 12;
				}
			}
			control.place(x + 12, contentY, inner);
			if (contentY + control.height() >= panelViewTop && contentY <= panelViewTop + panelViewHeight) {
				control.render(context, controlMouseX, controlMouseY);
				if (mouseInView && control.contains(mouseX, mouseY) && !setting.description().isEmpty()) {
					hoverHint = setting.description();
				}
			}
			contentY += control.height();
		}
		contentY += 6;
		Widgets.sectionLabel(context, x + 12, contentY, inner, "KEYBIND");
		contentY += 12;
		keybindControl.place(x + 12, contentY, inner);
		keybindControl.render(context, controlMouseX, controlMouseY);
		contentY += keybindControl.height() + 4;
		context.disableScissor();
		int contentHeight = contentY - start;
		panelScroll.update(contentHeight, panelViewHeight);
		Widgets.scrollbar(context, x + PANEL_WIDTH - 5, panelViewTop, panelViewHeight, contentHeight, panelScroll.offset());

		int buttonY = y + height - footer + 7;
		Widgets.outlinedButton(context, x + 12, buttonY, inner, 20, "Reset module settings",
				inside(mouseX, mouseY, x + 12, buttonY, inner, 20), true);
		context.disableScissor();
	}

	private void drawGlobalSettings(DrawContext context, int mouseX, int mouseY) {
		int x = gridLeft + 8;
		int width = Math.min(360, gridWidth - 16);
		Fonts.TITLE.drawCentered(context, "Settings", x, 22, Theme.TEXT);
		Fonts.REGULAR.drawCentered(context, "Saved for the account " + mod.auth().username() + ".", x, 37, Theme.TEXT_MUTED);
		int y = 52;
		Widgets.sectionLabel(context, x, y, width, "CLIENT");
		y += 12;
		for (int i = 0; i < globalControls.size(); i++) {
			SettingControl<?> control = globalControls.get(i);
			control.place(x, y, width);
			control.render(context, mouseX, mouseY);
			y += control.height();
		}
		y += 10;
		Widgets.sectionLabel(context, x, y, width, "ACCOUNT");
		y += 16;
		globalButtonsY = y;
		Widgets.iconButton(context, x, y, 96, 20, Icons.LOGOUT, "Sign out", inside(mouseX, mouseY, x, y, 96, 20));
		Widgets.outlinedButton(context, x + 104, y, 132, 20, "Reset all settings", inside(mouseX, mouseY, x + 104, y, 132, 20), true);
		if (mod.usesMockBackend()) {
			Fonts.SMALL.drawCentered(context, "Accounts are stored locally: no account server is configured in auth.json.", x,
					y + 34, Theme.TEXT_DISABLED);
		}
	}

	// ------------------------------------------------------------------ state

	private void select(Module module) {
		if (selected == module) {
			return;
		}
		selected = module;
		controls.clear();
		descriptionLines.clear();
		panelScroll.reset();
		keybindControl = null;
		if (module == null) {
			return;
		}
		for (Setting<?> setting : module.settings()) {
			controls.add(SettingControls.create(setting));
		}
		keybindControl = SettingControls.create(module.keybind());
		enabledAnim.snap(module.isEnabled() ? 1f : 0f);
		wrap(module.description(), PANEL_WIDTH - 24, descriptionLines);
	}

	private static void wrap(String text, int maxWidth, List<String> out) {
		StringBuilder line = new StringBuilder();
		for (String word : text.split(" ")) {
			if (line.length() > 0 && Fonts.REGULAR.width(line + " " + word) > maxWidth) {
				out.add(line.toString());
				line.setLength(0);
			}
			if (line.length() > 0) {
				line.append(' ');
			}
			line.append(word);
		}
		if (line.length() > 0) {
			out.add(line.toString());
		}
	}

	private void toggle(Module module) {
		module.toggle();
		UiSounds.toggle(module.isEnabled());
	}

	private void setTab(int index) {
		if (tab != index) {
			tab = index;
			lastTab = index;
			highlighted = -1;
			gridScroll.reset();
			search.clear();
			search.setFocused(false);
			select(null);
			UiSounds.click();
		}
	}

	private SettingControl<?> capturing() {
		List<SettingControl<?>> active = tab == TAB_SETTINGS ? globalControls : controls;
		for (int i = 0; i < active.size(); i++) {
			if (active.get(i).capturesKeyboard()) {
				return active.get(i);
			}
		}
		return tab != TAB_SETTINGS && keybindControl != null && keybindControl.capturesKeyboard() ? keybindControl : null;
	}

	// ------------------------------------------------------------------ input

	@Override
	protected boolean onClick(int mouseX, int mouseY, int button) {
		if (mouseX < SIDEBAR) {
			return button != 0 || clickSidebar(mouseX, mouseY);
		}
		if (tab == TAB_SETTINGS) {
			return clickGlobalSettings(mouseX, mouseY, button);
		}
		if (selected != null && mouseX >= panelX()) {
			search.setFocused(false);
			return clickPanel(mouseX, mouseY, button);
		}
		dispatchToControls(Integer.MIN_VALUE / 2, Integer.MIN_VALUE / 2, button);
		if (search.mouseClicked(mouseX, mouseY)) {
			return true;
		}
		search.setFocused(false);
		if (!inside(mouseX, mouseY, gridLeft, gridTop, gridWidth, gridHeight)) {
			return true;
		}
		int width = cardWidth();
		for (int i = 0; i < visible.size(); i++) {
			int x = cardX(i);
			int y = cardY(i);
			if (!inside(mouseX, mouseY, x, y, width, CARD_HEIGHT)) {
				continue;
			}
			Module module = visible.get(i);
			highlighted = i;
			int toggleX = x + width - 12 - Widgets.TOGGLE_WIDTH;
			int starX = toggleX - 8 - 11;
			if (button == 0 && mouseX >= toggleX - 3) {
				toggle(module);
			} else if (button == 0 && mouseX >= starX - 3) {
				globals.toggleFavorite(module.name());
				UiSounds.click();
			} else if (button == 0 || button == 1) {
				select(selected == module && button == 0 ? null : module);
				UiSounds.click();
			}
			return true;
		}
		return true;
	}

	private boolean clickSidebar(int mouseX, int mouseY) {
		search.setFocused(false);
		int userY = HEIGHT - 38;
		if (inside(mouseX, mouseY, SIDEBAR - 28, userY + 2, 20, 20)) {
			signOut();
			return true;
		}
		int y = 62;
		for (int index = 0; index <= Category.values().length; index++) {
			if (inside(mouseX, mouseY, 8, y, SIDEBAR - 16, ROW)) {
				setTab(index);
				return true;
			}
			y += ROW + 2;
		}
		y += 22;
		if (inside(mouseX, mouseY, 8, y, SIDEBAR - 16, ROW)) {
			setTab(TAB_SETTINGS);
		}
		return true;
	}

	private boolean clickGlobalSettings(int mouseX, int mouseY, int button) {
		for (int i = 0; i < globalControls.size(); i++) {
			SettingControl<?> control = globalControls.get(i);
			if (control.mouseClicked(mouseX, mouseY, button) && button == 0) {
				dragging = control;
			}
		}
		if (button != 0) {
			return true;
		}
		int x = gridLeft + 8;
		if (inside(mouseX, mouseY, x, globalButtonsY, 96, 20)) {
			signOut();
		} else if (inside(mouseX, mouseY, x + 104, globalButtonsY, 132, 20)) {
			globals.reset();
			mod.modules().resetAll();
			UiSounds.click();
		}
		return true;
	}

	private boolean clickPanel(int mouseX, int mouseY, int button) {
		int x = panelX();
		int y = 8;
		int height = HEIGHT - BOTTOM - 6 - y;
		boolean inView = inside(mouseX, mouseY, x, panelViewTop, PANEL_WIDTH, panelViewHeight);
		dispatchToControls(inView ? mouseX : Integer.MIN_VALUE / 2, inView ? mouseY : Integer.MIN_VALUE / 2, button);
		if (button != 0 || inView) {
			return true;
		}
		if (inside(mouseX, mouseY, x + PANEL_WIDTH - 26, y + 8, 20, 20)) {
			select(null);
			UiSounds.click();
		} else if (inside(mouseX, mouseY, x + PANEL_WIDTH - 34 - Widgets.TOGGLE_WIDTH - 44, y + 8, Widgets.TOGGLE_WIDTH + 48, 20)) {
			toggle(selected);
		} else if (inside(mouseX, mouseY, x + 12, y + height - 27, PANEL_WIDTH - 24, 20)) {
			selected.resetSettings();
			UiSounds.click();
		}
		return true;
	}

	private void dispatchToControls(int mouseX, int mouseY, int button) {
		for (int i = 0; i < controls.size(); i++) {
			SettingControl<?> control = controls.get(i);
			if (control.mouseClicked(mouseX, mouseY, button) && button == 0) {
				dragging = control;
			}
		}
		if (keybindControl != null) {
			keybindControl.mouseClicked(mouseX, mouseY, button);
		}
	}

	private void signOut() {
		UiSounds.click();
		mod.auth().logout();
		client.setScreen(new AuthScreen());
	}

	@Override
	protected void onDrag(int mouseX, int mouseY, int button) {
		if (dragging != null && button == 0) {
			dragging.mouseDragged(mouseX, mouseY);
		}
	}

	@Override
	protected void onRelease(int mouseX, int mouseY, int button) {
		if (dragging != null) {
			dragging.mouseReleased();
			dragging = null;
		}
	}

	@Override
	protected void onScroll(int mouseX, int mouseY, double amount) {
		if (tab == TAB_SETTINGS) {
			return;
		}
		if (selected != null && mouseX >= panelX()) {
			panelScroll.scroll(amount);
		} else if (mouseX >= SIDEBAR) {
			gridScroll.scroll(amount);
		}
	}

	@Override
	protected boolean onKey(KeyInput input) {
		SettingControl<?> capture = capturing();
		if (capture != null) {
			capture.keyPressed(input);
			return true;
		}
		if (search.isFocused()) {
			if (input.isEscape()) {
				if (search.isEmpty()) {
					search.setFocused(false);
				} else {
					search.clear();
				}
				return true;
			}
			if (!input.isTab() && !input.isEnter()) {
				search.keyPressed(input);
				return true;
			}
			search.setFocused(false);
		}
		if (input.isEscape()) {
			if (selected != null) {
				select(null);
				return true;
			}
			return false;
		}
		if (tab == TAB_SETTINGS) {
			return false;
		}
		if (input.hasCtrlOrCmd() && input.key() == GLFW.GLFW_KEY_F) {
			search.setFocused(true);
			return true;
		}
		if (input.isTab() || input.isDown() || input.isUp() || input.isLeft() || input.isRight()) {
			if (!visible.isEmpty()) {
				int columns = columns();
				int step = input.isTab() ? (input.hasShift() ? -1 : 1)
						: input.isDown() ? columns : input.isUp() ? -columns : input.isRight() ? 1 : -1;
				int next = highlighted < 0 ? 0 : highlighted + step;
				if (input.isTab()) {
					next = Math.floorMod(next, visible.size());
				}
				if (next >= 0 && next < visible.size()) {
					highlighted = next;
					int top = (highlighted / columns) * (CARD_HEIGHT + GAP);
					gridScroll.reveal(top, top + CARD_HEIGHT, gridHeight);
				}
			}
			return true;
		}
		if (highlighted >= 0 && highlighted < visible.size()) {
			if (input.isEnter()) {
				select(visible.get(highlighted));
				UiSounds.click();
				return true;
			}
			if (input.key() == GLFW.GLFW_KEY_SPACE) {
				toggle(visible.get(highlighted));
				return true;
			}
		}
		return false;
	}

	@Override
	protected boolean onChar(CharInput input) {
		SettingControl<?> capture = capturing();
		if (capture != null) {
			return capture.charTyped(input);
		}
		if (tab == TAB_SETTINGS) {
			return false;
		}
		if (!search.isFocused()) {
			if (!input.isValidChar() || input.codepoint() == ' ') {
				return false;
			}
			search.setFocused(true);
		}
		return search.charTyped(input);
	}

	@Override
	public void tick() {
		if (!mod.auth().isUnlocked() && client.currentScreen == this) {
			client.setScreen(new AuthScreen());
		}
	}

	@Override
	public void removed() {
		if (dragging != null) {
			dragging.mouseReleased();
			dragging = null;
		}
		mod.config().markDirty();
		super.removed();
	}
}
