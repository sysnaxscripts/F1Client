# Last build

Run: https://github.com/sysnaxscripts/F1Client/actions/runs/43574287701
Commit under test: 8f946510cd05e4a5540a0deef6ea1b524c6a31ed
Generated on: 2026-11-14T08:08:16Z

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

signatures of the first 10 dump matches:

=== com.mojang.blaze3d.platform.NativeImage   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "NativeImage.java"
public final class com.mojang.blaze3d.platform.NativeImage implements java.lang.AutoCloseable {
  private static final org.slf4j.Logger LOGGER;
  private static final com.mojang.jtracy.MemoryPool MEMORY_POOL;
  private static final java.util.Set<java.nio.file.StandardOpenOption> OPEN_OPTIONS;
  private final com.mojang.blaze3d.platform.NativeImage$Format format;
  private final int width;
  private final int height;
  private final boolean useStbFree;
  private long pixels;
  private final long size;
  public com.mojang.blaze3d.platform.NativeImage(int, int, boolean);
  public com.mojang.blaze3d.platform.NativeImage(com.mojang.blaze3d.platform.NativeImage$Format, int, int, boolean);
  public com.mojang.blaze3d.platform.NativeImage(com.mojang.blaze3d.platform.NativeImage$Format, int, int, boolean, long);
  public java.lang.String toString();
  private boolean isOutsideBounds(int, int);
  public static com.mojang.blaze3d.platform.NativeImage read(java.io.InputStream) throws java.io.IOException;
  public static com.mojang.blaze3d.platform.NativeImage read(com.mojang.blaze3d.platform.NativeImage$Format, java.io.InputStream) throws java.io.IOException;
  public static com.mojang.blaze3d.platform.NativeImage read(java.nio.ByteBuffer) throws java.io.IOException;
  public static com.mojang.blaze3d.platform.NativeImage read(byte[]) throws java.io.IOException;
  private static com.mojang.blaze3d.platform.NativeImage putAndRead(java.nio.ByteBuffer, byte[]) throws java.io.IOException;
  public static com.mojang.blaze3d.platform.NativeImage read(com.mojang.blaze3d.platform.NativeImage$Format, java.nio.ByteBuffer) throws java.io.IOException;
  private void checkAllocated();
  public void close();
  public int getWidth();
  public int getHeight();
  public com.mojang.blaze3d.platform.NativeImage$Format format();
  private int getPixelABGR(int, int);
  public int getPixel(int, int);
  public void setPixelABGR(int, int, int);
  public void setPixel(int, int, int);
  public com.mojang.blaze3d.platform.NativeImage mappedCopy(java.util.function.IntUnaryOperator);
  public int[] getPixelsABGR();
  public int[] getPixels();
  public byte getLuminanceOrAlpha(int, int);
  public int[] makePixelArray();
  public void writeToFile(java.io.File) throws java.io.IOException;
  public boolean copyFromFont(org.lwjgl.util.freetype.FT_Face, int);
  public void writeToFile(java.nio.file.Path) throws java.io.IOException;
  private boolean writeToChannel(java.nio.channels.WritableByteChannel) throws java.io.IOException;
  public void copyFrom(com.mojang.blaze3d.platform.NativeImage);
  public void fillRect(int, int, int, int, int);
  public void copyRect(int, int, int, int, int, int, boolean, boolean);
  public void copyRect(com.mojang.blaze3d.platform.NativeImage, int, int, int, int, int, int, boolean, boolean);
  public void resizeSubRectTo(int, int, int, int, com.mojang.blaze3d.platform.NativeImage);
  public void untrack();
  public long getPointer();
  static {};
}

