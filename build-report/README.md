# Last build

Run: https://github.com/sysnaxscripts/F1Client/actions/runs/43486683748
Commit under test: 3921dd5a2bf23ca198925b9e822ea1d28736dedf
Generated on: 2026-11-13T18:52:34Z

## build/libs

```
ls: cannot access 'build/libs': No such file or directory
no build/libs directory
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

signatures of the first 4 dump matches:

=== net.minecraft.client.Camera   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "Camera.java"
public class net.minecraft.client.Camera implements net.minecraft.world.waypoints.TrackedWaypoint$Camera {
  private static final float DEFAULT_CAMERA_DISTANCE;
  private static final org.joml.Vector3f FORWARDS;
  private static final org.joml.Vector3f UP;
  private static final org.joml.Vector3f LEFT;
  private boolean initialized;
  private net.minecraft.world.level.Level level;
  private net.minecraft.world.entity.Entity entity;
  private net.minecraft.world.phys.Vec3 position;
  private final net.minecraft.core.BlockPos$MutableBlockPos blockPosition;
  private final org.joml.Vector3f forwards;
  private final org.joml.Vector3f up;
  private final org.joml.Vector3f left;
  private float xRot;
  private float yRot;
  private final org.joml.Quaternionf rotation;
  private boolean detached;
  private float eyeHeight;
  private float eyeHeightOld;
  private float partialTickTime;
  private final net.minecraft.world.attribute.EnvironmentAttributeProbe attributeProbe;
  public net.minecraft.client.Camera();
  public void setup(net.minecraft.world.level.Level, net.minecraft.world.entity.Entity, boolean, boolean, float);
  public void tick();
  private float getMaxZoom(float);
  protected void move(float, float, float);
  protected void setRotation(float, float);
  protected void setPosition(double, double, double);
  protected void setPosition(net.minecraft.world.phys.Vec3);
  public net.minecraft.world.phys.Vec3 position();
  public net.minecraft.core.BlockPos blockPosition();
  public float xRot();
  public float yRot();
  public float yaw();
  public org.joml.Quaternionf rotation();
  public net.minecraft.world.entity.Entity entity();
  public boolean isInitialized();
  public boolean isDetached();
  public net.minecraft.world.attribute.EnvironmentAttributeProbe attributeProbe();
  public net.minecraft.client.Camera$NearPlane getNearPlane();
  public net.minecraft.world.level.material.FogType getFluidInCamera();
  public org.joml.Vector3fc forwardVector();
  public org.joml.Vector3fc upVector();
  public org.joml.Vector3fc leftVector();
  public void reset();
  public float getPartialTickTime();
  static {};
}

=== net.minecraft.client.CameraType   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "CameraType.java"
public final class net.minecraft.client.CameraType extends java.lang.Enum<net.minecraft.client.CameraType> {
  public static final net.minecraft.client.CameraType FIRST_PERSON;
  public static final net.minecraft.client.CameraType THIRD_PERSON_BACK;
  public static final net.minecraft.client.CameraType THIRD_PERSON_FRONT;
  private static final net.minecraft.client.CameraType[] VALUES;
  private final boolean firstPerson;
  private final boolean mirrored;
  private static final net.minecraft.client.CameraType[] $VALUES;
  public static net.minecraft.client.CameraType[] values();
  public static net.minecraft.client.CameraType valueOf(java.lang.String);
  private net.minecraft.client.CameraType(boolean, boolean);
  public boolean isFirstPerson();
  public boolean isMirrored();
  public net.minecraft.client.CameraType cycle();
  private static net.minecraft.client.CameraType[] $values();
  static {};
}

=== net.minecraft.client.multiplayer.ClientLevel   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "ClientLevel.java"
public class net.minecraft.client.multiplayer.ClientLevel extends net.minecraft.world.level.Level implements net.minecraft.client.multiplayer.CacheSlot$Cleaner<net.minecraft.client.multiplayer.ClientLevel> {
  private static final org.slf4j.Logger LOGGER;
  public static final net.minecraft.network.chat.Component DEFAULT_QUIT_MESSAGE;
  private static final double FLUID_PARTICLE_SPAWN_OFFSET;
  private static final int NORMAL_LIGHT_UPDATES_PER_FRAME;
  private static final int LIGHT_UPDATE_QUEUE_SIZE_THRESHOLD;
  final net.minecraft.world.level.entity.EntityTickList tickingEntities;
  private final net.minecraft.world.level.entity.TransientEntitySectionManager<net.minecraft.world.entity.Entity> entityStorage;
  private final net.minecraft.client.multiplayer.ClientPacketListener connection;
  private final net.minecraft.client.renderer.LevelRenderer levelRenderer;
  private final net.minecraft.client.renderer.LevelEventHandler levelEventHandler;
  private final net.minecraft.client.multiplayer.ClientLevel$ClientLevelData clientLevelData;
  private final net.minecraft.world.TickRateManager tickRateManager;
  private final net.minecraft.client.renderer.EndFlashState endFlashState;
  private final net.minecraft.client.Minecraft minecraft;
  final java.util.List<net.minecraft.client.player.AbstractClientPlayer> players;
  final java.util.List<net.minecraft.world.entity.boss.enderdragon.EnderDragonPart> dragonParts;
  private final java.util.Map<net.minecraft.world.level.saveddata.maps.MapId, net.minecraft.world.level.saveddata.maps.MapItemSavedData> mapData;
  private int skyFlashTime;
  private final it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap<net.minecraft.world.level.ColorResolver, net.minecraft.client.color.block.BlockTintCache> tintCaches;
  private final net.minecraft.client.multiplayer.ClientChunkCache chunkSource;
  private final java.util.Deque<java.lang.Runnable> lightUpdateQueue;
  private int serverSimulationDistance;
  private final net.minecraft.client.multiplayer.prediction.BlockStatePredictionHandler blockStatePredictionHandler;
  private final java.util.Set<net.minecraft.world.level.block.entity.BlockEntity> globallyRenderedBlockEntities;
  private final net.minecraft.client.multiplayer.ClientExplosionTracker explosionTracker;
  private final net.minecraft.world.level.border.WorldBorder worldBorder;
  private final net.minecraft.world.attribute.EnvironmentAttributeSystem environmentAttributes;
  private final int seaLevel;
  private boolean tickDayTime;
  private static final java.util.Set<net.minecraft.world.item.Item> MARKER_PARTICLE_ITEMS;
  public void handleBlockChangedAck(int);
  public void onBlockEntityAdded(net.minecraft.world.level.block.entity.BlockEntity);
  public java.util.Set<net.minecraft.world.level.block.entity.BlockEntity> getGloballyRenderedBlockEntities();
  public void setServerVerifiedBlockState(net.minecraft.core.BlockPos, net.minecraft.world.level.block.state.BlockState, int);
  public void syncBlockState(net.minecraft.core.BlockPos, net.minecraft.world.level.block.state.BlockState, net.minecraft.world.phys.Vec3);
  net.minecraft.client.multiplayer.prediction.BlockStatePredictionHandler getBlockStatePredictionHandler();
  public boolean setBlock(net.minecraft.core.BlockPos, net.minecraft.world.level.block.state.BlockState, int, int);
  public net.minecraft.client.multiplayer.ClientLevel(net.minecraft.client.multiplayer.ClientPacketListener, net.minecraft.client.multiplayer.ClientLevel$ClientLevelData, net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level>, net.minecraft.core.Holder<net.minecraft.world.level.dimension.DimensionType>, int, int, net.minecraft.client.renderer.LevelRenderer, boolean, long, int);
  private net.minecraft.world.attribute.EnvironmentAttributeSystem$Builder addEnvironmentAttributeLayers(net.minecraft.world.attribute.EnvironmentAttributeSystem$Builder);
  public void queueLightUpdate(java.lang.Runnable);
  public void pollLightUpdates();
  public net.minecraft.client.renderer.EndFlashState endFlashState();
  public void tick(java.util.function.BooleanSupplier);
  private void tickTime();
  public void setTimeFromServer(long, long, boolean);
  public java.lang.Iterable<net.minecraft.world.entity.Entity> entitiesForRendering();
  public void tickEntities();
  public boolean isTickingEntity(net.minecraft.world.entity.Entity);
  public boolean shouldTickDeath(net.minecraft.world.entity.Entity);
  public void tickNonPassenger(net.minecraft.world.entity.Entity);
  private void tickPassenger(net.minecraft.world.entity.Entity, net.minecraft.world.entity.Entity);
  public void unload(net.minecraft.world.level.chunk.LevelChunk);
  public void onChunkLoaded(net.minecraft.world.level.ChunkPos);
  public void onSectionBecomingNonEmpty(long);
  public void clearTintCaches();
  public boolean hasChunk(int, int);
  public int getEntityCount();
  public void addEntity(net.minecraft.world.entity.Entity);
  public void removeEntity(int, net.minecraft.world.entity.Entity$RemovalReason);
  public java.util.List<net.minecraft.world.entity.Entity> getPushableEntities(net.minecraft.world.entity.Entity, net.minecraft.world.phys.AABB);
  public net.minecraft.world.entity.Entity getEntity(int);
  public void disconnect(net.minecraft.network.chat.Component);
  public void animateTick(int, int, int);
  private net.minecraft.world.level.block.Block getMarkerParticleTarget();
  public void doAnimateTick(int, int, int, int, net.minecraft.util.RandomSource, net.minecraft.world.level.block.Block, net.minecraft.core.BlockPos$MutableBlockPos);
  private void trySpawnDripParticles(net.minecraft.core.BlockPos, net.minecraft.world.level.block.state.BlockState, net.minecraft.core.particles.ParticleOptions, boolean);
  private void spawnParticle(net.minecraft.core.BlockPos, net.minecraft.core.particles.ParticleOptions, net.minecraft.world.phys.shapes.VoxelShape, double);
  private void spawnFluidParticle(double, double, double, double, double, net.minecraft.core.particles.ParticleOptions);
  public net.minecraft.CrashReportCategory fillReportDetails(net.minecraft.CrashReport);
  public void playSeededSound(net.minecraft.world.entity.Entity, double, double, double, net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent>, net.minecraft.sounds.SoundSource, float, float, long);
  public void playSeededSound(net.minecraft.world.entity.Entity, net.minecraft.world.entity.Entity, net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent>, net.minecraft.sounds.SoundSource, float, float, long);
  public void playLocalSound(net.minecraft.world.entity.Entity, net.minecraft.sounds.SoundEvent, net.minecraft.sounds.SoundSource, float, float);
  public void playPlayerSound(net.minecraft.sounds.SoundEvent, net.minecraft.sounds.SoundSource, float, float);
  public void playLocalSound(double, double, double, net.minecraft.sounds.SoundEvent, net.minecraft.sounds.SoundSource, float, float, boolean);
  private void playSound(double, double, double, net.minecraft.sounds.SoundEvent, net.minecraft.sounds.SoundSource, float, float, boolean, long);
  public void createFireworks(double, double, double, double, double, double, java.util.List<net.minecraft.world.item.component.FireworkExplosion>);
  public void sendPacketToServer(net.minecraft.network.protocol.Packet<?>);
  public net.minecraft.world.level.border.WorldBorder getWorldBorder();
  public net.minecraft.world.item.crafting.RecipeAccess recipeAccess();
  public net.minecraft.world.TickRateManager tickRateManager();
  public net.minecraft.world.attribute.EnvironmentAttributeSystem environmentAttributes();
  public net.minecraft.world.ticks.LevelTickAccess<net.minecraft.world.level.block.Block> getBlockTicks();
  public net.minecraft.world.ticks.LevelTickAccess<net.minecraft.world.level.material.Fluid> getFluidTicks();
  public net.minecraft.client.multiplayer.ClientChunkCache getChunkSource();
  public net.minecraft.world.level.saveddata.maps.MapItemSavedData getMapData(net.minecraft.world.level.saveddata.maps.MapId);
  public void overrideMapData(net.minecraft.world.level.saveddata.maps.MapId, net.minecraft.world.level.saveddata.maps.MapItemSavedData);
  public net.minecraft.world.scores.Scoreboard getScoreboard();
  public void sendBlockUpdated(net.minecraft.core.BlockPos, net.minecraft.world.level.block.state.BlockState, net.minecraft.world.level.block.state.BlockState, int);
  public void setBlocksDirty(net.minecraft.core.BlockPos, net.minecraft.world.level.block.state.BlockState, net.minecraft.world.level.block.state.BlockState);
  public void setSectionDirtyWithNeighbors(int, int, int);
  public void setSectionRangeDirty(int, int, int, int, int, int);
  public void destroyBlockProgress(int, net.minecraft.core.BlockPos, int);
  public void globalLevelEvent(int, net.minecraft.core.BlockPos, int);
  public void levelEvent(net.minecraft.world.entity.Entity, int, net.minecraft.core.BlockPos, int);
  public void addParticle(net.minecraft.core.particles.ParticleOptions, double, double, double, double, double, double);
  public void addParticle(net.minecraft.core.particles.ParticleOptions, boolean, boolean, double, double, double, double, double, double);
  public void addAlwaysVisibleParticle(net.minecraft.core.particles.ParticleOptions, double, double, double, double, double, double);
  public void addAlwaysVisibleParticle(net.minecraft.core.particles.ParticleOptions, boolean, double, double, double, double, double, double);
  private void doAddParticle(net.minecraft.core.particles.ParticleOptions, boolean, boolean, double, double, double, double, double, double);
  private net.minecraft.server.level.ParticleStatus calculateParticleLevel(boolean);
  public java.util.List<net.minecraft.client.player.AbstractClientPlayer> players();
  public java.util.List<net.minecraft.world.entity.boss.enderdragon.EnderDragonPart> dragonParts();
  public net.minecraft.core.Holder<net.minecraft.world.level.biome.Biome> getUncachedNoiseBiome(int, int, int);
  private int getSkyFlashTime();
  public void setSkyFlashTime(int);
  public float getShade(net.minecraft.core.Direction, boolean);
  public int getBlockTint(net.minecraft.core.BlockPos, net.minecraft.world.level.ColorResolver);
  public int calculateBlockTint(net.minecraft.core.BlockPos, net.minecraft.world.level.ColorResolver);
  public void setRespawnData(net.minecraft.world.level.storage.LevelData$RespawnData);
  public net.minecraft.world.level.storage.LevelData$RespawnData getRespawnData();
  public java.lang.String toString();
  public net.minecraft.client.multiplayer.ClientLevel$ClientLevelData getLevelData();
  public void gameEvent(net.minecraft.core.Holder<net.minecraft.world.level.gameevent.GameEvent>, net.minecraft.world.phys.Vec3, net.minecraft.world.level.gameevent.GameEvent$Context);
  protected java.util.Map<net.minecraft.world.level.saveddata.maps.MapId, net.minecraft.world.level.saveddata.maps.MapItemSavedData> getAllMapData();
  protected void addMapData(java.util.Map<net.minecraft.world.level.saveddata.maps.MapId, net.minecraft.world.level.saveddata.maps.MapItemSavedData>);
  protected net.minecraft.world.level.entity.LevelEntityGetter<net.minecraft.world.entity.Entity> getEntities();
  public java.lang.String gatherChunkSourceStats();
  public void addDestroyBlockEffect(net.minecraft.core.BlockPos, net.minecraft.world.level.block.state.BlockState);
  public void addBreakingBlockEffect(net.minecraft.core.BlockPos, net.minecraft.core.Direction);
  public void setServerSimulationDistance(int);
  public int getServerSimulationDistance();
  public net.minecraft.world.flag.FeatureFlagSet enabledFeatures();
  public net.minecraft.world.item.alchemy.PotionBrewing potionBrewing();
  public net.minecraft.world.level.block.entity.FuelValues fuelValues();
  public void explode(net.minecraft.world.entity.Entity, net.minecraft.world.damagesource.DamageSource, net.minecraft.world.level.ExplosionDamageCalculator, double, double, double, float, boolean, net.minecraft.world.level.Level$ExplosionInteraction, net.minecraft.core.particles.ParticleOptions, net.minecraft.core.particles.ParticleOptions, net.minecraft.util.random.WeightedList<net.minecraft.core.particles.ExplosionParticleInfo>, net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent>);
  public int getSeaLevel();
  public int getClientLeafTintColor(net.minecraft.core.BlockPos);
  public void registerForCleaning(net.minecraft.client.multiplayer.CacheSlot<net.minecraft.client.multiplayer.ClientLevel, ?>);
  public void trackExplosionEffects(net.minecraft.world.phys.Vec3, float, int, net.minecraft.util.random.WeightedList<net.minecraft.core.particles.ExplosionParticleInfo>);
  public net.minecraft.world.level.storage.LevelData getLevelData();
  public java.util.Collection dragonParts();
  public net.minecraft.world.level.chunk.ChunkSource getChunkSource();
  public net.minecraft.world.attribute.EnvironmentAttributeReader environmentAttributes();
  private void method_74253(net.minecraft.core.BlockPos, net.minecraft.world.level.block.state.BlockState, double, double, double, double, double, double);
  private java.lang.String method_74916(double, double, double) throws java.lang.Exception;
  private java.lang.String method_74917(net.minecraft.core.particles.ParticleOptions) throws java.lang.Exception;
  private java.lang.String method_54633() throws java.lang.Exception;
  private java.lang.String method_2933() throws java.lang.Exception;
  private java.lang.String method_2946() throws java.lang.Exception;
  private static void method_23779(net.minecraft.world.level.ColorResolver, net.minecraft.client.color.block.BlockTintCache);
  private static void method_32121(net.minecraft.world.level.ChunkPos, net.minecraft.world.level.ColorResolver, net.minecraft.client.color.block.BlockTintCache);
  private static java.lang.String method_18649(net.minecraft.world.entity.Entity);
  private void method_32124(net.minecraft.world.entity.Entity);
  private java.lang.Float method_76542(java.lang.Float, int);
  private java.lang.Integer method_76540(int, java.lang.Integer, int);
  private void method_23778(it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap);
  private int method_38535(net.minecraft.core.BlockPos);
  private int method_68160(net.minecraft.core.BlockPos);
  private int method_38537(net.minecraft.core.BlockPos);
  private int method_38538(net.minecraft.core.BlockPos);
  static {};
}

=== net.minecraft.client.renderer.GameRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "GameRenderer.java"
public class net.minecraft.client.renderer.GameRenderer implements net.minecraft.world.waypoints.TrackedWaypoint$Projector,java.lang.AutoCloseable {
  private static final net.minecraft.resources.Identifier BLUR_POST_CHAIN_ID;
  public static final int MAX_BLUR_RADIUS;
  private static final org.slf4j.Logger LOGGER;
  public static final float PROJECTION_Z_NEAR;
  public static final float PROJECTION_3D_HUD_Z_FAR;
  private static final float PORTAL_SPINNING_SPEED;
  private static final float NAUSEA_SPINNING_SPEED;
  private final net.minecraft.client.Minecraft minecraft;
  private final net.minecraft.util.RandomSource random;
  private float renderDistance;
  public final net.minecraft.client.renderer.ItemInHandRenderer itemInHandRenderer;
  private final net.minecraft.client.renderer.ScreenEffectRenderer screenEffectRenderer;
  private final net.minecraft.client.renderer.RenderBuffers renderBuffers;
  private float spinningEffectTime;
  private float spinningEffectSpeed;
  private float fovModifier;
  private float oldFovModifier;
  private float darkenWorldAmount;
  private float darkenWorldAmountO;
  private boolean renderBlockOutline;
  private long lastScreenshotAttempt;
  private boolean hasWorldScreenshot;
  private long lastActiveTime;
  private final net.minecraft.client.renderer.LightTexture lightTexture;
  private final net.minecraft.client.renderer.texture.OverlayTexture overlayTexture;
  private net.minecraft.client.renderer.PanoramicScreenshotParameters panoramicScreenshotParameters;
  protected final net.minecraft.client.renderer.CubeMap cubeMap;
  protected final net.minecraft.client.renderer.PanoramaRenderer panorama;
  private final com.mojang.blaze3d.resource.CrossFrameResourcePool resourcePool;
  private final net.minecraft.client.renderer.fog.FogRenderer fogRenderer;
  private final net.minecraft.client.gui.render.GuiRenderer guiRenderer;
  final net.minecraft.client.gui.render.state.GuiRenderState guiRenderState;
  private final net.minecraft.client.renderer.state.LevelRenderState levelRenderState;
  private final net.minecraft.client.renderer.SubmitNodeStorage submitNodeStorage;
  private final net.minecraft.client.renderer.feature.FeatureRenderDispatcher featureRenderDispatcher;
  private net.minecraft.resources.Identifier postEffectId;
  private boolean effectActive;
  private final net.minecraft.client.Camera mainCamera;
  private final com.mojang.blaze3d.platform.Lighting lighting;
  private final net.minecraft.client.renderer.GlobalSettingsUniform globalSettingsUniform;
  private final net.minecraft.client.renderer.PerspectiveProjectionMatrixBuffer levelProjectionMatrixBuffer;
  private final net.minecraft.client.renderer.CachedPerspectiveProjectionMatrixBuffer hud3dProjectionMatrixBuffer;
  public net.minecraft.client.renderer.GameRenderer(net.minecraft.client.Minecraft, net.minecraft.client.renderer.ItemInHandRenderer, net.minecraft.client.renderer.RenderBuffers, net.minecraft.client.renderer.block.BlockRenderDispatcher);
  public void close();
  public net.minecraft.client.renderer.SubmitNodeStorage getSubmitNodeStorage();
  public net.minecraft.client.renderer.feature.FeatureRenderDispatcher getFeatureRenderDispatcher();
  public net.minecraft.client.renderer.state.LevelRenderState getLevelRenderState();
  public void setRenderBlockOutline(boolean);
  public void setPanoramicScreenshotParameters(net.minecraft.client.renderer.PanoramicScreenshotParameters);
  public net.minecraft.client.renderer.PanoramicScreenshotParameters getPanoramicScreenshotParameters();
  public boolean isPanoramicMode();
  public void clearPostEffect();
  public void togglePostEffect();
  public void checkEntityPostEffect(net.minecraft.world.entity.Entity);
  private void setPostEffect(net.minecraft.resources.Identifier);
  public void processBlurEffect();
  public void preloadUiShader(net.minecraft.server.packs.resources.ResourceProvider);
  public void tick();
  public net.minecraft.resources.Identifier currentPostEffect();
  public void resize(int, int);
  public void pick(float);
  private void tickFov();
  private float getFov(net.minecraft.client.Camera, float, boolean);
  private void bobHurt(com.mojang.blaze3d.vertex.PoseStack, float);
  private void bobView(com.mojang.blaze3d.vertex.PoseStack, float);
  private void renderItemInHand(float, boolean, org.joml.Matrix4f);
  public org.joml.Matrix4f getProjectionMatrix(float);
  public float getDepthFar();
  public static float getNightVisionScale(net.minecraft.world.entity.LivingEntity, float);
  public void render(net.minecraft.client.DeltaTracker, boolean);
  private void renderActiveTextDebug();
  private void tryTakeScreenshotIfNeeded();
  private void takeAutoScreenshot(java.nio.file.Path);
  private boolean shouldRenderBlockOutline();
  public void updateCamera(net.minecraft.client.DeltaTracker);
  public void renderLevel(net.minecraft.client.DeltaTracker);
  private void extractCamera(float);
  private org.joml.Matrix4f getProjectionMatrixForCulling(float);
  public void resetData();
  public void displayItemActivation(net.minecraft.world.item.ItemStack);
  public net.minecraft.client.Minecraft getMinecraft();
  public float getDarkenWorldAmount(float);
  public float getRenderDistance();
  public net.minecraft.client.Camera getMainCamera();
  public net.minecraft.client.renderer.LightTexture lightTexture();
  public net.minecraft.client.renderer.texture.OverlayTexture overlayTexture();
  public net.minecraft.world.phys.Vec3 projectPointToScreen(net.minecraft.world.phys.Vec3);
  public double projectHorizonToScreen();
  public net.minecraft.client.renderer.GlobalSettingsUniform getGlobalSettingsUniform();
  public com.mojang.blaze3d.platform.Lighting getLighting();
  public void setLevel(net.minecraft.client.multiplayer.ClientLevel);
  public net.minecraft.client.renderer.PanoramaRenderer getPanorama();
  private static void method_68164(java.nio.file.Path, com.mojang.blaze3d.platform.NativeImage);
  private static void method_3181(com.mojang.blaze3d.platform.NativeImage, java.nio.file.Path);
  private void method_37474(java.nio.file.Path);
  private void method_75836(net.minecraft.client.gui.render.state.GuiTextRenderState);
  private java.lang.String method_37103() throws java.lang.Exception;
  private java.lang.String method_3205() throws java.lang.Exception;
  private java.lang.String method_18655() throws java.lang.Exception;
  private static java.lang.String method_68479(net.minecraft.server.packs.resources.ResourceProvider, net.minecraft.resources.Identifier, com.mojang.blaze3d.shaders.ShaderType);
  static {};
}
```

