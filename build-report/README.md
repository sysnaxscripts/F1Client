# Last build

Run: https://github.com/sysnaxscripts/F1Client/actions/runs/43487006521
Commit under test: 3382e87d7fb1f910e2f586a10083d95f369f2136
Generated on: 2026-11-13T18:54:38Z

## build/libs

```
total 636
-rw-r--r-- 1 runner runner 650132 Nov 13 18:54 f1-0.02.jar
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

signatures of the first 12 dump matches:

=== net.fabricmc.fabric.mixin.attachment.client.ClientPacketListenerMixin   [fabric-data-attachment-api-v1-4abd26ae-1.8.48+eed0806f3e.jar] ===
Compiled from "ClientPacketListenerMixin.java"
abstract class net.fabricmc.fabric.mixin.attachment.client.ClientPacketListenerMixin {
  net.fabricmc.fabric.mixin.attachment.client.ClientPacketListenerMixin();
  private void copyAttachmentsOnClientRespawn(net.minecraft.client.Minecraft, net.minecraft.client.player.LocalPlayer, com.llamalad7.mixinextras.injector.wrapoperation.Operation<java.lang.Void>, net.minecraft.network.protocol.game.ClientboundRespawnPacket, net.minecraft.client.player.LocalPlayer);
}

=== net.fabricmc.fabric.mixin.client.message.ClientPacketListenerMixin   [fabric-message-api-v1-4abd26ae-6.1.12+4ebb5c083e.jar] ===
Compiled from "ClientPacketListenerMixin.java"
public abstract class net.fabricmc.fabric.mixin.client.message.ClientPacketListenerMixin {
  public net.fabricmc.fabric.mixin.client.message.ClientPacketListenerMixin();
  private void fabric_allowSendChatMessage(java.lang.String, org.spongepowered.asm.mixin.injection.callback.CallbackInfo, com.llamalad7.mixinextras.sugar.ref.LocalRef<java.lang.String>);
  private void fabric_allowSendCommandMessage(java.lang.String, org.spongepowered.asm.mixin.injection.callback.CallbackInfo, com.llamalad7.mixinextras.sugar.ref.LocalRef<java.lang.String>);
}

=== net.fabricmc.fabric.mixin.command.client.ClientPacketListenerMixin   [fabric-command-api-v2-4abd26ae-2.4.7+6b42a6003e.jar] ===
Compiled from "ClientPacketListenerMixin.java"
abstract class net.fabricmc.fabric.mixin.command.client.ClientPacketListenerMixin implements net.fabricmc.fabric.impl.command.client.ClientCommandInternals$LastReceivedCommandsPacketAccessor {
  private com.mojang.brigadier.CommandDispatcher<net.minecraft.commands.SharedSuggestionProvider> commands;
  private net.minecraft.client.multiplayer.ClientSuggestionProvider suggestionsProvider;
  private net.minecraft.world.flag.FeatureFlagSet enabledFeatures;
  private net.minecraft.core.RegistryAccess$Frozen registryAccess;
  private net.minecraft.network.protocol.game.ClientboundCommandsPacket lastReceivedCommandsPacket;
  net.fabricmc.fabric.mixin.command.client.ClientPacketListenerMixin();
  private void onGameJoin(net.minecraft.network.protocol.game.ClientboundLoginPacket, org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void onOnCommandTree(net.minecraft.network.protocol.game.ClientboundCommandsPacket, org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void setLastReceivedCommandsPacket(net.minecraft.network.protocol.game.ClientboundCommandsPacket, org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void onSendCommand(java.lang.String, net.minecraft.client.gui.screens.Screen, org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void onSendCommand(java.lang.String, org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  public net.minecraft.network.protocol.game.ClientboundCommandsPacket fabric_api$getLastReceivedCommandsPacket();
}

=== net.fabricmc.fabric.mixin.event.lifecycle.client.ClientPacketListenerMixin   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar] ===
Compiled from "ClientPacketListenerMixin.java"
abstract class net.fabricmc.fabric.mixin.event.lifecycle.client.ClientPacketListenerMixin {
  private net.minecraft.client.multiplayer.ClientLevel level;
  private net.minecraft.core.RegistryAccess$Frozen registryAccess;
  net.fabricmc.fabric.mixin.event.lifecycle.client.ClientPacketListenerMixin();
  private void onPlayerRespawn(net.minecraft.network.protocol.game.ClientboundRespawnPacket, org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void onGameJoin(net.minecraft.network.protocol.game.ClientboundLoginPacket, org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void onClearWorld(org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void invokeTagsLoaded(net.minecraft.network.protocol.common.ClientboundUpdateTagsPacket, org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
}

=== net.fabricmc.fabric.mixin.networking.client.ClientPacketListenerMixin   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar] ===
Compiled from "ClientPacketListenerMixin.java"
abstract class net.fabricmc.fabric.mixin.networking.client.ClientPacketListenerMixin extends net.minecraft.client.multiplayer.ClientCommonPacketListenerImpl implements net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions {
  private net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon addon;
  protected net.fabricmc.fabric.mixin.networking.client.ClientPacketListenerMixin(net.minecraft.client.Minecraft, net.minecraft.network.Connection, net.minecraft.client.multiplayer.CommonListenerCookie);
  private void initAddon(org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  private void handleServerPlayReady(net.minecraft.network.protocol.game.ClientboundLoginPacket, org.spongepowered.asm.mixin.injection.callback.CallbackInfo);
  public net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon getAddon();
  public net.fabricmc.fabric.impl.networking.AbstractNetworkAddon getAddon();
}

=== net.fabricmc.fabric.mixin.recipe.client.sync.ClientPacketListenerMixin   [fabric-recipe-api-v1-4abd26ae-8.2.4+4ebb5c083e.jar] ===
Compiled from "ClientPacketListenerMixin.java"
public class net.fabricmc.fabric.mixin.recipe.client.sync.ClientPacketListenerMixin {
  private net.minecraft.client.multiplayer.ClientRecipeContainer recipes;
  public net.fabricmc.fabric.mixin.recipe.client.sync.ClientPacketListenerMixin();
  private void copyPreviousRecipes(net.minecraft.client.multiplayer.ClientPacketListener, net.minecraft.client.multiplayer.ClientRecipeContainer, com.llamalad7.mixinextras.injector.wrapoperation.Operation<java.lang.Void>);
}

=== net.minecraft.client.multiplayer.ClientPacketListener   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "ClientPacketListener.java"
public class net.minecraft.client.multiplayer.ClientPacketListener extends net.minecraft.client.multiplayer.ClientCommonPacketListenerImpl implements net.minecraft.network.protocol.game.ClientGamePacketListener,net.minecraft.network.TickablePacketListener {
  private static final org.slf4j.Logger LOGGER;
  private static final net.minecraft.network.chat.Component UNSECURE_SERVER_TOAST_TITLE;
  private static final net.minecraft.network.chat.Component UNSERURE_SERVER_TOAST;
  private static final net.minecraft.network.chat.Component INVALID_PACKET;
  private static final net.minecraft.network.chat.Component RECONFIGURE_SCREEN_MESSAGE;
  private static final net.minecraft.network.chat.Component BAD_CHAT_INDEX;
  private static final net.minecraft.network.chat.Component COMMAND_SEND_CONFIRM_TITLE;
  private static final net.minecraft.network.chat.Component BUTTON_RUN_COMMAND;
  private static final net.minecraft.network.chat.Component BUTTON_SUGGEST_COMMAND;
  private static final int PENDING_OFFSET_THRESHOLD;
  public static final int TELEPORT_INTERPOLATION_THRESHOLD;
  private static final net.minecraft.server.permissions.Permission RESTRICTED_COMMAND;
  static final net.minecraft.server.permissions.PermissionCheck RESTRICTED_COMMAND_CHECK;
  private static final net.minecraft.server.permissions.PermissionSet ALLOW_RESTRICTED_COMMANDS;
  private static final net.minecraft.network.protocol.game.ClientboundCommandsPacket$NodeBuilder<net.minecraft.client.multiplayer.ClientSuggestionProvider> COMMAND_NODE_BUILDER;
  private final com.mojang.authlib.GameProfile localGameProfile;
  private net.minecraft.client.multiplayer.ClientLevel level;
  private net.minecraft.client.multiplayer.ClientLevel$ClientLevelData levelData;
  private final java.util.Map<java.util.UUID, net.minecraft.client.multiplayer.PlayerInfo> playerInfoMap;
  private final java.util.Set<net.minecraft.client.multiplayer.PlayerInfo> listedPlayers;
  private final net.minecraft.client.multiplayer.ClientAdvancements advancements;
  private final net.minecraft.client.multiplayer.ClientSuggestionProvider suggestionsProvider;
  private final net.minecraft.client.multiplayer.ClientSuggestionProvider restrictedSuggestionsProvider;
  private final net.minecraft.client.DebugQueryHandler debugQueryHandler;
  private int serverChunkRadius;
  private int serverSimulationDistance;
  private final net.minecraft.util.RandomSource random;
  private com.mojang.brigadier.CommandDispatcher<net.minecraft.client.multiplayer.ClientSuggestionProvider> commands;
  private net.minecraft.client.multiplayer.ClientRecipeContainer recipes;
  private final java.util.UUID id;
  private java.util.Set<net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level>> levels;
  private final net.minecraft.core.RegistryAccess$Frozen registryAccess;
  private final net.minecraft.world.flag.FeatureFlagSet enabledFeatures;
  private final net.minecraft.world.item.alchemy.PotionBrewing potionBrewing;
  private net.minecraft.world.level.block.entity.FuelValues fuelValues;
  private final net.minecraft.network.HashedPatchMap$HashGenerator decoratedHashOpsGenerator;
  private java.util.OptionalInt removedPlayerVehicleId;
  private net.minecraft.network.chat.LocalChatSession chatSession;
  private net.minecraft.network.chat.SignedMessageChain$Encoder signedMessageEncoder;
  private int nextChatIndex;
  private net.minecraft.network.chat.LastSeenMessagesTracker lastSeenMessages;
  private net.minecraft.network.chat.MessageSignatureCache messageSignatureCache;
  private java.util.concurrent.CompletableFuture<java.util.Optional<net.minecraft.world.entity.player.ProfileKeyPair>> keyPairFuture;
  private net.minecraft.server.level.ClientInformation remoteClientInformation;
  private final net.minecraft.client.multiplayer.ChunkBatchSizeCalculator chunkBatchSizeCalculator;
  private final net.minecraft.client.multiplayer.PingDebugMonitor pingDebugMonitor;
  private final net.minecraft.client.multiplayer.ClientDebugSubscriber debugSubscriber;
  private net.minecraft.client.multiplayer.LevelLoadTracker levelLoadTracker;
  private boolean serverEnforcesSecureChat;
  private volatile boolean closed;
  private final net.minecraft.world.scores.Scoreboard scoreboard;
  private final net.minecraft.client.waypoints.ClientWaypointManager waypointManager;
  private final net.minecraft.client.multiplayer.SessionSearchTrees searchTrees;
  private final java.util.List<java.lang.ref.WeakReference<net.minecraft.client.multiplayer.CacheSlot<?, ?>>> cacheSlots;
  private boolean clientLoaded;
  public net.minecraft.client.multiplayer.ClientPacketListener(net.minecraft.client.Minecraft, net.minecraft.network.Connection, net.minecraft.client.multiplayer.CommonListenerCookie);
  public net.minecraft.client.multiplayer.ClientSuggestionProvider getSuggestionsProvider();
  public void close();
  public void clearLevel();
  private void clearCacheSlots();
  public net.minecraft.world.item.crafting.RecipeAccess recipes();
  public void handleLogin(net.minecraft.network.protocol.game.ClientboundLoginPacket);
  public void handleAddEntity(net.minecraft.network.protocol.game.ClientboundAddEntityPacket);
  private net.minecraft.world.entity.Entity createEntityFromPacket(net.minecraft.network.protocol.game.ClientboundAddEntityPacket);
  private void postAddEntitySoundInstance(net.minecraft.world.entity.Entity);
  public void handleSetEntityMotion(net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket);
  public void handleSetEntityData(net.minecraft.network.protocol.game.ClientboundSetEntityDataPacket);
  public void handleEntityPositionSync(net.minecraft.network.protocol.game.ClientboundEntityPositionSyncPacket);
  public void handleTeleportEntity(net.minecraft.network.protocol.game.ClientboundTeleportEntityPacket);
  public void handleTickingState(net.minecraft.network.protocol.game.ClientboundTickingStatePacket);
  public void handleTickingStep(net.minecraft.network.protocol.game.ClientboundTickingStepPacket);
  public void handleSetHeldSlot(net.minecraft.network.protocol.game.ClientboundSetHeldSlotPacket);
  public void handleMoveEntity(net.minecraft.network.protocol.game.ClientboundMoveEntityPacket);
  public void handleMinecartAlongTrack(net.minecraft.network.protocol.game.ClientboundMoveMinecartPacket);
  public void handleRotateMob(net.minecraft.network.protocol.game.ClientboundRotateHeadPacket);
  public void handleRemoveEntities(net.minecraft.network.protocol.game.ClientboundRemoveEntitiesPacket);
  public void handleMovePlayer(net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket);
  private static boolean setValuesFromPositionPacket(net.minecraft.world.entity.PositionMoveRotation, java.util.Set<net.minecraft.world.entity.Relative>, net.minecraft.world.entity.Entity, boolean);
  public void handleRotatePlayer(net.minecraft.network.protocol.game.ClientboundPlayerRotationPacket);
  public void handleChunkBlocksUpdate(net.minecraft.network.protocol.game.ClientboundSectionBlocksUpdatePacket);
  public void handleLevelChunkWithLight(net.minecraft.network.protocol.game.ClientboundLevelChunkWithLightPacket);
  public void handleChunksBiomes(net.minecraft.network.protocol.game.ClientboundChunksBiomesPacket);
  private void updateLevelChunk(int, int, net.minecraft.network.protocol.game.ClientboundLevelChunkPacketData);
  private void enableChunkLight(net.minecraft.world.level.chunk.LevelChunk, int, int);
  public void handleForgetLevelChunk(net.minecraft.network.protocol.game.ClientboundForgetLevelChunkPacket);
  private void queueLightRemoval(net.minecraft.network.protocol.game.ClientboundForgetLevelChunkPacket);
  public void handleBlockUpdate(net.minecraft.network.protocol.game.ClientboundBlockUpdatePacket);
  public void handleConfigurationStart(net.minecraft.network.protocol.game.ClientboundStartConfigurationPacket);
  public void handleTakeItemEntity(net.minecraft.network.protocol.game.ClientboundTakeItemEntityPacket);
  public void handleSystemChat(net.minecraft.network.protocol.game.ClientboundSystemChatPacket);
  public void handlePlayerChat(net.minecraft.network.protocol.game.ClientboundPlayerChatPacket);
  public void handleDisguisedChat(net.minecraft.network.protocol.game.ClientboundDisguisedChatPacket);
  public void handleDeleteChat(net.minecraft.network.protocol.game.ClientboundDeleteChatPacket);
  public void handleAnimate(net.minecraft.network.protocol.game.ClientboundAnimatePacket);
  public void handleHurtAnimation(net.minecraft.network.protocol.game.ClientboundHurtAnimationPacket);
  public void handleSetTime(net.minecraft.network.protocol.game.ClientboundSetTimePacket);
  public void handleSetSpawn(net.minecraft.network.protocol.game.ClientboundSetDefaultSpawnPositionPacket);
  public void handleSetEntityPassengersPacket(net.minecraft.network.protocol.game.ClientboundSetPassengersPacket);
  public void handleEntityLinkPacket(net.minecraft.network.protocol.game.ClientboundSetEntityLinkPacket);
  private static net.minecraft.world.item.ItemStack findTotem(net.minecraft.world.entity.player.Player);
  public void handleEntityEvent(net.minecraft.network.protocol.game.ClientboundEntityEventPacket);
  public void handleDamageEvent(net.minecraft.network.protocol.game.ClientboundDamageEventPacket);
  public void handleSetHealth(net.minecraft.network.protocol.game.ClientboundSetHealthPacket);
  public void handleSetExperience(net.minecraft.network.protocol.game.ClientboundSetExperiencePacket);
  public void handleRespawn(net.minecraft.network.protocol.game.ClientboundRespawnPacket);
  private net.minecraft.client.gui.screens.LevelLoadingScreen$Reason determineLevelLoadingReason(boolean, net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level>, net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level>);
  public void handleExplosion(net.minecraft.network.protocol.game.ClientboundExplodePacket);
  public void handleMountScreenOpen(net.minecraft.network.protocol.game.ClientboundMountScreenOpenPacket);
  public void handleOpenScreen(net.minecraft.network.protocol.game.ClientboundOpenScreenPacket);
  public void handleContainerSetSlot(net.minecraft.network.protocol.game.ClientboundContainerSetSlotPacket);
  public void handleSetCursorItem(net.minecraft.network.protocol.game.ClientboundSetCursorItemPacket);
  public void handleSetPlayerInventory(net.minecraft.network.protocol.game.ClientboundSetPlayerInventoryPacket);
  public void handleContainerContent(net.minecraft.network.protocol.game.ClientboundContainerSetContentPacket);
  public void handleOpenSignEditor(net.minecraft.network.protocol.game.ClientboundOpenSignEditorPacket);
  public void handleBlockEntityData(net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket);
  public void handleContainerSetData(net.minecraft.network.protocol.game.ClientboundContainerSetDataPacket);
  public void handleSetEquipment(net.minecraft.network.protocol.game.ClientboundSetEquipmentPacket);
  public void handleContainerClose(net.minecraft.network.protocol.game.ClientboundContainerClosePacket);
  public void handleBlockEvent(net.minecraft.network.protocol.game.ClientboundBlockEventPacket);
  public void handleBlockDestruction(net.minecraft.network.protocol.game.ClientboundBlockDestructionPacket);
  public void handleGameEvent(net.minecraft.network.protocol.game.ClientboundGameEventPacket);
  private void startWaitingForNewLevel(net.minecraft.client.player.LocalPlayer, net.minecraft.client.multiplayer.ClientLevel, net.minecraft.client.gui.screens.LevelLoadingScreen$Reason);
  public void handleMapItemData(net.minecraft.network.protocol.game.ClientboundMapItemDataPacket);
  public void handleLevelEvent(net.minecraft.network.protocol.game.ClientboundLevelEventPacket);
  public void handleUpdateAdvancementsPacket(net.minecraft.network.protocol.game.ClientboundUpdateAdvancementsPacket);
  public void handleSelectAdvancementsTab(net.minecraft.network.protocol.game.ClientboundSelectAdvancementsTabPacket);
  public void handleCommands(net.minecraft.network.protocol.game.ClientboundCommandsPacket);
  public void handleStopSoundEvent(net.minecraft.network.protocol.game.ClientboundStopSoundPacket);
  public void handleCommandSuggestions(net.minecraft.network.protocol.game.ClientboundCommandSuggestionsPacket);
  public void handleUpdateRecipes(net.minecraft.network.protocol.game.ClientboundUpdateRecipesPacket);
  public void handleLookAt(net.minecraft.network.protocol.game.ClientboundPlayerLookAtPacket);
  public void handleTagQueryPacket(net.minecraft.network.protocol.game.ClientboundTagQueryPacket);
  public void handleAwardStats(net.minecraft.network.protocol.game.ClientboundAwardStatsPacket);
  public void handleRecipeBookAdd(net.minecraft.network.protocol.game.ClientboundRecipeBookAddPacket);
  public void handleRecipeBookRemove(net.minecraft.network.protocol.game.ClientboundRecipeBookRemovePacket);
  public void handleRecipeBookSettings(net.minecraft.network.protocol.game.ClientboundRecipeBookSettingsPacket);
  private void refreshRecipeBook(net.minecraft.client.ClientRecipeBook);
  public void handleUpdateMobEffect(net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket);
  private <T> net.minecraft.core.Registry$PendingTags<T> updateTags(net.minecraft.resources.ResourceKey<? extends net.minecraft.core.Registry<? extends T>>, net.minecraft.tags.TagNetworkSerialization$NetworkPayload);
  public void handleUpdateTags(net.minecraft.network.protocol.common.ClientboundUpdateTagsPacket);
  public void handlePlayerCombatEnd(net.minecraft.network.protocol.game.ClientboundPlayerCombatEndPacket);
  public void handlePlayerCombatEnter(net.minecraft.network.protocol.game.ClientboundPlayerCombatEnterPacket);
  public void handlePlayerCombatKill(net.minecraft.network.protocol.game.ClientboundPlayerCombatKillPacket);
  public void handleChangeDifficulty(net.minecraft.network.protocol.game.ClientboundChangeDifficultyPacket);
  public void handleSetCamera(net.minecraft.network.protocol.game.ClientboundSetCameraPacket);
  public void handleInitializeBorder(net.minecraft.network.protocol.game.ClientboundInitializeBorderPacket);
  public void handleSetBorderCenter(net.minecraft.network.protocol.game.ClientboundSetBorderCenterPacket);
  public void handleSetBorderLerpSize(net.minecraft.network.protocol.game.ClientboundSetBorderLerpSizePacket);
  public void handleSetBorderSize(net.minecraft.network.protocol.game.ClientboundSetBorderSizePacket);
  public void handleSetBorderWarningDistance(net.minecraft.network.protocol.game.ClientboundSetBorderWarningDistancePacket);
  public void handleSetBorderWarningDelay(net.minecraft.network.protocol.game.ClientboundSetBorderWarningDelayPacket);
  public void handleTitlesClear(net.minecraft.network.protocol.game.ClientboundClearTitlesPacket);
  public void handleServerData(net.minecraft.network.protocol.game.ClientboundServerDataPacket);
  public void handleCustomChatCompletions(net.minecraft.network.protocol.game.ClientboundCustomChatCompletionsPacket);
  public void setActionBarText(net.minecraft.network.protocol.game.ClientboundSetActionBarTextPacket);
  public void setTitleText(net.minecraft.network.protocol.game.ClientboundSetTitleTextPacket);
  public void setSubtitleText(net.minecraft.network.protocol.game.ClientboundSetSubtitleTextPacket);
  public void setTitlesAnimation(net.minecraft.network.protocol.game.ClientboundSetTitlesAnimationPacket);
  public void handleTabListCustomisation(net.minecraft.network.protocol.game.ClientboundTabListPacket);
  public void handleRemoveMobEffect(net.minecraft.network.protocol.game.ClientboundRemoveMobEffectPacket);
  public void handlePlayerInfoRemove(net.minecraft.network.protocol.game.ClientboundPlayerInfoRemovePacket);
  public void handlePlayerInfoUpdate(net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket);
  private void applyPlayerInfoUpdate(net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket$Action, net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket$Entry, net.minecraft.client.multiplayer.PlayerInfo);
  private void initializeChatSession(net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket$Entry, net.minecraft.client.multiplayer.PlayerInfo);
  private boolean enforcesSecureChat();
  public void handlePlayerAbilities(net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket);
  public void handleSoundEvent(net.minecraft.network.protocol.game.ClientboundSoundPacket);
  public void handleSoundEntityEvent(net.minecraft.network.protocol.game.ClientboundSoundEntityPacket);
  public void handleBossUpdate(net.minecraft.network.protocol.game.ClientboundBossEventPacket);
  public void handleItemCooldown(net.minecraft.network.protocol.game.ClientboundCooldownPacket);
  public void handleMoveVehicle(net.minecraft.network.protocol.game.ClientboundMoveVehiclePacket);
  public void handleOpenBook(net.minecraft.network.protocol.game.ClientboundOpenBookPacket);
  public void handleCustomPayload(net.minecraft.network.protocol.common.custom.CustomPacketPayload);
  private void handleUnknownCustomPayload(net.minecraft.network.protocol.common.custom.CustomPacketPayload);
  public void handleAddObjective(net.minecraft.network.protocol.game.ClientboundSetObjectivePacket);
  public void handleSetScore(net.minecraft.network.protocol.game.ClientboundSetScorePacket);
  public void handleResetScore(net.minecraft.network.protocol.game.ClientboundResetScorePacket);
  public void handleSetDisplayObjective(net.minecraft.network.protocol.game.ClientboundSetDisplayObjectivePacket);
  public void handleSetPlayerTeamPacket(net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket);
  public void handleParticleEvent(net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket);
  public void handleUpdateAttributes(net.minecraft.network.protocol.game.ClientboundUpdateAttributesPacket);
  public void handlePlaceRecipe(net.minecraft.network.protocol.game.ClientboundPlaceGhostRecipePacket);
  public void handleLightUpdatePacket(net.minecraft.network.protocol.game.ClientboundLightUpdatePacket);
  private void applyLightData(int, int, net.minecraft.network.protocol.game.ClientboundLightUpdatePacketData, boolean);
  public void handleMerchantOffers(net.minecraft.network.protocol.game.ClientboundMerchantOffersPacket);
  public void handleSetChunkCacheRadius(net.minecraft.network.protocol.game.ClientboundSetChunkCacheRadiusPacket);
  public void handleSetSimulationDistance(net.minecraft.network.protocol.game.ClientboundSetSimulationDistancePacket);
  public void handleSetChunkCacheCenter(net.minecraft.network.protocol.game.ClientboundSetChunkCacheCenterPacket);
  public void handleBlockChangedAck(net.minecraft.network.protocol.game.ClientboundBlockChangedAckPacket);
  public void handleBundlePacket(net.minecraft.network.protocol.game.ClientboundBundlePacket);
  public void handleProjectilePowerPacket(net.minecraft.network.protocol.game.ClientboundProjectilePowerPacket);
  public void handleChunkBatchStart(net.minecraft.network.protocol.game.ClientboundChunkBatchStartPacket);
  public void handleChunkBatchFinished(net.minecraft.network.protocol.game.ClientboundChunkBatchFinishedPacket);
  public void handleDebugSample(net.minecraft.network.protocol.game.ClientboundDebugSamplePacket);
  public void handlePongResponse(net.minecraft.network.protocol.ping.ClientboundPongResponsePacket);
  public void handleTestInstanceBlockStatus(net.minecraft.network.protocol.game.ClientboundTestInstanceBlockStatus);
  public void handleWaypoint(net.minecraft.network.protocol.game.ClientboundTrackedWaypointPacket);
  public void handleDebugChunkValue(net.minecraft.network.protocol.game.ClientboundDebugChunkValuePacket);
  public void handleDebugBlockValue(net.minecraft.network.protocol.game.ClientboundDebugBlockValuePacket);
  public void handleDebugEntityValue(net.minecraft.network.protocol.game.ClientboundDebugEntityValuePacket);
  public void handleDebugEvent(net.minecraft.network.protocol.game.ClientboundDebugEventPacket);
  public void handleGameTestHighlightPos(net.minecraft.network.protocol.game.ClientboundGameTestHighlightPosPacket);
  private void readSectionList(int, int, net.minecraft.world.level.lighting.LevelLightEngine, net.minecraft.world.level.LightLayer, java.util.BitSet, java.util.BitSet, java.util.Iterator<byte[]>, boolean);
  public net.minecraft.network.Connection getConnection();
  public boolean isAcceptingMessages();
  public java.util.Collection<net.minecraft.client.multiplayer.PlayerInfo> getListedOnlinePlayers();
  public java.util.Collection<net.minecraft.client.multiplayer.PlayerInfo> getOnlinePlayers();
  public java.util.Collection<java.util.UUID> getOnlinePlayerIds();
  public net.minecraft.client.multiplayer.PlayerInfo getPlayerInfo(java.util.UUID);
  public net.minecraft.client.multiplayer.PlayerInfo getPlayerInfo(java.lang.String);
  public java.util.Map<java.util.UUID, net.minecraft.client.multiplayer.PlayerInfo> getSeenPlayers();
  public net.minecraft.client.multiplayer.PlayerInfo getPlayerInfoIgnoreCase(java.lang.String);
  public com.mojang.authlib.GameProfile getLocalGameProfile();
  public net.minecraft.client.multiplayer.ClientAdvancements getAdvancements();
  public com.mojang.brigadier.CommandDispatcher<net.minecraft.client.multiplayer.ClientSuggestionProvider> getCommands();
  public net.minecraft.client.multiplayer.ClientLevel getLevel();
  public net.minecraft.client.DebugQueryHandler getDebugQueryHandler();
  public java.util.UUID getId();
  public java.util.Set<net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level>> levels();
  public net.minecraft.core.RegistryAccess$Frozen registryAccess();
  public void markMessageAsProcessed(net.minecraft.network.chat.MessageSignature, boolean);
  private void sendChatAcknowledgement();
  public void sendChat(java.lang.String);
  public void sendCommand(java.lang.String);
  public void sendUnattendedCommand(java.lang.String, net.minecraft.client.gui.screens.Screen);
  private net.minecraft.client.multiplayer.ClientPacketListener$CommandCheckResult verifyCommand(java.lang.String);
  private static boolean isValidCommand(com.mojang.brigadier.ParseResults<?>);
  private void openSendConfirmationWindow(java.lang.String, java.lang.String, net.minecraft.network.chat.Component, java.lang.Runnable);
  private void openCommandSendConfirmationWindow(java.lang.String, java.lang.String, net.minecraft.client.gui.screens.Screen);
  private void openSignedCommandSendConfirmationWindow(java.lang.String, java.lang.String, net.minecraft.client.gui.screens.Screen);
  public void broadcastClientInformation(net.minecraft.server.level.ClientInformation);
  public void tick();
  private void notifyPlayerLoaded();
  public void prepareKeyPair();
  private void setKeyPair(net.minecraft.world.entity.player.ProfileKeyPair);
  protected net.minecraft.client.gui.screens.dialog.DialogConnectionAccess createDialogAccess();
  public net.minecraft.client.multiplayer.ServerData getServerData();
  public net.minecraft.world.flag.FeatureFlagSet enabledFeatures();
  public boolean isFeatureEnabled(net.minecraft.world.flag.FeatureFlagSet);
  public net.minecraft.world.scores.Scoreboard scoreboard();
  public net.minecraft.world.item.alchemy.PotionBrewing potionBrewing();
  public net.minecraft.world.level.block.entity.FuelValues fuelValues();
  public void updateSearchTrees();
  public net.minecraft.client.multiplayer.SessionSearchTrees searchTrees();
  public void registerForCleaning(net.minecraft.client.multiplayer.CacheSlot<?, ?>);
  public net.minecraft.network.HashedPatchMap$HashGenerator decoratedHashOpsGenenerator();
  public net.minecraft.client.waypoints.ClientWaypointManager getWaypointManager();
  public net.minecraft.util.debug.DebugValueAccess createDebugValueAccess();
  public boolean hasClientLoaded();
  private void setClientLoaded(boolean);
  private void method_73232(boolean, java.lang.String, net.minecraft.client.gui.screens.Screen);
  private void method_71928(java.lang.String, net.minecraft.client.gui.screens.Screen);
  private void method_73230(java.lang.Runnable, net.minecraft.client.gui.screens.Screen, boolean);
  private net.minecraft.network.chat.MessageSignature method_45722(java.time.Instant, long, net.minecraft.network.chat.LastSeenMessagesTracker$Update, java.lang.String);
  private void method_38545(int, int, net.minecraft.network.protocol.game.ClientboundLightUpdatePacketData);
  private static void method_34010(net.minecraft.world.scores.PlayerTeam, net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket$Parameters);
  private void method_62150(boolean, java.util.List, net.minecraft.resources.ResourceKey, net.minecraft.tags.TagNetworkSerialization$NetworkPayload);
  private void method_34018();
  private static void method_34008(net.minecraft.world.entity.LivingEntity, com.mojang.datafixers.util.Pair);
  private void method_38542(net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket, net.minecraft.world.level.block.entity.BlockEntity);
  private void method_51685(net.minecraft.world.level.ChunkPos);
  private void method_51769(int, int, net.minecraft.network.protocol.game.ClientboundLightUpdatePacketData);
  private void method_34007(net.minecraft.core.BlockPos, net.minecraft.world.level.block.state.BlockState);
  private void method_64896(int);
  private static boolean method_75405(net.minecraft.client.Minecraft, net.minecraft.server.permissions.Permission);
  private static java.lang.Integer method_68824(net.minecraft.resources.RegistryOps, net.minecraft.core.component.TypedDataComponent);
  private static java.lang.IllegalArgumentException method_68825(net.minecraft.core.component.TypedDataComponent, java.lang.String);
  private static boolean method_75404(net.minecraft.server.permissions.Permission);
  static {};
}

=== net.minecraft.client.resources.sounds.SoundEventRegistration   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "SoundEventRegistration.java"
public class net.minecraft.client.resources.sounds.SoundEventRegistration {
  private final java.util.List<net.minecraft.client.resources.sounds.Sound> sounds;
  private final boolean replace;
  private final java.lang.String subtitle;
  public net.minecraft.client.resources.sounds.SoundEventRegistration(java.util.List<net.minecraft.client.resources.sounds.Sound>, boolean, java.lang.String);
  public java.util.List<net.minecraft.client.resources.sounds.Sound> getSounds();
  public boolean isReplace();
  public java.lang.String getSubtitle();
}

=== net.minecraft.client.resources.sounds.SoundEventRegistrationSerializer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "SoundEventRegistrationSerializer.java"
public class net.minecraft.client.resources.sounds.SoundEventRegistrationSerializer implements com.google.gson.JsonDeserializer<net.minecraft.client.resources.sounds.SoundEventRegistration> {
  private static final net.minecraft.util.valueproviders.FloatProvider DEFAULT_FLOAT;
  public net.minecraft.client.resources.sounds.SoundEventRegistrationSerializer();
  public net.minecraft.client.resources.sounds.SoundEventRegistration deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext) throws com.google.gson.JsonParseException;
  private java.util.List<net.minecraft.client.resources.sounds.Sound> getSounds(com.google.gson.JsonObject);
  private net.minecraft.client.resources.sounds.Sound getSound(com.google.gson.JsonObject);
  private net.minecraft.client.resources.sounds.Sound$Type getType(com.google.gson.JsonObject, net.minecraft.client.resources.sounds.Sound$Type);
  public java.lang.Object deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext) throws com.google.gson.JsonParseException;
  static {};
}

=== net.minecraft.client.sounds.SoundEventListener   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "SoundEventListener.java"
public interface net.minecraft.client.sounds.SoundEventListener {
  public abstract void onPlaySound(net.minecraft.client.resources.sounds.SoundInstance, net.minecraft.client.sounds.WeighedSoundEvents, float);
}

=== net.minecraft.sounds.SoundEvent   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "SoundEvent.java"
public final class net.minecraft.sounds.SoundEvent extends java.lang.Record {
  private final net.minecraft.resources.Identifier location;
  private final java.util.Optional<java.lang.Float> fixedRange;
  public static final com.mojang.serialization.Codec<net.minecraft.sounds.SoundEvent> DIRECT_CODEC;
  public static final com.mojang.serialization.Codec<net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent>> CODEC;
  public static final net.minecraft.network.codec.StreamCodec<io.netty.buffer.ByteBuf, net.minecraft.sounds.SoundEvent> DIRECT_STREAM_CODEC;
  public static final net.minecraft.network.codec.StreamCodec<net.minecraft.network.RegistryFriendlyByteBuf, net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent>> STREAM_CODEC;
  public net.minecraft.sounds.SoundEvent(net.minecraft.resources.Identifier, java.util.Optional<java.lang.Float>);
  private static net.minecraft.sounds.SoundEvent create(net.minecraft.resources.Identifier, java.util.Optional<java.lang.Float>);
  public static net.minecraft.sounds.SoundEvent createVariableRangeEvent(net.minecraft.resources.Identifier);
  public static net.minecraft.sounds.SoundEvent createFixedRangeEvent(net.minecraft.resources.Identifier, float);
  public float getRange(float);
  public final java.lang.String toString();
  public final int hashCode();
  public final boolean equals(java.lang.Object);
  public net.minecraft.resources.Identifier location();
  public java.util.Optional<java.lang.Float> fixedRange();
  private static net.minecraft.sounds.SoundEvent method_47960(net.minecraft.resources.Identifier);
  private static net.minecraft.sounds.SoundEvent method_47955(net.minecraft.resources.Identifier, java.lang.Float);
  private static com.mojang.datafixers.kinds.App method_47957(com.mojang.serialization.codecs.RecordCodecBuilder$Instance);
  static {};
}

=== net.minecraft.sounds.SoundEvents   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "SoundEvents.java"
public class net.minecraft.sounds.SoundEvents {
  public static final net.minecraft.sounds.SoundEvent ALLAY_AMBIENT_WITH_ITEM;
  public static final net.minecraft.sounds.SoundEvent ALLAY_AMBIENT_WITHOUT_ITEM;
  public static final net.minecraft.sounds.SoundEvent ALLAY_DEATH;
  public static final net.minecraft.sounds.SoundEvent ALLAY_HURT;
  public static final net.minecraft.sounds.SoundEvent ALLAY_ITEM_GIVEN;
  public static final net.minecraft.sounds.SoundEvent ALLAY_ITEM_TAKEN;
  public static final net.minecraft.sounds.SoundEvent ALLAY_THROW;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> AMBIENT_CAVE;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> AMBIENT_BASALT_DELTAS_ADDITIONS;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> AMBIENT_BASALT_DELTAS_LOOP;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> AMBIENT_BASALT_DELTAS_MOOD;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> AMBIENT_CRIMSON_FOREST_ADDITIONS;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> AMBIENT_CRIMSON_FOREST_LOOP;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> AMBIENT_CRIMSON_FOREST_MOOD;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> AMBIENT_NETHER_WASTES_ADDITIONS;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> AMBIENT_NETHER_WASTES_LOOP;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> AMBIENT_NETHER_WASTES_MOOD;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> AMBIENT_SOUL_SAND_VALLEY_ADDITIONS;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> AMBIENT_SOUL_SAND_VALLEY_LOOP;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> AMBIENT_SOUL_SAND_VALLEY_MOOD;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> AMBIENT_WARPED_FOREST_ADDITIONS;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> AMBIENT_WARPED_FOREST_LOOP;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> AMBIENT_WARPED_FOREST_MOOD;
  public static final net.minecraft.sounds.SoundEvent AMBIENT_UNDERWATER_ENTER;
  public static final net.minecraft.sounds.SoundEvent AMBIENT_UNDERWATER_EXIT;
  public static final net.minecraft.sounds.SoundEvent AMBIENT_UNDERWATER_LOOP;
  public static final net.minecraft.sounds.SoundEvent AMBIENT_UNDERWATER_LOOP_ADDITIONS;
  public static final net.minecraft.sounds.SoundEvent AMBIENT_UNDERWATER_LOOP_ADDITIONS_RARE;
  public static final net.minecraft.sounds.SoundEvent AMBIENT_UNDERWATER_LOOP_ADDITIONS_ULTRA_RARE;
  public static final net.minecraft.sounds.SoundEvent AMETHYST_BLOCK_BREAK;
  public static final net.minecraft.sounds.SoundEvent AMETHYST_BLOCK_CHIME;
  public static final net.minecraft.sounds.SoundEvent AMETHYST_BLOCK_FALL;
  public static final net.minecraft.sounds.SoundEvent AMETHYST_BLOCK_HIT;
  public static final net.minecraft.sounds.SoundEvent AMETHYST_BLOCK_PLACE;
  public static final net.minecraft.sounds.SoundEvent AMETHYST_BLOCK_RESONATE;
  public static final net.minecraft.sounds.SoundEvent AMETHYST_BLOCK_STEP;
  public static final net.minecraft.sounds.SoundEvent AMETHYST_CLUSTER_BREAK;
  public static final net.minecraft.sounds.SoundEvent AMETHYST_CLUSTER_FALL;
  public static final net.minecraft.sounds.SoundEvent AMETHYST_CLUSTER_HIT;
  public static final net.minecraft.sounds.SoundEvent AMETHYST_CLUSTER_PLACE;
  public static final net.minecraft.sounds.SoundEvent AMETHYST_CLUSTER_STEP;
  public static final net.minecraft.sounds.SoundEvent ANCIENT_DEBRIS_BREAK;
  public static final net.minecraft.sounds.SoundEvent ANCIENT_DEBRIS_STEP;
  public static final net.minecraft.sounds.SoundEvent ANCIENT_DEBRIS_PLACE;
  public static final net.minecraft.sounds.SoundEvent ANCIENT_DEBRIS_HIT;
  public static final net.minecraft.sounds.SoundEvent ANCIENT_DEBRIS_FALL;
  public static final net.minecraft.sounds.SoundEvent ANVIL_BREAK;
  public static final net.minecraft.sounds.SoundEvent ANVIL_DESTROY;
  public static final net.minecraft.sounds.SoundEvent ANVIL_FALL;
  public static final net.minecraft.sounds.SoundEvent ANVIL_HIT;
  public static final net.minecraft.sounds.SoundEvent ANVIL_LAND;
  public static final net.minecraft.sounds.SoundEvent ANVIL_PLACE;
  public static final net.minecraft.sounds.SoundEvent ANVIL_STEP;
  public static final net.minecraft.sounds.SoundEvent ANVIL_USE;
  public static final net.minecraft.sounds.SoundEvent ARMADILLO_EAT;
  public static final net.minecraft.sounds.SoundEvent ARMADILLO_HURT;
  public static final net.minecraft.sounds.SoundEvent ARMADILLO_HURT_REDUCED;
  public static final net.minecraft.sounds.SoundEvent ARMADILLO_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent ARMADILLO_STEP;
  public static final net.minecraft.sounds.SoundEvent ARMADILLO_DEATH;
  public static final net.minecraft.sounds.SoundEvent ARMADILLO_ROLL;
  public static final net.minecraft.sounds.SoundEvent ARMADILLO_LAND;
  public static final net.minecraft.sounds.SoundEvent ARMADILLO_SCUTE_DROP;
  public static final net.minecraft.sounds.SoundEvent ARMADILLO_UNROLL_FINISH;
  public static final net.minecraft.sounds.SoundEvent ARMADILLO_PEEK;
  public static final net.minecraft.sounds.SoundEvent ARMADILLO_UNROLL_START;
  public static final net.minecraft.sounds.SoundEvent ARMADILLO_BRUSH;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> ARMOR_EQUIP_CHAIN;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> ARMOR_EQUIP_DIAMOND;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> ARMOR_EQUIP_ELYTRA;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> ARMOR_EQUIP_GENERIC;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> ARMOR_EQUIP_GOLD;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> ARMOR_EQUIP_IRON;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> ARMOR_EQUIP_LEATHER;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> ARMOR_EQUIP_COPPER;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> ARMOR_EQUIP_NETHERITE;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> ARMOR_EQUIP_TURTLE;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> ARMOR_EQUIP_WOLF;
  public static final net.minecraft.sounds.SoundEvent ARMOR_UNEQUIP_WOLF;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> ARMOR_EQUIP_NAUTILUS;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> ARMOR_UNEQUIP_NAUTILUS;
  public static final net.minecraft.sounds.SoundEvent ARMOR_STAND_BREAK;
  public static final net.minecraft.sounds.SoundEvent ARMOR_STAND_FALL;
  public static final net.minecraft.sounds.SoundEvent ARMOR_STAND_HIT;
  public static final net.minecraft.sounds.SoundEvent ARMOR_STAND_PLACE;
  public static final net.minecraft.sounds.SoundEvent ARROW_HIT;
  public static final net.minecraft.sounds.SoundEvent ARROW_HIT_PLAYER;
  public static final net.minecraft.sounds.SoundEvent ARROW_SHOOT;
  public static final net.minecraft.sounds.SoundEvent AXE_STRIP;
  public static final net.minecraft.sounds.SoundEvent AXE_SCRAPE;
  public static final net.minecraft.sounds.SoundEvent AXE_WAX_OFF;
  public static final net.minecraft.sounds.SoundEvent AXOLOTL_ATTACK;
  public static final net.minecraft.sounds.SoundEvent AXOLOTL_DEATH;
  public static final net.minecraft.sounds.SoundEvent AXOLOTL_HURT;
  public static final net.minecraft.sounds.SoundEvent AXOLOTL_IDLE_AIR;
  public static final net.minecraft.sounds.SoundEvent AXOLOTL_IDLE_WATER;
  public static final net.minecraft.sounds.SoundEvent AXOLOTL_SPLASH;
  public static final net.minecraft.sounds.SoundEvent AXOLOTL_SWIM;
  public static final net.minecraft.sounds.SoundEvent AZALEA_BREAK;
  public static final net.minecraft.sounds.SoundEvent AZALEA_FALL;
  public static final net.minecraft.sounds.SoundEvent AZALEA_HIT;
  public static final net.minecraft.sounds.SoundEvent AZALEA_PLACE;
  public static final net.minecraft.sounds.SoundEvent AZALEA_STEP;
  public static final net.minecraft.sounds.SoundEvent AZALEA_LEAVES_BREAK;
  public static final net.minecraft.sounds.SoundEvent AZALEA_LEAVES_FALL;
  public static final net.minecraft.sounds.SoundEvent AZALEA_LEAVES_HIT;
  public static final net.minecraft.sounds.SoundEvent AZALEA_LEAVES_PLACE;
  public static final net.minecraft.sounds.SoundEvent AZALEA_LEAVES_STEP;
  public static final net.minecraft.sounds.SoundEvent BABY_NAUTILUS_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent BABY_NAUTILUS_AMBIENT_ON_LAND;
  public static final net.minecraft.sounds.SoundEvent BABY_NAUTILUS_DEATH;
  public static final net.minecraft.sounds.SoundEvent BABY_NAUTILUS_DEATH_ON_LAND;
  public static final net.minecraft.sounds.SoundEvent BABY_NAUTILUS_EAT;
  public static final net.minecraft.sounds.SoundEvent BABY_NAUTILUS_HURT;
  public static final net.minecraft.sounds.SoundEvent BABY_NAUTILUS_HURT_ON_LAND;
  public static final net.minecraft.sounds.SoundEvent NAUTILUS_RIDING;
  public static final net.minecraft.sounds.SoundEvent BABY_NAUTILUS_SWIM;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_BREAK;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_FALL;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_HIT;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_PLACE;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_STEP;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_SAPLING_BREAK;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_SAPLING_HIT;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_SAPLING_PLACE;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_BREAK;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_FALL;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_HIT;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_PLACE;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_STEP;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_DOOR_CLOSE;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_DOOR_OPEN;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_TRAPDOOR_CLOSE;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_TRAPDOOR_OPEN;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_BUTTON_CLICK_OFF;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_BUTTON_CLICK_ON;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_PRESSURE_PLATE_CLICK_OFF;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_PRESSURE_PLATE_CLICK_ON;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_FENCE_GATE_CLOSE;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_FENCE_GATE_OPEN;
  public static final net.minecraft.sounds.SoundEvent BARREL_CLOSE;
  public static final net.minecraft.sounds.SoundEvent BARREL_OPEN;
  public static final net.minecraft.sounds.SoundEvent BASALT_BREAK;
  public static final net.minecraft.sounds.SoundEvent BASALT_STEP;
  public static final net.minecraft.sounds.SoundEvent BASALT_PLACE;
  public static final net.minecraft.sounds.SoundEvent BASALT_HIT;
  public static final net.minecraft.sounds.SoundEvent BASALT_FALL;
  public static final net.minecraft.sounds.SoundEvent BAT_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent BAT_DEATH;
  public static final net.minecraft.sounds.SoundEvent BAT_HURT;
  public static final net.minecraft.sounds.SoundEvent BAT_LOOP;
  public static final net.minecraft.sounds.SoundEvent BAT_TAKEOFF;
  public static final net.minecraft.sounds.SoundEvent BEACON_ACTIVATE;
  public static final net.minecraft.sounds.SoundEvent BEACON_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent BEACON_DEACTIVATE;
  public static final net.minecraft.sounds.SoundEvent BEACON_POWER_SELECT;
  public static final net.minecraft.sounds.SoundEvent BEE_DEATH;
  public static final net.minecraft.sounds.SoundEvent BEE_HURT;
  public static final net.minecraft.sounds.SoundEvent BEE_LOOP_AGGRESSIVE;
  public static final net.minecraft.sounds.SoundEvent BEE_LOOP;
  public static final net.minecraft.sounds.SoundEvent BEE_STING;
  public static final net.minecraft.sounds.SoundEvent BEE_POLLINATE;
  public static final net.minecraft.sounds.SoundEvent BEEHIVE_DRIP;
  public static final net.minecraft.sounds.SoundEvent BEEHIVE_ENTER;
  public static final net.minecraft.sounds.SoundEvent BEEHIVE_EXIT;
  public static final net.minecraft.sounds.SoundEvent BEEHIVE_SHEAR;
  public static final net.minecraft.sounds.SoundEvent BEEHIVE_WORK;
  public static final net.minecraft.sounds.SoundEvent BELL_BLOCK;
  public static final net.minecraft.sounds.SoundEvent BELL_RESONATE;
  public static final net.minecraft.sounds.SoundEvent BIG_DRIPLEAF_BREAK;
  public static final net.minecraft.sounds.SoundEvent BIG_DRIPLEAF_FALL;
  public static final net.minecraft.sounds.SoundEvent BIG_DRIPLEAF_HIT;
  public static final net.minecraft.sounds.SoundEvent BIG_DRIPLEAF_PLACE;
  public static final net.minecraft.sounds.SoundEvent BIG_DRIPLEAF_STEP;
  public static final net.minecraft.sounds.SoundEvent BLAZE_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent BLAZE_BURN;
  public static final net.minecraft.sounds.SoundEvent BLAZE_DEATH;
  public static final net.minecraft.sounds.SoundEvent BLAZE_HURT;
  public static final net.minecraft.sounds.SoundEvent BLAZE_SHOOT;
  public static final net.minecraft.sounds.SoundEvent BOAT_PADDLE_LAND;
  public static final net.minecraft.sounds.SoundEvent BOAT_PADDLE_WATER;
  public static final net.minecraft.sounds.SoundEvent BOGGED_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent BOGGED_DEATH;
  public static final net.minecraft.sounds.SoundEvent BOGGED_HURT;
  public static final net.minecraft.sounds.SoundEvent BOGGED_SHEAR;
  public static final net.minecraft.sounds.SoundEvent BOGGED_STEP;
  public static final net.minecraft.sounds.SoundEvent BONE_BLOCK_BREAK;
  public static final net.minecraft.sounds.SoundEvent BONE_BLOCK_FALL;
  public static final net.minecraft.sounds.SoundEvent BONE_BLOCK_HIT;
  public static final net.minecraft.sounds.SoundEvent BONE_BLOCK_PLACE;
  public static final net.minecraft.sounds.SoundEvent BONE_BLOCK_STEP;
  public static final net.minecraft.sounds.SoundEvent BONE_MEAL_USE;
  public static final net.minecraft.sounds.SoundEvent BOOK_PAGE_TURN;
  public static final net.minecraft.sounds.SoundEvent BOOK_PUT;
  public static final net.minecraft.sounds.SoundEvent BLASTFURNACE_FIRE_CRACKLE;
  public static final net.minecraft.sounds.SoundEvent BOTTLE_EMPTY;
  public static final net.minecraft.sounds.SoundEvent BOTTLE_FILL;
  public static final net.minecraft.sounds.SoundEvent BOTTLE_FILL_DRAGONBREATH;
  public static final net.minecraft.sounds.SoundEvent BREEZE_CHARGE;
  public static final net.minecraft.sounds.SoundEvent BREEZE_DEFLECT;
  public static final net.minecraft.sounds.SoundEvent BREEZE_INHALE;
  public static final net.minecraft.sounds.SoundEvent BREEZE_IDLE_GROUND;
  public static final net.minecraft.sounds.SoundEvent BREEZE_IDLE_AIR;
  public static final net.minecraft.sounds.SoundEvent BREEZE_SHOOT;
  public static final net.minecraft.sounds.SoundEvent BREEZE_JUMP;
  public static final net.minecraft.sounds.SoundEvent BREEZE_LAND;
  public static final net.minecraft.sounds.SoundEvent BREEZE_SLIDE;
  public static final net.minecraft.sounds.SoundEvent BREEZE_DEATH;
  public static final net.minecraft.sounds.SoundEvent BREEZE_HURT;
  public static final net.minecraft.sounds.SoundEvent BREEZE_WHIRL;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> BREEZE_WIND_CHARGE_BURST;
  public static final net.minecraft.sounds.SoundEvent BREWING_STAND_BREW;
  public static final net.minecraft.sounds.SoundEvent BRUSH_GENERIC;
  public static final net.minecraft.sounds.SoundEvent BRUSH_SAND;
  public static final net.minecraft.sounds.SoundEvent BRUSH_GRAVEL;
  public static final net.minecraft.sounds.SoundEvent BRUSH_SAND_COMPLETED;
  public static final net.minecraft.sounds.SoundEvent BRUSH_GRAVEL_COMPLETED;
  public static final net.minecraft.sounds.SoundEvent BUBBLE_COLUMN_BUBBLE_POP;
  public static final net.minecraft.sounds.SoundEvent BUBBLE_COLUMN_UPWARDS_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent BUBBLE_COLUMN_UPWARDS_INSIDE;
  public static final net.minecraft.sounds.SoundEvent BUBBLE_COLUMN_WHIRLPOOL_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent BUBBLE_COLUMN_WHIRLPOOL_INSIDE;
  public static final net.minecraft.sounds.SoundEvent BUBBLE_POP;
  public static final net.minecraft.sounds.SoundEvent BUCKET_EMPTY;
  public static final net.minecraft.sounds.SoundEvent BUCKET_EMPTY_AXOLOTL;
  public static final net.minecraft.sounds.SoundEvent BUCKET_EMPTY_FISH;
  public static final net.minecraft.sounds.SoundEvent BUCKET_EMPTY_LAVA;
  public static final net.minecraft.sounds.SoundEvent BUCKET_EMPTY_POWDER_SNOW;
  public static final net.minecraft.sounds.SoundEvent BUCKET_EMPTY_TADPOLE;
  public static final net.minecraft.sounds.SoundEvent BUCKET_FILL;
  public static final net.minecraft.sounds.SoundEvent BUCKET_FILL_AXOLOTL;
  public static final net.minecraft.sounds.SoundEvent BUCKET_FILL_FISH;
  public static final net.minecraft.sounds.SoundEvent BUCKET_FILL_LAVA;
  public static final net.minecraft.sounds.SoundEvent BUCKET_FILL_POWDER_SNOW;
  public static final net.minecraft.sounds.SoundEvent BUCKET_FILL_TADPOLE;
  public static final net.minecraft.sounds.SoundEvent BUNDLE_DROP_CONTENTS;
  public static final net.minecraft.sounds.SoundEvent BUNDLE_INSERT;
  public static final net.minecraft.sounds.SoundEvent BUNDLE_INSERT_FAIL;
  public static final net.minecraft.sounds.SoundEvent BUNDLE_REMOVE_ONE;
  public static final net.minecraft.sounds.SoundEvent CACTUS_FLOWER_BREAK;
  public static final net.minecraft.sounds.SoundEvent CACTUS_FLOWER_PLACE;
  public static final net.minecraft.sounds.SoundEvent CAKE_ADD_CANDLE;
  public static final net.minecraft.sounds.SoundEvent CALCITE_BREAK;
  public static final net.minecraft.sounds.SoundEvent CALCITE_STEP;
  public static final net.minecraft.sounds.SoundEvent CALCITE_PLACE;
  public static final net.minecraft.sounds.SoundEvent CALCITE_HIT;
  public static final net.minecraft.sounds.SoundEvent CALCITE_FALL;
  public static final net.minecraft.sounds.SoundEvent CAMEL_HUSK_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent CAMEL_HUSK_DASH;
  public static final net.minecraft.sounds.SoundEvent CAMEL_HUSK_DASH_READY;
  public static final net.minecraft.sounds.SoundEvent CAMEL_HUSK_DEATH;
  public static final net.minecraft.sounds.SoundEvent CAMEL_HUSK_EAT;
  public static final net.minecraft.sounds.SoundEvent CAMEL_HUSK_HURT;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> CAMEL_HUSK_SADDLE;
  public static final net.minecraft.sounds.SoundEvent CAMEL_HUSK_SIT;
  public static final net.minecraft.sounds.SoundEvent CAMEL_HUSK_STAND;
  public static final net.minecraft.sounds.SoundEvent CAMEL_HUSK_STEP;
  public static final net.minecraft.sounds.SoundEvent CAMEL_HUSK_STEP_SAND;
  public static final net.minecraft.sounds.SoundEvent CAMEL_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent CAMEL_DASH;
  public static final net.minecraft.sounds.SoundEvent CAMEL_DASH_READY;
  public static final net.minecraft.sounds.SoundEvent CAMEL_DEATH;
  public static final net.minecraft.sounds.SoundEvent CAMEL_EAT;
  public static final net.minecraft.sounds.SoundEvent CAMEL_HURT;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> CAMEL_SADDLE;
  public static final net.minecraft.sounds.SoundEvent CAMEL_SIT;
  public static final net.minecraft.sounds.SoundEvent CAMEL_STAND;
  public static final net.minecraft.sounds.SoundEvent CAMEL_STEP;
  public static final net.minecraft.sounds.SoundEvent CAMEL_STEP_SAND;
  public static final net.minecraft.sounds.SoundEvent CAMPFIRE_CRACKLE;
  public static final net.minecraft.sounds.SoundEvent CANDLE_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent CANDLE_BREAK;
  public static final net.minecraft.sounds.SoundEvent CANDLE_EXTINGUISH;
  public static final net.minecraft.sounds.SoundEvent CANDLE_FALL;
  public static final net.minecraft.sounds.SoundEvent CANDLE_HIT;
  public static final net.minecraft.sounds.SoundEvent CANDLE_PLACE;
  public static final net.minecraft.sounds.SoundEvent CANDLE_STEP;
  public static final net.minecraft.sounds.SoundEvent CAT_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent CAT_STRAY_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent CAT_DEATH;
  public static final net.minecraft.sounds.SoundEvent CAT_EAT;
  public static final net.minecraft.sounds.SoundEvent CAT_HISS;
  public static final net.minecraft.sounds.SoundEvent CAT_BEG_FOR_FOOD;
  public static final net.minecraft.sounds.SoundEvent CAT_HURT;
  public static final net.minecraft.sounds.SoundEvent CAT_PURR;
  public static final net.minecraft.sounds.SoundEvent CAT_PURREOW;
  public static final net.minecraft.sounds.SoundEvent CAVE_VINES_BREAK;
  public static final net.minecraft.sounds.SoundEvent CAVE_VINES_FALL;
  public static final net.minecraft.sounds.SoundEvent CAVE_VINES_HIT;
  public static final net.minecraft.sounds.SoundEvent CAVE_VINES_PLACE;
  public static final net.minecraft.sounds.SoundEvent CAVE_VINES_STEP;
  public static final net.minecraft.sounds.SoundEvent CAVE_VINES_PICK_BERRIES;
  public static final net.minecraft.sounds.SoundEvent CHAIN_BREAK;
  public static final net.minecraft.sounds.SoundEvent CHAIN_FALL;
  public static final net.minecraft.sounds.SoundEvent CHAIN_HIT;
  public static final net.minecraft.sounds.SoundEvent CHAIN_PLACE;
  public static final net.minecraft.sounds.SoundEvent CHAIN_STEP;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_BREAK;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_FALL;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_HIT;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_PLACE;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_STEP;
  public static final net.minecraft.sounds.SoundEvent CHERRY_SAPLING_BREAK;
  public static final net.minecraft.sounds.SoundEvent CHERRY_SAPLING_FALL;
  public static final net.minecraft.sounds.SoundEvent CHERRY_SAPLING_HIT;
  public static final net.minecraft.sounds.SoundEvent CHERRY_SAPLING_PLACE;
  public static final net.minecraft.sounds.SoundEvent CHERRY_SAPLING_STEP;
  public static final net.minecraft.sounds.SoundEvent CHERRY_LEAVES_BREAK;
  public static final net.minecraft.sounds.SoundEvent CHERRY_LEAVES_FALL;
  public static final net.minecraft.sounds.SoundEvent CHERRY_LEAVES_HIT;
  public static final net.minecraft.sounds.SoundEvent CHERRY_LEAVES_PLACE;
  public static final net.minecraft.sounds.SoundEvent CHERRY_LEAVES_STEP;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_HANGING_SIGN_STEP;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_HANGING_SIGN_BREAK;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_HANGING_SIGN_FALL;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_HANGING_SIGN_HIT;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_HANGING_SIGN_PLACE;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_DOOR_CLOSE;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_DOOR_OPEN;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_TRAPDOOR_CLOSE;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_TRAPDOOR_OPEN;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_BUTTON_CLICK_OFF;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_BUTTON_CLICK_ON;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_PRESSURE_PLATE_CLICK_OFF;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_PRESSURE_PLATE_CLICK_ON;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_FENCE_GATE_CLOSE;
  public static final net.minecraft.sounds.SoundEvent CHERRY_WOOD_FENCE_GATE_OPEN;
  public static final net.minecraft.sounds.SoundEvent CHEST_CLOSE;
  public static final net.minecraft.sounds.SoundEvent CHEST_LOCKED;
  public static final net.minecraft.sounds.SoundEvent CHEST_OPEN;
  public static final net.minecraft.sounds.SoundEvent CHICKEN_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent CHICKEN_DEATH;
  public static final net.minecraft.sounds.SoundEvent CHICKEN_EGG;
  public static final net.minecraft.sounds.SoundEvent CHICKEN_HURT;
  public static final net.minecraft.sounds.SoundEvent CHICKEN_STEP;
  public static final net.minecraft.sounds.SoundEvent CHISELED_BOOKSHELF_BREAK;
  public static final net.minecraft.sounds.SoundEvent CHISELED_BOOKSHELF_FALL;
  public static final net.minecraft.sounds.SoundEvent CHISELED_BOOKSHELF_HIT;
  public static final net.minecraft.sounds.SoundEvent CHISELED_BOOKSHELF_INSERT;
  public static final net.minecraft.sounds.SoundEvent CHISELED_BOOKSHELF_INSERT_ENCHANTED;
  public static final net.minecraft.sounds.SoundEvent CHISELED_BOOKSHELF_STEP;
  public static final net.minecraft.sounds.SoundEvent CHISELED_BOOKSHELF_PICKUP;
  public static final net.minecraft.sounds.SoundEvent CHISELED_BOOKSHELF_PICKUP_ENCHANTED;
  public static final net.minecraft.sounds.SoundEvent CHISELED_BOOKSHELF_PLACE;
  public static final net.minecraft.sounds.SoundEvent CHORUS_FLOWER_DEATH;
  public static final net.minecraft.sounds.SoundEvent CHORUS_FLOWER_GROW;
  public static final net.minecraft.sounds.SoundEvent CHORUS_FRUIT_TELEPORT;
  public static final net.minecraft.sounds.SoundEvent COBWEB_BREAK;
  public static final net.minecraft.sounds.SoundEvent COBWEB_STEP;
  public static final net.minecraft.sounds.SoundEvent COBWEB_PLACE;
  public static final net.minecraft.sounds.SoundEvent COBWEB_HIT;
  public static final net.minecraft.sounds.SoundEvent COBWEB_FALL;
  public static final net.minecraft.sounds.SoundEvent COD_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent COD_DEATH;
  public static final net.minecraft.sounds.SoundEvent COD_FLOP;
  public static final net.minecraft.sounds.SoundEvent COD_HURT;
  public static final net.minecraft.sounds.SoundEvent COMPARATOR_CLICK;
  public static final net.minecraft.sounds.SoundEvent COMPOSTER_EMPTY;
  public static final net.minecraft.sounds.SoundEvent COMPOSTER_FILL;
  public static final net.minecraft.sounds.SoundEvent COMPOSTER_FILL_SUCCESS;
  public static final net.minecraft.sounds.SoundEvent COMPOSTER_READY;
  public static final net.minecraft.sounds.SoundEvent CONDUIT_ACTIVATE;
  public static final net.minecraft.sounds.SoundEvent CONDUIT_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent CONDUIT_AMBIENT_SHORT;
  public static final net.minecraft.sounds.SoundEvent CONDUIT_ATTACK_TARGET;
  public static final net.minecraft.sounds.SoundEvent CONDUIT_DEACTIVATE;
  public static final net.minecraft.sounds.SoundEvent COPPER_BULB_BREAK;
  public static final net.minecraft.sounds.SoundEvent COPPER_BULB_STEP;
  public static final net.minecraft.sounds.SoundEvent COPPER_BULB_PLACE;
  public static final net.minecraft.sounds.SoundEvent COPPER_BULB_HIT;
  public static final net.minecraft.sounds.SoundEvent COPPER_BULB_FALL;
  public static final net.minecraft.sounds.SoundEvent COPPER_BULB_TURN_ON;
  public static final net.minecraft.sounds.SoundEvent COPPER_BULB_TURN_OFF;
  public static final net.minecraft.sounds.SoundEvent COPPER_BREAK;
  public static final net.minecraft.sounds.SoundEvent COPPER_STEP;
  public static final net.minecraft.sounds.SoundEvent COPPER_PLACE;
  public static final net.minecraft.sounds.SoundEvent COPPER_HIT;
  public static final net.minecraft.sounds.SoundEvent COPPER_FALL;
  public static final net.minecraft.sounds.SoundEvent COPPER_CHEST_CLOSE;
  public static final net.minecraft.sounds.SoundEvent COPPER_CHEST_OPEN;
  public static final net.minecraft.sounds.SoundEvent COPPER_CHEST_WEATHERED_CLOSE;
  public static final net.minecraft.sounds.SoundEvent COPPER_CHEST_WEATHERED_OPEN;
  public static final net.minecraft.sounds.SoundEvent COPPER_CHEST_OXIDIZED_CLOSE;
  public static final net.minecraft.sounds.SoundEvent COPPER_CHEST_OXIDIZED_OPEN;
  public static final net.minecraft.sounds.SoundEvent COPPER_DOOR_CLOSE;
  public static final net.minecraft.sounds.SoundEvent COPPER_DOOR_OPEN;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_STEP;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_HURT;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_DEATH;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_WEATHERED_STEP;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_WEATHERED_HURT;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_WEATHERED_DEATH;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_OXIDIZED_STEP;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_OXIDIZED_HURT;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_OXIDIZED_DEATH;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_SPIN;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_WEATHERED_SPIN;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_OXIDIZED_SPIN;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_ITEM_GET;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_ITEM_NO_GET;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_ITEM_DROP;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_ITEM_NO_DROP;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_BECOME_STATUE;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_STATUE_BREAK;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_STATUE_PLACE;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_STATUE_HIT;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_STATUE_STEP;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_STATUE_FALL;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_SPAWN;
  public static final net.minecraft.sounds.SoundEvent COPPER_GOLEM_SHEAR;
  public static final net.minecraft.sounds.SoundEvent COPPER_GRATE_BREAK;
  public static final net.minecraft.sounds.SoundEvent COPPER_GRATE_STEP;
  public static final net.minecraft.sounds.SoundEvent COPPER_GRATE_PLACE;
  public static final net.minecraft.sounds.SoundEvent COPPER_GRATE_HIT;
  public static final net.minecraft.sounds.SoundEvent COPPER_GRATE_FALL;
  public static final net.minecraft.sounds.SoundEvent COPPER_TRAPDOOR_CLOSE;
  public static final net.minecraft.sounds.SoundEvent COPPER_TRAPDOOR_OPEN;
  public static final net.minecraft.sounds.SoundEvent CORAL_BLOCK_BREAK;
  public static final net.minecraft.sounds.SoundEvent CORAL_BLOCK_FALL;
  public static final net.minecraft.sounds.SoundEvent CORAL_BLOCK_HIT;
  public static final net.minecraft.sounds.SoundEvent CORAL_BLOCK_PLACE;
  public static final net.minecraft.sounds.SoundEvent CORAL_BLOCK_STEP;
  public static final net.minecraft.sounds.SoundEvent COW_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent COW_DEATH;
  public static final net.minecraft.sounds.SoundEvent COW_HURT;
  public static final net.minecraft.sounds.SoundEvent COW_MILK;
  public static final net.minecraft.sounds.SoundEvent COW_STEP;
  public static final net.minecraft.sounds.SoundEvent CRAFTER_CRAFT;
  public static final net.minecraft.sounds.SoundEvent CRAFTER_FAIL;
  public static final net.minecraft.sounds.SoundEvent CREAKING_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent CREAKING_ACTIVATE;
  public static final net.minecraft.sounds.SoundEvent CREAKING_DEACTIVATE;
  public static final net.minecraft.sounds.SoundEvent CREAKING_ATTACK;
  public static final net.minecraft.sounds.SoundEvent CREAKING_DEATH;
  public static final net.minecraft.sounds.SoundEvent CREAKING_STEP;
  public static final net.minecraft.sounds.SoundEvent CREAKING_FREEZE;
  public static final net.minecraft.sounds.SoundEvent CREAKING_UNFREEZE;
  public static final net.minecraft.sounds.SoundEvent CREAKING_SPAWN;
  public static final net.minecraft.sounds.SoundEvent CREAKING_SWAY;
  public static final net.minecraft.sounds.SoundEvent CREAKING_TWITCH;
  public static final net.minecraft.sounds.SoundEvent CREAKING_HEART_BREAK;
  public static final net.minecraft.sounds.SoundEvent CREAKING_HEART_FALL;
  public static final net.minecraft.sounds.SoundEvent CREAKING_HEART_HIT;
  public static final net.minecraft.sounds.SoundEvent CREAKING_HEART_HURT;
  public static final net.minecraft.sounds.SoundEvent CREAKING_HEART_PLACE;
  public static final net.minecraft.sounds.SoundEvent CREAKING_HEART_STEP;
  public static final net.minecraft.sounds.SoundEvent CREAKING_HEART_IDLE;
  public static final net.minecraft.sounds.SoundEvent CREAKING_HEART_SPAWN;
  public static final net.minecraft.sounds.SoundEvent CREEPER_DEATH;
  public static final net.minecraft.sounds.SoundEvent CREEPER_HURT;
  public static final net.minecraft.sounds.SoundEvent CREEPER_PRIMED;
  public static final net.minecraft.sounds.SoundEvent CROP_BREAK;
  public static final net.minecraft.sounds.SoundEvent CROP_PLANTED;
  public static final net.minecraft.sounds.SoundEvent CROSSBOW_HIT;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> CROSSBOW_LOADING_END;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> CROSSBOW_LOADING_MIDDLE;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> CROSSBOW_LOADING_START;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> CROSSBOW_QUICK_CHARGE_1;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> CROSSBOW_QUICK_CHARGE_2;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> CROSSBOW_QUICK_CHARGE_3;
  public static final net.minecraft.sounds.SoundEvent CROSSBOW_SHOOT;
  public static final net.minecraft.sounds.SoundEvent DEAD_BUSH_IDLE;
  public static final net.minecraft.sounds.SoundEvent DECORATED_POT_BREAK;
  public static final net.minecraft.sounds.SoundEvent DECORATED_POT_FALL;
  public static final net.minecraft.sounds.SoundEvent DECORATED_POT_HIT;
  public static final net.minecraft.sounds.SoundEvent DECORATED_POT_INSERT;
  public static final net.minecraft.sounds.SoundEvent DECORATED_POT_INSERT_FAIL;
  public static final net.minecraft.sounds.SoundEvent DECORATED_POT_STEP;
  public static final net.minecraft.sounds.SoundEvent DECORATED_POT_PLACE;
  public static final net.minecraft.sounds.SoundEvent DECORATED_POT_SHATTER;
  public static final net.minecraft.sounds.SoundEvent DEEPSLATE_BRICKS_BREAK;
  public static final net.minecraft.sounds.SoundEvent DEEPSLATE_BRICKS_FALL;
  public static final net.minecraft.sounds.SoundEvent DEEPSLATE_BRICKS_HIT;
  public static final net.minecraft.sounds.SoundEvent DEEPSLATE_BRICKS_PLACE;
  public static final net.minecraft.sounds.SoundEvent DEEPSLATE_BRICKS_STEP;
  public static final net.minecraft.sounds.SoundEvent DEEPSLATE_BREAK;
  public static final net.minecraft.sounds.SoundEvent DEEPSLATE_FALL;
  public static final net.minecraft.sounds.SoundEvent DEEPSLATE_HIT;
  public static final net.minecraft.sounds.SoundEvent DEEPSLATE_PLACE;
  public static final net.minecraft.sounds.SoundEvent DEEPSLATE_STEP;
  public static final net.minecraft.sounds.SoundEvent DEEPSLATE_TILES_BREAK;
  public static final net.minecraft.sounds.SoundEvent DEEPSLATE_TILES_FALL;
  public static final net.minecraft.sounds.SoundEvent DEEPSLATE_TILES_HIT;
  public static final net.minecraft.sounds.SoundEvent DEEPSLATE_TILES_PLACE;
  public static final net.minecraft.sounds.SoundEvent DEEPSLATE_TILES_STEP;
  public static final net.minecraft.sounds.SoundEvent DISPENSER_DISPENSE;
  public static final net.minecraft.sounds.SoundEvent DISPENSER_FAIL;
  public static final net.minecraft.sounds.SoundEvent DISPENSER_LAUNCH;
  public static final net.minecraft.sounds.SoundEvent DOLPHIN_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent DOLPHIN_AMBIENT_WATER;
  public static final net.minecraft.sounds.SoundEvent DOLPHIN_ATTACK;
  public static final net.minecraft.sounds.SoundEvent DOLPHIN_DEATH;
  public static final net.minecraft.sounds.SoundEvent DOLPHIN_EAT;
  public static final net.minecraft.sounds.SoundEvent DOLPHIN_HURT;
  public static final net.minecraft.sounds.SoundEvent DOLPHIN_JUMP;
  public static final net.minecraft.sounds.SoundEvent DOLPHIN_PLAY;
  public static final net.minecraft.sounds.SoundEvent DOLPHIN_SPLASH;
  public static final net.minecraft.sounds.SoundEvent DOLPHIN_SWIM;
  public static final net.minecraft.sounds.SoundEvent DONKEY_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent DONKEY_ANGRY;
  public static final net.minecraft.sounds.SoundEvent DONKEY_CHEST;
  public static final net.minecraft.sounds.SoundEvent DONKEY_DEATH;
  public static final net.minecraft.sounds.SoundEvent DONKEY_EAT;
  public static final net.minecraft.sounds.SoundEvent DONKEY_HURT;
  public static final net.minecraft.sounds.SoundEvent DONKEY_JUMP;
  public static final net.minecraft.sounds.SoundEvent DRIED_GHAST_BREAK;
  public static final net.minecraft.sounds.SoundEvent DRIED_GHAST_STEP;
  public static final net.minecraft.sounds.SoundEvent DRIED_GHAST_FALL;
  public static final net.minecraft.sounds.SoundEvent DRIED_GHAST_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent DRIED_GHAST_AMBIENT_WATER;
  public static final net.minecraft.sounds.SoundEvent DRIED_GHAST_PLACE;
  public static final net.minecraft.sounds.SoundEvent DRIED_GHAST_PLACE_IN_WATER;
  public static final net.minecraft.sounds.SoundEvent DRIED_GHAST_TRANSITION;
  public static final net.minecraft.sounds.SoundEvent DRIPSTONE_BLOCK_BREAK;
  public static final net.minecraft.sounds.SoundEvent DRIPSTONE_BLOCK_STEP;
  public static final net.minecraft.sounds.SoundEvent DRIPSTONE_BLOCK_PLACE;
  public static final net.minecraft.sounds.SoundEvent DRIPSTONE_BLOCK_HIT;
  public static final net.minecraft.sounds.SoundEvent DRIPSTONE_BLOCK_FALL;
  public static final net.minecraft.sounds.SoundEvent DRY_GRASS;
  public static final net.minecraft.sounds.SoundEvent POINTED_DRIPSTONE_BREAK;
  public static final net.minecraft.sounds.SoundEvent POINTED_DRIPSTONE_STEP;
  public static final net.minecraft.sounds.SoundEvent POINTED_DRIPSTONE_PLACE;
  public static final net.minecraft.sounds.SoundEvent POINTED_DRIPSTONE_HIT;
  public static final net.minecraft.sounds.SoundEvent POINTED_DRIPSTONE_FALL;
  public static final net.minecraft.sounds.SoundEvent POINTED_DRIPSTONE_LAND;
  public static final net.minecraft.sounds.SoundEvent POINTED_DRIPSTONE_DRIP_LAVA;
  public static final net.minecraft.sounds.SoundEvent POINTED_DRIPSTONE_DRIP_WATER;
  public static final net.minecraft.sounds.SoundEvent POINTED_DRIPSTONE_DRIP_LAVA_INTO_CAULDRON;
  public static final net.minecraft.sounds.SoundEvent POINTED_DRIPSTONE_DRIP_WATER_INTO_CAULDRON;
  public static final net.minecraft.sounds.SoundEvent BIG_DRIPLEAF_TILT_DOWN;
  public static final net.minecraft.sounds.SoundEvent BIG_DRIPLEAF_TILT_UP;
  public static final net.minecraft.sounds.SoundEvent DROWNED_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent DROWNED_AMBIENT_WATER;
  public static final net.minecraft.sounds.SoundEvent DROWNED_DEATH;
  public static final net.minecraft.sounds.SoundEvent DROWNED_DEATH_WATER;
  public static final net.minecraft.sounds.SoundEvent DROWNED_HURT;
  public static final net.minecraft.sounds.SoundEvent DROWNED_HURT_WATER;
  public static final net.minecraft.sounds.SoundEvent DROWNED_SHOOT;
  public static final net.minecraft.sounds.SoundEvent DROWNED_STEP;
  public static final net.minecraft.sounds.SoundEvent DROWNED_SWIM;
  public static final net.minecraft.sounds.SoundEvent DYE_USE;
  public static final net.minecraft.sounds.SoundEvent EGG_THROW;
  public static final net.minecraft.sounds.SoundEvent ELDER_GUARDIAN_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent ELDER_GUARDIAN_AMBIENT_LAND;
  public static final net.minecraft.sounds.SoundEvent ELDER_GUARDIAN_CURSE;
  public static final net.minecraft.sounds.SoundEvent ELDER_GUARDIAN_DEATH;
  public static final net.minecraft.sounds.SoundEvent ELDER_GUARDIAN_DEATH_LAND;
  public static final net.minecraft.sounds.SoundEvent ELDER_GUARDIAN_FLOP;
  public static final net.minecraft.sounds.SoundEvent ELDER_GUARDIAN_HURT;
  public static final net.minecraft.sounds.SoundEvent ELDER_GUARDIAN_HURT_LAND;
  public static final net.minecraft.sounds.SoundEvent ELYTRA_FLYING;
  public static final net.minecraft.sounds.SoundEvent ENCHANTMENT_TABLE_USE;
  public static final net.minecraft.sounds.SoundEvent ENDER_CHEST_CLOSE;
  public static final net.minecraft.sounds.SoundEvent ENDER_CHEST_OPEN;
  public static final net.minecraft.sounds.SoundEvent ENDER_DRAGON_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent ENDER_DRAGON_DEATH;
  public static final net.minecraft.sounds.SoundEvent DRAGON_FIREBALL_EXPLODE;
  public static final net.minecraft.sounds.SoundEvent ENDER_DRAGON_FLAP;
  public static final net.minecraft.sounds.SoundEvent ENDER_DRAGON_GROWL;
  public static final net.minecraft.sounds.SoundEvent ENDER_DRAGON_HURT;
  public static final net.minecraft.sounds.SoundEvent ENDER_DRAGON_SHOOT;
  public static final net.minecraft.sounds.SoundEvent ENDER_EYE_DEATH;
  public static final net.minecraft.sounds.SoundEvent ENDER_EYE_LAUNCH;
  public static final net.minecraft.sounds.SoundEvent ENDERMAN_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent ENDERMAN_DEATH;
  public static final net.minecraft.sounds.SoundEvent ENDERMAN_HURT;
  public static final net.minecraft.sounds.SoundEvent ENDERMAN_SCREAM;
  public static final net.minecraft.sounds.SoundEvent ENDERMAN_STARE;
  public static final net.minecraft.sounds.SoundEvent ENDERMAN_TELEPORT;
  public static final net.minecraft.sounds.SoundEvent ENDERMITE_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent ENDERMITE_DEATH;
  public static final net.minecraft.sounds.SoundEvent ENDERMITE_HURT;
  public static final net.minecraft.sounds.SoundEvent ENDERMITE_STEP;
  public static final net.minecraft.sounds.SoundEvent ENDER_PEARL_THROW;
  public static final net.minecraft.sounds.SoundEvent END_GATEWAY_SPAWN;
  public static final net.minecraft.sounds.SoundEvent END_PORTAL_FRAME_FILL;
  public static final net.minecraft.sounds.SoundEvent END_PORTAL_SPAWN;
  public static final net.minecraft.sounds.SoundEvent EVOKER_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent EVOKER_CAST_SPELL;
  public static final net.minecraft.sounds.SoundEvent EVOKER_CELEBRATE;
  public static final net.minecraft.sounds.SoundEvent EVOKER_DEATH;
  public static final net.minecraft.sounds.SoundEvent EVOKER_FANGS_ATTACK;
  public static final net.minecraft.sounds.SoundEvent EVOKER_HURT;
  public static final net.minecraft.sounds.SoundEvent EVOKER_PREPARE_ATTACK;
  public static final net.minecraft.sounds.SoundEvent EVOKER_PREPARE_SUMMON;
  public static final net.minecraft.sounds.SoundEvent EVOKER_PREPARE_WOLOLO;
  public static final net.minecraft.sounds.SoundEvent EXPERIENCE_BOTTLE_THROW;
  public static final net.minecraft.sounds.SoundEvent EXPERIENCE_ORB_PICKUP;
  public static final net.minecraft.sounds.SoundEvent EYEBLOSSOM_OPEN_LONG;
  public static final net.minecraft.sounds.SoundEvent EYEBLOSSOM_OPEN;
  public static final net.minecraft.sounds.SoundEvent EYEBLOSSOM_CLOSE_LONG;
  public static final net.minecraft.sounds.SoundEvent EYEBLOSSOM_CLOSE;
  public static final net.minecraft.sounds.SoundEvent EYEBLOSSOM_IDLE;
  public static final net.minecraft.sounds.SoundEvent FENCE_GATE_CLOSE;
  public static final net.minecraft.sounds.SoundEvent FENCE_GATE_OPEN;
  public static final net.minecraft.sounds.SoundEvent FIRECHARGE_USE;
  public static final net.minecraft.sounds.SoundEvent FIREFLY_BUSH_IDLE;
  public static final net.minecraft.sounds.SoundEvent FIREWORK_ROCKET_BLAST;
  public static final net.minecraft.sounds.SoundEvent FIREWORK_ROCKET_BLAST_FAR;
  public static final net.minecraft.sounds.SoundEvent FIREWORK_ROCKET_LARGE_BLAST;
  public static final net.minecraft.sounds.SoundEvent FIREWORK_ROCKET_LARGE_BLAST_FAR;
  public static final net.minecraft.sounds.SoundEvent FIREWORK_ROCKET_LAUNCH;
  public static final net.minecraft.sounds.SoundEvent FIREWORK_ROCKET_SHOOT;
  public static final net.minecraft.sounds.SoundEvent FIREWORK_ROCKET_TWINKLE;
  public static final net.minecraft.sounds.SoundEvent FIREWORK_ROCKET_TWINKLE_FAR;
  public static final net.minecraft.sounds.SoundEvent FIRE_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent FIRE_EXTINGUISH;
  public static final net.minecraft.sounds.SoundEvent FISH_SWIM;
  public static final net.minecraft.sounds.SoundEvent FISHING_BOBBER_RETRIEVE;
  public static final net.minecraft.sounds.SoundEvent FISHING_BOBBER_SPLASH;
  public static final net.minecraft.sounds.SoundEvent FISHING_BOBBER_THROW;
  public static final net.minecraft.sounds.SoundEvent FLINTANDSTEEL_USE;
  public static final net.minecraft.sounds.SoundEvent FLOWERING_AZALEA_BREAK;
  public static final net.minecraft.sounds.SoundEvent FLOWERING_AZALEA_FALL;
  public static final net.minecraft.sounds.SoundEvent FLOWERING_AZALEA_HIT;
  public static final net.minecraft.sounds.SoundEvent FLOWERING_AZALEA_PLACE;
  public static final net.minecraft.sounds.SoundEvent FLOWERING_AZALEA_STEP;
  public static final net.minecraft.sounds.SoundEvent FOX_AGGRO;
  public static final net.minecraft.sounds.SoundEvent FOX_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent FOX_BITE;
  public static final net.minecraft.sounds.SoundEvent FOX_DEATH;
  public static final net.minecraft.sounds.SoundEvent FOX_EAT;
  public static final net.minecraft.sounds.SoundEvent FOX_HURT;
  public static final net.minecraft.sounds.SoundEvent FOX_SCREECH;
  public static final net.minecraft.sounds.SoundEvent FOX_SLEEP;
  public static final net.minecraft.sounds.SoundEvent FOX_SNIFF;
  public static final net.minecraft.sounds.SoundEvent FOX_SPIT;
  public static final net.minecraft.sounds.SoundEvent FOX_TELEPORT;
  public static final net.minecraft.sounds.SoundEvent SUSPICIOUS_SAND_BREAK;
  public static final net.minecraft.sounds.SoundEvent SUSPICIOUS_SAND_STEP;
  public static final net.minecraft.sounds.SoundEvent SUSPICIOUS_SAND_PLACE;
  public static final net.minecraft.sounds.SoundEvent SUSPICIOUS_SAND_HIT;
  public static final net.minecraft.sounds.SoundEvent SUSPICIOUS_SAND_FALL;
  public static final net.minecraft.sounds.SoundEvent SUSPICIOUS_GRAVEL_BREAK;
  public static final net.minecraft.sounds.SoundEvent SUSPICIOUS_GRAVEL_STEP;
  public static final net.minecraft.sounds.SoundEvent SUSPICIOUS_GRAVEL_PLACE;
  public static final net.minecraft.sounds.SoundEvent SUSPICIOUS_GRAVEL_HIT;
  public static final net.minecraft.sounds.SoundEvent SUSPICIOUS_GRAVEL_FALL;
  public static final net.minecraft.sounds.SoundEvent FROGLIGHT_BREAK;
  public static final net.minecraft.sounds.SoundEvent FROGLIGHT_FALL;
  public static final net.minecraft.sounds.SoundEvent FROGLIGHT_HIT;
  public static final net.minecraft.sounds.SoundEvent FROGLIGHT_PLACE;
  public static final net.minecraft.sounds.SoundEvent FROGLIGHT_STEP;
  public static final net.minecraft.sounds.SoundEvent FROGSPAWNSTEP;
  public static final net.minecraft.sounds.SoundEvent FROGSPAWN_BREAK;
  public static final net.minecraft.sounds.SoundEvent FROGSPAWN_FALL;
  public static final net.minecraft.sounds.SoundEvent FROGSPAWN_HATCH;
  public static final net.minecraft.sounds.SoundEvent FROGSPAWN_HIT;
  public static final net.minecraft.sounds.SoundEvent FROGSPAWN_PLACE;
  public static final net.minecraft.sounds.SoundEvent FROG_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent FROG_DEATH;
  public static final net.minecraft.sounds.SoundEvent FROG_EAT;
  public static final net.minecraft.sounds.SoundEvent FROG_HURT;
  public static final net.minecraft.sounds.SoundEvent FROG_LAY_SPAWN;
  public static final net.minecraft.sounds.SoundEvent FROG_LONG_JUMP;
  public static final net.minecraft.sounds.SoundEvent FROG_STEP;
  public static final net.minecraft.sounds.SoundEvent FROG_TONGUE;
  public static final net.minecraft.sounds.SoundEvent ROOTS_BREAK;
  public static final net.minecraft.sounds.SoundEvent ROOTS_STEP;
  public static final net.minecraft.sounds.SoundEvent ROOTS_PLACE;
  public static final net.minecraft.sounds.SoundEvent ROOTS_HIT;
  public static final net.minecraft.sounds.SoundEvent ROOTS_FALL;
  public static final net.minecraft.sounds.SoundEvent FURNACE_FIRE_CRACKLE;
  public static final net.minecraft.sounds.SoundEvent GENERIC_BIG_FALL;
  public static final net.minecraft.sounds.SoundEvent GENERIC_BURN;
  public static final net.minecraft.sounds.SoundEvent GENERIC_DEATH;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> GENERIC_DRINK;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> GENERIC_EAT;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> GENERIC_EXPLODE;
  public static final net.minecraft.sounds.SoundEvent GENERIC_EXTINGUISH_FIRE;
  public static final net.minecraft.sounds.SoundEvent GENERIC_HURT;
  public static final net.minecraft.sounds.SoundEvent GENERIC_SMALL_FALL;
  public static final net.minecraft.sounds.SoundEvent GENERIC_SPLASH;
  public static final net.minecraft.sounds.SoundEvent GENERIC_SWIM;
  public static final net.minecraft.sounds.SoundEvent GHAST_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent GHAST_DEATH;
  public static final net.minecraft.sounds.SoundEvent GHAST_HURT;
  public static final net.minecraft.sounds.SoundEvent GHAST_SCREAM;
  public static final net.minecraft.sounds.SoundEvent GHAST_SHOOT;
  public static final net.minecraft.sounds.SoundEvent GHAST_WARN;
  public static final net.minecraft.sounds.SoundEvent GHASTLING_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent GHASTLING_DEATH;
  public static final net.minecraft.sounds.SoundEvent GHASTLING_HURT;
  public static final net.minecraft.sounds.SoundEvent GHASTLING_SPAWN;
  public static final net.minecraft.sounds.SoundEvent GILDED_BLACKSTONE_BREAK;
  public static final net.minecraft.sounds.SoundEvent GILDED_BLACKSTONE_FALL;
  public static final net.minecraft.sounds.SoundEvent GILDED_BLACKSTONE_HIT;
  public static final net.minecraft.sounds.SoundEvent GILDED_BLACKSTONE_PLACE;
  public static final net.minecraft.sounds.SoundEvent GILDED_BLACKSTONE_STEP;
  public static final net.minecraft.sounds.SoundEvent GLASS_BREAK;
  public static final net.minecraft.sounds.SoundEvent GLASS_FALL;
  public static final net.minecraft.sounds.SoundEvent GLASS_HIT;
  public static final net.minecraft.sounds.SoundEvent GLASS_PLACE;
  public static final net.minecraft.sounds.SoundEvent GLASS_STEP;
  public static final net.minecraft.sounds.SoundEvent GLOW_INK_SAC_USE;
  public static final net.minecraft.sounds.SoundEvent GLOW_ITEM_FRAME_ADD_ITEM;
  public static final net.minecraft.sounds.SoundEvent GLOW_ITEM_FRAME_BREAK;
  public static final net.minecraft.sounds.SoundEvent GLOW_ITEM_FRAME_PLACE;
  public static final net.minecraft.sounds.SoundEvent GLOW_ITEM_FRAME_REMOVE_ITEM;
  public static final net.minecraft.sounds.SoundEvent GLOW_ITEM_FRAME_ROTATE_ITEM;
  public static final net.minecraft.sounds.SoundEvent GLOW_SQUID_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent GLOW_SQUID_DEATH;
  public static final net.minecraft.sounds.SoundEvent GLOW_SQUID_HURT;
  public static final net.minecraft.sounds.SoundEvent GLOW_SQUID_SQUIRT;
  public static final net.minecraft.sounds.SoundEvent GOAT_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent GOAT_DEATH;
  public static final net.minecraft.sounds.SoundEvent GOAT_EAT;
  public static final net.minecraft.sounds.SoundEvent GOAT_HURT;
  public static final net.minecraft.sounds.SoundEvent GOAT_LONG_JUMP;
  public static final net.minecraft.sounds.SoundEvent GOAT_MILK;
  public static final net.minecraft.sounds.SoundEvent GOAT_PREPARE_RAM;
  public static final net.minecraft.sounds.SoundEvent GOAT_RAM_IMPACT;
  public static final net.minecraft.sounds.SoundEvent GOAT_HORN_BREAK;
  public static final net.minecraft.sounds.SoundEvent GOAT_SCREAMING_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent GOAT_SCREAMING_DEATH;
  public static final net.minecraft.sounds.SoundEvent GOAT_SCREAMING_EAT;
  public static final net.minecraft.sounds.SoundEvent GOAT_SCREAMING_HURT;
  public static final net.minecraft.sounds.SoundEvent GOAT_SCREAMING_LONG_JUMP;
  public static final net.minecraft.sounds.SoundEvent GOAT_SCREAMING_MILK;
  public static final net.minecraft.sounds.SoundEvent GOAT_SCREAMING_PREPARE_RAM;
  public static final net.minecraft.sounds.SoundEvent GOAT_SCREAMING_RAM_IMPACT;
  public static final net.minecraft.sounds.SoundEvent GOAT_STEP;
  public static final net.minecraft.sounds.SoundEvent GRASS_BREAK;
  public static final net.minecraft.sounds.SoundEvent GRASS_FALL;
  public static final net.minecraft.sounds.SoundEvent GRASS_HIT;
  public static final net.minecraft.sounds.SoundEvent GRASS_PLACE;
  public static final net.minecraft.sounds.SoundEvent GRASS_STEP;
  public static final net.minecraft.sounds.SoundEvent GRAVEL_BREAK;
  public static final net.minecraft.sounds.SoundEvent GRAVEL_FALL;
  public static final net.minecraft.sounds.SoundEvent GRAVEL_HIT;
  public static final net.minecraft.sounds.SoundEvent GRAVEL_PLACE;
  public static final net.minecraft.sounds.SoundEvent GRAVEL_STEP;
  public static final net.minecraft.sounds.SoundEvent GRINDSTONE_USE;
  public static final net.minecraft.sounds.SoundEvent GROWING_PLANT_CROP;
  public static final net.minecraft.sounds.SoundEvent GUARDIAN_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent GUARDIAN_AMBIENT_LAND;
  public static final net.minecraft.sounds.SoundEvent GUARDIAN_ATTACK;
  public static final net.minecraft.sounds.SoundEvent GUARDIAN_DEATH;
  public static final net.minecraft.sounds.SoundEvent GUARDIAN_DEATH_LAND;
  public static final net.minecraft.sounds.SoundEvent GUARDIAN_FLOP;
  public static final net.minecraft.sounds.SoundEvent GUARDIAN_HURT;
  public static final net.minecraft.sounds.SoundEvent GUARDIAN_HURT_LAND;
  public static final net.minecraft.sounds.SoundEvent HANGING_ROOTS_BREAK;
  public static final net.minecraft.sounds.SoundEvent HANGING_ROOTS_FALL;
  public static final net.minecraft.sounds.SoundEvent HANGING_ROOTS_HIT;
  public static final net.minecraft.sounds.SoundEvent HANGING_ROOTS_PLACE;
  public static final net.minecraft.sounds.SoundEvent HANGING_ROOTS_STEP;
  public static final net.minecraft.sounds.SoundEvent HANGING_SIGN_STEP;
  public static final net.minecraft.sounds.SoundEvent HANGING_SIGN_BREAK;
  public static final net.minecraft.sounds.SoundEvent HANGING_SIGN_FALL;
  public static final net.minecraft.sounds.SoundEvent HANGING_SIGN_HIT;
  public static final net.minecraft.sounds.SoundEvent HANGING_SIGN_PLACE;
  public static final net.minecraft.sounds.SoundEvent HAPPY_GHAST_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent HAPPY_GHAST_DEATH;
  public static final net.minecraft.sounds.SoundEvent HAPPY_GHAST_HURT;
  public static final net.minecraft.sounds.SoundEvent HAPPY_GHAST_RIDING;
  public static final net.minecraft.sounds.SoundEvent HEAVY_CORE_BREAK;
  public static final net.minecraft.sounds.SoundEvent HEAVY_CORE_FALL;
  public static final net.minecraft.sounds.SoundEvent HEAVY_CORE_HIT;
  public static final net.minecraft.sounds.SoundEvent HEAVY_CORE_PLACE;
  public static final net.minecraft.sounds.SoundEvent HEAVY_CORE_STEP;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_HANGING_SIGN_STEP;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_HANGING_SIGN_BREAK;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_HANGING_SIGN_FALL;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_HANGING_SIGN_HIT;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_HANGING_SIGN_PLACE;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_HANGING_SIGN_STEP;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_HANGING_SIGN_BREAK;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_HANGING_SIGN_FALL;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_HANGING_SIGN_HIT;
  public static final net.minecraft.sounds.SoundEvent BAMBOO_WOOD_HANGING_SIGN_PLACE;
  public static final net.minecraft.sounds.SoundEvent TRIAL_SPAWNER_BREAK;
  public static final net.minecraft.sounds.SoundEvent TRIAL_SPAWNER_STEP;
  public static final net.minecraft.sounds.SoundEvent TRIAL_SPAWNER_PLACE;
  public static final net.minecraft.sounds.SoundEvent TRIAL_SPAWNER_HIT;
  public static final net.minecraft.sounds.SoundEvent TRIAL_SPAWNER_FALL;
  public static final net.minecraft.sounds.SoundEvent TRIAL_SPAWNER_SPAWN_MOB;
  public static final net.minecraft.sounds.SoundEvent TRIAL_SPAWNER_ABOUT_TO_SPAWN_ITEM;
  public static final net.minecraft.sounds.SoundEvent TRIAL_SPAWNER_SPAWN_ITEM;
  public static final net.minecraft.sounds.SoundEvent TRIAL_SPAWNER_SPAWN_ITEM_BEGIN;
  public static final net.minecraft.sounds.SoundEvent TRIAL_SPAWNER_DETECT_PLAYER;
  public static final net.minecraft.sounds.SoundEvent TRIAL_SPAWNER_OMINOUS_ACTIVATE;
  public static final net.minecraft.sounds.SoundEvent TRIAL_SPAWNER_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent TRIAL_SPAWNER_AMBIENT_OMINOUS;
  public static final net.minecraft.sounds.SoundEvent TRIAL_SPAWNER_OPEN_SHUTTER;
  public static final net.minecraft.sounds.SoundEvent TRIAL_SPAWNER_CLOSE_SHUTTER;
  public static final net.minecraft.sounds.SoundEvent TRIAL_SPAWNER_EJECT_ITEM;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> HARNESS_EQUIP;
  public static final net.minecraft.sounds.SoundEvent HARNESS_UNEQUIP;
  public static final net.minecraft.sounds.SoundEvent HARNESS_GOGGLES_UP;
  public static final net.minecraft.sounds.SoundEvent HARNESS_GOGGLES_DOWN;
  public static final net.minecraft.sounds.SoundEvent HOE_TILL;
  public static final net.minecraft.sounds.SoundEvent HOGLIN_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent HOGLIN_ANGRY;
  public static final net.minecraft.sounds.SoundEvent HOGLIN_ATTACK;
  public static final net.minecraft.sounds.SoundEvent HOGLIN_CONVERTED_TO_ZOMBIFIED;
  public static final net.minecraft.sounds.SoundEvent HOGLIN_DEATH;
  public static final net.minecraft.sounds.SoundEvent HOGLIN_HURT;
  public static final net.minecraft.sounds.SoundEvent HOGLIN_RETREAT;
  public static final net.minecraft.sounds.SoundEvent HOGLIN_STEP;
  public static final net.minecraft.sounds.SoundEvent HONEY_BLOCK_BREAK;
  public static final net.minecraft.sounds.SoundEvent HONEY_BLOCK_FALL;
  public static final net.minecraft.sounds.SoundEvent HONEY_BLOCK_HIT;
  public static final net.minecraft.sounds.SoundEvent HONEY_BLOCK_PLACE;
  public static final net.minecraft.sounds.SoundEvent HONEY_BLOCK_SLIDE;
  public static final net.minecraft.sounds.SoundEvent HONEY_BLOCK_STEP;
  public static final net.minecraft.sounds.SoundEvent HONEYCOMB_WAX_ON;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> HONEY_DRINK;
  public static final int GOAT_HORN_VARIANT_COUNT;
  public static final com.google.common.collect.ImmutableList<net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent>> GOAT_HORN_SOUND_VARIANTS;
  public static final net.minecraft.sounds.SoundEvent HORSE_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent HORSE_ANGRY;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> HORSE_ARMOR;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> HORSE_ARMOR_UNEQUIP;
  public static final net.minecraft.sounds.SoundEvent HORSE_BREATHE;
  public static final net.minecraft.sounds.SoundEvent HORSE_DEATH;
  public static final net.minecraft.sounds.SoundEvent HORSE_EAT;
  public static final net.minecraft.sounds.SoundEvent HORSE_GALLOP;
  public static final net.minecraft.sounds.SoundEvent HORSE_HURT;
  public static final net.minecraft.sounds.SoundEvent HORSE_JUMP;
  public static final net.minecraft.sounds.SoundEvent HORSE_LAND;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> HORSE_SADDLE;
  public static final net.minecraft.sounds.SoundEvent HORSE_STEP;
  public static final net.minecraft.sounds.SoundEvent HORSE_STEP_WOOD;
  public static final net.minecraft.sounds.SoundEvent HOSTILE_BIG_FALL;
  public static final net.minecraft.sounds.SoundEvent HOSTILE_DEATH;
  public static final net.minecraft.sounds.SoundEvent HOSTILE_HURT;
  public static final net.minecraft.sounds.SoundEvent HOSTILE_SMALL_FALL;
  public static final net.minecraft.sounds.SoundEvent HOSTILE_SPLASH;
  public static final net.minecraft.sounds.SoundEvent HOSTILE_SWIM;
  public static final net.minecraft.sounds.SoundEvent HUSK_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent HUSK_CONVERTED_TO_ZOMBIE;
  public static final net.minecraft.sounds.SoundEvent HUSK_DEATH;
  public static final net.minecraft.sounds.SoundEvent HUSK_HURT;
  public static final net.minecraft.sounds.SoundEvent HUSK_STEP;
  public static final net.minecraft.sounds.SoundEvent ILLUSIONER_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent ILLUSIONER_CAST_SPELL;
  public static final net.minecraft.sounds.SoundEvent ILLUSIONER_DEATH;
  public static final net.minecraft.sounds.SoundEvent ILLUSIONER_HURT;
  public static final net.minecraft.sounds.SoundEvent ILLUSIONER_MIRROR_MOVE;
  public static final net.minecraft.sounds.SoundEvent ILLUSIONER_PREPARE_BLINDNESS;
  public static final net.minecraft.sounds.SoundEvent ILLUSIONER_PREPARE_MIRROR;
  public static final net.minecraft.sounds.SoundEvent INK_SAC_USE;
  public static final net.minecraft.sounds.SoundEvent IRON_BREAK;
  public static final net.minecraft.sounds.SoundEvent IRON_STEP;
  public static final net.minecraft.sounds.SoundEvent IRON_PLACE;
  public static final net.minecraft.sounds.SoundEvent IRON_HIT;
  public static final net.minecraft.sounds.SoundEvent IRON_FALL;
  public static final net.minecraft.sounds.SoundEvent IRON_DOOR_CLOSE;
  public static final net.minecraft.sounds.SoundEvent IRON_DOOR_OPEN;
  public static final net.minecraft.sounds.SoundEvent IRON_GOLEM_ATTACK;
  public static final net.minecraft.sounds.SoundEvent IRON_GOLEM_DAMAGE;
  public static final net.minecraft.sounds.SoundEvent IRON_GOLEM_DEATH;
  public static final net.minecraft.sounds.SoundEvent IRON_GOLEM_HURT;
  public static final net.minecraft.sounds.SoundEvent IRON_GOLEM_REPAIR;
  public static final net.minecraft.sounds.SoundEvent IRON_GOLEM_STEP;
  public static final net.minecraft.sounds.SoundEvent IRON_TRAPDOOR_CLOSE;
  public static final net.minecraft.sounds.SoundEvent IRON_TRAPDOOR_OPEN;
  public static final net.minecraft.sounds.SoundEvent ITEM_FRAME_ADD_ITEM;
  public static final net.minecraft.sounds.SoundEvent ITEM_FRAME_BREAK;
  public static final net.minecraft.sounds.SoundEvent ITEM_FRAME_PLACE;
  public static final net.minecraft.sounds.SoundEvent ITEM_FRAME_REMOVE_ITEM;
  public static final net.minecraft.sounds.SoundEvent ITEM_FRAME_ROTATE_ITEM;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> ITEM_BREAK;
  public static final net.minecraft.sounds.SoundEvent ITEM_PICKUP;
  public static final net.minecraft.sounds.SoundEvent LADDER_BREAK;
  public static final net.minecraft.sounds.SoundEvent LADDER_FALL;
  public static final net.minecraft.sounds.SoundEvent LADDER_HIT;
  public static final net.minecraft.sounds.SoundEvent LADDER_PLACE;
  public static final net.minecraft.sounds.SoundEvent LADDER_STEP;
  public static final net.minecraft.sounds.SoundEvent LANTERN_BREAK;
  public static final net.minecraft.sounds.SoundEvent LANTERN_FALL;
  public static final net.minecraft.sounds.SoundEvent LANTERN_HIT;
  public static final net.minecraft.sounds.SoundEvent LANTERN_PLACE;
  public static final net.minecraft.sounds.SoundEvent LANTERN_STEP;
  public static final net.minecraft.sounds.SoundEvent LARGE_AMETHYST_BUD_BREAK;
  public static final net.minecraft.sounds.SoundEvent LARGE_AMETHYST_BUD_PLACE;
  public static final net.minecraft.sounds.SoundEvent LAVA_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent LAVA_EXTINGUISH;
  public static final net.minecraft.sounds.SoundEvent LAVA_POP;
  public static final net.minecraft.sounds.SoundEvent LEAF_LITTER_BREAK;
  public static final net.minecraft.sounds.SoundEvent LEAF_LITTER_STEP;
  public static final net.minecraft.sounds.SoundEvent LEAF_LITTER_PLACE;
  public static final net.minecraft.sounds.SoundEvent LEAF_LITTER_HIT;
  public static final net.minecraft.sounds.SoundEvent LEAF_LITTER_FALL;
  public static final net.minecraft.sounds.SoundEvent LEAD_UNTIED;
  public static final net.minecraft.sounds.SoundEvent LEAD_TIED;
  public static final net.minecraft.sounds.SoundEvent LEAD_BREAK;
  public static final net.minecraft.sounds.SoundEvent LEVER_CLICK;
  public static final net.minecraft.sounds.SoundEvent LIGHTNING_BOLT_IMPACT;
  public static final net.minecraft.sounds.SoundEvent LIGHTNING_BOLT_THUNDER;
  public static final net.minecraft.sounds.SoundEvent LINGERING_POTION_THROW;
  public static final net.minecraft.sounds.SoundEvent LLAMA_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent LLAMA_ANGRY;
  public static final net.minecraft.sounds.SoundEvent LLAMA_CHEST;
  public static final net.minecraft.sounds.SoundEvent LLAMA_DEATH;
  public static final net.minecraft.sounds.SoundEvent LLAMA_EAT;
  public static final net.minecraft.sounds.SoundEvent LLAMA_HURT;
  public static final net.minecraft.sounds.SoundEvent LLAMA_SPIT;
  public static final net.minecraft.sounds.SoundEvent LLAMA_STEP;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> LLAMA_SWAG;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> LLAMA_CARPET_UNEQUIP;
  public static final net.minecraft.sounds.SoundEvent MAGMA_CUBE_DEATH_SMALL;
  public static final net.minecraft.sounds.SoundEvent LODESTONE_BREAK;
  public static final net.minecraft.sounds.SoundEvent LODESTONE_STEP;
  public static final net.minecraft.sounds.SoundEvent LODESTONE_PLACE;
  public static final net.minecraft.sounds.SoundEvent LODESTONE_HIT;
  public static final net.minecraft.sounds.SoundEvent LODESTONE_FALL;
  public static final net.minecraft.sounds.SoundEvent LODESTONE_COMPASS_LOCK;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> LUNGE_1;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> LUNGE_2;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> LUNGE_3;
  public static final net.minecraft.sounds.SoundEvent MACE_SMASH_AIR;
  public static final net.minecraft.sounds.SoundEvent MACE_SMASH_GROUND;
  public static final net.minecraft.sounds.SoundEvent MACE_SMASH_GROUND_HEAVY;
  public static final net.minecraft.sounds.SoundEvent MAGMA_CUBE_DEATH;
  public static final net.minecraft.sounds.SoundEvent MAGMA_CUBE_HURT;
  public static final net.minecraft.sounds.SoundEvent MAGMA_CUBE_HURT_SMALL;
  public static final net.minecraft.sounds.SoundEvent MAGMA_CUBE_JUMP;
  public static final net.minecraft.sounds.SoundEvent MAGMA_CUBE_SQUISH;
  public static final net.minecraft.sounds.SoundEvent MAGMA_CUBE_SQUISH_SMALL;
  public static final net.minecraft.sounds.SoundEvent MANGROVE_ROOTS_BREAK;
  public static final net.minecraft.sounds.SoundEvent MANGROVE_ROOTS_FALL;
  public static final net.minecraft.sounds.SoundEvent MANGROVE_ROOTS_HIT;
  public static final net.minecraft.sounds.SoundEvent MANGROVE_ROOTS_PLACE;
  public static final net.minecraft.sounds.SoundEvent MANGROVE_ROOTS_STEP;
  public static final net.minecraft.sounds.SoundEvent MEDIUM_AMETHYST_BUD_BREAK;
  public static final net.minecraft.sounds.SoundEvent MEDIUM_AMETHYST_BUD_PLACE;
  public static final net.minecraft.sounds.SoundEvent METAL_BREAK;
  public static final net.minecraft.sounds.SoundEvent METAL_FALL;
  public static final net.minecraft.sounds.SoundEvent METAL_HIT;
  public static final net.minecraft.sounds.SoundEvent METAL_PLACE;
  public static final net.minecraft.sounds.SoundEvent METAL_PRESSURE_PLATE_CLICK_OFF;
  public static final net.minecraft.sounds.SoundEvent METAL_PRESSURE_PLATE_CLICK_ON;
  public static final net.minecraft.sounds.SoundEvent METAL_STEP;
  public static final net.minecraft.sounds.SoundEvent MINECART_INSIDE_UNDERWATER;
  public static final net.minecraft.sounds.SoundEvent MINECART_INSIDE;
  public static final net.minecraft.sounds.SoundEvent MINECART_RIDING;
  public static final net.minecraft.sounds.SoundEvent MOOSHROOM_CONVERT;
  public static final net.minecraft.sounds.SoundEvent MOOSHROOM_EAT;
  public static final net.minecraft.sounds.SoundEvent MOOSHROOM_MILK;
  public static final net.minecraft.sounds.SoundEvent MOOSHROOM_MILK_SUSPICIOUSLY;
  public static final net.minecraft.sounds.SoundEvent MOOSHROOM_SHEAR;
  public static final net.minecraft.sounds.SoundEvent MOSS_CARPET_BREAK;
  public static final net.minecraft.sounds.SoundEvent MOSS_CARPET_FALL;
  public static final net.minecraft.sounds.SoundEvent MOSS_CARPET_HIT;
  public static final net.minecraft.sounds.SoundEvent MOSS_CARPET_PLACE;
  public static final net.minecraft.sounds.SoundEvent MOSS_CARPET_STEP;
  public static final net.minecraft.sounds.SoundEvent PINK_PETALS_BREAK;
  public static final net.minecraft.sounds.SoundEvent PINK_PETALS_FALL;
  public static final net.minecraft.sounds.SoundEvent PINK_PETALS_HIT;
  public static final net.minecraft.sounds.SoundEvent PINK_PETALS_PLACE;
  public static final net.minecraft.sounds.SoundEvent PINK_PETALS_STEP;
  public static final net.minecraft.sounds.SoundEvent MOSS_BREAK;
  public static final net.minecraft.sounds.SoundEvent MOSS_FALL;
  public static final net.minecraft.sounds.SoundEvent MOSS_HIT;
  public static final net.minecraft.sounds.SoundEvent MOSS_PLACE;
  public static final net.minecraft.sounds.SoundEvent MOSS_STEP;
  public static final net.minecraft.sounds.SoundEvent MUD_BREAK;
  public static final net.minecraft.sounds.SoundEvent MUD_FALL;
  public static final net.minecraft.sounds.SoundEvent MUD_HIT;
  public static final net.minecraft.sounds.SoundEvent MUD_PLACE;
  public static final net.minecraft.sounds.SoundEvent MUD_STEP;
  public static final net.minecraft.sounds.SoundEvent MUD_BRICKS_BREAK;
  public static final net.minecraft.sounds.SoundEvent MUD_BRICKS_FALL;
  public static final net.minecraft.sounds.SoundEvent MUD_BRICKS_HIT;
  public static final net.minecraft.sounds.SoundEvent MUD_BRICKS_PLACE;
  public static final net.minecraft.sounds.SoundEvent MUD_BRICKS_STEP;
  public static final net.minecraft.sounds.SoundEvent MUDDY_MANGROVE_ROOTS_BREAK;
  public static final net.minecraft.sounds.SoundEvent MUDDY_MANGROVE_ROOTS_FALL;
  public static final net.minecraft.sounds.SoundEvent MUDDY_MANGROVE_ROOTS_HIT;
  public static final net.minecraft.sounds.SoundEvent MUDDY_MANGROVE_ROOTS_PLACE;
  public static final net.minecraft.sounds.SoundEvent MUDDY_MANGROVE_ROOTS_STEP;
  public static final net.minecraft.sounds.SoundEvent MULE_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent MULE_ANGRY;
  public static final net.minecraft.sounds.SoundEvent MULE_CHEST;
  public static final net.minecraft.sounds.SoundEvent MULE_DEATH;
  public static final net.minecraft.sounds.SoundEvent MULE_EAT;
  public static final net.minecraft.sounds.SoundEvent MULE_HURT;
  public static final net.minecraft.sounds.SoundEvent MULE_JUMP;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_CREATIVE;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_CREDITS;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_5;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_11;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_13;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_BLOCKS;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_CAT;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_CHIRP;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_FAR;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_LAVA_CHICKEN;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_MALL;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_MELLOHI;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_PIGSTEP;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_STAL;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_STRAD;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_WAIT;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_WARD;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_OTHERSIDE;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_RELIC;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_CREATOR;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_CREATOR_MUSIC_BOX;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_PRECIPICE;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DISC_TEARS;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_DRAGON;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_END;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_GAME;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_MENU;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_BASALT_DELTAS;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_CRIMSON_FOREST;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_DEEP_DARK;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_DRIPSTONE_CAVES;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_GROVE;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_JAGGED_PEAKS;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_LUSH_CAVES;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_SWAMP;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_FOREST;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_OLD_GROWTH_TAIGA;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_MEADOW;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_CHERRY_GROVE;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_NETHER_WASTES;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_FROZEN_PEAKS;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_SNOWY_SLOPES;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_SOUL_SAND_VALLEY;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_STONY_PEAKS;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_WARPED_FOREST;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_FLOWER_FOREST;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_DESERT;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_BADLANDS;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_JUNGLE;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_SPARSE_JUNGLE;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_BIOME_BAMBOO_JUNGLE;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> MUSIC_UNDER_WATER;
  public static final net.minecraft.sounds.SoundEvent NAUTILUS_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent NAUTILUS_AMBIENT_ON_LAND;
  public static final net.minecraft.sounds.SoundEvent NAUTILUS_DASH;
  public static final net.minecraft.sounds.SoundEvent NAUTILUS_DASH_ON_LAND;
  public static final net.minecraft.sounds.SoundEvent NAUTILUS_DASH_READY;
  public static final net.minecraft.sounds.SoundEvent NAUTILUS_DASH_READY_ON_LAND;
  public static final net.minecraft.sounds.SoundEvent NAUTILUS_DEATH;
  public static final net.minecraft.sounds.SoundEvent NAUTILUS_DEATH_ON_LAND;
  public static final net.minecraft.sounds.SoundEvent NAUTILUS_EAT;
  public static final net.minecraft.sounds.SoundEvent NAUTILUS_HURT;
  public static final net.minecraft.sounds.SoundEvent NAUTILUS_HURT_ON_LAND;
  public static final net.minecraft.sounds.SoundEvent NAUTILUS_SWIM;
  public static final net.minecraft.sounds.SoundEvent NETHER_BRICKS_BREAK;
  public static final net.minecraft.sounds.SoundEvent NETHER_BRICKS_STEP;
  public static final net.minecraft.sounds.SoundEvent NETHER_BRICKS_PLACE;
  public static final net.minecraft.sounds.SoundEvent NETHER_BRICKS_HIT;
  public static final net.minecraft.sounds.SoundEvent NETHER_BRICKS_FALL;
  public static final net.minecraft.sounds.SoundEvent NETHER_WART_BREAK;
  public static final net.minecraft.sounds.SoundEvent NETHER_WART_PLANTED;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_BREAK;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_FALL;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_HIT;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_PLACE;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_STEP;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_DOOR_CLOSE;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_DOOR_OPEN;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_TRAPDOOR_CLOSE;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_TRAPDOOR_OPEN;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_BUTTON_CLICK_OFF;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_BUTTON_CLICK_ON;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_PRESSURE_PLATE_CLICK_ON;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_FENCE_GATE_CLOSE;
  public static final net.minecraft.sounds.SoundEvent NETHER_WOOD_FENCE_GATE_OPEN;
  public static final net.minecraft.sounds.SoundEvent EMPTY;
  public static final net.minecraft.sounds.SoundEvent PACKED_MUD_BREAK;
  public static final net.minecraft.sounds.SoundEvent PACKED_MUD_FALL;
  public static final net.minecraft.sounds.SoundEvent PACKED_MUD_HIT;
  public static final net.minecraft.sounds.SoundEvent PACKED_MUD_PLACE;
  public static final net.minecraft.sounds.SoundEvent PACKED_MUD_STEP;
  public static final net.minecraft.sounds.SoundEvent STEM_BREAK;
  public static final net.minecraft.sounds.SoundEvent STEM_STEP;
  public static final net.minecraft.sounds.SoundEvent STEM_PLACE;
  public static final net.minecraft.sounds.SoundEvent STEM_HIT;
  public static final net.minecraft.sounds.SoundEvent STEM_FALL;
  public static final net.minecraft.sounds.SoundEvent NYLIUM_BREAK;
  public static final net.minecraft.sounds.SoundEvent NYLIUM_STEP;
  public static final net.minecraft.sounds.SoundEvent NYLIUM_PLACE;
  public static final net.minecraft.sounds.SoundEvent NYLIUM_HIT;
  public static final net.minecraft.sounds.SoundEvent NYLIUM_FALL;
  public static final net.minecraft.sounds.SoundEvent NETHER_SPROUTS_BREAK;
  public static final net.minecraft.sounds.SoundEvent NETHER_SPROUTS_STEP;
  public static final net.minecraft.sounds.SoundEvent NETHER_SPROUTS_PLACE;
  public static final net.minecraft.sounds.SoundEvent NETHER_SPROUTS_HIT;
  public static final net.minecraft.sounds.SoundEvent NETHER_SPROUTS_FALL;
  public static final net.minecraft.sounds.SoundEvent FUNGUS_BREAK;
  public static final net.minecraft.sounds.SoundEvent FUNGUS_STEP;
  public static final net.minecraft.sounds.SoundEvent FUNGUS_PLACE;
  public static final net.minecraft.sounds.SoundEvent FUNGUS_HIT;
  public static final net.minecraft.sounds.SoundEvent FUNGUS_FALL;
  public static final net.minecraft.sounds.SoundEvent WEEPING_VINES_BREAK;
  public static final net.minecraft.sounds.SoundEvent WEEPING_VINES_STEP;
  public static final net.minecraft.sounds.SoundEvent WEEPING_VINES_PLACE;
  public static final net.minecraft.sounds.SoundEvent WEEPING_VINES_HIT;
  public static final net.minecraft.sounds.SoundEvent WEEPING_VINES_FALL;
  public static final net.minecraft.sounds.SoundEvent WART_BLOCK_BREAK;
  public static final net.minecraft.sounds.SoundEvent WART_BLOCK_STEP;
  public static final net.minecraft.sounds.SoundEvent WART_BLOCK_PLACE;
  public static final net.minecraft.sounds.SoundEvent WART_BLOCK_HIT;
  public static final net.minecraft.sounds.SoundEvent WART_BLOCK_FALL;
  public static final net.minecraft.sounds.SoundEvent NETHERITE_BLOCK_BREAK;
  public static final net.minecraft.sounds.SoundEvent NETHERITE_BLOCK_STEP;
  public static final net.minecraft.sounds.SoundEvent NETHERITE_BLOCK_PLACE;
  public static final net.minecraft.sounds.SoundEvent NETHERITE_BLOCK_HIT;
  public static final net.minecraft.sounds.SoundEvent NETHERITE_BLOCK_FALL;
  public static final net.minecraft.sounds.SoundEvent NETHERRACK_BREAK;
  public static final net.minecraft.sounds.SoundEvent NETHERRACK_STEP;
  public static final net.minecraft.sounds.SoundEvent NETHERRACK_PLACE;
  public static final net.minecraft.sounds.SoundEvent NETHERRACK_HIT;
  public static final net.minecraft.sounds.SoundEvent NETHERRACK_FALL;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_BASEDRUM;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_BASS;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_BELL;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_CHIME;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_FLUTE;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_GUITAR;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_HARP;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_HAT;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_PLING;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_SNARE;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_XYLOPHONE;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_IRON_XYLOPHONE;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_COW_BELL;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_DIDGERIDOO;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_BIT;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_BANJO;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_IMITATE_ZOMBIE;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_IMITATE_SKELETON;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_IMITATE_CREEPER;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_IMITATE_ENDER_DRAGON;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_IMITATE_WITHER_SKELETON;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NOTE_BLOCK_IMITATE_PIGLIN;
  public static final net.minecraft.sounds.SoundEvent OCELOT_HURT;
  public static final net.minecraft.sounds.SoundEvent OCELOT_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent OCELOT_DEATH;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> OMINOUS_BOTTLE_DISPOSE;
  public static final net.minecraft.sounds.SoundEvent PAINTING_BREAK;
  public static final net.minecraft.sounds.SoundEvent PAINTING_PLACE;
  public static final net.minecraft.sounds.SoundEvent PALE_HANGING_MOSS_IDLE;
  public static final net.minecraft.sounds.SoundEvent PANDA_PRE_SNEEZE;
  public static final net.minecraft.sounds.SoundEvent PANDA_SNEEZE;
  public static final net.minecraft.sounds.SoundEvent PANDA_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent PANDA_DEATH;
  public static final net.minecraft.sounds.SoundEvent PANDA_EAT;
  public static final net.minecraft.sounds.SoundEvent PANDA_STEP;
  public static final net.minecraft.sounds.SoundEvent PANDA_CANT_BREED;
  public static final net.minecraft.sounds.SoundEvent PANDA_AGGRESSIVE_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent PANDA_WORRIED_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent PANDA_HURT;
  public static final net.minecraft.sounds.SoundEvent PANDA_BITE;
  public static final net.minecraft.sounds.SoundEvent PARCHED_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent PARCHED_DEATH;
  public static final net.minecraft.sounds.SoundEvent PARCHED_HURT;
  public static final net.minecraft.sounds.SoundEvent PARCHED_STEP;
  public static final net.minecraft.sounds.SoundEvent PARROT_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent PARROT_DEATH;
  public static final net.minecraft.sounds.SoundEvent PARROT_EAT;
  public static final net.minecraft.sounds.SoundEvent PARROT_FLY;
  public static final net.minecraft.sounds.SoundEvent PARROT_HURT;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_BLAZE;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_BOGGED;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_BREEZE;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_CAMEL_HUSK;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_CREAKING;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_CREEPER;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_DROWNED;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_ELDER_GUARDIAN;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_ENDER_DRAGON;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_ENDERMITE;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_EVOKER;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_GHAST;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_GUARDIAN;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_HOGLIN;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_HUSK;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_ILLUSIONER;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_MAGMA_CUBE;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_PHANTOM;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_PARCHED;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_PIGLIN;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_PIGLIN_BRUTE;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_PILLAGER;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_RAVAGER;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_SHULKER;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_SILVERFISH;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_SKELETON;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_SLIME;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_SPIDER;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_STRAY;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_VEX;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_VINDICATOR;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_WARDEN;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_WITCH;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_WITHER;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_WITHER_SKELETON;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_ZOGLIN;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_ZOMBIE;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_ZOMBIE_HORSE;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_ZOMBIE_NAUTILUS;
  public static final net.minecraft.sounds.SoundEvent PARROT_IMITATE_ZOMBIE_VILLAGER;
  public static final net.minecraft.sounds.SoundEvent PARROT_STEP;
  public static final net.minecraft.sounds.SoundEvent PHANTOM_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent PHANTOM_BITE;
  public static final net.minecraft.sounds.SoundEvent PHANTOM_DEATH;
  public static final net.minecraft.sounds.SoundEvent PHANTOM_FLAP;
  public static final net.minecraft.sounds.SoundEvent PHANTOM_HURT;
  public static final net.minecraft.sounds.SoundEvent PHANTOM_SWOOP;
  public static final net.minecraft.sounds.SoundEvent PIG_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent PIG_DEATH;
  public static final net.minecraft.sounds.SoundEvent PIG_HURT;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> PIG_SADDLE;
  public static final net.minecraft.sounds.SoundEvent PIG_STEP;
  public static final net.minecraft.sounds.SoundEvent PIGLIN_ADMIRING_ITEM;
  public static final net.minecraft.sounds.SoundEvent PIGLIN_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent PIGLIN_ANGRY;
  public static final net.minecraft.sounds.SoundEvent PIGLIN_CELEBRATE;
  public static final net.minecraft.sounds.SoundEvent PIGLIN_DEATH;
  public static final net.minecraft.sounds.SoundEvent PIGLIN_JEALOUS;
  public static final net.minecraft.sounds.SoundEvent PIGLIN_HURT;
  public static final net.minecraft.sounds.SoundEvent PIGLIN_RETREAT;
  public static final net.minecraft.sounds.SoundEvent PIGLIN_STEP;
  public static final net.minecraft.sounds.SoundEvent PIGLIN_CONVERTED_TO_ZOMBIFIED;
  public static final net.minecraft.sounds.SoundEvent PIGLIN_BRUTE_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent PIGLIN_BRUTE_ANGRY;
  public static final net.minecraft.sounds.SoundEvent PIGLIN_BRUTE_DEATH;
  public static final net.minecraft.sounds.SoundEvent PIGLIN_BRUTE_HURT;
  public static final net.minecraft.sounds.SoundEvent PIGLIN_BRUTE_STEP;
  public static final net.minecraft.sounds.SoundEvent PIGLIN_BRUTE_CONVERTED_TO_ZOMBIFIED;
  public static final net.minecraft.sounds.SoundEvent PILLAGER_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent PILLAGER_CELEBRATE;
  public static final net.minecraft.sounds.SoundEvent PILLAGER_DEATH;
  public static final net.minecraft.sounds.SoundEvent PILLAGER_HURT;
  public static final net.minecraft.sounds.SoundEvent PISTON_CONTRACT;
  public static final net.minecraft.sounds.SoundEvent PISTON_EXTEND;
  public static final net.minecraft.sounds.SoundEvent PLAYER_ATTACK_CRIT;
  public static final net.minecraft.sounds.SoundEvent PLAYER_ATTACK_KNOCKBACK;
  public static final net.minecraft.sounds.SoundEvent PLAYER_ATTACK_NODAMAGE;
  public static final net.minecraft.sounds.SoundEvent PLAYER_ATTACK_STRONG;
  public static final net.minecraft.sounds.SoundEvent PLAYER_ATTACK_SWEEP;
  public static final net.minecraft.sounds.SoundEvent PLAYER_ATTACK_WEAK;
  public static final net.minecraft.sounds.SoundEvent PLAYER_BIG_FALL;
  public static final net.minecraft.sounds.SoundEvent PLAYER_BREATH;
  public static final net.minecraft.sounds.SoundEvent PLAYER_BURP;
  public static final net.minecraft.sounds.SoundEvent PLAYER_DEATH;
  public static final net.minecraft.sounds.SoundEvent PLAYER_HURT;
  public static final net.minecraft.sounds.SoundEvent PLAYER_HURT_DROWN;
  public static final net.minecraft.sounds.SoundEvent PLAYER_HURT_FREEZE;
  public static final net.minecraft.sounds.SoundEvent PLAYER_HURT_ON_FIRE;
  public static final net.minecraft.sounds.SoundEvent PLAYER_HURT_SWEET_BERRY_BUSH;
  public static final net.minecraft.sounds.SoundEvent PLAYER_LEVELUP;
  public static final net.minecraft.sounds.SoundEvent PLAYER_SMALL_FALL;
  public static final net.minecraft.sounds.SoundEvent PLAYER_SPLASH;
  public static final net.minecraft.sounds.SoundEvent PLAYER_SPLASH_HIGH_SPEED;
  public static final net.minecraft.sounds.SoundEvent PLAYER_SWIM;
  public static final net.minecraft.sounds.SoundEvent PLAYER_TELEPORT;
  public static final net.minecraft.sounds.SoundEvent POLAR_BEAR_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent POLAR_BEAR_AMBIENT_BABY;
  public static final net.minecraft.sounds.SoundEvent POLAR_BEAR_DEATH;
  public static final net.minecraft.sounds.SoundEvent POLAR_BEAR_HURT;
  public static final net.minecraft.sounds.SoundEvent POLAR_BEAR_STEP;
  public static final net.minecraft.sounds.SoundEvent POLAR_BEAR_WARNING;
  public static final net.minecraft.sounds.SoundEvent POLISHED_DEEPSLATE_BREAK;
  public static final net.minecraft.sounds.SoundEvent POLISHED_DEEPSLATE_FALL;
  public static final net.minecraft.sounds.SoundEvent POLISHED_DEEPSLATE_HIT;
  public static final net.minecraft.sounds.SoundEvent POLISHED_DEEPSLATE_PLACE;
  public static final net.minecraft.sounds.SoundEvent POLISHED_DEEPSLATE_STEP;
  public static final net.minecraft.sounds.SoundEvent PORTAL_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent PORTAL_TRAVEL;
  public static final net.minecraft.sounds.SoundEvent PORTAL_TRIGGER;
  public static final net.minecraft.sounds.SoundEvent POWDER_SNOW_BREAK;
  public static final net.minecraft.sounds.SoundEvent POWDER_SNOW_FALL;
  public static final net.minecraft.sounds.SoundEvent POWDER_SNOW_HIT;
  public static final net.minecraft.sounds.SoundEvent POWDER_SNOW_PLACE;
  public static final net.minecraft.sounds.SoundEvent POWDER_SNOW_STEP;
  public static final net.minecraft.sounds.SoundEvent PUFFER_FISH_BLOW_OUT;
  public static final net.minecraft.sounds.SoundEvent PUFFER_FISH_BLOW_UP;
  public static final net.minecraft.sounds.SoundEvent PUFFER_FISH_DEATH;
  public static final net.minecraft.sounds.SoundEvent PUFFER_FISH_FLOP;
  public static final net.minecraft.sounds.SoundEvent PUFFER_FISH_HURT;
  public static final net.minecraft.sounds.SoundEvent PUFFER_FISH_STING;
  public static final net.minecraft.sounds.SoundEvent PUMPKIN_CARVE;
  public static final net.minecraft.sounds.SoundEvent RABBIT_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent RABBIT_ATTACK;
  public static final net.minecraft.sounds.SoundEvent RABBIT_DEATH;
  public static final net.minecraft.sounds.SoundEvent RABBIT_HURT;
  public static final net.minecraft.sounds.SoundEvent RABBIT_JUMP;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> RAID_HORN;
  public static final net.minecraft.sounds.SoundEvent RAVAGER_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent RAVAGER_ATTACK;
  public static final net.minecraft.sounds.SoundEvent RAVAGER_CELEBRATE;
  public static final net.minecraft.sounds.SoundEvent RAVAGER_DEATH;
  public static final net.minecraft.sounds.SoundEvent RAVAGER_HURT;
  public static final net.minecraft.sounds.SoundEvent RAVAGER_STEP;
  public static final net.minecraft.sounds.SoundEvent RAVAGER_STUNNED;
  public static final net.minecraft.sounds.SoundEvent RAVAGER_ROAR;
  public static final net.minecraft.sounds.SoundEvent NETHER_GOLD_ORE_BREAK;
  public static final net.minecraft.sounds.SoundEvent NETHER_GOLD_ORE_FALL;
  public static final net.minecraft.sounds.SoundEvent NETHER_GOLD_ORE_HIT;
  public static final net.minecraft.sounds.SoundEvent NETHER_GOLD_ORE_PLACE;
  public static final net.minecraft.sounds.SoundEvent NETHER_GOLD_ORE_STEP;
  public static final net.minecraft.sounds.SoundEvent NETHER_ORE_BREAK;
  public static final net.minecraft.sounds.SoundEvent NETHER_ORE_FALL;
  public static final net.minecraft.sounds.SoundEvent NETHER_ORE_HIT;
  public static final net.minecraft.sounds.SoundEvent NETHER_ORE_PLACE;
  public static final net.minecraft.sounds.SoundEvent NETHER_ORE_STEP;
  public static final net.minecraft.sounds.SoundEvent REDSTONE_TORCH_BURNOUT;
  public static final net.minecraft.sounds.SoundEvent RESIN_BREAK;
  public static final net.minecraft.sounds.SoundEvent RESIN_FALL;
  public static final net.minecraft.sounds.SoundEvent RESIN_PLACE;
  public static final net.minecraft.sounds.SoundEvent RESIN_STEP;
  public static final net.minecraft.sounds.SoundEvent RESIN_BRICKS_BREAK;
  public static final net.minecraft.sounds.SoundEvent RESIN_BRICKS_FALL;
  public static final net.minecraft.sounds.SoundEvent RESIN_BRICKS_HIT;
  public static final net.minecraft.sounds.SoundEvent RESIN_BRICKS_PLACE;
  public static final net.minecraft.sounds.SoundEvent RESIN_BRICKS_STEP;
  public static final net.minecraft.sounds.SoundEvent RESPAWN_ANCHOR_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent RESPAWN_ANCHOR_CHARGE;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> RESPAWN_ANCHOR_DEPLETE;
  public static final net.minecraft.sounds.SoundEvent RESPAWN_ANCHOR_SET_SPAWN;
  public static final net.minecraft.sounds.SoundEvent ROOTED_DIRT_BREAK;
  public static final net.minecraft.sounds.SoundEvent ROOTED_DIRT_FALL;
  public static final net.minecraft.sounds.SoundEvent ROOTED_DIRT_HIT;
  public static final net.minecraft.sounds.SoundEvent ROOTED_DIRT_PLACE;
  public static final net.minecraft.sounds.SoundEvent ROOTED_DIRT_STEP;
  public static final net.minecraft.sounds.SoundEvent SALMON_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent SALMON_DEATH;
  public static final net.minecraft.sounds.SoundEvent SALMON_FLOP;
  public static final net.minecraft.sounds.SoundEvent SALMON_HURT;
  public static final net.minecraft.sounds.SoundEvent SAND_BREAK;
  public static final net.minecraft.sounds.SoundEvent SAND_FALL;
  public static final net.minecraft.sounds.SoundEvent SAND_HIT;
  public static final net.minecraft.sounds.SoundEvent SAND_PLACE;
  public static final net.minecraft.sounds.SoundEvent SAND_STEP;
  public static final net.minecraft.sounds.SoundEvent SAND_IDLE;
  public static final net.minecraft.sounds.SoundEvent SCAFFOLDING_BREAK;
  public static final net.minecraft.sounds.SoundEvent SCAFFOLDING_FALL;
  public static final net.minecraft.sounds.SoundEvent SCAFFOLDING_HIT;
  public static final net.minecraft.sounds.SoundEvent SCAFFOLDING_PLACE;
  public static final net.minecraft.sounds.SoundEvent SCAFFOLDING_STEP;
  public static final net.minecraft.sounds.SoundEvent SCULK_BLOCK_SPREAD;
  public static final net.minecraft.sounds.SoundEvent SCULK_BLOCK_CHARGE;
  public static final net.minecraft.sounds.SoundEvent SCULK_BLOCK_BREAK;
  public static final net.minecraft.sounds.SoundEvent SCULK_BLOCK_FALL;
  public static final net.minecraft.sounds.SoundEvent SCULK_BLOCK_HIT;
  public static final net.minecraft.sounds.SoundEvent SCULK_BLOCK_PLACE;
  public static final net.minecraft.sounds.SoundEvent SCULK_BLOCK_STEP;
  public static final net.minecraft.sounds.SoundEvent SCULK_CATALYST_BLOOM;
  public static final net.minecraft.sounds.SoundEvent SCULK_CATALYST_BREAK;
  public static final net.minecraft.sounds.SoundEvent SCULK_CATALYST_FALL;
  public static final net.minecraft.sounds.SoundEvent SCULK_CATALYST_HIT;
  public static final net.minecraft.sounds.SoundEvent SCULK_CATALYST_PLACE;
  public static final net.minecraft.sounds.SoundEvent SCULK_CATALYST_STEP;
  public static final net.minecraft.sounds.SoundEvent SCULK_CLICKING;
  public static final net.minecraft.sounds.SoundEvent SCULK_CLICKING_STOP;
  public static final net.minecraft.sounds.SoundEvent SCULK_SENSOR_BREAK;
  public static final net.minecraft.sounds.SoundEvent SCULK_SENSOR_FALL;
  public static final net.minecraft.sounds.SoundEvent SCULK_SENSOR_HIT;
  public static final net.minecraft.sounds.SoundEvent SCULK_SENSOR_PLACE;
  public static final net.minecraft.sounds.SoundEvent SCULK_SENSOR_STEP;
  public static final net.minecraft.sounds.SoundEvent SCULK_SHRIEKER_BREAK;
  public static final net.minecraft.sounds.SoundEvent SCULK_SHRIEKER_FALL;
  public static final net.minecraft.sounds.SoundEvent SCULK_SHRIEKER_HIT;
  public static final net.minecraft.sounds.SoundEvent SCULK_SHRIEKER_PLACE;
  public static final net.minecraft.sounds.SoundEvent SCULK_SHRIEKER_SHRIEK;
  public static final net.minecraft.sounds.SoundEvent SCULK_SHRIEKER_STEP;
  public static final net.minecraft.sounds.SoundEvent SCULK_VEIN_BREAK;
  public static final net.minecraft.sounds.SoundEvent SCULK_VEIN_FALL;
  public static final net.minecraft.sounds.SoundEvent SCULK_VEIN_HIT;
  public static final net.minecraft.sounds.SoundEvent SCULK_VEIN_PLACE;
  public static final net.minecraft.sounds.SoundEvent SCULK_VEIN_STEP;
  public static final net.minecraft.sounds.SoundEvent SHEEP_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent SHEEP_DEATH;
  public static final net.minecraft.sounds.SoundEvent SHEEP_HURT;
  public static final net.minecraft.sounds.SoundEvent SHEEP_SHEAR;
  public static final net.minecraft.sounds.SoundEvent SHEEP_STEP;
  public static final net.minecraft.sounds.SoundEvent SHEARS_SNIP;
  public static final net.minecraft.sounds.SoundEvent SHELF_ACTIVATE;
  public static final net.minecraft.sounds.SoundEvent SHELF_BREAK;
  public static final net.minecraft.sounds.SoundEvent SHELF_DEACTIVATE;
  public static final net.minecraft.sounds.SoundEvent SHELF_FALL;
  public static final net.minecraft.sounds.SoundEvent SHELF_HIT;
  public static final net.minecraft.sounds.SoundEvent SHELF_MULTI_SWAP;
  public static final net.minecraft.sounds.SoundEvent SHELF_PLACE;
  public static final net.minecraft.sounds.SoundEvent SHELF_PLACE_ITEM;
  public static final net.minecraft.sounds.SoundEvent SHELF_SINGLE_SWAP;
  public static final net.minecraft.sounds.SoundEvent SHELF_STEP;
  public static final net.minecraft.sounds.SoundEvent SHELF_TAKE_ITEM;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> SHIELD_BLOCK;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> SHIELD_BREAK;
  public static final net.minecraft.sounds.SoundEvent SHROOMLIGHT_BREAK;
  public static final net.minecraft.sounds.SoundEvent SHROOMLIGHT_STEP;
  public static final net.minecraft.sounds.SoundEvent SHROOMLIGHT_PLACE;
  public static final net.minecraft.sounds.SoundEvent SHROOMLIGHT_HIT;
  public static final net.minecraft.sounds.SoundEvent SHROOMLIGHT_FALL;
  public static final net.minecraft.sounds.SoundEvent SHOVEL_FLATTEN;
  public static final net.minecraft.sounds.SoundEvent SHULKER_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent SHULKER_BOX_CLOSE;
  public static final net.minecraft.sounds.SoundEvent SHULKER_BOX_OPEN;
  public static final net.minecraft.sounds.SoundEvent SHULKER_BULLET_HIT;
  public static final net.minecraft.sounds.SoundEvent SHULKER_BULLET_HURT;
  public static final net.minecraft.sounds.SoundEvent SHULKER_CLOSE;
  public static final net.minecraft.sounds.SoundEvent SHULKER_DEATH;
  public static final net.minecraft.sounds.SoundEvent SHULKER_HURT;
  public static final net.minecraft.sounds.SoundEvent SHULKER_HURT_CLOSED;
  public static final net.minecraft.sounds.SoundEvent SHULKER_OPEN;
  public static final net.minecraft.sounds.SoundEvent SHULKER_SHOOT;
  public static final net.minecraft.sounds.SoundEvent SHULKER_TELEPORT;
  public static final net.minecraft.sounds.SoundEvent SILVERFISH_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent SILVERFISH_DEATH;
  public static final net.minecraft.sounds.SoundEvent SILVERFISH_HURT;
  public static final net.minecraft.sounds.SoundEvent SILVERFISH_STEP;
  public static final net.minecraft.sounds.SoundEvent SKELETON_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent SKELETON_CONVERTED_TO_STRAY;
  public static final net.minecraft.sounds.SoundEvent SKELETON_DEATH;
  public static final net.minecraft.sounds.SoundEvent SKELETON_HORSE_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent SKELETON_HORSE_DEATH;
  public static final net.minecraft.sounds.SoundEvent SKELETON_HORSE_HURT;
  public static final net.minecraft.sounds.SoundEvent SKELETON_HORSE_SWIM;
  public static final net.minecraft.sounds.SoundEvent SKELETON_HORSE_AMBIENT_WATER;
  public static final net.minecraft.sounds.SoundEvent SKELETON_HORSE_GALLOP_WATER;
  public static final net.minecraft.sounds.SoundEvent SKELETON_HORSE_JUMP_WATER;
  public static final net.minecraft.sounds.SoundEvent SKELETON_HORSE_STEP_WATER;
  public static final net.minecraft.sounds.SoundEvent SKELETON_HURT;
  public static final net.minecraft.sounds.SoundEvent SKELETON_SHOOT;
  public static final net.minecraft.sounds.SoundEvent SKELETON_STEP;
  public static final net.minecraft.sounds.SoundEvent SLIME_ATTACK;
  public static final net.minecraft.sounds.SoundEvent SLIME_DEATH;
  public static final net.minecraft.sounds.SoundEvent SLIME_HURT;
  public static final net.minecraft.sounds.SoundEvent SLIME_JUMP;
  public static final net.minecraft.sounds.SoundEvent SLIME_SQUISH;
  public static final net.minecraft.sounds.SoundEvent SLIME_BLOCK_BREAK;
  public static final net.minecraft.sounds.SoundEvent SLIME_BLOCK_FALL;
  public static final net.minecraft.sounds.SoundEvent SLIME_BLOCK_HIT;
  public static final net.minecraft.sounds.SoundEvent SLIME_BLOCK_PLACE;
  public static final net.minecraft.sounds.SoundEvent SLIME_BLOCK_STEP;
  public static final net.minecraft.sounds.SoundEvent SMALL_AMETHYST_BUD_BREAK;
  public static final net.minecraft.sounds.SoundEvent SMALL_AMETHYST_BUD_PLACE;
  public static final net.minecraft.sounds.SoundEvent SMALL_DRIPLEAF_BREAK;
  public static final net.minecraft.sounds.SoundEvent SMALL_DRIPLEAF_FALL;
  public static final net.minecraft.sounds.SoundEvent SMALL_DRIPLEAF_HIT;
  public static final net.minecraft.sounds.SoundEvent SMALL_DRIPLEAF_PLACE;
  public static final net.minecraft.sounds.SoundEvent SMALL_DRIPLEAF_STEP;
  public static final net.minecraft.sounds.SoundEvent SOUL_SAND_BREAK;
  public static final net.minecraft.sounds.SoundEvent SOUL_SAND_STEP;
  public static final net.minecraft.sounds.SoundEvent SOUL_SAND_PLACE;
  public static final net.minecraft.sounds.SoundEvent SOUL_SAND_HIT;
  public static final net.minecraft.sounds.SoundEvent SOUL_SAND_FALL;
  public static final net.minecraft.sounds.SoundEvent SOUL_SOIL_BREAK;
  public static final net.minecraft.sounds.SoundEvent SOUL_SOIL_STEP;
  public static final net.minecraft.sounds.SoundEvent SOUL_SOIL_PLACE;
  public static final net.minecraft.sounds.SoundEvent SOUL_SOIL_HIT;
  public static final net.minecraft.sounds.SoundEvent SOUL_SOIL_FALL;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> SOUL_ESCAPE;
  public static final net.minecraft.sounds.SoundEvent SPAWNER_BREAK;
  public static final net.minecraft.sounds.SoundEvent SPAWNER_FALL;
  public static final net.minecraft.sounds.SoundEvent SPAWNER_HIT;
  public static final net.minecraft.sounds.SoundEvent SPAWNER_PLACE;
  public static final net.minecraft.sounds.SoundEvent SPAWNER_STEP;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> SPEAR_USE;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> SPEAR_HIT;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> SPEAR_ATTACK;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> SPEAR_WOOD_USE;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> SPEAR_WOOD_HIT;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> SPEAR_WOOD_ATTACK;
  public static final net.minecraft.sounds.SoundEvent SPORE_BLOSSOM_BREAK;
  public static final net.minecraft.sounds.SoundEvent SPORE_BLOSSOM_FALL;
  public static final net.minecraft.sounds.SoundEvent SPORE_BLOSSOM_HIT;
  public static final net.minecraft.sounds.SoundEvent SPORE_BLOSSOM_PLACE;
  public static final net.minecraft.sounds.SoundEvent SPORE_BLOSSOM_STEP;
  public static final net.minecraft.sounds.SoundEvent STRIDER_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent STRIDER_HAPPY;
  public static final net.minecraft.sounds.SoundEvent STRIDER_RETREAT;
  public static final net.minecraft.sounds.SoundEvent STRIDER_DEATH;
  public static final net.minecraft.sounds.SoundEvent STRIDER_HURT;
  public static final net.minecraft.sounds.SoundEvent STRIDER_STEP;
  public static final net.minecraft.sounds.SoundEvent STRIDER_STEP_LAVA;
  public static final net.minecraft.sounds.SoundEvent STRIDER_EAT;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> STRIDER_SADDLE;
  public static final net.minecraft.sounds.SoundEvent SLIME_DEATH_SMALL;
  public static final net.minecraft.sounds.SoundEvent SLIME_HURT_SMALL;
  public static final net.minecraft.sounds.SoundEvent SLIME_JUMP_SMALL;
  public static final net.minecraft.sounds.SoundEvent SLIME_SQUISH_SMALL;
  public static final net.minecraft.sounds.SoundEvent SMITHING_TABLE_USE;
  public static final net.minecraft.sounds.SoundEvent SMOKER_SMOKE;
  public static final net.minecraft.sounds.SoundEvent SNIFFER_STEP;
  public static final net.minecraft.sounds.SoundEvent SNIFFER_EAT;
  public static final net.minecraft.sounds.SoundEvent SNIFFER_IDLE;
  public static final net.minecraft.sounds.SoundEvent SNIFFER_HURT;
  public static final net.minecraft.sounds.SoundEvent SNIFFER_DEATH;
  public static final net.minecraft.sounds.SoundEvent SNIFFER_DROP_SEED;
  public static final net.minecraft.sounds.SoundEvent SNIFFER_SCENTING;
  public static final net.minecraft.sounds.SoundEvent SNIFFER_SNIFFING;
  public static final net.minecraft.sounds.SoundEvent SNIFFER_SEARCHING;
  public static final net.minecraft.sounds.SoundEvent SNIFFER_DIGGING;
  public static final net.minecraft.sounds.SoundEvent SNIFFER_DIGGING_STOP;
  public static final net.minecraft.sounds.SoundEvent SNIFFER_HAPPY;
  public static final net.minecraft.sounds.SoundEvent SNIFFER_EGG_PLOP;
  public static final net.minecraft.sounds.SoundEvent SNIFFER_EGG_CRACK;
  public static final net.minecraft.sounds.SoundEvent SNIFFER_EGG_HATCH;
  public static final net.minecraft.sounds.SoundEvent SNOWBALL_THROW;
  public static final net.minecraft.sounds.SoundEvent SNOW_BREAK;
  public static final net.minecraft.sounds.SoundEvent SNOW_FALL;
  public static final net.minecraft.sounds.SoundEvent SNOW_GOLEM_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent SNOW_GOLEM_DEATH;
  public static final net.minecraft.sounds.SoundEvent SNOW_GOLEM_HURT;
  public static final net.minecraft.sounds.SoundEvent SNOW_GOLEM_SHOOT;
  public static final net.minecraft.sounds.SoundEvent SNOW_GOLEM_SHEAR;
  public static final net.minecraft.sounds.SoundEvent SNOW_HIT;
  public static final net.minecraft.sounds.SoundEvent SNOW_PLACE;
  public static final net.minecraft.sounds.SoundEvent SNOW_STEP;
  public static final net.minecraft.sounds.SoundEvent SPIDER_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent SPIDER_DEATH;
  public static final net.minecraft.sounds.SoundEvent SPIDER_HURT;
  public static final net.minecraft.sounds.SoundEvent SPIDER_STEP;
  public static final net.minecraft.sounds.SoundEvent SPLASH_POTION_BREAK;
  public static final net.minecraft.sounds.SoundEvent SPLASH_POTION_THROW;
  public static final net.minecraft.sounds.SoundEvent SPONGE_BREAK;
  public static final net.minecraft.sounds.SoundEvent SPONGE_FALL;
  public static final net.minecraft.sounds.SoundEvent SPONGE_HIT;
  public static final net.minecraft.sounds.SoundEvent SPONGE_PLACE;
  public static final net.minecraft.sounds.SoundEvent SPONGE_STEP;
  public static final net.minecraft.sounds.SoundEvent SPONGE_ABSORB;
  public static final net.minecraft.sounds.SoundEvent SPYGLASS_USE;
  public static final net.minecraft.sounds.SoundEvent SPYGLASS_STOP_USING;
  public static final net.minecraft.sounds.SoundEvent SQUID_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent SQUID_DEATH;
  public static final net.minecraft.sounds.SoundEvent SQUID_HURT;
  public static final net.minecraft.sounds.SoundEvent SQUID_SQUIRT;
  public static final net.minecraft.sounds.SoundEvent STONE_BREAK;
  public static final net.minecraft.sounds.SoundEvent STONE_BUTTON_CLICK_OFF;
  public static final net.minecraft.sounds.SoundEvent STONE_BUTTON_CLICK_ON;
  public static final net.minecraft.sounds.SoundEvent STONE_FALL;
  public static final net.minecraft.sounds.SoundEvent STONE_HIT;
  public static final net.minecraft.sounds.SoundEvent STONE_PLACE;
  public static final net.minecraft.sounds.SoundEvent STONE_PRESSURE_PLATE_CLICK_OFF;
  public static final net.minecraft.sounds.SoundEvent STONE_PRESSURE_PLATE_CLICK_ON;
  public static final net.minecraft.sounds.SoundEvent STONE_STEP;
  public static final net.minecraft.sounds.SoundEvent STRAY_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent STRAY_DEATH;
  public static final net.minecraft.sounds.SoundEvent STRAY_HURT;
  public static final net.minecraft.sounds.SoundEvent STRAY_STEP;
  public static final net.minecraft.sounds.SoundEvent SWEET_BERRY_BUSH_BREAK;
  public static final net.minecraft.sounds.SoundEvent SWEET_BERRY_BUSH_PLACE;
  public static final net.minecraft.sounds.SoundEvent SWEET_BERRY_BUSH_PICK_BERRIES;
  public static final net.minecraft.sounds.SoundEvent TADPOLE_DEATH;
  public static final net.minecraft.sounds.SoundEvent TADPOLE_FLOP;
  public static final net.minecraft.sounds.SoundEvent TADPOLE_GROW_UP;
  public static final net.minecraft.sounds.SoundEvent TADPOLE_HURT;
  public static final net.minecraft.sounds.SoundEvent THORNS_HIT;
  public static final net.minecraft.sounds.SoundEvent TNT_PRIMED;
  public static final net.minecraft.sounds.SoundEvent TOTEM_USE;
  public static final net.minecraft.sounds.SoundEvent TRIDENT_HIT;
  public static final net.minecraft.sounds.SoundEvent TRIDENT_HIT_GROUND;
  public static final net.minecraft.sounds.SoundEvent TRIDENT_RETURN;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> TRIDENT_RIPTIDE_1;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> TRIDENT_RIPTIDE_2;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> TRIDENT_RIPTIDE_3;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> TRIDENT_THROW;
  public static final net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> TRIDENT_THUNDER;
  public static final net.minecraft.sounds.SoundEvent TRIPWIRE_ATTACH;
  public static final net.minecraft.sounds.SoundEvent TRIPWIRE_CLICK_OFF;
  public static final net.minecraft.sounds.SoundEvent TRIPWIRE_CLICK_ON;
  public static final net.minecraft.sounds.SoundEvent TRIPWIRE_DETACH;
  public static final net.minecraft.sounds.SoundEvent TROPICAL_FISH_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent TROPICAL_FISH_DEATH;
  public static final net.minecraft.sounds.SoundEvent TROPICAL_FISH_FLOP;
  public static final net.minecraft.sounds.SoundEvent TROPICAL_FISH_HURT;
  public static final net.minecraft.sounds.SoundEvent TUFF_BREAK;
  public static final net.minecraft.sounds.SoundEvent TUFF_STEP;
  public static final net.minecraft.sounds.SoundEvent TUFF_PLACE;
  public static final net.minecraft.sounds.SoundEvent TUFF_HIT;
  public static final net.minecraft.sounds.SoundEvent TUFF_FALL;
  public static final net.minecraft.sounds.SoundEvent TUFF_BRICKS_BREAK;
  public static final net.minecraft.sounds.SoundEvent TUFF_BRICKS_FALL;
  public static final net.minecraft.sounds.SoundEvent TUFF_BRICKS_HIT;
  public static final net.minecraft.sounds.SoundEvent TUFF_BRICKS_PLACE;
  public static final net.minecraft.sounds.SoundEvent TUFF_BRICKS_STEP;
  public static final net.minecraft.sounds.SoundEvent POLISHED_TUFF_BREAK;
  public static final net.minecraft.sounds.SoundEvent POLISHED_TUFF_FALL;
  public static final net.minecraft.sounds.SoundEvent POLISHED_TUFF_HIT;
  public static final net.minecraft.sounds.SoundEvent POLISHED_TUFF_PLACE;
  public static final net.minecraft.sounds.SoundEvent POLISHED_TUFF_STEP;
  public static final net.minecraft.sounds.SoundEvent TURTLE_AMBIENT_LAND;
  public static final net.minecraft.sounds.SoundEvent TURTLE_DEATH;
  public static final net.minecraft.sounds.SoundEvent TURTLE_DEATH_BABY;
  public static final net.minecraft.sounds.SoundEvent TURTLE_EGG_BREAK;
  public static final net.minecraft.sounds.SoundEvent TURTLE_EGG_CRACK;
  public static final net.minecraft.sounds.SoundEvent TURTLE_EGG_HATCH;
  public static final net.minecraft.sounds.SoundEvent TURTLE_HURT;
  public static final net.minecraft.sounds.SoundEvent TURTLE_HURT_BABY;
  public static final net.minecraft.sounds.SoundEvent TURTLE_LAY_EGG;
  public static final net.minecraft.sounds.SoundEvent TURTLE_SHAMBLE;
  public static final net.minecraft.sounds.SoundEvent TURTLE_SHAMBLE_BABY;
  public static final net.minecraft.sounds.SoundEvent TURTLE_SWIM;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> UI_BUTTON_CLICK;
  public static final net.minecraft.sounds.SoundEvent UI_LOOM_SELECT_PATTERN;
  public static final net.minecraft.sounds.SoundEvent UI_LOOM_TAKE_RESULT;
  public static final net.minecraft.sounds.SoundEvent UI_CARTOGRAPHY_TABLE_TAKE_RESULT;
  public static final net.minecraft.sounds.SoundEvent UI_STONECUTTER_TAKE_RESULT;
  public static final net.minecraft.sounds.SoundEvent UI_STONECUTTER_SELECT_RECIPE;
  public static final net.minecraft.sounds.SoundEvent UI_TOAST_CHALLENGE_COMPLETE;
  public static final net.minecraft.sounds.SoundEvent UI_TOAST_IN;
  public static final net.minecraft.sounds.SoundEvent UI_TOAST_OUT;
  public static final net.minecraft.sounds.SoundEvent VAULT_ACTIVATE;
  public static final net.minecraft.sounds.SoundEvent VAULT_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent VAULT_BREAK;
  public static final net.minecraft.sounds.SoundEvent VAULT_CLOSE_SHUTTER;
  public static final net.minecraft.sounds.SoundEvent VAULT_DEACTIVATE;
  public static final net.minecraft.sounds.SoundEvent VAULT_EJECT_ITEM;
  public static final net.minecraft.sounds.SoundEvent VAULT_REJECT_REWARDED_PLAYER;
  public static final net.minecraft.sounds.SoundEvent VAULT_FALL;
  public static final net.minecraft.sounds.SoundEvent VAULT_HIT;
  public static final net.minecraft.sounds.SoundEvent VAULT_INSERT_ITEM;
  public static final net.minecraft.sounds.SoundEvent VAULT_INSERT_ITEM_FAIL;
  public static final net.minecraft.sounds.SoundEvent VAULT_OPEN_SHUTTER;
  public static final net.minecraft.sounds.SoundEvent VAULT_PLACE;
  public static final net.minecraft.sounds.SoundEvent VAULT_STEP;
  public static final net.minecraft.sounds.SoundEvent VEX_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent VEX_CHARGE;
  public static final net.minecraft.sounds.SoundEvent VEX_DEATH;
  public static final net.minecraft.sounds.SoundEvent VEX_HURT;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_CELEBRATE;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_DEATH;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_HURT;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_NO;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_TRADE;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_YES;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_WORK_ARMORER;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_WORK_BUTCHER;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_WORK_CARTOGRAPHER;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_WORK_CLERIC;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_WORK_FARMER;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_WORK_FISHERMAN;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_WORK_FLETCHER;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_WORK_LEATHERWORKER;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_WORK_LIBRARIAN;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_WORK_MASON;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_WORK_SHEPHERD;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_WORK_TOOLSMITH;
  public static final net.minecraft.sounds.SoundEvent VILLAGER_WORK_WEAPONSMITH;
  public static final net.minecraft.sounds.SoundEvent VINDICATOR_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent VINDICATOR_CELEBRATE;
  public static final net.minecraft.sounds.SoundEvent VINDICATOR_DEATH;
  public static final net.minecraft.sounds.SoundEvent VINDICATOR_HURT;
  public static final net.minecraft.sounds.SoundEvent VINE_BREAK;
  public static final net.minecraft.sounds.SoundEvent VINE_FALL;
  public static final net.minecraft.sounds.SoundEvent VINE_HIT;
  public static final net.minecraft.sounds.SoundEvent VINE_PLACE;
  public static final net.minecraft.sounds.SoundEvent VINE_STEP;
  public static final net.minecraft.sounds.SoundEvent LILY_PAD_PLACE;
  public static final net.minecraft.sounds.SoundEvent WANDERING_TRADER_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent WANDERING_TRADER_DEATH;
  public static final net.minecraft.sounds.SoundEvent WANDERING_TRADER_DISAPPEARED;
  public static final net.minecraft.sounds.SoundEvent WANDERING_TRADER_DRINK_MILK;
  public static final net.minecraft.sounds.SoundEvent WANDERING_TRADER_DRINK_POTION;
  public static final net.minecraft.sounds.SoundEvent WANDERING_TRADER_HURT;
  public static final net.minecraft.sounds.SoundEvent WANDERING_TRADER_NO;
  public static final net.minecraft.sounds.SoundEvent WANDERING_TRADER_REAPPEARED;
  public static final net.minecraft.sounds.SoundEvent WANDERING_TRADER_TRADE;
  public static final net.minecraft.sounds.SoundEvent WANDERING_TRADER_YES;
  public static final net.minecraft.sounds.SoundEvent WARDEN_AGITATED;
  public static final net.minecraft.sounds.SoundEvent WARDEN_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent WARDEN_ANGRY;
  public static final net.minecraft.sounds.SoundEvent WARDEN_ATTACK_IMPACT;
  public static final net.minecraft.sounds.SoundEvent WARDEN_DEATH;
  public static final net.minecraft.sounds.SoundEvent WARDEN_DIG;
  public static final net.minecraft.sounds.SoundEvent WARDEN_EMERGE;
  public static final net.minecraft.sounds.SoundEvent WARDEN_HEARTBEAT;
  public static final net.minecraft.sounds.SoundEvent WARDEN_HURT;
  public static final net.minecraft.sounds.SoundEvent WARDEN_LISTENING;
  public static final net.minecraft.sounds.SoundEvent WARDEN_LISTENING_ANGRY;
  public static final net.minecraft.sounds.SoundEvent WARDEN_NEARBY_CLOSE;
  public static final net.minecraft.sounds.SoundEvent WARDEN_NEARBY_CLOSER;
  public static final net.minecraft.sounds.SoundEvent WARDEN_NEARBY_CLOSEST;
  public static final net.minecraft.sounds.SoundEvent WARDEN_ROAR;
  public static final net.minecraft.sounds.SoundEvent WARDEN_SNIFF;
  public static final net.minecraft.sounds.SoundEvent WARDEN_SONIC_BOOM;
  public static final net.minecraft.sounds.SoundEvent WARDEN_SONIC_CHARGE;
  public static final net.minecraft.sounds.SoundEvent WARDEN_STEP;
  public static final net.minecraft.sounds.SoundEvent WARDEN_TENDRIL_CLICKS;
  public static final net.minecraft.sounds.SoundEvent WAXED_HANGING_SIGN_INTERACT_FAIL;
  public static final net.minecraft.sounds.SoundEvent WAXED_SIGN_INTERACT_FAIL;
  public static final net.minecraft.sounds.SoundEvent WATER_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent WEATHER_END_FLASH;
  public static final net.minecraft.sounds.SoundEvent WEATHER_RAIN;
  public static final net.minecraft.sounds.SoundEvent WEATHER_RAIN_ABOVE;
  public static final net.minecraft.sounds.SoundEvent WET_GRASS_BREAK;
  public static final net.minecraft.sounds.SoundEvent WET_GRASS_FALL;
  public static final net.minecraft.sounds.SoundEvent WET_GRASS_HIT;
  public static final net.minecraft.sounds.SoundEvent WET_GRASS_PLACE;
  public static final net.minecraft.sounds.SoundEvent WET_GRASS_STEP;
  public static final net.minecraft.sounds.SoundEvent WET_SPONGE_BREAK;
  public static final net.minecraft.sounds.SoundEvent WET_SPONGE_DRIES;
  public static final net.minecraft.sounds.SoundEvent WET_SPONGE_FALL;
  public static final net.minecraft.sounds.SoundEvent WET_SPONGE_HIT;
  public static final net.minecraft.sounds.SoundEvent WET_SPONGE_PLACE;
  public static final net.minecraft.sounds.SoundEvent WET_SPONGE_STEP;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> WIND_CHARGE_BURST;
  public static final net.minecraft.sounds.SoundEvent WIND_CHARGE_THROW;
  public static final net.minecraft.sounds.SoundEvent WITCH_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent WITCH_CELEBRATE;
  public static final net.minecraft.sounds.SoundEvent WITCH_DEATH;
  public static final net.minecraft.sounds.SoundEvent WITCH_DRINK;
  public static final net.minecraft.sounds.SoundEvent WITCH_HURT;
  public static final net.minecraft.sounds.SoundEvent WITCH_THROW;
  public static final net.minecraft.sounds.SoundEvent WITHER_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent WITHER_BREAK_BLOCK;
  public static final net.minecraft.sounds.SoundEvent WITHER_DEATH;
  public static final net.minecraft.sounds.SoundEvent WITHER_HURT;
  public static final net.minecraft.sounds.SoundEvent WITHER_SHOOT;
  public static final net.minecraft.sounds.SoundEvent WITHER_SKELETON_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent WITHER_SKELETON_DEATH;
  public static final net.minecraft.sounds.SoundEvent WITHER_SKELETON_HURT;
  public static final net.minecraft.sounds.SoundEvent WITHER_SKELETON_STEP;
  public static final net.minecraft.sounds.SoundEvent WITHER_SPAWN;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> WOLF_ARMOR_BREAK;
  public static final net.minecraft.sounds.SoundEvent WOLF_ARMOR_CRACK;
  public static final net.minecraft.sounds.SoundEvent WOLF_ARMOR_DAMAGE;
  public static final net.minecraft.sounds.SoundEvent WOLF_ARMOR_REPAIR;
  public static final net.minecraft.sounds.SoundEvent WOLF_SHAKE;
  public static final net.minecraft.sounds.SoundEvent WOLF_STEP;
  public static final java.util.Map<net.minecraft.world.entity.animal.wolf.WolfSoundVariants$SoundSet, net.minecraft.world.entity.animal.wolf.WolfSoundVariant> WOLF_SOUNDS;
  public static final net.minecraft.sounds.SoundEvent WOODEN_DOOR_CLOSE;
  public static final net.minecraft.sounds.SoundEvent WOODEN_DOOR_OPEN;
  public static final net.minecraft.sounds.SoundEvent WOODEN_TRAPDOOR_CLOSE;
  public static final net.minecraft.sounds.SoundEvent WOODEN_TRAPDOOR_OPEN;
  public static final net.minecraft.sounds.SoundEvent WOODEN_BUTTON_CLICK_OFF;
  public static final net.minecraft.sounds.SoundEvent WOODEN_BUTTON_CLICK_ON;
  public static final net.minecraft.sounds.SoundEvent WOODEN_PRESSURE_PLATE_CLICK_OFF;
  public static final net.minecraft.sounds.SoundEvent WOODEN_PRESSURE_PLATE_CLICK_ON;
  public static final net.minecraft.sounds.SoundEvent WOOD_BREAK;
  public static final net.minecraft.sounds.SoundEvent WOOD_FALL;
  public static final net.minecraft.sounds.SoundEvent WOOD_HIT;
  public static final net.minecraft.sounds.SoundEvent WOOD_PLACE;
  public static final net.minecraft.sounds.SoundEvent WOOD_STEP;
  public static final net.minecraft.sounds.SoundEvent WOOL_BREAK;
  public static final net.minecraft.sounds.SoundEvent WOOL_FALL;
  public static final net.minecraft.sounds.SoundEvent WOOL_HIT;
  public static final net.minecraft.sounds.SoundEvent WOOL_PLACE;
  public static final net.minecraft.sounds.SoundEvent WOOL_STEP;
  public static final net.minecraft.sounds.SoundEvent ZOGLIN_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent ZOGLIN_ANGRY;
  public static final net.minecraft.sounds.SoundEvent ZOGLIN_ATTACK;
  public static final net.minecraft.sounds.SoundEvent ZOGLIN_DEATH;
  public static final net.minecraft.sounds.SoundEvent ZOGLIN_HURT;
  public static final net.minecraft.sounds.SoundEvent ZOGLIN_STEP;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_ATTACK_WOODEN_DOOR;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_ATTACK_IRON_DOOR;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_BREAK_WOODEN_DOOR;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_CONVERTED_TO_DROWNED;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_DEATH;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_DESTROY_EGG;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_HORSE_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_HORSE_ANGRY;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_HORSE_DEATH;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_HORSE_EAT;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_HORSE_HURT;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_HURT;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_INFECT;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_NAUTILUS_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_NAUTILUS_AMBIENT_ON_LAND;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_NAUTILUS_DASH;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_NAUTILUS_DASH_ON_LAND;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_NAUTILUS_DASH_READY;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_NAUTILUS_DASH_READY_ON_LAND;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_NAUTILUS_DEATH;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_NAUTILUS_DEATH_ON_LAND;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_NAUTILUS_EAT;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_NAUTILUS_HURT;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_NAUTILUS_HURT_ON_LAND;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_NAUTILUS_SWIM;
  public static final net.minecraft.sounds.SoundEvent ZOMBIFIED_PIGLIN_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent ZOMBIFIED_PIGLIN_ANGRY;
  public static final net.minecraft.sounds.SoundEvent ZOMBIFIED_PIGLIN_DEATH;
  public static final net.minecraft.sounds.SoundEvent ZOMBIFIED_PIGLIN_HURT;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_STEP;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_VILLAGER_AMBIENT;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_VILLAGER_CONVERTED;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_VILLAGER_CURE;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_VILLAGER_DEATH;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_VILLAGER_HURT;
  public static final net.minecraft.sounds.SoundEvent ZOMBIE_VILLAGER_STEP;
  public static final net.minecraft.sounds.SoundEvent APPLY_EFFECT_BAD_OMEN;
  public static final net.minecraft.sounds.SoundEvent APPLY_EFFECT_TRIAL_OMEN;
  public static final net.minecraft.sounds.SoundEvent APPLY_EFFECT_RAID_OMEN;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> SADDLE_UNEQUIP;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NAUTILUS_SADDLE_UNDERWATER_EQUIP;
  public static final net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> NAUTILUS_SADDLE_EQUIP;
  public net.minecraft.sounds.SoundEvents();
  private static net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent> register(net.minecraft.resources.Identifier, net.minecraft.resources.Identifier, float);
  private static net.minecraft.sounds.SoundEvent register(java.lang.String);
  private static net.minecraft.sounds.SoundEvent register(net.minecraft.resources.Identifier);
  private static net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> registerForHolder(java.lang.String);
  private static net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> registerForHolder(net.minecraft.resources.Identifier);
  private static net.minecraft.sounds.SoundEvent register(net.minecraft.resources.Identifier, net.minecraft.resources.Identifier);
  private static net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent> registerForHolder(net.minecraft.resources.Identifier, net.minecraft.resources.Identifier);
  private static com.google.common.collect.ImmutableList<net.minecraft.core.Holder$Reference<net.minecraft.sounds.SoundEvent>> registerGoatHornSoundVariants();
  private static java.util.Map<net.minecraft.world.entity.animal.wolf.WolfSoundVariants$SoundSet, net.minecraft.world.entity.animal.wolf.WolfSoundVariant> registerWolfSoundVariants();
  private static net.minecraft.world.entity.animal.wolf.WolfSoundVariant method_68125(net.minecraft.world.entity.animal.wolf.WolfSoundVariants$SoundSet);
  private static net.minecraft.world.entity.animal.wolf.WolfSoundVariants$SoundSet method_68127(net.minecraft.world.entity.animal.wolf.WolfSoundVariants$SoundSet);
  private static net.minecraft.core.Holder$Reference method_43517(int);
  static {};
}
```

## Probe task log

```

> Configure project :
Fabric Loom: 1.14.10

> Task :probeApi
Wrote /home/runner/work/F1Client/F1Client/build/probe-api.txt (188489 bytes; 91 classes matched)
gradle/actions: Writing build results to /home/runner/work/_temp/.gradle-actions/build-results/__run_2-1794596073038.json

[Incubating] Problems report is available at: file:///home/runner/work/F1Client/F1Client/build/reports/problems/problems-report.html

Deprecated Gradle features were used in this build, making it incompatible with Gradle 10.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/9.2.1/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.

BUILD SUCCESSFUL in 5s
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
39:BUILD SUCCESSFUL in 38s
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
gradle/actions: Writing build results to /home/runner/work/_temp/.gradle-actions/build-results/__run-1794596039778.json

[Incubating] Problems report is available at: file:///home/runner/work/F1Client/F1Client/build/reports/problems/problems-report.html

Deprecated Gradle features were used in this build, making it incompatible with Gradle 10.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/9.2.1/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.

BUILD SUCCESSFUL in 38s
5 actionable tasks: 5 executed
Consider enabling configuration cache to speed up this build: https://docs.gradle.org/9.2.1/userguide/configuration_cache_enabling.html
```
