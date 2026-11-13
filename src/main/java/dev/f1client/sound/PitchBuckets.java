package dev.f1client.sound;

/** Nearest-bucket pitch matching with a rejection tolerance. */
public final class PitchBuckets {
	/** Returned by {@link #nearest} when no bucket lies within tolerance. */
	public static final int NO_MATCH = -1;
	private static final double EPSILON = 1e-6;

	private PitchBuckets() {
	}

	/**
	 * Finds the bucket closest to a pitch.
	 *
	 * @param buckets   known pitch values
	 * @param pitch     pitch of the incoming sound
	 * @param tolerance maximum accepted absolute difference (inclusive)
	 * @return index of the nearest bucket, or {@link #NO_MATCH} when even the nearest one
	 *         is further than {@code tolerance} away
	 */
	public static int nearest(float[] buckets, float pitch, double tolerance) {
		int best = NO_MATCH;
		double bestError = Double.MAX_VALUE;
		for (int i = 0; i < buckets.length; i++) {
			double error = Math.abs(buckets[i] - pitch);
			if (error < bestError) {
				bestError = error;
				best = i;
			}
		}
		return bestError <= tolerance + EPSILON ? best : NO_MATCH;
	}
}
