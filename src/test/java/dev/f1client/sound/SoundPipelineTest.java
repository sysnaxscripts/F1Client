package dev.f1client.sound;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import dev.f1client.ore.OreType;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import org.junit.Before;
import org.junit.Test;

public class SoundPipelineTest {
	private static final BlockResolver NOTHING = (candidates, action, x, y, z, radius) -> null;

	private OreSoundMap map;
	private SoundPipeline pipeline;

	@Before
	public void setUp() throws Exception {
		try (Reader reader = new InputStreamReader(
				SoundPipelineTest.class.getResourceAsStream("/assets/f1client/sounds/ore_map.json"), StandardCharsets.UTF_8)) {
			map = OreSoundMap.parse(reader);
		}
		pipeline = new SoundPipeline(map);
	}

	private static SoundSample sample(String id, float pitch, double x, long time) {
		return new SoundSample(id, "BLOCKS", 1.0f, pitch, x, 10.5, 0.5, false, null, time);
	}

	private static BlockResolver oreAt(OreType ore, int x, int y, int z) {
		return (candidates, action, sx, sy, sz, radius) -> {
			if (!candidates.contains(ore)) {
				return null;
			}
			double dx = x + 0.5 - sx;
			double dy = y + 0.5 - sy;
			double dz = z + 0.5 - sz;
			double offset = Math.sqrt(dx * dx + dy * dy + dz * dz);
			return offset <= radius ? new BlockResolver.Resolution(ore, x, y, z, offset) : null;
		};
	}

	@Test
	public void tableCoversEveryWhitelistedOreForEveryAction() {
		assertEquals(20, map.size());
		for (OreType ore : OreType.all()) {
			for (SoundAction action : SoundAction.values()) {
				boolean covered = false;
				for (String group : new String[] {"stone", "deepslate", "nether_ore", "nether_gold_ore", "ancient_debris"}) {
					String id = "minecraft:block." + group + "." + action.name().toLowerCase();
					float pitch = action == SoundAction.HIT ? 0.5f : action == SoundAction.STEP ? 1.0f : 0.8f;
					OreSoundMap.Classification c = map.classify(id, pitch, 0.06);
					assertNotNull(id, c);
					assertEquals(action, c.action());
					covered |= c.ores().contains(ore);
				}
				assertTrue(ore + " " + action, covered);
			}
		}
	}

	@Test
	public void lookupIsExactNotSubstring() {
		assertNull(map.classify("minecraft:block.stone.break_extra", 0.8f, 0.06));
		assertNull(map.classify("block.stone.break", 0.8f, 0.06));
		assertNull(map.classify("minecraft:block.stone_button.break", 0.8f, 0.06));
		assertNull(map.classify("minecraft:block.deepslate_bricks.break", 0.8f, 0.06));
	}

	@Test
	public void pitchOutsideToleranceIsRejected() {
		SoundPipeline.Result result = pipeline.process(sample("minecraft:block.ancient_debris.break", 1.0f, 5.5, 0),
				0, 10, 0, NOTHING, true);
		assertEquals(SoundPipeline.Status.REJECTED_PITCH, result.status());
	}

	@Test
	public void exclusiveSoundAlertsEvenWhenUnresolved() {
		SoundPipeline.Result result = pipeline.process(sample("minecraft:block.ancient_debris.break", 0.8f, 5.5, 0),
				0, 10, 0, NOTHING, true);
		assertEquals(SoundPipeline.Status.ALERT, result.status());
		assertEquals(OreType.ANCIENT_DEBRIS, result.alert().ore());
		assertFalse(result.alert().resolved());
		assertTrue(result.alert().confidence() >= 0.5);
	}

	@Test
	public void sharedStoneSoundWithoutOreBlockIsDropped() {
		SoundPipeline.Result result = pipeline.process(sample("minecraft:block.stone.break", 0.8f, 1.5, 0),
				0, 10, 0, NOTHING, true);
		assertEquals(SoundPipeline.Status.REJECTED_CONFIDENCE, result.status());
	}

	@Test
	public void sharedSoundResolvesToTheRealOre() {
		SoundPipeline.Result result = pipeline.process(sample("minecraft:block.deepslate.break", 0.8f, 5.5, 0),
				0, 10, 0, oreAt(OreType.DEEPSLATE_DIAMOND, 5, 10, 0), true);
		assertEquals(SoundPipeline.Status.ALERT, result.status());
		assertEquals(OreType.DEEPSLATE_DIAMOND, result.alert().ore());
		assertTrue(result.alert().resolved());
		assertEquals("5 10 0", result.alert().coordinates());
	}

	@Test
	public void deepslateCoalSoundResolvesToCoal() {
		SoundPipeline.Result result = pipeline.process(sample("minecraft:block.deepslate.break", 0.8f, 5.5, 0),
				0, 10, 0, oreAt(OreType.DEEPSLATE_COAL, 5, 10, 0), true);
		assertEquals(SoundPipeline.Status.ALERT, result.status());
		assertEquals(OreType.DEEPSLATE_COAL, result.alert().ore());
		assertTrue(result.alert().resolved());
	}

	@Test
	public void unresolvedSampleIsPendingUntilLastChance() {
		SoundSample s = sample("minecraft:block.stone.break", 0.8f, 5.5, 0);
		assertEquals(SoundPipeline.Status.PENDING, pipeline.process(s, 0, 10, 0, NOTHING, false).status());
		assertEquals(SoundPipeline.Status.ALERT,
				pipeline.process(s, 0, 10, 0, oreAt(OreType.DIAMOND, 5, 10, 0), false).status());
	}