## Probe task log

```

> Configure project :
Fabric Loom: 1.14.10

> Task :probeApi
Wrote /home/runner/work/F1Client/F1Client/build/probe-api.txt (38948 bytes; 91 classes matched)
gradle/actions: Writing build results to /home/runner/work/_temp/.gradle-actions/build-results/__run_2-1794595950210.json

[Incubating] Problems report is available at: file:///home/runner/work/F1Client/F1Client/build/reports/problems/problems-report.html

Deprecated Gradle features were used in this build, making it incompatible with Gradle 10.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/9.2.1/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.

BUILD SUCCESSFUL in 4s
1 actionable task: 1 executed
Consider enabling configuration cache to speed up this build: https://docs.gradle.org/9.2.1/userguide/configuration_cache_enabling.html
```

## Gradle output (filtered)

```
14:> Task :compileJava
15:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/Freecam.java:60: error: cannot find symbol
22:> Task :compileJava FAILED
27:FAILURE: Build failed with an exception.
29:* What went wrong:
30:Execution failed for task ':compileJava'.
32:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/Freecam.java:60: error: cannot find symbol
44:org.gradle.api.tasks.TaskExecutionException: Execution failed for task ':compileJava'.
45:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.lambda$executeIfValid$1(ExecuteActionsTaskExecuter.java:135)
46:	at org.gradle.internal.Try$Failure.ifSuccessfulOrElse(Try.java:288)
47:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:133)
48:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:121)
49:	at org.gradle.api.internal.tasks.execution.ProblemsTaskPathTrackingTaskExecuter.execute(ProblemsTaskPathTrackingTaskExecuter.java:41)
50:	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
51:	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
52:	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
53:	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
54:	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
55:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
56:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
57:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
58:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:209)
59:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
60:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
61:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
62:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
63:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
64:	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
65:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
66:	at org.gradle.execution.plan.DefaultNodeExecutor.executeLocalTaskNode(DefaultNodeExecutor.java:55)
67:	at org.gradle.execution.plan.DefaultNodeExecutor.execute(DefaultNodeExecutor.java:34)
68:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:355)
69:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:343)
70:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.lambda$execute$0(DefaultTaskExecutionGraph.java:339)
71:	at org.gradle.internal.operations.CurrentBuildOperationRef.with(CurrentBuildOperationRef.java:84)
72:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:339)
73:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:328)
74:	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:459)
75:	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:376)
76:	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
77:	at org.gradle.internal.concurrent.AbstractManagedExecutor$1.run(AbstractManagedExecutor.java:47)
78:Caused by: org.gradle.api.internal.tasks.compile.CompilationFailedException: Compilation failed; see the compiler output below.
79:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/Freecam.java:60: error: cannot find symbol
85:	at org.gradle.api.internal.tasks.compile.JdkJavaCompiler.execute(JdkJavaCompiler.java:89)
86:	at org.gradle.api.internal.tasks.compile.JdkJavaCompiler.execute(JdkJavaCompiler.java:50)
87:	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.delegateAndHandleErrors(NormalizingJavaCompiler.java:98)
88:	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.execute(NormalizingJavaCompiler.java:52)
89:	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.execute(NormalizingJavaCompiler.java:38)
90:	at org.gradle.api.internal.tasks.compile.AnnotationProcessorDiscoveringCompiler.execute(AnnotationProcessorDiscoveringCompiler.java:52)
91:	at org.gradle.api.internal.tasks.compile.AnnotationProcessorDiscoveringCompiler.execute(AnnotationProcessorDiscoveringCompiler.java:38)
92:	at org.gradle.api.internal.tasks.compile.ModuleApplicationNameWritingCompiler.execute(ModuleApplicationNameWritingCompiler.java:46)
93:	at org.gradle.api.internal.tasks.compile.ModuleApplicationNameWritingCompiler.execute(ModuleApplicationNameWritingCompiler.java:36)
94:	at org.gradle.jvm.toolchain.internal.DefaultToolchainJavaCompiler.execute(DefaultToolchainJavaCompiler.java:57)
95:	at org.gradle.api.tasks.compile.JavaCompile.lambda$createToolchainCompiler$3(JavaCompile.java:206)
96:	at org.gradle.api.internal.tasks.compile.CleaningJavaCompiler.execute(CleaningJavaCompiler.java:53)
97:	at org.gradle.api.internal.tasks.compile.incremental.IncrementalCompilerFactory.lambda$createRebuildAllCompiler$0(IncrementalCompilerFactory.java:55)
98:	at org.gradle.api.internal.tasks.compile.incremental.SelectiveCompiler.execute(SelectiveCompiler.java:70)
99:	at org.gradle.api.internal.tasks.compile.incremental.SelectiveCompiler.execute(SelectiveCompiler.java:44)
100:	at org.gradle.api.internal.tasks.compile.incremental.IncrementalResultStoringCompiler.execute(IncrementalResultStoringCompiler.java:66)
101:	at org.gradle.api.internal.tasks.compile.incremental.IncrementalResultStoringCompiler.execute(IncrementalResultStoringCompiler.java:52)
102:	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler$1.call(CompileJavaBuildOperationReportingCompiler.java:64)
103:	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler$1.call(CompileJavaBuildOperationReportingCompiler.java:48)
104:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:209)
105:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
106:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
107:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
108:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
109:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
110:	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
111:	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler.execute(CompileJavaBuildOperationReportingCompiler.java:48)
112:	at org.gradle.api.tasks.compile.JavaCompile.performCompilation(JavaCompile.java:224)
113:	at org.gradle.api.tasks.compile.JavaCompile.performIncrementalCompilation(JavaCompile.java:165)
114:	at org.gradle.api.tasks.compile.JavaCompile.compile(JavaCompile.java:150)
115:	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
116:	at org.gradle.api.internal.project.taskfactory.IncrementalTaskAction.doExecute(IncrementalTaskAction.java:45)
117:	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
118:	at org.gradle.api.internal.project.taskfactory.IncrementalTaskAction.execute(IncrementalTaskAction.java:26)
119:	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
120:	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:252)
121:	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
122:	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
123:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
124:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
125:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
126:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
127:	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
128:	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:237)
129:	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:220)
130:	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:203)
131:	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:170)
132:	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
133:	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
134:	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
135:	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
136:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:209)
137:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
138:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
139:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
140:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
141:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
142:	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
143:	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
144:	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
145:	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:42)
146:	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:75)
147:	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
148:	at org.gradle.internal.execution.steps.PreCreateOutputParentsStep.execute(PreCreateOutputParentsStep.java:50)
149:	at org.gradle.internal.execution.steps.PreCreateOutputParentsStep.execute(PreCreateOutputParentsStep.java:28)
150:	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:68)
151:	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:38)
152:	at org.gradle.internal.execution.steps.BroadcastChangingOutputsStep.execute(BroadcastChangingOutputsStep.java:61)
153:	at org.gradle.internal.execution.steps.BroadcastChangingOutputsStep.execute(BroadcastChangingOutputsStep.java:26)
154:	at org.gradle.internal.execution.steps.CaptureOutputsAfterExecutionStep.execute(CaptureOutputsAfterExecutionStep.java:69)
155:	at org.gradle.internal.execution.steps.CaptureOutputsAfterExecutionStep.execute(CaptureOutputsAfterExecutionStep.java:46)
156:	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:39)
157:	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:28)
158:	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:189)
159:	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:75)
160:	at org.gradle.internal.Either$Right.fold(Either.java:176)
161:	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:62)
162:	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:73)
163:	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:48)
164:	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:46)
165:	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:35)
166:	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:75)
167:	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:53)
168:	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:53)
169:	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:35)
170:	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
171:	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
172:	at org.gradle.internal.execution.steps.ResolveIncrementalCachingStateStep.executeDelegate(ResolveIncrementalCachingStateStep.java:49)
173:	at org.gradle.internal.execution.steps.ResolveIncrementalCachingStateStep.executeDelegate(ResolveIncrementalCachingStateStep.java:27)
174:	at org.gradle.internal.execution.steps.AbstractResolveCachingStateStep.execute(AbstractResolveCachingStateStep.java:71)
175:	at org.gradle.internal.execution.steps.AbstractResolveCachingStateStep.execute(AbstractResolveCachingStateStep.java:39)
176:	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:64)
177:	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:35)
178:	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:62)
179:	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:40)
180:	at org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep.execute(AbstractCaptureStateBeforeExecutionStep.java:76)
181:	at org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep.execute(AbstractCaptureStateBeforeExecutionStep.java:45)
182:	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.executeWithNonEmptySources(AbstractSkipEmptyWorkStep.java:136)
183:	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.execute(AbstractSkipEmptyWorkStep.java:66)
184:	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.execute(AbstractSkipEmptyWorkStep.java:38)
185:	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
186:	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
187:	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
188:	at org.gradle.internal.execution.steps.HandleStaleOutputsStep.execute(HandleStaleOutputsStep.java:75)
189:	at org.gradle.internal.execution.steps.HandleStaleOutputsStep.execute(HandleStaleOutputsStep.java:41)
190:	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.lambda$execute$0(AssignMutableWorkspaceStep.java:35)
191:	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:297)
192:	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.execute(AssignMutableWorkspaceStep.java:31)
193:	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.execute(AssignMutableWorkspaceStep.java:22)
194:	at org.gradle.internal.execution.steps.ChoosePipelineStep.execute(ChoosePipelineStep.java:40)
195:	at org.gradle.internal.execution.steps.ChoosePipelineStep.execute(ChoosePipelineStep.java:23)
196:	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.lambda$execute$2(ExecuteWorkBuildOperationFiringStep.java:67)
197:	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.execute(ExecuteWorkBuildOperationFiringStep.java:67)
198:	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.execute(ExecuteWorkBuildOperationFiringStep.java:39)
199:	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:46)
200:	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:34)
201:	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:44)
202:	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:31)
203:	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
204:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:132)
214:BUILD FAILED in 35s
```

