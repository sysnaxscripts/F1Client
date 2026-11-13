# Last build

Run: https://github.com/sysnaxscripts/F1Client/actions/runs/43487267385
Commit under test: 7dcb6298dd90661c5e8b22ba01e9135b79dd40d1
Generated on: 2026-11-13T18:56:07Z

## build/libs

```
total 636
-rw-r--r-- 1 runner runner 650132 Nov 13 18:56 f1-0.02.jar
```

## Mapped API probe

```
compile classpath entries: 111
  big/minecraft: icu4j-77.1.jar (14663227 bytes)
  big/minecraft: fastutil-8.5.18.jar (23965563 bytes)
  big/minecraft: minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar (33694734 bytes)

packages containing a match (18):
  net.fabricmc.fabric.api.client.rendering.v1.world
  net.fabricmc.fabric.api.object.builder.v1.entity
  net.fabricmc.fabric.mixin.client.rendering
  net.minecraft.client.gui.screens.inventory
  net.minecraft.client.model.object.cart
  net.minecraft.client.renderer
  net.minecraft.client.renderer.debug
  net.minecraft.client.renderer.entity
  net.minecraft.client.renderer.entity.state
  net.minecraft.client.renderer.gizmos
  net.minecraft.client.resources.sounds
  net.minecraft.core.dispenser
  net.minecraft.gizmos
  net.minecraft.network.protocol.game
  net.minecraft.util.datafix.fixes
  net.minecraft.world.entity.vehicle.minecart
  net.minecraft.world.item
  net.minecraft.world.phys.shapes

matching classes (91):
  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$DebugRender   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.object.builder.v1.entity.MinecartComparatorLogic   [fabric-object-builder-api-v1-4abd26ae-21.1.40+4fc5413f3e.jar]
  net.fabricmc.fabric.api.object.builder.v1.entity.MinecartComparatorLogicRegistry   [fabric-object-builder-api-v1-4abd26ae-21.1.40+4fc5413f3e.jar]
  net.fabricmc.fabric.mixin.client.rendering.LevelRendererMixin   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.minecraft.client.gui.screens.inventory.MinecartCommandBlockEditScreen   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.model.object.cart.MinecartModel   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.LevelRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.LevelRenderer$1   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.LevelRenderer$BrightnessGetter   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.LevelRenderer$FinalizedGizmos   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.debug.BeeDebugRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.debug.BrainDebugRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.debug.BreezeDebugRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.debug.ChunkCullingDebugRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.debug.ChunkDebugRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.debug.ChunkDebugRenderer$ChunkData   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.debug.DebugRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.debug.DebugRenderer$SimpleDebugRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.debug.EntityBlockIntersectionDebugRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.debug.EntityHitboxDebugRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.debug.GoalSelectorDebugRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.debug.LightDebugRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.debug.LightSectionDebugRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.debug.LightSectionDebugRenderer$SectionData   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.debug.OctreeDebugRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.debug.PoiDebugRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.debug.RaidDebugRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.debug.VillageSectionsDebugRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.debug.WaterDebugRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.entity.AbstractMinecartRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.entity.MinecartRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.entity.TntMinecartRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.entity.state.MinecartRenderState   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.entity.state.MinecartTntRenderState   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives$Group   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives$Line   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives$Point   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives$Quad   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives$Text   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives$TriangleFan   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.gizmos.package-info   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.MinecartSoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.RidingMinecartSoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.core.dispenser.MinecartDispenseItemBehavior   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.ArrowGizmo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.CircleGizmo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.CuboidGizmo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.Gizmo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.GizmoCollector   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.GizmoCollector$1   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.GizmoPrimitives   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.GizmoProperties   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.GizmoStyle   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.Gizmos   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.Gizmos$TemporaryCollection   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.LineGizmo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.PointGizmo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.RectGizmo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.RectGizmo$1   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.SimpleGizmoCollector   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.SimpleGizmoCollector$GizmoInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.TextGizmo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.TextGizmo$Style   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.gizmos.package-info   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.protocol.game.ClientboundMoveMinecartPacket   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.protocol.game.ServerboundSetCommandMinecartPacket   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.util.datafix.fixes.EntityMinecartIdentifiersFix   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.AbstractMinecart   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.AbstractMinecartContainer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.Minecart   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.MinecartBehavior   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.MinecartChest   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.MinecartCommandBlock   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.MinecartCommandBlock$MinecartCommandBase   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.MinecartFurnace   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.MinecartHopper   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.MinecartSpawner   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.MinecartSpawner$1   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.MinecartTNT   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.NewMinecartBehavior   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.NewMinecartBehavior$1   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.NewMinecartBehavior$MinecartStep   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.NewMinecartBehavior$StepPartialTicks   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.NewMinecartBehavior$TrackIteration   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.OldMinecartBehavior   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.OldMinecartBehavior$1   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.entity.vehicle.minecart.package-info   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.item.MinecartItem   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.phys.shapes.MinecartCollisionContext   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.world.phys.shapes.MinecartCollisionContext$1   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]

signatures of the first 6 dump matches:

=== net.minecraft.client.resources.sounds.SoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "SoundInstance.java"
public interface net.minecraft.client.resources.sounds.SoundInstance extends net.fabricmc.fabric.api.client.sound.v1.FabricSoundInstance {
  public abstract net.minecraft.resources.Identifier getIdentifier();
  public abstract net.minecraft.client.sounds.WeighedSoundEvents resolve(net.minecraft.client.sounds.SoundManager);
  public abstract net.minecraft.client.resources.sounds.Sound getSound();
  public abstract net.minecraft.sounds.SoundSource getSource();
  public abstract boolean isLooping();
  public abstract boolean isRelative();
  public abstract int getDelay();
  public abstract float getVolume();
  public abstract float getPitch();
  public abstract double getX();
  public abstract double getY();
  public abstract double getZ();
  public abstract net.minecraft.client.resources.sounds.SoundInstance$Attenuation getAttenuation();
  public default boolean canStartSilent();
  public default boolean canPlaySound();
  public static net.minecraft.util.RandomSource createUnseededRandom();
}

=== net.minecraft.client.sounds.SoundEngine   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "SoundEngine.java"
public class net.minecraft.client.sounds.SoundEngine {
  private static final org.slf4j.Marker MARKER;
  private static final org.slf4j.Logger LOGGER;
  private static final float PITCH_MIN;
  private static final float PITCH_MAX;
  private static final float VOLUME_MIN;
  private static final float VOLUME_MAX;
  private static final int MIN_SOURCE_LIFETIME;
  private static final java.util.Set<net.minecraft.resources.Identifier> ONLY_WARN_ONCE;
  private static final long DEFAULT_DEVICE_CHECK_INTERVAL_MS;
  public static final java.lang.String MISSING_SOUND;
  public static final java.lang.String OPEN_AL_SOFT_PREFIX;
  public static final int OPEN_AL_SOFT_PREFIX_LENGTH;
  private final net.minecraft.client.sounds.SoundManager soundManager;
  private final net.minecraft.client.Options options;
  private boolean loaded;
  private final com.mojang.blaze3d.audio.Library library;
  private final com.mojang.blaze3d.audio.Listener listener;
  private final net.minecraft.client.sounds.SoundBufferLibrary soundBuffers;
  private final net.minecraft.client.sounds.SoundEngineExecutor executor;
  private final net.minecraft.client.sounds.ChannelAccess channelAccess;
  private int tickCount;
  private long lastDeviceCheckTime;
  private final java.util.concurrent.atomic.AtomicReference<net.minecraft.client.sounds.SoundEngine$DeviceCheckState> devicePoolState;
  private final java.util.Map<net.minecraft.client.resources.sounds.SoundInstance, net.minecraft.client.sounds.ChannelAccess$ChannelHandle> instanceToChannel;
  private final com.google.common.collect.Multimap<net.minecraft.sounds.SoundSource, net.minecraft.client.resources.sounds.SoundInstance> instanceBySource;
  private final it.unimi.dsi.fastutil.objects.Object2FloatMap<net.minecraft.sounds.SoundSource> gainBySource;
  private final java.util.List<net.minecraft.client.resources.sounds.TickableSoundInstance> tickingSounds;
  private final java.util.Map<net.minecraft.client.resources.sounds.SoundInstance, java.lang.Integer> queuedSounds;
  private final java.util.Map<net.minecraft.client.resources.sounds.SoundInstance, java.lang.Integer> soundDeleteTime;
  private final java.util.List<net.minecraft.client.sounds.SoundEventListener> listeners;
  private final java.util.List<net.minecraft.client.resources.sounds.TickableSoundInstance> queuedTickableSounds;
  private final java.util.List<net.minecraft.client.resources.sounds.Sound> preloadQueue;
  public net.minecraft.client.sounds.SoundEngine(net.minecraft.client.sounds.SoundManager, net.minecraft.client.Options, net.minecraft.server.packs.resources.ResourceProvider);
  public void reload();
  private synchronized void loadLibrary();
  public void refreshCategoryVolume(net.minecraft.sounds.SoundSource);
  public void destroy();
  public void emergencyShutdown();
  public void stop(net.minecraft.client.resources.sounds.SoundInstance);
  public void updateCategoryVolume(net.minecraft.sounds.SoundSource, float);
  public void stopAll();
  public void addEventListener(net.minecraft.client.sounds.SoundEventListener);
  public void removeEventListener(net.minecraft.client.sounds.SoundEventListener);
  private boolean shouldChangeDevice();
  public void tick(boolean);
  private void tickInGameSound();
  private void tickMusicWhenPaused();
  private static boolean requiresManualLooping(net.minecraft.client.resources.sounds.SoundInstance);
  private static boolean shouldLoopManually(net.minecraft.client.resources.sounds.SoundInstance);
  private static boolean shouldLoopAutomatically(net.minecraft.client.resources.sounds.SoundInstance);
  public boolean isActive(net.minecraft.client.resources.sounds.SoundInstance);
  public net.minecraft.client.sounds.SoundEngine$PlayResult play(net.minecraft.client.resources.sounds.SoundInstance);
  public void queueTickingSound(net.minecraft.client.resources.sounds.TickableSoundInstance);
  public void requestPreload(net.minecraft.client.resources.sounds.Sound);
  private float calculatePitch(net.minecraft.client.resources.sounds.SoundInstance);
  private float calculateVolume(net.minecraft.client.resources.sounds.SoundInstance);
  private float calculateVolume(float, net.minecraft.sounds.SoundSource);
  public void pauseAllExcept(net.minecraft.sounds.SoundSource...);
  public void resume();
  public void playDelayed(net.minecraft.client.resources.sounds.SoundInstance, int);
  public void updateSource(net.minecraft.client.Camera);
  public void stop(net.minecraft.resources.Identifier, net.minecraft.sounds.SoundSource);
  public java.lang.String getDebugString();
  public java.util.List<java.lang.String> getAvailableSoundDevices();
  public com.mojang.blaze3d.audio.ListenerTransform getListenerTransform();
  private void method_19751(com.mojang.blaze3d.audio.ListenerTransform);
  private static void method_19759(java.util.stream.Stream);
  private static void method_19758(net.minecraft.client.sounds.ChannelAccess$ChannelHandle, net.minecraft.client.sounds.AudioStream);
  private static void method_19755(net.minecraft.client.sounds.AudioStream, com.mojang.blaze3d.audio.Channel);
  private static void method_19757(net.minecraft.client.sounds.ChannelAccess$ChannelHandle, com.mojang.blaze3d.audio.SoundBuffer);
  private static void method_19752(com.mojang.blaze3d.audio.SoundBuffer, com.mojang.blaze3d.audio.Channel);
  private static void method_19749(float, float, net.minecraft.client.resources.sounds.SoundInstance$Attenuation, float, boolean, boolean, net.minecraft.world.phys.Vec3, boolean, com.mojang.blaze3d.audio.Channel);
  private static void method_19748(float, float, net.minecraft.world.phys.Vec3, com.mojang.blaze3d.audio.Channel);
  private void method_38938(java.lang.String);
  private void method_76567(net.minecraft.sounds.SoundSource, net.minecraft.client.resources.sounds.SoundInstance, net.minecraft.client.sounds.ChannelAccess$ChannelHandle);
  private static void method_76565(float, com.mojang.blaze3d.audio.Channel);
  private static void method_76568(it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap);
  static {};
}

=== net.minecraft.client.sounds.SoundEngineExecutor   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "SoundEngineExecutor.java"
public class net.minecraft.client.sounds.SoundEngineExecutor extends net.minecraft.util.thread.BlockableEventLoop<java.lang.Runnable> {
  private java.lang.Thread thread;
  private volatile boolean shutdown;
  public net.minecraft.client.sounds.SoundEngineExecutor();
  private java.lang.Thread createThread();
  public java.lang.Runnable wrapRunnable(java.lang.Runnable);
  public void schedule(java.lang.Runnable);
  protected boolean shouldRun(java.lang.Runnable);
  protected java.lang.Thread getRunningThread();
  private void run();
  protected void waitForTasks();
  public void shutDown();
  public void startUp();
  private boolean method_19766();
  private static void method_73255(java.lang.Thread, java.lang.Throwable);
}

=== net.minecraft.client.sounds.SoundManager   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "SoundManager.java"
public class net.minecraft.client.sounds.SoundManager extends net.minecraft.server.packs.resources.SimplePreparableReloadListener<net.minecraft.client.sounds.SoundManager$Preparations> {
  public static final net.minecraft.resources.Identifier EMPTY_SOUND_LOCATION;
  public static final net.minecraft.client.resources.sounds.Sound EMPTY_SOUND;
  public static final net.minecraft.resources.Identifier INTENTIONALLY_EMPTY_SOUND_LOCATION;
  public static final net.minecraft.client.sounds.WeighedSoundEvents INTENTIONALLY_EMPTY_SOUND_EVENT;
  public static final net.minecraft.client.resources.sounds.Sound INTENTIONALLY_EMPTY_SOUND;
  static final org.slf4j.Logger LOGGER;
  private static final java.lang.String SOUNDS_PATH;
  private static final com.google.gson.Gson GSON;
  private static final com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, net.minecraft.client.resources.sounds.SoundEventRegistration>> SOUND_EVENT_REGISTRATION_TYPE;
  private final java.util.Map<net.minecraft.resources.Identifier, net.minecraft.client.sounds.WeighedSoundEvents> registry;
  private final net.minecraft.client.sounds.SoundEngine soundEngine;
  private final java.util.Map<net.minecraft.resources.Identifier, net.minecraft.server.packs.resources.Resource> soundCache;
  public net.minecraft.client.sounds.SoundManager(net.minecraft.client.Options);
  protected net.minecraft.client.sounds.SoundManager$Preparations prepare(net.minecraft.server.packs.resources.ResourceManager, net.minecraft.util.profiling.ProfilerFiller);
  protected void apply(net.minecraft.client.sounds.SoundManager$Preparations, net.minecraft.server.packs.resources.ResourceManager, net.minecraft.util.profiling.ProfilerFiller);
  public java.util.List<java.lang.String> getAvailableSoundDevices();
  public com.mojang.blaze3d.audio.ListenerTransform getListenerTransform();
  static boolean validateSoundResource(net.minecraft.client.resources.sounds.Sound, net.minecraft.resources.Identifier, net.minecraft.server.packs.resources.ResourceProvider);
  public net.minecraft.client.sounds.WeighedSoundEvents getSoundEvent(net.minecraft.resources.Identifier);
  public java.util.Collection<net.minecraft.resources.Identifier> getAvailableSounds();
  public void queueTickingSound(net.minecraft.client.resources.sounds.TickableSoundInstance);
  public net.minecraft.client.sounds.SoundEngine$PlayResult play(net.minecraft.client.resources.sounds.SoundInstance);
  public void playDelayed(net.minecraft.client.resources.sounds.SoundInstance, int);
  public void updateSource(net.minecraft.client.Camera);
  public void pauseAllExcept(net.minecraft.sounds.SoundSource...);
  public void stop();
  public void destroy();
  public void emergencyShutdown();
  public void tick(boolean);
  public void resume();
  public void refreshCategoryVolume(net.minecraft.sounds.SoundSource);
  public void stop(net.minecraft.client.resources.sounds.SoundInstance);
  public void updateCategoryVolume(net.minecraft.sounds.SoundSource, float);
  public boolean isActive(net.minecraft.client.resources.sounds.SoundInstance);
  public void addListener(net.minecraft.client.sounds.SoundEventListener);
  public void removeListener(net.minecraft.client.sounds.SoundEventListener);
  public void stop(net.minecraft.resources.Identifier, net.minecraft.sounds.SoundSource);
  public java.lang.String getDebugString();
  public void reload();
  protected void apply(java.lang.Object, net.minecraft.server.packs.resources.ResourceManager, net.minecraft.util.profiling.ProfilerFiller);
  protected java.lang.Object prepare(net.minecraft.server.packs.resources.ResourceManager, net.minecraft.util.profiling.ProfilerFiller);
  static {};
}

=== net.minecraft.network.protocol.game.ClientboundSoundEntityPacket   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "ClientboundSoundEntityPacket.java"
public class net.minecraft.network.protocol.game.ClientboundSoundEntityPacket implements net.minecraft.network.protocol.Packet<net.minecraft.network.protocol.game.ClientGamePacketListener> {
  public static final net.minecraft.network.codec.StreamCodec<net.minecraft.network.RegistryFriendlyByteBuf, net.minecraft.network.protocol.game.ClientboundSoundEntityPacket> STREAM_CODEC;
  private final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> sound;
  private final net.minecraft.sounds.SoundSource source;
  private final int id;
  private final float volume;
  private final float pitch;
  private final long seed;
  public net.minecraft.network.protocol.game.ClientboundSoundEntityPacket(net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent>, net.minecraft.sounds.SoundSource, net.minecraft.world.entity.Entity, float, float, long);
  private net.minecraft.network.protocol.game.ClientboundSoundEntityPacket(net.minecraft.network.RegistryFriendlyByteBuf);
  private void write(net.minecraft.network.RegistryFriendlyByteBuf);
  public net.minecraft.network.protocol.PacketType<net.minecraft.network.protocol.game.ClientboundSoundEntityPacket> type();
  public void handle(net.minecraft.network.protocol.game.ClientGamePacketListener);
  public net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> getSound();
  public net.minecraft.sounds.SoundSource getSource();
  public int getId();
  public float getVolume();
  public float getPitch();
  public long getSeed();
  public void handle(net.minecraft.network.PacketListener);
  static {};
}

=== net.minecraft.network.protocol.game.ClientboundSoundPacket   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "ClientboundSoundPacket.java"
public class net.minecraft.network.protocol.game.ClientboundSoundPacket implements net.minecraft.network.protocol.Packet<net.minecraft.network.protocol.game.ClientGamePacketListener> {
  public static final net.minecraft.network.codec.StreamCodec<net.minecraft.network.RegistryFriendlyByteBuf, net.minecraft.network.protocol.game.ClientboundSoundPacket> STREAM_CODEC;
  public static final float LOCATION_ACCURACY;
  private final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> sound;
  private final net.minecraft.sounds.SoundSource source;
  private final int x;
  private final int y;
  private final int z;
  private final float volume;
  private final float pitch;
  private final long seed;
  public net.minecraft.network.protocol.game.ClientboundSoundPacket(net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent>, net.minecraft.sounds.SoundSource, double, double, double, float, float, long);
  private net.minecraft.network.protocol.game.ClientboundSoundPacket(net.minecraft.network.RegistryFriendlyByteBuf);
  private void write(net.minecraft.network.RegistryFriendlyByteBuf);
  public net.minecraft.network.protocol.PacketType<net.minecraft.network.protocol.game.ClientboundSoundPacket> type();
  public void handle(net.minecraft.network.protocol.game.ClientGamePacketListener);
  public net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> getSound();
  public net.minecraft.sounds.SoundSource getSource();
  public double getX();
  public double getY();
  public double getZ();
  public float getVolume();
  public float getPitch();
  public long getSeed();
  public void handle(net.minecraft.network.PacketListener);
  static {};
}
```

