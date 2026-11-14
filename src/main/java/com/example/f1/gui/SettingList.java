package com.example.f1.gui;

import com.example.f1.gui.control.EnumControl;
import com.example.f1.gui.control.SettingControl;
import com.example.f1.gui.control.SettingControls;
import com.example.f1.gui.widget.Widgets;
import com.example.f1.render.Fonts;
import com.example.f1.render.Theme;
import com.example.f1.setting.Setting;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.input.CharInput;
import net.minecraft.client.input.KeyInput;

/**
 * The scrollable list of controls for one set of settings.
 *
 * <p>Both the module settings panel and the client settings panel are this, so the row
 * layout, the group headings, the scrolling and the input routing exist once. The controls
 * are built when the list is pointed at a new source and kept between frames, which is what
 * lets a toggle animate and a slider remember that it is being dragged.
 *
 * <p>Settings that carry a group are gathered under a small-caps heading, and the group is
 * repeated only when it changes, so a module with ten colours in a "Colours" group gets one
 * heading rather than ten.
 */
public final class SettingList {
	/** Height of a group heading row. */
	private static final int GROUP_HEIGHT = 18;
	/** Gap between two rows. */
	private static final int ROW_GAP = 2;

	private final List<SettingControl<?>> controls = new ArrayList<>();
	private final List<String> headings = new ArrayList<>();
	private final SmoothScroll scroll = new SmoothScroll();
	private Object source;
	private int contentHeight;

	/**
	 * Points the list at a source's settings, rebuilding the controls only when the source
	 * actually changed.
	 *
	 * @param source   the object the settings belong to, used to detect a change
	 * @param settings the settings to edit, in display order
	 */
	public void build(Object source, List<Setting<?>> settings) {
		if (this.source == source) {
			return;
		}
		this.source = source;
		controls.clear();
		headings.clear();
		String lastGroup = null;
		for (int i = 0; i < settings.size(); i++) {
			Setting<?> setting = settings.get(i);
			String group = setting.getGroup();
			if (group.isEmpty()) {
				group = null;
			}
			if (group != null && !group.equals(lastGroup)) {
				headings.add(group);
				lastGroup = group;
			} else if (group == null) {
				headings.add(null);
				lastGroup = null;
			} else {
				headings.add(null);
			}
			controls.add(SettingControls.create(setting));
		}
		scroll.reset();
		contentHeight = measure();
	}

	/** Drops every control, so nothing keeps state from a previous screen. */
	public void clear() {
		source = null;
		controls.clear();
		headings.clear();
		contentHeight = 0;
		scroll.reset();
	}

	/** @return whether there is anything to draw. */
	public boolean isEmpty() {
		return controls.isEmpty();
	}

	private int measure() {
		int total = 0;
		for (int i = 0; i < controls.size(); i++) {
			if (headings.get(i) != null) {
				total += GROUP_HEIGHT;
			}
			total += controls.get(i).height() + ROW_GAP;
		}
		return total;
	}

	/**
	 * Draws the list inside a rectangle.
	 *
	 * @param mouseX mouse x in the same space as {@code x}
	 * @param mouseY mouse y in the same space as {@code y}
	 * @return the setting under the mouse, or {@code null}
	 */
	public Setting<?> render(GuiGraphics context, int x, int y, int width, int height, int mouseX, int mouseY) {
		contentHeight = measure();
		scroll.update(contentHeight, height);
		Setting<?> hovered = null;
		context.enableScissor(x, y, x + width, y + height);
		int rowY = y - scroll.offset();
		for (int i = 0; i < controls.size(); i++) {
			String heading = headings.get(i);
			if (heading != null) {
				if (rowY + GROUP_HEIGHT >= y && rowY <= y + height) {
					Widgets.sectionLabel(context, x + 2, rowY + 5, width - 4, heading.toUpperCase(java.util.Locale.ROOT));
				}
				rowY += GROUP_HEIGHT;
			}
			SettingControl<?> control = controls.get(i);
			int controlHeight = control.height();
			if (rowY + controlHeight >= y && rowY <= y + height) {
				control.place(x, rowY, width);
				control.render(context, mouseX, mouseY);
				if (control.contains(mouseX, mouseY)) {
					hovered = control.setting();
				}
			}
			rowY += controlHeight + ROW_GAP;
		}
		context.disableScissor();
		Widgets.scrollbar(context, x + width - 4, y + 2, height - 4, contentHeight, scroll.offset());
		return hovered;
	}