	@Test
	public void blockHintBypassesTheSharedSoundAmbiguity() {
		SoundSample hinted = new SoundSample("minecraft:block.stone.break", "BLOCKS", 1.0f, 0.8f, 5.5, 10.5, 0.5, false,
				"minecraft:diamond_ore", 0);
		SoundPipeline.Result result = pipeline.process(hinted, 0, 10, 0, NOTHING, true);
		assertEquals(SoundPipeline.Status.ALERT, result.status());
		assertEquals(OreType.DIAMOND, result.alert().ore());

		SoundSample plainStone = new SoundSample("minecraft:block.stone.break", "BLOCKS", 1.0f, 0.8f, 9.5, 10.5, 0.5, false,
				"minecraft:stone", 0);
		assertEquals(SoundPipeline.Status.REJECTED_NOT_ORE, pipeline.process(plainStone, 0, 10, 0, NOTHING, true).status());
	}

	@Test
	public void filtersRunBeforeClassification() {
		SoundPipeline.Params params = pipeline.params();
		SoundSample players = new SoundSample("minecraft:block.ancient_debris.break", "PLAYERS", 1.0f, 0.8f, 5.5, 10.5, 0.5,
				false, null, 0);
		assertEquals(SoundPipeline.Status.REJECTED_CATEGORY, pipeline.process(players, 0, 10, 0, NOTHING, true).status());

		SoundSample own = new SoundSample("minecraft:block.ancient_debris.break", "BLOCKS", 1.0f, 0.8f, 5.5, 10.5, 0.5,
				true, null, 0);
		assertEquals(SoundPipeline.Status.REJECTED_LOCAL_PLAYER, pipeline.process(own, 0, 10, 0, NOTHING, true).status());

		SoundSample quiet = new SoundSample("minecraft:block.ancient_debris.break", "BLOCKS", 0.05f, 0.8f, 5.5, 10.5, 0.5,
				false, null, 0);
		assertEquals(SoundPipeline.Status.REJECTED_VOLUME, pipeline.process(quiet, 0, 10, 0, NOTHING, true).status());

		params.detectionRadius = 8;
		assertEquals(SoundPipeline.Status.REJECTED_RADIUS,
				pipeline.process(sample("minecraft:block.ancient_debris.break", 0.8f, 20.5, 0), 0, 10, 0, NOTHING, true).status());

		assertEquals(SoundPipeline.Status.REJECTED_NOT_ORE,
				pipeline.process(sample("minecraft:block.grass.break", 0.8f, 2.5, 0), 0, 10, 0, NOTHING, true).status());
	}

	@Test
	public void actionAndOreFiltersApply() {
		assertEquals(SoundPipeline.Status.REJECTED_ACTION,
				pipeline.process(sample("minecraft:block.ancient_debris.place", 0.8f, 5.5, 0), 0, 10, 0, NOTHING, true).status());
		pipeline.params().actions.add(SoundAction.PLACE);
		assertEquals(SoundPipeline.Status.ALERT,
				pipeline.process(sample("minecraft:block.ancient_debris.place", 0.8f, 5.5, 0), 0, 10, 0, NOTHING, true).status());

		pipeline.params().oreFilter = ore -> ore != OreType.ANCIENT_DEBRIS;
		assertEquals(SoundPipeline.Status.REJECTED_ORE_FILTER,
				pipeline.process(sample("minecraft:block.ancient_debris.break", 0.8f, 30.5, 5_000), 0, 10, 0, NOTHING, true).status());
	}

	@Test
	public void repeatedSoundsCollapseIntoOneAlert() {
		BlockResolver resolver = oreAt(OreType.DIAMOND, 5, 10, 0);
		SoundSample first = sample("minecraft:block.stone.break", 0.8f, 5.5, 1_000);
		SoundSample echo = sample("minecraft:block.stone.break", 0.8f, 5.6, 1_200);
		SoundSample later = sample("minecraft:block.stone.break", 0.8f, 5.5, 3_100);

		assertEquals(SoundPipeline.Status.ALERT, pipeline.process(first, 0, 10, 0, resolver, true).status());
		assertEquals(SoundPipeline.Status.REJECTED_DUPLICATE, pipeline.process(echo, 0, 10, 0, resolver, true).status());
		assertEquals(SoundPipeline.Status.ALERT, pipeline.process(later, 0, 10, 0, resolver, true).status());
	}

	@Test
	public void confidenceFallsWithPitchErrorAndDistance() {
		double exact = ConfidenceScorer.score(0, 0.06, 4, 64, true, 0.5, 2, false);
		double offPitch = ConfidenceScorer.score(0.05, 0.06, 4, 64, true, 0.5, 2, false);
		double far = ConfidenceScorer.score(0, 0.06, 60, 64, true, 0.5, 2, false);
		double unresolvedShared = ConfidenceScorer.score(0, 0.06, 0, 64, false, 0, 2, false);
		double unresolvedExclusive = ConfidenceScorer.score(0, 0.06, 4, 64, false, 0, 2, true);

		assertTrue(exact > offPitch);
		assertTrue(exact > far);
		assertTrue(far >= 0.5);
		assertTrue(unresolvedShared < 0.5);
		assertTrue(unresolvedExclusive >= 0.5);
		assertTrue(exact <= 1.0);
	}
}
