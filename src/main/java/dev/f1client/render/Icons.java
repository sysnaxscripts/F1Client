package dev.f1client.render;

import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Identifier;

/** White line icons bundled under {@code assets/f1client/textures/gui/}, tinted when drawn. */
public enum Icons {
	LOGO("logo"),
	SEARCH("search"),
	STAR("star"),
	STAR_FILLED("star_filled"),
	CLOSE("close"),
	CHEVRON("chevron"),
	CHECK("check"),
	EYE("eye"),
	EYE_OFF("eye_off"),
	LOGOUT("logout"),
	CONFIG("config"),
	KEYBOARD("keyboard"),
	HUD("hud"),
	COMBAT("combat"),
	MOVEMENT("movement"),
	PLAYER("player"),
	VISUALS("visuals"),
	WORLD("world"),
	MISC("misc"),
	FAVORITES("favorites"),
	USER("user"),
	COPY("copy"),
	TRASH("trash"),
	SPINNER("spinner");

	private final Identifier texture;

	Icons(String file) {
		this.texture = Identifier.of("f1client", "textures/gui/" + file + ".png");
	}

	/** Draws the icon into a square of {@code size} units, tinted with {@code color}. */
	public void draw(DrawContext context, int x, int y, int size, int color) {
		if ((color >>> 24) == 0) {
			return;
		}
		context.drawTexture(RenderPipelines.GUI_TEXTURED, texture, x, y, 0f, 0f, size, size, size, size, color);
	}
}
