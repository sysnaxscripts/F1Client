package dev.f1client.module.impl;

import com.mojang.text2speech.Narrator;
import dev.f1client.F1Client;
import dev.f1client.module.Category;
import dev.f1client.module.Module;
import dev.f1client.world.OreBlocks;
import dev.f1client.ore.OreType;
import dev.f1client.setting.BoolSetting;
import dev.f1client.setting.DoubleSetting;
import dev.f1client.setting.IntSetting;
import dev.f1client.setting.KeybindSetting;
import dev.f1client.sound.OreAlert;
import dev.f1client.sound.OreSoundMap;
import dev.f1client.sound.SoundAction;
import dev.f1client.sound.SoundPipeline;
import dev.f1client.sound.SoundSample;
import dev.f1client.world.WorldBlockResolver;
import dev.f1client.util.Chat;
import dev.f1client.util.UiSounds;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

/**
 * Detects ore mining, placing and walking from sounds other players cause.
 *
 * <p>Incoming sound packets and block-break world events are captured by mixins and
 * handed to {@link SoundPipeline}, which classifies them against the bundled sound
 * table, pins them to a real ore block, scores and de-duplicates them. Each resulting
 * alert is listed, highlighted in the world through OreDetection, and announced by beep,
 * narrator and chat as configured. Nothing is sent to the server.
 */
public final class SoundDetection extends Module {
	private static final String TABLE = "/assets/f1client/sounds/ore_map.json";
	private static final int MAX_PENDING = 256;
	private static final int RETRY_TICKS = 3;
	private static final long LOCAL_ACTION_MEMORY_MS = 400L;
	private static final OreType[] ORES = OreType.all();

	private record Pending(SoundSample sample, int attempts) {
	}

	private final IntSetting radius = add(new IntSetting("Detection radius", 64, 8, 128, 4)
			.describe("Sounds further away than this are ignored. Servers only send sounds within their own range."));
	private final DoubleSetting pitchTolerance = add(new DoubleSetting("Pitch tolerance", 0.06, 0.0, 0.25, 0.01)
			.describe("How far a sound's pitch may be from a table bucket."));
	private final DoubleSetting minVolume = add(new DoubleSetting("Min volume", 0.1, 0.0, 1.0, 0.05));
	private final DoubleSetting minConfidence = add(new DoubleSetting("Min confidence", 0.5, 0.0, 1.0, 0.05)
			.describe("Detections scoring below this are dropped."));
	private final IntSetting dedupeWindow = add(new IntSetting("Dedupe window (ms)", 600, 100, 3000, 50)
			.describe("Sounds within 1.5 blocks and this time span count as one event."));
	private final DoubleSetting resolveRadius = add(new DoubleSetting("Resolve radius", 2.0, 0.0, 4.0, 0.5)
			.describe("How far from the sound origin to look for the ore block."));
	private final DoubleSetting highlightSeconds = add(new DoubleSetting("Highlight duration (s)", 3.0, 0.5, 15.0, 0.5));
	private final IntSetting maxAlerts = add(new IntSetting("Alert list size", 50, 5, 200, 5));
	private final BoolSetting blocksOnly = add(new BoolSetting("Blocks category only", true)
			.describe("Accept only sounds in the BLOCKS category. Footsteps arrive as PLAYERS and need this off."));
	private final BoolSetting ignoreSelf = add(new BoolSetting("Ignore own actions", true));
	private final BoolSetting onBreak = add(new BoolSetting("Detect breaking", true).group("Events"));
	private final BoolSetting onPlace = add(new BoolSetting("Detect placing", false).group("Events"));
	private final BoolSetting onStep = add(new BoolSetting("Detect footsteps", false).group("Events"));
	private final BoolSetting onHit = add(new BoolSetting("Detect hitting", false).group("Events")
			.describe("Hit sounds are normally not sent by servers; this only matters where a plugin relays them."));
	private final BoolSetting beep = add(new BoolSetting("Beep", true).group("Feedback")
			.describe("Short tone; higher pitch means closer."));
	private final BoolSetting tts = add(new BoolSetting("Text to speech", false).group("Feedback"));
	private final BoolSetting chat = add(new BoolSetting("Chat message", true).group("Feedback")
			.describe("Prints a line that copies the coordinates when clicked."));
	private final BoolSetting coordsOnly = add(new BoolSetting("Coordinates only", false).group("Feedback")
			.describe("Chat and speech contain only the coordinates."));
	private final KeybindSetting clearKey = add(new KeybindSetting("Clear alerts key", KeybindSetting.UNBOUND).group("Feedback"));
	private final BoolSetting[] oreFilter = new BoolSetting[ORES.length];

