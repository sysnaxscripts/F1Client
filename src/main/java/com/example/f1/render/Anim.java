package com.example.f1.render;

/**
 * A value that eases towards its target over a fixed duration (cubic ease-out).
 *
 * <p>Used for every transition in the interface: toggles, panel expansion, the open and
 * close of a screen. It is driven by the wall clock rather than by tick count, so a
 * transition looks the same at any frame rate and never needs an update call.
 */
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
		this.durationMs = Math.max(1f, durationMs);
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
