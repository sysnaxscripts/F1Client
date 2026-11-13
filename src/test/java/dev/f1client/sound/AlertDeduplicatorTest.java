package dev.f1client.sound;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AlertDeduplicatorTest {
	private static final long WINDOW = 600;

	@Test
	public void firstDetectionIsAccepted() {
		assertTrue(new AlertDeduplicator().accept(10.5, 20.5, 30.5, 1_000, WINDOW));
	}

	@Test
	public void nearbyDetectionInsideWindowIsClustered() {
		AlertDeduplicator dedupe = new AlertDeduplicator();
		assertTrue(dedupe.accept(10.5, 20.5, 30.5, 1_000, WINDOW));
		assertFalse(dedupe.accept(11.5, 20.5, 30.5, 1_300, WINDOW));
		assertFalse(dedupe.accept(11.5, 21.5, 30.5, 1_600, WINDOW));
	}

	@Test
	public void nearbyDetectionAfterWindowIsNew() {
		AlertDeduplicator dedupe = new AlertDeduplicator();
		assertTrue(dedupe.accept(10.5, 20.5, 30.5, 1_000, WINDOW));
		assertTrue(dedupe.accept(11.5, 20.5, 30.5, 1_601, WINDOW));
	}

	@Test
	public void distantDetectionInsideWindowIsNew() {
		AlertDeduplicator dedupe = new AlertDeduplicator();
		assertTrue(dedupe.accept(10.5, 20.5, 30.5, 1_000, WINDOW));
		assertTrue(dedupe.accept(12.5, 20.5, 30.5, 1_100, WINDOW));
	}

	@Test
	public void sameBlockIsOnCooldownForTwoSeconds() {
		AlertDeduplicator dedupe = new AlertDeduplicator();
		assertTrue(dedupe.accept(10.5, 20.5, 30.5, 1_000, WINDOW));
		assertFalse(dedupe.accept(10.5, 20.5, 30.5, 1_700, WINDOW));
		assertFalse(dedupe.accept(10.5, 20.5, 30.5, 2_999, WINDOW));
		assertTrue(dedupe.accept(10.5, 20.5, 30.5, 3_000, WINDOW));
	}

	@Test
	public void cooldownIsPerPosition() {
		AlertDeduplicator dedupe = new AlertDeduplicator();
		assertTrue(dedupe.accept(10.5, 20.5, 30.5, 1_000, WINDOW));
		assertTrue(dedupe.accept(11.5, 20.5, 30.5, 1_700, WINDOW));
	}

	@Test
	public void clearForgetsHistory() {
		AlertDeduplicator dedupe = new AlertDeduplicator();
		assertTrue(dedupe.accept(10.5, 20.5, 30.5, 1_000, WINDOW));
		dedupe.clear();
		assertTrue(dedupe.accept(10.5, 20.5, 30.5, 1_001, WINDOW));
	}

	@Test
	public void historyIsBounded() {
		AlertDeduplicator dedupe = new AlertDeduplicator();
		for (int i = 0; i < 1_000; i++) {
			assertTrue(dedupe.accept(i * 10.0, 0.5, 0.5, i, WINDOW));
		}
		assertFalse(dedupe.accept(9_990.0, 0.5, 0.5, 1_000, WINDOW));
	}
}
