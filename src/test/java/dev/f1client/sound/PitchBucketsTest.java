package dev.f1client.sound;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PitchBucketsTest {
	private static final float[] BUCKETS = {0.5f, 0.8f, 1.0f};

	@Test
	public void exactPitchMatchesItsBucket() {
		assertEquals(0, PitchBuckets.nearest(BUCKETS, 0.5f, 0.06));
		assertEquals(1, PitchBuckets.nearest(BUCKETS, 0.8f, 0.06));
		assertEquals(2, PitchBuckets.nearest(BUCKETS, 1.0f, 0.06));
	}

	@Test
	public void pitchWithinToleranceMatchesNearestBucket() {
		assertEquals(1, PitchBuckets.nearest(BUCKETS, 0.75f, 0.06));
		assertEquals(1, PitchBuckets.nearest(BUCKETS, 0.85f, 0.06));
		assertEquals(2, PitchBuckets.nearest(BUCKETS, 0.95f, 0.06));
	}

	@Test
	public void toleranceBoundaryIsInclusive() {
		assertEquals(1, PitchBuckets.nearest(BUCKETS, 0.86f, 0.06));
		assertEquals(1, PitchBuckets.nearest(BUCKETS, 0.74f, 0.06));
	}

	@Test
	public void pitchOutsideToleranceIsRejected() {
		assertEquals(PitchBuckets.NO_MATCH, PitchBuckets.nearest(BUCKETS, 0.65f, 0.06));
		assertEquals(PitchBuckets.NO_MATCH, PitchBuckets.nearest(BUCKETS, 0.9f, 0.06));
		assertEquals(PitchBuckets.NO_MATCH, PitchBuckets.nearest(BUCKETS, 1.2f, 0.06));
	}

	@Test
	public void widerToleranceAcceptsMore() {
		assertEquals(PitchBuckets.NO_MATCH, PitchBuckets.nearest(BUCKETS, 0.9f, 0.06));
		assertEquals(1, PitchBuckets.nearest(BUCKETS, 0.9f, 0.11));
	}

	@Test
	public void zeroToleranceNeedsExactPitch() {
		assertEquals(1, PitchBuckets.nearest(BUCKETS, 0.8f, 0));
		assertEquals(PitchBuckets.NO_MATCH, PitchBuckets.nearest(BUCKETS, 0.81f, 0));
	}

	@Test
	public void emptyTableNeverMatches() {
		assertEquals(PitchBuckets.NO_MATCH, PitchBuckets.nearest(new float[0], 1.0f, 1.0));
	}
}