	/**
	 * Routes a click to the row under the cursor.
	 *
	 * @return whether a control used it
	 */
	public boolean mouseClicked(int mouseX, int mouseY, int button, int x, int y, int width, int height) {
		if (mouseX < x || mouseX >= x + width || mouseY < y || mouseY >= y + height) {
			releaseAll();
			return false;
		}
		boolean used = false;
		int rowY = y - scroll.offset();
		for (int i = 0; i < controls.size(); i++) {
			if (headings.get(i) != null) {
				rowY += GROUP_HEIGHT;
			}
			SettingControl<?> control = controls.get(i);
			control.place(x, rowY, width);
			if (control.mouseClicked(mouseX, mouseY, button)) {
				used = true;
			}
			rowY += control.height() + ROW_GAP;
		}
		return used;
	}

	/** Passes a drag to every control; a slider only reacts while it is being held. */
	public void mouseDragged(int mouseX, int mouseY, int x, int y, int width) {
		int rowY = y - scroll.offset();
		for (int i = 0; i < controls.size(); i++) {
			if (headings.get(i) != null) {
				rowY += GROUP_HEIGHT;
			}
			SettingControl<?> control = controls.get(i);
			control.place(x, rowY, width);
			control.mouseDragged(mouseX, mouseY);
			rowY += control.height() + ROW_GAP;
		}
	}

	/** Ends every drag. */
	public void releaseAll() {
		for (int i = 0; i < controls.size(); i++) {
			controls.get(i).mouseReleased();
		}
	}

	/** Applies a mouse-wheel movement over the list. */
	public void scroll(double amount, int mouseX, int mouseY, int x, int y, int width, int height) {
		// A cycle control under the cursor takes the wheel; otherwise the list scrolls.
		int rowY = y - scroll.offset();
		for (int i = 0; i < controls.size(); i++) {
			if (headings.get(i) != null) {
				rowY += GROUP_HEIGHT;
			}
			SettingControl<?> control = controls.get(i);
			control.place(x, rowY, width);
			if (control.contains(mouseX, mouseY) && control instanceof EnumControl cycle) {
				cycle.scroll(amount);
				return;
			}
			rowY += control.height() + ROW_GAP;
		}
		scroll.scroll(amount);
	}

	/**
	 * Routes a key press to whichever control wants the keyboard, then to the rest.
	 *
	 * @return whether a control used it
	 */
	public boolean keyPressed(KeyInput input) {
		for (int i = 0; i < controls.size(); i++) {
			if (controls.get(i).capturesKeyboard() && controls.get(i).keyPressed(input)) {
				return true;
			}
		}
		for (int i = 0; i < controls.size(); i++) {
			if (controls.get(i).keyPressed(input)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Routes a typed character to whichever control is capturing the keyboard.
	 *
	 * @return whether a control used it
	 */
	public boolean charTyped(CharInput input) {
		for (int i = 0; i < controls.size(); i++) {
			if (controls.get(i).capturesKeyboard() && controls.get(i).charTyped(input)) {
				return true;
			}
		}
		return false;
	}

	/** @return whether any control currently owns the keyboard. */
	public boolean capturesKeyboard() {
		for (int i = 0; i < controls.size(); i++) {
			if (controls.get(i).capturesKeyboard()) {
				return true;
			}
		}
		return false;
	}

	/** Restores every setting in the list to its default. */
	public void resetAll() {
		for (int i = 0; i < controls.size(); i++) {
			controls.get(i).setting().reset();
		}
	}

	/** @return a one-line summary of the list, for the panel footer. */
	public String summary() {
		return controls.size() + (controls.size() == 1 ? " setting" : " settings");
	}

	/** @return the height the list would need to show every row without scrolling. */
	public int preferredHeight() {
		return contentHeight;
	}

	/** Draws a centred placeholder when the list has nothing in it. */
	public static void placeholder(GuiGraphics context, int x, int y, int width, int height, String text) {
		Fonts.REGULAR.drawMiddle(context, text, x + width / 2, y + height / 2, Theme.TEXT_DISABLED);
	}
}
