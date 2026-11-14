# Last build

Run: https://github.com/sysnaxscripts/F1Client/actions/runs/43575587412
Commit under test: 7986d12ea93ea08b6e56d42a47a48ab574d667cd
Generated on: 2026-11-14T08:23:51Z

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

packages containing a match (69):
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
  net.minecraft.client.gui.font
  net.minecraft.client.gui.screens
  net.minecraft.client.input
  net.minecraft.client.renderer
  net.minecraft.client.renderer.texture
  net.minecraft.client.renderer.texture.atlas
  net.minecraft.client.renderer.texture.atlas.sources
  net.minecraft.client.resources.sounds
  net.minecraft.network.chat
  net.minecraft.network.chat.contents
  net.minecraft.network.chat.contents.data
  net.minecraft.network.chat.contents.objects
  net.minecraft.network.chat.numbers
  net.minecraft.resources

matching classes (623):
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
  net.minecraft.client.gui.font.FontManager   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.gui.font.FontManager$BuilderId   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.gui.font.FontManager$BuilderResult   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.gui.font.FontManager$CachedFontProvider   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.gui.font.FontManager$CachedFontProvider$CachedEntry   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.gui.font.FontManager$FontDefinitionFile   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.gui.font.FontManager$Preparation   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.client.gui.font.FontManager$UnresolvedBuilderBundle   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
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
  net.minecraft.network.chat.ChatDecorator   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ChatType   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ChatType$Bound   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ChatTypeDecoration   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ChatTypeDecoration$Parameter   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ChatTypeDecoration$Parameter$Selector   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ClickEvent   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ClickEvent$Action   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ClickEvent$ChangePage   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ClickEvent$CopyToClipboard   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ClickEvent$Custom   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ClickEvent$OpenFile   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ClickEvent$OpenUrl   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ClickEvent$RunCommand   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ClickEvent$ShowDialog   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ClickEvent$SuggestCommand   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.CommonComponents   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.Component   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ComponentContents   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ComponentSerialization   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ComponentSerialization$1   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ComponentSerialization$FuzzyCodec   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ComponentSerialization$StrictEither   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ComponentUtils   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.FilterMask   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.FilterMask$Type   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.FontDescription   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.FontDescription$AtlasSprite   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.FontDescription$PlayerSprite   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.FontDescription$Resource   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.FormattedText   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.FormattedText$1   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.FormattedText$2   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.FormattedText$3   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.FormattedText$4   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.FormattedText$ContentConsumer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.FormattedText$StyledContentConsumer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.HoverEvent   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.HoverEvent$Action   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.HoverEvent$EntityTooltipInfo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.HoverEvent$ShowEntity   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.HoverEvent$ShowItem   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.HoverEvent$ShowText   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.LastSeenMessages   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.LastSeenMessages$Packed   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.LastSeenMessages$Update   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.LastSeenMessagesTracker   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.LastSeenMessagesTracker$Update   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.LastSeenMessagesValidator   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.LastSeenMessagesValidator$ValidationException   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.LastSeenTrackedEntry   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.LocalChatSession   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.MessageSignature   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.MessageSignature$Packed   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.MessageSignatureCache   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.MutableComponent   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.OutgoingChatMessage   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.OutgoingChatMessage$Disguised   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.OutgoingChatMessage$Player   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.PlayerChatMessage   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.RemoteChatSession   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.RemoteChatSession$Data   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.SignableCommand   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.SignableCommand$Argument   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.SignedMessageBody   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.SignedMessageBody$Packed   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.SignedMessageChain   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.SignedMessageChain$1   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.SignedMessageChain$DecodeException   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.SignedMessageChain$Decoder   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.SignedMessageChain$Encoder   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.SignedMessageLink   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.SignedMessageValidator   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.SignedMessageValidator$KeyBased   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.Style   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.Style$1   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.Style$1Collector   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.Style$Serializer   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.SubStringSource   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.TextColor   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.ThrowingComponent   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.KeybindContents   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.KeybindResolver   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.NbtContents   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.ObjectContents   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.PlainTextContents   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.PlainTextContents$1   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.PlainTextContents$LiteralContents   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.ScoreContents   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.SelectorContents   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.TranslatableContents   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.TranslatableFormatException   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.data.BlockDataSource   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.data.DataSource   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.data.DataSources   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.data.EntityDataSource   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.data.StorageDataSource   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.data.package-info   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.objects.AtlasSprite   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.objects.ObjectInfo   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.objects.ObjectInfos   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.objects.PlayerSprite   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.objects.package-info   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.contents.package-info   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.numbers.BlankFormat   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.numbers.BlankFormat$1   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.numbers.FixedFormat   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.numbers.FixedFormat$1   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.numbers.NumberFormat   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.numbers.NumberFormatType   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.numbers.NumberFormatTypes   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.numbers.StyledFormat   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.numbers.StyledFormat$1   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.numbers.package-info   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.network.chat.package-info   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.resources.ResourceKey   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]
  net.minecraft.resources.ResourceKey$InternKey   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar]

