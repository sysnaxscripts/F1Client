package dev.f1client.gametest;

import dev.f1client.F1Client;
import dev.f1client.auth.AuthState;
import dev.f1client.gui.AuthScreen;
import dev.f1client.gui.ClickGuiScreen;
import dev.f1client.module.Module;
import dev.f1client.module.impl.Freecam;
import dev.f1client.ore.OreType;
import dev.f1client.sound.OreAlert;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import net.fabricmc.fabric.api.client.gametest.v1.FabricClientGameTest;
import net.fabricmc.fabric.api.client.gametest.v1.context.ClientGameTestContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestSingleplayerContext;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.util.ScreenshotRecorder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.MixinEnvironment;

/**
 * End-to-end smoke test that runs inside a real client: account gate, register flow by
 * keyboard, ClickGUI, ore ESP, sound detection, Freecam, logout, and a mixin audit.
 * Run with {@code ./gradlew runClientGameTest}; screenshots land in
 * {@code build/run/clientGameTest/screenshots}.
 */
public final class F1ClientSmokeTest implements FabricClientGameTest {
	private static final String USER = "Tester_1";
	private static final String PASSWORD = "correct-horse-battery";

	private int shots;

	@Override
	public void runTest(ClientGameTestContext context) {
		F1Client mod = F1Client.get();
		context.getInput().resizeWindow(1280, 720);
		context.waitFor(client -> mod.auth().state() != AuthState.AUTHENTICATING);
		context.waitTicks(20);

		// --- gate closed: nothing can be enabled, the client key leads to the auth screen
		check(!mod.auth().isUnlocked(), "client must start locked");
		context.runOnClient(client -> mod.oreDetection().setEnabled(true));
		check(!mod.oreDetection().isEnabled(), "modules must not enable while locked");
		check(!mod.config().isLoaded(), "config must not load while locked");

		context.getInput().pressKey(GLFW.GLFW_KEY_RIGHT_SHIFT);
		context.waitForScreen(AuthScreen.class);
		context.waitTicks(10);
		shot(context, "auth-register-empty");

		// --- register by typing
		context.getInput().typeChars(USER);
		context.getInput().pressKey(GLFW.GLFW_KEY_TAB);
		context.getInput().typeChars(PASSWORD);
		context.getInput().pressKey(GLFW.GLFW_KEY_TAB);
		context.getInput().typeChars("mismatch");
		context.waitTicks(5);
		shot(context, "auth-register-mismatch");
		context.getInput().pressKey(GLFW.GLFW_KEY_ENTER);
		context.waitTicks(5);
		check(!mod.auth().isUnlocked(), "mismatching confirmation must not register");
		for (int i = 0; i < "mismatch".length(); i++) {
			context.getInput().pressKey(GLFW.GLFW_KEY_BACKSPACE);
		}
		context.getInput().typeChars(PASSWORD);
		context.waitTicks(3);
		shot(context, "auth-register-filled");
		context.getInput().pressKey(GLFW.GLFW_KEY_ENTER);
		context.waitFor(client -> mod.auth().isUnlocked());
		context.waitForScreen(ClickGuiScreen.class);
		check(USER.equals(mod.auth().username()), "signed in as " + mod.auth().username());
		check(mod.config().isLoaded(), "config loads after sign-in");
		context.waitTicks(10);
		shot(context, "clickgui-title");

		// --- keyboard navigation: Tab highlights, Enter opens settings, Space toggles (only in a world)
		context.getInput().pressKey(GLFW.GLFW_KEY_TAB);
		context.getInput().pressKey(GLFW.GLFW_KEY_ENTER);
		context.waitTicks(10);
		shot(context, "clickgui-settings-panel");
		context.getInput().pressKey(GLFW.GLFW_KEY_ESCAPE);
		context.getInput().pressKey(GLFW.GLFW_KEY_ESCAPE);
		context.waitFor(client -> !(client.currentScreen instanceof ClickGuiScreen));

		// Under the test framework the integrated server only runs its queued work when a
		// client frame is shorter than a tick. CI renders in software, so the world is
		// created in a small window with the menu blur off, and both are restored afterwards.
		int blur = context.computeOnClient(client -> client.options.getMenuBackgroundBlurriness().getValue());
		context.runOnClient(client -> client.options.getMenuBackgroundBlurriness().setValue(0));
		context.getInput().resizeWindow(640, 360);
		context.waitTicks(20);
		try (TestSingleplayerContext world = context.worldBuilder().create()) {
			context.runOnClient(client -> client.options.getMenuBackgroundBlurriness().setValue(blur));
			world.getClientWorld().waitForChunksRender();
			context.getInput().resizeWindow(1280, 720);
			context.waitTicks(5);
			BlockPos origin = context.computeOnClient(client -> client.player.getBlockPos());
			int x = origin.getX();
			int y = origin.getY();
			int z = origin.getZ();

			// --- OreDetection
			world.getServer().runCommand("setblock " + (x + 3) + " " + (y + 1) + " " + z + " minecraft:diamond_ore");
			world.getServer().runCommand("setblock " + (x + 3) + " " + (y + 2) + " " + (z + 2) + " minecraft:deepslate_diamond_ore");
			world.getServer().runCommand("setblock " + (x + 3) + " " + (y + 2) + " " + (z + 3) + " minecraft:deepslate_coal_ore");
			world.getServer().runCommand("setblock " + (x + 4) + " " + (y + 1) + " " + (z - 2) + " minecraft:ancient_debris");
			world.getServer().runCommand("setblock " + (x + 2) + " " + y + " " + (z - 1) + " minecraft:emerald_ore");
			world.getServer().runCommand("setblock " + (x + 2) + " " + (y + 3) + " " + (z + 1) + " minecraft:nether_gold_ore");
			context.waitTicks(10);
			context.runOnClient(client -> {
				mod.oreDetection().setEnabled(true);
				mod.soundDetection().setEnabled(true);
			});
			check(mod.oreDetection().isEnabled(), "OreDetection enables when unlocked");
			context.waitFor(client -> mod.oreDetection().cache().pendingChunks() == 0, 600);
			context.waitTicks(30);
			check(mod.oreDetection().countInRange(OreType.DIAMOND) >= 1, "diamond ore found by the chunk scan");
			check(mod.oreDetection().countInRange(OreType.ANCIENT_DEBRIS) >= 1, "ancient debris found by the chunk scan");
			check(mod.oreDetection().countInRange(OreType.DEEPSLATE_COAL) >= 1,
					"deepslate coal found by the chunk scan or the block update: "
							+ mod.oreDetection().countInRange(OreType.DEEPSLATE_COAL));
			int emeralds = mod.oreDetection().countInRange(OreType.EMERALD);
			world.getServer().runCommand("setblock " + (x + 1) + " " + (y + 2) + " " + (z + 2) + " minecraft:emerald_ore");
			context.waitTicks(30);
			check(mod.oreDetection().countInRange(OreType.EMERALD) == emeralds + 1, "block update adds an ore incrementally");
			check(mod.oreDetection().submittedLastFrame() >= 6, "ore boxes reach the renderer: " + mod.oreDetection().submittedLastFrame());
			shot(context, "world-ore-esp");

			// --- SoundDetection: block-break world event, then a positional sound packet
			world.getServer().runCommand("setblock " + (x + 3) + " " + (y + 1) + " " + z + " minecraft:air destroy");
			context.waitTicks(10);
			List<OreAlert> alerts = mod.soundDetection().alerts();
			check(!alerts.isEmpty(), "breaking an ore raises an alert");
			OreAlert first = alerts.get(0);
			check(first.ore() == OreType.DIAMOND && first.x() == x + 3 && first.y() == y + 1 && first.z() == z,
					"alert names the broken block: " + first);
			world.getServer().runCommand("playsound minecraft:block.nether_gold_ore.break block @a " + (x + 2.5) + " " + (y + 3.5) + " "
					+ (z + 1.5) + " 1 0.8");
			context.waitTicks(10);
			check(alerts.size() >= 2 && alerts.get(0).ore() == OreType.NETHER_GOLD, "sound packet raises an alert: " + alerts);
			world.getServer().runCommand("playsound minecraft:block.grass.break block @a " + (x + 2.5) + " " + (y + 3.5) + " "
					+ (z + 1.5) + " 1 0.8");
			context.waitTicks(10);
			check(alerts.size() == 2, "non-ore sounds are ignored");
			shot(context, "world-sound-alerts");

			// --- Freecam: the camera moves, the player does not
			Vec3d before = context.computeOnClient(client -> client.player.getEntityPos());
			float yawBefore = context.computeOnClient(client -> client.player.getYaw());
			context.runOnClient(client -> mod.freecam().setEnabled(true));
			check(Freecam.active() != null, "Freecam active");
			context.getInput().holdKeyFor(options -> options.backKey, 15);
			context.getInput().holdKeyFor(options -> options.jumpKey, 8);
			context.getInput().moveCursor(60, 40);
			context.waitTicks(5);
			Vec3d after = context.computeOnClient(client -> client.player.getEntityPos());
			float yawAfter = context.computeOnClient(client -> client.player.getYaw());
			Vec3d camera = context.computeOnClient(client -> client.gameRenderer.getCamera().getCameraPos());
			check(before.squaredDistanceTo(after) < 1.0e-6, "player must not move in Freecam: " + before + " -> " + after);
			check(yawBefore == yawAfter, "player must not turn in Freecam");
			check(camera.squaredDistanceTo(after) > 4.0, "camera must have left the player: " + camera);
			shot(context, "world-freecam");
			context.runOnClient(client -> mod.freecam().setEnabled(false));
			context.waitTicks(5);
			Vec3d restored = context.computeOnClient(client -> client.gameRenderer.getCamera().getCameraPos());
			Vec3d eye = context.computeOnClient(client -> client.player.getEyePos());
			check(restored.squaredDistanceTo(eye) < 0.5, "camera returns to the player: " + restored + " vs " + eye);

			// --- ClickGUI over the world, opened by the real key path
			context.getInput().pressKey(GLFW.GLFW_KEY_RIGHT_SHIFT);
			context.waitForScreen(ClickGuiScreen.class);
			context.waitTicks(10);
			shot(context, "clickgui-world");
			context.getInput().pressKey(GLFW.GLFW_KEY_TAB);
			context.getInput().pressKey(GLFW.GLFW_KEY_ENTER);
			context.waitTicks(10);
			shot(context, "clickgui-world-settings");
			context.getInput().pressKey(GLFW.GLFW_KEY_ESCAPE);
			context.getInput().pressKey(GLFW.GLFW_KEY_ESCAPE);
			context.waitForScreen(null);

			MixinEnvironment.getCurrentEnvironment().audit();

			// --- logout closes the gate again
			context.runOnClient(client -> mod.auth().logout());
			context.waitTicks(5);
			for (Module module : mod.modules().all()) {
				check(!module.isEnabled(), module.name() + " must be off after logout");
			}
			context.runOnClient(client -> mod.oreDetection().setEnabled(true));
			check(!mod.oreDetection().isEnabled(), "modules stay locked after logout");
			context.getInput().pressKey(GLFW.GLFW_KEY_RIGHT_SHIFT);
			context.waitForScreen(AuthScreen.class);
			context.waitTicks(10);
			shot(context, "auth-login-world");

			// --- sign back in: the profile (enabled modules) is restored
			context.getInput().typeChars(PASSWORD);
			context.getInput().pressKey(GLFW.GLFW_KEY_ENTER);
			context.waitFor(client -> mod.auth().isUnlocked());
			context.waitTicks(5);
			check(mod.oreDetection().isEnabled(), "OreDetection restored from the account profile");
			check(!mod.freecam().isEnabled(), "Freecam never restores as enabled");
			context.setScreen(() -> null);
		}
	}

	/**
	 * Saves the frame the game presented last. The framework's own screenshot call renders
	 * an extra frame from inside a client task, where world gizmos (the ESP boxes) are
	 * collected for a later frame and therefore missing from the picture.
	 */
	private void shot(ClientGameTestContext context, String name) {
		Path file = FabricLoader.getInstance().getGameDir().resolve("screenshots")
				.resolve(String.format("%04d_%s.png", shots++, name));
		AtomicBoolean done = new AtomicBoolean();
		context.waitTicks(2);
		context.runOnClient(client -> ScreenshotRecorder.takeScreenshot(client.getFramebuffer(), image -> {
			try (image) {
				Files.createDirectories(file.getParent());
				image.writeTo(file);
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			} finally {
				done.set(true);
			}
		}));
		context.waitFor(client -> done.get());
	}

	private static void check(boolean condition, String what) {
		if (!condition) {
			throw new AssertionError("F1Client smoke test failed: " + what);
		}
	}
}
