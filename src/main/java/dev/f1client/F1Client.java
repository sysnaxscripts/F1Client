package dev.f1client;

import com.google.gson.JsonElement;
import dev.f1client.auth.AuthBackend;
import dev.f1client.auth.AuthManager;
import dev.f1client.auth.AuthPrefs;
import dev.f1client.auth.AuthState;
import dev.f1client.auth.DeviceFingerprint;
import dev.f1client.auth.HttpAuthBackend;
import dev.f1client.auth.MockAuthBackend;
import dev.f1client.auth.SessionStore;
import dev.f1client.config.ConfigManager;
import dev.f1client.core.ClientScheduler;
import dev.f1client.core.GlobalSettings;
import dev.f1client.gui.AuthScreen;
import dev.f1client.gui.ClickGuiScreen;
import dev.f1client.hud.HudRenderer;
import dev.f1client.input.KeybindManager;
import dev.f1client.module.ModuleManager;
import dev.f1client.module.impl.Freecam;
import dev.f1client.module.impl.Hud;
import dev.f1client.module.impl.OreDetection;
import dev.f1client.module.impl.SoundDetection;
import dev.f1client.render.Theme;
import dev.f1client.util.UiSounds;
import java.nio.file.Path;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Mod entry point: builds the services, registers the modules and connects them to the
 * game's events.
 *
 * <p>Every client feature sits behind the account gate. Until {@link AuthManager} reports
 * an unlocked state no module can be enabled, no module receives ticks or render calls,
 * the HUD draws nothing and the per-account config is not loaded.
 */
public final class F1Client implements ClientModInitializer {
	public static final String ID = "f1client";
	public static final String NAME = "F1Client";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	private static F1Client instance;

	private String version = "dev";
	private ClientScheduler scheduler;
	private AuthManager auth;
	private ConfigManager config;
	private GlobalSettings globals;
	private ModuleManager modules;
	private KeybindManager keybinds;
	private OreDetection oreDetection;
	private SoundDetection soundDetection;
	private Freecam freecam;
	private Hud hud;
	private boolean mockBackend;
	private ClientWorld lastWorld;

	/** @return the mod instance; available from mod initialisation onwards. */
	public static F1Client get() {
		return instance;
	}

	@Override
	public void onInitializeClient() {
		instance = this;
		FabricLoader loader = FabricLoader.getInstance();
		version = loader.getModContainer(ID).map(mod -> mod.getMetadata().getVersion().getFriendlyString()).orElse("dev");
		Path dir = loader.getConfigDir().resolve(ID);

		AuthPrefs prefs = new AuthPrefs(dir.resolve("auth.json"));
		prefs.load();
		scheduler = new ClientScheduler();
		auth = new AuthManager(createBackend(prefs, dir), new SessionStore(dir.resolve("session.dat"),
				() -> DeviceFingerprint.compute(loader.getGameDir())), prefs, System::currentTimeMillis, scheduler);
		config = new ConfigManager(dir.resolve("config.json"), System::currentTimeMillis, scheduler::execute);
		globals = new GlobalSettings(config::markDirty);
		modules = new ModuleManager(auth::isUnlocked, config::markDirty);

		oreDetection = modules.register(new OreDetection());
		soundDetection = modules.register(new SoundDetection(oreDetection));
		freecam = modules.register(new Freecam());
		hud = modules.register(new Hud());

		config.registerSection("global", globals::toJson, globals::fromJson);
		config.registerSection("modules", modules::toJson, this::readModules);

		MinecraftClient client = MinecraftClient.getInstance();
		keybinds = new KeybindManager(client, auth::state, modules, globals.clientKey(),
				() -> client.setScreen(new AuthScreen()), () -> client.setScreen(new ClickGuiScreen()));
		auth.addListener((previous, current) -> client.execute(() -> onAuthStateChanged(client)));

		ClientLifecycleEvents.CLIENT_STARTED.register(started -> auth.startup());
		ClientLifecycleEvents.CLIENT_STOPPING.register(stopping -> shutdown());
		ClientTickEvents.END_CLIENT_TICK.register(this::tick);
		ClientPlayConnectionEvents.DISCONNECT.register((handler, disconnected) -> worldChanged());
		ClientChunkEvents.CHUNK_LOAD.register((world, chunk) -> {
			if (auth.isUnlocked()) {
				oreDetection.onChunkLoad(chunk.getPos().x, chunk.getPos().z);
			}
		});
		ClientChunkEvents.CHUNK_UNLOAD.register((world, chunk) -> oreDetection.onChunkUnload(chunk.getPos().x, chunk.getPos().z));
		WorldRenderEvents.BEFORE_DEBUG_RENDER.register(context -> {
			if (auth.isUnlocked()) {
				modules.render(client.getRenderTickCounter().getTickProgress(false));
			}
		});
		HudElementRegistry.addLast(Identifier.of(ID, "hud"), new HudRenderer(this));
		LOGGER.info("{} {} initialised ({} account backend)", NAME, version, mockBackend ? "mock" : "http");
	}

