package com.example.f1.gui;

/**
 * Scroll offset that glides to its target instead of jumping.
 *
 * <p>Critically damped towards the target with an exponential step, so the motion is
 * frame-rate independent and never overshoots.
 */
public final class SmoothScroll {
	/** Units travelled per notch of the mouse wheel. */
	private static final float STEP = 28f;
	/** How quickly the offset catches up with the target. */
	private static final float STIFFNESS = 18f;

	private float offset;
	private float target;
	private long lastNanos = System.nanoTime();

	/** Applies a mouse-wheel movement. */
	public void scroll(double wheel) {
		target -= (float) wheel * STEP;
	}

	/** Advances the animation and clamps to the content; call once per frame before drawing. */
	public void update(int contentHeight, int viewHeight) {
		float max = Math.max(0, contentHeight - viewHeight);
		target = Math.max(0, Math.min(max, target));
		long now = System.nanoTime();
		float dt = Math.min(0.1f, (now - lastNanos) / 1_000_000_000f);
		lastNanos = now;
		offset += (target - offset) * (1f - (float) Math.exp(-dt * STIFFNESS));
		if (Math.abs(target - offset) < 0.05f) {
			offset = target;
		}
		offset = Math.max(0, Math.min(max, offset));
	}

	/** @return the current offset in whole units. */
	public int offset() {
		return Math.round(offset);
	}

	/** @return the target offset, which is where the glide ends. */
	public int target() {
		return Math.round(target);
	}

	/** Scrolls so that the span {@code [top, bottom)} of the content is visible. */
	public void reveal(int top, int bottom, int viewHeight) {
		if (top < target) {
			target = top;
		} else if (bottom > target + viewHeight) {
			target = bottom - viewHeight;
		}
	}

	/** Returns to the top immediately. */
	public void reset() {
		offset = 0;
		target = 0;
	}
}
