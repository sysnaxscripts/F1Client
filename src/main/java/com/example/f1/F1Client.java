package com.example.f1;

import com.example.f1.config.ConfigManager;
import com.example.f1.core.ClientSettings;
import com.example.f1.modules.Freecam;
import com.example.f1.modules.Hud;
import com.example.f1.modules.OreESP;
import com.example.f1.modules.SoundESP;
import com.example.f1.setting.KeybindSetting;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.Minecraft;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Entry point of the client: registers the modules, loads the profile and connects both to
 * the game.
 *
 * <p>Three hooks are enough. Ticks come from {@code MinecraftMixin}, which calls
 * {@link Modules#tick()} at the tail of {@code Minecraft#tick} — that is where the keys are
 * polled, the modules tick and a pending profile is written. Drawing in the world comes from
 * {@code WorldRenderEvents.AFTER_ENTITIES}, which is inside the level's pose stack and
 * already translated to camera space, so module coordinates are world coordinates. Drawing
 * on the HUD comes from {@code GuiMixin} at the tail of {@code Gui#render}.
 *
 * <p>Everything is client-side. No packet is created, changed or suppressed anywhere in
 * this mod, and no hook cancels vanilla behaviour.
 */
public final class F1Client implements ClientModInitializer {
	/** The mod id, and the namespace of every asset this client ships. */
	public static final String ID = "f1";
	/** The name shown in the interface and the log. */
	public static final String NAME = "F1 Client";
	public static final Logger LOGGER = LoggerFactory.getLogger("F1Client");

	private static F1Client instance;

	private final ClientSettings settings = new ClientSettings();
	private final ConfigManager config = new ConfigManager(
			FabricLoader.getInstance().getConfigDir().resolve(ID + "client").resolve("config.json"));

	/** @return the client, or {@code null} before initialisation has finished. */
	public static F1Client get() {
		return instance;
	}

	/** @return the client-wide settings: accent, client key, sounds, blur. */
	public ClientSettings settings() {
		return settings;
	}

	/** @return the profile store. */
	public ConfigManager config() {
		return config;
	}

	@Override
	public void onInitializeClient() {
		instance = this;

		// Fabric runs this entrypoint before the game window exists, so GLFW is not yet
		// initialised. Tell KeybindSetting when it is safe to ask GLFW for a localized key
		// name; until the window is created every caller gets the static fallback instead.
		// Querying GLFW earlier queues GLFW_NOT_INITIALIZED, which vanilla turns into the
		// "GLFW error before init: [0x10001]" startup crash.
		KeybindSetting.setWindowReadyCheck(() -> {
			Minecraft client = Minecraft.getInstance();
			return client != null && client.getWindow() != null && client.getWindow().handle() != 0L;
		});

		Modules.register(new OreESP());     // F7
		Modules.register(new SoundESP());   // F8
		Modules.register(new Freecam());    // F6
		Modules.register(new Hud());        // F5

		// Both sections belong to every profile, so switching profile swaps the accent and
		// the keybinds along with the modules.
		config.registerSection("global", settings::toJson, settings::fromJson);
		config.registerSection("modules", Modules::toJson, Modules::fromJson);
		config.load();
		settings.apply();

		WorldRenderEvents.AFTER_ENTITIES.register(F1Client::onWorldRender);
		ClientLifecycleEvents.CLIENT_STOPPING.register(client -> config.flush());

		LOGGER.info("{} initialised: {} modules, profile \"{}\", config {}", NAME, Modules.all().size(),
				config.activeProfile(), FabricLoader.getInstance().getConfigDir().resolve(ID + "client"));
	}

	/**
	 * Draws every enabled module.
	 *
	 * <p>{@code WorldRenderContext} on Fabric API 16.2.x exposes {@code gameRenderer()},
	 * {@code worldRenderer()}, {@code worldState()}, {@code matrices()} and
	 * {@code consumers()} but no tick delta, so the partial tick comes from the client's own
	 * {@code DeltaTracker}: {@code getGameTimeDeltaPartialTick(false)} is the game-time
	 * partial tick, ignoring the freeze that a paused game applies to rendering. The context
	 * itself is unused here; modules draw into the gizmo pass, which the level renderer
	 * collects on its own.
	 */
	private static void onWorldRender(WorldRenderContext context) {
		Modules.render(Minecraft.getInstance().getDeltaTracker().getGameTimeDeltaPartialTick(false));
	}
}
