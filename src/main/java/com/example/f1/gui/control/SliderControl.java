package com.example.f1.gui.control;

import com.example.f1.gui.widget.Widgets;
import com.example.f1.render.Anim;
import com.example.f1.setting.DoubleSetting;
import com.example.f1.setting.IntSetting;
import com.example.f1.setting.Setting;
import net.minecraft.client.gui.GuiGraphics;

/**
 * Label, live value pill and a draggable track for numeric settings.
 *
 * <p>Int and double settings share this control through {@link Range}, so the drawing and
 * the drag handling exist once. While dragging the fraction snaps to the value instead of
 * easing towards it, otherwise the knob would lag behind the cursor.
 */
final class SliderControl extends SettingControl<Setting<?>> {
	private static final int HEIGHT = 36;
	private static final int PILL_WIDTH = 46;

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
				return setting.getMin();
			}

			@Override
			public double max() {
				return setting.getMax();
			}

			@Override
			public double value() {
				return setting.get();
			}

			@Override
			public void set(double value) {
				// Snap to the step so a slider with a step of 5 never lands on 7.
				double step = setting.getStep();
				double snapped = setting.getMin() + Math.round((value - setting.getMin()) / step) * step;
				setting.set((int) Math.round(snapped));
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
		this.range = new Range() {
			@Override
			public double min() {
				return setting.getMin();
			}

			@Override
			public double max() {
				return setting.getMax();
			}

			@Override
			public double value() {
				return setting.get();
			}

			@Override
			public void set(double value) {
				double step = setting.getStep();
				double snapped = setting.getMin() + Math.round((value - setting.getMin()) / step) * step;
				setting.set(Math.round(snapped * 1000d) / 1000d);
			}

			@Override
			public String format(double value) {
				return setting.format(value);
			}
		};
		this.fraction = new Anim(currentFraction());
	}

	@Override
	public int height() {
		return HEIGHT;
	}

	@Override
	public void render(GuiGraphics context, int mouseX, int mouseY) {
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
		Widgets.valuePill(context, x + width - PILL_WIDTH, y + 4, PILL_WIDTH, 16, shownText,
				dragging || contains(mouseX, mouseY));
		Widgets.slider(context, x, y + 27, width, fraction.value(), dragging);
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
