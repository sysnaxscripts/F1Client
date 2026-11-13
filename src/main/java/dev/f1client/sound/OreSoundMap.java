package dev.f1client.sound;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.f1client.ore.OreType;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The sound table: exact sound event ID plus pitch bucket to candidate ore blocks.
 *
 * <p>Loaded from {@code assets/f1client/sounds/ore_map.json}. Lookups are exact-ID map
 * hits, never substring matches. A sound that several blocks share (every stone ore uses
 * {@code block.stone.*}, as does plain stone) yields several candidates and is flagged
 * non-exclusive; the pipeline then needs a real block to tell them apart.
 */
public final class OreSoundMap {
	/**
	 * Result of classifying one sound.
	 *
	 * @param action      what the sound means
	 * @param exclusive   whether only ore blocks make this sound
	 * @param bucketPitch pitch of the matched bucket
	 * @param pitchError  absolute distance between the sound's pitch and the bucket
	 * @param ores        ores whose blocks make this sound at this pitch
	 */
	public record Classification(SoundAction action, boolean exclusive, float bucketPitch, float pitchError,
			Set<OreType> ores) {
	}

	private record Entry(SoundAction action, boolean exclusive, float[] pitches, List<Set<OreType>> ores) {
	}

	private final Map<String, Entry> entries;

	private OreSoundMap(Map<String, Entry> entries) {
		this.entries = entries;
	}

	/**
	 * Parses the table.
	 *
	 * @throws IllegalArgumentException when the JSON is malformed or names an unknown block or action
	 */
	public static OreSoundMap parse(Reader reader) {
		Map<String, Entry> entries = new HashMap<>();
		try {
			JsonObject sounds = JsonParser.parseReader(reader).getAsJsonObject().getAsJsonObject("sounds");
			for (Map.Entry<String, JsonElement> sound : sounds.entrySet()) {
				JsonObject json = sound.getValue().getAsJsonObject();
				SoundAction action = SoundAction.fromName(json.get("action").getAsString());
				if (action == null) {
					throw new IllegalArgumentException("Unknown action for " + sound.getKey());
				}
				JsonArray buckets = json.getAsJsonArray("buckets");
				float[] pitches = new float[buckets.size()];
				List<Set<OreType>> ores = new ArrayList<>();
				for (int i = 0; i < buckets.size(); i++) {
					JsonObject bucket = buckets.get(i).getAsJsonObject();
					pitches[i] = bucket.get("pitch").getAsFloat();
					Set<OreType> set = EnumSet.noneOf(OreType.class);
					for (JsonElement block : bucket.getAsJsonArray("blocks")) {
						OreType ore = OreType.fromBlockId(block.getAsString());
						if (ore == null) {
							throw new IllegalArgumentException("Unknown ore block " + block.getAsString());
						}
						set.add(ore);
					}
					ores.add(Collections.unmodifiableSet(set));
				}
				boolean exclusive = json.has("exclusive") && json.get("exclusive").getAsBoolean();
				entries.put(sound.getKey(), new Entry(action, exclusive, pitches, ores));
			}
		} catch (IllegalArgumentException e) {
			throw e;
		} catch (RuntimeException e) {
			throw new IllegalArgumentException("Malformed ore sound table", e);
		}
		return new OreSoundMap(entries);
	}

	/** @return number of sound events in the table. */
	public int size() {
		return entries.size();
	}

	/** @return whether the exact sound ID is in the table. */
	public boolean contains(String soundId) {
		return entries.containsKey(soundId);
	}

	/**
	 * Classifies a sound by exact ID and pitch bucket.
	 *
	 * @param soundId   sound event registry ID
	 * @param pitch     pitch of the sound
	 * @param tolerance maximum accepted distance to the nearest bucket
	 * @return the classification, or {@code null} for unknown sounds and out-of-tolerance pitches
	 */
	public Classification classify(String soundId, float pitch, double tolerance) {
		Entry entry = entries.get(soundId);
		if (entry == null) {
			return null;
		}
		int index = PitchBuckets.nearest(entry.pitches(), pitch, tolerance);
		if (index == PitchBuckets.NO_MATCH) {
			return null;
		}
		float bucket = entry.pitches()[index];
		return new Classification(entry.action(), entry.exclusive(), bucket, Math.abs(bucket - pitch), entry.ores().get(index));
	}
}
