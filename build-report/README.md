# Last build

Run: https://github.com/sysnaxscripts/F1Client/actions/runs/43574905211
Commit under test: b83c4055b99126ed71022247fd9d762e4cdcb648
Generated on: 2026-11-14T08:16:05Z

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

packages containing a match (62):
  com.mojang.authlib.minecraft.client
  com.mojang.blaze3d.platform
  com.mojang.blaze3d.platform.cursor
  com.mojang.realmsclient
  com.mojang.realmsclient.client
  com.mojang.realmsclient.gui
  net.fabricmc.fabric.api.client.command.v2
  net.fabricmc.fabric.api.client.datagen.v1.builder
  net.fabricmc.fabric.api.client.datagen.v1.provider
  net.fabricmc.fabric.api.client.event.lifecycle.v1
  net.fabricmc.fabric.api.client.gametest.v1
  net.fabricmc.fabric.api.client.gametest.v1.context
  net.fabricmc.fabric.api.client.gametest.v1.screenshot
  net.fabricmc.fabric.api.client.gametest.v1.world
  net.fabricmc.fabric.api.client.item.v1
  net.fabricmc.fabric.api.client.itemgroup.v1
  net.fabricmc.fabric.api.client.keybinding.v1
  net.fabricmc.fabric.api.client.message.v1
  net.fabricmc.fabric.api.client.model.loading.v1
  net.fabricmc.fabric.api.client.model.loading.v1.wrapper
  net.fabricmc.fabric.api.client.networking.v1
  net.fabricmc.fabric.api.client.particle.v1
  net.fabricmc.fabric.api.client.recipe.v1.sync
  net.fabricmc.fabric.api.client.render.fluid.v1
  net.fabricmc.fabric.api.client.rendering.v1
  net.fabricmc.fabric.api.client.rendering.v1.hud
  net.fabricmc.fabric.api.client.rendering.v1.world
  net.fabricmc.fabric.api.client.screen.v1
  net.fabricmc.fabric.api.client.sound.v1
  net.fabricmc.fabric.impl.attachment.client
  net.fabricmc.fabric.impl.blockview.client
  net.fabricmc.fabric.impl.command.client
  net.fabricmc.fabric.impl.datagen.client
  net.fabricmc.fabric.impl.networking.client
  net.fabricmc.fabric.impl.object.builder.client
  net.fabricmc.fabric.impl.recipe.ingredient.client
  net.fabricmc.fabric.impl.recipe.sync.client
  net.fabricmc.fabric.impl.resource.client
  net.fabricmc.fabric.impl.screenhandler.client
  net.fabricmc.fabric.impl.tag.client
  net.fabricmc.fabric.mixin.attachment.client
  net.fabricmc.fabric.mixin.blockview.client
  net.fabricmc.fabric.mixin.command.client
  net.fabricmc.fabric.mixin.datagen.client
  net.fabricmc.fabric.mixin.event.interaction.client
  net.fabricmc.fabric.mixin.event.lifecycle.client
  net.fabricmc.fabric.mixin.gamerule.client
  net.fabricmc.fabric.mixin.item.client
  net.fabricmc.fabric.mixin.itemgroup.client
  net.fabricmc.fabric.mixin.networking.client
  net.fabricmc.fabric.mixin.object.builder.client
  net.fabricmc.fabric.mixin.registry.sync.client
  net.fabricmc.fabric.mixin.resource.client
  net.minecraft.client
  net.minecraft.client.gui
  net.minecraft.client.gui.screens
  net.minecraft.client.input
  net.minecraft.client.renderer
  net.minecraft.client.renderer.texture
  net.minecraft.client.renderer.texture.atlas
  net.minecraft.client.renderer.texture.atlas.sources
  net.minecraft.client.resources.sounds

