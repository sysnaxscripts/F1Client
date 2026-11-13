# Last build

Run: https://github.com/sysnaxscripts/F1Client/actions/runs/43485937702
Commit under test: 1d2a9b578c3f8b48562602539384f67c9f1a9a57
Generated on: 2026-11-13T18:47:42Z

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

signatures of the first 11 dump matches:

=== com.mojang.authlib.minecraft.client.MinecraftClient   [authlib-7.0.61.jar] ===
Compiled from "MinecraftClient.java"
public class com.mojang.authlib.minecraft.client.MinecraftClient {
  private static final org.slf4j.Logger LOGGER;
  public static final int CONNECT_TIMEOUT_MS;
  public static final int READ_TIMEOUT_MS;
  private final java.lang.String accessToken;
  private final java.net.Proxy proxy;
  private final com.mojang.authlib.minecraft.client.ObjectMapper objectMapper;
  public com.mojang.authlib.minecraft.client.MinecraftClient(java.lang.String, java.net.Proxy);
  public static com.mojang.authlib.minecraft.client.MinecraftClient unauthenticated(java.net.Proxy);
  public <T> T get(java.net.URL, java.lang.Class<T>);
  public <T> T post(java.net.URL, java.lang.Class<T>);
  public <T> T post(java.net.URL, java.lang.Object, java.lang.Class<T>);
  private <T> T readInputStream(java.net.URL, java.lang.Class<T>, java.net.HttpURLConnection);
  private java.net.HttpURLConnection postInternal(java.net.URL, byte[]);
  private java.net.HttpURLConnection createUrlConnection(java.net.URL);
  static {};
}

=== net.fabricmc.fabric.api.client.rendering.v1.world.AbstractWorldRenderContext   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar] ===
Compiled from "AbstractWorldRenderContext.java"
public interface net.fabricmc.fabric.api.client.rendering.v1.world.AbstractWorldRenderContext {
  public abstract net.minecraft.client.renderer.GameRenderer gameRenderer();
  public abstract net.minecraft.client.renderer.LevelRenderer worldRenderer();
  public abstract net.minecraft.client.renderer.state.LevelRenderState worldState();
}

=== net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar] ===
Compiled from "WorldRenderContext.java"
public interface net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext extends net.fabricmc.fabric.api.client.rendering.v1.world.WorldTerrainRenderContext {
  public abstract net.minecraft.client.renderer.SubmitNodeCollector commandQueue();
  public abstract com.mojang.blaze3d.vertex.PoseStack matrices();
  public abstract net.minecraft.client.renderer.MultiBufferSource consumers();
}

=== net.fabricmc.fabric.impl.client.rendering.world.WorldRenderContextImpl   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar] ===
Compiled from "WorldRenderContextImpl.java"
public final class net.fabricmc.fabric.impl.client.rendering.world.WorldRenderContextImpl implements net.fabricmc.fabric.api.client.rendering.v1.world.AbstractWorldRenderContext,net.fabricmc.fabric.api.client.rendering.v1.world.WorldTerrainRenderContext,net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext {
  private net.minecraft.client.renderer.GameRenderer gameRenderer;
  private net.minecraft.client.renderer.LevelRenderer worldRenderer;
  private net.minecraft.client.renderer.state.LevelRenderState worldRenderState;
  private net.minecraft.client.renderer.chunk.ChunkSectionsToRender sectionRenderState;
  private net.minecraft.client.renderer.SubmitNodeCollector commandQueue;
  private com.mojang.blaze3d.vertex.PoseStack matrixStack;
  private net.minecraft.client.renderer.MultiBufferSource consumers;
  public net.fabricmc.fabric.impl.client.rendering.world.WorldRenderContextImpl();
  public void prepare(net.minecraft.client.renderer.GameRenderer, net.minecraft.client.renderer.LevelRenderer, net.minecraft.client.renderer.state.LevelRenderState, net.minecraft.client.renderer.chunk.ChunkSectionsToRender, net.minecraft.client.renderer.SubmitNodeCollector, net.minecraft.client.renderer.MultiBufferSource);
  public void setMatrixStack(com.mojang.blaze3d.vertex.PoseStack);
  public net.minecraft.client.renderer.GameRenderer gameRenderer();
  public net.minecraft.client.renderer.LevelRenderer worldRenderer();
  public net.minecraft.client.renderer.state.LevelRenderState worldState();
  public net.minecraft.client.renderer.chunk.ChunkSectionsToRender sectionState();
  public net.minecraft.client.renderer.SubmitNodeCollector commandQueue();
  public com.mojang.blaze3d.vertex.PoseStack matrices();
  public net.minecraft.client.renderer.MultiBufferSource consumers();
}