## Probe task log

```

> Configure project :
Fabric Loom: 1.14.10

> Task :probeApi
Wrote /home/runner/work/F1Client/F1Client/build/probe-api.txt (30026 bytes; 91 classes matched)
gradle/actions: Writing build results to /home/runner/work/_temp/.gradle-actions/build-results/__run_2-1794596164215.json

[Incubating] Problems report is available at: file:///home/runner/work/F1Client/F1Client/build/reports/problems/problems-report.html

Deprecated Gradle features were used in this build, making it incompatible with Gradle 10.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/9.2.1/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.

BUILD SUCCESSFUL in 3s
1 actionable task: 1 executed
Consider enabling configuration cache to speed up this build: https://docs.gradle.org/9.2.1/userguide/configuration_cache_enabling.html
```

## Gradle output (filtered)

```
14:> Task :compileJava
15:> Task :processResources
16:> Task :classes
17:> Task :jar
18:> Task :processIncludeJars
19:> Task :compileTestJava NO-SOURCE
20:> Task :processTestResources NO-SOURCE
21:> Task :testClasses UP-TO-DATE
22:> Task :test NO-SOURCE
23:> Task :validateAccessWidener NO-SOURCE
24:> Task :check UP-TO-DATE
25:> Task :remapJar
26:> Task :remapSourcesJar SKIPPED
27:> Task :assemble
28:> Task :build
39:BUILD SUCCESSFUL in 27s
```