=== com.mojang.blaze3d.platform.Window   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "Window.java"
public final class com.mojang.blaze3d.platform.Window implements java.lang.AutoCloseable {
  private static final org.slf4j.Logger LOGGER;
  public static final int BASE_WIDTH;
  public static final int BASE_HEIGHT;
  private final org.lwjgl.glfw.GLFWErrorCallback defaultErrorCallback;
  private final com.mojang.blaze3d.platform.WindowEventHandler eventHandler;
  private final com.mojang.blaze3d.platform.ScreenManager screenManager;
  private final long handle;
  private int windowedX;
  private int windowedY;
  private int windowedWidth;
  private int windowedHeight;
  private java.util.Optional<com.mojang.blaze3d.platform.VideoMode> preferredFullscreenVideoMode;
  private boolean fullscreen;
  private boolean actuallyFullscreen;
  private int x;
  private int y;
  private int width;
  private int height;
  private int framebufferWidth;
  private int framebufferHeight;
  private int guiScaledWidth;
  private int guiScaledHeight;
  private int guiScale;
  private java.lang.String errorSection;
  private boolean dirty;
  private boolean vsync;
  private boolean iconified;
  private boolean minimized;
  private boolean allowCursorChanges;
  private com.mojang.blaze3d.platform.cursor.CursorType currentCursor;
  public com.mojang.blaze3d.platform.Window(com.mojang.blaze3d.platform.WindowEventHandler, com.mojang.blaze3d.platform.ScreenManager, com.mojang.blaze3d.platform.DisplayData, java.lang.String, java.lang.String);
  public static java.lang.String getPlatform();
  public int getRefreshRate();
  public boolean shouldClose();
  public static void checkGlfwError(java.util.function.BiConsumer<java.lang.Integer, java.lang.String>);
  public void setIcon(net.minecraft.server.packs.PackResources, com.mojang.blaze3d.platform.IconSet) throws java.io.IOException;
  public void setErrorSection(java.lang.String);
  private void setBootErrorCallback();
  private static void bootCrash(int, long);
  public void defaultErrorCallback(int, long);
  public void setDefaultErrorCallback();
  public void updateVsync(boolean);
  public void close();
  private void onMove(long, int, int);
  private void onFramebufferResize(long, int, int);
  private void refreshFramebufferSize();
  private void onResize(long, int, int);
  private void onFocus(long, boolean);
  private void onEnter(long, boolean);
  private void onIconify(long, boolean);
  public void updateDisplay(com.mojang.blaze3d.TracyFrameCapture);
  public java.util.Optional<com.mojang.blaze3d.platform.VideoMode> getPreferredFullscreenVideoMode();
  public void setPreferredFullscreenVideoMode(java.util.Optional<com.mojang.blaze3d.platform.VideoMode>);
  public void changeFullscreenVideoMode();
  private void setMode();
  public void toggleFullScreen();
  public void setWindowed(int, int);
  private void updateFullscreen(boolean, com.mojang.blaze3d.TracyFrameCapture);
  public int calculateScale(int, boolean);
  public void setGuiScale(int);
  public void setTitle(java.lang.String);
  public long handle();
  public boolean isFullscreen();
  public boolean isIconified();
  public int getWidth();
  public int getHeight();
  public void setWidth(int);
  public void setHeight(int);
  public int getScreenWidth();
  public int getScreenHeight();
  public int getGuiScaledWidth();
  public int getGuiScaledHeight();
  public int getX();
  public int getY();
  public int getGuiScale();
  public com.mojang.blaze3d.platform.Monitor findBestMonitor();
  public void updateRawMouseInput(boolean);
  public void setWindowCloseCallback(java.lang.Runnable);
  public boolean isMinimized();
  public void setAllowCursorChanges(boolean);
  public void selectCursor(com.mojang.blaze3d.platform.cursor.CursorType);
  public float getAppropriateLineWidth();
  private static void method_61944(java.lang.Runnable, long);
  static {};
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

=== net.minecraft.client.gui.Gui   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "Gui.java"
public class net.minecraft.client.gui.Gui {
  private static final net.minecraft.resources.Identifier CROSSHAIR_SPRITE;
  private static final net.minecraft.resources.Identifier CROSSHAIR_ATTACK_INDICATOR_FULL_SPRITE;
  private static final net.minecraft.resources.Identifier CROSSHAIR_ATTACK_INDICATOR_BACKGROUND_SPRITE;
  private static final net.minecraft.resources.Identifier CROSSHAIR_ATTACK_INDICATOR_PROGRESS_SPRITE;
  private static final net.minecraft.resources.Identifier EFFECT_BACKGROUND_AMBIENT_SPRITE;
  private static final net.minecraft.resources.Identifier EFFECT_BACKGROUND_SPRITE;
  private static final net.minecraft.resources.Identifier HOTBAR_SPRITE;
  private static final net.minecraft.resources.Identifier HOTBAR_SELECTION_SPRITE;
  private static final net.minecraft.resources.Identifier HOTBAR_OFFHAND_LEFT_SPRITE;
  private static final net.minecraft.resources.Identifier HOTBAR_OFFHAND_RIGHT_SPRITE;
  private static final net.minecraft.resources.Identifier HOTBAR_ATTACK_INDICATOR_BACKGROUND_SPRITE;
  private static final net.minecraft.resources.Identifier HOTBAR_ATTACK_INDICATOR_PROGRESS_SPRITE;
  private static final net.minecraft.resources.Identifier ARMOR_EMPTY_SPRITE;
  private static final net.minecraft.resources.Identifier ARMOR_HALF_SPRITE;
  private static final net.minecraft.resources.Identifier ARMOR_FULL_SPRITE;
  private static final net.minecraft.resources.Identifier FOOD_EMPTY_HUNGER_SPRITE;
  private static final net.minecraft.resources.Identifier FOOD_HALF_HUNGER_SPRITE;
  private static final net.minecraft.resources.Identifier FOOD_FULL_HUNGER_SPRITE;
  private static final net.minecraft.resources.Identifier FOOD_EMPTY_SPRITE;
  private static final net.minecraft.resources.Identifier FOOD_HALF_SPRITE;
  private static final net.minecraft.resources.Identifier FOOD_FULL_SPRITE;
  private static final net.minecraft.resources.Identifier AIR_SPRITE;
  private static final net.minecraft.resources.Identifier AIR_POPPING_SPRITE;
  private static final net.minecraft.resources.Identifier AIR_EMPTY_SPRITE;
  private static final net.minecraft.resources.Identifier HEART_VEHICLE_CONTAINER_SPRITE;
  private static final net.minecraft.resources.Identifier HEART_VEHICLE_FULL_SPRITE;
  private static final net.minecraft.resources.Identifier HEART_VEHICLE_HALF_SPRITE;
  private static final net.minecraft.resources.Identifier VIGNETTE_LOCATION;
  public static final net.minecraft.resources.Identifier NAUSEA_LOCATION;
  private static final net.minecraft.resources.Identifier SPYGLASS_SCOPE_LOCATION;
  private static final net.minecraft.resources.Identifier POWDER_SNOW_OUTLINE_LOCATION;
  private static final java.util.Comparator<net.minecraft.world.scores.PlayerScoreEntry> SCORE_DISPLAY_ORDER;
  private static final net.minecraft.network.chat.Component DEMO_EXPIRED_TEXT;
  private static final net.minecraft.network.chat.Component SAVING_TEXT;
  private static final float MIN_CROSSHAIR_ATTACK_SPEED;
  private static final int EXPERIENCE_BAR_DISPLAY_TICKS;
  private static final int NUM_HEARTS_PER_ROW;
  private static final int LINE_HEIGHT;
  private static final java.lang.String SPACER;
  private static final float PORTAL_OVERLAY_ALPHA_MIN;
  private static final int HEART_SIZE;
  private static final int HEART_SEPARATION;
  private static final int NUM_AIR_BUBBLES;
  private static final int AIR_BUBBLE_SIZE;
  private static final int AIR_BUBBLE_SEPERATION;
  private static final int AIR_BUBBLE_POPPING_DURATION;
  private static final int EMPTY_AIR_BUBBLE_DELAY_DURATION;
  private static final float AIR_BUBBLE_POP_SOUND_VOLUME_BASE;
  private static final float AIR_BUBBLE_POP_SOUND_VOLUME_INCREMENT;
  private static final float AIR_BUBBLE_POP_SOUND_PITCH_BASE;
  private static final float AIR_BUBBLE_POP_SOUND_PITCH_INCREMENT;
  private static final int NUM_AIR_BUBBLE_POPPED_BEFORE_SOUND_VOLUME_INCREASE;
  private static final int NUM_AIR_BUBBLE_POPPED_BEFORE_SOUND_PITCH_INCREASE;
  private static final float AUTOSAVE_FADE_SPEED_FACTOR;
  private static final int SAVING_INDICATOR_WIDTH_PADDING_RIGHT;
  private static final int SAVING_INDICATOR_HEIGHT_PADDING_BOTTOM;
  private final net.minecraft.util.RandomSource random;
  private final net.minecraft.client.Minecraft minecraft;
  private final net.minecraft.client.gui.components.ChatComponent chat;
  private int tickCount;
  private net.minecraft.network.chat.Component overlayMessageString;
  private int overlayMessageTime;
  private boolean animateOverlayMessageColor;
  private boolean chatDisabledByPlayerShown;
  public float vignetteBrightness;
  private int toolHighlightTimer;
  private net.minecraft.world.item.ItemStack lastToolHighlight;
  private final net.minecraft.client.gui.components.DebugScreenOverlay debugOverlay;
  private final net.minecraft.client.gui.components.SubtitleOverlay subtitleOverlay;
  private final net.minecraft.client.gui.components.spectator.SpectatorGui spectatorGui;
  private final net.minecraft.client.gui.components.PlayerTabOverlay tabList;
  private final net.minecraft.client.gui.components.BossHealthOverlay bossOverlay;
  private int titleTime;
  private net.minecraft.network.chat.Component title;
  private net.minecraft.network.chat.Component subtitle;
  private int titleFadeInTime;
  private int titleStayTime;
  private int titleFadeOutTime;
  private int lastHealth;
  private int displayHealth;
  private long lastHealthTime;
  private long healthBlinkTime;
  private int lastBubblePopSoundPlayed;
  private java.lang.Runnable deferredSubtitles;
  private float autosaveIndicatorValue;
  private float lastAutosaveIndicatorValue;
  private org.apache.commons.lang3.tuple.Pair<net.minecraft.client.gui.Gui$ContextualInfo, net.minecraft.client.gui.contextualbar.ContextualBarRenderer> contextualInfoBar;
  private final java.util.Map<net.minecraft.client.gui.Gui$ContextualInfo, java.util.function.Supplier<net.minecraft.client.gui.contextualbar.ContextualBarRenderer>> contextualInfoBarRenderers;
  private float scopeScale;
  public net.minecraft.client.gui.Gui(net.minecraft.client.Minecraft);
  public void resetTitleTimes();
  public void render(net.minecraft.client.gui.GuiGraphics, net.minecraft.client.DeltaTracker);
  private void renderBossOverlay(net.minecraft.client.gui.GuiGraphics, net.minecraft.client.DeltaTracker);
  public void renderDebugOverlay(net.minecraft.client.gui.GuiGraphics);
  private void renderSubtitleOverlay(net.minecraft.client.gui.GuiGraphics, boolean);
  public void renderDeferredSubtitles();
  private void renderCameraOverlays(net.minecraft.client.gui.GuiGraphics, net.minecraft.client.DeltaTracker);
  private void renderSleepOverlay(net.minecraft.client.gui.GuiGraphics, net.minecraft.client.DeltaTracker);
  private void renderOverlayMessage(net.minecraft.client.gui.GuiGraphics, net.minecraft.client.DeltaTracker);
  private void renderTitle(net.minecraft.client.gui.GuiGraphics, net.minecraft.client.DeltaTracker);
  private void renderChat(net.minecraft.client.gui.GuiGraphics, net.minecraft.client.DeltaTracker);
  private void renderScoreboardSidebar(net.minecraft.client.gui.GuiGraphics, net.minecraft.client.DeltaTracker);
  private void renderTabList(net.minecraft.client.gui.GuiGraphics, net.minecraft.client.DeltaTracker);
  private void renderCrosshair(net.minecraft.client.gui.GuiGraphics, net.minecraft.client.DeltaTracker);
  private boolean canRenderCrosshairForSpectator(net.minecraft.world.phys.HitResult);
  private void renderEffects(net.minecraft.client.gui.GuiGraphics, net.minecraft.client.DeltaTracker);
  public static net.minecraft.resources.Identifier getMobEffectSprite(net.minecraft.core.Holder<net.minecraft.world.effect.MobEffect>);
  private void renderHotbarAndDecorations(net.minecraft.client.gui.GuiGraphics, net.minecraft.client.DeltaTracker);
  private void renderItemHotbar(net.minecraft.client.gui.GuiGraphics, net.minecraft.client.DeltaTracker);
  private void renderSelectedItemName(net.minecraft.client.gui.GuiGraphics);
  private void renderDemoOverlay(net.minecraft.client.gui.GuiGraphics, net.minecraft.client.DeltaTracker);
  private void displayScoreboardSidebar(net.minecraft.client.gui.GuiGraphics, net.minecraft.world.scores.Objective);
  private net.minecraft.world.entity.player.Player getCameraPlayer();
  private net.minecraft.world.entity.LivingEntity getPlayerVehicleWithHealth();
  private int getVehicleMaxHearts(net.minecraft.world.entity.LivingEntity);
  private int getVisibleVehicleHeartRows(int);
  private void renderPlayerHealth(net.minecraft.client.gui.GuiGraphics);
  private static void renderArmor(net.minecraft.client.gui.GuiGraphics, net.minecraft.world.entity.player.Player, int, int, int, int);
  private void renderHearts(net.minecraft.client.gui.GuiGraphics, net.minecraft.world.entity.player.Player, int, int, int, int, float, int, int, int, boolean);
  private void renderHeart(net.minecraft.client.gui.GuiGraphics, net.minecraft.client.gui.Gui$HeartType, int, int, boolean, boolean, boolean);
  private void renderAirBubbles(net.minecraft.client.gui.GuiGraphics, net.minecraft.world.entity.player.Player, int, int, int);
  private int getAirBubbleYLine(int, int);
  private static int getCurrentAirSupplyBubble(int, int, int);
  private static int getEmptyBubbleDelayDuration(int, boolean);
  private void playAirBubblePoppedSound(int, net.minecraft.world.entity.player.Player, int);
  private void renderFood(net.minecraft.client.gui.GuiGraphics, net.minecraft.world.entity.player.Player, int, int);
  private void renderVehicleHealth(net.minecraft.client.gui.GuiGraphics);
  private void renderTextureOverlay(net.minecraft.client.gui.GuiGraphics, net.minecraft.resources.Identifier, float);
  private void renderSpyglassOverlay(net.minecraft.client.gui.GuiGraphics, float);
  private void updateVignetteBrightness(net.minecraft.world.entity.Entity);
  private void renderVignette(net.minecraft.client.gui.GuiGraphics, net.minecraft.world.entity.Entity);
  private void renderPortalOverlay(net.minecraft.client.gui.GuiGraphics, float);
  private void renderConfusionOverlay(net.minecraft.client.gui.GuiGraphics, float);
  private void renderSlot(net.minecraft.client.gui.GuiGraphics, int, int, net.minecraft.client.DeltaTracker, net.minecraft.world.entity.player.Player, net.minecraft.world.item.ItemStack, int);
  public void tick(boolean);
  private void tick();
  private void tickAutosaveIndicator();
  public void setNowPlaying(net.minecraft.network.chat.Component);
  public void setOverlayMessage(net.minecraft.network.chat.Component, boolean);
  public void setChatDisabledByPlayerShown(boolean);
  public boolean isShowingChatDisabledByPlayer();
  public void setTimes(int, int, int);
  public void setSubtitle(net.minecraft.network.chat.Component);
  public void setTitle(net.minecraft.network.chat.Component);
  public void clearTitles();
  public net.minecraft.client.gui.components.ChatComponent getChat();
  public int getGuiTicks();
  public net.minecraft.client.gui.Font getFont();
  public net.minecraft.client.gui.components.spectator.SpectatorGui getSpectatorGui();
  public net.minecraft.client.gui.components.PlayerTabOverlay getTabList();
  public void onDisconnected();
  public net.minecraft.client.gui.components.BossHealthOverlay getBossOverlay();
  public net.minecraft.client.gui.components.DebugScreenOverlay getDebugOverlay();
  public void clearCache();
  public void renderSavingIndicator(net.minecraft.client.gui.GuiGraphics, net.minecraft.client.DeltaTracker);
  private boolean willPrioritizeExperienceInfo();
  private boolean willPrioritizeJumpInfo();
  private net.minecraft.client.gui.Gui$ContextualInfo nextContextualInfoState();
  private static net.minecraft.client.gui.Gui$1DisplayEntry[] method_55441(int);
  private net.minecraft.client.gui.Gui$1DisplayEntry method_55439(net.minecraft.world.scores.Scoreboard, net.minecraft.network.chat.numbers.NumberFormat, net.minecraft.world.scores.PlayerScoreEntry);
  private static boolean method_1751(net.minecraft.world.scores.PlayerScoreEntry);
  private static net.minecraft.resources.Identifier method_71643(net.minecraft.resources.Identifier);
  private static java.lang.String method_65023(java.lang.String);
  private void method_72739(net.minecraft.client.gui.GuiGraphics);
  private static net.minecraft.client.gui.contextualbar.ContextualBarRenderer method_70832(net.minecraft.client.Minecraft);
  private static net.minecraft.client.gui.contextualbar.ContextualBarRenderer method_70835(net.minecraft.client.Minecraft);
  private static net.minecraft.client.gui.contextualbar.ContextualBarRenderer method_70836(net.minecraft.client.Minecraft);
  private static net.minecraft.client.gui.contextualbar.ContextualBarRenderer method_70843();
  static {};
}

=== net.minecraft.client.gui.GuiGraphics   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "GuiGraphics.java"
public class net.minecraft.client.gui.GuiGraphics {
  private static final int EXTRA_SPACE_AFTER_FIRST_TOOLTIP_LINE;
  final net.minecraft.client.Minecraft minecraft;
  private final org.joml.Matrix3x2fStack pose;
  public final net.minecraft.client.gui.GuiGraphics$ScissorStack scissorStack;
  private final net.minecraft.client.resources.model.MaterialSet materials;
  private final net.minecraft.client.renderer.texture.TextureAtlas guiSprites;
  public final net.minecraft.client.gui.render.state.GuiRenderState guiRenderState;
  private com.mojang.blaze3d.platform.cursor.CursorType pendingCursor;
  final int mouseX;
  final int mouseY;
  private java.lang.Runnable deferredTooltip;
  net.minecraft.network.chat.Style hoveredTextStyle;
  net.minecraft.network.chat.Style clickableTextStyle;
  private net.minecraft.client.gui.GuiGraphics(net.minecraft.client.Minecraft, org.joml.Matrix3x2fStack, net.minecraft.client.gui.render.state.GuiRenderState, int, int);
  public net.minecraft.client.gui.GuiGraphics(net.minecraft.client.Minecraft, net.minecraft.client.gui.render.state.GuiRenderState, int, int);
  public void requestCursor(com.mojang.blaze3d.platform.cursor.CursorType);
  public void applyCursor(com.mojang.blaze3d.platform.Window);
  public int guiWidth();
  public int guiHeight();
  public void nextStratum();
  public void blurBeforeThisStratum();
  public org.joml.Matrix3x2fStack pose();
  public void hLine(int, int, int, int);
  public void vLine(int, int, int, int);
  public void enableScissor(int, int, int, int);
  public void disableScissor();
  public boolean containsPointInScissor(int, int);
  public void fill(int, int, int, int, int);
  public void fill(com.mojang.blaze3d.pipeline.RenderPipeline, int, int, int, int, int);
  public void fillGradient(int, int, int, int, int, int);
  public void fill(com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.client.gui.render.TextureSetup, int, int, int, int);
  private void submitColoredRectangle(com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.client.gui.render.TextureSetup, int, int, int, int, int, java.lang.Integer);
  public void textHighlight(int, int, int, int, boolean);
  public void drawCenteredString(net.minecraft.client.gui.Font, java.lang.String, int, int, int);
  public void drawCenteredString(net.minecraft.client.gui.Font, net.minecraft.network.chat.Component, int, int, int);
  public void drawCenteredString(net.minecraft.client.gui.Font, net.minecraft.util.FormattedCharSequence, int, int, int);
  public void drawString(net.minecraft.client.gui.Font, java.lang.String, int, int, int);
  public void drawString(net.minecraft.client.gui.Font, java.lang.String, int, int, int, boolean);
  public void drawString(net.minecraft.client.gui.Font, net.minecraft.util.FormattedCharSequence, int, int, int);
  public void drawString(net.minecraft.client.gui.Font, net.minecraft.util.FormattedCharSequence, int, int, int, boolean);
  public void drawString(net.minecraft.client.gui.Font, net.minecraft.network.chat.Component, int, int, int);
  public void drawString(net.minecraft.client.gui.Font, net.minecraft.network.chat.Component, int, int, int, boolean);
  public void drawWordWrap(net.minecraft.client.gui.Font, net.minecraft.network.chat.FormattedText, int, int, int, int);
  public void drawWordWrap(net.minecraft.client.gui.Font, net.minecraft.network.chat.FormattedText, int, int, int, int, boolean);
  public void drawStringWithBackdrop(net.minecraft.client.gui.Font, net.minecraft.network.chat.Component, int, int, int, int);
  public void renderOutline(int, int, int, int, int);
  public void blitSprite(com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.resources.Identifier, int, int, int, int);
  public void blitSprite(com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.resources.Identifier, int, int, int, int, float);
  private static net.minecraft.client.resources.metadata.gui.GuiSpriteScaling getSpriteScaling(net.minecraft.client.renderer.texture.TextureAtlasSprite);
  public void blitSprite(com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.resources.Identifier, int, int, int, int, int);
  public void blitSprite(com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.resources.Identifier, int, int, int, int, int, int, int, int);
  public void blitSprite(com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.resources.Identifier, int, int, int, int, int, int, int, int, int);
  public void blitSprite(com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.client.renderer.texture.TextureAtlasSprite, int, int, int, int);
  public void blitSprite(com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.client.renderer.texture.TextureAtlasSprite, int, int, int, int, int);
  private void blitSprite(com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.client.renderer.texture.TextureAtlasSprite, int, int, int, int, int, int, int, int, int);
  private void blitNineSlicedSprite(com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.client.renderer.texture.TextureAtlasSprite, net.minecraft.client.resources.metadata.gui.GuiSpriteScaling$NineSlice, int, int, int, int, int);
  private void blitNineSliceInnerSegment(com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.client.resources.metadata.gui.GuiSpriteScaling$NineSlice, net.minecraft.client.renderer.texture.TextureAtlasSprite, int, int, int, int, int, int, int, int, int, int, int);
  private void blitTiledSprite(com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.client.renderer.texture.TextureAtlasSprite, int, int, int, int, int, int, int, int, int, int, int);
  public void blit(com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.resources.Identifier, int, int, float, float, int, int, int, int, int);
  public void blit(com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.resources.Identifier, int, int, float, float, int, int, int, int);
  public void blit(com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.resources.Identifier, int, int, float, float, int, int, int, int, int, int);
  public void blit(com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.resources.Identifier, int, int, float, float, int, int, int, int, int, int, int);
  public void blit(net.minecraft.resources.Identifier, int, int, int, int, float, float, float, float);
  private void innerBlit(com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.resources.Identifier, int, int, int, int, float, float, float, float, int);
  private void submitBlit(com.mojang.blaze3d.pipeline.RenderPipeline, com.mojang.blaze3d.textures.GpuTextureView, com.mojang.blaze3d.textures.GpuSampler, int, int, int, int, float, float, float, float, int);
  private void submitTiledBlit(com.mojang.blaze3d.pipeline.RenderPipeline, com.mojang.blaze3d.textures.GpuTextureView, com.mojang.blaze3d.textures.GpuSampler, int, int, int, int, int, int, float, float, float, float, int);
  public void renderItem(net.minecraft.world.item.ItemStack, int, int);
  public void renderItem(net.minecraft.world.item.ItemStack, int, int, int);
  public void renderFakeItem(net.minecraft.world.item.ItemStack, int, int);
  public void renderFakeItem(net.minecraft.world.item.ItemStack, int, int, int);
  public void renderItem(net.minecraft.world.entity.LivingEntity, net.minecraft.world.item.ItemStack, int, int, int);
  private void renderItem(net.minecraft.world.entity.LivingEntity, net.minecraft.world.level.Level, net.minecraft.world.item.ItemStack, int, int, int);
  public void renderItemDecorations(net.minecraft.client.gui.Font, net.minecraft.world.item.ItemStack, int, int);
  public void renderItemDecorations(net.minecraft.client.gui.Font, net.minecraft.world.item.ItemStack, int, int, java.lang.String);
  public void setTooltipForNextFrame(net.minecraft.network.chat.Component, int, int);
  public void setTooltipForNextFrame(java.util.List<net.minecraft.util.FormattedCharSequence>, int, int);
  public void setTooltipForNextFrame(net.minecraft.client.gui.Font, net.minecraft.world.item.ItemStack, int, int);
  public void setTooltipForNextFrame(net.minecraft.client.gui.Font, java.util.List<net.minecraft.network.chat.Component>, java.util.Optional<net.minecraft.world.inventory.tooltip.TooltipComponent>, int, int);
  public void setTooltipForNextFrame(net.minecraft.client.gui.Font, java.util.List<net.minecraft.network.chat.Component>, java.util.Optional<net.minecraft.world.inventory.tooltip.TooltipComponent>, int, int, net.minecraft.resources.Identifier);
  public void setTooltipForNextFrame(net.minecraft.client.gui.Font, net.minecraft.network.chat.Component, int, int);
  public void setTooltipForNextFrame(net.minecraft.client.gui.Font, net.minecraft.network.chat.Component, int, int, net.minecraft.resources.Identifier);
  public void setComponentTooltipForNextFrame(net.minecraft.client.gui.Font, java.util.List<net.minecraft.network.chat.Component>, int, int);
  public void setComponentTooltipForNextFrame(net.minecraft.client.gui.Font, java.util.List<net.minecraft.network.chat.Component>, int, int, net.minecraft.resources.Identifier);
  public void setTooltipForNextFrame(net.minecraft.client.gui.Font, java.util.List<? extends net.minecraft.util.FormattedCharSequence>, int, int);
  public void setTooltipForNextFrame(net.minecraft.client.gui.Font, java.util.List<? extends net.minecraft.util.FormattedCharSequence>, int, int, net.minecraft.resources.Identifier);
  public void setTooltipForNextFrame(net.minecraft.client.gui.Font, java.util.List<net.minecraft.util.FormattedCharSequence>, net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipPositioner, int, int, boolean);
  private void setTooltipForNextFrameInternal(net.minecraft.client.gui.Font, java.util.List<net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent>, int, int, net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipPositioner, net.minecraft.resources.Identifier, boolean);
  public void renderTooltip(net.minecraft.client.gui.Font, java.util.List<net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent>, int, int, net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipPositioner, net.minecraft.resources.Identifier);
  public void renderDeferredElements();
  private void renderItemBar(net.minecraft.world.item.ItemStack, int, int);
  private void renderItemCount(net.minecraft.client.gui.Font, net.minecraft.world.item.ItemStack, int, int, java.lang.String);
  private void renderItemCooldown(net.minecraft.world.item.ItemStack, int, int);
  public void renderComponentHoverEffect(net.minecraft.client.gui.Font, net.minecraft.network.chat.Style, int, int);
  public void submitMapRenderState(net.minecraft.client.renderer.state.MapRenderState);
  public void submitEntityRenderState(net.minecraft.client.renderer.entity.state.EntityRenderState, float, org.joml.Vector3f, org.joml.Quaternionf, org.joml.Quaternionf, int, int, int, int);
  public void submitSkinRenderState(net.minecraft.client.model.player.PlayerModel, net.minecraft.resources.Identifier, float, float, float, float, int, int, int, int);
  public void submitBookModelRenderState(net.minecraft.client.model.object.book.BookModel, net.minecraft.resources.Identifier, float, float, float, int, int, int, int);
  public void submitBannerPatternRenderState(net.minecraft.client.model.object.banner.BannerFlagModel, net.minecraft.world.item.DyeColor, net.minecraft.world.level.block.entity.BannerPatternLayers, int, int, int, int);
  public void submitSignRenderState(net.minecraft.client.model.Model$Simple, float, net.minecraft.world.level.block.state.properties.WoodType, int, int, int, int);
  public void submitProfilerChartRenderState(java.util.List<net.minecraft.util.profiling.ResultField>, int, int, int, int);
  public net.minecraft.client.renderer.texture.TextureAtlasSprite getSprite(net.minecraft.client.resources.model.Material);
  public net.minecraft.client.gui.ActiveTextCollector textRendererForWidget(net.minecraft.client.gui.components.AbstractWidget, net.minecraft.client.gui.GuiGraphics$HoveredTextEffects);
  public net.minecraft.client.gui.ActiveTextCollector textRenderer();
  public net.minecraft.client.gui.ActiveTextCollector textRenderer(net.minecraft.client.gui.GuiGraphics$HoveredTextEffects);
  public net.minecraft.client.gui.ActiveTextCollector textRenderer(net.minecraft.client.gui.GuiGraphics$HoveredTextEffects, java.util.function.Consumer<net.minecraft.network.chat.Style>);
  private net.minecraft.client.gui.ActiveTextCollector$Parameters createDefaultTextParameters(float);
  private void method_71277(net.minecraft.client.gui.Font, java.util.List, int, int, net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipPositioner, net.minecraft.resources.Identifier);
  private static void method_71275(java.util.List, net.minecraft.world.inventory.tooltip.TooltipComponent);
  private static java.lang.String method_57708(net.minecraft.world.item.ItemStack) throws java.lang.Exception;
  private static java.lang.String method_51449(net.minecraft.world.item.ItemStack) throws java.lang.Exception;
  private static java.lang.String method_51451(net.minecraft.world.item.ItemStack) throws java.lang.Exception;
}

=== net.minecraft.client.gui.screens.Screen   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "Screen.java"
public abstract class net.minecraft.client.gui.screens.Screen extends net.minecraft.client.gui.components.events.AbstractContainerEventHandler implements net.minecraft.client.gui.components.Renderable {
  private static final org.slf4j.Logger LOGGER;
  private static final net.minecraft.network.chat.Component USAGE_NARRATION;
  public static final net.minecraft.resources.Identifier MENU_BACKGROUND;
  public static final net.minecraft.resources.Identifier HEADER_SEPARATOR;
  public static final net.minecraft.resources.Identifier FOOTER_SEPARATOR;
  private static final net.minecraft.resources.Identifier INWORLD_MENU_BACKGROUND;
  public static final net.minecraft.resources.Identifier INWORLD_HEADER_SEPARATOR;
  public static final net.minecraft.resources.Identifier INWORLD_FOOTER_SEPARATOR;
  protected static final float FADE_IN_TIME;
  protected final net.minecraft.network.chat.Component title;
  private final java.util.List<net.minecraft.client.gui.components.events.GuiEventListener> children;
  private final java.util.List<net.minecraft.client.gui.narration.NarratableEntry> narratables;
  protected final net.minecraft.client.Minecraft minecraft;
  private boolean initialized;
  public int width;
  public int height;
  private final java.util.List<net.minecraft.client.gui.components.Renderable> renderables;
  protected final net.minecraft.client.gui.Font font;
  private static final long NARRATE_SUPPRESS_AFTER_INIT_TIME;
  private static final long NARRATE_DELAY_NARRATOR_ENABLED;
  private static final long NARRATE_DELAY_MOUSE_MOVE;
  private static final long NARRATE_DELAY_MOUSE_ACTION;
  private static final long NARRATE_DELAY_KEYBOARD_ACTION;
  private final net.minecraft.client.gui.narration.ScreenNarrationCollector narrationState;
  private long narrationSuppressTime;
  private long nextNarrationTime;
  protected net.minecraft.client.gui.components.CycleButton<net.minecraft.client.NarratorStatus> narratorButton;
  private net.minecraft.client.gui.narration.NarratableEntry lastNarratable;
  protected final java.util.concurrent.Executor screenExecutor;
  protected net.minecraft.client.gui.screens.Screen(net.minecraft.network.chat.Component);
  protected net.minecraft.client.gui.screens.Screen(net.minecraft.client.Minecraft, net.minecraft.client.gui.Font, net.minecraft.network.chat.Component);
  public net.minecraft.network.chat.Component getTitle();
  public net.minecraft.network.chat.Component getNarrationMessage();
  public final void renderWithTooltipAndSubtitles(net.minecraft.client.gui.GuiGraphics, int, int, float);
  public void render(net.minecraft.client.gui.GuiGraphics, int, int, float);
  public boolean keyPressed(net.minecraft.client.input.KeyEvent);
  private net.minecraft.client.gui.navigation.FocusNavigationEvent$TabNavigation createTabEvent(boolean);
  private net.minecraft.client.gui.navigation.FocusNavigationEvent$ArrowNavigation createArrowEvent(net.minecraft.client.gui.navigation.ScreenDirection);
  protected void setInitialFocus();
  protected void setInitialFocus(net.minecraft.client.gui.components.events.GuiEventListener);
  public void clearFocus();
  protected void changeFocus(net.minecraft.client.gui.ComponentPath);
  public boolean shouldCloseOnEsc();
  public void onClose();
  protected <T extends net.minecraft.client.gui.components.events.GuiEventListener & net.minecraft.client.gui.components.Renderable & net.minecraft.client.gui.narration.NarratableEntry> T addRenderableWidget(T);
  protected <T extends net.minecraft.client.gui.components.Renderable> T addRenderableOnly(T);
  protected <T extends net.minecraft.client.gui.components.events.GuiEventListener & net.minecraft.client.gui.narration.NarratableEntry> T addWidget(T);
  protected void removeWidget(net.minecraft.client.gui.components.events.GuiEventListener);
  protected void clearWidgets();
  public static java.util.List<net.minecraft.network.chat.Component> getTooltipFromItem(net.minecraft.client.Minecraft, net.minecraft.world.item.ItemStack);
  protected void insertText(java.lang.String, boolean);
  protected static void defaultHandleGameClickEvent(net.minecraft.network.chat.ClickEvent, net.minecraft.client.Minecraft, net.minecraft.client.gui.screens.Screen);
  protected static void defaultHandleClickEvent(net.minecraft.network.chat.ClickEvent, net.minecraft.client.Minecraft, net.minecraft.client.gui.screens.Screen);
  protected static boolean clickUrlAction(net.minecraft.client.Minecraft, net.minecraft.client.gui.screens.Screen, java.net.URI);
  protected static void clickCommandAction(net.minecraft.client.player.LocalPlayer, java.lang.String, net.minecraft.client.gui.screens.Screen);
  public final void init(int, int);
  protected void rebuildWidgets();
  protected void fadeWidgets(float);
  public java.util.List<? extends net.minecraft.client.gui.components.events.GuiEventListener> children();
  protected void init();
  public void tick();
  public void removed();
  public void added();
  public void renderBackground(net.minecraft.client.gui.GuiGraphics, int, int, float);
  protected void renderBlurredBackground(net.minecraft.client.gui.GuiGraphics);
  protected void renderPanorama(net.minecraft.client.gui.GuiGraphics, float);
  protected void renderMenuBackground(net.minecraft.client.gui.GuiGraphics);
  protected void renderMenuBackground(net.minecraft.client.gui.GuiGraphics, int, int, int, int);
  public static void renderMenuBackgroundTexture(net.minecraft.client.gui.GuiGraphics, net.minecraft.resources.Identifier, int, int, float, float, int, int);
  public void renderTransparentBackground(net.minecraft.client.gui.GuiGraphics);
  public boolean isPauseScreen();
  public boolean isInGameUi();
  protected boolean panoramaShouldSpin();
  public boolean isAllowedInPortal();
  protected void repositionElements();
  public void resize(int, int);
  public void fillCrashDetails(net.minecraft.CrashReport);
  protected boolean isValidCharacterForName(java.lang.String, int, int);
  public boolean isMouseOver(double, double);
  public void onFilesDrop(java.util.List<java.nio.file.Path>);
  private void scheduleNarration(long, boolean);
  private void suppressNarration(long);
  private void setNarrationSuppressTime(long);
  public void afterMouseMove();
  public void afterMouseAction();
  public void afterKeyboardAction();
  private boolean shouldRunNarration();
  public void handleDelayedNarration();
  public void triggerImmediateNarration(boolean);
  private void runNarration(boolean);
  protected boolean shouldNarrateNavigation();
  protected void updateNarrationState(net.minecraft.client.gui.narration.NarrationElementOutput);
  protected void updateNarratedWidget(net.minecraft.client.gui.narration.NarrationElementOutput);
  protected net.minecraft.network.chat.Component getUsageNarration();
  public static net.minecraft.client.gui.screens.Screen$NarratableSearchResult findNarratableWidget(java.util.List<? extends net.minecraft.client.gui.narration.NarratableEntry>, net.minecraft.client.gui.narration.NarratableEntry);
  public void updateNarratorStatus(boolean);
  public net.minecraft.client.gui.Font getFont();
  public boolean showsActiveEffects();
  public boolean canInterruptWithAnotherScreen();
  public net.minecraft.client.gui.navigation.ScreenRectangle getRectangle();
  public net.minecraft.sounds.Music getBackgroundMusic();
  private static java.util.stream.Stream method_65517(net.minecraft.client.gui.narration.NarratableEntry);
  private java.lang.String method_65026() throws java.lang.Exception;
  private static void method_71845(java.net.URI, net.minecraft.client.Minecraft, net.minecraft.client.gui.screens.Screen, boolean);
  private void method_75366(net.minecraft.client.Minecraft, java.lang.Runnable);
  private void method_75367(net.minecraft.client.Minecraft, java.lang.Runnable);
  static {};
}

=== net.minecraft.client.renderer.RenderPipelines   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "RenderPipelines.java"
public class net.minecraft.client.renderer.RenderPipelines {
  private static final java.util.Map<net.minecraft.resources.Identifier, com.mojang.blaze3d.pipeline.RenderPipeline> PIPELINES_BY_LOCATION;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet MATRICES_PROJECTION_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet FOG_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet GLOBALS_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet MATRICES_FOG_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet MATRICES_FOG_LIGHT_DIR_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet GENERIC_BLOCKS_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet TERRAIN_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet BLOCK_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet ENTITY_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet ENTITY_EMISSIVE_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet BEACON_BEAM_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet TEXT_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet END_PORTAL_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet CLOUDS_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet LINES_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet DEBUG_FILLED_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet PARTICLE_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet WEATHER_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet GUI_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet GUI_TEXTURED_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet GUI_TEXT_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet OUTLINE_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet POST_PROCESSING_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline SOLID_BLOCK;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline SOLID_TERRAIN;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline WIREFRAME;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline CUTOUT_BLOCK;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline CUTOUT_TERRAIN;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline TRANSLUCENT_TERRAIN;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline TRIPWIRE_BLOCK;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline TRIPWIRE_TERRAIN;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline TRANSLUCENT_MOVING_BLOCK;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline ARMOR_CUTOUT_NO_CULL;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline ARMOR_DECAL_CUTOUT_NO_CULL;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline ARMOR_TRANSLUCENT;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline ENTITY_SOLID;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline ENTITY_SOLID_Z_OFFSET_FORWARD;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline ENTITY_CUTOUT;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline ENTITY_CUTOUT_NO_CULL;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline ENTITY_CUTOUT_NO_CULL_Z_OFFSET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline ENTITY_TRANSLUCENT;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline ENTITY_TRANSLUCENT_EMISSIVE;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline ENTITY_SMOOTH_CUTOUT;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline ENTITY_NO_OUTLINE;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline BREEZE_WIND;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline ENERGY_SWIRL;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline EYES;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline ENTITY_DECAL;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline ENTITY_SHADOW;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline ITEM_ENTITY_TRANSLUCENT_CULL;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline BEACON_BEAM_OPAQUE;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline BEACON_BEAM_TRANSLUCENT;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline DRAGON_EXPLOSION_ALPHA;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline LEASH;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline WATER_MASK;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline GLINT;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline CRUMBLING;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline TEXT;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline GUI_TEXT;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline TEXT_BACKGROUND;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline TEXT_INTENSITY;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline GUI_TEXT_INTENSITY;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline TEXT_POLYGON_OFFSET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline TEXT_SEE_THROUGH;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline TEXT_BACKGROUND_SEE_THROUGH;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline TEXT_INTENSITY_SEE_THROUGH;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline LIGHTNING;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline DRAGON_RAYS;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline DRAGON_RAYS_DEPTH;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline END_PORTAL;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline END_GATEWAY;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline FLAT_CLOUDS;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline CLOUDS;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline LINES;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline LINES_TRANSLUCENT;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline SECONDARY_BLOCK_OUTLINE;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline DEBUG_POINTS;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline DEBUG_FILLED_BOX;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline DEBUG_QUADS;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline DEBUG_TRIANGLE_FAN;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline WORLD_BORDER;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline OPAQUE_PARTICLE;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline TRANSLUCENT_PARTICLE;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline WEATHER_DEPTH_WRITE;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline WEATHER_NO_DEPTH_WRITE;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline SKY;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline END_SKY;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline SUNRISE_SUNSET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline STARS;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline CELESTIAL;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline GUI;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline GUI_INVERT;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline GUI_TEXT_HIGHLIGHT;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline GUI_TEXTURED;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline GUI_TEXTURED_PREMULTIPLIED_ALPHA;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline BLOCK_SCREEN_EFFECT;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline FIRE_SCREEN_EFFECT;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline GUI_OPAQUE_TEXTURED_BACKGROUND;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline GUI_NAUSEA_OVERLAY;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline VIGNETTE;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline CROSSHAIR;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline MOJANG_LOGO;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline ENTITY_OUTLINE_BLIT;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline TRACY_BLIT;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline PANORAMA;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline OUTLINE_CULL;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline OUTLINE_NO_CULL;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline LIGHTMAP;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline$Snippet ANIMATE_SPRITE_SNIPPET;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline ANIMATE_SPRITE_BLIT;
  public static final com.mojang.blaze3d.pipeline.RenderPipeline ANIMATE_SPRITE_INTERPOLATE;
  public net.minecraft.client.renderer.RenderPipelines();
  public static com.mojang.blaze3d.pipeline.RenderPipeline register(com.mojang.blaze3d.pipeline.RenderPipeline);
  public static java.util.List<com.mojang.blaze3d.pipeline.RenderPipeline> getStaticPipelines();
  static {};
}

=== net.minecraft.client.renderer.texture.DynamicTexture   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "DynamicTexture.java"
public class net.minecraft.client.renderer.texture.DynamicTexture extends net.minecraft.client.renderer.texture.AbstractTexture implements net.minecraft.client.renderer.texture.Dumpable {
  private static final org.slf4j.Logger LOGGER;
  private com.mojang.blaze3d.platform.NativeImage pixels;
  public net.minecraft.client.renderer.texture.DynamicTexture(java.util.function.Supplier<java.lang.String>, com.mojang.blaze3d.platform.NativeImage);
  public net.minecraft.client.renderer.texture.DynamicTexture(java.lang.String, int, int, boolean);
  public net.minecraft.client.renderer.texture.DynamicTexture(java.util.function.Supplier<java.lang.String>, int, int, boolean);
  private void createTexture(java.util.function.Supplier<java.lang.String>);
  private void createTexture(java.lang.String);
  public void upload();
  public com.mojang.blaze3d.platform.NativeImage getPixels();
  public void setPixels(com.mojang.blaze3d.platform.NativeImage);
  public void close();
  public void dumpContents(net.minecraft.resources.Identifier, java.nio.file.Path) throws java.io.IOException;
  static {};
}

=== net.minecraft.client.resources.sounds.SimpleSoundInstance   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "SimpleSoundInstance.java"
public class net.minecraft.client.resources.sounds.SimpleSoundInstance extends net.minecraft.client.resources.sounds.AbstractSoundInstance {
  public net.minecraft.client.resources.sounds.SimpleSoundInstance(net.minecraft.sounds.SoundEvent, net.minecraft.sounds.SoundSource, float, float, net.minecraft.util.RandomSource, net.minecraft.core.BlockPos);
  public static net.minecraft.client.resources.sounds.SimpleSoundInstance forUI(net.minecraft.sounds.SoundEvent, float);
  public static net.minecraft.client.resources.sounds.SimpleSoundInstance forUI(net.minecraft.core.Holder<net.minecraft.sounds.SoundEvent>, float);
  public static net.minecraft.client.resources.sounds.SimpleSoundInstance forUI(net.minecraft.sounds.SoundEvent, float, float);
  public static net.minecraft.client.resources.sounds.SimpleSoundInstance forMusic(net.minecraft.sounds.SoundEvent);
  public static net.minecraft.client.resources.sounds.SimpleSoundInstance forJukeboxSong(net.minecraft.sounds.SoundEvent, net.minecraft.world.phys.Vec3);
  public static net.minecraft.client.resources.sounds.SimpleSoundInstance forLocalAmbience(net.minecraft.sounds.SoundEvent, float, float);
  public static net.minecraft.client.resources.sounds.SimpleSoundInstance forAmbientAddition(net.minecraft.sounds.SoundEvent);
  public static net.minecraft.client.resources.sounds.SimpleSoundInstance forAmbientMood(net.minecraft.sounds.SoundEvent, net.minecraft.util.RandomSource, double, double, double);
  public net.minecraft.client.resources.sounds.SimpleSoundInstance(net.minecraft.sounds.SoundEvent, net.minecraft.sounds.SoundSource, float, float, net.minecraft.util.RandomSource, double, double, double);
  private net.minecraft.client.resources.sounds.SimpleSoundInstance(net.minecraft.sounds.SoundEvent, net.minecraft.sounds.SoundSource, float, float, net.minecraft.util.RandomSource, boolean, int, net.minecraft.client.resources.sounds.SoundInstance$Attenuation, double, double, double);
  public net.minecraft.client.resources.sounds.SimpleSoundInstance(net.minecraft.resources.Identifier, net.minecraft.sounds.SoundSource, float, float, net.minecraft.util.RandomSource, boolean, int, net.minecraft.client.resources.sounds.SoundInstance$Attenuation, double, double, double, boolean);
}
```

## Probe task log

```

> Configure project :
Fabric Loom: 1.14.10

> Task :probeApi
Wrote /home/runner/work/F1Client/F1Client/build/probe-api.txt (154780 bytes; 498 classes matched)
gradle/actions: Writing build results to /home/runner/work/_temp/.gradle-actions/build-results/__run_2-1794643690288.json

[Incubating] Problems report is available at: file:///home/runner/work/F1Client/F1Client/build/reports/problems/problems-report.html

Deprecated Gradle features were used in this build, making it incompatible with Gradle 10.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/9.2.1/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.

BUILD SUCCESSFUL in 7s
1 actionable task: 1 executed
```

## Compile errors, with the symbol and location lines javac prints under each

```
15:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/util/UiSounds.java:6: error: cannot find symbol
16-import net.minecraft.resources.ResourceLocation;
17-                              ^
18-  symbol:   class ResourceLocation
19-  location: package net.minecraft.resources
20:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:13: error: cannot find symbol
21-import net.minecraft.client.input.CharInput;
22-                                 ^
23-  symbol:   class CharInput
24-  location: package net.minecraft.client.input
25:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:14: error: cannot find symbol
26-import net.minecraft.client.input.KeyInput;
27-                                 ^
28-  symbol:   class KeyInput
29-  location: package net.minecraft.client.input
30:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:8: error: cannot find symbol
31-import net.minecraft.client.input.CharInput;
32-                                 ^
33-  symbol:   class CharInput
34-  location: package net.minecraft.client.input
35:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:9: error: cannot find symbol
36-import net.minecraft.client.input.KeyInput;
37-                                 ^
38-  symbol:   class KeyInput
39-  location: package net.minecraft.client.input
40:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:209: error: cannot find symbol
41-	public boolean keyPressed(KeyInput input) {
42-	                          ^
43-  symbol:   class KeyInput
44-  location: class SettingList
45:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:228: error: cannot find symbol
46-	public boolean charTyped(CharInput input) {
47-	                         ^
48-  symbol:   class CharInput
49-  location: class SettingList
50:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:91: error: cannot find symbol
51-	public boolean keyPressed(KeyInput input) {
52-	                          ^
53-  symbol:   class KeyInput
54-  location: class SettingControl<S>
--
57:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:96: error: cannot find symbol
58-	public boolean charTyped(CharInput input) {
59-	                         ^
60-  symbol:   class CharInput
61-  location: class SettingControl<S>
--
64:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:21: error: cannot find symbol
65-import net.minecraft.client.input.CharInput;
66-                                 ^
67-  symbol:   class CharInput
68-  location: package net.minecraft.client.input
69:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:22: error: cannot find symbol
70-import net.minecraft.client.input.KeyInput;
71-                                 ^
72-  symbol:   class KeyInput
73-  location: package net.minecraft.client.input
74:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:10: error: cannot find symbol
75-import net.minecraft.client.gui.Click;
76-                               ^
77-  symbol:   class Click
78-  location: package net.minecraft.client.gui
79:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:13: error: cannot find symbol
80-import net.minecraft.client.input.CharInput;
81-                                 ^
82-  symbol:   class CharInput
83-  location: package net.minecraft.client.input
84:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:14: error: cannot find symbol
85-import net.minecraft.client.input.KeyInput;
86-                                 ^
87-  symbol:   class KeyInput
88-  location: package net.minecraft.client.input
89:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:8: error: cannot find symbol
90-import net.minecraft.client.input.CharInput;
91-                                 ^
92-  symbol:   class CharInput
93-  location: package net.minecraft.client.input
94:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:9: error: cannot find symbol
95-import net.minecraft.client.input.KeyInput;
96-                                 ^
97-  symbol:   class KeyInput
98-  location: package net.minecraft.client.input
99:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Icons.java:5: error: cannot find symbol
100-import net.minecraft.resources.ResourceLocation;
101-                              ^
102-  symbol:   class ResourceLocation
103-  location: package net.minecraft.resources
104:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:790: error: cannot find symbol
105-	protected boolean onKey(KeyInput input) {
106-	                        ^
107-  symbol:   class KeyInput
108-  location: class ClickGuiScreen
109:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:816: error: cannot find symbol
110-	protected boolean onChar(CharInput input) {
111-	                         ^
112-  symbol:   class CharInput
113-  location: class ClickGuiScreen
114:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Icons.java:64: error: cannot find symbol
115-	private final ResourceLocation texture;
116-	              ^
117-  symbol:   class ResourceLocation
118-  location: class Icons
119:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Icons.java:71: error: cannot find symbol
120-	public ResourceLocation texture() {
121-	       ^
122-  symbol:   class ResourceLocation
123-  location: class Icons
124:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:150: error: cannot find symbol
125-	public boolean keyPressed(KeyInput input) {
126-	                          ^
127-  symbol:   class KeyInput
128-  location: class TextBox
129:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:202: error: cannot find symbol
130-	public boolean charTyped(CharInput input) {
131-	                         ^
132-  symbol:   class CharInput
133-  location: class TextBox
134:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:74: error: cannot find symbol
135-	protected boolean onKey(KeyInput input) {
136-	                        ^
137-  symbol:   class KeyInput
138-  location: class UiScreen
139:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:78: error: cannot find symbol
140-	protected boolean onChar(CharInput input) {
141-	                         ^
142-  symbol:   class CharInput
143-  location: class UiScreen
144:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:148: error: cannot find symbol
145-	public boolean mouseClicked(Click click, boolean doubled) {
146-	                            ^
147-  symbol:   class Click
148-  location: class UiScreen
149:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:153: error: cannot find symbol
150-	public boolean mouseReleased(Click click) {
151-	                             ^
152-  symbol:   class Click
153-  location: class UiScreen
154:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:159: error: cannot find symbol
155-	public boolean mouseDragged(Click click, double deltaX, double deltaY) {
156-	                            ^
157-  symbol:   class Click
158-  location: class UiScreen
159:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:171: error: cannot find symbol
160-	public boolean keyPressed(KeyInput input) {
161-	                          ^
162-  symbol:   class KeyInput
163-  location: class UiScreen
164:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:185: error: cannot find symbol
165-	public boolean charTyped(CharInput input) {
166-	                         ^
167-  symbol:   class CharInput
168-  location: class UiScreen
169:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/KeybindControl.java:8: error: cannot find symbol
170-import net.minecraft.client.input.KeyInput;
171-                                 ^
172-  symbol:   class KeyInput
173-  location: package net.minecraft.client.input
174:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/KeybindControl.java:54: error: cannot find symbol
175-	public boolean keyPressed(KeyInput input) {
176-	                          ^
177-  symbol:   class KeyInput
178-  location: class KeybindControl
179:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:6: error: cannot find symbol
180-import net.minecraft.client.input.CharInput;
181-                                 ^
182-  symbol:   class CharInput
183-  location: package net.minecraft.client.input
184:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:7: error: cannot find symbol
185-import net.minecraft.client.input.KeyInput;
186-                                 ^
187-  symbol:   class KeyInput
188-  location: package net.minecraft.client.input
189:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:53: error: cannot find symbol
190-	public boolean keyPressed(KeyInput input) {
191-	                          ^
192-  symbol:   class KeyInput
193-  location: class StringControl
194:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:58: error: cannot find symbol
195-	public boolean charTyped(CharInput input) {
196-	                         ^
197-  symbol:   class CharInput
198-  location: class StringControl
199:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:9: error: cannot find symbol
200-import net.minecraft.resources.ResourceLocation;
201-                              ^
202-  symbol:   class ResourceLocation
203-  location: package net.minecraft.resources
204:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:35: error: cannot find symbol
205-	private static final Int2ObjectOpenHashMap<ResourceLocation> CACHE = new Int2ObjectOpenHashMap<>();
206-	                                           ^
207-  symbol:   class ResourceLocation
208-  location: class RoundedRenderer
209:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:216: error: cannot find symbol
210-	private static void quad(GuiGraphics context, ResourceLocation id, int x, int y, int u, int v, int width,
211-	                                              ^
212-  symbol:   class ResourceLocation
213-  location: class RoundedRenderer
214:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:222: error: cannot find symbol
215-	private static void stretched(GuiGraphics context, ResourceLocation id, int x, int y, int width, int height,
216-	                                                   ^
217-  symbol:   class ResourceLocation
218-  location: class RoundedRenderer
219:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:232: error: cannot find symbol
220-	private static ResourceLocation texture(int kind, int radiusUnits, int spreadUnits) {
221-	               ^
222-  symbol:   class ResourceLocation
223-  location: class RoundedRenderer
224:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:11: error: cannot find symbol
225-import net.minecraft.resources.ResourceLocation;
226-                              ^
227-  symbol:   class ResourceLocation
228-  location: package net.minecraft.resources
229:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:59: error: cannot find symbol
230-	private final ResourceLocation[] fontIds = new ResourceLocation[Density.VALUES.length];
231-	              ^
232-  symbol:   class ResourceLocation
233-  location: class Fonts
234:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:96: error: cannot find symbol
235-	public ResourceLocation fontId() {
236-	       ^
237-  symbol:   class ResourceLocation
238-  location: class Fonts
--
251:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/util/UiSounds.java:6: error: cannot find symbol
252-  import net.minecraft.resources.ResourceLocation;
253-                                ^
254-    symbol:   class ResourceLocation
255-    location: package net.minecraft.resources
256:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:13: error: cannot find symbol
257-  import net.minecraft.client.input.CharInput;
258-                                   ^
259-    symbol:   class CharInput
260-    location: package net.minecraft.client.input
261:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:14: error: cannot find symbol
262-  import net.minecraft.client.input.KeyInput;
263-                                   ^
264-    symbol:   class KeyInput
265-    location: package net.minecraft.client.input
266:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:8: error: cannot find symbol
267-  import net.minecraft.client.input.CharInput;
268-                                   ^
269-    symbol:   class CharInput
270-    location: package net.minecraft.client.input
271:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:9: error: cannot find symbol
272-  import net.minecraft.client.input.KeyInput;
273-                                   ^
274-    symbol:   class KeyInput
275-    location: package net.minecraft.client.input
276:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:209: error: cannot find symbol
277-  	public boolean keyPressed(KeyInput input) {
278-  	                          ^
279-    symbol:   class KeyInput
280-    location: class SettingList
281:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:228: error: cannot find symbol
282-  	public boolean charTyped(CharInput input) {
283-  	                         ^
284-    symbol:   class CharInput
285-    location: class SettingList
286:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:91: error: cannot find symbol
287-  	public boolean keyPressed(KeyInput input) {
288-  	                          ^
289-    symbol:   class KeyInput
290-    location: class SettingControl<S>
--
293:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:96: error: cannot find symbol
294-  	public boolean charTyped(CharInput input) {
295-  	                         ^
296-    symbol:   class CharInput
297-    location: class SettingControl<S>
--
300:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:21: error: cannot find symbol
301-  import net.minecraft.client.input.CharInput;
302-                                   ^
303-    symbol:   class CharInput
304-    location: package net.minecraft.client.input
305:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:22: error: cannot find symbol
306-  import net.minecraft.client.input.KeyInput;
307-                                   ^
308-    symbol:   class KeyInput
309-    location: package net.minecraft.client.input
310:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:10: error: cannot find symbol
311-  import net.minecraft.client.gui.Click;
312-                                 ^
313-    symbol:   class Click
314-    location: package net.minecraft.client.gui
315:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:13: error: cannot find symbol
316-  import net.minecraft.client.input.CharInput;
317-                                   ^
318-    symbol:   class CharInput
319-    location: package net.minecraft.client.input
320:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:14: error: cannot find symbol
321-  import net.minecraft.client.input.KeyInput;
322-                                   ^
323-    symbol:   class KeyInput
324-    location: package net.minecraft.client.input
325:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:8: error: cannot find symbol
326-  import net.minecraft.client.input.CharInput;
327-                                   ^
328-    symbol:   class CharInput
329-    location: package net.minecraft.client.input
330:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:9: error: cannot find symbol
331-  import net.minecraft.client.input.KeyInput;
332-                                   ^
333-    symbol:   class KeyInput
334-    location: package net.minecraft.client.input
335:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Icons.java:5: error: cannot find symbol
336-  import net.minecraft.resources.ResourceLocation;
337-                                ^
338-    symbol:   class ResourceLocation
339-    location: package net.minecraft.resources
340:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:790: error: cannot find symbol
341-  	protected boolean onKey(KeyInput input) {
342-  	                        ^
343-    symbol:   class KeyInput
344-    location: class ClickGuiScreen
345:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:816: error: cannot find symbol
346-  	protected boolean onChar(CharInput input) {
347-  	                         ^
348-    symbol:   class CharInput
349-    location: class ClickGuiScreen
350:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Icons.java:64: error: cannot find symbol
351-  	private final ResourceLocation texture;
352-  	              ^
353-    symbol:   class ResourceLocation
354-    location: class Icons
355:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Icons.java:71: error: cannot find symbol
356-  	public ResourceLocation texture() {
357-  	       ^
358-    symbol:   class ResourceLocation
359-    location: class Icons
360:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:150: error: cannot find symbol
361-  	public boolean keyPressed(KeyInput input) {
362-  	                          ^
363-    symbol:   class KeyInput
364-    location: class TextBox
365:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:202: error: cannot find symbol
366-  	public boolean charTyped(CharInput input) {
367-  	                         ^
368-    symbol:   class CharInput
369-    location: class TextBox
370:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:74: error: cannot find symbol
371-  	protected boolean onKey(KeyInput input) {
372-  	                        ^
373-    symbol:   class KeyInput
374-    location: class UiScreen
375:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:78: error: cannot find symbol
376-  	protected boolean onChar(CharInput input) {
377-  	                         ^
378-    symbol:   class CharInput
379-    location: class UiScreen
380:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:148: error: cannot find symbol
381-  	public boolean mouseClicked(Click click, boolean doubled) {
382-  	                            ^
383-    symbol:   class Click
384-    location: class UiScreen
385:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:153: error: cannot find symbol
386-  	public boolean mouseReleased(Click click) {
387-  	                             ^
388-    symbol:   class Click
389-    location: class UiScreen
390:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:159: error: cannot find symbol
391-  	public boolean mouseDragged(Click click, double deltaX, double deltaY) {
392-  	                            ^
393-    symbol:   class Click
394-    location: class UiScreen
395:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:171: error: cannot find symbol
396-  	public boolean keyPressed(KeyInput input) {
397-  	                          ^
398-    symbol:   class KeyInput
399-    location: class UiScreen
400:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:185: error: cannot find symbol
401-  	public boolean charTyped(CharInput input) {
402-  	                         ^
403-    symbol:   class CharInput
404-    location: class UiScreen
405:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/KeybindControl.java:8: error: cannot find symbol
406-  import net.minecraft.client.input.KeyInput;
407-                                   ^
408-    symbol:   class KeyInput
409-    location: package net.minecraft.client.input
410:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/KeybindControl.java:54: error: cannot find symbol
411-  	public boolean keyPressed(KeyInput input) {
412-  	                          ^
413-    symbol:   class KeyInput
414-    location: class KeybindControl
415:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:6: error: cannot find symbol
416-  import net.minecraft.client.input.CharInput;
417-                                   ^
418-    symbol:   class CharInput
419-    location: package net.minecraft.client.input
420:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:7: error: cannot find symbol
421-  import net.minecraft.client.input.KeyInput;
422-                                   ^
423-    symbol:   class KeyInput
424-    location: package net.minecraft.client.input
425:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:53: error: cannot find symbol
426-  	public boolean keyPressed(KeyInput input) {
427-  	                          ^
428-    symbol:   class KeyInput
429-    location: class StringControl
430:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:58: error: cannot find symbol
431-  	public boolean charTyped(CharInput input) {
432-  	                         ^
433-    symbol:   class CharInput
434-    location: class StringControl
435:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:9: error: cannot find symbol
436-  import net.minecraft.resources.ResourceLocation;
437-                                ^
438-    symbol:   class ResourceLocation
439-    location: package net.minecraft.resources
440:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:35: error: cannot find symbol
441-  	private static final Int2ObjectOpenHashMap<ResourceLocation> CACHE = new Int2ObjectOpenHashMap<>();
442-  	                                           ^
443-    symbol:   class ResourceLocation
444-    location: class RoundedRenderer
445:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:216: error: cannot find symbol
446-  	private static void quad(GuiGraphics context, ResourceLocation id, int x, int y, int u, int v, int width,
447-  	                                              ^
448-    symbol:   class ResourceLocation
449-    location: class RoundedRenderer
450:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:222: error: cannot find symbol
451-  	private static void stretched(GuiGraphics context, ResourceLocation id, int x, int y, int width, int height,
452-  	                                                   ^
453-    symbol:   class ResourceLocation
454-    location: class RoundedRenderer
455:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:232: error: cannot find symbol
456-  	private static ResourceLocation texture(int kind, int radiusUnits, int spreadUnits) {
457-  	               ^
458-    symbol:   class ResourceLocation
459-    location: class RoundedRenderer
460:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:11: error: cannot find symbol
461-  import net.minecraft.resources.ResourceLocation;
462-                                ^
463-    symbol:   class ResourceLocation
464-    location: package net.minecraft.resources
465:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:59: error: cannot find symbol
466-  	private final ResourceLocation[] fontIds = new ResourceLocation[Density.VALUES.length];
467-  	              ^
468-    symbol:   class ResourceLocation
469-    location: class Fonts
470:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:96: error: cannot find symbol
471-  	public ResourceLocation fontId() {
472-  	       ^
473-    symbol:   class ResourceLocation
474-    location: class Fonts
--
517:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/util/UiSounds.java:6: error: cannot find symbol
518-import net.minecraft.resources.ResourceLocation;
519-                              ^
520-  symbol:   class ResourceLocation
521-  location: package net.minecraft.resources
522:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:13: error: cannot find symbol
523-import net.minecraft.client.input.CharInput;
524-                                 ^
525-  symbol:   class CharInput
526-  location: package net.minecraft.client.input
527:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:14: error: cannot find symbol
528-import net.minecraft.client.input.KeyInput;
529-                                 ^
530-  symbol:   class KeyInput
531-  location: package net.minecraft.client.input
532:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:8: error: cannot find symbol
533-import net.minecraft.client.input.CharInput;
534-                                 ^
535-  symbol:   class CharInput
536-  location: package net.minecraft.client.input
537:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:9: error: cannot find symbol
538-import net.minecraft.client.input.KeyInput;
539-                                 ^
540-  symbol:   class KeyInput
541-  location: package net.minecraft.client.input
542:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:209: error: cannot find symbol
543-	public boolean keyPressed(KeyInput input) {
544-	                          ^
545-  symbol:   class KeyInput
546-  location: class SettingList
547:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:228: error: cannot find symbol
548-	public boolean charTyped(CharInput input) {
549-	                         ^
550-  symbol:   class CharInput
551-  location: class SettingList
552:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:91: error: cannot find symbol
553-	public boolean keyPressed(KeyInput input) {
554-	                          ^
555-  symbol:   class KeyInput
556-  location: class SettingControl<S>
--
559:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:96: error: cannot find symbol
560-	public boolean charTyped(CharInput input) {
561-	                         ^
562-  symbol:   class CharInput
563-  location: class SettingControl<S>
--
566:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:21: error: cannot find symbol
567-import net.minecraft.client.input.CharInput;
568-                                 ^
569-  symbol:   class CharInput
570-  location: package net.minecraft.client.input
571:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:22: error: cannot find symbol
572-import net.minecraft.client.input.KeyInput;
```

## Gradle output (filtered)

```
14:> Task :compileJava
15:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/util/UiSounds.java:6: error: cannot find symbol
20:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:13: error: cannot find symbol
25:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:14: error: cannot find symbol
30:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:8: error: cannot find symbol
35:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:9: error: cannot find symbol
40:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:209: error: cannot find symbol
45:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:228: error: cannot find symbol
50:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:91: error: cannot find symbol
57:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:96: error: cannot find symbol
64:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:21: error: cannot find symbol
69:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:22: error: cannot find symbol
74:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:10: error: cannot find symbol
79:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:13: error: cannot find symbol
84:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:14: error: cannot find symbol
89:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:8: error: cannot find symbol
94:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:9: error: cannot find symbol
99:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Icons.java:5: error: cannot find symbol
104:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:790: error: cannot find symbol
109:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:816: error: cannot find symbol
114:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Icons.java:64: error: cannot find symbol
119:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Icons.java:71: error: cannot find symbol
124:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:150: error: cannot find symbol
129:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:202: error: cannot find symbol
134:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:74: error: cannot find symbol
139:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:78: error: cannot find symbol
144:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:148: error: cannot find symbol
149:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:153: error: cannot find symbol
154:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:159: error: cannot find symbol
159:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:171: error: cannot find symbol
164:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:185: error: cannot find symbol
169:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/KeybindControl.java:8: error: cannot find symbol
174:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/KeybindControl.java:54: error: cannot find symbol
179:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:6: error: cannot find symbol
184:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:7: error: cannot find symbol
189:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:53: error: cannot find symbol
194:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:58: error: cannot find symbol
199:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:9: error: cannot find symbol
204:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:35: error: cannot find symbol
209:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:216: error: cannot find symbol
214:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:222: error: cannot find symbol
219:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:232: error: cannot find symbol
224:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:11: error: cannot find symbol
229:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:59: error: cannot find symbol
234:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:96: error: cannot find symbol
241:> Task :compileJava FAILED
246:FAILURE: Build failed with an exception.
248:* What went wrong:
249:Execution failed for task ':compileJava'.
251:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/util/UiSounds.java:6: error: cannot find symbol
256:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:13: error: cannot find symbol
261:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:14: error: cannot find symbol
266:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:8: error: cannot find symbol
271:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:9: error: cannot find symbol
276:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:209: error: cannot find symbol
281:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:228: error: cannot find symbol
286:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:91: error: cannot find symbol
293:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:96: error: cannot find symbol
300:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:21: error: cannot find symbol
305:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:22: error: cannot find symbol
310:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:10: error: cannot find symbol
315:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:13: error: cannot find symbol
320:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:14: error: cannot find symbol
325:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:8: error: cannot find symbol
330:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:9: error: cannot find symbol
335:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Icons.java:5: error: cannot find symbol
340:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:790: error: cannot find symbol
345:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:816: error: cannot find symbol
350:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Icons.java:64: error: cannot find symbol
355:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Icons.java:71: error: cannot find symbol
360:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:150: error: cannot find symbol
365:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:202: error: cannot find symbol
370:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:74: error: cannot find symbol
375:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:78: error: cannot find symbol
380:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:148: error: cannot find symbol
385:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:153: error: cannot find symbol
390:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:159: error: cannot find symbol
395:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:171: error: cannot find symbol
400:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:185: error: cannot find symbol
405:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/KeybindControl.java:8: error: cannot find symbol
410:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/KeybindControl.java:54: error: cannot find symbol
415:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:6: error: cannot find symbol
420:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:7: error: cannot find symbol
425:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:53: error: cannot find symbol
430:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:58: error: cannot find symbol
435:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:9: error: cannot find symbol
440:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:35: error: cannot find symbol
445:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:216: error: cannot find symbol
450:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:222: error: cannot find symbol
455:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:232: error: cannot find symbol
460:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:11: error: cannot find symbol
465:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:59: error: cannot find symbol
470:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:96: error: cannot find symbol
482:org.gradle.api.tasks.TaskExecutionException: Execution failed for task ':compileJava'.
483:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.lambda$executeIfValid$1(ExecuteActionsTaskExecuter.java:135)
484:	at org.gradle.internal.Try$Failure.ifSuccessfulOrElse(Try.java:288)
485:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:133)
486:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:121)
487:	at org.gradle.api.internal.tasks.execution.ProblemsTaskPathTrackingTaskExecuter.execute(ProblemsTaskPathTrackingTaskExecuter.java:41)
488:	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
489:	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
490:	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
491:	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
492:	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
493:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
494:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
495:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
496:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:209)
497:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
498:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
499:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
500:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
501:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
502:	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
503:	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
504:	at org.gradle.execution.plan.DefaultNodeExecutor.executeLocalTaskNode(DefaultNodeExecutor.java:55)
505:	at org.gradle.execution.plan.DefaultNodeExecutor.execute(DefaultNodeExecutor.java:34)
506:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:355)
507:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:343)
508:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.lambda$execute$0(DefaultTaskExecutionGraph.java:339)
509:	at org.gradle.internal.operations.CurrentBuildOperationRef.with(CurrentBuildOperationRef.java:84)
510:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:339)
511:	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:328)
512:	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:459)
513:	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:376)
514:	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
515:	at org.gradle.internal.concurrent.AbstractManagedExecutor$1.run(AbstractManagedExecutor.java:47)
516:Caused by: org.gradle.api.internal.tasks.compile.CompilationFailedException: Compilation failed; see the compiler output below.
517:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/util/UiSounds.java:6: error: cannot find symbol
522:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:13: error: cannot find symbol
527:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:14: error: cannot find symbol
532:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:8: error: cannot find symbol
537:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:9: error: cannot find symbol
542:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:209: error: cannot find symbol
547:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/SettingList.java:228: error: cannot find symbol
552:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:91: error: cannot find symbol
559:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/SettingControl.java:96: error: cannot find symbol
566:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:21: error: cannot find symbol
571:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:22: error: cannot find symbol
576:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:10: error: cannot find symbol
581:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:13: error: cannot find symbol
586:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:14: error: cannot find symbol
591:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:8: error: cannot find symbol
596:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:9: error: cannot find symbol
601:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Icons.java:5: error: cannot find symbol
606:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:790: error: cannot find symbol
611:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/ClickGuiScreen.java:816: error: cannot find symbol
616:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Icons.java:64: error: cannot find symbol
621:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Icons.java:71: error: cannot find symbol
626:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:150: error: cannot find symbol
631:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/widget/TextBox.java:202: error: cannot find symbol
636:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:74: error: cannot find symbol
641:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:78: error: cannot find symbol
646:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:148: error: cannot find symbol
651:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:153: error: cannot find symbol
656:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:159: error: cannot find symbol
661:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:171: error: cannot find symbol
666:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/UiScreen.java:185: error: cannot find symbol
671:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/KeybindControl.java:8: error: cannot find symbol
676:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/KeybindControl.java:54: error: cannot find symbol
681:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:6: error: cannot find symbol
686:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:7: error: cannot find symbol
691:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:53: error: cannot find symbol
696:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/gui/control/StringControl.java:58: error: cannot find symbol
701:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:9: error: cannot find symbol
706:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:35: error: cannot find symbol
711:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:216: error: cannot find symbol
716:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:222: error: cannot find symbol
721:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/RoundedRenderer.java:232: error: cannot find symbol
726:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:11: error: cannot find symbol
731:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:59: error: cannot find symbol
736:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:96: error: cannot find symbol
742:	at org.gradle.api.internal.tasks.compile.JdkJavaCompiler.execute(JdkJavaCompiler.java:89)
743:	at org.gradle.api.internal.tasks.compile.JdkJavaCompiler.execute(JdkJavaCompiler.java:50)
744:	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.delegateAndHandleErrors(NormalizingJavaCompiler.java:98)
745:	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.execute(NormalizingJavaCompiler.java:52)
746:	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.execute(NormalizingJavaCompiler.java:38)
747:	at org.gradle.api.internal.tasks.compile.AnnotationProcessorDiscoveringCompiler.execute(AnnotationProcessorDiscoveringCompiler.java:52)
748:	at org.gradle.api.internal.tasks.compile.AnnotationProcessorDiscoveringCompiler.execute(AnnotationProcessorDiscoveringCompiler.java:38)
749:	at org.gradle.api.internal.tasks.compile.ModuleApplicationNameWritingCompiler.execute(ModuleApplicationNameWritingCompiler.java:46)
750:	at org.gradle.api.internal.tasks.compile.ModuleApplicationNameWritingCompiler.execute(ModuleApplicationNameWritingCompiler.java:36)
751:	at org.gradle.jvm.toolchain.internal.DefaultToolchainJavaCompiler.execute(DefaultToolchainJavaCompiler.java:57)
752:	at org.gradle.api.tasks.compile.JavaCompile.lambda$createToolchainCompiler$3(JavaCompile.java:206)
753:	at org.gradle.api.internal.tasks.compile.CleaningJavaCompiler.execute(CleaningJavaCompiler.java:53)
754:	at org.gradle.api.internal.tasks.compile.incremental.IncrementalCompilerFactory.lambda$createRebuildAllCompiler$0(IncrementalCompilerFactory.java:55)
755:	at org.gradle.api.internal.tasks.compile.incremental.SelectiveCompiler.execute(SelectiveCompiler.java:70)
756:	at org.gradle.api.internal.tasks.compile.incremental.SelectiveCompiler.execute(SelectiveCompiler.java:44)
757:	at org.gradle.api.internal.tasks.compile.incremental.IncrementalResultStoringCompiler.execute(IncrementalResultStoringCompiler.java:66)
758:	at org.gradle.api.internal.tasks.compile.incremental.IncrementalResultStoringCompiler.execute(IncrementalResultStoringCompiler.java:52)
759:	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler$1.call(CompileJavaBuildOperationReportingCompiler.java:64)
760:	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler$1.call(CompileJavaBuildOperationReportingCompiler.java:48)
761:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:209)
762:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
763:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
764:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
765:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
766:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
767:	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
768:	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler.execute(CompileJavaBuildOperationReportingCompiler.java:48)
769:	at org.gradle.api.tasks.compile.JavaCompile.performCompilation(JavaCompile.java:224)
770:	at org.gradle.api.tasks.compile.JavaCompile.performIncrementalCompilation(JavaCompile.java:165)
771:	at org.gradle.api.tasks.compile.JavaCompile.compile(JavaCompile.java:150)
772:	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
773:	at org.gradle.api.internal.project.taskfactory.IncrementalTaskAction.doExecute(IncrementalTaskAction.java:45)
774:	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
775:	at org.gradle.api.internal.project.taskfactory.IncrementalTaskAction.execute(IncrementalTaskAction.java:26)
776:	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
777:	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:252)
778:	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
779:	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
780:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
781:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
782:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
783:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
784:	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
785:	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:237)
786:	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:220)
787:	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:203)
788:	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:170)
789:	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
790:	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
791:	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
792:	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
793:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:209)
794:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
795:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
796:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
797:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
798:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
799:	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
800:	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
801:	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
802:	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:42)
803:	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:75)
804:	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
805:	at org.gradle.internal.execution.steps.PreCreateOutputParentsStep.execute(PreCreateOutputParentsStep.java:50)
806:	at org.gradle.internal.execution.steps.PreCreateOutputParentsStep.execute(PreCreateOutputParentsStep.java:28)
807:	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:68)
808:	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:38)
809:	at org.gradle.internal.execution.steps.BroadcastChangingOutputsStep.execute(BroadcastChangingOutputsStep.java:61)
810:	at org.gradle.internal.execution.steps.BroadcastChangingOutputsStep.execute(BroadcastChangingOutputsStep.java:26)
811:	at org.gradle.internal.execution.steps.CaptureOutputsAfterExecutionStep.execute(CaptureOutputsAfterExecutionStep.java:69)
812:	at org.gradle.internal.execution.steps.CaptureOutputsAfterExecutionStep.execute(CaptureOutputsAfterExecutionStep.java:46)
813:	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:39)
814:	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:28)
815:	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:189)
816:	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:75)
817:	at org.gradle.internal.Either$Right.fold(Either.java:176)
818:	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:62)
819:	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:73)
820:	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:48)
821:	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:46)
822:	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:35)
823:	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:75)
824:	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:53)
825:	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:53)
826:	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:35)
827:	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
828:	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
829:	at org.gradle.internal.execution.steps.ResolveIncrementalCachingStateStep.executeDelegate(ResolveIncrementalCachingStateStep.java:49)
830:	at org.gradle.internal.execution.steps.ResolveIncrementalCachingStateStep.executeDelegate(ResolveIncrementalCachingStateStep.java:27)
831:	at org.gradle.internal.execution.steps.AbstractResolveCachingStateStep.execute(AbstractResolveCachingStateStep.java:71)
832:	at org.gradle.internal.execution.steps.AbstractResolveCachingStateStep.execute(AbstractResolveCachingStateStep.java:39)
833:	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:64)
834:	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:35)
835:	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:62)
836:	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:40)
837:	at org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep.execute(AbstractCaptureStateBeforeExecutionStep.java:76)
838:	at org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep.execute(AbstractCaptureStateBeforeExecutionStep.java:45)
839:	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.executeWithNonEmptySources(AbstractSkipEmptyWorkStep.java:136)
840:	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.execute(AbstractSkipEmptyWorkStep.java:66)
841:	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.execute(AbstractSkipEmptyWorkStep.java:38)
842:	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
843:	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
844:	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
845:	at org.gradle.internal.execution.steps.HandleStaleOutputsStep.execute(HandleStaleOutputsStep.java:75)
846:	at org.gradle.internal.execution.steps.HandleStaleOutputsStep.execute(HandleStaleOutputsStep.java:41)
847:	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.lambda$execute$0(AssignMutableWorkspaceStep.java:35)
848:	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:297)
849:	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.execute(AssignMutableWorkspaceStep.java:31)
850:	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.execute(AssignMutableWorkspaceStep.java:22)
851:	at org.gradle.internal.execution.steps.ChoosePipelineStep.execute(ChoosePipelineStep.java:40)
852:	at org.gradle.internal.execution.steps.ChoosePipelineStep.execute(ChoosePipelineStep.java:23)
853:	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.lambda$execute$2(ExecuteWorkBuildOperationFiringStep.java:67)
854:	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.execute(ExecuteWorkBuildOperationFiringStep.java:67)
855:	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.execute(ExecuteWorkBuildOperationFiringStep.java:39)
856:	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:46)
857:	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:34)
858:	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:44)
859:	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:31)
860:	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
861:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:132)
871:BUILD FAILED in 33s
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

BUILD FAILED in 33s
1 actionable task: 1 executed
```
