package dev.f1client.sound;

/**
 * Collapses repeated detections of the same event into one alert.
 *
 * <p>Two rules apply to every candidate:
 * <ul>
 *   <li><b>Cluster:</b> a candidate within {@value #CLUSTER_RADIUS} blocks of an accepted
 *       alert that is at most {@code windowMs} old is the same event and is dropped.</li>
 *   <li><b>Cooldown:</b> a candidate at the exact block of an accepted alert that is less
 *       than {@value #POSITION_COOLDOWN_MS} ms old is dropped.</li>
 * </ul>
 * History lives in fixed ring buffers, so accepting or rejecting never allocates.
 */
public final class AlertDeduplicator {
	/** Distance below which two detections are treated as one event. */
	public static final double CLUSTER_RADIUS = 1.5;
	/** Minimum time between two alerts for the same block. */
	public static final long POSITION_COOLDOWN_MS = 2_000L;
	private static final int CAPACITY = 128;

	private final double[] xs = new double[CAPACITY];
	private final double[] ys = new double[CAPACITY];
	private final double[] zs = new double[CAPACITY];
	private final long[] times = new long[CAPACITY];
	private int size;
	private int next;

	/**
	 * Decides whether a detection is new, and remembers it if so.
	 *
	 * @param x        resolved X (block centre when resolved)
	 * @param y        resolved Y
	 * @param z        resolved Z
	 * @param timeMs   detection time
	 * @param windowMs cluster time window
	 * @return {@code true} when the detection should become an alert
	 */
	public boolean accept(double x, double y, double z, long timeMs, long windowMs) {
		long blockX = (long) Math.floor(x);
		long blockY = (long) Math.floor(y);
		long blockZ = (long) Math.floor(z);
		for (int i = 0; i < size; i++) {
			long age = timeMs - times[i];
			if (age < 0) {
				age = 0;
			}
			if (age <= windowMs) {
				double dx = xs[i] - x;
				double dy = ys[i] - y;
				double dz = zs[i] - z;
				if (dx * dx + dy * dy + dz * dz <= CLUSTER_RADIUS * CLUSTER_RADIUS) {
					return false;
				}
			}
			if (age < POSITION_COOLDOWN_MS
					&& (long) Math.floor(xs[i]) == blockX
					&& (long) Math.floor(ys[i]) == blockY
					&& (long) Math.floor(zs[i]) == blockZ) {
				return false;
			}
		}
		xs[next] = x;
		ys[next] = y;
		zs[next] = z;
		times[next] = timeMs;
		next = (next + 1) % CAPACITY;
		if (size < CAPACITY) {
			size++;
		}
		return true;
	}

	/** Forgets all history, e.g. on world change. */
	public void clear() {
		size = 0;
		next = 0;
	}
}
