package dev.f1client.sound;

import dev.f1client.ore.OreType;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.Predicate;

/**
 * The SoundDetection decision pipeline, free of any game classes so it can be unit tested.
 *
 * <p>Stages, in order: category whitelist, local-player filter, volume floor, radius,
 * classification (exact block hint, else sound ID plus pitch bucket), action and per-ore
 * filters, block resolution, confidence scoring, threshold, de-duplication.
 */
public final class SoundPipeline {
	/** Why a sample did or did not become an alert. */
	public enum Status {
		ALERT,
		/** Not resolved yet; submit the same sample again shortly (block updates may be in flight). */
		PENDING,
		REJECTED_CATEGORY,
		REJECTED_LOCAL_PLAYER,
		REJECTED_VOLUME,
		REJECTED_RADIUS,
		REJECTED_NOT_ORE,
		REJECTED_PITCH,
		REJECTED_ACTION,
		REJECTED_ORE_FILTER,
		REJECTED_CONFIDENCE,
		REJECTED_DUPLICATE
	}

	/**
	 * Outcome of {@link #process}.
	 *
	 * @param status what happened
	 * @param alert  the alert when {@code status} is {@link Status#ALERT}, otherwise {@code null}
	 */
	public record Result(Status status, OreAlert alert) {
		static Result of(Status status) {
			return new Result(status, null);
		}
	}

	/** Tunables, mirrored from the module settings before each call. */
	public static final class Params {
		public double detectionRadius = 64;
		public double pitchTolerance = 0.06;
		public double minVolume = 0.1;
		public double minConfidence = 0.5;
		public long dedupeWindowMs = 600;
		public double resolveRadius = 2;
		public boolean blocksCategoryOnly = true;
		public final Set<SoundAction> actions = EnumSet.of(SoundAction.BREAK);
		public Predicate<OreType> oreFilter = ore -> true;
	}

	private static final String BLOCKS_CATEGORY = "BLOCKS";

	private final OreSoundMap soundMap;
	private final AlertDeduplicator deduplicator = new AlertDeduplicator();
	private final Params params = new Params();

	public SoundPipeline(OreSoundMap soundMap) {
		this.soundMap = soundMap;
	}

	/** @return the mutable tunables. */
	public Params params() {
		return params;
	}

	/** Forgets de-duplication history. */
	public void reset() {
		deduplicator.clear();
	}

	/**
	 * Runs one sample through the pipeline.
	 *
	 * @param sample     the sound
	 * @param listenerX  listener (player) X
	 * @param listenerY  listener Y
	 * @param listenerZ  listener Z
	 * @param resolver   world lookup used to pin the sound to a block
	 * @param lastChance {@code false} lets an unresolved sample come back as
	 *                   {@link Status#PENDING}; {@code true} forces a final verdict
	 * @return the verdict, with the alert when one fired
	 */
	public Result process(SoundSample sample, double listenerX, double listenerY, double listenerZ,
			BlockResolver resolver, boolean lastChance) {
		if (params.blocksCategoryOnly && !BLOCKS_CATEGORY.equalsIgnoreCase(sample.category())) {
			return Result.of(Status.REJECTED_CATEGORY);
		}
		if (sample.fromLocalPlayer()) {
			return Result.of(Status.REJECTED_LOCAL_PLAYER);
		}
		if (sample.volume() < params.minVolume) {
			return Result.of(Status.REJECTED_VOLUME);
		}
		double dx = sample.x() - listenerX;
		double dy = sample.y() - listenerY;
		double dz = sample.z() - listenerZ;
		double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
		if (distance > params.detectionRadius) {
			return Result.of(Status.REJECTED_RADIUS);
		}

		OreSoundMap.Classification classification = soundMap.classify(sample.soundId(), sample.pitch(), params.pitchTolerance);
		OreType hinted = OreType.fromBlockId(sample.blockHint());
		if (sample.blockHint() != null && hinted == null) {
			return Result.of(Status.REJECTED_NOT_ORE);
		}
		if (classification == null) {
			return Result.of(soundMap.contains(sample.soundId()) ? Status.REJECTED_PITCH : Status.REJECTED_NOT_ORE);
		}
		if (!params.actions.contains(classification.action())) {
			return Result.of(Status.REJECTED_ACTION);
		}

		OreType ore;
		int blockX;
		int blockY;
		int blockZ;
		boolean resolved;
		double offset = 0;
		if (hinted != null) {
			if (!params.oreFilter.test(hinted)) {
				return Result.of(Status.REJECTED_ORE_FILTER);
			}
			ore = hinted;
			blockX = floor(sample.x());
			blockY = floor(sample.y());
			blockZ = floor(sample.z());
			resolved = true;
		} else {
			Set<OreType> candidates = EnumSet.noneOf(OreType.class);
			for (OreType candidate : classification.ores()) {
				if (params.oreFilter.test(candidate)) {
					candidates.add(candidate);
				}
			}
			if (candidates.isEmpty()) {
				return Result.of(Status.REJECTED_ORE_FILTER);
			}
			BlockResolver.Resolution resolution = resolver.resolve(candidates, classification.action(),
					sample.x(), sample.y(), sample.z(), params.resolveRadius);
			if (resolution != null) {
				ore = resolution.ore();
				blockX = resolution.x();
				blockY = resolution.y();
				blockZ = resolution.z();
				offset = resolution.offset();
				resolved = true;
			} else if (!lastChance) {
				return Result.of(Status.PENDING);
			} else {
				ore = candidates.iterator().next();
				blockX = floor(sample.x());
				blockY = floor(sample.y());
				blockZ = floor(sample.z());
				resolved = false;
			}
		}

		double confidence = ConfidenceScorer.score(classification.pitchError(), params.pitchTolerance, distance,
				params.detectionRadius, resolved, offset, params.resolveRadius, classification.exclusive());
		if (confidence < params.minConfidence) {
			return Result.of(Status.REJECTED_CONFIDENCE);
		}
		if (!deduplicator.accept(blockX + 0.5, blockY + 0.5, blockZ + 0.5, sample.timeMs(), params.dedupeWindowMs)) {
			return Result.of(Status.REJECTED_DUPLICATE);
		}
		return new Result(Status.ALERT, new OreAlert(ore, classification.action(), blockX, blockY, blockZ, resolved,
				confidence, distance, sample.timeMs()));
	}

	private static int floor(double value) {
		return (int) Math.floor(value);
	}
}
