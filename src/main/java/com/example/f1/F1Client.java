package com.example.f1;

import com.example.f1.modules.Freecam;
import com.example.f1.modules.OreESP;
import com.example.f1.modules.SoundESP;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents;
import net.minecraft.client.Minecraft;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Entry point of the client: registers the modules and connects them to the game.
 *
 * <p>Two hooks are enough. Ticks come from {@code MinecraftMixin}, which calls
 * {@link Modules#tick()} at the tail of {@code Minecraft#tick}; drawing comes from
 * {@code WorldRenderEvents.AFTER_ENTITIES}, which is inside the level's pose stack and
 * already translated to camera space, so module coordinates are world coordinates.
 *
 * <p>Everything is client-side. No packet is created, changed or suppressed anywhere in
 * this mod, and no hook cancels vanilla behaviour.
 */
public final class F1Client implements ClientModInitializer {
	public static final String ID = "f1";
	public static final String NAME = "F1Client";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitializeClient() {
		Modules.register(new OreESP());     // F7
		Modules.register(new SoundESP());   // F8
		Modules.register(new Freecam());    // F6

		WorldRenderEvents.AFTER_ENTITIES.register(F1Client::onWorldRender);
		LOGGER.info("{} initialised: {} modules", NAME, Modules.all().size());
	}

	/**
	 * Draws every enabled module.
	 *
	 * <p>{@code WorldRenderContext} on Fabric API 16.2.x exposes {@code gameRenderer()},
	 * {@code worldRenderer()}, {@code worldState()}, {@code matrices()} and
	 * {@code consumers()} but no tick delta, so the partial tick comes from the client's own
	 * {@code DeltaTracker}. The context itself is unused here; modules draw into the gizmo
	 * pass, which the level renderer collects on its own.
	 */
	private static void onWorldRender(WorldRenderContext context) {
		Modules.render(Minecraft.getInstance().getDeltaTracker().getGameTimeDeltaPartialTicks(false));
	}
}
