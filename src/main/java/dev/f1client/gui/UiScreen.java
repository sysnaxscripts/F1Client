package dev.f1client.gui;

import dev.f1client.F1Client;
import dev.f1client.render.BlurRenderer;
import dev.f1client.render.Fonts;
import dev.f1client.render.RoundedRenderer;
import net.minecraft.client.gui.Click;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.input.CharInput;
import net.minecraft.client.input.KeyInput;
import net.minecraft.text.Text;
import org.joml.Matrix3x2fStack;

/**
 * Base for every F1Client screen.
 *
 * <p>Subclasses lay themselves out in fixed <em>design units</em>. This class picks a
 * device scale from the framebuffer size alone, so a screen has the same physical size
 * and never clips whatever the vanilla GUI scale is (1 to 4, 1080p to 4K), and converts
 * mouse input into design units. It also draws the blurred backdrop once per frame and
 * runs the open and close transition.
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
	protected UiScreen(Text title, int designWidth, int designHeight) {
		super(title);
		Screen current = MinecraftClient.getInstance().currentScreen;
		this.parent = current instanceof UiScreen ui ? ui.parent : current;
		this.designWidth = designWidth;
		this.designHeight = designHeight;
	}

	/** Draws the screen content in design units, origin at the layout's top-left corner. */
	protected abstract void draw(DrawContext context, int mouseX, int mouseY);

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

	/** @return {@code true} when the key was used; unused Escape and client-key presses close the screen. */
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

	@Override
	protected void init() {
		int guiScale = Math.max(1, client.getWindow().getScaleFactor());
		float fitWidth = client.getWindow().getFramebufferWidth() * 0.94f / designWidth;
		float fitHeight = client.getWindow().getFramebufferHeight() * 0.90f / designHeight;
		float device = Math.max(0.5f, (float) Math.floor(Math.min(fitWidth, fitHeight) * 4f) / 4f);
		scale = device / guiScale;
		originX = Math.round((width - designWidth * scale) / 2f);
		originY = Math.round((height - designHeight * scale) / 2f);
		if (!closing) {
			open.set(1f);
		}
	}

	@Override
	public void renderBackground(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
		if (client.world == null) {
			renderPanoramaBackground(context, deltaTicks);
		}
		BlurRenderer.backdrop(context, width, height, open.value());
	}

	@Override
	public final void render(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
		float progress = open.value();
		if (closing && open.isDone()) {
			client.setScreen(parent);
			return;
		}
		float zoom = 0.94f + 0.06f * progress;
		Matrix3x2fStack matrices = context.getMatrices();
		matrices.pushMatrix();
		matrices.translate(originX + designWidth * scale * (1f - zoom) / 2f,
				originY + designHeight * scale * (1f - zoom) / 2f + (1f - progress) * 6f);
		matrices.scale(scale * zoom, scale * zoom);
		RoundedRenderer.setPixelsPerUnit(scale * zoom * client.getWindow().getScaleFactor());
		Fonts.setPixelsPerUnit(scale * client.getWindow().getScaleFactor());
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
		if (input.isEscape() || input.key() == F1Client.get().globals().clientKey().get()) {
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
	public void close() {
		closing = true;
		open.set(0f);
	}

	@Override
	public boolean shouldPause() {
		return false;
	}

	@Override
	public boolean shouldCloseOnEsc() {
		return false;
	}

	private int toDesignX(double guiX) {
		return (int) Math.floor((guiX - originX) / scale);
	}

	private int toDesignY(double guiY) {
		return (int) Math.floor((guiY - originY) / scale);
	}

	/** @return whether the point lies inside the rectangle. */
	protected static boolean inside(int px, int py, int x, int y, int width, int height) {
		return px >= x && py >= y && px < x + width && py < y + height;
	}
}