	private final OreDetection oreDetection;
	private final WorldBlockResolver resolver = new WorldBlockResolver();
	private final SoundPipeline pipeline;
	private final ArrayDeque<Pending> pending = new ArrayDeque<>();
	private final List<OreAlert> alerts = new ArrayList<>();
	private final long[] localActionPos = new long[8];
	private final long[] localActionAt = new long[8];
	private int localActionNext;
	private int alertVersion;
	private boolean clearKeyDown;
	private Narrator narrator;

	/** @param oreDetection the ESP module that owns ore colours and world highlights */
	public SoundDetection(OreDetection oreDetection) {
		super("SoundDetection", "Finds ores other players mine, place or walk on from the sounds they cause.", Category.WORLD);
		this.oreDetection = oreDetection;
		for (int i = 0; i < ORES.length; i++) {
			oreFilter[i] = add(new BoolSetting("Listen: " + ORES[i].label(), true).group("Ores"));
		}
		this.pipeline = new SoundPipeline(loadTable());
		pipeline.params().oreFilter = ore -> oreFilter[ore.ordinal()].get();
	}

	private static OreSoundMap loadTable() {
		try (InputStream stream = SoundDetection.class.getResourceAsStream(TABLE)) {
			if (stream == null) {
				throw new IllegalStateException("Missing " + TABLE);
			}
			try (Reader reader = new InputStreamReader(stream, StandardCharsets.UTF_8)) {
				return OreSoundMap.parse(reader);
			}
		} catch (IOException e) {
			throw new IllegalStateException("Cannot read " + TABLE, e);
		}
	}

	/** @return recent alerts, newest first. The list is live; do not modify it. */
	public List<OreAlert> alerts() {
		return alerts;
	}

	/** @return a counter that changes whenever the alert list changes. */
	public int alertVersion() {
		return alertVersion;
	}

	/** Empties the alert list and removes the world highlights. */
	public void clearAlerts() {
		alerts.clear();
		alertVersion++;
		oreDetection.clearHighlights();
	}

	/**
	 * Entry point for the sound-packet mixins.
	 *
	 * @param soundId  sound event registry ID
	 * @param category sound category name
	 * @param source   the entity the sound is attached to, or {@code null} for positional sounds
	 */
	public void onSoundPacket(String soundId, String category, float volume, float pitch, double x, double y, double z,
			Entity source) {
		if (!isEnabled()) {
			return;
		}
		MinecraftClient client = MinecraftClient.getInstance();
		boolean local = source != null ? source == client.player : nearLocalAction(x, y, z);
		enqueue(new SoundSample(soundId, category, volume, pitch, x, y, z, local && ignoreSelf.get(), null,
				System.currentTimeMillis()));
	}

	/**
	 * Entry point for the block-break world event (event 2001), which names the broken
	 * block exactly and therefore needs no pitch or position guessing.
	 */
	public void onBlockBreakEvent(BlockPos pos, BlockState state) {
		if (!isEnabled()) {
			return;
		}
		OreType ore = OreBlocks.of(state);
		if (ore == null) {
			return;
		}
		String sound = state.getSoundGroup().getBreakSound().id().toString();
		float volume = (state.getSoundGroup().getVolume() + 1.0f) / 2.0f;
		float pitch = state.getSoundGroup().getPitch() * 0.8f;
		boolean local = nearLocalAction(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5);
		enqueue(new SoundSample(sound, "BLOCKS", volume, pitch, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
				local && ignoreSelf.get(), ore.blockIds().get(0), System.currentTimeMillis()));
	}

	/** Records a block the local player is breaking, so its sound is not reported back. */
	public void onLocalBlockAction(BlockPos pos) {
		localActionPos[localActionNext] = pos.asLong();
		localActionAt[localActionNext] = System.currentTimeMillis();
		localActionNext = (localActionNext + 1) % localActionPos.length;
	}

	/** A block changed on the client; remembers ores that disappeared for break resolution. */
	public void onBlockUpdate(BlockPos pos, BlockState oldState, BlockState newState) {
		if (!isEnabled()) {
			return;
		}
		OreType before = OreBlocks.of(oldState);
		if (before != null && OreBlocks.of(newState) != before) {
			resolver.noteRemoved(pos, before, System.currentTimeMillis());
		}
	}