matching classes (498):
  com.mojang.authlib.minecraft.client.MinecraftClient   [authlib-7.0.61.jar]
  com.mojang.authlib.minecraft.client.ObjectMapper   [authlib-7.0.61.jar]
  com.mojang.blaze3d.platform.ClientShutdownWatchdog   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.ClipboardManager   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.DebugMemoryUntracker   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.DepthTestFunction   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.DestFactor   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.DisplayData   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.FramerateLimitTracker   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.FramerateLimitTracker$FramerateThrottleReason   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.GLX   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.IconSet   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.InputConstants   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.InputConstants$Key   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.InputConstants$Type   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.InputConstants$Value   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.Lighting   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.Lighting$1   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.Lighting$Entry   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.LogicOp   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.MacosUtil   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.Monitor   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.MonitorCreator   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.NativeImage   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.NativeImage$Format   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.NativeImage$WriteCallback   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.PolygonMode   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.ScreenManager   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.SourceFactor   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.TextureUtil   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.VideoMode   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.Window   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.Window$WindowInitFailed   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.WindowEventHandler   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.cursor.CursorType   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.cursor.CursorTypes   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.cursor.package-info   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.blaze3d.platform.package-info   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.realmsclient.RealmsAvailability   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.realmsclient.RealmsMainScreen   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.realmsclient.Unit   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.realmsclient.client.FileDownload   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.realmsclient.client.FileUpload   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.realmsclient.client.Ping   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.realmsclient.client.RealmsClient   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.realmsclient.client.RealmsClientConfig   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.realmsclient.client.RealmsError   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.realmsclient.client.Request   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.realmsclient.client.UploadStatus   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.realmsclient.gui.RealmsDataFetcher   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.realmsclient.gui.RealmsNewsManager   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.realmsclient.gui.RealmsServerList   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  com.mojang.realmsclient.gui.RealmsWorldSlotButton   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.fabricmc.fabric.api.client.command.v2.ClientCommandManager   [fabric-command-api-v2-4abd26ae-2.4.7+6b42a6003e.jar]
  net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback   [fabric-command-api-v2-4abd26ae-2.4.7+6b42a6003e.jar]
  net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource   [fabric-command-api-v2-4abd26ae-2.4.7+6b42a6003e.jar]
  net.fabricmc.fabric.api.client.command.v2.package-info   [fabric-command-api-v2-4abd26ae-2.4.7+6b42a6003e.jar]
  net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder   [fabric-data-generation-api-v1-4abd26ae-23.5.0+88d7da613e.jar]
  net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder$EntryBuilder   [fabric-data-generation-api-v1-4abd26ae-23.5.0+88d7da613e.jar]
  net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder$RegistrationType   [fabric-data-generation-api-v1-4abd26ae-23.5.0+88d7da613e.jar]
  net.fabricmc.fabric.api.client.datagen.v1.builder.package-info   [fabric-data-generation-api-v1-4abd26ae-23.5.0+88d7da613e.jar]
  net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider   [fabric-data-generation-api-v1-4abd26ae-23.5.0+88d7da613e.jar]
  net.fabricmc.fabric.api.client.datagen.v1.provider.FabricSoundsProvider   [fabric-data-generation-api-v1-4abd26ae-23.5.0+88d7da613e.jar]
  net.fabricmc.fabric.api.client.datagen.v1.provider.FabricSoundsProvider$SoundExporter   [fabric-data-generation-api-v1-4abd26ae-23.5.0+88d7da613e.jar]
  net.fabricmc.fabric.api.client.datagen.v1.provider.package-info   [fabric-data-generation-api-v1-4abd26ae-23.5.0+88d7da613e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents$Load   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents$Unload   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents$Load   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents$Unload   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents$Load   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents$Unload   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents$ClientStarted   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents$ClientStopping   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents$EndTick   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents$EndWorldTick   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents$StartTick   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents$StartWorldTick   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientWorldEvents   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientWorldEvents$AfterClientWorldChange   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.event.lifecycle.v1.package-info   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.gametest.v1.FabricClientGameTest   [fabric-client-gametest-api-v1-4abd26ae-4.3.5+bfe9fcf43e.jar]
  net.fabricmc.fabric.api.client.gametest.v1.TestInput   [fabric-client-gametest-api-v1-4abd26ae-4.3.5+bfe9fcf43e.jar]
  net.fabricmc.fabric.api.client.gametest.v1.context.ClientGameTestContext   [fabric-client-gametest-api-v1-4abd26ae-4.3.5+bfe9fcf43e.jar]
  net.fabricmc.fabric.api.client.gametest.v1.context.TestClientWorldContext   [fabric-client-gametest-api-v1-4abd26ae-4.3.5+bfe9fcf43e.jar]
  net.fabricmc.fabric.api.client.gametest.v1.context.TestDedicatedServerContext   [fabric-client-gametest-api-v1-4abd26ae-4.3.5+bfe9fcf43e.jar]
  net.fabricmc.fabric.api.client.gametest.v1.context.TestServerConnection   [fabric-client-gametest-api-v1-4abd26ae-4.3.5+bfe9fcf43e.jar]
  net.fabricmc.fabric.api.client.gametest.v1.context.TestServerContext   [fabric-client-gametest-api-v1-4abd26ae-4.3.5+bfe9fcf43e.jar]
  net.fabricmc.fabric.api.client.gametest.v1.context.TestSingleplayerContext   [fabric-client-gametest-api-v1-4abd26ae-4.3.5+bfe9fcf43e.jar]
  net.fabricmc.fabric.api.client.gametest.v1.context.package-info   [fabric-client-gametest-api-v1-4abd26ae-4.3.5+bfe9fcf43e.jar]
  net.fabricmc.fabric.api.client.gametest.v1.package-info   [fabric-client-gametest-api-v1-4abd26ae-4.3.5+bfe9fcf43e.jar]
  net.fabricmc.fabric.api.client.gametest.v1.screenshot.TestScreenshotCommonOptions   [fabric-client-gametest-api-v1-4abd26ae-4.3.5+bfe9fcf43e.jar]
  net.fabricmc.fabric.api.client.gametest.v1.screenshot.TestScreenshotComparisonAlgorithm   [fabric-client-gametest-api-v1-4abd26ae-4.3.5+bfe9fcf43e.jar]
  net.fabricmc.fabric.api.client.gametest.v1.screenshot.TestScreenshotComparisonAlgorithm$RawImage   [fabric-client-gametest-api-v1-4abd26ae-4.3.5+bfe9fcf43e.jar]
  net.fabricmc.fabric.api.client.gametest.v1.screenshot.TestScreenshotComparisonOptions   [fabric-client-gametest-api-v1-4abd26ae-4.3.5+bfe9fcf43e.jar]
  net.fabricmc.fabric.api.client.gametest.v1.screenshot.TestScreenshotOptions   [fabric-client-gametest-api-v1-4abd26ae-4.3.5+bfe9fcf43e.jar]
  net.fabricmc.fabric.api.client.gametest.v1.screenshot.package-info   [fabric-client-gametest-api-v1-4abd26ae-4.3.5+bfe9fcf43e.jar]
  net.fabricmc.fabric.api.client.gametest.v1.world.TestWorldBuilder   [fabric-client-gametest-api-v1-4abd26ae-4.3.5+bfe9fcf43e.jar]
  net.fabricmc.fabric.api.client.gametest.v1.world.TestWorldSave   [fabric-client-gametest-api-v1-4abd26ae-4.3.5+bfe9fcf43e.jar]
  net.fabricmc.fabric.api.client.gametest.v1.world.package-info   [fabric-client-gametest-api-v1-4abd26ae-4.3.5+bfe9fcf43e.jar]
  net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback   [fabric-item-api-v1-4abd26ae-11.6.0+67f17bb43e.jar]
  net.fabricmc.fabric.api.client.item.v1.package-info   [fabric-item-api-v1-4abd26ae-11.6.0+67f17bb43e.jar]
  net.fabricmc.fabric.api.client.itemgroup.v1.FabricCreativeInventoryScreen   [fabric-item-group-api-v1-4abd26ae-4.2.36+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.itemgroup.v1.package-info   [fabric-item-group-api-v1-4abd26ae-4.2.36+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper   [fabric-key-binding-api-v1-4abd26ae-1.1.7+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.keybinding.v1.package-info   [fabric-key-binding-api-v1-4abd26ae-1.1.7+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents   [fabric-message-api-v1-4abd26ae-6.1.12+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$AllowChat   [fabric-message-api-v1-4abd26ae-6.1.12+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$AllowGame   [fabric-message-api-v1-4abd26ae-6.1.12+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$Chat   [fabric-message-api-v1-4abd26ae-6.1.12+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$ChatCanceled   [fabric-message-api-v1-4abd26ae-6.1.12+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$Game   [fabric-message-api-v1-4abd26ae-6.1.12+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$GameCanceled   [fabric-message-api-v1-4abd26ae-6.1.12+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$ModifyGame   [fabric-message-api-v1-4abd26ae-6.1.12+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents   [fabric-message-api-v1-4abd26ae-6.1.12+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$AllowChat   [fabric-message-api-v1-4abd26ae-6.1.12+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$AllowCommand   [fabric-message-api-v1-4abd26ae-6.1.12+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$Chat   [fabric-message-api-v1-4abd26ae-6.1.12+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$ChatCanceled   [fabric-message-api-v1-4abd26ae-6.1.12+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$Command   [fabric-message-api-v1-4abd26ae-6.1.12+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$CommandCanceled   [fabric-message-api-v1-4abd26ae-6.1.12+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$ModifyChat   [fabric-message-api-v1-4abd26ae-6.1.12+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$ModifyCommand   [fabric-message-api-v1-4abd26ae-6.1.12+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.message.v1.package-info   [fabric-message-api-v1-4abd26ae-6.1.12+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.BlockStateResolver   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.BlockStateResolver$Context   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.CompositeBlockStateModel   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.CompositeBlockStateModel$Unbaked   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.CustomUnbakedBlockStateModel   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.ExtraModelKey   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.FabricBakedModelManager   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin$Context   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$AfterBakeBlock   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$AfterBakeBlock$Context   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$AfterBakeItem   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$AfterBakeItem$Context   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$BeforeBakeBlock   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$BeforeBakeBlock$Context   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$BeforeBakeItem   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$BeforeBakeItem$Context   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$OnLoad   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$OnLoad$Context   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$OnLoadBlock   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$OnLoadBlock$Context   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.PreparableModelLoadingPlugin   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.PreparableModelLoadingPlugin$DataLoader   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.PreparableModelLoadingPlugin$Holder   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.SimpleUnbakedExtraModel   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.UnbakedExtraModel   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.UnbakedModelDeserializer   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.package-info   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.wrapper.WrapperBakedItemModel   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.wrapper.WrapperBlockStateModel   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.wrapper.WrapperUnbakedGroupedBlockStateModel   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.wrapper.WrapperUnbakedItemModel   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.wrapper.WrapperUnbakedModel   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.model.loading.v1.wrapper.package-info   [fabric-model-loading-api-v1-4abd26ae-6.0.15+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents$Register   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents$Unregister   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents$Register   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents$Unregister   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents$Complete   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents$Disconnect   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents$Init   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents$Ready   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents$Start   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking$ConfigurationPayloadHandler   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking$Context   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents$Disconnect   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents$Init   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents$QueryStart   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientLoginNetworking   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientLoginNetworking$LoginQueryRequestHandler   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents$Disconnect   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents$Init   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents$Join   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking$Context   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking$PlayPayloadHandler   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.networking.v1.package-info   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.api.client.particle.v1.FabricSpriteProvider   [fabric-particles-v1-4abd26ae-4.2.12+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry   [fabric-particles-v1-4abd26ae-4.2.12+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry$PendingParticleFactory   [fabric-particles-v1-4abd26ae-4.2.12+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.particle.v1.ParticleRenderEvents   [fabric-particles-v1-4abd26ae-4.2.12+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.particle.v1.ParticleRenderEvents$AllowBlockDustTint   [fabric-particles-v1-4abd26ae-4.2.12+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.particle.v1.ParticleRendererRegistry   [fabric-particles-v1-4abd26ae-4.2.12+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.particle.v1.package-info   [fabric-particles-v1-4abd26ae-4.2.12+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.recipe.v1.sync.ClientRecipeSynchronizedEvent   [fabric-recipe-api-v1-4abd26ae-8.2.4+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.recipe.v1.sync.package-info   [fabric-recipe-api-v1-4abd26ae-8.2.4+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler   [fabric-rendering-fluids-v1-4abd26ae-3.1.43+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry   [fabric-rendering-fluids-v1-4abd26ae-3.1.43+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRendering   [fabric-rendering-fluids-v1-4abd26ae-3.1.43+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRendering$DefaultRenderer   [fabric-rendering-fluids-v1-4abd26ae-3.1.43+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler   [fabric-rendering-fluids-v1-4abd26ae-3.1.43+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.render.fluid.v1.package-info   [fabric-rendering-fluids-v1-4abd26ae-3.1.43+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer$Factory   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.AtlasSourceRegistry   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.ColorResolverRegistry   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.DrawItemStackOverlayCallback   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry$TexturedEquipmentModelDataProvider   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry$TexturedModelDataProvider   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.FabricModel   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.FabricRenderPipeline   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.FabricRenderPipeline$Builder   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.FabricRenderPipeline$Snippet   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.InvalidateRenderStateCallback   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRenderEvents   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRenderEvents$AllowCapeRender   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback$RegistrationHelper   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.SpecialBlockRendererRegistry   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.SpecialGuiElementRegistry   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.SpecialGuiElementRegistry$Context   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.SpecialGuiElementRegistry$Factory   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.TooltipComponentCallback   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.TransformCopyingModel   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.hud.HudStatusBarHeightRegistry   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.hud.StatusBarHeightProvider   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.hud.package-info   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.package-info   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.world.AbstractWorldRenderContext   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$AfterBlockOutlineExtraction   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$AfterEntities   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$BeforeBlockOutline   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$BeforeEntities   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$BeforeTranslucent   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$DebugRender   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$EndExtraction   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$EndMain   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$StartMain   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.world.WorldTerrainRenderContext   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.rendering.v1.world.package-info   [fabric-rendering-v1-4abd26ae-16.2.10+0290ad933e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$AfterBackground   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$AfterInit   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$AfterRender   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$AfterTick   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$BeforeInit   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$BeforeRender   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$BeforeTick   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$Remove   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AfterKeyPress   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AfterKeyRelease   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AllowKeyPress   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AllowKeyRelease   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$BeforeKeyPress   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$BeforeKeyRelease   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseClick   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseDrag   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseRelease   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseScroll   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseClick   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseDrag   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseRelease   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseScroll   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseClick   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseDrag   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseRelease   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseScroll   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.Screens   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.screen.v1.package-info   [fabric-screen-api-v1-4abd26ae-3.1.7+4ebb5c083e.jar]
  net.fabricmc.fabric.api.client.sound.v1.FabricSoundInstance   [fabric-sound-api-v1-4abd26ae-1.0.51+4fc5413f3e.jar]
  net.fabricmc.fabric.api.client.sound.v1.package-info   [fabric-sound-api-v1-4abd26ae-1.0.51+4fc5413f3e.jar]
  net.fabricmc.fabric.impl.attachment.client.AttachmentSyncClient   [fabric-data-attachment-api-v1-4abd26ae-1.8.48+eed0806f3e.jar]
  net.fabricmc.fabric.impl.blockview.client.RenderDataMapConsumer   [fabric-block-view-api-v2-4abd26ae-1.0.39+4ebb5c083e.jar]
  net.fabricmc.fabric.impl.command.client.ClientCommandInternals   [fabric-command-api-v2-4abd26ae-2.4.7+6b42a6003e.jar]
  net.fabricmc.fabric.impl.datagen.client.FabricItemAssetDefinitions   [fabric-data-generation-api-v1-4abd26ae-23.5.0+88d7da613e.jar]
  net.fabricmc.fabric.impl.datagen.client.FabricModelProviderDefinitions   [fabric-data-generation-api-v1-4abd26ae-23.5.0+88d7da613e.jar]
  net.fabricmc.fabric.impl.datagen.client.SoundTypeBuilderImpl   [fabric-data-generation-api-v1-4abd26ae-23.5.0+88d7da613e.jar]
  net.fabricmc.fabric.impl.networking.client.ClientCommonNetworkAddon   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.impl.networking.client.ClientLoginNetworkAddon   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.impl.object.builder.client.SignTypeTextureHelper   [fabric-object-builder-api-v1-4abd26ae-21.1.40+4fc5413f3e.jar]
  net.fabricmc.fabric.impl.recipe.ingredient.client.CustomIngredientSyncClient   [fabric-recipe-api-v1-4abd26ae-8.2.4+4ebb5c083e.jar]
  net.fabricmc.fabric.impl.recipe.sync.client.RecipeSyncImplClient   [fabric-recipe-api-v1-4abd26ae-8.2.4+4ebb5c083e.jar]
  net.fabricmc.fabric.impl.recipe.sync.client.SynchronizedClientRecipesSetter   [fabric-recipe-api-v1-4abd26ae-8.2.4+4ebb5c083e.jar]
  net.fabricmc.fabric.impl.resource.client.DefaultResourcePackStorage   [fabric-resource-loader-v1-4abd26ae-1.0.10+78c8b4663e.jar]
  net.fabricmc.fabric.impl.resource.client.PackTooltipComponent   [fabric-resource-loader-v1-4abd26ae-1.0.10+78c8b4663e.jar]
  net.fabricmc.fabric.impl.screenhandler.client.ClientNetworking   [fabric-screen-handler-api-v1-4abd26ae-1.3.162+4fc5413f3e.jar]
  net.fabricmc.fabric.impl.tag.client.ClientTagsImpl   [fabric-tag-api-v1-4abd26ae-1.3.0+88d7da613e.jar]
  net.fabricmc.fabric.impl.tag.client.ClientTagsLoader   [fabric-tag-api-v1-4abd26ae-1.3.0+88d7da613e.jar]
  net.fabricmc.fabric.mixin.attachment.client.ClientPacketListenerMixin   [fabric-data-attachment-api-v1-4abd26ae-1.8.48+eed0806f3e.jar]
  net.fabricmc.fabric.mixin.blockview.client.MovingBlockRenderStateMixin   [fabric-block-view-api-v2-4abd26ae-1.0.39+4ebb5c083e.jar]
  net.fabricmc.fabric.mixin.blockview.client.RenderRegionCacheMixin   [fabric-block-view-api-v2-4abd26ae-1.0.39+4ebb5c083e.jar]
  net.fabricmc.fabric.mixin.blockview.client.RenderSectionRegionMixin   [fabric-block-view-api-v2-4abd26ae-1.0.39+4ebb5c083e.jar]
  net.fabricmc.fabric.mixin.command.client.ClientPacketListenerMixin   [fabric-command-api-v2-4abd26ae-2.4.7+6b42a6003e.jar]
  net.fabricmc.fabric.mixin.command.client.ClientSuggestionProviderMixin   [fabric-command-api-v2-4abd26ae-2.4.7+6b42a6003e.jar]
  net.fabricmc.fabric.mixin.datagen.client.MinecraftMixin   [fabric-data-generation-api-v1-4abd26ae-23.5.0+88d7da613e.jar]
  net.fabricmc.fabric.mixin.datagen.client.ModelProviderBlockStateGeneratorCollectorMixin   [fabric-data-generation-api-v1-4abd26ae-23.5.0+88d7da613e.jar]
  net.fabricmc.fabric.mixin.datagen.client.ModelProviderItemInfoCollectorMixin   [fabric-data-generation-api-v1-4abd26ae-23.5.0+88d7da613e.jar]
  net.fabricmc.fabric.mixin.datagen.client.ModelProviderMixin   [fabric-data-generation-api-v1-4abd26ae-23.5.0+88d7da613e.jar]
  net.fabricmc.fabric.mixin.event.interaction.client.KeyMappingAccessor   [fabric-events-interaction-v0-4abd26ae-4.1.1+3b89ecf63e.jar]
  net.fabricmc.fabric.mixin.event.interaction.client.MinecraftMixin   [fabric-events-interaction-v0-4abd26ae-4.1.1+3b89ecf63e.jar]
  net.fabricmc.fabric.mixin.event.interaction.client.MultiPlayerGameModeMixin   [fabric-events-interaction-v0-4abd26ae-4.1.1+3b89ecf63e.jar]
  net.fabricmc.fabric.mixin.event.lifecycle.client.ClientChunkCacheMixin   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.mixin.event.lifecycle.client.ClientConfigurationPacketListenerImplMixin   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.mixin.event.lifecycle.client.ClientLevelMixin   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.mixin.event.lifecycle.client.ClientPacketListenerMixin   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.mixin.event.lifecycle.client.ClientWorldClientEntityHandlerMixin   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.mixin.event.lifecycle.client.LevelChunkMixin   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.mixin.event.lifecycle.client.MinecraftMixin   [fabric-lifecycle-events-v1-4abd26ae-2.6.15+4ebb5c083e.jar]
  net.fabricmc.fabric.mixin.gamerule.client.EditGameRulesScreenAccessor   [fabric-game-rule-api-v1-4abd26ae-2.0.3+4fc5413f3e.jar]
  net.fabricmc.fabric.mixin.gamerule.client.EditGameRulesScreenRuleListMixin   [fabric-game-rule-api-v1-4abd26ae-2.0.3+4fc5413f3e.jar]
  net.fabricmc.fabric.mixin.gamerule.client.RuleListWidgetVisitorMixin   [fabric-game-rule-api-v1-4abd26ae-2.0.3+4fc5413f3e.jar]
  net.fabricmc.fabric.mixin.item.client.ItemInHandRendererMixin   [fabric-item-api-v1-4abd26ae-11.6.0+67f17bb43e.jar]
  net.fabricmc.fabric.mixin.item.client.ItemStackMixin   [fabric-item-api-v1-4abd26ae-11.6.0+67f17bb43e.jar]
  net.fabricmc.fabric.mixin.item.client.MultiPlayerGameModeMixin   [fabric-item-api-v1-4abd26ae-11.6.0+67f17bb43e.jar]
  net.fabricmc.fabric.mixin.itemgroup.client.CreativeModeInventoryScreenMixin   [fabric-item-group-api-v1-4abd26ae-4.2.36+4fc5413f3e.jar]
  net.fabricmc.fabric.mixin.networking.client.ClientCommonPacketListenerImplMixin   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.mixin.networking.client.ClientConfigurationPacketListenerImplMixin   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.mixin.networking.client.ClientHandshakePacketListenerImplMixin   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.mixin.networking.client.ClientPacketListenerMixin   [fabric-networking-api-v1-4abd26ae-5.1.6+6b6d71a53e.jar]
  net.fabricmc.fabric.mixin.object.builder.client.HangingSignEditScreenMixin   [fabric-object-builder-api-v1-4abd26ae-21.1.40+4fc5413f3e.jar]
  net.fabricmc.fabric.mixin.object.builder.client.ModelLayersMixin   [fabric-object-builder-api-v1-4abd26ae-21.1.40+4fc5413f3e.jar]
  net.fabricmc.fabric.mixin.object.builder.client.SheetsMixin   [fabric-object-builder-api-v1-4abd26ae-21.1.40+4fc5413f3e.jar]
  net.fabricmc.fabric.mixin.object.builder.client.WoodTypeMixin   [fabric-object-builder-api-v1-4abd26ae-21.1.40+4fc5413f3e.jar]
  net.fabricmc.fabric.mixin.registry.sync.client.BlockColorsMixin   [fabric-registry-sync-v0-4abd26ae-6.2.6+1718722b3e.jar]
  net.fabricmc.fabric.mixin.registry.sync.client.ClientRegistriesDynamicRegistriesAccessor   [fabric-registry-sync-v0-4abd26ae-6.2.6+1718722b3e.jar]
  net.fabricmc.fabric.mixin.registry.sync.client.MinecraftMixin   [fabric-registry-sync-v0-4abd26ae-6.2.6+1718722b3e.jar]
  net.fabricmc.fabric.mixin.registry.sync.client.ParticleResourcesMixin   [fabric-registry-sync-v0-4abd26ae-6.2.6+1718722b3e.jar]
  net.fabricmc.fabric.mixin.registry.sync.client.RegistryDataCollectorMixin   [fabric-registry-sync-v0-4abd26ae-6.2.6+1718722b3e.jar]
  net.fabricmc.fabric.mixin.resource.client.BuiltInPackSourceMixin   [fabric-resource-loader-v1-4abd26ae-1.0.10+78c8b4663e.jar]
  net.fabricmc.fabric.mixin.resource.client.ClientTooltipComponentMixin   [fabric-resource-loader-v1-4abd26ae-1.0.10+78c8b4663e.jar]
  net.fabricmc.fabric.mixin.resource.client.CreateWorldScreenMixin   [fabric-resource-loader-v1-4abd26ae-1.0.10+78c8b4663e.jar]
  net.fabricmc.fabric.mixin.resource.client.GameOptionsWriteVisitorMixin   [fabric-resource-loader-v1-4abd26ae-1.0.10+78c8b4663e.jar]
  net.fabricmc.fabric.mixin.resource.client.KeyedClientResourceReloadListenerMixin   [fabric-resource-loader-v1-4abd26ae-1.0.10+78c8b4663e.jar]
  net.fabricmc.fabric.mixin.resource.client.KnownPacksManagerMixin   [fabric-resource-loader-v1-4abd26ae-1.0.10+78c8b4663e.jar]
  net.fabricmc.fabric.mixin.resource.client.OptionsMixin   [fabric-resource-loader-v1-4abd26ae-1.0.10+78c8b4663e.jar]
  net.fabricmc.fabric.mixin.resource.client.PackSelectionModelMixin   [fabric-resource-loader-v1-4abd26ae-1.0.10+78c8b4663e.jar]
  net.fabricmc.fabric.mixin.resource.client.TransferableSelectionListPackEntryMixin   [fabric-resource-loader-v1-4abd26ae-1.0.10+78c8b4663e.jar]
  net.minecraft.client.AttackIndicatorStatus   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.Camera   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.CameraType   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.ClientBootstrap   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.ClientBrandRetriever   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.ClientRecipeBook   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.CloudStatus   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.CommandHistory   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.ComponentCollector   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.DebugQueryHandler   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.DeltaTracker   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.GameNarrator   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.GraphicsPreset   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.GuiMessage   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.GuiMessageTag   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.HotbarManager   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.InactivityFpsLimit   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.InputType   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.KeyMapping   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.KeyboardHandler   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.Minecraft   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.MouseHandler   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.MusicToastDisplayState   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.NarratorStatus   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.OptionInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.Options   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.PeriodicNotificationManager   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.PrioritizeChunkUpdates   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.ResourceLoadStateTracker   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.Screenshot   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.ScrollWheelHandler   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.StringSplitter   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.TextureFilteringMethod   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.ToggleKeyMapping   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.User   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.gui.ActiveTextCollector   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.gui.BundleMouseActions   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.gui.ComponentPath   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.gui.Font   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.gui.GlyphSource   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.gui.Gui   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.gui.GuiGraphics   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.gui.ItemSlotMouseAction   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.gui.TextAlignment   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.gui.screens.Screen   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.gui.screens.Screen$NarratableSearchResult   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.input.CharacterEvent   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.input.InputQuirks   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.input.InputWithModifiers   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.input.InputWithModifiers$Modifiers   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.input.KeyEvent   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.input.KeyEvent$Action   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.input.MouseButtonEvent   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.input.MouseButtonInfo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.input.MouseButtonInfo$Action   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.input.MouseButtonInfo$MouseButton   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.input.package-info   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.RenderPipelines   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.AbstractTexture   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.CubeMapTexture   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.Dumpable   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.DynamicTexture   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.MipmapGenerator   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.MipmapStrategy   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.MissingTextureAtlasSprite   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.OverlayTexture   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.ReloadableTexture   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.SimpleTexture   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.SkinTextureDownloader   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.SpriteContents   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.SpriteContents$AnimatedTexture   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.SpriteContents$AnimationState   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.SpriteContents$FrameInfo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.SpriteLoader   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.SpriteLoader$Preparations   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.Stitcher   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.Stitcher$Entry   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.Stitcher$Holder   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.Stitcher$Region   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.Stitcher$SpriteLoader   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.StitcherException   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.TextureAtlas   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.TextureAtlasSprite   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.TextureContents   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.TextureManager   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.TextureManager$PendingReload   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.TickableTexture   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.atlas.SpriteResourceLoader   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.atlas.SpriteSource   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.atlas.SpriteSource$DiscardableLoader   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.atlas.SpriteSource$Loader   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.atlas.SpriteSource$Output   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.atlas.SpriteSourceList   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.atlas.SpriteSourceList$1   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.atlas.SpriteSources   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.atlas.package-info   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.atlas.sources.DirectoryLister   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.atlas.sources.LazyLoadedImage   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.atlas.sources.PalettedPermutations   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.atlas.sources.PalettedPermutations$PalettedSpriteSupplier   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.atlas.sources.SingleFile   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.atlas.sources.SourceFilter   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.atlas.sources.Unstitcher   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.atlas.sources.Unstitcher$Region   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.atlas.sources.Unstitcher$RegionInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.atlas.sources.package-info   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.renderer.texture.package-info   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.AbstractSoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.AbstractTickableSoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.AmbientSoundHandler   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.BeeAggressiveSoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.BeeFlyingSoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.BeeSoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.BiomeAmbientSoundsHandler   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.BiomeAmbientSoundsHandler$LoopSoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.BubbleColumnAmbientSoundHandler   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.DirectionalSoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.ElytraOnPlayerSoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.EntityBoundSoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.GuardianAttackSoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.MinecartSoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.RidingEntitySoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.RidingMinecartSoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.SimpleSoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.SnifferSoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.Sound   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.Sound$Type   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.SoundEventRegistration   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.SoundEventRegistrationSerializer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.SoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.SoundInstance$Attenuation   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.TickableSoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.UnderwaterAmbientSoundHandler   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.UnderwaterAmbientSoundInstances   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.UnderwaterAmbientSoundInstances$SubSound   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.UnderwaterAmbientSoundInstances$UnderwaterAmbientSoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.resources.sounds.package-info   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]

signatures of the first 12 dump matches:

=== net.minecraft.client.Options   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "Options.java"
public class net.minecraft.client.Options {
  static final org.slf4j.Logger LOGGER;
  static final com.google.gson.Gson GSON;
  private static final com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>> LIST_OF_STRINGS_TYPE;
  public static final int RENDER_DISTANCE_SHORT;
  public static final int RENDER_DISTANCE_FAR;
  public static final int RENDER_DISTANCE_REALLY_FAR;
  public static final int RENDER_DISTANCE_EXTREME;
  private static final com.google.common.base.Splitter OPTION_SPLITTER;
  public static final java.lang.String DEFAULT_SOUND_DEVICE;
  private static final net.minecraft.network.chat.Component ACCESSIBILITY_TOOLTIP_DARK_MOJANG_BACKGROUND;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> darkMojangStudiosBackground;
  private static final net.minecraft.network.chat.Component ACCESSIBILITY_TOOLTIP_HIDE_LIGHTNING_FLASHES;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> hideLightningFlash;
  private static final net.minecraft.network.chat.Component ACCESSIBILITY_TOOLTIP_HIDE_SPLASH_TEXTS;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> hideSplashTexts;
  private final net.minecraft.client.OptionInstance<java.lang.Double> sensitivity;
  private final net.minecraft.client.OptionInstance<java.lang.Integer> renderDistance;
  private final net.minecraft.client.OptionInstance<java.lang.Integer> simulationDistance;
  private int serverRenderDistance;
  private final net.minecraft.client.OptionInstance<java.lang.Double> entityDistanceScaling;
  public static final int UNLIMITED_FRAMERATE_CUTOFF;
  private final net.minecraft.client.OptionInstance<java.lang.Integer> framerateLimit;
  private boolean isApplyingGraphicsPreset;
  private final net.minecraft.client.OptionInstance<net.minecraft.client.GraphicsPreset> graphicsPreset;
  private static final net.minecraft.network.chat.Component INACTIVITY_FPS_LIMIT_TOOLTIP_MINIMIZED;
  private static final net.minecraft.network.chat.Component INACTIVITY_FPS_LIMIT_TOOLTIP_AFK;
  private final net.minecraft.client.OptionInstance<net.minecraft.client.InactivityFpsLimit> inactivityFpsLimit;
  private final net.minecraft.client.OptionInstance<net.minecraft.client.CloudStatus> cloudStatus;
  private final net.minecraft.client.OptionInstance<java.lang.Integer> cloudRange;
  private static final net.minecraft.network.chat.Component GRAPHICS_TOOLTIP_WEATHER_RADIUS;
  private final net.minecraft.client.OptionInstance<java.lang.Integer> weatherRadius;
  private static final net.minecraft.network.chat.Component GRAPHICS_TOOLTIP_CUTOUT_LEAVES;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> cutoutLeaves;
  private static final net.minecraft.network.chat.Component GRAPHICS_TOOLTIP_VIGNETTE;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> vignette;
  private static final net.minecraft.network.chat.Component GRAPHICS_TOOLTIP_IMPROVED_TRANSPARENCY;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> improvedTransparency;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> ambientOcclusion;
  private static final net.minecraft.network.chat.Component GRAPHICS_TOOLTIP_CHUNK_FADE;
  private final net.minecraft.client.OptionInstance<java.lang.Double> chunkSectionFadeInTime;
  private static final net.minecraft.network.chat.Component PRIORITIZE_CHUNK_TOOLTIP_NONE;
  private static final net.minecraft.network.chat.Component PRIORITIZE_CHUNK_TOOLTIP_PLAYER_AFFECTED;
  private static final net.minecraft.network.chat.Component PRIORITIZE_CHUNK_TOOLTIP_NEARBY;
  private final net.minecraft.client.OptionInstance<net.minecraft.client.PrioritizeChunkUpdates> prioritizeChunkUpdates;
  public java.util.List<java.lang.String> resourcePacks;
  public java.util.List<java.lang.String> incompatibleResourcePacks;
  private final net.minecraft.client.OptionInstance<net.minecraft.world.entity.player.ChatVisiblity> chatVisibility;
  private final net.minecraft.client.OptionInstance<java.lang.Double> chatOpacity;
  private final net.minecraft.client.OptionInstance<java.lang.Double> chatLineSpacing;
  private static final net.minecraft.network.chat.Component MENU_BACKGROUND_BLURRINESS_TOOLTIP;
  private static final int BLURRINESS_DEFAULT_VALUE;
  private final net.minecraft.client.OptionInstance<java.lang.Integer> menuBackgroundBlurriness;
  private final net.minecraft.client.OptionInstance<java.lang.Double> textBackgroundOpacity;
  private final net.minecraft.client.OptionInstance<java.lang.Double> panoramaSpeed;
  private static final net.minecraft.network.chat.Component ACCESSIBILITY_TOOLTIP_CONTRAST_MODE;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> highContrast;
  private static final net.minecraft.network.chat.Component HIGH_CONTRAST_BLOCK_OUTLINE_TOOLTIP;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> highContrastBlockOutline;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> narratorHotkey;
  public java.lang.String fullscreenVideoModeString;
  public boolean hideServerAddress;
  public boolean advancedItemTooltips;
  public boolean pauseOnLostFocus;
  private final java.util.Set<net.minecraft.world.entity.player.PlayerModelPart> modelParts;
  private final net.minecraft.client.OptionInstance<net.minecraft.world.entity.HumanoidArm> mainHand;
  public int overrideWidth;
  public int overrideHeight;
  private final net.minecraft.client.OptionInstance<java.lang.Double> chatScale;
  private final net.minecraft.client.OptionInstance<java.lang.Double> chatWidth;
  private final net.minecraft.client.OptionInstance<java.lang.Double> chatHeightUnfocused;
  private final net.minecraft.client.OptionInstance<java.lang.Double> chatHeightFocused;
  private final net.minecraft.client.OptionInstance<java.lang.Double> chatDelay;
  private static final net.minecraft.network.chat.Component ACCESSIBILITY_TOOLTIP_NOTIFICATION_DISPLAY_TIME;
  private final net.minecraft.client.OptionInstance<java.lang.Double> notificationDisplayTime;
  private final net.minecraft.client.OptionInstance<java.lang.Integer> mipmapLevels;
  private static final net.minecraft.network.chat.Component GRAPHICS_TOOLTIP_ANISOTROPIC_FILTERING;
  private final net.minecraft.client.OptionInstance<java.lang.Integer> maxAnisotropyBit;
  private static final net.minecraft.network.chat.Component FILTERING_NONE_TOOLTIP;
  private static final net.minecraft.network.chat.Component FILTERING_RGSS_TOOLTIP;
  private static final net.minecraft.network.chat.Component FILTERING_ANISOTROPIC_TOOLTIP;
  private final net.minecraft.client.OptionInstance<net.minecraft.client.TextureFilteringMethod> textureFiltering;
  private boolean useNativeTransport;
  private final net.minecraft.client.OptionInstance<net.minecraft.client.AttackIndicatorStatus> attackIndicator;
  public net.minecraft.client.tutorial.TutorialSteps tutorialStep;
  public boolean joinedFirstServer;
  private final net.minecraft.client.OptionInstance<java.lang.Integer> biomeBlendRadius;
  private final net.minecraft.client.OptionInstance<java.lang.Double> mouseWheelSensitivity;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> rawMouseInput;
  private static final net.minecraft.network.chat.Component ALLOW_CURSOR_CHANGES_TOOLTIP;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> allowCursorChanges;
  public int glDebugVerbosity;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> autoJump;
  private static final net.minecraft.network.chat.Component ACCESSIBILITY_TOOLTIP_ROTATE_WITH_MINECART;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> rotateWithMinecart;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> operatorItemsTab;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> autoSuggestions;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> chatColors;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> chatLinks;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> chatLinksPrompt;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> enableVsync;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> entityShadows;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> forceUnicodeFont;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> japaneseGlyphVariants;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> invertXMouse;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> invertYMouse;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> discreteMouseScroll;
  private static final net.minecraft.network.chat.Component REALMS_NOTIFICATIONS_TOOLTIP;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> realmsNotifications;
  private static final net.minecraft.network.chat.Component ALLOW_SERVER_LISTING_TOOLTIP;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> allowServerListing;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> reducedDebugInfo;
  private final java.util.Map<net.minecraft.sounds.SoundSource, net.minecraft.client.OptionInstance<java.lang.Double>> soundSourceVolumes;
  private static final net.minecraft.network.chat.Component CLOSED_CAPTIONS_TOOLTIP;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> showSubtitles;
  private static final net.minecraft.network.chat.Component DIRECTIONAL_AUDIO_TOOLTIP_ON;
  private static final net.minecraft.network.chat.Component DIRECTIONAL_AUDIO_TOOLTIP_OFF;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> directionalAudio;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> backgroundForChatOnly;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> touchscreen;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> fullscreen;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> bobView;
  private static final net.minecraft.network.chat.Component KEY_TOGGLE;
  private static final net.minecraft.network.chat.Component KEY_HOLD;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> toggleCrouch;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> toggleSprint;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> toggleAttack;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> toggleUse;
  private static final net.minecraft.network.chat.Component SPRINT_WINDOW_TOOLTIP;
  private final net.minecraft.client.OptionInstance<java.lang.Integer> sprintWindow;
  public boolean skipMultiplayerWarning;
  private static final net.minecraft.network.chat.Component CHAT_TOOLTIP_HIDE_MATCHED_NAMES;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> hideMatchedNames;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> showAutosaveIndicator;
  private static final net.minecraft.network.chat.Component CHAT_TOOLTIP_ONLY_SHOW_SECURE;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> onlyShowSecureChat;
  private static final net.minecraft.network.chat.Component CHAT_TOOLTIP_SAVE_DRAFTS;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> saveChatDrafts;
  public final net.minecraft.client.KeyMapping keyUp;
  public final net.minecraft.client.KeyMapping keyLeft;
  public final net.minecraft.client.KeyMapping keyDown;
  public final net.minecraft.client.KeyMapping keyRight;
  public final net.minecraft.client.KeyMapping keyJump;
  public final net.minecraft.client.KeyMapping keyShift;
  public final net.minecraft.client.KeyMapping keySprint;
  public final net.minecraft.client.KeyMapping keyInventory;
  public final net.minecraft.client.KeyMapping keySwapOffhand;
  public final net.minecraft.client.KeyMapping keyDrop;
  public final net.minecraft.client.KeyMapping keyUse;
  public final net.minecraft.client.KeyMapping keyAttack;
  public final net.minecraft.client.KeyMapping keyPickItem;
  public final net.minecraft.client.KeyMapping keyChat;
  public final net.minecraft.client.KeyMapping keyPlayerList;
  public final net.minecraft.client.KeyMapping keyCommand;
  public final net.minecraft.client.KeyMapping keySocialInteractions;
  public final net.minecraft.client.KeyMapping keyScreenshot;
  public final net.minecraft.client.KeyMapping keyTogglePerspective;
  public final net.minecraft.client.KeyMapping keySmoothCamera;
  public final net.minecraft.client.KeyMapping keyFullscreen;
  public final net.minecraft.client.KeyMapping keyAdvancements;
  public final net.minecraft.client.KeyMapping keyQuickActions;
  public final net.minecraft.client.KeyMapping keyToggleGui;
  public final net.minecraft.client.KeyMapping keyToggleSpectatorShaderEffects;
  public final net.minecraft.client.KeyMapping[] keyHotbarSlots;
  public final net.minecraft.client.KeyMapping keySaveHotbarActivator;
  public final net.minecraft.client.KeyMapping keyLoadHotbarActivator;
  public final net.minecraft.client.KeyMapping keySpectatorOutlines;
  public final net.minecraft.client.KeyMapping keySpectatorHotbar;
  public final net.minecraft.client.KeyMapping keyDebugOverlay;
  public final net.minecraft.client.KeyMapping keyDebugModifier;
  public final net.minecraft.client.KeyMapping keyDebugCrash;
  public final net.minecraft.client.KeyMapping keyDebugReloadChunk;
  public final net.minecraft.client.KeyMapping keyDebugShowHitboxes;
  public final net.minecraft.client.KeyMapping keyDebugClearChat;
  public final net.minecraft.client.KeyMapping keyDebugShowChunkBorders;
  public final net.minecraft.client.KeyMapping keyDebugShowAdvancedTooltips;
  public final net.minecraft.client.KeyMapping keyDebugCopyRecreateCommand;
  public final net.minecraft.client.KeyMapping keyDebugSpectate;
  public final net.minecraft.client.KeyMapping keyDebugSwitchGameMode;
  public final net.minecraft.client.KeyMapping keyDebugDebugOptions;
  public final net.minecraft.client.KeyMapping keyDebugFocusPause;
  public final net.minecraft.client.KeyMapping keyDebugDumpDynamicTextures;
  public final net.minecraft.client.KeyMapping keyDebugReloadResourcePacks;
  public final net.minecraft.client.KeyMapping keyDebugProfiling;
  public final net.minecraft.client.KeyMapping keyDebugCopyLocation;
  public final net.minecraft.client.KeyMapping keyDebugDumpVersion;
  public final net.minecraft.client.KeyMapping keyDebugPofilingChart;
  public final net.minecraft.client.KeyMapping keyDebugFpsCharts;
  public final net.minecraft.client.KeyMapping keyDebugNetworkCharts;
  public final net.minecraft.client.KeyMapping[] debugKeys;
  public final net.minecraft.client.KeyMapping[] keyMappings;
  protected net.minecraft.client.Minecraft minecraft;
  private final java.io.File optionsFile;
  public boolean hideGui;
  private net.minecraft.client.CameraType cameraType;
  public java.lang.String lastMpIp;
  public boolean smoothCamera;
  private final net.minecraft.client.OptionInstance<java.lang.Integer> fov;
  private static final net.minecraft.network.chat.Component TELEMETRY_TOOLTIP;
  private final net.minecraft.client.OptionInstance<java.lang.Boolean> telemetryOptInExtra;
  private static final net.minecraft.network.chat.Component ACCESSIBILITY_TOOLTIP_SCREEN_EFFECT;
  private final net.minecraft.client.OptionInstance<java.lang.Double> screenEffectScale;
  private static final net.minecraft.network.chat.Component ACCESSIBILITY_TOOLTIP_FOV_EFFECT;
  private final net.minecraft.client.OptionInstance<java.lang.Double> fovEffectScale;
  private static final net.minecraft.network.chat.Component ACCESSIBILITY_TOOLTIP_DARKNESS_EFFECT;
  private final net.minecraft.client.OptionInstance<java.lang.Double> darknessEffectScale;
  private static final net.minecraft.network.chat.Component ACCESSIBILITY_TOOLTIP_GLINT_SPEED;
  private final net.minecraft.client.OptionInstance<java.lang.Double> glintSpeed;
  private static final net.minecraft.network.chat.Component ACCESSIBILITY_TOOLTIP_GLINT_STRENGTH;
  private final net.minecraft.client.OptionInstance<java.lang.Double> glintStrength;
  private static final net.minecraft.network.chat.Component ACCESSIBILITY_TOOLTIP_DAMAGE_TILT_STRENGTH;
  private final net.minecraft.client.OptionInstance<java.lang.Double> damageTiltStrength;
  private final net.minecraft.client.OptionInstance<java.lang.Double> gamma;
  public static final int AUTO_GUI_SCALE;
  private static final int MAX_GUI_SCALE_INCLUSIVE;
  private final net.minecraft.client.OptionInstance<java.lang.Integer> guiScale;
  private final net.minecraft.client.OptionInstance<net.minecraft.server.level.ParticleStatus> particles;
  private final net.minecraft.client.OptionInstance<net.minecraft.client.NarratorStatus> narrator;
  public java.lang.String languageCode;
  private final net.minecraft.client.OptionInstance<java.lang.String> soundDevice;
  public boolean onboardAccessibility;
  private static final net.minecraft.network.chat.Component MUSIC_FREQUENCY_TOOLTIP;
  private final net.minecraft.client.OptionInstance<net.minecraft.client.sounds.MusicManager$MusicFrequency> musicFrequency;
  private final net.minecraft.client.OptionInstance<net.minecraft.client.MusicToastDisplayState> musicToast;
  public boolean syncWrites;
  public boolean startedCleanly;
  private static void operateOnLevelRenderer(java.util.function.Consumer<net.minecraft.client.renderer.LevelRenderer>);
  public net.minecraft.client.OptionInstance<java.lang.Boolean> darkMojangStudiosBackground();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> hideLightningFlash();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> hideSplashTexts();
  public net.minecraft.client.OptionInstance<java.lang.Double> sensitivity();
  public net.minecraft.client.OptionInstance<java.lang.Integer> renderDistance();
  public net.minecraft.client.OptionInstance<java.lang.Integer> simulationDistance();
  public net.minecraft.client.OptionInstance<java.lang.Double> entityDistanceScaling();
  public net.minecraft.client.OptionInstance<java.lang.Integer> framerateLimit();
  public void applyGraphicsPreset(net.minecraft.client.GraphicsPreset);
  public net.minecraft.client.OptionInstance<net.minecraft.client.GraphicsPreset> graphicsPreset();
  public net.minecraft.client.OptionInstance<net.minecraft.client.InactivityFpsLimit> inactivityFpsLimit();
  public net.minecraft.client.OptionInstance<net.minecraft.client.CloudStatus> cloudStatus();
  public net.minecraft.client.OptionInstance<java.lang.Integer> cloudRange();
  public net.minecraft.client.OptionInstance<java.lang.Integer> weatherRadius();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> cutoutLeaves();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> vignette();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> improvedTransparency();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> ambientOcclusion();
  public net.minecraft.client.OptionInstance<java.lang.Double> chunkSectionFadeInTime();
  public net.minecraft.client.OptionInstance<net.minecraft.client.PrioritizeChunkUpdates> prioritizeChunkUpdates();
  public void updateResourcePacks(net.minecraft.server.packs.repository.PackRepository);
  public net.minecraft.client.OptionInstance<net.minecraft.world.entity.player.ChatVisiblity> chatVisibility();
  public net.minecraft.client.OptionInstance<java.lang.Double> chatOpacity();
  public net.minecraft.client.OptionInstance<java.lang.Double> chatLineSpacing();
  public net.minecraft.client.OptionInstance<java.lang.Integer> menuBackgroundBlurriness();
  public int getMenuBackgroundBlurriness();
  public net.minecraft.client.OptionInstance<java.lang.Double> textBackgroundOpacity();
  public net.minecraft.client.OptionInstance<java.lang.Double> panoramaSpeed();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> highContrast();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> highContrastBlockOutline();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> narratorHotkey();
  public net.minecraft.client.OptionInstance<net.minecraft.world.entity.HumanoidArm> mainHand();
  public net.minecraft.client.OptionInstance<java.lang.Double> chatScale();
  public net.minecraft.client.OptionInstance<java.lang.Double> chatWidth();
  public net.minecraft.client.OptionInstance<java.lang.Double> chatHeightUnfocused();
  public net.minecraft.client.OptionInstance<java.lang.Double> chatHeightFocused();
  public net.minecraft.client.OptionInstance<java.lang.Double> chatDelay();
  public net.minecraft.client.OptionInstance<java.lang.Double> notificationDisplayTime();
  public net.minecraft.client.OptionInstance<java.lang.Integer> mipmapLevels();
  public net.minecraft.client.OptionInstance<java.lang.Integer> maxAnisotropyBit();
  public int maxAnisotropyValue();
  public net.minecraft.client.OptionInstance<net.minecraft.client.TextureFilteringMethod> textureFiltering();
  public net.minecraft.client.OptionInstance<net.minecraft.client.AttackIndicatorStatus> attackIndicator();
  public net.minecraft.client.OptionInstance<java.lang.Integer> biomeBlendRadius();
  private static double logMouse(int);
  private static int unlogMouse(double);
  public net.minecraft.client.OptionInstance<java.lang.Double> mouseWheelSensitivity();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> rawMouseInput();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> allowCursorChanges();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> autoJump();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> rotateWithMinecart();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> operatorItemsTab();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> autoSuggestions();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> chatColors();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> chatLinks();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> chatLinksPrompt();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> enableVsync();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> entityShadows();
  private static void updateFontOptions();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> forceUnicodeFont();
  private static boolean japaneseGlyphVariantsDefault();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> japaneseGlyphVariants();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> invertMouseX();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> invertMouseY();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> discreteMouseScroll();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> realmsNotifications();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> allowServerListing();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> reducedDebugInfo();
  public final float getFinalSoundSourceVolume(net.minecraft.sounds.SoundSource);
  public final float getSoundSourceVolume(net.minecraft.sounds.SoundSource);
  public final net.minecraft.client.OptionInstance<java.lang.Double> getSoundSourceOptionInstance(net.minecraft.sounds.SoundSource);
  private net.minecraft.client.OptionInstance<java.lang.Double> createSoundSliderOptionInstance(java.lang.String, net.minecraft.sounds.SoundSource);
  public net.minecraft.client.OptionInstance<java.lang.Boolean> showSubtitles();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> directionalAudio();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> backgroundForChatOnly();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> touchscreen();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> fullscreen();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> bobView();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> toggleCrouch();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> toggleSprint();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> toggleAttack();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> toggleUse();
  public net.minecraft.client.OptionInstance<java.lang.Integer> sprintWindow();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> hideMatchedNames();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> showAutosaveIndicator();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> onlyShowSecureChat();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> saveChatDrafts();
  private void setGraphicsPresetToCustom();
  public net.minecraft.client.OptionInstance<java.lang.Integer> fov();
  public net.minecraft.client.OptionInstance<java.lang.Boolean> telemetryOptInExtra();
  public net.minecraft.client.OptionInstance<java.lang.Double> screenEffectScale();
  public net.minecraft.client.OptionInstance<java.lang.Double> fovEffectScale();
  public net.minecraft.client.OptionInstance<java.lang.Double> darknessEffectScale();
  public net.minecraft.client.OptionInstance<java.lang.Double> glintSpeed();
  public net.minecraft.client.OptionInstance<java.lang.Double> glintStrength();
  public net.minecraft.client.OptionInstance<java.lang.Double> damageTiltStrength();
  public net.minecraft.client.OptionInstance<java.lang.Double> gamma();
  public net.minecraft.client.OptionInstance<java.lang.Integer> guiScale();
  public net.minecraft.client.OptionInstance<net.minecraft.server.level.ParticleStatus> particles();
  public net.minecraft.client.OptionInstance<net.minecraft.client.NarratorStatus> narrator();
  public net.minecraft.client.OptionInstance<java.lang.String> soundDevice();
  public void onboardingAccessibilityFinished();
  public net.minecraft.client.OptionInstance<net.minecraft.client.sounds.MusicManager$MusicFrequency> musicFrequency();
  public net.minecraft.client.OptionInstance<net.minecraft.client.MusicToastDisplayState> musicToast();
  public net.minecraft.client.Options(net.minecraft.client.Minecraft, java.io.File);
  public float getBackgroundOpacity(float);
  public int getBackgroundColor(float);
  public int getBackgroundColor(int);
  private void processDumpedOptions(net.minecraft.client.Options$OptionAccess);
  private void processOptions(net.minecraft.client.Options$FieldAccess);
  public void load();
  static boolean isTrue(java.lang.String);
  static boolean isFalse(java.lang.String);
  private net.minecraft.nbt.CompoundTag dataFix(net.minecraft.nbt.CompoundTag);
  public void save();
  private java.lang.String getFullscreenVideoModeString();
  public net.minecraft.server.level.ClientInformation buildPlayerInformation();
  public void broadcastOptions();
  public void setModelPart(net.minecraft.world.entity.player.PlayerModelPart, boolean);
  public boolean isModelPartEnabled(net.minecraft.world.entity.player.PlayerModelPart);
  public net.minecraft.client.CloudStatus getCloudsType();
  public boolean useNativeTransport();
  public void loadSelectedResourcePacks(net.minecraft.server.packs.repository.PackRepository);
  public net.minecraft.client.CameraType getCameraType();
  public void setCameraType(net.minecraft.client.CameraType);
  private static java.util.List<java.lang.String> readListOfStrings(java.lang.String);
  public java.io.File getFile();
  public java.lang.String dumpOptionsForReport();
  public void setServerRenderDistance(int);
  public int getEffectiveRenderDistance();
  private static net.minecraft.network.chat.Component pixelValueLabel(net.minecraft.network.chat.Component, int);
  private static net.minecraft.network.chat.Component percentValueLabel(net.minecraft.network.chat.Component, double);
  public static net.minecraft.network.chat.Component genericValueLabel(net.minecraft.network.chat.Component, net.minecraft.network.chat.Component);
  public static net.minecraft.network.chat.Component genericValueLabel(net.minecraft.network.chat.Component, int);
  public static net.minecraft.network.chat.Component genericValueOrOffLabel(net.minecraft.network.chat.Component, int);
  private static net.minecraft.network.chat.Component percentValueOrOffLabel(net.minecraft.network.chat.Component, double);
  private static java.lang.String method_37293(com.mojang.datafixers.util.Pair);
  private void method_68468(java.lang.String);
  private static void method_24230(net.minecraft.nbt.CompoundTag, java.lang.String);
  private void method_75319(java.lang.Integer);
  private static net.minecraft.network.chat.Component method_42493(net.minecraft.network.chat.Component, java.lang.Integer);
  private void method_76780(java.lang.Integer);
  private static net.minecraft.network.chat.Component method_42508(net.minecraft.network.chat.Component, java.lang.Integer);
  private void method_76609(net.minecraft.client.MusicToastDisplayState);
  private static net.minecraft.network.chat.Component method_76610(net.minecraft.network.chat.Component, net.minecraft.client.MusicToastDisplayState);
  private static net.minecraft.client.gui.components.Tooltip method_76612(net.minecraft.client.MusicToastDisplayState);
  private static void method_71785(net.minecraft.client.sounds.MusicManager$MusicFrequency);
  private static net.minecraft.network.chat.Component method_76534(net.minecraft.network.chat.Component, net.minecraft.client.sounds.MusicManager$MusicFrequency);
  private static void method_42509(java.lang.String);
  private static java.util.Optional method_42516(java.lang.String);
  private static java.util.List method_42478();
  private static net.minecraft.network.chat.Component method_42523(net.minecraft.network.chat.Component, java.lang.String);
  private void method_42463(net.minecraft.client.NarratorStatus);
  private net.minecraft.network.chat.Component method_42489(net.minecraft.network.chat.Component, net.minecraft.client.NarratorStatus);
  private void method_75315(net.minecraft.server.level.ParticleStatus);
  private static net.minecraft.network.chat.Component method_76527(net.minecraft.network.chat.Component, net.minecraft.server.level.ParticleStatus);
  private void method_42515(java.lang.Integer);
  private static int method_42479();
  private static net.minecraft.network.chat.Component method_42522(net.minecraft.network.chat.Component, java.lang.Integer);
  private static void method_42467(java.lang.Double);
  private static net.minecraft.network.chat.Component method_42492(net.minecraft.network.chat.Component, java.lang.Double);
  private static void method_75322(java.lang.Double);
  private static void method_71043(java.lang.Double);
  private static void method_48582(java.lang.Double);
  private static void method_42501(java.lang.Double);
  private static void method_42514(java.lang.Double);
  private static void method_42526(java.lang.Double);
  private static void method_47607(java.lang.Boolean);
  private static net.minecraft.network.chat.Component method_47608(net.minecraft.network.chat.Component, java.lang.Boolean);
  private static void method_76781(java.lang.Integer);
  private static java.lang.Double method_42532(java.lang.Integer);
  private static java.lang.Integer method_42536(java.lang.Double);
  private static net.minecraft.network.chat.Component method_41789(net.minecraft.network.chat.Component, java.lang.Integer);
  private static net.minecraft.client.KeyMapping[] method_75324(int);
  private static void method_75325(java.lang.Integer);
  private static net.minecraft.network.chat.Component method_72715(net.minecraft.network.chat.Component, java.lang.Integer);
  private static void method_72711(java.lang.Boolean);
  private static net.minecraft.network.chat.Component method_72710(net.minecraft.network.chat.Component, java.lang.Boolean);
  private static void method_72713(java.lang.Boolean);
  private static net.minecraft.network.chat.Component method_72712(net.minecraft.network.chat.Component, java.lang.Boolean);
  private static void method_72714(java.lang.Boolean);
  private static net.minecraft.network.chat.Component method_42491(net.minecraft.network.chat.Component, java.lang.Boolean);
  private static void method_42520(java.lang.Boolean);
  private static net.minecraft.network.chat.Component method_42506(net.minecraft.network.chat.Component, java.lang.Boolean);
  private void method_42513(java.lang.Boolean);
  private static void method_42500(java.lang.Boolean);
  private static net.minecraft.network.chat.Component method_42525(net.minecraft.network.chat.Component, java.lang.Boolean);
  private static void method_42530(java.lang.Boolean);
  private static net.minecraft.client.gui.components.Tooltip method_47398(java.lang.Boolean);
  private void method_45575(net.minecraft.sounds.SoundSource, java.lang.Double);
  private net.minecraft.client.OptionInstance method_66524(net.minecraft.sounds.SoundSource);
  private static void method_72717(java.lang.Boolean);
  private static void method_42535(java.lang.Boolean);
  private static void method_57022(java.lang.Boolean);
  private static void method_42537(java.lang.Boolean);
  private void method_75336(java.lang.Boolean);
  private static void method_42538(java.lang.Boolean);
  private static void method_74035(java.lang.Boolean);
  private static void method_41777(java.lang.Boolean);
  private static void method_41778(java.lang.Double);
  private static net.minecraft.network.chat.Component method_41788(net.minecraft.network.chat.Component, java.lang.Double);
  private void method_76782(java.lang.Integer);
  private static net.minecraft.network.chat.Component method_41800(net.minecraft.network.chat.Component, java.lang.Integer);
  private static void method_42458(net.minecraft.client.AttackIndicatorStatus);
  private static net.minecraft.network.chat.Component method_76530(net.minecraft.network.chat.Component, net.minecraft.client.AttackIndicatorStatus);
  private void method_76777(net.minecraft.client.TextureFilteringMethod);
  private static net.minecraft.network.chat.Component method_76749(net.minecraft.network.chat.Component, net.minecraft.client.TextureFilteringMethod);
  private static net.minecraft.client.gui.components.Tooltip method_76750(net.minecraft.client.TextureFilteringMethod);
  private void method_76783(java.lang.Integer);
  private static net.minecraft.network.chat.Component method_76250(net.minecraft.network.chat.Component, java.lang.Integer);
  private void method_75327(java.lang.Integer);
  private static net.minecraft.network.chat.Component method_42545(net.minecraft.network.chat.Component, java.lang.Integer);
  private static void method_48188(java.lang.Double);
  private static int method_48190(java.lang.Double);
  private static java.lang.Double method_48187(int);
  private static net.minecraft.network.chat.Component method_48189(net.minecraft.network.chat.Component, java.lang.Double);
  private static void method_42540(java.lang.Double);
  private static int method_42544(java.lang.Double);
  private static java.lang.Double method_42504(int);
  private static net.minecraft.network.chat.Component method_42548(net.minecraft.network.chat.Component, java.lang.Double);
  private static void method_41796(java.lang.Double);
  private static net.minecraft.network.chat.Component method_41799(net.minecraft.network.chat.Component, java.lang.Double);
  private static void method_41802(java.lang.Double);
  private static net.minecraft.network.chat.Component method_41804(net.minecraft.network.chat.Component, java.lang.Double);
  private static void method_42558(java.lang.Double);
  private static net.minecraft.network.chat.Component method_42560(net.minecraft.network.chat.Component, java.lang.Double);
  private static void method_42562(java.lang.Double);
  private static net.minecraft.network.chat.Component method_42564(net.minecraft.network.chat.Component, java.lang.Double);
  private static void method_42455(net.minecraft.world.entity.HumanoidArm);
  private static net.minecraft.network.chat.Component method_76528(net.minecraft.network.chat.Component, net.minecraft.world.entity.HumanoidArm);
  private void method_49599(java.lang.Boolean);
  private static void method_45580(java.lang.Double);
  private static void method_42566(java.lang.Double);
  private void method_75330(java.lang.Integer);
  private static void method_42568(java.lang.Double);
  private static void method_42424(java.lang.Double);
  private static net.minecraft.network.chat.Component method_42432(net.minecraft.network.chat.Component, java.lang.Double);
  private static void method_42456(net.minecraft.world.entity.player.ChatVisiblity);
  private static net.minecraft.network.chat.Component method_76529(net.minecraft.network.chat.Component, net.minecraft.world.entity.player.ChatVisiblity);
  private void method_75318(net.minecraft.client.PrioritizeChunkUpdates);
  private static net.minecraft.network.chat.Component method_76533(net.minecraft.network.chat.Component, net.minecraft.client.PrioritizeChunkUpdates);
  private static net.minecraft.client.gui.components.Tooltip method_47396(net.minecraft.client.PrioritizeChunkUpdates);
  private static void method_76254(java.lang.Double);
  private static int method_76255(java.lang.Double);
  private static java.lang.Double method_76249(int);
  private static net.minecraft.network.chat.Component method_76252(net.minecraft.network.chat.Component, java.lang.Double);
  private void method_76785(java.lang.Boolean);
  private void method_76786(java.lang.Boolean);
  private void method_76787(java.lang.Boolean);
  private void method_75331(java.lang.Integer);
  private static net.minecraft.network.chat.Component method_75328(net.minecraft.network.chat.Component, java.lang.Integer);
  private void method_76784(java.lang.Integer);
  private static void method_76778(net.minecraft.client.renderer.LevelRenderer);
  private static net.minecraft.network.chat.Component method_71268(net.minecraft.network.chat.Component, java.lang.Integer);
  private void method_75316(net.minecraft.client.CloudStatus);
  private static net.minecraft.client.CloudStatus method_52704(java.lang.Boolean);
  private static net.minecraft.network.chat.Component method_76531(net.minecraft.network.chat.Component, net.minecraft.client.CloudStatus);
  private static void method_61968(net.minecraft.client.InactivityFpsLimit);
  private static net.minecraft.network.chat.Component method_76532(net.minecraft.network.chat.Component, net.minecraft.client.InactivityFpsLimit);
  private static net.minecraft.client.gui.components.Tooltip method_61969(net.minecraft.client.InactivityFpsLimit);
  private static net.minecraft.network.chat.Component method_75320(net.minecraft.network.chat.Component, net.minecraft.client.GraphicsPreset);
  private static void method_42555(java.lang.Integer);
  private static int method_42557(java.lang.Integer);
  private static java.lang.Integer method_42511(int);
  private static net.minecraft.network.chat.Component method_42559(net.minecraft.network.chat.Component, java.lang.Integer);
  private void method_75341(java.lang.Double);
  private static int method_42430(java.lang.Double);
  private static java.lang.Double method_42518(int);
  private static void method_42434(java.lang.Double);
  private static net.minecraft.network.chat.Component method_42436(net.minecraft.network.chat.Component, java.lang.Double);
  static {};
}

=== net.minecraft.client.gui.Font   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "Font.java"
public class net.minecraft.client.gui.Font {
  private static final float EFFECT_DEPTH;
  private static final float OVER_EFFECT_DEPTH;
  private static final float UNDER_EFFECT_DEPTH;
  public static final float SHADOW_DEPTH;
  public final int lineHeight;
  private final net.minecraft.util.RandomSource random;
  final net.minecraft.client.gui.Font$Provider provider;
  private final net.minecraft.client.StringSplitter splitter;
  public net.minecraft.client.gui.Font(net.minecraft.client.gui.Font$Provider);
  private net.minecraft.client.gui.GlyphSource getGlyphSource(net.minecraft.network.chat.FontDescription);
  public java.lang.String bidirectionalShaping(java.lang.String);
  public void drawInBatch(java.lang.String, float, float, int, boolean, org.joml.Matrix4f, net.minecraft.client.renderer.MultiBufferSource, net.minecraft.client.gui.Font$DisplayMode, int, int);
  public void drawInBatch(net.minecraft.network.chat.Component, float, float, int, boolean, org.joml.Matrix4f, net.minecraft.client.renderer.MultiBufferSource, net.minecraft.client.gui.Font$DisplayMode, int, int);
  public void drawInBatch(net.minecraft.util.FormattedCharSequence, float, float, int, boolean, org.joml.Matrix4f, net.minecraft.client.renderer.MultiBufferSource, net.minecraft.client.gui.Font$DisplayMode, int, int);
  public void drawInBatch8xOutline(net.minecraft.util.FormattedCharSequence, float, float, int, int, org.joml.Matrix4f, net.minecraft.client.renderer.MultiBufferSource, int);
  net.minecraft.client.gui.font.glyphs.BakedGlyph getGlyph(int, net.minecraft.network.chat.Style);
  public net.minecraft.client.gui.Font$PreparedText prepareText(java.lang.String, float, float, int, boolean, int);
  public net.minecraft.client.gui.Font$PreparedText prepareText(net.minecraft.util.FormattedCharSequence, float, float, int, boolean, boolean, int);
  public int width(java.lang.String);
  public int width(net.minecraft.network.chat.FormattedText);
  public int width(net.minecraft.util.FormattedCharSequence);
  public java.lang.String plainSubstrByWidth(java.lang.String, int, boolean);
  public java.lang.String plainSubstrByWidth(java.lang.String, int);
  public net.minecraft.network.chat.FormattedText substrByWidth(net.minecraft.network.chat.FormattedText, int);
  public int wordWrapHeight(net.minecraft.network.chat.FormattedText, int);
  public java.util.List<net.minecraft.util.FormattedCharSequence> split(net.minecraft.network.chat.FormattedText, int);
  public java.util.List<net.minecraft.network.chat.FormattedText> splitIgnoringLanguage(net.minecraft.network.chat.FormattedText, int);
  public boolean isBidirectional();
  public net.minecraft.client.StringSplitter getSplitter();
  private boolean method_37297(net.minecraft.client.gui.Font$PreparedTextBuilder, float[], int, float, int, int, int, net.minecraft.network.chat.Style, int);
  private float method_27516(int, net.minecraft.network.chat.Style);
}

=== net.minecraft.client.gui.components.ChatComponent   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "ChatComponent.java"
public class net.minecraft.client.gui.components.ChatComponent {
  private static final org.slf4j.Logger LOGGER;
  private static final int MAX_CHAT_HISTORY;
  private static final int MESSAGE_INDENT;
  private static final int BOTTOM_MARGIN;
  private static final int TOOLTIP_MAX_WIDTH;
  private static final int TIME_BEFORE_MESSAGE_DELETION;
  private static final net.minecraft.network.chat.Component DELETED_CHAT_MESSAGE;
  public static final int MESSAGE_BOTTOM_TO_MESSAGE_TOP;
  public static final net.minecraft.resources.Identifier QUEUE_EXPAND_ID;
  private static final net.minecraft.network.chat.Style QUEUE_EXPAND_TEXT_STYLE;
  final net.minecraft.client.Minecraft minecraft;
  private final net.minecraft.util.ArrayListDeque<java.lang.String> recentChat;
  private final java.util.List<net.minecraft.client.GuiMessage> allMessages;
  private final java.util.List<net.minecraft.client.GuiMessage$Line> trimmedMessages;
  private int chatScrollbarPos;
  private boolean newMessageSinceScroll;
  private net.minecraft.client.gui.components.ChatComponent$Draft latestDraft;
  private net.minecraft.client.gui.screens.ChatScreen preservedScreen;
  private final java.util.List<net.minecraft.client.gui.components.ChatComponent$DelayedMessageDeletion> messageDeletionQueue;
  public net.minecraft.client.gui.components.ChatComponent(net.minecraft.client.Minecraft);
  public void tick();
  private int forEachLine(net.minecraft.client.gui.components.ChatComponent$AlphaCalculator, net.minecraft.client.gui.components.ChatComponent$LineConsumer);
  public void render(net.minecraft.client.gui.GuiGraphics, net.minecraft.client.gui.Font, int, int, int, boolean, boolean);
  public void captureClickableText(net.minecraft.client.gui.ActiveTextCollector, int, int, boolean);
  private void render(net.minecraft.client.gui.components.ChatComponent$ChatGraphicsAccess, int, int, boolean);
  private boolean isChatHidden();
  public void clearMessages(boolean);
  public void addMessage(net.minecraft.network.chat.Component);
  public void addMessage(net.minecraft.network.chat.Component, net.minecraft.network.chat.MessageSignature, net.minecraft.client.GuiMessageTag);
  private void logChatMessage(net.minecraft.client.GuiMessage);
  private void addMessageToDisplayQueue(net.minecraft.client.GuiMessage);
  private void addMessageToQueue(net.minecraft.client.GuiMessage);
  private void processMessageDeletionQueue();
  public void deleteMessage(net.minecraft.network.chat.MessageSignature);
  private net.minecraft.client.gui.components.ChatComponent$DelayedMessageDeletion deleteMessageOrDelay(net.minecraft.network.chat.MessageSignature);
  private net.minecraft.client.GuiMessage createDeletedMarker(net.minecraft.client.GuiMessage);
  public void rescaleChat();
  private void refreshTrimmedMessages();
  public net.minecraft.util.ArrayListDeque<java.lang.String> getRecentChat();
  public void addRecentChat(java.lang.String);
  public void resetChatScroll();
  public void scrollChat(int);
  public boolean isChatFocused();
  private int getWidth();
  private int getHeight();
  private double getScale();
  public static int getWidth(double);
  public static int getHeight(double);
  public static double defaultUnfocusedPct();
  public int getLinesPerPage();
  private int getLineHeight();
  public void saveAsDraft(java.lang.String);
  public void discardDraft();
  public <T extends net.minecraft.client.gui.screens.ChatScreen> T createScreen(net.minecraft.client.gui.components.ChatComponent$ChatMethod, net.minecraft.client.gui.screens.ChatScreen$ChatConstructor<T>);
  public void openScreen(net.minecraft.client.gui.components.ChatComponent$ChatMethod, net.minecraft.client.gui.screens.ChatScreen$ChatConstructor<?>);
  public void preserveCurrentChatScreen();
  public net.minecraft.client.gui.screens.ChatScreen restoreChatScreen();
  public net.minecraft.client.gui.components.ChatComponent$State storeState();
  public void restoreState(net.minecraft.client.gui.components.ChatComponent$State);
  private boolean method_45585(int, net.minecraft.client.gui.components.ChatComponent$DelayedMessageDeletion);
  private static void method_75802(int, int, net.minecraft.client.gui.components.ChatComponent$ChatGraphicsAccess, int, float, net.minecraft.client.GuiMessage$Line, int, float);
  private static void method_75801(float, org.joml.Matrix3x2f);
  static {};
}

=== net.minecraft.client.gui.components.events.GuiEventListener   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "GuiEventListener.java"
public interface net.minecraft.client.gui.components.events.GuiEventListener extends net.minecraft.client.gui.components.TabOrderedElement {
  public default void mouseMoved(double, double);
  public default boolean mouseClicked(net.minecraft.client.input.MouseButtonEvent, boolean);
  public default boolean mouseReleased(net.minecraft.client.input.MouseButtonEvent);
  public default boolean mouseDragged(net.minecraft.client.input.MouseButtonEvent, double, double);
  public default boolean mouseScrolled(double, double, double, double);
  public default boolean keyPressed(net.minecraft.client.input.KeyEvent);
  public default boolean keyReleased(net.minecraft.client.input.KeyEvent);
  public default boolean charTyped(net.minecraft.client.input.CharacterEvent);
  public default net.minecraft.client.gui.ComponentPath nextFocusPath(net.minecraft.client.gui.navigation.FocusNavigationEvent);
  public default boolean isMouseOver(double, double);
  public abstract void setFocused(boolean);
  public abstract boolean isFocused();
  public default boolean shouldTakeFocusAfterInteraction();
  public default net.minecraft.client.gui.ComponentPath getCurrentFocusPath();
  public default net.minecraft.client.gui.navigation.ScreenRectangle getRectangle();
  public default net.minecraft.client.gui.navigation.ScreenRectangle getBorderForArrowNavigation(net.minecraft.client.gui.navigation.ScreenDirection);
}

=== net.minecraft.client.input.CharacterEvent   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "CharacterEvent.java"
public final class net.minecraft.client.input.CharacterEvent extends java.lang.Record {
  private final int codepoint;
  private final int modifiers;
  public net.minecraft.client.input.CharacterEvent(int, int);
  public java.lang.String codepointAsString();
  public boolean isAllowedChatCharacter();
  public final java.lang.String toString();
  public final int hashCode();
  public final boolean equals(java.lang.Object);
  public int codepoint();
  public int modifiers();
}

=== net.minecraft.client.input.KeyEvent   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "KeyEvent.java"
public final class net.minecraft.client.input.KeyEvent extends java.lang.Record implements net.minecraft.client.input.InputWithModifiers {
  private final int key;
  private final int scancode;
  private final int modifiers;
  public net.minecraft.client.input.KeyEvent(int, int, int);
  public int input();
  public final java.lang.String toString();
  public final int hashCode();
  public final boolean equals(java.lang.Object);
  public int key();
  public int scancode();
  public int modifiers();
}

=== net.minecraft.client.input.MouseButtonEvent   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "MouseButtonEvent.java"
public final class net.minecraft.client.input.MouseButtonEvent extends java.lang.Record implements net.minecraft.client.input.InputWithModifiers {
  private final double x;
  private final double y;
  private final net.minecraft.client.input.MouseButtonInfo buttonInfo;
  public net.minecraft.client.input.MouseButtonEvent(double, double, net.minecraft.client.input.MouseButtonInfo);
  public int input();
  public int button();
  public int modifiers();
  public final java.lang.String toString();
  public final int hashCode();
  public final boolean equals(java.lang.Object);
  public double x();
  public double y();
  public net.minecraft.client.input.MouseButtonInfo buttonInfo();
}

=== net.minecraft.client.input.MouseButtonInfo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "MouseButtonInfo.java"
public final class net.minecraft.client.input.MouseButtonInfo extends java.lang.Record implements net.minecraft.client.input.InputWithModifiers {
  private final int button;
  private final int modifiers;
  public net.minecraft.client.input.MouseButtonInfo(int, int);
  public int input();
  public final java.lang.String toString();
  public final int hashCode();
  public final boolean equals(java.lang.Object);
  public int button();
  public int modifiers();
}

=== net.minecraft.client.renderer.texture.TextureManager   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "TextureManager.java"
public class net.minecraft.client.renderer.texture.TextureManager implements net.minecraft.server.packs.resources.PreparableReloadListener,java.lang.AutoCloseable {
  private static final org.slf4j.Logger LOGGER;
  public static final net.minecraft.resources.Identifier INTENTIONAL_MISSING_TEXTURE;
  private final java.util.Map<net.minecraft.resources.Identifier, net.minecraft.client.renderer.texture.AbstractTexture> byPath;
  private final java.util.Set<net.minecraft.client.renderer.texture.TickableTexture> tickableTextures;
  private final net.minecraft.server.packs.resources.ResourceManager resourceManager;
  public net.minecraft.client.renderer.texture.TextureManager(net.minecraft.server.packs.resources.ResourceManager);
  public void registerAndLoad(net.minecraft.resources.Identifier, net.minecraft.client.renderer.texture.ReloadableTexture);
  private net.minecraft.client.renderer.texture.TextureContents loadContentsSafe(net.minecraft.resources.Identifier, net.minecraft.client.renderer.texture.ReloadableTexture);
  public void registerForNextReload(net.minecraft.resources.Identifier);
  public void register(net.minecraft.resources.Identifier, net.minecraft.client.renderer.texture.AbstractTexture);
  private void safeClose(net.minecraft.resources.Identifier, net.minecraft.client.renderer.texture.AbstractTexture);
  public net.minecraft.client.renderer.texture.AbstractTexture getTexture(net.minecraft.resources.Identifier);
  public void tick();
  public void release(net.minecraft.resources.Identifier);
  public void close();
  public java.util.concurrent.CompletableFuture<java.lang.Void> reload(net.minecraft.server.packs.resources.PreparableReloadListener$SharedState, java.util.concurrent.Executor, net.minecraft.server.packs.resources.PreparableReloadListener$PreparationBarrier, java.util.concurrent.Executor);
  public void dumpAllSheets(java.nio.file.Path);
  private static net.minecraft.client.renderer.texture.TextureContents loadContents(net.minecraft.server.packs.resources.ResourceManager, net.minecraft.resources.Identifier, net.minecraft.client.renderer.texture.ReloadableTexture) throws java.io.IOException;
  private static net.minecraft.client.renderer.texture.TextureManager$PendingReload scheduleLoad(net.minecraft.server.packs.resources.ResourceManager, net.minecraft.resources.Identifier, net.minecraft.client.renderer.texture.ReloadableTexture, java.util.concurrent.Executor);
  private static net.minecraft.client.renderer.texture.TextureContents method_65881(net.minecraft.server.packs.resources.ResourceManager, net.minecraft.resources.Identifier, net.minecraft.client.renderer.texture.ReloadableTexture);
  private static void method_49718(java.nio.file.Path, net.minecraft.resources.Identifier, net.minecraft.client.renderer.texture.AbstractTexture);
  private void method_65880(java.util.List, java.lang.Void);
  private static java.util.concurrent.CompletableFuture[] method_65874(int);
  private static void method_65879(java.util.List, net.minecraft.server.packs.resources.ResourceManager, java.util.concurrent.Executor, net.minecraft.resources.Identifier, net.minecraft.client.renderer.texture.AbstractTexture);
  private static java.lang.String method_68006();
  static {};
}

=== net.minecraft.network.chat.Component   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "Component.java"
public interface net.minecraft.network.chat.Component extends com.mojang.brigadier.Message,net.minecraft.network.chat.FormattedText {
  public abstract net.minecraft.network.chat.Style getStyle();
  public abstract net.minecraft.network.chat.ComponentContents getContents();
  public default java.lang.String getString();
  public default java.lang.String getString(int);
  public abstract java.util.List<net.minecraft.network.chat.Component> getSiblings();
  public default java.lang.String tryCollapseToString();
  public default net.minecraft.network.chat.MutableComponent plainCopy();
  public default net.minecraft.network.chat.MutableComponent copy();
  public abstract net.minecraft.util.FormattedCharSequence getVisualOrderText();
  public default <T> java.util.Optional<T> visit(net.minecraft.network.chat.FormattedText$StyledContentConsumer<T>, net.minecraft.network.chat.Style);
  public default <T> java.util.Optional<T> visit(net.minecraft.network.chat.FormattedText$ContentConsumer<T>);
  public default java.util.List<net.minecraft.network.chat.Component> toFlatList();
  public default java.util.List<net.minecraft.network.chat.Component> toFlatList(net.minecraft.network.chat.Style);
  public default boolean contains(net.minecraft.network.chat.Component);
  public static net.minecraft.network.chat.Component nullToEmpty(java.lang.String);
  public static net.minecraft.network.chat.MutableComponent literal(java.lang.String);
  public static net.minecraft.network.chat.MutableComponent translatable(java.lang.String);
  public static net.minecraft.network.chat.MutableComponent translatable(java.lang.String, java.lang.Object...);
  public static net.minecraft.network.chat.MutableComponent translatableEscape(java.lang.String, java.lang.Object...);
  public static net.minecraft.network.chat.MutableComponent translatableWithFallback(java.lang.String, java.lang.String);
  public static net.minecraft.network.chat.MutableComponent translatableWithFallback(java.lang.String, java.lang.String, java.lang.Object...);
  public static net.minecraft.network.chat.MutableComponent empty();
  public static net.minecraft.network.chat.MutableComponent keybind(java.lang.String);
  public static net.minecraft.network.chat.MutableComponent nbt(java.lang.String, boolean, java.util.Optional<net.minecraft.network.chat.Component>, net.minecraft.network.chat.contents.data.DataSource);
  public static net.minecraft.network.chat.MutableComponent score(net.minecraft.commands.arguments.selector.SelectorPattern, java.lang.String);
  public static net.minecraft.network.chat.MutableComponent score(java.lang.String, java.lang.String);
  public static net.minecraft.network.chat.MutableComponent selector(net.minecraft.commands.arguments.selector.SelectorPattern, java.util.Optional<net.minecraft.network.chat.Component>);
  public static net.minecraft.network.chat.MutableComponent object(net.minecraft.network.chat.contents.objects.ObjectInfo);
  public static net.minecraft.network.chat.Component translationArg(java.util.Date);
  public static net.minecraft.network.chat.Component translationArg(com.mojang.brigadier.Message);
  public static net.minecraft.network.chat.Component translationArg(java.util.UUID);
  public static net.minecraft.network.chat.Component translationArg(net.minecraft.resources.Identifier);
  public static net.minecraft.network.chat.Component translationArg(net.minecraft.world.level.ChunkPos);
  public static net.minecraft.network.chat.Component translationArg(java.net.URI);
  private static java.util.Optional method_36135(java.util.List, net.minecraft.network.chat.Style, java.lang.String);
  private static java.util.Optional method_27655(int, java.lang.StringBuilder, java.lang.String);
}

=== net.minecraft.network.chat.Style   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "Style.java"
public final class net.minecraft.network.chat.Style {
  public static final net.minecraft.network.chat.Style EMPTY;
  public static final int NO_SHADOW;
  final net.minecraft.network.chat.TextColor color;
  final java.lang.Integer shadowColor;
  final java.lang.Boolean bold;
  final java.lang.Boolean italic;
  final java.lang.Boolean underlined;
  final java.lang.Boolean strikethrough;
  final java.lang.Boolean obfuscated;
  final net.minecraft.network.chat.ClickEvent clickEvent;
  final net.minecraft.network.chat.HoverEvent hoverEvent;
  final java.lang.String insertion;
  final net.minecraft.network.chat.FontDescription font;
  private static net.minecraft.network.chat.Style create(java.util.Optional<net.minecraft.network.chat.TextColor>, java.util.Optional<java.lang.Integer>, java.util.Optional<java.lang.Boolean>, java.util.Optional<java.lang.Boolean>, java.util.Optional<java.lang.Boolean>, java.util.Optional<java.lang.Boolean>, java.util.Optional<java.lang.Boolean>, java.util.Optional<net.minecraft.network.chat.ClickEvent>, java.util.Optional<net.minecraft.network.chat.HoverEvent>, java.util.Optional<java.lang.String>, java.util.Optional<net.minecraft.network.chat.FontDescription>);
  private net.minecraft.network.chat.Style(net.minecraft.network.chat.TextColor, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, net.minecraft.network.chat.ClickEvent, net.minecraft.network.chat.HoverEvent, java.lang.String, net.minecraft.network.chat.FontDescription);
  public net.minecraft.network.chat.TextColor getColor();
  public java.lang.Integer getShadowColor();
  public boolean isBold();
  public boolean isItalic();
  public boolean isStrikethrough();
  public boolean isUnderlined();
  public boolean isObfuscated();
  public boolean isEmpty();
  public net.minecraft.network.chat.ClickEvent getClickEvent();
  public net.minecraft.network.chat.HoverEvent getHoverEvent();
  public java.lang.String getInsertion();
  public net.minecraft.network.chat.FontDescription getFont();
  private static <T> net.minecraft.network.chat.Style checkEmptyAfterChange(net.minecraft.network.chat.Style, T, T);
  public net.minecraft.network.chat.Style withColor(net.minecraft.network.chat.TextColor);
  public net.minecraft.network.chat.Style withColor(net.minecraft.ChatFormatting);
  public net.minecraft.network.chat.Style withColor(int);
  public net.minecraft.network.chat.Style withShadowColor(int);
  public net.minecraft.network.chat.Style withoutShadow();
  public net.minecraft.network.chat.Style withBold(java.lang.Boolean);
  public net.minecraft.network.chat.Style withItalic(java.lang.Boolean);
  public net.minecraft.network.chat.Style withUnderlined(java.lang.Boolean);
  public net.minecraft.network.chat.Style withStrikethrough(java.lang.Boolean);
  public net.minecraft.network.chat.Style withObfuscated(java.lang.Boolean);
  public net.minecraft.network.chat.Style withClickEvent(net.minecraft.network.chat.ClickEvent);
  public net.minecraft.network.chat.Style withHoverEvent(net.minecraft.network.chat.HoverEvent);
  public net.minecraft.network.chat.Style withInsertion(java.lang.String);
  public net.minecraft.network.chat.Style withFont(net.minecraft.network.chat.FontDescription);
  public net.minecraft.network.chat.Style applyFormat(net.minecraft.ChatFormatting);
  public net.minecraft.network.chat.Style applyLegacyFormat(net.minecraft.ChatFormatting);
  public net.minecraft.network.chat.Style applyFormats(net.minecraft.ChatFormatting...);
  public net.minecraft.network.chat.Style applyTo(net.minecraft.network.chat.Style);
  public java.lang.String toString();
  public boolean equals(java.lang.Object);
  public int hashCode();
  static {};
}

=== net.minecraft.resources.Identifier   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "Identifier.java"
public final class net.minecraft.resources.Identifier implements java.lang.Comparable<net.minecraft.resources.Identifier> {
  public static final com.mojang.serialization.Codec<net.minecraft.resources.Identifier> CODEC;
  public static final net.minecraft.network.codec.StreamCodec<io.netty.buffer.ByteBuf, net.minecraft.resources.Identifier> STREAM_CODEC;
  public static final com.mojang.brigadier.exceptions.SimpleCommandExceptionType ERROR_INVALID;
  public static final char NAMESPACE_SEPARATOR;
  public static final java.lang.String DEFAULT_NAMESPACE;
  public static final java.lang.String REALMS_NAMESPACE;
  private final java.lang.String namespace;
  private final java.lang.String path;
  static final boolean $assertionsDisabled;
  private net.minecraft.resources.Identifier(java.lang.String, java.lang.String);
  private static net.minecraft.resources.Identifier createUntrusted(java.lang.String, java.lang.String);
  public static net.minecraft.resources.Identifier fromNamespaceAndPath(java.lang.String, java.lang.String);
  public static net.minecraft.resources.Identifier parse(java.lang.String);
  public static net.minecraft.resources.Identifier withDefaultNamespace(java.lang.String);
  public static net.minecraft.resources.Identifier tryParse(java.lang.String);
  public static net.minecraft.resources.Identifier tryBuild(java.lang.String, java.lang.String);
  public static net.minecraft.resources.Identifier bySeparator(java.lang.String, char);
  public static net.minecraft.resources.Identifier tryBySeparator(java.lang.String, char);
  public static com.mojang.serialization.DataResult<net.minecraft.resources.Identifier> read(java.lang.String);
  public java.lang.String getPath();
  public java.lang.String getNamespace();
  public net.minecraft.resources.Identifier withPath(java.lang.String);
  public net.minecraft.resources.Identifier withPath(java.util.function.UnaryOperator<java.lang.String>);
  public net.minecraft.resources.Identifier withPrefix(java.lang.String);
  public net.minecraft.resources.Identifier withSuffix(java.lang.String);
  public java.lang.String toString();
  public boolean equals(java.lang.Object);
  public int hashCode();
  public int compareTo(net.minecraft.resources.Identifier);
  public java.lang.String toDebugFileName();
  public java.lang.String toLanguageKey();
  public java.lang.String toShortLanguageKey();
  public java.lang.String toShortString();
  public java.lang.String toLanguageKey(java.lang.String);
  public java.lang.String toLanguageKey(java.lang.String, java.lang.String);
  private static java.lang.String readGreedy(com.mojang.brigadier.StringReader);
  public static net.minecraft.resources.Identifier read(com.mojang.brigadier.StringReader) throws com.mojang.brigadier.exceptions.CommandSyntaxException;
  public static net.minecraft.resources.Identifier readNonEmpty(com.mojang.brigadier.StringReader) throws com.mojang.brigadier.exceptions.CommandSyntaxException;
  public static boolean isAllowedInIdentifier(char);
  public static boolean isValidPath(java.lang.String);
  public static boolean isValidNamespace(java.lang.String);
  private static java.lang.String assertValidNamespace(java.lang.String, java.lang.String);
  public static boolean validPathChar(char);
  private static boolean validNamespaceChar(char);
  private static java.lang.String assertValidPath(java.lang.String, java.lang.String);
  public int compareTo(java.lang.Object);
  private static java.lang.String method_49418(java.lang.String, net.minecraft.IdentifierException);
  static {};
}
```

## Probe task log

```

> Configure project :
Fabric Loom: 1.14.10

> Task :probeApi
Wrote /home/runner/work/F1Client/F1Client/build/probe-api.txt (137305 bytes; 498 classes matched)
gradle/actions: Writing build results to /home/runner/work/_temp/.gradle-actions/build-results/__run_2-1794644156257.json

[Incubating] Problems report is available at: file:///home/runner/work/F1Client/F1Client/build/reports/problems/problems-report.html

Deprecated Gradle features were used in this build, making it incompatible with Gradle 10.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/9.2.1/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.

BUILD SUCCESSFUL in 9s
1 actionable task: 1 executed
```

## Compile errors, with the symbol and location lines javac prints under each

```
15:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/OreESP.java:225: error: incompatible types: Double cannot be converted to float
16-		float width = (float) lineWidth.get();
17-		                                   ^
18:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/SoundESP.java:435: error: incompatible types: Double cannot be converted to float
19-		float width = (float) lineWidth.get();
20-		                                   ^
21:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:203: error: cannot find symbol
22-		if (!focused || !input.isValidChar()) {
23-		                      ^
24-  symbol:   method isValidChar()
25-  location: variable input of type CharacterEvent
26:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:206: error: cannot find symbol
27-		insert(input.asString());
28-		            ^
29-  symbol:   method asString()
30-  location: variable input of type CharacterEvent
31:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/hud/HudRenderer.java:140: error: cannot find symbol
32-		String dimensionName = mc.level.dimension().location().getPath();
33-		                                           ^
34-  symbol:   method location()
35-  location: class ResourceKey<Level>
36:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:68: error: incompatible types: Identifier cannot be converted to FontDescription
37-			styles[i] = Style.EMPTY.withFont(fontIds[i]);
38-			                                        ^
39-Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
40-6 errors
--
52:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/OreESP.java:225: error: incompatible types: Double cannot be converted to float
53-  		float width = (float) lineWidth.get();
54-  		                                   ^
55:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/SoundESP.java:435: error: incompatible types: Double cannot be converted to float
56-  		float width = (float) lineWidth.get();
57-  		                                   ^
58:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:68: error: incompatible types: Identifier cannot be converted to FontDescription
59-  			styles[i] = Style.EMPTY.withFont(fontIds[i]);
60-  			                                        ^
61-  Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
62:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:203: error: cannot find symbol
63-  		if (!focused || !input.isValidChar()) {
64-  		                      ^
65-    symbol:   method isValidChar()
66-    location: variable input of type CharacterEvent
67:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:206: error: cannot find symbol
68-  		insert(input.asString());
69-  		            ^
70-    symbol:   method asString()
71-    location: variable input of type CharacterEvent
72:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/hud/HudRenderer.java:140: error: cannot find symbol
73-  		String dimensionName = mc.level.dimension().location().getPath();
74-  		                                           ^
75-    symbol:   method location()
76-    location: class ResourceKey<Level>
--
119:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/OreESP.java:225: error: incompatible types: Double cannot be converted to float
120-		float width = (float) lineWidth.get();
121-		                                   ^
122:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/SoundESP.java:435: error: incompatible types: Double cannot be converted to float
123-		float width = (float) lineWidth.get();
124-		                                   ^
125:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:68: error: incompatible types: Identifier cannot be converted to FontDescription
126-			styles[i] = Style.EMPTY.withFont(fontIds[i]);
127-			                                        ^
128-Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
129:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:203: error: cannot find symbol
130-		if (!focused || !input.isValidChar()) {
131-		                      ^
132-  symbol:   method isValidChar()
133-  location: variable input of type CharacterEvent
134:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:206: error: cannot find symbol
135-		insert(input.asString());
136-		            ^
137-  symbol:   method asString()
138-  location: variable input of type CharacterEvent
139:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/hud/HudRenderer.java:140: error: cannot find symbol
140-		String dimensionName = mc.level.dimension().location().getPath();
141-		                                           ^
142-  symbol:   method location()
143-  location: class ResourceKey<Level>
```

## Gradle output (filtered)

```
14:> Task :compileJava
15:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/OreESP.java:225: error: incompatible types: Double cannot be converted to float
18:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/SoundESP.java:435: error: incompatible types: Double cannot be converted to float
21:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:203: error: cannot find symbol
26:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:206: error: cannot find symbol
31:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/hud/HudRenderer.java:140: error: cannot find symbol
36:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:68: error: incompatible types: Identifier cannot be converted to FontDescription
42:> Task :compileJava FAILED
47:FAILURE: Build failed with an exception.
49:* What went wrong:
50:Execution failed for task ':compileJava'.
52:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/OreESP.java:225: error: incompatible types: Double cannot be converted to float
55:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/SoundESP.java:435: error: incompatible types: Double cannot be converted to float
58:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:68: error: incompatible types: Identifier cannot be converted to FontDescription
62:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:203: error: cannot find symbol
67:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:206: error: cannot find symbol
72:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/hud/HudRenderer.java:140: error: cannot find symbol
84:org.gradle.api.tasks.TaskExecutionException: Execution failed for task ':compileJava'.
85:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.lambda$executeIfValid$1(ExecuteActionsTaskExecuter.java:135)
86:	at org.gradle.internal.Try$Failure.ifSuccessfulOrElse(Try.java:288)
87:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:133)
88:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:121)
89:	at org.gradle.api.internal.tasks.execution.ProblemsTaskPathTrackingTaskExecuter.execute(ProblemsTaskPathTrackingTaskExecuter.java:41)
90:	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
91:	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
92:	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
93:	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
94:	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
95:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
96:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
97:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
98:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:209)
99:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
100:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
101:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
102:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
103:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
104:	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
105:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
106:	at org.gradle.execution.plan.DefaultNodeExecutor.executeLocalTaskNode(DefaultNodeExecutor.java:55)
107:	at org.gradle.execution.plan.DefaultNodeExecutor.execute(DefaultNodeExecutor.java:34)
108:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:355)
109:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:343)
110:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.lambda$execute$0(DefaultTaskExecutionGraph.java:339)
111:	at org.gradle.internal.operations.CurrentBuildOperationRef.with(CurrentBuildOperationRef.java:84)
112:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:339)
113:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:328)
114:	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:459)
115:	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:376)
116:	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
117:	at org.gradle.internal.concurrent.AbstractManagedExecutor$1.run(AbstractManagedExecutor.java:47)
118:Caused by: org.gradle.api.internal.tasks.compile.CompilationFailedException: Compilation failed; see the compiler output below.
119:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/OreESP.java:225: error: incompatible types: Double cannot be converted to float
122:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/modules/SoundESP.java:435: error: incompatible types: Double cannot be converted to float
125:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:68: error: incompatible types: Identifier cannot be converted to FontDescription
129:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:203: error: cannot find symbol
134:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:206: error: cannot find symbol
139:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/hud/HudRenderer.java:140: error: cannot find symbol
145:	at org.gradle.api.internal.tasks.compile.JdkJavaCompiler.execute(JdkJavaCompiler.java:89)
146:	at org.gradle.api.internal.tasks.compile.JdkJavaCompiler.execute(JdkJavaCompiler.java:50)
147:	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.delegateAndHandleErrors(NormalizingJavaCompiler.java:98)
148:	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.execute(NormalizingJavaCompiler.java:52)
149:	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.execute(NormalizingJavaCompiler.java:38)
150:	at org.gradle.api.internal.tasks.compile.AnnotationProcessorDiscoveringCompiler.execute(AnnotationProcessorDiscoveringCompiler.java:52)
151:	at org.gradle.api.internal.tasks.compile.AnnotationProcessorDiscoveringCompiler.execute(AnnotationProcessorDiscoveringCompiler.java:38)
152:	at org.gradle.api.internal.tasks.compile.ModuleApplicationNameWritingCompiler.execute(ModuleApplicationNameWritingCompiler.java:46)
153:	at org.gradle.api.internal.tasks.compile.ModuleApplicationNameWritingCompiler.execute(ModuleApplicationNameWritingCompiler.java:36)
154:	at org.gradle.jvm.toolchain.internal.DefaultToolchainJavaCompiler.execute(DefaultToolchainJavaCompiler.java:57)
155:	at org.gradle.api.tasks.compile.JavaCompile.lambda$createToolchainCompiler$3(JavaCompile.java:206)
156:	at org.gradle.api.internal.tasks.compile.CleaningJavaCompiler.execute(CleaningJavaCompiler.java:53)
157:	at org.gradle.api.internal.tasks.compile.incremental.IncrementalCompilerFactory.lambda$createRebuildAllCompiler$0(IncrementalCompilerFactory.java:55)
158:	at org.gradle.api.internal.tasks.compile.incremental.SelectiveCompiler.execute(SelectiveCompiler.java:70)
159:	at org.gradle.api.internal.tasks.compile.incremental.SelectiveCompiler.execute(SelectiveCompiler.java:44)
160:	at org.gradle.api.internal.tasks.compile.incremental.IncrementalResultStoringCompiler.execute(IncrementalResultStoringCompiler.java:66)
161:	at org.gradle.api.internal.tasks.compile.incremental.IncrementalResultStoringCompiler.execute(IncrementalResultStoringCompiler.java:52)
162:	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler$1.call(CompileJavaBuildOperationReportingCompiler.java:64)
163:	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler$1.call(CompileJavaBuildOperationReportingCompiler.java:48)
164:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:209)
165:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
166:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
167:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
168:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
169:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
170:	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
171:	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler.execute(CompileJavaBuildOperationReportingCompiler.java:48)
172:	at org.gradle.api.tasks.compile.JavaCompile.performCompilation(JavaCompile.java:224)
173:	at org.gradle.api.tasks.compile.JavaCompile.performIncrementalCompilation(JavaCompile.java:165)
174:	at org.gradle.api.tasks.compile.JavaCompile.compile(JavaCompile.java:150)
175:	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
176:	at org.gradle.api.internal.project.taskfactory.IncrementalTaskAction.doExecute(IncrementalTaskAction.java:45)
177:	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
178:	at org.gradle.api.internal.project.taskfactory.IncrementalTaskAction.execute(IncrementalTaskAction.java:26)
179:	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
180:	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:252)
181:	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
182:	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
183:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
184:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
185:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
186:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
187:	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
188:	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:237)
189:	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:220)
190:	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:203)
191:	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:170)
192:	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
193:	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
194:	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
195:	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
196:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:209)
197:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
198:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
199:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
200:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
201:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
202:	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
203:	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
204:	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
205:	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:42)
206:	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:75)
207:	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
208:	at org.gradle.internal.execution.steps.PreCreateOutputParentsStep.execute(PreCreateOutputParentsStep.java:50)
209:	at org.gradle.internal.execution.steps.PreCreateOutputParentsStep.execute(PreCreateOutputParentsStep.java:28)
210:	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:68)
211:	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:38)
212:	at org.gradle.internal.execution.steps.BroadcastChangingOutputsStep.execute(BroadcastChangingOutputsStep.java:61)
213:	at org.gradle.internal.execution.steps.BroadcastChangingOutputsStep.execute(BroadcastChangingOutputsStep.java:26)
214:	at org.gradle.internal.execution.steps.CaptureOutputsAfterExecutionStep.execute(CaptureOutputsAfterExecutionStep.java:69)
215:	at org.gradle.internal.execution.steps.CaptureOutputsAfterExecutionStep.execute(CaptureOutputsAfterExecutionStep.java:46)
216:	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:39)
217:	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:28)
218:	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:189)
219:	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:75)
220:	at org.gradle.internal.Either$Right.fold(Either.java:176)
221:	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:62)
222:	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:73)
223:	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:48)
224:	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:46)
225:	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:35)
226:	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:75)
227:	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:53)
228:	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:53)
229:	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:35)
230:	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
231:	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
232:	at org.gradle.internal.execution.steps.ResolveIncrementalCachingStateStep.executeDelegate(ResolveIncrementalCachingStateStep.java:49)
233:	at org.gradle.internal.execution.steps.ResolveIncrementalCachingStateStep.executeDelegate(ResolveIncrementalCachingStateStep.java:27)
234:	at org.gradle.internal.execution.steps.AbstractResolveCachingStateStep.execute(AbstractResolveCachingStateStep.java:71)
235:	at org.gradle.internal.execution.steps.AbstractResolveCachingStateStep.execute(AbstractResolveCachingStateStep.java:39)
236:	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:64)
237:	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:35)
238:	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:62)
239:	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:40)
240:	at org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep.execute(AbstractCaptureStateBeforeExecutionStep.java:76)
241:	at org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep.execute(AbstractCaptureStateBeforeExecutionStep.java:45)
242:	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.executeWithNonEmptySources(AbstractSkipEmptyWorkStep.java:136)
243:	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.execute(AbstractSkipEmptyWorkStep.java:66)
244:	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.execute(AbstractSkipEmptyWorkStep.java:38)
245:	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
246:	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
247:	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
248:	at org.gradle.internal.execution.steps.HandleStaleOutputsStep.execute(HandleStaleOutputsStep.java:75)
249:	at org.gradle.internal.execution.steps.HandleStaleOutputsStep.execute(HandleStaleOutputsStep.java:41)
250:	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.lambda$execute$0(AssignMutableWorkspaceStep.java:35)
251:	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:297)
252:	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.execute(AssignMutableWorkspaceStep.java:31)
253:	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.execute(AssignMutableWorkspaceStep.java:22)
254:	at org.gradle.internal.execution.steps.ChoosePipelineStep.execute(ChoosePipelineStep.java:40)
255:	at org.gradle.internal.execution.steps.ChoosePipelineStep.execute(ChoosePipelineStep.java:23)
256:	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.lambda$execute$2(ExecuteWorkBuildOperationFiringStep.java:67)
257:	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.execute(ExecuteWorkBuildOperationFiringStep.java:67)
258:	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.execute(ExecuteWorkBuildOperationFiringStep.java:39)
259:	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:46)
260:	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:34)
261:	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:44)
262:	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:31)
263:	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
264:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:132)
274:BUILD FAILED in 36s
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

BUILD FAILED in 36s
1 actionable task: 1 executed
```