signatures of the first 3 dump matches:

=== net.minecraft.network.chat.FontDescription   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "FontDescription.java"
public interface net.minecraft.network.chat.FontDescription {
  public static final com.mojang.serialization.Codec<net.minecraft.network.chat.FontDescription> CODEC;
  public static final net.minecraft.network.chat.FontDescription$Resource DEFAULT;
  private static com.mojang.serialization.DataResult method_73172(net.minecraft.network.chat.FontDescription);
  private static java.lang.String method_73173(net.minecraft.network.chat.FontDescription);
  static {};
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

=== net.minecraft.network.chat.TextColor   [minecraft-merged-2ae02fda0f-1.21.11-loom.mappings.1_21_11.layered+hash.2198-v2.jar] ===
Compiled from "TextColor.java"
public final class net.minecraft.network.chat.TextColor {
  private static final java.lang.String CUSTOM_COLOR_PREFIX;
  public static final com.mojang.serialization.Codec<net.minecraft.network.chat.TextColor> CODEC;
  private static final java.util.Map<net.minecraft.ChatFormatting, net.minecraft.network.chat.TextColor> LEGACY_FORMAT_TO_COLOR;
  private static final java.util.Map<java.lang.String, net.minecraft.network.chat.TextColor> NAMED_COLORS;
  private final int value;
  private final java.lang.String name;
  private net.minecraft.network.chat.TextColor(int, java.lang.String);
  private net.minecraft.network.chat.TextColor(int);
  public int getValue();
  public java.lang.String serialize();
  public final java.lang.String formatValue();
  public boolean equals(java.lang.Object);
  public int hashCode();
  public java.lang.String toString();
  public static net.minecraft.network.chat.TextColor fromLegacyFormat(net.minecraft.ChatFormatting);
  public static net.minecraft.network.chat.TextColor fromRgb(int);
  public static com.mojang.serialization.DataResult<net.minecraft.network.chat.TextColor> parseColor(java.lang.String);
  private static java.lang.String method_54222(java.lang.String);
  private static java.lang.String method_54223(java.lang.String);
  private static java.lang.String method_54224(java.lang.String);
  private static java.lang.String method_27720(net.minecraft.network.chat.TextColor);
  private static net.minecraft.network.chat.TextColor method_27722(net.minecraft.ChatFormatting);
  static {};
}
```

## Probe task log

```

> Configure project :
Fabric Loom: 1.14.10

> Task :probeApi
Wrote /home/runner/work/F1Client/F1Client/build/probe-api.txt (94420 bytes; 623 classes matched)
gradle/actions: Writing build results to /home/runner/work/_temp/.gradle-actions/build-results/__run_2-1794644629283.json

[Incubating] Problems report is available at: file:///home/runner/work/F1Client/F1Client/build/reports/problems/problems-report.html

Deprecated Gradle features were used in this build, making it incompatible with Gradle 10.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/9.2.1/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.

BUILD SUCCESSFUL in 2s
1 actionable task: 1 executed
```

## Compile errors, with the symbol and location lines javac prints under each

```
15:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:70: error: constructor Resource in record Resource cannot be applied to given types;
16-			styles[i] = Style.EMPTY.withFont(new FontDescription.Resource(fontIds[i], Optional.empty()));
17-			                                 ^
18-  required: Identifier
19-  found:    Identifier,Optional<Object>
--
31:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:70: error: constructor Resource in record Resource cannot be applied to given types;
32-  			styles[i] = Style.EMPTY.withFont(new FontDescription.Resource(fontIds[i], Optional.empty()));
33-  			                                 ^
34-    required: Identifier
35-    found:    Identifier,Optional<Object>
--
79:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:70: error: constructor Resource in record Resource cannot be applied to given types;
80-			styles[i] = Style.EMPTY.withFont(new FontDescription.Resource(fontIds[i], Optional.empty()));
81-			                                 ^
82-  required: Identifier
83-  found:    Identifier,Optional<Object>
```

## Gradle output (filtered)

```
14:> Task :compileJava FAILED
15:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:70: error: constructor Resource in record Resource cannot be applied to given types;
26:FAILURE: Build failed with an exception.
28:* What went wrong:
29:Execution failed for task ':compileJava'.
31:  /home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:70: error: constructor Resource in record Resource cannot be applied to given types;
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
79:/home/runner/work/F1Client/F1Client/src/main/java/com/example/f1/render/Fonts.java:70: error: constructor Resource in record Resource cannot be applied to given types;
86:	at org.gradle.api.internal.tasks.compile.JdkJavaCompiler.execute(JdkJavaCompiler.java:89)
87:	at org.gradle.api.internal.tasks.compile.JdkJavaCompiler.execute(JdkJavaCompiler.java:50)
88:	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.delegateAndHandleErrors(NormalizingJavaCompiler.java:98)
89:	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.execute(NormalizingJavaCompiler.java:52)
90:	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.execute(NormalizingJavaCompiler.java:38)
91:	at org.gradle.api.internal.tasks.compile.AnnotationProcessorDiscoveringCompiler.execute(AnnotationProcessorDiscoveringCompiler.java:52)
92:	at org.gradle.api.internal.tasks.compile.AnnotationProcessorDiscoveringCompiler.execute(AnnotationProcessorDiscoveringCompiler.java:38)
93:	at org.gradle.api.internal.tasks.compile.ModuleApplicationNameWritingCompiler.execute(ModuleApplicationNameWritingCompiler.java:46)
94:	at org.gradle.api.internal.tasks.compile.ModuleApplicationNameWritingCompiler.execute(ModuleApplicationNameWritingCompiler.java:36)
95:	at org.gradle.jvm.toolchain.internal.DefaultToolchainJavaCompiler.execute(DefaultToolchainJavaCompiler.java:57)
96:	at org.gradle.api.tasks.compile.JavaCompile.lambda$createToolchainCompiler$3(JavaCompile.java:206)
97:	at org.gradle.api.internal.tasks.compile.CleaningJavaCompiler.execute(CleaningJavaCompiler.java:53)
98:	at org.gradle.api.internal.tasks.compile.incremental.IncrementalCompilerFactory.lambda$createRebuildAllCompiler$0(IncrementalCompilerFactory.java:55)
99:	at org.gradle.api.internal.tasks.compile.incremental.SelectiveCompiler.execute(SelectiveCompiler.java:70)
100:	at org.gradle.api.internal.tasks.compile.incremental.SelectiveCompiler.execute(SelectiveCompiler.java:44)
101:	at org.gradle.api.internal.tasks.compile.incremental.IncrementalResultStoringCompiler.execute(IncrementalResultStoringCompiler.java:66)
102:	at org.gradle.api.internal.tasks.compile.incremental.IncrementalResultStoringCompiler.execute(IncrementalResultStoringCompiler.java:52)
103:	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler$1.call(CompileJavaBuildOperationReportingCompiler.java:64)
104:	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler$1.call(CompileJavaBuildOperationReportingCompiler.java:48)
105:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:209)
106:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
107:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
108:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
109:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
110:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
111:	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
112:	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler.execute(CompileJavaBuildOperationReportingCompiler.java:48)
113:	at org.gradle.api.tasks.compile.JavaCompile.performCompilation(JavaCompile.java:224)
114:	at org.gradle.api.tasks.compile.JavaCompile.performIncrementalCompilation(JavaCompile.java:165)
115:	at org.gradle.api.tasks.compile.JavaCompile.compile(JavaCompile.java:150)
116:	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
117:	at org.gradle.api.internal.project.taskfactory.IncrementalTaskAction.doExecute(IncrementalTaskAction.java:45)
118:	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
119:	at org.gradle.api.internal.project.taskfactory.IncrementalTaskAction.execute(IncrementalTaskAction.java:26)
120:	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
121:	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:252)
122:	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
123:	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
124:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
125:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
126:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
127:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
128:	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
129:	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:237)
130:	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:220)
131:	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:203)
132:	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:170)
133:	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
134:	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
135:	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
136:	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
137:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:209)
138:	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
139:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
140:	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
141:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:166)
142:	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
143:	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
144:	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
145:	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
146:	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:42)
147:	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:75)
148:	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
149:	at org.gradle.internal.execution.steps.PreCreateOutputParentsStep.execute(PreCreateOutputParentsStep.java:50)
150:	at org.gradle.internal.execution.steps.PreCreateOutputParentsStep.execute(PreCreateOutputParentsStep.java:28)
151:	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:68)
152:	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:38)
153:	at org.gradle.internal.execution.steps.BroadcastChangingOutputsStep.execute(BroadcastChangingOutputsStep.java:61)
154:	at org.gradle.internal.execution.steps.BroadcastChangingOutputsStep.execute(BroadcastChangingOutputsStep.java:26)
155:	at org.gradle.internal.execution.steps.CaptureOutputsAfterExecutionStep.execute(CaptureOutputsAfterExecutionStep.java:69)
156:	at org.gradle.internal.execution.steps.CaptureOutputsAfterExecutionStep.execute(CaptureOutputsAfterExecutionStep.java:46)
157:	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:39)
158:	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:28)
159:	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:189)
160:	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:75)
161:	at org.gradle.internal.Either$Right.fold(Either.java:176)
162:	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:62)
163:	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:73)
164:	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:48)
165:	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:46)
166:	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:35)
167:	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:75)
168:	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:53)
169:	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:53)
170:	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:35)
171:	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
172:	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
173:	at org.gradle.internal.execution.steps.ResolveIncrementalCachingStateStep.executeDelegate(ResolveIncrementalCachingStateStep.java:49)
174:	at org.gradle.internal.execution.steps.ResolveIncrementalCachingStateStep.executeDelegate(ResolveIncrementalCachingStateStep.java:27)
175:	at org.gradle.internal.execution.steps.AbstractResolveCachingStateStep.execute(AbstractResolveCachingStateStep.java:71)
176:	at org.gradle.internal.execution.steps.AbstractResolveCachingStateStep.execute(AbstractResolveCachingStateStep.java:39)
177:	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:64)
178:	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:35)
179:	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:62)
180:	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:40)
181:	at org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep.execute(AbstractCaptureStateBeforeExecutionStep.java:76)
182:	at org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep.execute(AbstractCaptureStateBeforeExecutionStep.java:45)
183:	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.executeWithNonEmptySources(AbstractSkipEmptyWorkStep.java:136)
184:	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.execute(AbstractSkipEmptyWorkStep.java:66)
185:	at org.gradle.internal.execution.steps.AbstractSkipEmptyWorkStep.execute(AbstractSkipEmptyWorkStep.java:38)
186:	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
187:	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
188:	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
189:	at org.gradle.internal.execution.steps.HandleStaleOutputsStep.execute(HandleStaleOutputsStep.java:75)
190:	at org.gradle.internal.execution.steps.HandleStaleOutputsStep.execute(HandleStaleOutputsStep.java:41)
191:	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.lambda$execute$0(AssignMutableWorkspaceStep.java:35)
192:	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:297)
193:	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.execute(AssignMutableWorkspaceStep.java:31)
194:	at org.gradle.internal.execution.steps.AssignMutableWorkspaceStep.execute(AssignMutableWorkspaceStep.java:22)
195:	at org.gradle.internal.execution.steps.ChoosePipelineStep.execute(ChoosePipelineStep.java:40)
196:	at org.gradle.internal.execution.steps.ChoosePipelineStep.execute(ChoosePipelineStep.java:23)
197:	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.lambda$execute$2(ExecuteWorkBuildOperationFiringStep.java:67)
198:	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.execute(ExecuteWorkBuildOperationFiringStep.java:67)
199:	at org.gradle.internal.execution.steps.ExecuteWorkBuildOperationFiringStep.execute(ExecuteWorkBuildOperationFiringStep.java:39)
200:	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:46)
201:	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:34)
202:	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:44)
203:	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:31)
204:	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
205:	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:132)
215:BUILD FAILED in 21s
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

BUILD FAILED in 21s
1 actionable task: 1 executed
```