## Gradle output (tail)

```
Starting a Gradle Daemon (subsequent builds will be faster)

> Configure project :
Fabric Loom: 1.14.10
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Using of the official minecraft mappings is at your own risk!
Please make sure to read and understand the following license:
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
# (c) 2020 Microsoft Corporation. These mappings are provided "as-is" and you bear the risk of using them. You may copy and use the mappings for development purposes, but you may not redistribute the mappings complete and unmodified. Microsoft makes no warranties, express or implied, with respect to the mappings provided here.  Use and modification of this document or the source code (in any form) of Minecraft: Java Edition is governed by the Minecraft End User License Agreement available at https://account.mojang.com/documents/minecraft_eula.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Cannot remap modifiers because it does not exists in any of the targets [] or their parents.

> Task :compileJava
> Task :processResources
> Task :classes
> Task :jar
> Task :processIncludeJars
> Task :compileTestJava NO-SOURCE
> Task :processTestResources NO-SOURCE
> Task :testClasses UP-TO-DATE
> Task :test NO-SOURCE
> Task :validateAccessWidener NO-SOURCE
> Task :check UP-TO-DATE
> Task :remapJar
> Task :remapSourcesJar SKIPPED
> Task :assemble
> Task :build
gradle/actions: Writing build results to /home/runner/work/_temp/.gradle-actions/build-results/__run-1794596138311.json

[Incubating] Problems report is available at: file:///home/runner/work/F1Client/F1Client/build/reports/problems/problems-report.html

Deprecated Gradle features were used in this build, making it incompatible with Gradle 10.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/9.2.1/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.

BUILD SUCCESSFUL in 27s
5 actionable tasks: 5 executed
Consider enabling configuration cache to speed up this build: https://docs.gradle.org/9.2.1/userguide/configuration_cache_enabling.html
```
