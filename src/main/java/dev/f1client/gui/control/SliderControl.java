package dev.f1client.gui.control;

import dev.f1client.gui.Anim;
import dev.f1client.gui.widget.Widgets;
import dev.f1client.render.RoundedRenderer;
import dev.f1client.render.Theme;
import dev.f1client.setting.DoubleSetting;
import dev.f1client.setting.IntSetting;
import dev.f1client.setting.Setting;
import java.util.Locale;
import net.minecraft.client.gui.DrawContext;

/** Label, live value pill and a draggable track for numeric settings. */
final class SliderControl extends SettingControl<Setting<?>> {
	private static final int HEIGHT = 36;
	private static final int PILL_WIDTH = 44;

	/** Uniform view over int and double settings. */
	private interface Range {
		double min();

		double max();

		double value();

		void set(double value);

		String format(double value);
	}

	private final Range range;
	private final Anim fraction;
	private boolean dragging;
	private double shownValue = Double.NaN;
	private String shownText = "";

	SliderControl(IntSetting setting) {
		super(setting);
		this.range = new Range() {
			@Override
			public double min() {
				return setting.min();
			}

			@Override
			public double max() {
				return setting.max();
			}

			@Override
			public double value() {
				return setting.get();
			}

			@Override
			public void set(double value) {
				setting.set((int) Math.round(value));
			}

			@Override
			public String format(double value) {
				return Integer.toString((int) Math.round(value));
			}
		};
		this.fraction = new Anim(currentFraction());
	}

	SliderControl(DoubleSetting setting) {
		super(setting);
		String pattern = "%." + setting.decimals() + "f";
		this.range = new Range() {
			@Override
			public double min() {
				return setting.min();
			}

			@Override
			public double max() {
				return setting.max();
			}

			@Override
			public double value() {
				return setting.get();
			}

			@Override
			public void set(double value) {
				setting.set(value);
			}

			@Override
			public String format(double value) {
				return String.format(Locale.ROOT, pattern, value);
			}
		};
		this.fraction = new Anim(currentFraction());
	}

	@Override
	public int height() {
		return HEIGHT;
	}

	@Override
	public void render(DrawContext context, int mouseX, int mouseY) {
		if (dragging) {
			fraction.snap(currentFraction());
		} else {
			fraction.set(currentFraction());
		}
		double value = range.value();
		if (value != shownValue) {
			shownValue = value;
			shownText = range.format(value);
		}
		label(context);
		Widgets.valuePill(context, x + width - PILL_WIDTH, y + 4, PILL_WIDTH, 16, shownText, dragging);

		int trackY = y + 28;
		int filled = Math.round((width - 8) * fraction.value());
		Theme theme = Theme.get();
		RoundedRenderer.fill(context, x, trackY, width, 3, 1, Theme.TRACK_OFF);
		RoundedRenderer.fill(context, x, trackY, filled + 4, 3, 1, theme.accentColor());
		RoundedRenderer.circle(context, x + 4 + filled, trackY + 1, dragging ? 5 : 4, theme.accentColor());
	}

	@Override
	protected boolean onClick(int mouseX, int mouseY) {
		if (mouseY >= y + 20) {
			dragging = true;
			apply(mouseX);
			return true;
		}
		return false;
	}

	@Override
	public void mouseDragged(int mouseX, int mouseY) {
		if (dragging) {
			apply(mouseX);
		}
	}

	@Override
	public void mouseReleased() {
		dragging = false;
	}

	private void apply(int mouseX) {
		double t = Math.max(0, Math.min(1, (mouseX - x - 4) / (double) Math.max(1, width - 8)));
		range.set(range.min() + t * (range.max() - range.min()));
	}

	private float currentFraction() {
		double span = range.max() - range.min();
		return span <= 0 ? 0f : (float) ((range.value() - range.min()) / span);
	}
}
