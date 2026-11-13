# Last build

Run: https://github.com/sysnaxscripts/F1Client/actions/runs/43485266924
Commit under test: fa2d5f362917a974d317bb74a5494d11bae45908
Generated on: 2026-11-13T18:43:49Z

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

signatures of the first 23 dump matches:

=== net.fabricmc.fabric.mixin.client.rendering.LevelRendererMixin   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar] ===
Compiled from "LevelRendererMixin.java"
public abstract class net.fabricmc.fabric.mixin.client.rendering.LevelRendererMixin {
  private net.minecraft.client.Minecraft minecraft;
  private net.minecraft.client.renderer.RenderBuffers renderBuffers;
  private net.minecraft.client.renderer.state.LevelRenderState levelRenderState;
  private net.minecraft.client.multiplayer.ClientLevel level;
  private net.minecraft.client.renderer.SubmitNodeStorage submitNodeStorage;
  private final net.fabricmc.fabric.impl.client.rendering.world.WorldRenderContextImpl renderContext;
  private final net.fabricmc.fabric.impl.client.rendering.world.WorldExtractionContextImpl extractionContext;
  public net.fabricmc.fabric.mixin.client.rendering.LevelRendererMixin();
  private void beforeRender(com.mojang.blaze3d.resource.GraphicsResourceAllocator, net.minecraft.client.DeltaTracker, boolean, net.minecraft.client.Camera, org.joml.Matrix4f, org.joml.Matrix4f, org.joml.Matrix4f, com.mojang.blaze3d.buffers.GpuBufferSlice, org.joml.Vector4f, boolean, org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private net.minecraft.client.renderer.culling.Frustum onSetupFrustum(net.minecraft.client.renderer.culling.Frustum);
  private void afterBlockOutlineExtraction(net.minecraft.client.Camera, net.minecraft.client.renderer.state.LevelRenderState, org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void onWorldBorderExtraction(net.minecraft.client.renderer.WorldBorderRenderer, net.minecraft.world.level.border.WorldBorder, float, net.minecraft.world.phys.Vec3, double, net.minecraft.client.renderer.state.WorldBorderRenderState, com.llamalad7.mixinextras.injector.wrapoperation.Operation<java.lang.Void>);
  private net.minecraft.client.renderer.chunk.ChunkSectionsToRender onRenderBlockLayers(net.minecraft.client.renderer.chunk.ChunkSectionsToRender);
  private void beforeTerrainRender(org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private com.mojang.blaze3d.vertex.PoseStack onCreateMatrixStack(com.mojang.blaze3d.vertex.PoseStack);
  private void beforeEntitySubmission(org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void afterEntityRender(net.minecraft.client.renderer.OutlineBufferSource, com.llamalad7.mixinextras.injector.wrapoperation.Operation<java.lang.Void>);
  private void beforeDebugRender(org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void beforeTranslucentRender(org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void beforeDrawBlockOutline(net.minecraft.client.renderer.MultiBufferSource$BufferSource, com.mojang.blaze3d.vertex.PoseStack, boolean, net.minecraft.client.renderer.state.LevelRenderState, org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void endMainRender(org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void onReload(org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
}

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

=== net.minecraft.client.renderer.LevelRenderer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "LevelRenderer.java"
public class net.minecraft.client.renderer.LevelRenderer implements net.minecraft.server.packs.resources.ResourceManagerReloadListener,java.lang.AutoCloseable {
  private static final net.minecraft.resources.Identifier TRANSPARENCY_POST_CHAIN_ID;
  private static final net.minecraft.resources.Identifier ENTITY_OUTLINE_POST_CHAIN_ID;
  public static final int SECTION_SIZE;
  public static final int HALF_SECTION_SIZE;
  public static final int NEARBY_SECTION_DISTANCE_IN_BLOCKS;
  private static final int MINIMUM_TRANSPARENT_SORT_COUNT;
  private static final float CHUNK_VISIBILITY_THRESHOLD;
  private final net.minecraft.client.Minecraft minecraft;
  private final net.minecraft.client.renderer.entity.EntityRenderDispatcher entityRenderDispatcher;
  private final net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher blockEntityRenderDispatcher;
  private final net.minecraft.client.renderer.RenderBuffers renderBuffers;
  private net.minecraft.client.renderer.SkyRenderer skyRenderer;
  private final net.minecraft.client.renderer.CloudRenderer cloudRenderer;
  private final net.minecraft.client.renderer.WorldBorderRenderer worldBorderRenderer;
  private final net.minecraft.client.renderer.WeatherEffectRenderer weatherEffectRenderer;
  private final net.minecraft.client.renderer.state.ParticlesRenderState particlesRenderState;
  public final net.minecraft.client.renderer.debug.DebugRenderer debugRenderer;
  public final net.minecraft.client.renderer.debug.GameTestBlockHighlightRenderer gameTestBlockHighlightRenderer;
  private net.minecraft.client.multiplayer.ClientLevel level;
  private final net.minecraft.client.renderer.SectionOcclusionGraph sectionOcclusionGraph;
  private final it.unimi.dsi.fastutil.objects.ObjectArrayList<net.minecraft.client.renderer.chunk.SectionRenderDispatcher$RenderSection> visibleSections;
  private final it.unimi.dsi.fastutil.objects.ObjectArrayList<net.minecraft.client.renderer.chunk.SectionRenderDispatcher$RenderSection> nearbyVisibleSections;
  private net.minecraft.client.renderer.ViewArea viewArea;
  private int ticks;
  private final it.unimi.dsi.fastutil.ints.Int2ObjectMap<net.minecraft.server.level.BlockDestructionProgress> destroyingBlocks;
  private final it.unimi.dsi.fastutil.longs.Long2ObjectMap<java.util.SortedSet<net.minecraft.server.level.BlockDestructionProgress>> destructionProgress;
  private com.mojang.blaze3d.pipeline.RenderTarget entityOutlineTarget;
  private final net.minecraft.client.renderer.LevelTargetBundle targets;
  private int lastCameraSectionX;
  private int lastCameraSectionY;
  private int lastCameraSectionZ;
  private double prevCamX;
  private double prevCamY;
  private double prevCamZ;
  private double prevCamRotX;
  private double prevCamRotY;
  private net.minecraft.client.renderer.chunk.SectionRenderDispatcher sectionRenderDispatcher;
  private int lastViewDistance;
  private boolean captureFrustum;
  private net.minecraft.client.renderer.culling.Frustum capturedFrustum;
  private net.minecraft.core.BlockPos lastTranslucentSortBlockPos;
  private int translucencyResortIterationIndex;
  private final net.minecraft.client.renderer.state.LevelRenderState levelRenderState;
  private final net.minecraft.client.renderer.SubmitNodeStorage submitNodeStorage;
  private final net.minecraft.client.renderer.feature.FeatureRenderDispatcher featureRenderDispatcher;
  private com.mojang.blaze3d.textures.GpuSampler chunkLayerSampler;
  private final net.minecraft.gizmos.SimpleGizmoCollector collectedGizmos;
  private net.minecraft.client.renderer.LevelRenderer$FinalizedGizmos finalizedGizmos;
  public net.minecraft.client.renderer.LevelRenderer(net.minecraft.client.Minecraft, net.minecraft.client.renderer.entity.EntityRenderDispatcher, net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher, net.minecraft.client.renderer.RenderBuffers, net.minecraft.client.renderer.state.LevelRenderState, net.minecraft.client.renderer.feature.FeatureRenderDispatcher);
  public void close();
  public void onResourceManagerReload(net.minecraft.server.packs.resources.ResourceManager);
  public void initOutline();
  private net.minecraft.client.renderer.PostChain getTransparencyChain();
  public void doEntityOutline();
  protected boolean shouldShowEntityOutlines();
  public void setLevel(net.minecraft.client.multiplayer.ClientLevel);
  private void clearVisibleSections();
  public void allChanged();
  public void resize(int, int);
  public java.lang.String getSectionStatistics();
  public net.minecraft.client.renderer.chunk.SectionRenderDispatcher getSectionRenderDispatcher();
  public double getTotalSections();
  public double getLastViewDistance();
  public int countRenderedSections();
  public void resetSampler();
  public java.lang.String getEntityStatistics();
  private void cullTerrain(net.minecraft.client.Camera, net.minecraft.client.renderer.culling.Frustum, boolean);
  public static net.minecraft.client.renderer.culling.Frustum offsetFrustum(net.minecraft.client.renderer.culling.Frustum);
  private void applyFrustum(net.minecraft.client.renderer.culling.Frustum);
  public void addRecentlyCompiledSection(net.minecraft.client.renderer.chunk.SectionRenderDispatcher$RenderSection);
  private net.minecraft.client.renderer.culling.Frustum prepareCullFrustum(org.joml.Matrix4f, org.joml.Matrix4f, net.minecraft.world.phys.Vec3);
  public void renderLevel(com.mojang.blaze3d.resource.GraphicsResourceAllocator, net.minecraft.client.DeltaTracker, boolean, net.minecraft.client.Camera, org.joml.Matrix4f, org.joml.Matrix4f, org.joml.Matrix4f, com.mojang.blaze3d.buffers.GpuBufferSlice, org.joml.Vector4f, boolean);
  private void addMainPass(com.mojang.blaze3d.framegraph.FrameGraphBuilder, net.minecraft.client.renderer.culling.Frustum, org.joml.Matrix4f, com.mojang.blaze3d.buffers.GpuBufferSlice, boolean, net.minecraft.client.renderer.state.LevelRenderState, net.minecraft.client.DeltaTracker, net.minecraft.util.profiling.ProfilerFiller);
  private void addParticlesPass(com.mojang.blaze3d.framegraph.FrameGraphBuilder, com.mojang.blaze3d.buffers.GpuBufferSlice);
  private void addCloudsPass(com.mojang.blaze3d.framegraph.FrameGraphBuilder, net.minecraft.client.CloudStatus, net.minecraft.world.phys.Vec3, long, float, int, float);
  private void addWeatherPass(com.mojang.blaze3d.framegraph.FrameGraphBuilder, com.mojang.blaze3d.buffers.GpuBufferSlice);
  private void addLateDebugPass(com.mojang.blaze3d.framegraph.FrameGraphBuilder, net.minecraft.client.renderer.state.CameraRenderState, com.mojang.blaze3d.buffers.GpuBufferSlice, org.joml.Matrix4f);
  private void extractVisibleEntities(net.minecraft.client.Camera, net.minecraft.client.renderer.culling.Frustum, net.minecraft.client.DeltaTracker, net.minecraft.client.renderer.state.LevelRenderState);
  private void submitEntities(com.mojang.blaze3d.vertex.PoseStack, net.minecraft.client.renderer.state.LevelRenderState, net.minecraft.client.renderer.SubmitNodeCollector);
  private void extractVisibleBlockEntities(net.minecraft.client.Camera, float, net.minecraft.client.renderer.state.LevelRenderState);
  private void submitBlockEntities(com.mojang.blaze3d.vertex.PoseStack, net.minecraft.client.renderer.state.LevelRenderState, net.minecraft.client.renderer.SubmitNodeStorage);
  private void extractBlockDestroyAnimation(net.minecraft.client.Camera, net.minecraft.client.renderer.state.LevelRenderState);
  private void renderBlockDestroyAnimation(com.mojang.blaze3d.vertex.PoseStack, net.minecraft.client.renderer.MultiBufferSource$BufferSource, net.minecraft.client.renderer.state.LevelRenderState);
  private void extractBlockOutline(net.minecraft.client.Camera, net.minecraft.client.renderer.state.LevelRenderState);
  private void renderBlockOutline(net.minecraft.client.renderer.MultiBufferSource$BufferSource, com.mojang.blaze3d.vertex.PoseStack, boolean, net.minecraft.client.renderer.state.LevelRenderState);
  private void checkPoseStack(com.mojang.blaze3d.vertex.PoseStack);
  private net.minecraft.client.renderer.entity.state.EntityRenderState extractEntity(net.minecraft.world.entity.Entity, float);
  private void scheduleTranslucentSectionResort(net.minecraft.world.phys.Vec3);
  private void scheduleResort(net.minecraft.client.renderer.chunk.SectionRenderDispatcher$RenderSection, net.minecraft.client.renderer.chunk.TranslucencyPointOfView, net.minecraft.world.phys.Vec3, boolean, boolean);
  private net.minecraft.client.renderer.chunk.ChunkSectionsToRender prepareChunkRenders(org.joml.Matrix4fc, double, double, double);
  public void endFrame();
  public void captureFrustum();
  public void killFrustum();
  public void tick(net.minecraft.client.Camera);
  private void removeBlockBreakingProgress();
  private void removeProgress(net.minecraft.server.level.BlockDestructionProgress);
  private void addSkyPass(com.mojang.blaze3d.framegraph.FrameGraphBuilder, net.minecraft.client.Camera, com.mojang.blaze3d.buffers.GpuBufferSlice);
  private boolean doesMobEffectBlockSky(net.minecraft.client.Camera);
  private void compileSections(net.minecraft.client.Camera);
  private void renderHitOutline(com.mojang.blaze3d.vertex.PoseStack, com.mojang.blaze3d.vertex.VertexConsumer, double, double, double, net.minecraft.client.renderer.state.BlockOutlineRenderState, int, float);
  public void blockChanged(net.minecraft.world.level.BlockGetter, net.minecraft.core.BlockPos, net.minecraft.world.level.block.state.BlockState, net.minecraft.world.level.block.state.BlockState, int);
  private void setBlockDirty(net.minecraft.core.BlockPos, boolean);
  public void setBlocksDirty(int, int, int, int, int, int);
  public void setBlockDirty(net.minecraft.core.BlockPos, net.minecraft.world.level.block.state.BlockState, net.minecraft.world.level.block.state.BlockState);
  public void setSectionDirtyWithNeighbors(int, int, int);
  public void setSectionRangeDirty(int, int, int, int, int, int);
  public void setSectionDirty(int, int, int);
  private void setSectionDirty(int, int, int, boolean);
  public void onSectionBecomingNonEmpty(long);
  public void destroyBlockProgress(int, net.minecraft.core.BlockPos, int);
  public boolean hasRenderedAllSections();
  public void onChunkReadyToRender(net.minecraft.world.level.ChunkPos);
  public void needsUpdate();
  public static int getLightColor(net.minecraft.world.level.BlockAndTintGetter, net.minecraft.core.BlockPos);
  public static int getLightColor(net.minecraft.client.renderer.LevelRenderer$BrightnessGetter, net.minecraft.world.level.BlockAndTintGetter, net.minecraft.world.level.block.state.BlockState, net.minecraft.core.BlockPos);
  public boolean isSectionCompiledAndVisible(net.minecraft.core.BlockPos);
  public com.mojang.blaze3d.pipeline.RenderTarget entityOutlineTarget();
  public com.mojang.blaze3d.pipeline.RenderTarget getTranslucentTarget();
  public com.mojang.blaze3d.pipeline.RenderTarget getItemEntityTarget();
  public com.mojang.blaze3d.pipeline.RenderTarget getParticlesTarget();
  public com.mojang.blaze3d.pipeline.RenderTarget getWeatherTarget();
  public com.mojang.blaze3d.pipeline.RenderTarget getCloudsTarget();
  public it.unimi.dsi.fastutil.objects.ObjectArrayList<net.minecraft.client.renderer.chunk.SectionRenderDispatcher$RenderSection> getVisibleSections();
  public net.minecraft.client.renderer.SectionOcclusionGraph getSectionOcclusionGraph();
  public net.minecraft.client.renderer.culling.Frustum getCapturedFrustum();
  public net.minecraft.client.renderer.CloudRenderer getCloudRenderer();
  public net.minecraft.gizmos.Gizmos$TemporaryCollection collectPerFrameGizmos();
  private void finalizeGizmoCollection();
  private static java.util.SortedSet method_22988(long);
  private static void method_62215(com.mojang.blaze3d.buffers.GpuBufferSlice, net.minecraft.client.renderer.state.SkyRenderState, net.minecraft.client.renderer.SkyRenderer);
  private static void method_72156(int, com.mojang.blaze3d.buffers.GpuBufferSlice[], com.mojang.blaze3d.systems.RenderPass$UniformUploader);
  private void method_75413(com.mojang.blaze3d.buffers.GpuBufferSlice, com.mojang.blaze3d.resource.ResourceHandle, net.minecraft.client.renderer.state.CameraRenderState, org.joml.Matrix4f);
  private void method_62216(com.mojang.blaze3d.buffers.GpuBufferSlice, int, float);
  private void method_62205(int, net.minecraft.client.CloudStatus, float, net.minecraft.world.phys.Vec3, long, float);
  private void method_62213(com.mojang.blaze3d.buffers.GpuBufferSlice, com.mojang.blaze3d.resource.ResourceHandle, com.mojang.blaze3d.resource.ResourceHandle);
  private void method_62214(com.mojang.blaze3d.buffers.GpuBufferSlice, net.minecraft.client.renderer.state.LevelRenderState, net.minecraft.util.profiling.ProfilerFiller, org.joml.Matrix4f, com.mojang.blaze3d.resource.ResourceHandle, com.mojang.blaze3d.resource.ResourceHandle, boolean, com.mojang.blaze3d.resource.ResourceHandle, com.mojang.blaze3d.resource.ResourceHandle);
  private void method_62218(org.joml.Vector4f);
  static {};
}

=== net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "DrawableGizmoPrimitives.java"
public class net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives implements net.minecraft.gizmos.GizmoPrimitives {
  private final net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives$Group opaque;
  private final net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives$Group translucent;
  private boolean isEmpty;
  public net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives();
  private net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives$Group getGroup(int);
  public void addPoint(net.minecraft.world.phys.Vec3, int, float);
  public void addLine(net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, int, float);
  public void addTriangleFan(net.minecraft.world.phys.Vec3[], int);
  public void addQuad(net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, int);
  public void addText(net.minecraft.world.phys.Vec3, java.lang.String, net.minecraft.gizmos.TextGizmo$Style);
  public void render(com.mojang.blaze3d.vertex.PoseStack, net.minecraft.client.renderer.MultiBufferSource, net.minecraft.client.renderer.state.CameraRenderState, org.joml.Matrix4f);
  public boolean isEmpty();
}

=== net.minecraft.client.renderer.gizmos.package-info   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "package-info.java"
interface net.minecraft.client.renderer.gizmos.package-info {
}

=== net.minecraft.gizmos.ArrowGizmo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "ArrowGizmo.java"
public final class net.minecraft.gizmos.ArrowGizmo extends java.lang.Record implements net.minecraft.gizmos.Gizmo {
  private final net.minecraft.world.phys.Vec3 start;
  private final net.minecraft.world.phys.Vec3 end;
  private final int color;
  private final float width;
  public static final float DEFAULT_WIDTH;
  public net.minecraft.gizmos.ArrowGizmo(net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, int, float);
  public void emit(net.minecraft.gizmos.GizmoPrimitives, float);
  public final java.lang.String toString();
  public final int hashCode();
  public final boolean equals(java.lang.Object);
  public net.minecraft.world.phys.Vec3 start();
  public net.minecraft.world.phys.Vec3 end();
  public int color();
  public float width();
}

=== net.minecraft.gizmos.CircleGizmo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "CircleGizmo.java"
public final class net.minecraft.gizmos.CircleGizmo extends java.lang.Record implements net.minecraft.gizmos.Gizmo {
  private final net.minecraft.world.phys.Vec3 pos;
  private final float radius;
  private final net.minecraft.gizmos.GizmoStyle style;
  private static final int CIRCLE_VERTICES;
  private static final float SEGMENT_SIZE_RADIANS;
  public net.minecraft.gizmos.CircleGizmo(net.minecraft.world.phys.Vec3, float, net.minecraft.gizmos.GizmoStyle);
  public void emit(net.minecraft.gizmos.GizmoPrimitives, float);
  public final java.lang.String toString();
  public final int hashCode();
  public final boolean equals(java.lang.Object);
  public net.minecraft.world.phys.Vec3 pos();
  public float radius();
  public net.minecraft.gizmos.GizmoStyle style();
}

=== net.minecraft.gizmos.CuboidGizmo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "CuboidGizmo.java"
public final class net.minecraft.gizmos.CuboidGizmo extends java.lang.Record implements net.minecraft.gizmos.Gizmo {
  private final net.minecraft.world.phys.AABB aabb;
  private final net.minecraft.gizmos.GizmoStyle style;
  private final boolean coloredCornerStroke;
  public net.minecraft.gizmos.CuboidGizmo(net.minecraft.world.phys.AABB, net.minecraft.gizmos.GizmoStyle, boolean);
  public void emit(net.minecraft.gizmos.GizmoPrimitives, float);
  public final java.lang.String toString();
  public final int hashCode();
  public final boolean equals(java.lang.Object);
  public net.minecraft.world.phys.AABB aabb();
  public net.minecraft.gizmos.GizmoStyle style();
  public boolean coloredCornerStroke();
}

=== net.minecraft.gizmos.Gizmo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "Gizmo.java"
public interface net.minecraft.gizmos.Gizmo {
  public abstract void emit(net.minecraft.gizmos.GizmoPrimitives, float);
}

=== net.minecraft.gizmos.GizmoCollector   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "GizmoCollector.java"
public interface net.minecraft.gizmos.GizmoCollector {
  public static final net.minecraft.gizmos.GizmoProperties IGNORED;
  public static final net.minecraft.gizmos.GizmoCollector NOOP;
  public abstract net.minecraft.gizmos.GizmoProperties add(net.minecraft.gizmos.Gizmo);
  private static net.minecraft.gizmos.GizmoProperties method_76038(net.minecraft.gizmos.Gizmo);
  static {};
}

=== net.minecraft.gizmos.GizmoPrimitives   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "GizmoPrimitives.java"
public interface net.minecraft.gizmos.GizmoPrimitives {
  public abstract void addPoint(net.minecraft.world.phys.Vec3, int, float);
  public abstract void addLine(net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, int, float);
  public abstract void addTriangleFan(net.minecraft.world.phys.Vec3[], int);
  public abstract void addQuad(net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, int);
  public abstract void addText(net.minecraft.world.phys.Vec3, java.lang.String, net.minecraft.gizmos.TextGizmo$Style);
}

=== net.minecraft.gizmos.GizmoProperties   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "GizmoProperties.java"
public interface net.minecraft.gizmos.GizmoProperties {
  public abstract net.minecraft.gizmos.GizmoProperties setAlwaysOnTop();
  public abstract net.minecraft.gizmos.GizmoProperties persistForMillis(int);
  public abstract net.minecraft.gizmos.GizmoProperties fadeOut();
}

=== net.minecraft.gizmos.GizmoStyle   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "GizmoStyle.java"
public final class net.minecraft.gizmos.GizmoStyle extends java.lang.Record {
  private final int stroke;
  private final float strokeWidth;
  private final int fill;
  private static final float DEFAULT_WIDTH;
  public net.minecraft.gizmos.GizmoStyle(int, float, int);
  public static net.minecraft.gizmos.GizmoStyle stroke(int);
  public static net.minecraft.gizmos.GizmoStyle stroke(int, float);
  public static net.minecraft.gizmos.GizmoStyle fill(int);
  public static net.minecraft.gizmos.GizmoStyle strokeAndFill(int, float, int);
  public boolean hasFill();
  public boolean hasStroke();
  public int multipliedStroke(float);
  public int multipliedFill(float);
  public final java.lang.String toString();
  public final int hashCode();
  public final boolean equals(java.lang.Object);
  public int stroke();
  public float strokeWidth();
  public int fill();
}

=== net.minecraft.gizmos.Gizmos   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "Gizmos.java"
public class net.minecraft.gizmos.Gizmos {
  static final java.lang.ThreadLocal<net.minecraft.gizmos.GizmoCollector> collector;
  private net.minecraft.gizmos.Gizmos();
  public static net.minecraft.gizmos.Gizmos$TemporaryCollection withCollector(net.minecraft.gizmos.GizmoCollector);
  public static net.minecraft.gizmos.GizmoProperties addGizmo(net.minecraft.gizmos.Gizmo);
  public static net.minecraft.gizmos.GizmoProperties cuboid(net.minecraft.world.phys.AABB, net.minecraft.gizmos.GizmoStyle);
  public static net.minecraft.gizmos.GizmoProperties cuboid(net.minecraft.world.phys.AABB, net.minecraft.gizmos.GizmoStyle, boolean);
  public static net.minecraft.gizmos.GizmoProperties cuboid(net.minecraft.core.BlockPos, net.minecraft.gizmos.GizmoStyle);
  public static net.minecraft.gizmos.GizmoProperties cuboid(net.minecraft.core.BlockPos, float, net.minecraft.gizmos.GizmoStyle);
  public static net.minecraft.gizmos.GizmoProperties circle(net.minecraft.world.phys.Vec3, float, net.minecraft.gizmos.GizmoStyle);
  public static net.minecraft.gizmos.GizmoProperties line(net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, int);
  public static net.minecraft.gizmos.GizmoProperties line(net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, int, float);
  public static net.minecraft.gizmos.GizmoProperties arrow(net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, int);
  public static net.minecraft.gizmos.GizmoProperties arrow(net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, int, float);
  public static net.minecraft.gizmos.GizmoProperties rect(net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, net.minecraft.core.Direction, net.minecraft.gizmos.GizmoStyle);
  public static net.minecraft.gizmos.GizmoProperties rect(net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, net.minecraft.gizmos.GizmoStyle);
  public static net.minecraft.gizmos.GizmoProperties point(net.minecraft.world.phys.Vec3, int, float);
  public static net.minecraft.gizmos.GizmoProperties billboardTextOverBlock(java.lang.String, net.minecraft.core.BlockPos, int, int, float);
  public static net.minecraft.gizmos.GizmoProperties billboardTextOverMob(net.minecraft.world.entity.Entity, int, java.lang.String, int, float);
  public static net.minecraft.gizmos.GizmoProperties billboardText(java.lang.String, net.minecraft.world.phys.Vec3, net.minecraft.gizmos.TextGizmo$Style);
  static {};
}

=== net.minecraft.gizmos.LineGizmo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "LineGizmo.java"
public final class net.minecraft.gizmos.LineGizmo extends java.lang.Record implements net.minecraft.gizmos.Gizmo {
  private final net.minecraft.world.phys.Vec3 start;
  private final net.minecraft.world.phys.Vec3 end;
  private final int color;
  private final float width;
  public static final float DEFAULT_WIDTH;
  public net.minecraft.gizmos.LineGizmo(net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, int, float);
  public void emit(net.minecraft.gizmos.GizmoPrimitives, float);
  public final java.lang.String toString();
  public final int hashCode();
  public final boolean equals(java.lang.Object);
  public net.minecraft.world.phys.Vec3 start();
  public net.minecraft.world.phys.Vec3 end();
  public int color();
  public float width();
}

=== net.minecraft.gizmos.PointGizmo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "PointGizmo.java"
public final class net.minecraft.gizmos.PointGizmo extends java.lang.Record implements net.minecraft.gizmos.Gizmo {
  private final net.minecraft.world.phys.Vec3 pos;
  private final int color;
  private final float size;
  public net.minecraft.gizmos.PointGizmo(net.minecraft.world.phys.Vec3, int, float);
  public void emit(net.minecraft.gizmos.GizmoPrimitives, float);
  public final java.lang.String toString();
  public final int hashCode();
  public final boolean equals(java.lang.Object);
  public net.minecraft.world.phys.Vec3 pos();
  public int color();
  public float size();
}

=== net.minecraft.gizmos.RectGizmo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "RectGizmo.java"
public final class net.minecraft.gizmos.RectGizmo extends java.lang.Record implements net.minecraft.gizmos.Gizmo {
  private final net.minecraft.world.phys.Vec3 a;
  private final net.minecraft.world.phys.Vec3 b;
  private final net.minecraft.world.phys.Vec3 c;
  private final net.minecraft.world.phys.Vec3 d;
  private final net.minecraft.gizmos.GizmoStyle style;
  public net.minecraft.gizmos.RectGizmo(net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, net.minecraft.gizmos.GizmoStyle);
  public static net.minecraft.gizmos.RectGizmo fromCuboidFace(net.minecraft.world.phys.Vec3, net.minecraft.world.phys.Vec3, net.minecraft.core.Direction, net.minecraft.gizmos.GizmoStyle);
  public void emit(net.minecraft.gizmos.GizmoPrimitives, float);
  public final java.lang.String toString();
  public final int hashCode();
  public final boolean equals(java.lang.Object);
  public net.minecraft.world.phys.Vec3 a();
  public net.minecraft.world.phys.Vec3 b();
  public net.minecraft.world.phys.Vec3 c();
  public net.minecraft.world.phys.Vec3 d();
  public net.minecraft.gizmos.GizmoStyle style();
}

=== net.minecraft.gizmos.SimpleGizmoCollector   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "SimpleGizmoCollector.java"
public class net.minecraft.gizmos.SimpleGizmoCollector implements net.minecraft.gizmos.GizmoCollector {
  private final java.util.List<net.minecraft.gizmos.SimpleGizmoCollector$GizmoInstance> gizmos;
  private final java.util.List<net.minecraft.gizmos.SimpleGizmoCollector$GizmoInstance> temporaryGizmos;
  public net.minecraft.gizmos.SimpleGizmoCollector();
  public net.minecraft.gizmos.GizmoProperties add(net.minecraft.gizmos.Gizmo);
  public java.util.List<net.minecraft.gizmos.SimpleGizmoCollector$GizmoInstance> drainGizmos();
  public java.util.List<net.minecraft.gizmos.SimpleGizmoCollector$GizmoInstance> getGizmos();
  public void addTemporaryGizmos(java.util.Collection<net.minecraft.gizmos.SimpleGizmoCollector$GizmoInstance>);
  private static boolean method_75855(long, net.minecraft.gizmos.SimpleGizmoCollector$GizmoInstance);
}

=== net.minecraft.gizmos.TextGizmo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "TextGizmo.java"
public final class net.minecraft.gizmos.TextGizmo extends java.lang.Record implements net.minecraft.gizmos.Gizmo {
  private final net.minecraft.world.phys.Vec3 pos;
  private final java.lang.String text;
  private final net.minecraft.gizmos.TextGizmo$Style style;
  public net.minecraft.gizmos.TextGizmo(net.minecraft.world.phys.Vec3, java.lang.String, net.minecraft.gizmos.TextGizmo$Style);
  public void emit(net.minecraft.gizmos.GizmoPrimitives, float);
  public final java.lang.String toString();
  public final int hashCode();
  public final boolean equals(java.lang.Object);
  public net.minecraft.world.phys.Vec3 pos();
  public java.lang.String text();
  public net.minecraft.gizmos.TextGizmo$Style style();
}

=== net.minecraft.gizmos.package-info   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "package-info.java"
interface net.minecraft.gizmos.package-info {
}

=== net.minecraft.world.entity.vehicle.minecart.AbstractMinecart   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "AbstractMinecart.java"
public abstract class net.minecraft.world.entity.vehicle.minecart.AbstractMinecart extends net.minecraft.world.entity.vehicle.VehicleEntity {
  private static final net.minecraft.world.phys.Vec3 LOWERED_PASSENGER_ATTACHMENT;
  private static final net.minecraft.network.syncher.EntityDataAccessor<java.util.Optional<net.minecraft.world.level.block.state.BlockState>> DATA_ID_CUSTOM_DISPLAY_BLOCK;
  private static final net.minecraft.network.syncher.EntityDataAccessor<java.lang.Integer> DATA_ID_DISPLAY_OFFSET;
  private static final com.google.common.collect.ImmutableMap<net.minecraft.world.entity.Pose, com.google.common.collect.ImmutableList<java.lang.Integer>> POSE_DISMOUNT_HEIGHTS;
  protected static final float WATER_SLOWDOWN_FACTOR;
  private static final boolean DEFAULT_FLIPPED_ROTATION;
  private boolean onRails;
  private boolean flipped;
  private final net.minecraft.world.entity.vehicle.minecart.MinecartBehavior behavior;
  private static final java.util.Map<net.minecraft.world.level.block.state.properties.RailShape, com.mojang.datafixers.util.Pair<net.minecraft.core.Vec3i, net.minecraft.core.Vec3i>> EXITS;
  protected net.minecraft.world.entity.vehicle.minecart.AbstractMinecart(net.minecraft.world.entity.EntityType<?>, net.minecraft.world.level.Level);
  protected net.minecraft.world.entity.vehicle.minecart.AbstractMinecart(net.minecraft.world.entity.EntityType<?>, net.minecraft.world.level.Level, double, double, double);
  public void setInitialPos(double, double, double);
  public static <T extends net.minecraft.world.entity.vehicle.minecart.AbstractMinecart> T createMinecart(net.minecraft.world.level.Level, double, double, double, net.minecraft.world.entity.EntityType<T>, net.minecraft.world.entity.EntitySpawnReason, net.minecraft.world.item.ItemStack, net.minecraft.world.entity.player.Player);
  public net.minecraft.world.entity.vehicle.minecart.MinecartBehavior getBehavior();
  protected net.minecraft.world.entity.Entity$MovementEmission getMovementEmission();
  protected void defineSynchedData(net.minecraft.network.syncher.SynchedEntityData$Builder);
  public boolean canCollideWith(net.minecraft.world.entity.Entity);
  public boolean isPushable();
  public net.minecraft.world.phys.Vec3 getRelativePortalPosition(net.minecraft.core.Direction$Axis, net.minecraft.util.BlockUtil$FoundRectangle);
  protected net.minecraft.world.phys.Vec3 getPassengerAttachmentPoint(net.minecraft.world.entity.Entity, net.minecraft.world.entity.EntityDimensions, float);
  public net.minecraft.world.phys.Vec3 getDismountLocationForPassenger(net.minecraft.world.entity.LivingEntity);
  protected float getBlockSpeedFactor();
  public void animateHurt(float);
  public boolean isPickable();
  public static com.mojang.datafixers.util.Pair<net.minecraft.core.Vec3i, net.minecraft.core.Vec3i> exits(net.minecraft.world.level.block.state.properties.RailShape);
  public net.minecraft.core.Direction getMotionDirection();
  protected double getDefaultGravity();
  public void tick();
  public boolean isFirstTick();
  public net.minecraft.core.BlockPos getCurrentBlockPosOrRailBelow();
  protected double getMaxSpeed(net.minecraft.server.level.ServerLevel);
  public void activateMinecart(net.minecraft.server.level.ServerLevel, int, int, int, boolean);
  public void lerpPositionAndRotationStep(int, double, double, double, double, double);
  public void applyGravity();
  public void reapplyPosition();
  public boolean updateInWaterStateAndDoFluidPushing();
  public net.minecraft.world.phys.Vec3 getKnownMovement();
  public net.minecraft.world.entity.InterpolationHandler getInterpolation();
  public void recreateFromPacket(net.minecraft.network.protocol.game.ClientboundAddEntityPacket);
  public void lerpMotion(net.minecraft.world.phys.Vec3);
  protected void moveAlongTrack(net.minecraft.server.level.ServerLevel);
  protected void comeOffTrack(net.minecraft.server.level.ServerLevel);
  protected double makeStepAlongTrack(net.minecraft.core.BlockPos, net.minecraft.world.level.block.state.properties.RailShape, double);
  public void move(net.minecraft.world.entity.MoverType, net.minecraft.world.phys.Vec3);
  public void applyEffectsFromBlocks();
  public boolean isOnRails();
  public void setOnRails(boolean);
  public boolean isFlipped();
  public void setFlipped(boolean);
  public net.minecraft.world.phys.Vec3 getRedstoneDirection(net.minecraft.core.BlockPos);
  public boolean isRedstoneConductor(net.minecraft.core.BlockPos);
  protected net.minecraft.world.phys.Vec3 applyNaturalSlowdown(net.minecraft.world.phys.Vec3);
  protected void readAdditionalSaveData(net.minecraft.world.level.storage.ValueInput);
  protected void addAdditionalSaveData(net.minecraft.world.level.storage.ValueOutput);
  public void push(net.minecraft.world.entity.Entity);
  private void pushOtherMinecart(net.minecraft.world.entity.vehicle.minecart.AbstractMinecart, double, double);
  public net.minecraft.world.level.block.state.BlockState getDisplayBlockState();
  private java.util.Optional<net.minecraft.world.level.block.state.BlockState> getCustomDisplayBlockState();
  public net.minecraft.world.level.block.state.BlockState getDefaultDisplayBlockState();
  public int getDisplayOffset();
  public int getDefaultDisplayOffset();
  public void setCustomDisplayBlockState(java.util.Optional<net.minecraft.world.level.block.state.BlockState>);
  public void setDisplayOffset(int);
  public static boolean useExperimentalMovement(net.minecraft.world.level.Level);
  public abstract net.minecraft.world.item.ItemStack getPickResult();
  public boolean isRideable();
  public boolean isFurnace();
  private static void method_67673(net.minecraft.world.level.storage.ValueOutput, net.minecraft.world.level.block.state.BlockState);
  private static com.google.common.collect.ImmutableMap method_66327();
  private net.minecraft.world.phys.shapes.VoxelShape method_30340(net.minecraft.core.BlockPos);
  private net.minecraft.world.phys.shapes.VoxelShape method_30339(net.minecraft.core.BlockPos$MutableBlockPos);
  static {};
}

=== net.minecraft.world.entity.vehicle.minecart.AbstractMinecartContainer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "AbstractMinecartContainer.java"
public abstract class net.minecraft.world.entity.vehicle.minecart.AbstractMinecartContainer extends net.minecraft.world.entity.vehicle.minecart.AbstractMinecart implements net.minecraft.world.entity.vehicle.ContainerEntity {
  private net.minecraft.core.NonNullList<net.minecraft.world.item.ItemStack> itemStacks;
  private net.minecraft.resources.ResourceKey<net.minecraft.world.level.storage.loot.LootTable> lootTable;
  private long lootTableSeed;
  protected net.minecraft.world.entity.vehicle.minecart.AbstractMinecartContainer(net.minecraft.world.entity.EntityType<?>, net.minecraft.world.level.Level);
  public void destroy(net.minecraft.server.level.ServerLevel, net.minecraft.world.damagesource.DamageSource);
  public net.minecraft.world.item.ItemStack getItem(int);
  public net.minecraft.world.item.ItemStack removeItem(int, int);
  public net.minecraft.world.item.ItemStack removeItemNoUpdate(int);
  public void setItem(int, net.minecraft.world.item.ItemStack);
  public net.minecraft.world.entity.SlotAccess getSlot(int);
  public void setChanged();
  public boolean stillValid(net.minecraft.world.entity.player.Player);
  public void remove(net.minecraft.world.entity.Entity$RemovalReason);
  protected void addAdditionalSaveData(net.minecraft.world.level.storage.ValueOutput);
  protected void readAdditionalSaveData(net.minecraft.world.level.storage.ValueInput);
  public net.minecraft.world.InteractionResult interact(net.minecraft.world.entity.player.Player, net.minecraft.world.InteractionHand);
  protected net.minecraft.world.phys.Vec3 applyNaturalSlowdown(net.minecraft.world.phys.Vec3);
  public void clearContent();
  public void setLootTable(net.minecraft.resources.ResourceKey<net.minecraft.world.level.storage.loot.LootTable>, long);
  public net.minecraft.world.inventory.AbstractContainerMenu createMenu(int, net.minecraft.world.entity.player.Inventory, net.minecraft.world.entity.player.Player);
  protected abstract net.minecraft.world.inventory.AbstractContainerMenu createMenu(int, net.minecraft.world.entity.player.Inventory);
  public net.minecraft.resources.ResourceKey<net.minecraft.world.level.storage.loot.LootTable> getContainerLootTable();
  public void setContainerLootTable(net.minecraft.resources.ResourceKey<net.minecraft.world.level.storage.loot.LootTable>);
  public long getContainerLootTableSeed();
  public void setContainerLootTableSeed(long);
  public net.minecraft.core.NonNullList<net.minecraft.world.item.ItemStack> getItemStacks();
  public void clearItemStacks();
}
```

## Probe task log

```

> Configure project :
Fabric Loom: 1.14.10

> Task :probeApi
Wrote /home/runner/work/F1Client/F1Client/build/probe-api.txt (58059 bytes; 91 classes matched)
gradle/actions: Writing build results to /home/runner/work/_temp/.gradle-actions/build-results/__run_2-1794595414609.json

[Incubating] Problems report is available at: file:///home/runner/work/F1Client/F1Client/build/reports/problems/problems-report.html

Deprecated Gradle features were used in this build, making it incompatible with Gradle 10.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/9.2.1/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.

BUILD SUCCESSFUL in 15s
1 actionable task: 1 executed
Consider enabling configuration cache to speed up this build: https://docs.gradle.org/9.2.1/userguide/configuration_cache_enabling.html
```

## Gradle output (filtered)

```
14:> Task :compileJava FAILED
15:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/OreESP.java:15: error: package net.minecraft.world.debug.gizmo does not exist
18:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/OreESP.java:16: error: package net.minecraft.world.debug.gizmo does not exist
21:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/SoundESP.java:9: error: package net.minecraft.world.debug.gizmo does not exist
24:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/SoundESP.java:10: error: package net.minecraft.world.debug.gizmo does not exist
32:FAILURE: Build failed with an exception.
34:* What went wrong:
35:Execution failed for task ':compileJava'.
37:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/OreESP.java:15: error: package net.minecraft.world.debug.gizmo does not exist
40:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/OreESP.java:16: error: package net.minecraft.world.debug.gizmo does not exist
43:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/SoundESP.java:9: error: package net.minecraft.world.debug.gizmo does not exist
46:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/SoundESP.java:10: error: package net.minecraft.world.debug.gizmo does not exist
56:org.gradle.api.tasks.TaskExecutionException: Execution failed for task ':compileJava'.
57:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.lambda$executeIfValid$1(ExecuteActionsTaskExecuter.java:135)
58:	at org.gradle.internal.Try$Failure.ifSuccessfulOrElse(Try.java:288)
59:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:133)
60:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:121)
61:	at org.gradle.api.internal.tasks.execution.ProblemsTaskPathTrackingTaskExecuter.execute(ProblemsTaskPathTrackingTaskExecuter.java:41)
62:	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
63:	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
64:	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
65:	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
66:	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
67:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
68:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
69:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
70:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:209)
71:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
72:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
73:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
74:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
75:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
76:	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
77:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
78:	at org.gradle.execution.plan.DefaultNodeExecutor.executeLocalTaskNode(DefaultNodeExecutor.java:55)
79:	at org.gradle.execution.plan.DefaultNodeExecutor.execute(DefaultNodeExecutor.java:34)
80:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:355)
81:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:343)
82:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.lambda$execute$0(DefaultTaskExecutionGraph.java:339)
83:	at org.gradle.internal.operations.CurrentBuildOperationRef.with(CurrentBuildOperationRef.java:84)
84:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:339)
85:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:328)
86:	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:459)
87:	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:376)
88:	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
89:	at org.gradle.internal.concurrent.AbstractManagedExecutor$1.run(AbstractManagedExecutor.java:47)
90:Caused by: org.gradle.api.internal.tasks.compile.CompilationFailedException: Compilation failed; see the compiler output below.
91:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/OreESP.java:15: error: package net.minecraft.world.debug.gizmo does not exist
94:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/OreESP.java:16: error: package net.minecraft.world.debug.gizmo does not exist
97:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/SoundESP.java:9: error: package net.minecraft.world.debug.gizmo does not exist
100:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/SoundESP.java:10: error: package net.minecraft.world.debug.gizmo does not exist
104:	at org.gradle.api.internal.tasks.compile.JdkJavaCompiler.execute(JdkJavaCompiler.java:89)
105:	at org.gradle.api.internal.tasks.compile.JdkJavaCompiler.execute(JdkJavaCompiler.java:50)
106:	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.delegateAndHandleErrors(NormalizingJavaCompiler.java:98)
107:	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.execute(NormalizingJavaCompiler.java:52)
108:	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.execute(NormalizingJavaCompiler.java:38)
109:	at org.gradle.api.internal.tasks.compile.AnnotationProcessorDiscoveringCompiler.execute(AnnotationProcessorDiscoveringCompiler.java:52)
110:	at org.gradle.api.internal.tasks.compile.AnnotationProcessorDiscoveringCompiler.execute(AnnotationProcessorDiscoveringCompiler.java:38)
111:	at org.gradle.api.internal.tasks.compile.ModuleApplicationNameWritingCompiler.execute(ModuleApplicationNameWritingCompiler.java:46)
112:	at org.gradle.api.internal.tasks.compile.ModuleApplicationNameWritingCompiler.execute(ModuleApplicationNameWritingCompiler.java:36)
113:	at org.gradle.jvm.toolchain.internal.DefaultToolchainJavaCompiler.execute(DefaultToolchainJavaCompiler.java:57)
114:	at org.gradle.api.tasks.compile.JavaCompile.lambda$createToolchainCompiler$3(JavaCompile.java:206)
115:	at org.gradle.api.internal.tasks.compile.CleaningJavaCompiler.execute(CleaningJavaCompiler.java:53)
116:	at org.gradle.api.internal.tasks.compile.incremental.IncrementalCompilerFactory.lambda$createRebuildAllCompiler$0(IncrementalCompilerFactory.java:55)
117:	at org.gradle.api.internal.tasks.compile.incremental.SelectiveCompiler.execute(SelectiveCompiler.java:70)
118:	at org.gradle.api.internal.tasks.compile.incremental.SelectiveCompiler.execute(SelectiveCompiler.java:44)
119:	at org.gradle.api.internal.tasks.compile.incremental.IncrementalResultStoringCompiler.execute(IncrementalResultStoringCompiler.java:66)
120:	at org.gradle.api.internal.tasks.compile.incremental.IncrementalResultStoringCompiler.execute(IncrementalResultStoringCompiler.java:52)
121:	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler$1.call(CompileJavaBuildOperationReportingCompiler.java:64)
122:	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler$1.call(CompileJavaBuildOperationReportingCompiler.java:48)
123:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:209)
124:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
125:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
126:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
127:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
128:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
129:	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
130:	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler.execute(CompileJavaBuildOperationReportingCompiler.java:48)
131:	at org.gradle.api.tasks.compile.JavaCompile.performCompilation(JavaCompile.java:224)
132:	at org.gradle.api.tasks.compile.JavaCompile.performIncrementalCompilation(JavaCompile.java:165)
133:	at org.gradle.api.tasks.compile.JavaCompile.compile(JavaCompile.java:150)
134:	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
135:	at org.gradle.api.internal.project.taskfactory.IncrementalTaskAction.doExecute(IncrementalTaskAction.java:45)
136:	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
137:	at org.gradle.api.internal.project.taskfactory.IncrementalTaskAction.execute(IncrementalTaskAction.java:26)
138:	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
139:	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:252)
140:	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
141:	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
142:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
143:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
144:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
145:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
146:	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
147:	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:237)
148:	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:220)
149:	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:203)
150:	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:170)
151:	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
152:	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
153:	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
154:	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
155:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:209)
156:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
157:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
158:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
159:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
160:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
161:	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
162:	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
163:	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
164:	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:42)
165:	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:75)
166:	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
167:	at org.gradle.internal.execution.steps.PreCreateOutputParentsStep.execute(PreCreateOutputParentsStep.java:50)
168:	at org.gradle.internal.execution.steps.PreCreateOutputParentsStep.execute(PreCreateOutputParentsStep.java:28)
169:	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:68)
170:	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:38)
171:	at org.gradle.internal.execution.steps.BroadcastChangingOutputsStep.execute(BroadcastChangingOutputsStep.java:61)
172:	at org.gradle.internal.execution.steps.BroadcastChangingOutputsStep.execute(BroadcastChangingOutputsStep.java:26)
173:	at org.gradle.internal.execution.steps.CaptureOutputsAfterExecutionStep.execute(CaptureOutputsAfterExecutionStep.java:69)
174:	at org.gradle.internal.execution.steps.CaptureOutputsAfterExecutionStep.execute(CaptureOutputsAfterExecutionStep.java:46)
175:	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:39)
176:	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:28)
177:	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:189)
178:	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:75)
179:	at org.gradle.internal.Either$Right.fold(Either.java:176)
180:	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:62)
181:	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:73)
182:	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:48)
183:	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:46)
184:	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:35)
185:	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:75)
186:	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:53)
187:	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:53)
188:	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:35)
189:	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
190:	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
191:	at org.gradle.internal.execution.steps.ResolveIncrementalCachingStateStep.executeDelegate(ResolveIncrementalCachingStateStep.java:49)
192:	at org.gradle.internal.execution.steps.ResolveIncrementalCachingStateStep.executeDelegate(ResolveIncrementalCachingStateStep.java:27)
193:	at org.gradle.internal.execution.steps.AbstractResolveCachingStateStep.execute(AbstractResolveCachingStateStep.java:71)
194:	at org.gradle.internal.execution.steps.AbstractResolveCachingStateStep.execute(AbstractResolveCachingStateStep.java:39)
195:	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:64)
196:	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:35)
197:	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:62)
198:	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:40)
199:	at org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep.execute(AbstractCaptureStateBeforeExecutionStep.java:76)
200:	at org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep.execute(AbstractCaptureStateBeforeExecutionStep.java:45)
201:	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.executeWithNonEmptySources(AbstractSkipEmptyWorkStep.java:136)
202:	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.execute(AbstractSkipEmptyWorkStep.java:66)
203:	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.execute(AbstractSkipEmptyWorkStep.java:38)
204:	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
205:	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
206:	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
207:	at org.gradle.internal.execution.steps.HandleStaleOutputsStep.execute(HandleStaleOutputsStep.java:75)
208:	at org.gradle.internal.execution.steps.HandleStaleOutputsStep.execute(HandleStaleOutputsStep.java:41)
209:	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.lambda$execute$0(AssignMutableWorkspaceStep.java:35)
210:	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:297)
211:	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.execute(AssignMutableWorkspaceStep.java:31)
212:	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.execute(AssignMutableWorkspaceStep.java:22)
213:	at org.gradle.internal.execution.steps.ChoosePipelineStep.execute(ChoosePipelineStep.java:40)
214:	at org.gradle.internal.execution.steps.ChoosePipelineStep.execute(ChoosePipelineStep.java:23)
215:	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.lambda$execute$2(ExecuteWorkBuildOperationFiringStep.java:67)
216:	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.execute(ExecuteWorkBuildOperationFiringStep.java:67)
217:	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.execute(ExecuteWorkBuildOperationFiringStep.java:39)
218:	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:46)
219:	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:34)
220:	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:44)
221:	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:31)
222:	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
223:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:132)
233:BUILD FAILED in 37s
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

BUILD FAILED in 37s
1 actionable task: 1 executed
```
