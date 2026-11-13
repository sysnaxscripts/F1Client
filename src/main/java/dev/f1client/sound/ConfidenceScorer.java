package dev.f1client.sound;

/**
 * Turns the evidence behind a detection into a score in {@code [0,1]}.
 *
 * <p>Three weighted parts: how well the pitch matched its bucket, how close the sound
 * was, and how well it resolved to a real block. Resolution dominates so that a sound
 * shared with non-ore blocks (plain stone, plain deepslate) can never pass the default
 * 0.5 threshold on pitch and proximity alone.
 */
public final class ConfidenceScorer {
	static final double PITCH_WEIGHT = 0.30;
	static final double DISTANCE_WEIGHT = 0.15;
	static final double RESOLUTION_WEIGHT = 0.55;
	/** Resolution credit for an unresolved sound that only ore blocks can make. */
	static final double EXCLUSIVE_UNRESOLVED_CREDIT = 0.6;

	private ConfidenceScorer() {
	}

	/**
	 * @param pitchError     absolute pitch distance to the matched bucket
	 * @param pitchTolerance configured tolerance
	 * @param distance       listener distance in blocks
	 * @param radius         configured detection radius
	 * @param resolved       whether a matching block was found
	 * @param offset         distance between the sound origin and the resolved block centre
	 * @param searchRadius   configured resolve radius
	 * @param exclusive      whether only ore blocks make this sound
	 * @return confidence in {@code [0,1]}
	 */
	public static double score(double pitchError, double pitchTolerance, double distance, double radius,
			boolean resolved, double offset, double searchRadius, boolean exclusive) {
		double pitch = pitchTolerance <= 0 ? (pitchError <= 0 ? 1 : 0) : clamp(1 - pitchError / pitchTolerance);
		double proximity = radius <= 0 ? 0 : clamp(1 - distance / radius);
		double resolution;
		if (resolved) {
			double insideBlock = Math.sqrt(0.75);
			double excess = Math.max(0, offset - insideBlock);
			resolution = searchRadius <= 0 ? 1 : clamp(1 - 0.5 * excess / searchRadius);
		} else {
			resolution = exclusive ? EXCLUSIVE_UNRESOLVED_CREDIT : 0;
		}
		return clamp(PITCH_WEIGHT * pitch + DISTANCE_WEIGHT * proximity + RESOLUTION_WEIGHT * resolution);
	}

	private static double clamp(double value) {
		return Math.max(0, Math.min(1, value));
	}
}