=== net.fabricmc.fabric.mixin.datagen.client.MinecraftMixin   [fabric-data-generation-api-v1-4abd26ae-23.5.0+88d7da613e.jar] ===
Compiled from "MinecraftMixin.java"
public class net.fabricmc.fabric.mixin.datagen.client.MinecraftMixin {
  public net.fabricmc.fabric.mixin.datagen.client.MinecraftMixin();
  private void main(org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
}

=== net.fabricmc.fabric.mixin.event.interaction.client.MinecraftMixin   [fabric-events-interaction-v0-4abd26ae-4.1.1+3b89ecf63e.jar] ===
Compiled from "MinecraftMixin.java"
public abstract class net.fabricmc.fabric.mixin.event.interaction.client.MinecraftMixin {
  private boolean attackCancelled;
  private net.minecraft.client.player.LocalPlayer player;
  public net.minecraft.client.Options options;
  public net.minecraft.client.multiplayer.MultiPlayerGameMode gameMode;
  public net.minecraft.client.multiplayer.ClientLevel level;
  public net.fabricmc.fabric.mixin.event.interaction.client.MinecraftMixin();
  public abstract net.minecraft.client.multiplayer.ClientPacketListener getConnection();
  private void injectUseEntityCallback(org.spongepowered.asm.mixin.injection.callback.CallbackInfo, net.minecraft.world.InteractionHand, net.minecraft.world.phys.EntityHitResult, net.minecraft.world.entity.Entity);
  private void injectHandleInputEventsForPreAttackCallback(org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void injectDoAttackForCancelling(org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable<java.lang.Boolean>);
  private void injectHandleBlockBreakingForCancelling(boolean, org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
}

=== net.fabricmc.fabric.mixin.event.lifecycle.client.MinecraftMixin   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar] ===
Compiled from "MinecraftMixin.java"
public abstract class net.fabricmc.fabric.mixin.event.lifecycle.client.MinecraftMixin {
  public net.fabricmc.fabric.mixin.event.lifecycle.client.MinecraftMixin();
  private void onStartTick(org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void onEndTick(org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void onStopping(org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void onStart(org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void afterClientWorldChange(net.minecraft.client.multiplayer.ClientLevel, org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
}

=== net.fabricmc.fabric.mixin.registry.sync.client.MinecraftMixin   [fabric-registry-sync-v0-4abd26ae-6.2.6+1718722b3e.jar] ===
Compiled from "MinecraftMixin.java"
public class net.fabricmc.fabric.mixin.registry.sync.client.MinecraftMixin {
  private static org.slf4j.Logger LOGGER;
  public net.fabricmc.fabric.mixin.registry.sync.client.MinecraftMixin();
  public void disconnectAfter(net.minecraft.client.gui.screens.Screen, boolean, boolean, org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void afterModInit(org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private static void unmap() throws net.fabricmc.fabric.impl.registry.sync.RemapException;
}

=== net.minecraft.client.Minecraft   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "Minecraft.java"
public class net.minecraft.client.Minecraft extends net.minecraft.util.thread.ReentrantBlockableEventLoop<java.lang.Runnable> implements com.mojang.blaze3d.platform.WindowEventHandler {
  static net.minecraft.client.Minecraft instance;
  private static final org.slf4j.Logger LOGGER;
  private static final int MAX_TICKS_PER_UPDATE;
  public static final net.minecraft.resources.Identifier DEFAULT_FONT;
  public static final net.minecraft.resources.Identifier UNIFORM_FONT;
  public static final net.minecraft.resources.Identifier ALT_FONT;
  private static final net.minecraft.resources.Identifier REGIONAL_COMPLIANCIES;
  private static final java.util.concurrent.CompletableFuture<net.minecraft.util.Unit> RESOURCE_RELOAD_INITIAL_TASK;
  private static final net.minecraft.network.chat.Component SOCIAL_INTERACTIONS_NOT_AVAILABLE;
  private static final net.minecraft.network.chat.Component SAVING_LEVEL;
  public static final java.lang.String UPDATE_DRIVERS_ADVICE;
  private final long canary;
  private final java.nio.file.Path resourcePackDirectory;
  private final java.util.concurrent.CompletableFuture<com.mojang.authlib.yggdrasil.ProfileResult> profileFuture;
  private final net.minecraft.client.renderer.texture.TextureManager textureManager;
  private final net.minecraft.client.renderer.ShaderManager shaderManager;
  private final com.mojang.datafixers.DataFixer fixerUpper;
  private final net.minecraft.client.renderer.VirtualScreen virtualScreen;
  private final com.mojang.blaze3d.platform.Window window;
  private final net.minecraft.client.DeltaTracker$Timer deltaTracker;
  private final net.minecraft.client.renderer.RenderBuffers renderBuffers;
  public final net.minecraft.client.renderer.LevelRenderer levelRenderer;
  private final net.minecraft.client.renderer.entity.EntityRenderDispatcher entityRenderDispatcher;
  private final net.minecraft.client.renderer.item.ItemModelResolver itemModelResolver;
  private final net.minecraft.client.renderer.entity.ItemRenderer itemRenderer;
  private final net.minecraft.client.renderer.MapRenderer mapRenderer;
  public final net.minecraft.client.particle.ParticleEngine particleEngine;
  private final net.minecraft.client.particle.ParticleResources particleResources;
  private final net.minecraft.client.User user;
  public final net.minecraft.client.gui.Font font;
  public final net.minecraft.client.gui.Font fontFilterFishy;
  public final net.minecraft.client.renderer.GameRenderer gameRenderer;
  public final net.minecraft.client.gui.Gui gui;
  public final net.minecraft.client.Options options;
  public final net.minecraft.client.gui.components.debug.DebugScreenEntryList debugEntries;
  private final net.minecraft.client.HotbarManager hotbarManager;
  public final net.minecraft.client.MouseHandler mouseHandler;
  public final net.minecraft.client.KeyboardHandler keyboardHandler;
  private net.minecraft.client.InputType lastInputType;
  public final java.io.File gameDirectory;
  private final java.lang.String launchedVersion;
  private final java.lang.String versionType;
  private final java.net.Proxy proxy;
  private final boolean offlineDeveloperMode;
  private final net.minecraft.world.level.storage.LevelStorageSource levelSource;
  private final boolean demo;
  private final boolean allowsMultiplayer;
  private final boolean allowsChat;
  private final net.minecraft.server.packs.resources.ReloadableResourceManager resourceManager;
  private final net.minecraft.server.packs.VanillaPackResources vanillaPackResources;
  private final net.minecraft.client.resources.server.DownloadedPackSource downloadedPackSource;
  private final net.minecraft.server.packs.repository.PackRepository resourcePackRepository;
  private final net.minecraft.client.resources.language.LanguageManager languageManager;
  private final net.minecraft.client.color.block.BlockColors blockColors;
  private final com.mojang.blaze3d.pipeline.RenderTarget mainRenderTarget;
  private final com.mojang.blaze3d.TracyFrameCapture tracyFrameCapture;
  private final net.minecraft.client.sounds.SoundManager soundManager;
  private final net.minecraft.client.sounds.MusicManager musicManager;
  private final net.minecraft.client.gui.font.FontManager fontManager;
  private final net.minecraft.client.resources.SplashManager splashManager;
  private final net.minecraft.client.renderer.GpuWarnlistManager gpuWarnlistManager;
  private final net.minecraft.client.PeriodicNotificationManager regionalCompliancies;
  private final com.mojang.authlib.minecraft.UserApiService userApiService;
  private final java.util.concurrent.CompletableFuture<com.mojang.authlib.minecraft.UserApiService$UserProperties> userPropertiesFuture;
  private final net.minecraft.client.resources.SkinManager skinManager;
  private final net.minecraft.client.resources.model.AtlasManager atlasManager;
  private final net.minecraft.client.resources.model.ModelManager modelManager;
  private final net.minecraft.client.renderer.block.BlockRenderDispatcher blockRenderer;
  private final net.minecraft.client.resources.MapTextureManager mapTextureManager;
  private final net.minecraft.client.resources.WaypointStyleManager waypointStyles;
  private final net.minecraft.client.gui.components.toasts.ToastManager toastManager;
  private final net.minecraft.client.tutorial.Tutorial tutorial;
  private final net.minecraft.client.gui.screens.social.PlayerSocialManager playerSocialManager;
  private final net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher blockEntityRenderDispatcher;
  private final net.minecraft.client.telemetry.ClientTelemetryManager telemetryManager;
  private final net.minecraft.client.multiplayer.ProfileKeyPairManager profileKeyPairManager;
  private final com.mojang.realmsclient.gui.RealmsDataFetcher realmsDataFetcher;
  private final net.minecraft.client.quickplay.QuickPlayLog quickPlayLog;
  private final net.minecraft.server.Services services;
  private final net.minecraft.client.renderer.PlayerSkinRenderCache playerSkinRenderCache;
  public net.minecraft.client.multiplayer.MultiPlayerGameMode gameMode;
  public net.minecraft.client.multiplayer.ClientLevel level;
  public net.minecraft.client.player.LocalPlayer player;
  private net.minecraft.client.server.IntegratedServer singleplayerServer;
  private net.minecraft.network.Connection pendingConnection;
  private boolean isLocalServer;
  private net.minecraft.world.entity.Entity cameraEntity;
  public net.minecraft.world.entity.Entity crosshairPickEntity;
  public net.minecraft.world.phys.HitResult hitResult;
  private int rightClickDelay;
  public int missTime;
  private volatile boolean pause;
  private long lastNanoTime;
  private long lastTime;
  private int frames;
  public boolean noRender;
  public net.minecraft.client.gui.screens.Screen screen;
  private net.minecraft.client.gui.screens.Overlay overlay;
  private boolean clientLevelTeardownInProgress;
  java.lang.Thread gameThread;
  private volatile boolean running;
  private java.util.function.Supplier<net.minecraft.CrashReport> delayedCrash;
  private static int fps;
  private long frameTimeNs;
  private final com.mojang.blaze3d.platform.FramerateLimitTracker framerateLimitTracker;
  public boolean wireframe;
  public boolean smartCull;
  private boolean windowActive;
  private java.util.concurrent.CompletableFuture<java.lang.Void> pendingReload;
  private net.minecraft.client.gui.components.toasts.TutorialToast socialInteractionsToast;
  private int fpsPieRenderTicks;
  private final net.minecraft.util.profiling.ContinuousProfiler fpsPieProfiler;
  private net.minecraft.util.profiling.metrics.profiling.MetricsRecorder metricsRecorder;
  private final net.minecraft.client.ResourceLoadStateTracker reloadStateTracker;
  private long savedCpuDuration;
  private double gpuUtilization;
  private com.mojang.blaze3d.systems.TimerQuery$FrameProfile currentFrameProfile;
  private final net.minecraft.client.GameNarrator narrator;
  private final net.minecraft.client.multiplayer.chat.ChatListener chatListener;
  private net.minecraft.client.multiplayer.chat.report.ReportingContext reportingContext;
  private final net.minecraft.client.CommandHistory commandHistory;
  private final net.minecraft.world.level.validation.DirectoryValidator directoryValidator;
  private boolean gameLoadFinished;
  private final long clientStartTimeMs;
  private long clientTickCount;
  private final net.minecraft.network.PacketProcessor packetProcessor;
  private final net.minecraft.gizmos.SimpleGizmoCollector perTickGizmos;
  private java.util.List<net.minecraft.gizmos.SimpleGizmoCollector$GizmoInstance> drainedLatestTickGizmos;
  public net.minecraft.client.Minecraft(net.minecraft.client.main.GameConfig);
  public boolean hasShiftDown();
  public boolean hasControlDown();
  public boolean hasAltDown();
  private void onResourceLoadFinished(net.minecraft.client.Minecraft$GameLoadCookie);
  private void onGameLoadFinished(net.minecraft.client.Minecraft$GameLoadCookie);
  public boolean isGameLoadFinished();
  private java.lang.Runnable buildInitialScreens(net.minecraft.client.Minecraft$GameLoadCookie);
  private boolean addInitialScreens(java.util.List<java.util.function.Function<java.lang.Runnable, net.minecraft.client.gui.screens.Screen>>);
  private static boolean countryEqualsISO3(java.lang.Object);
  public void updateTitle();
  private java.lang.String createTitle();
  private com.mojang.authlib.minecraft.UserApiService createUserApiService(com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService, net.minecraft.client.main.GameConfig);
  public boolean isOfflineDeveloperMode();
  public static net.minecraft.util.ModCheck checkModStatus();
  private void rollbackResourcePacks(java.lang.Throwable, net.minecraft.client.Minecraft$GameLoadCookie);
  public void clearResourcePacksOnError(java.lang.Throwable, net.minecraft.network.chat.Component, net.minecraft.client.Minecraft$GameLoadCookie);
  private void abortResourcePackRecovery();
  private void addResourcePackLoadFailToast(net.minecraft.network.chat.Component);
  public void triggerResourcePackRecovery(java.lang.Exception);
  public void run();
  void updateFontOptions();
  private void onFullscreenError(int, long);
  public com.mojang.blaze3d.pipeline.RenderTarget getMainRenderTarget();
  public java.lang.String getLaunchedVersion();
  public java.lang.String getVersionType();
  public void delayCrash(net.minecraft.CrashReport);
  public void delayCrashRaw(net.minecraft.CrashReport);
  private void handleDelayedCrash();
  public void emergencySaveAndCrash(net.minecraft.CrashReport);
  public static int saveReport(java.io.File, net.minecraft.CrashReport);
  public static void crash(net.minecraft.client.Minecraft, java.io.File, net.minecraft.CrashReport);
  public boolean isEnforceUnicode();
  public java.util.concurrent.CompletableFuture<java.lang.Void> reloadResourcePacks();
  private java.util.concurrent.CompletableFuture<java.lang.Void> reloadResourcePacks(boolean, net.minecraft.client.Minecraft$GameLoadCookie);
  private void selfTest();
  public net.minecraft.world.level.storage.LevelStorageSource getLevelSource();
  public void openChatScreen(net.minecraft.client.gui.components.ChatComponent$ChatMethod);
  public void setScreen(net.minecraft.client.gui.screens.Screen);
  public void setOverlay(net.minecraft.client.gui.screens.Overlay);
  public void destroy();
  public void close();
  private void runTick(boolean);
  private net.minecraft.util.profiling.ProfilerFiller constructProfiler(boolean, net.minecraft.util.profiling.SingleTickProfiler);
  private void finishProfilers(boolean, net.minecraft.util.profiling.SingleTickProfiler);
  public void resizeDisplay();
  public void cursorEntered();
  public int getFps();
  public long getFrameTimeNs();
  private void emergencySave();
  public boolean debugClientMetricsStart(java.util.function.Consumer<net.minecraft.network.chat.Component>);
  private void debugClientMetricsStop();
  private void debugClientMetricsCancel();
  private java.nio.file.Path archiveProfilingReport(net.minecraft.SystemReport, java.util.List<java.nio.file.Path>);
  public void stop();
  public boolean isRunning();
  public void pauseGame(boolean);
  private void continueAttack(boolean);
  private boolean startAttack();
  private void startUseItem();
  public net.minecraft.client.sounds.MusicManager getMusicManager();
  public void tick();
  private boolean isLevelRunningNormally();
  private boolean isMultiplayerServer();
  private void handleKeybinds();
  private java.util.Optional<net.minecraft.core.Holder<net.minecraft.server.dialog.Dialog>> getQuickActionsDialog();
  public net.minecraft.client.telemetry.ClientTelemetryManager getTelemetryManager();
  public double getGpuUtilization();
  public net.minecraft.client.multiplayer.ProfileKeyPairManager getProfileKeyPairManager();
  public net.minecraft.client.gui.screens.worldselection.WorldOpenFlows createWorldOpenFlows();
  public void doWorldLoad(net.minecraft.world.level.storage.LevelStorageSource$LevelStorageAccess, net.minecraft.server.packs.repository.PackRepository, net.minecraft.server.WorldStem, boolean);
  public void setLevel(net.minecraft.client.multiplayer.ClientLevel);
  public void disconnectFromWorld(net.minecraft.network.chat.Component);
  public void disconnectWithSavingScreen();
  public void disconnectWithProgressScreen();
  public void disconnectWithProgressScreen(boolean);
  public void disconnect(net.minecraft.client.gui.screens.Screen, boolean);
  public void disconnect(net.minecraft.client.gui.screens.Screen, boolean, boolean);
  public void clearDownloadedResourcePacks();
  public void clearClientLevel(net.minecraft.client.gui.screens.Screen);
  public void setScreenAndShow(net.minecraft.client.gui.screens.Screen);
  private void updateLevelInEngines(net.minecraft.client.multiplayer.ClientLevel);
  private void updateLevelInEngines(net.minecraft.client.multiplayer.ClientLevel, boolean);
  private com.mojang.authlib.minecraft.UserApiService$UserProperties userProperties();
  public boolean telemetryOptInExtra();
  public boolean extraTelemetryAvailable();
  public boolean allowsTelemetry();
  public boolean allowsMultiplayer();
  public boolean allowsRealms();
  public com.mojang.authlib.minecraft.BanDetails multiplayerBan();
  public boolean isNameBanned();
  public boolean isBlocked(java.util.UUID);
  public net.minecraft.client.Minecraft$ChatStatus getChatStatus();
  public final boolean isDemo();
  public final boolean canSwitchGameMode();
  public net.minecraft.client.multiplayer.ClientPacketListener getConnection();
  public static boolean renderNames();
  public static boolean useShaderTransparency();
  public static boolean useAmbientOcclusion();
  private void pickBlock();
  public net.minecraft.CrashReport fillReport(net.minecraft.CrashReport);
  public static void fillReport(net.minecraft.client.Minecraft, net.minecraft.client.resources.language.LanguageManager, java.lang.String, net.minecraft.client.Options, net.minecraft.CrashReport);
  private static java.lang.String formatSeconds(double);
  private void fillUptime(net.minecraft.CrashReportCategory);
  private static net.minecraft.SystemReport fillSystemReport(net.minecraft.SystemReport, net.minecraft.client.Minecraft, net.minecraft.client.resources.language.LanguageManager, java.lang.String, net.minecraft.client.Options);
  public static net.minecraft.client.Minecraft getInstance();
  public java.util.concurrent.CompletableFuture<java.lang.Void> delayTextureReload();
  public void updateReportEnvironment(net.minecraft.client.multiplayer.chat.report.ReportEnvironment);
  public net.minecraft.client.multiplayer.ServerData getCurrentServer();
  public boolean isLocalServer();
  public boolean hasSingleplayerServer();
  public net.minecraft.client.server.IntegratedServer getSingleplayerServer();
  public boolean isSingleplayer();
  public boolean isLocalPlayer(java.util.UUID);
  public net.minecraft.client.User getUser();
  public com.mojang.authlib.GameProfile getGameProfile();
  public java.net.Proxy getProxy();
  public net.minecraft.client.renderer.texture.TextureManager getTextureManager();
  public net.minecraft.client.renderer.ShaderManager getShaderManager();
  public net.minecraft.server.packs.resources.ResourceManager getResourceManager();
  public net.minecraft.server.packs.repository.PackRepository getResourcePackRepository();
  public net.minecraft.server.packs.VanillaPackResources getVanillaPackResources();
  public net.minecraft.client.resources.server.DownloadedPackSource getDownloadedPackSource();
  public java.nio.file.Path getResourcePackDirectory();
  public net.minecraft.client.resources.language.LanguageManager getLanguageManager();
  public boolean isPaused();
  public net.minecraft.client.renderer.GpuWarnlistManager getGpuWarnlistManager();
  public net.minecraft.client.sounds.SoundManager getSoundManager();
  public net.minecraft.sounds.Music getSituationalMusic();
  public float getMusicVolume();
  public net.minecraft.server.Services services();
  public net.minecraft.client.resources.SkinManager getSkinManager();
  public net.minecraft.world.entity.Entity getCameraEntity();
  public void setCameraEntity(net.minecraft.world.entity.Entity);
  public boolean shouldEntityAppearGlowing(net.minecraft.world.entity.Entity);
  protected java.lang.Thread getRunningThread();
  public java.lang.Runnable wrapRunnable(java.lang.Runnable);
  protected boolean shouldRun(java.lang.Runnable);
  public net.minecraft.client.renderer.block.BlockRenderDispatcher getBlockRenderer();
  public net.minecraft.client.renderer.entity.EntityRenderDispatcher getEntityRenderDispatcher();
  public net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher getBlockEntityRenderDispatcher();
  public net.minecraft.client.renderer.entity.ItemRenderer getItemRenderer();
  public net.minecraft.client.renderer.MapRenderer getMapRenderer();
  public com.mojang.datafixers.DataFixer getFixerUpper();
  public net.minecraft.client.DeltaTracker getDeltaTracker();
  public net.minecraft.client.color.block.BlockColors getBlockColors();
  public boolean showOnlyReducedInfo();
  public net.minecraft.client.gui.components.toasts.ToastManager getToastManager();
  public net.minecraft.client.tutorial.Tutorial getTutorial();
  public boolean isWindowActive();
  public net.minecraft.client.HotbarManager getHotbarManager();
  public net.minecraft.client.resources.model.ModelManager getModelManager();
  public net.minecraft.client.resources.model.AtlasManager getAtlasManager();
  public net.minecraft.client.resources.MapTextureManager getMapTextureManager();
  public net.minecraft.client.resources.WaypointStyleManager getWaypointStyles();
  public void setWindowActive(boolean);
  public net.minecraft.network.chat.Component grabPanoramixScreenshot(java.io.File);
  public net.minecraft.client.resources.SplashManager getSplashManager();
  public net.minecraft.client.gui.screens.Overlay getOverlay();
  public net.minecraft.client.gui.screens.social.PlayerSocialManager getPlayerSocialManager();
  public com.mojang.blaze3d.platform.Window getWindow();
  public com.mojang.blaze3d.platform.FramerateLimitTracker getFramerateLimitTracker();
  public net.minecraft.client.gui.components.DebugScreenOverlay getDebugOverlay();
  public net.minecraft.client.renderer.RenderBuffers renderBuffers();
  public void updateMaxMipLevel(int);
  public net.minecraft.client.model.geom.EntityModelSet getEntityModels();
  public boolean isTextFilteringEnabled();
  public void prepareForMultiplayer();
  public net.minecraft.client.InputType getLastInputType();
  public void setLastInputType(net.minecraft.client.InputType);
  public net.minecraft.client.GameNarrator getNarrator();
  public net.minecraft.client.multiplayer.chat.ChatListener getChatListener();
  public net.minecraft.client.multiplayer.chat.report.ReportingContext getReportingContext();
  public com.mojang.realmsclient.gui.RealmsDataFetcher realmsDataFetcher();
  public net.minecraft.client.quickplay.QuickPlayLog quickPlayLog();
  public net.minecraft.client.CommandHistory commandHistory();
  public net.minecraft.world.level.validation.DirectoryValidator directoryValidator();
  public net.minecraft.client.renderer.PlayerSkinRenderCache playerSkinRenderCache();
  private float getTickTargetMillis(float);
  public net.minecraft.client.renderer.item.ItemModelResolver getItemModelResolver();
  public boolean canInterruptScreen();
  public static java.lang.String getLauncherBrand();
  public net.minecraft.network.PacketProcessor packetProcessor();
  public net.minecraft.gizmos.Gizmos$TemporaryCollection collectPerTickGizmos();
  public java.util.Collection<net.minecraft.gizmos.SimpleGizmoCollector$GizmoInstance> getPerTickGizmos();
  private static net.minecraft.network.chat.Style method_35704(java.io.File, net.minecraft.network.chat.Style);
  private static void method_35701(net.minecraft.network.chat.Component);
  private static java.util.concurrent.CompletionStage method_18507(java.util.concurrent.CompletableFuture);
  private static java.lang.String method_60864();
  private static java.lang.String method_37288();
  private static java.lang.String method_37280(net.minecraft.client.resources.language.LanguageManager);
  private static java.lang.String method_37279(net.minecraft.client.Minecraft);
  private static java.lang.String method_53905(net.minecraft.client.Minecraft);
  private static java.lang.String method_37287();
  private static java.lang.String method_37289();
  private static java.lang.String method_68671();
  private static java.lang.String method_37278(net.minecraft.client.Minecraft);
  private static java.lang.String method_37292(java.lang.String);
  private java.lang.String method_54118() throws java.lang.Exception;
  private static java.lang.String method_54119() throws java.lang.Exception;
  private java.lang.String method_54120() throws java.lang.Exception;
  private static java.lang.String method_54121() throws java.lang.Exception;
  private static void method_1510(net.minecraft.network.chat.Component);
  private static boolean method_72702(long);
  private static java.lang.String method_41732(net.minecraft.server.WorldStem) throws java.lang.Exception;
  private net.minecraft.client.server.IntegratedServer method_29603(net.minecraft.world.level.storage.LevelStorageSource$LevelStorageAccess, net.minecraft.server.packs.repository.PackRepository, net.minecraft.server.WorldStem, net.minecraft.server.level.progress.LevelLoadListener, java.lang.Thread);
  private static java.util.Optional method_72097(net.minecraft.core.Registry, net.minecraft.core.HolderSet$Named);
  private void method_72096(net.minecraft.core.Holder);
  private static boolean method_1491();
  private void method_34746(java.util.function.Consumer, net.minecraft.util.profiling.ProfileResults);
  private static void method_37277(net.minecraft.util.profiling.ProfileResults);
  private static void method_37284(java.util.function.Consumer, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletableFuture);
  private static void method_37283(java.util.function.Consumer, java.nio.file.Path);
  private void method_37276(net.minecraft.SystemReport, java.util.function.Consumer, java.util.List);
  private void method_37291(java.util.function.Consumer, java.nio.file.Path);
  private static void method_37285(java.util.function.Consumer, net.minecraft.network.chat.Component);
  private static net.minecraft.network.chat.Style method_37281(java.nio.file.Path, net.minecraft.network.chat.Style);
  private void method_37290(java.util.function.Consumer, net.minecraft.util.profiling.ProfileResults);
  private static void method_37282(java.util.function.Consumer, double, int);
  private static void method_18508(java.util.concurrent.CompletableFuture);
  private void method_44352(boolean);
  private static void method_64035(net.minecraft.core.Holder$Reference);
  private void method_24228(boolean, net.minecraft.client.Minecraft$GameLoadCookie, java.util.concurrent.CompletableFuture, java.util.Optional);
  private void method_29339(java.util.concurrent.CompletableFuture, net.minecraft.client.Minecraft$GameLoadCookie);
  private void method_49293(boolean, net.minecraft.client.Minecraft$GameLoadCookie, java.lang.Throwable);
  private static net.minecraft.CrashReport method_43588(net.minecraft.CrashReport);
  private net.minecraft.CrashReport method_43589(net.minecraft.CrashReport);
  private void method_24229(net.minecraft.network.chat.Component);
  private static net.minecraft.client.gui.screens.Screen method_53519(com.mojang.authlib.GameProfile, java.lang.Runnable);
  private static net.minecraft.client.gui.screens.Screen method_53520(com.mojang.authlib.minecraft.BanDetails, java.lang.Runnable);
  private static void method_53524(java.lang.Runnable, boolean);
  private net.minecraft.client.gui.screens.Screen method_53523(java.lang.Runnable);
  private void method_53529(net.minecraft.client.gui.screens.Screen);
  private void method_53528(net.minecraft.client.Minecraft$GameLoadCookie, boolean);
  private int method_16010();
  private void method_53522(net.minecraft.client.Minecraft$GameLoadCookie, java.util.Optional);
  private void method_29338(net.minecraft.client.Minecraft$GameLoadCookie);
  private void method_53521(net.minecraft.client.Minecraft$GameLoadCookie, java.lang.Throwable);
  private void method_60320(net.minecraft.client.resources.language.ClientLanguage);
  private java.lang.String method_68467(net.minecraft.resources.Identifier, com.mojang.blaze3d.shaders.ShaderType);
  private com.mojang.authlib.minecraft.UserApiService$UserProperties method_55608();
  private com.mojang.authlib.yggdrasil.ProfileResult method_53464();
  static {};
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
```

## Probe task log

```

> Configure project :
Fabric Loom: 1.14.10

> Task :probeApi
Wrote /home/runner/work/F1Client/F1Client/build/probe-api.txt (49172 bytes; 91 classes matched)
gradle/actions: Writing build results to /home/runner/work/_temp/.gradle-actions/build-results/__run_2-1794595659124.json

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
20:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/Modules.java:106: error: cannot find symbol
25:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/F1Client.java:42: error: cannot find symbol
32:> Task :compileJava FAILED
37:FAILURE: Build failed with an exception.
39:* What went wrong:
40:Execution failed for task ':compileJava'.
42:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/Freecam.java:60: error: cannot find symbol
47:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/Modules.java:106: error: cannot find symbol
52:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/F1Client.java:42: error: cannot find symbol
64:org.gradle.api.tasks.TaskExecutionException: Execution failed for task ':compileJava'.
65:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.lambda$executeIfValid$1(ExecuteActionsTaskExecuter.java:135)
66:	at org.gradle.internal.Try$Failure.ifSuccessfulOrElse(Try.java:288)
67:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:133)
68:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:121)
69:	at org.gradle.api.internal.tasks.execution.ProblemsTaskPathTrackingTaskExecuter.execute(ProblemsTaskPathTrackingTaskExecuter.java:41)
70:	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
71:	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
72:	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
73:	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
74:	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
75:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
76:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
77:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
78:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:209)
79:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
80:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
81:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
82:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
83:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
84:	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
85:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
86:	at org.gradle.execution.plan.DefaultNodeExecutor.executeLocalTaskNode(DefaultNodeExecutor.java:55)
87:	at org.gradle.execution.plan.DefaultNodeExecutor.execute(DefaultNodeExecutor.java:34)
88:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:355)
89:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:343)
90:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.lambda$execute$0(DefaultTaskExecutionGraph.java:339)
91:	at org.gradle.internal.operations.CurrentBuildOperationRef.with(CurrentBuildOperationRef.java:84)
92:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:339)
93:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:328)
94:	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:459)
95:	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:376)
96:	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
97:	at org.gradle.internal.concurrent.AbstractManagedExecutor$1.run(AbstractManagedExecutor.java:47)
98:Caused by: org.gradle.api.internal.tasks.compile.CompilationFailedException: Compilation failed; see the compiler output below.
99:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/Freecam.java:60: error: cannot find symbol
104:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/Modules.java:106: error: cannot find symbol
109:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/F1Client.java:42: error: cannot find symbol
115:	at org.gradle.api.internal.tasks.compile.JdkJavaCompiler.execute(JdkJavaCompiler.java:89)
116:	at org.gradle.api.internal.tasks.compile.JdkJavaCompiler.execute(JdkJavaCompiler.java:50)
117:	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.delegateAndHandleErrors(NormalizingJavaCompiler.java:98)
118:	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.execute(NormalizingJavaCompiler.java:52)
119:	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.execute(NormalizingJavaCompiler.java:38)
120:	at org.gradle.api.internal.tasks.compile.AnnotationProcessorDiscoveringCompiler.execute(AnnotationProcessorDiscoveringCompiler.java:52)
121:	at org.gradle.api.internal.tasks.compile.AnnotationProcessorDiscoveringCompiler.execute(AnnotationProcessorDiscoveringCompiler.java:38)
122:	at org.gradle.api.internal.tasks.compile.ModuleApplicationNameWritingCompiler.execute(ModuleApplicationNameWritingCompiler.java:46)
123:	at org.gradle.api.internal.tasks.compile.ModuleApplicationNameWritingCompiler.execute(ModuleApplicationNameWritingCompiler.java:36)
124:	at org.gradle.jvm.toolchain.internal.DefaultToolchainJavaCompiler.execute(DefaultToolchainJavaCompiler.java:57)
125:	at org.gradle.api.tasks.compile.JavaCompile.lambda$createToolchainCompiler$3(JavaCompile.java:206)
126:	at org.gradle.api.internal.tasks.compile.CleaningJavaCompiler.execute(CleaningJavaCompiler.java:53)
127:	at org.gradle.api.internal.tasks.compile.incremental.IncrementalCompilerFactory.lambda$createRebuildAllCompiler$0(IncrementalCompilerFactory.java:55)
128:	at org.gradle.api.internal.tasks.compile.incremental.SelectiveCompiler.execute(SelectiveCompiler.java:70)
129:	at org.gradle.api.internal.tasks.compile.incremental.SelectiveCompiler.execute(SelectiveCompiler.java:44)
130:	at org.gradle.api.internal.tasks.compile.incremental.IncrementalResultStoringCompiler.execute(IncrementalResultStoringCompiler.java:66)
131:	at org.gradle.api.internal.tasks.compile.incremental.IncrementalResultStoringCompiler.execute(IncrementalResultStoringCompiler.java:52)
132:	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler$1.call(CompileJavaBuildOperationReportingCompiler.java:64)
133:	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler$1.call(CompileJavaBuildOperationReportingCompiler.java:48)
134:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:209)
135:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
136:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
137:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
138:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
139:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
140:	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
141:	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler.execute(CompileJavaBuildOperationReportingCompiler.java:48)
142:	at org.gradle.api.tasks.compile.JavaCompile.performCompilation(JavaCompile.java:224)
143:	at org.gradle.api.tasks.compile.JavaCompile.performIncrementalCompilation(JavaCompile.java:165)
144:	at org.gradle.api.tasks.compile.JavaCompile.compile(JavaCompile.java:150)
145:	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
146:	at org.gradle.api.internal.project.taskfactory.IncrementalTaskAction.doExecute(IncrementalTaskAction.java:45)
147:	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
148:	at org.gradle.api.internal.project.taskfactory.IncrementalTaskAction.execute(IncrementalTaskAction.java:26)
149:	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
150:	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:252)
151:	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
152:	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
153:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
154:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
155:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
156:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
157:	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
158:	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:237)
159:	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:220)
160:	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:203)
161:	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:170)
162:	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
163:	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
164:	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
165:	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
166:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:209)
167:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
168:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
169:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
170:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
171:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
172:	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
173:	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
174:	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
175:	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:42)
176:	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:75)
177:	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
178:	at org.gradle.internal.execution.steps.PreCreateOutputParentsStep.execute(PreCreateOutputParentsStep.java:50)
179:	at org.gradle.internal.execution.steps.PreCreateOutputParentsStep.execute(PreCreateOutputParentsStep.java:28)
180:	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:68)
181:	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:38)
182:	at org.gradle.internal.execution.steps.BroadcastChangingOutputsStep.execute(BroadcastChangingOutputsStep.java:61)
183:	at org.gradle.internal.execution.steps.BroadcastChangingOutputsStep.execute(BroadcastChangingOutputsStep.java:26)
184:	at org.gradle.internal.execution.steps.CaptureOutputsAfterExecutionStep.execute(CaptureOutputsAfterExecutionStep.java:69)
185:	at org.gradle.internal.execution.steps.CaptureOutputsAfterExecutionStep.execute(CaptureOutputsAfterExecutionStep.java:46)
186:	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:39)
187:	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:28)
188:	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:189)
189:	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:75)
190:	at org.gradle.internal.Either$Right.fold(Either.java:176)
191:	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:62)
192:	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:73)
193:	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:48)
194:	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:46)
195:	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:35)
196:	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:75)
197:	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:53)
198:	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:53)
199:	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:35)
200:	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
201:	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
202:	at org.gradle.internal.execution.steps.ResolveIncrementalCachingStateStep.executeDelegate(ResolveIncrementalCachingStateStep.java:49)
203:	at org.gradle.internal.execution.steps.ResolveIncrementalCachingStateStep.executeDelegate(ResolveIncrementalCachingStateStep.java:27)
204:	at org.gradle.internal.execution.steps.AbstractResolveCachingStateStep.execute(AbstractResolveCachingStateStep.java:71)
205:	at org.gradle.internal.execution.steps.AbstractResolveCachingStateStep.execute(AbstractResolveCachingStateStep.java:39)
206:	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:64)
207:	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:35)
208:	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:62)
209:	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:40)
210:	at org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep.execute(AbstractCaptureStateBeforeExecutionStep.java:76)
211:	at org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep.execute(AbstractCaptureStateBeforeExecutionStep.java:45)
212:	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.executeWithNonEmptySources(AbstractSkipEmptyWorkStep.java:136)
213:	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.execute(AbstractSkipEmptyWorkStep.java:66)
214:	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.execute(AbstractSkipEmptyWorkStep.java:38)
215:	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
216:	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
217:	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
218:	at org.gradle.internal.execution.steps.HandleStaleOutputsStep.execute(HandleStaleOutputsStep.java:75)
219:	at org.gradle.internal.execution.steps.HandleStaleOutputsStep.execute(HandleStaleOutputsStep.java:41)
220:	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.lambda$execute$0(AssignMutableWorkspaceStep.java:35)
221:	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:297)
222:	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.execute(AssignMutableWorkspaceStep.java:31)
223:	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.execute(AssignMutableWorkspaceStep.java:22)
224:	at org.gradle.internal.execution.steps.ChoosePipelineStep.execute(ChoosePipelineStep.java:40)
225:	at org.gradle.internal.execution.steps.ChoosePipelineStep.execute(ChoosePipelineStep.java:23)
226:	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.lambda$execute$2(ExecuteWorkBuildOperationFiringStep.java:67)
227:	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.execute(ExecuteWorkBuildOperationFiringStep.java:67)
228:	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.execute(ExecuteWorkBuildOperationFiringStep.java:39)
229:	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:46)
230:	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:34)
231:	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:44)
232:	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:31)
233:	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
234:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:132)
244:BUILD FAILED in 28s
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

BUILD FAILED in 28s
1 actionable task: 1 executed
```