	private boolean nearLocalAction(double x, double y, double z) {
		long now = System.currentTimeMillis();
		for (int i = 0; i < localActionPos.length; i++) {
			if (localActionAt[i] == 0 || now - localActionAt[i] > LOCAL_ACTION_MEMORY_MS) {
				continue;
			}
			double dx = BlockPos.unpackLongX(localActionPos[i]) + 0.5 - x;
			double dy = BlockPos.unpackLongY(localActionPos[i]) + 0.5 - y;
			double dz = BlockPos.unpackLongZ(localActionPos[i]) + 0.5 - z;
			if (dx * dx + dy * dy + dz * dz <= 1.5 * 1.5) {
				return true;
			}
		}
		return false;
	}

	private void enqueue(SoundSample sample) {
		if (pending.size() >= MAX_PENDING) {
			pending.pollFirst();
		}
		pending.addLast(new Pending(sample, 0));
	}

	@Override
	protected void onDisable() {
		pending.clear();
		resolver.clear();
		pipeline.reset();
	}

	@Override
	public void onWorldChange() {
		pending.clear();
		resolver.clear();
		pipeline.reset();
		clearAlerts();
	}

	@Override
	public void onTick() {
		MinecraftClient client = MinecraftClient.getInstance();
		if (client.player == null || client.world == null) {
			pending.clear();
			return;
		}
		syncParams();
		Vec3d listener = client.player.getEntityPos();
		int count = pending.size();
		for (int i = 0; i < count; i++) {
			Pending entry = pending.pollFirst();
			boolean lastChance = entry.attempts() >= RETRY_TICKS;
			SoundPipeline.Result result = pipeline.process(entry.sample(), listener.x, listener.y, listener.z, resolver, lastChance);
			if (result.status() == SoundPipeline.Status.PENDING) {
				pending.addLast(new Pending(entry.sample(), entry.attempts() + 1));
			} else if (result.status() == SoundPipeline.Status.ALERT) {
				emit(result.alert());
			}
		}
		boolean down = clearKey.isBound() && client.currentScreen == null
				&& InputUtil.isKeyPressed(client.getWindow(), clearKey.get());
		if (down && !clearKeyDown) {
			clearAlerts();
		}
		clearKeyDown = down;
	}

	@Override
	public void onRender(float tickDelta) {
		if (!oreDetection.isEnabled()) {
			oreDetection.renderHighlights();
		}
	}

	private void syncParams() {
		SoundPipeline.Params params = pipeline.params();
		params.detectionRadius = radius.get();
		params.pitchTolerance = pitchTolerance.get();
		params.minVolume = minVolume.get();
		params.minConfidence = minConfidence.get();
		params.dedupeWindowMs = dedupeWindow.get();
		params.resolveRadius = resolveRadius.get();
		params.blocksCategoryOnly = blocksOnly.get();
		setAction(params, SoundAction.BREAK, onBreak.get());
		setAction(params, SoundAction.PLACE, onPlace.get());
		setAction(params, SoundAction.STEP, onStep.get());
		setAction(params, SoundAction.HIT, onHit.get());
	}

	private static void setAction(SoundPipeline.Params params, SoundAction action, boolean on) {
		if (on) {
			params.actions.add(action);
		} else {
			params.actions.remove(action);
		}
	}

	private void emit(OreAlert alert) {
		alerts.add(0, alert);
		while (alerts.size() > maxAlerts.get()) {
			alerts.remove(alerts.size() - 1);
		}
		alertVersion++;
		oreDetection.pushHighlight(alert.x(), alert.y(), alert.z(), alert.ore(), Math.round(highlightSeconds.get() * 1000));

		if (beep.get()) {
			float closeness = 1f - (float) Math.min(1.0, alert.distance() / Math.max(1, radius.get()));
			UiSounds.beep(0.6f + 1.4f * closeness);
		}
		String coordinates = alert.coordinates();
		if (chat.get()) {
			String line = coordsOnly.get() ? coordinates : describe(alert);
			Chat.copyable(line, oreDetection.colorOf(alert.ore()), coordinates);
		}
		if (tts.get()) {
			speak(coordsOnly.get() ? coordinates : alert.ore().label() + " " + alert.action().verb() + ", "
					+ Math.round(alert.distance()) + " blocks away");
		}
	}

	private static String describe(OreAlert alert) {
		return String.format(Locale.ROOT, "%s %s at %s (%.0f m, %d%%%s)", alert.ore().label(), alert.action().verb(),
				alert.coordinates(), alert.distance(), Math.round(alert.confidence() * 100), alert.resolved() ? "" : ", unresolved");
	}

	private void speak(String text) {
		try {
			if (narrator == null) {
				narrator = Narrator.getNarrator();
			}
			narrator.say(text, false, 1.0f);
		} catch (RuntimeException | LinkageError e) {
			F1Client.LOGGER.warn("Text to speech is unavailable: {}", e.toString());
			tts.set(false);
		}
	}
}
