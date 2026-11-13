package dev.f1client.gui;

import dev.f1client.render.Theme;

/** A value that eases towards its target over a fixed duration (cubic ease-out). */
public final class Anim {
	private final float durationMs;
	private float from;
	private float to;
	private long startNanos;

	/** Creates an animation resting at {@code initial} with the theme's standard duration. */
	public Anim(float initial) {
		this(initial, Theme.ANIMATION_MS);
	}

	public Anim(float initial, float durationMs) {
		this.durationMs = durationMs;
		this.from = initial;
		this.to = initial;
	}

	/** Starts easing towards {@code target} from wherever the value currently is. */
	public void set(float target) {
		if (target != to) {
			from = value();
			to = target;
			startNanos = System.nanoTime();
		}
	}

	/** Convenience for on/off animations. */
	public void set(boolean on) {
		set(on ? 1f : 0f);
	}

	/** Jumps to {@code value} without animating. */
	public void snap(float value) {
		from = value;
		to = value;
	}

	/** @return the target the value is heading for. */
	public float target() {
		return to;
	}

	/** @return whether the value has reached its target. */
	public boolean isDone() {
		return from == to || (System.nanoTime() - startNanos) / 1_000_000f >= durationMs;
	}

	/** @return the eased value at the current time. */
	public float value() {
		if (from == to) {
			return to;
		}
		float t = (System.nanoTime() - startNanos) / 1_000_000f / durationMs;
		if (t >= 1f) {
			from = to;
			return to;
		}
		float inverse = 1f - Math.max(0f, t);
		return from + (to - from) * (1f - inverse * inverse * inverse);
	}
}