	private AuthBackend createBackend(AuthPrefs prefs, Path dir) {
		if (!prefs.useMockBackend()) {
			try {
				return new HttpAuthBackend(prefs.apiBaseUrl(), System::currentTimeMillis);
			} catch (IllegalArgumentException e) {
				LOGGER.error("auth.json has no usable HTTPS apiBaseUrl ({}); falling back to the local mock backend", e.getMessage());
			}
		}
		mockBackend = true;
		return new MockAuthBackend(System::currentTimeMillis, dir.resolve("mock-accounts.json"));
	}

	private void readModules(JsonElement element) {
		modules.disableAll();
		if (element != null && element.isJsonObject()) {
			modules.fromJson(element.getAsJsonObject());
		} else {
			modules.resetAll();
		}
	}

	/** Runs on the client thread after every auth transition. */
	private void onAuthStateChanged(MinecraftClient client) {
		if (auth.isUnlocked()) {
			if (!config.isLoaded()) {
				config.load(auth.username());
				Theme.get().setAccent(globals.accent().get());
				UiSounds.setEnabled(globals.uiSounds().get());
			}
		} else if (auth.state() != AuthState.AUTHENTICATING || config.isLoaded()) {
			lock(client);
		}
	}

	/** Closes the gate: saves and unloads the profile, switches every module off, leaves the ClickGUI. */
	private void lock(MinecraftClient client) {
		if (config.isLoaded()) {
			config.unload();
		}
		modules.disableAll();
		if (client.currentScreen instanceof ClickGuiScreen) {
			client.setScreen(auth.state() == AuthState.EXPIRED ? new AuthScreen() : null);
		}
	}

	private void tick(MinecraftClient client) {
		if (client.world != lastWorld) {
			lastWorld = client.world;
			worldChanged();
		}
		keybinds.tick();
		if (auth.isUnlocked()) {
			modules.tick();
		}
		config.tick();
	}

	private void worldChanged() {
		modules.worldChanged();
	}

	private void shutdown() {
		config.flush();
		scheduler.shutdown();
	}

	/** Mixin entry: a block changed in the client world. */
	public void onBlockUpdate(BlockPos pos, BlockState oldState, BlockState newState) {
		if (auth.isUnlocked()) {
			oreDetection.onBlockUpdate(pos, newState);
			soundDetection.onBlockUpdate(pos, oldState, newState);
		}
	}

	/** Mixin entry: a sound packet arrived (read-only observation). */
	public void onSoundPacket(String soundId, String category, float volume, float pitch, double x, double y, double z,
			Entity source) {
		if (auth.isUnlocked()) {
			soundDetection.onSoundPacket(soundId, category, volume, pitch, x, y, z, source);
		}
	}

	/** Mixin entry: the server announced a broken block (world event 2001). */
	public void onBlockBreakEvent(BlockPos pos, BlockState state) {
		if (auth.isUnlocked()) {
			soundDetection.onBlockBreakEvent(pos, state);
		}
	}

	/** Mixin entry: the local player broke a block. */
	public void onLocalBlockAction(BlockPos pos) {
		soundDetection.onLocalBlockAction(pos);
	}

	public String version() {
		return version;
	}

	public AuthManager auth() {
		return auth;
	}

	public ConfigManager config() {
		return config;
	}

	public GlobalSettings globals() {
		return globals;
	}

	public ModuleManager modules() {
		return modules;
	}

	public KeybindManager keybinds() {
		return keybinds;
	}

	public OreDetection oreDetection() {
		return oreDetection;
	}

	public SoundDetection soundDetection() {
		return soundDetection;
	}

	public Freecam freecam() {
		return freecam;
	}

	public Hud hud() {
		return hud;
	}

	/** @return whether accounts live in the local mock backend instead of a real server. */
	public boolean usesMockBackend() {
		return mockBackend;
	}
}
