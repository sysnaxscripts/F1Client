package dev.f1client.testutil;

import dev.f1client.auth.AuthManager;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.LongSupplier;

/** Deterministic scheduler and clock: tasks run inline, timers fire when time is advanced. */
public final class ManualScheduler implements AuthManager.Scheduler, LongSupplier {
	private static final class Timer {
		final long dueMs;
		final Runnable task;
		boolean cancelled;

		Timer(long dueMs, Runnable task) {
			this.dueMs = dueMs;
			this.task = task;
		}
	}

	private final List<Timer> timers = new ArrayList<>();
	private long nowMs;

	public ManualScheduler(long startMs) {
		this.nowMs = startMs;
	}

	@Override
	public long getAsLong() {
		return nowMs;
	}

	@Override
	public void execute(Runnable task) {
		task.run();
	}

	@Override
	public Runnable schedule(long delayMs, Runnable task) {
		Timer timer = new Timer(nowMs + delayMs, task);
		timers.add(timer);
		return () -> timer.cancelled = true;
	}

	/** Moves the clock and drops every pending timer (simulates the game being closed for a while). */
	public void jump(long deltaMs) {
		timers.clear();
		nowMs += deltaMs;
	}

	/** Advances time, firing due timers in order. */
	public void advance(long deltaMs) {
		long target = nowMs + deltaMs;
		while (true) {
			Timer next = timers.stream()
					.filter(t -> !t.cancelled && t.dueMs <= target)
					.min(Comparator.comparingLong(t -> t.dueMs))
					.orElse(null);
			if (next == null) {
				break;
			}
			timers.remove(next);
			nowMs = Math.max(nowMs, next.dueMs);
			next.task.run();
		}
		nowMs = target;
	}

	/** @return delay until the earliest live timer, or -1 when none is pending. */
	public long nextDelay() {
		return timers.stream().filter(t -> !t.cancelled).mapToLong(t -> t.dueMs - nowMs).min().orElse(-1);
	}
}