## Gradle output (tail)

```
	at org.gradle.api.internal.tasks.compile.CleaningJavaCompiler.execute(CleaningJavaCompiler.java:53)
	at org.gradle.api.internal.tasks.compile.incremental.IncrementalCompilerFactory.lambda$createRebuildAllCompiler$0(IncrementalCompilerFactory.java:55)
	at org.gradle.api.internal.tasks.compile.incremental.SelectiveCompiler.execute(SelectiveCompiler.java:70)
	at org.gradle.api.internal.tasks.compile.incremental.SelectiveCompiler.execute(SelectiveCompiler.java:44)
	at org.gradle.api.internal.tasks.compile.incremental.IncrementalResultStoringCompiler.execute(IncrementalResultStoringCompiler.java:66)
	at org.gradle.api.internal.tasks.compile.incremental.IncrementalResultStoringCompiler.execute(IncrementalResultStoringCompiler.java:52)
	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler$1.call(CompileJavaBuildOperationReportingCompiler.java:64)
	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler$1.call(CompileJavaBuildOperationReportingCompiler.java:48)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:209)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler.execute(CompileJavaBuildOperationReportingCompiler.java:48)
	at org.gradle.api.tasks.compile.JavaCompile.performCompilation(JavaCompile.java:224)
	at org.gradle.api.tasks.compile.JavaCompile.performIncrementalCompilation(JavaCompile.java:165)
	at org.gradle.api.tasks.compile.JavaCompile.compile(JavaCompile.java:150)
	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
	at org.gradle.api.internal.project.taskfactory.IncrementalTaskAction.doExecute(IncrementalTaskAction.java:45)
	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
	at org.gradle.api.internal.project.taskfactory.IncrementalTaskAction.execute(IncrementalTaskAction.java:26)
	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:252)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:237)
	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:220)
	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:203)
	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:170)
	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:209)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:42)
	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:75)
	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
	at org.gradle.internal.execution.steps.PreCreateOutputParentsStep.execute(PreCreateOutputParentsStep.java:50)
	at org.gradle.internal.execution.steps.PreCreateOutputParentsStep.execute(PreCreateOutputParentsStep.java:28)
	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:68)
	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:38)
	at org.gradle.internal.execution.steps.BroadcastChangingOutputsStep.execute(BroadcastChangingOutputsStep.java:61)
	at org.gradle.internal.execution.steps.BroadcastChangingOutputsStep.execute(BroadcastChangingOutputsStep.java:26)
	at org.gradle.internal.execution.steps.CaptureOutputsAfterExecutionStep.execute(CaptureOutputsAfterExecutionStep.java:69)
	at org.gradle.internal.execution.steps.CaptureOutputsAfterExecutionStep.execute(CaptureOutputsAfterExecutionStep.java:46)
	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:39)
	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:28)
	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:189)
	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:75)
	at org.gradle.internal.Either$Right.fold(Either.java:176)
	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:62)
	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:73)
	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:48)
	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:46)
	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:35)
	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:75)
	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:53)
	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:53)
	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:35)
	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
	at org.gradle.internal.execution.steps.ResolveIncrementalCachingStateStep.executeDelegate(ResolveIncrementalCachingStateStep.java:49)
	at org.gradle.internal.execution.steps.ResolveIncrementalCachingStateStep.executeDelegate(ResolveIncrementalCachingStateStep.java:27)
	at org.gradle.internal.execution.steps.AbstractResolveCachingStateStep.execute(AbstractResolveCachingStateStep.java:71)
	at org.gradle.internal.execution.steps.AbstractResolveCachingStateStep.execute(AbstractResolveCachingStateStep.java:39)
	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:64)
	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:35)
	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:62)
	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:40)
	at org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep.execute(AbstractCaptureStateBeforeExecutionStep.java:76)
	at org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep.execute(AbstractCaptureStateBeforeExecutionStep.java:45)
	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.executeWithNonEmptySources(AbstractSkipEmptyWorkStep.java:136)
	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.execute(AbstractSkipEmptyWorkStep.java:66)
	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.execute(AbstractSkipEmptyWorkStep.java:38)
	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
	at org.gradle.internal.execution.steps.HandleStaleOutputsStep.execute(HandleStaleOutputsStep.java:75)
	at org.gradle.internal.execution.steps.HandleStaleOutputsStep.execute(HandleStaleOutputsStep.java:41)
	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.lambda$execute$0(AssignMutableWorkspaceStep.java:35)
	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:297)
	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.execute(AssignMutableWorkspaceStep.java:31)
	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.execute(AssignMutableWorkspaceStep.java:22)
	at org.gradle.internal.execution.steps.ChoosePipelineStep.execute(ChoosePipelineStep.java:40)
	at org.gradle.internal.execution.steps.ChoosePipelineStep.execute(ChoosePipelineStep.java:23)
	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.lambda$execute$2(ExecuteWorkBuildOperationFiringStep.java:67)
	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.execute(ExecuteWorkBuildOperationFiringStep.java:67)
	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.execute(ExecuteWorkBuildOperationFiringStep.java:39)
	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:46)
	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:34)
	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:44)
	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:31)
	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:132)
	... 30 more


Deprecated Gradle features were used in this build, making it incompatible with Gradle 10.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/9.2.1/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.

BUILD FAILED in 35s
1 actionable task: 1 executed
```
