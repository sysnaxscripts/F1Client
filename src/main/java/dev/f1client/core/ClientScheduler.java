package dev.f1client.core;

import dev.f1client.auth.AuthManager;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/** Background executor and timer for account work, on a single daemon thread. */
public final class ClientScheduler implements AuthManager.Scheduler {
	private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor(task -> {
		Thread thread = new Thread(task, "F1Client-Worker");
		thread.setDaemon(true);
		return thread;
	});

	@Override
	public void execute(Runnable task) {
		executor.execute(task);
	}

	@Override
	public Runnable schedule(long delayMs, Runnable task) {
		ScheduledFuture<?> future = executor.schedule(task, delayMs, TimeUnit.MILLISECONDS);
		return () -> future.cancel(false);
	}

	/** Stops the worker; pending timers are dropped. */
	public void shutdown() {
		executor.shutdownNow();
	}
}
