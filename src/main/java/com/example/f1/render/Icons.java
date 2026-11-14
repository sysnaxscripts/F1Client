package com.example.f1.render;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.resources.Identifier;

/**
 * White line icons bundled under {@code assets/f1client/textures/gui/}, tinted when drawn.
 *
 * <p>Every icon is a single-colour mask, so one texture serves any accent: the colour is
 * passed to the draw call and multiplies the mask. The whole texture is stretched into the
 * requested square, which keeps the icons sharp at the small sizes the interface uses.
 */
public enum Icons {
	/** Client logotype, drawn in the watermark. */
	LOGO("logo"),
	/** Search field. */
	SEARCH("search"),
	/** Favourite, not pinned. */
	STAR("star"),
	/** Favourite, pinned. */
	STAR_FILLED("star_filled"),
	/** Close and cancel. */
	CLOSE("close"),
	/** Collapsed submenu. */
	CHEVRON("chevron"),
	/** Confirm and "on". */
	CHECK("check"),
	/** Visible. */
	EYE("eye"),
	/** Hidden. */
	EYE_OFF("eye_off"),
	/** Sign out. */
	LOGOUT("logout"),
	/** Configuration. */
	CONFIG("config"),
	/** Keybinds. */
	KEYBOARD("keyboard"),
	/** The on-screen overlay. */
	HUD("hud"),
	/** Combat category. */
	COMBAT("combat"),
	/** Movement category. */
	MOVEMENT("movement"),
	/** Player category. */
	PLAYER("player"),
	/** Visuals category. */
	VISUALS("visuals"),
	/** World category. */
	WORLD("world"),
	/** Misc category. */
	MISC("misc"),
	/** Favourites. */
	FAVORITES("favorites"),
	/** Account and profile. */
	USER("user"),
	/** Duplicate. */
	COPY("copy"),
	/** Delete. */
	TRASH("trash"),
	/** Working. */
	SPINNER("spinner");

	private final Identifier texture;

	Icons(String file) {
		this.texture = Identifier.fromNamespaceAndPath(com.example.f1.F1Client.ID, "textures/gui/" + file + ".png");
	}

	/** @return the texture id of this icon. */
	public Identifier texture() {
		return texture;
	}

	/** Draws the icon into a square of {@code size} units, tinted with {@code color}. */
	public void draw(GuiGraphics context, int x, int y, int size, int color) {
		if ((color >>> 24) == 0 || size <= 0) {
			return;
		}
		context.blit(RenderPipelines.GUI_TEXTURED, texture, x, y, 0f, 0f, size, size, size, size, color);
	}
}
