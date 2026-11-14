package com.example.f1.gui;

import com.example.f1.F1Client;
import com.example.f1.render.Anim;
import com.example.f1.render.BlurRenderer;
import com.example.f1.render.Fonts;
import com.example.f1.render.RoundedRenderer;
import com.mojang.blaze3d.platform.Window;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.CharInput;
import net.minecraft.client.input.KeyInput;
import net.minecraft.network.chat.Component;
import org.joml.Matrix3x2fStack;

/**
 * Base for every F1 Client screen.
 *
 * <p>Subclasses lay themselves out in fixed <em>design units</em>. This class picks a
 * device scale from the framebuffer size alone, so a screen has the same physical size
 * and never clips whatever the vanilla GUI scale is (1 to 4, 1080p to 4K), and converts
 * mouse input into design units. It also draws the blurred backdrop once per frame and
 * runs the open and close transition.
 *
 * <p>Input arrives through the game's own input records ({@link Click}, {@link KeyInput},
 * {@link CharInput}); nothing here registers a keybind with the vanilla system, so a
 * screen never collides with a player's own bindings.
 */
public abstract class UiScreen extends Screen {
	private final int designWidth;
	private final int designHeight;
	private final Anim open = new Anim(0f);
	private final Screen parent;
	private boolean closing;
	private float scale = 1f;
	private int originX;
	private int originY;

	/**
	 * @param title        narration title
	 * @param designWidth  width of the layout in design units
	 * @param designHeight height of the layout in design units
	 */
	protected UiScreen(Component title, int designWidth, int designHeight) {
		super(title);
		Screen current = Minecraft.getInstance().screen;
		// Opening an F1 screen from an F1 screen must not chain: closing returns to whatever
		// was open before the first one.
		this.parent = current instanceof UiScreen ui ? ui.parent : current;
		this.designWidth = designWidth;
		this.designHeight = designHeight;
	}

	/** Draws the screen content in design units, origin at the layout's top-left corner. */
	protected abstract void draw(GuiGraphics context, int mouseX, int mouseY);

	/** @return {@code true} when the click was used. */
	protected boolean onClick(int mouseX, int mouseY, int button) {
		return false;
	}

	protected void onRelease(int mouseX, int mouseY, int button) {
	}

	protected void onDrag(int mouseX, int mouseY, int button) {
	}

	protected void onScroll(int mouseX, int mouseY, double amount) {
	}

	/** @return {@code true} when the key was used. */
	protected boolean onKey(KeyInput input) {
		return false;
	}

	protected boolean onChar(CharInput input) {
		return false;
	}

	/** @return layout width in design units. */
	protected final int designWidth() {
		return designWidth;
	}

	/** @return layout height in design units. */
	protected final int designHeight() {
		return designHeight;
	}

	/** @return the open animation, 0 = closed, 1 = fully open. */
	protected final Anim openAnimation() {
		return open;
	}

	/** @return whether the screen is playing its close transition. */
	protected final boolean isClosing() {
		return closing;
	}

	@Override
	protected void init() {
		float windowScale = Fonts.windowScale();
		Window window = Minecraft.getInstance().getWindow();
		float fitWidth = window.getWidth() * 0.94f / designWidth;
		float fitHeight = window.getHeight() * 0.90f / designHeight;
		// Quantised to quarter units so the layout lands on device pixels.
		float device = Math.max(0.5f, (float) Math.floor(Math.min(fitWidth, fitHeight) * 4f) / 4f);
		scale = device / windowScale;
		originX = Math.round((width - designWidth * scale) / 2f);
		originY = Math.round((height - designHeight * scale) / 2f);
		if (!closing) {
			open.set(1f);
		}
	}

	@Override
	public void renderBackground(GuiGraphics context, int mouseX, int mouseY, float partialTick) {
		if (Minecraft.getInstance().level == null) {
			// No world behind the screen: let vanilla draw its menu background.
			super.renderBackground(context, mouseX, mouseY, partialTick);
		}
		BlurRenderer.backdrop(context, width, height, open.value());
	}

	@Override
	public final void render(GuiGraphics context, int mouseX, int mouseY, float partialTick) {
		float progress = open.value();
		if (closing && open.isDone()) {
			Minecraft.getInstance().setScreen(parent);
			return;
		}
		float zoom = 0.94f + 0.06f * progress;
		float windowScale = Fonts.windowScale();
		Matrix3x2fStack matrices = context.pose();
		matrices.pushMatrix();
		matrices.translate(originX + designWidth * scale * (1f - zoom) / 2f,
				originY + designHeight * scale * (1f - zoom) / 2f + (1f - progress) * 6f);
		matrices.scale(scale * zoom, scale * zoom);
		RoundedRenderer.setPixelsPerUnit(scale * zoom * windowScale);
		Fonts.setPixelsPerUnit(scale * windowScale);
		draw(context, toDesignX(mouseX), toDesignY(mouseY));
		matrices.popMatrix();
	}

	@Override
	public boolean mouseClicked(Click click, boolean doubled) {
		return !closing && onClick(toDesignX(click.x()), toDesignY(click.y()), click.button());
	}

	@Override
	public boolean mouseReleased(Click click) {
		onRelease(toDesignX(click.x()), toDesignY(click.y()), click.button());
		return true;
	}

	@Override
	public boolean mouseDragged(Click click, double deltaX, double deltaY) {
		onDrag(toDesignX(click.x()), toDesignY(click.y()), click.button());
		return true;
	}

	@Override
	public boolean mouseScrolled(double mouseX, double mouseY, double horizontal, double vertical) {
		onScroll(toDesignX(mouseX), toDesignY(mouseY), vertical);
		return true;
	}

	@Override
	public boolean keyPressed(KeyInput input) {
		if (closing) {
			return true;
		}
		if (onKey(input)) {
			return true;
		}
		if (input.isEscape() || input.key() == F1Client.get().settings().clientKey().get()) {
			close();
		}
		return true;
	}

	@Override
	public boolean charTyped(CharInput input) {
		return !closing && onChar(input);
	}

	/** Plays the closing transition, then leaves the screen. */
	@Override
	public void onClose() {
		close();
	}

	/** Starts the close transition. The screen swaps itself out when the animation ends. */
	public void close() {
		closing = true;
		open.set(0f);
	}

	/** A screen that does not pause the game lets the world keep running behind the glass. */
	@Override
	public boolean isPauseScreen() {
		return false;
	}

	/** Converts a GUI-space x coordinate into design units. */
	protected final int toDesignX(double guiX) {
		return (int) Math.floor((guiX - originX) / scale);
	}

	/** Converts a GUI-space y coordinate into design units. */
	protected final int toDesignY(double guiY) {
		return (int) Math.floor((guiY - originY) / scale);
	}

	/** @return whether the point lies inside the rectangle. */
	protected static boolean inside(int px, int py, int x, int y, int width, int height) {
		return px >= x && py >= y && px < x + width && py < y + height;
	}
}
