# F1Client

A standalone client-side **Fabric** mod for Minecraft **1.21.11**, written against
**Mojang mappings** (`loom.officialMojangMappings()`), Java 21. It is not a Meteor Client
addon and imports nothing from `meteordevelopment.*` — every class here is its own.

| Key | What it does |
|---|---|
| `Right Shift` | Opens the **ClickGUI** (and closes it again). Changeable under *Client* |
| `F7` | **OreESP** — boxes on ore blocks, visible through terrain |
| `F8` | **SoundESP** — expanding, fading rings on interesting sounds and moving minecarts |
| `F6` | **Freecam** — detached camera; the player stays exactly where it was |
| *(no key)* | **HUD** — the glass overlay; switched from its own settings in the ClickGUI |

Everything is client-side. No packet is created, changed or suppressed; the hooks only
read what the client already has.

The look is glass: translucent panels over a blurred world, a gloss sweep along the top
edge of every raised surface, hairline highlights, soft outer shadows, and one accent
colour that the player picks. It is drawn by this mod — no shader pack, no resource pack
and no vanilla widget is involved.

## Build

```
./gradlew build
```

The jar is `build/libs/f1-<version>.jar`. Put it in `.minecraft/mods` together with
Fabric API and Fabric Loader ≥ 0.17.

Mojang mappings are resolved from Mojang's and Fabric's own repositories
(`libraries.minecraft.net`, `maven.fabricmc.net`), which Loom adds for you. A first build
therefore downloads more than a Yarn build does, and it needs those two hosts reachable.

`./gradlew genSources` produces `build/loom-cache/minecraft-merged-*-sources.jar` — the
mapped Minecraft source. That is the reference for every name in the mapping notes below.

## Layout

```
src/main/java/com/example/f1/
  F1Client.java            entry point: client settings, config, modules, world-render hook
  Module.java              abstract base: name, description, category, key, settings, JSON
  Modules.java             registry: key polling with press edges, tick, render, ClickGUI
  Category.java            the six sidebar categories
  core/ClientSettings.java accent, client key, UI sounds, descriptions, menu blur, shadows
  config/ConfigManager.java  profiles: sections, debounce, atomic write, switch/create/...
  setting/                 Setting + Bool, Int, Double, Color, Enum, Keybind, String
  ore/OreType.java         the ores OreESP knows, their blocks and their default colours
  render/Theme.java        every colour and radius, the accents, colour helpers
  render/RoundedRenderer.java  generated disc/ring/shadow textures, cached per radius
  render/Fonts.java        Inter text at 11 rasterisation densities, per-density caches
  render/Icons.java        24 white line icons, tinted when drawn
  render/Anim.java         cubic ease-out towards a target over a fixed duration
  render/BlurRenderer.java dim and tint behind a screen
  gui/UiScreen.java        base screen: scale, open animation, backdrop, input plumbing
  gui/ClickGuiScreen.java  the ClickGUI
  gui/SettingList.java     scrollable list of controls for one set of settings
  gui/SmoothScroll.java    scroll offset that glides instead of jumping
  gui/widget/Widgets.java  panel, toggle, slider, buttons, chips, scrollbar, value pill
  gui/widget/TextBox.java  single-line text field with caret, selection and filter
  gui/control/             one SettingControl per setting type, plus the type-to-control map
  hud/HudRenderer.java     the overlay: watermark, coordinates, ores, alerts, module list
  util/UiSounds.java       local interface cues
  modules/OreESP.java      F7
  modules/SoundESP.java    F8
  modules/Freecam.java     F6
  modules/Hud.java         the overlay's own switches
  mixin/MinecraftMixin.java    tail of Minecraft#tick -> Modules.tick()
  mixin/ClientLevelMixin.java  playLocalSound -> SoundESP (local sounds)
  mixin/SoundManagerMixin.java SoundManager#play -> SoundESP (server sound packets)
  mixin/CameraMixin.java       zoom clip, detached flag, camera position -> Freecam
  mixin/GuiMixin.java          tail of Gui#render -> HudRenderer.render(...)
src/main/resources/
  fabric.mod.json          client entrypoint + mixin config + depends
  f1.mixins.json           JAVA_21, client: [CameraMixin, ClientLevelMixin, GuiMixin,
                                             MinecraftMixin, SoundManagerMixin]
  assets/f1/icon.png       mod icon
  assets/f1/font/          2 Inter TTFs + 44 font definitions (<role>_<density*100>.json)
  assets/f1/textures/gui/  24 icons, each with blur+clamp metadata
```

`Modules.tick()` both polls the keys and ticks the modules, so one mixin drives the whole
client: GLFW is read once per tick with press-edge detection, which is why a tap shorter
than a tick still toggles, and why no `Keyboard` mixin is needed.

There are no unit tests or in-client game tests in this revision; the previous Yarn-mapped
client (which had both) is in git history at `645f13b` on `main`.

`.github/workflows/build.yml` builds on every push and uploads the jar. When the build
fails it also commits the filtered Gradle log, the compile errors and the API probe back to
the branch as `build-report/README.md`, because the Actions log and artifact storage are
not reachable from every environment that works on this repo.

## ClickGUI

`Right Shift`, or `Modules.openClickGui()` from anywhere. It is a 680x420 *design surface*
that `UiScreen` scales to fit 94% of the window width and 90% of its height, in quarter-unit
steps so the layout lands on whole device pixels, then centres. The layout is therefore the
same at every GUI scale and every glyph still lands on a pixel boundary.

- **Sidebar**: *Favourites*, the six categories (`WORLD`, `PLAYER`, `COMBAT`, `MOVEMENT`,
  `VISUALS`, `MISC`) each with its own icon, and *Client* for the client-wide settings.
- **Cards**: a two-column grid, one card per module — favourite star, name, description,
  key pill and a glossy toggle. Left click toggles, right click opens its settings, middle
  click pins it to favourites (GLFW counts buttons `0` = left, `1` = middle, `2` = right). An
  enabled card gets a slim accent bar on its left edge and an accent-coloured glow shadow;
  the selected card gets a full accent rim.
- **Settings panel**: the settings of the selected module, or the client settings, in a
  scrolling list with hover descriptions. Right-clicking a row resets that one setting; a
  *Reset* button at the bottom of the panel resets everything in it.
- **Search**: matches module names, descriptions and setting names; the header title turns
  into *Search* and the grid narrows to the hits.
- **Footer**: a hint line — the description of whatever setting the mouse is over, or the
  click help — and the profile controls: `<` and `>` to switch profile, a pill showing the
  active one, `+` to create, a copy button to duplicate and a trash button to delete.
  Creating swaps the pill for a text field whose characters are filtered as they are typed,
  so the profile that is created is the name that was typed. The accent lives in the *Client*
  settings, not the footer.
- **Input**: the screen is not a pause screen, closing plays a transition instead of
  snapping away, and every click goes through the game's own `MouseButtonEvent`. Nothing is
  registered with the vanilla keybind system, so the GUI cannot collide with a player's own
  bindings. Opening an F1 screen from an F1 screen does not chain parents: closing goes back
  to whatever was open before the first one.

## Settings system

`Setting<T>` is the base: a name, a description, a default, JSON read/write, a change
callback and `reset()`. Seven concrete types cover everything the client needs.

| Type | Value | Control in the ClickGUI |
|---|---|---|
| `BoolSetting` | `boolean` | glossy pill toggle that slides |
| `IntSetting` | `int` in a range with a step | draggable track + live value pill |
| `DoubleSetting` | `double` in a range with a step | draggable track + live value pill |
| `ColorSetting` | ARGB `int`, optional alpha | swatch that unfolds R, G, B (, A) sliders |
| `EnumSetting<E>` | one of a fixed list | cycle pill, click to step through |
| `KeybindSetting` | GLFW keycode, or `UNBOUND` for none | key pill; click then press a key, `Esc`/`Backspace` unbinds |
| `StringSetting` | one line, max length | text field with caret and filter |

Modules and `ClientSettings` declare theirs with `add(new IntSetting("Range", 64, 8, 128, 4)
.describe("..."))`; `Module#settings()` is what the settings panel, the config file and the
search box all read. `Setting#get()` returns the boxed type, so a `DoubleSetting` needs
`.floatValue()` before it can be used as a `float`.

## Config profiles

`config/f1client/config.json` (under the game's own config directory):

```json
{ "version": 1, "active": "default",
  "profiles": { "default": { "global": { }, "modules": { } } } }
```

Each profile holds named **sections**; the client registers two — `global` for
`ClientSettings`, `modules` for every module's enabled flag, favourite pin and settings.
Switching profile therefore swaps the whole client at once: colours, keys, what is on and
how each of those behaves.

Saving is debounced at `DEBOUNCE_MS = 500`: `markDirty()` starts a timer that restarts on
every further change, `tick()` writes once it elapses, and `flush()` writes immediately —
on exit (`ClientLifecycleEvents.CLIENT_STOPPING`) and before a profile switch. The JSON
snapshot is taken on the calling thread; only the file write goes to a daemon thread, and it
lands through a temporary file that is moved into place, so a crash mid-save cannot leave a
half-written profile behind.

## HUD

Drawn from a tail injection into `Gui#render(GuiGraphics, DeltaTracker)`, so it sits on top
of the vanilla HUD and below any screen, and is skipped entirely when the HUD module is off
or `options.hideGui` is set. `HudRenderer.render` takes the window's scaled width and
height explicitly rather than reading them off the context.

Pills, each independently switchable: watermark (logo, `F1 Client`, the active profile and,
optionally, the frame rate), coordinates and dimension, per-ore counts, a sound-alert list
(kind, coordinates, age; fades after 30 s), and a Freecam read-out. The module list is a separate stack on its own
corner. Two corner settings (panel corner, module-list corner), one panel opacity and an
HUD-shadows switch live in the HUD module's settings.

Every pill is the same construction: soft shadow, translucent glass fill, a one-pixel gloss
line along the top, a hairline outline, then text drawn with `Fonts`.

## Custom rendering

- **`RoundedRenderer`** — rounded rectangles, outlines and shadows without a shader. It
  generates a disc, a ring and a blurred shadow `NativeImage` per key
  `(kind << 20) | (radiusPx << 10) | spreadPx` (radius capped at 512 device pixels),
  uploads it through `DynamicTexture` and registers it with the `TextureManager`, then draws
  a rounded rectangle as nine blits: four corner quadrants, four stretched edge slices and a
  filled middle. Coverage at the edge is `clamp(signedDistance + 0.5)`, so a corner is
  anti-aliased instead of stair-stepped. `setPixel` takes ARGB and converts internally; the
  masks are white at varying alpha, so channel order cannot be got wrong.
- **`Fonts`** — Inter, bundled as four roles (`REGULAR` 9, `BOLD` 9, `SMALL` 7.5, `TITLE` 14)
  times eleven rasterisation densities = **44 font definitions**. Glyph textures are sampled
  unfiltered, so a glyph rasterised at the wrong size loses its thin strokes or doubles
  them; `setPixelsPerUnit(float)` picks the density that matches the current transform and
  window scale. Each density gets its own `Style` built with
  `Style.EMPTY.withFont(new FontDescription.Resource(id))`, and laid-out lines are cached per
  density (4096 entries, then dropped) so re-drawing a label allocates nothing. Text origins
  are snapped to whole device pixels under the current `Matrix3x2fStack` before drawing.
- **`Icons`** — 24 white line icons under `assets/f1/textures/gui/`, each with
  `blur`/`clamp` metadata so they scale smoothly, drawn tinted through
  `blitSprite`/`blit`.
- **`BlurRenderer`** — dims and tints what is behind a screen. The blur pass itself belongs
  to the screen: `GuiGraphics` has no blur call in these mappings, so `UiScreen` calls the
  game's own `Screen#renderBlurredBackground`, which follows the vanilla *Menu Background
  Blurriness* video setting, and the client's *Menu blur* switch can skip it.
- **`Anim`** — a value easing towards its target over `Theme.ANIMATION_MS` with cubic
  ease-out; the open animation of a screen, the slide of a toggle, the fade of a hover.
- **`SmoothScroll`** — the same easing applied to a scroll offset, with clamping to content
  height.
- **`UiSounds`** — `ui.button.click` and `block.note_block.pling` handed to the client's own
  `SoundManager` as `SimpleSoundInstance.forUI(...)`: local playback only, nothing sent to
  the server, nobody else hears it.
- **`Theme`** — the single source of colours and metrics: seven accents (`AURORA`, `ICE`,
  `VIOLET`, `MINT`, `AMBER`, `ROSE`, `WHITE`), the glass fills, gloss, highlight, outline,
  divider, shadow and text colours, four corner radii, and helpers `fade`, `withAlpha`,
  `mix`, `lighten`, `darken`, `gradient`. `Theme.get()` is what every drawing routine reads,
  so changing the accent repaints the whole client.

## How the ESP sees through walls

All 3D shapes go through the game's own gizmo pass, with always-on-top set **per shape**:

```java
// net.minecraft.gizmos, verified against the mapped 1.21.11 jar
Gizmos.cuboid(new AABB(pos), GizmoStyle.stroke(0xFF35E0D0, 2.0f))   // ARGB, width
      .setAlwaysOnTop();                                            // GizmoProperties
```

`Gizmos.cuboid(...)` returns a `GizmoProperties`, whose three setters are
`setAlwaysOnTop()`, `persistForMillis(int)` and `fadeOut()`. There is no global
always-on-top flag to set and unset, so nothing can leak into whatever renders next.

`Gizmos.addGizmo` falls back to `GizmoCollector.NOOP` (returning `GizmoProperties.IGNORED`)
when no collector is active, so submitting outside the level renderer's collection window
drops the shape silently instead of throwing. Both modules render from
`WorldRenderEvents.AFTER_ENTITIES`; if a shape ever fails to appear, that is the thing to
check first — move the registration to `WorldRenderEvents.DEBUG_RENDER`, which is the
event right next to `LevelRenderer#collectPerFrameGizmos()`.

There is deliberately **no** `RenderSystem.disableDepthTest()` anywhere: on 1.21.9+ depth
state lives in the render pipeline, so that call does nothing. There is also **no**
raycast, `canSee()` or any other line-of-sight test in either ESP module — shapes are
submitted regardless of what is between them and the camera, and `LevelRenderer` (which
owns the `SimpleGizmoCollector` and finalises the collection once per frame) decides what
is visible.

## OreESP (F7)

- `ObjectOpenHashSet<BlockPos>` of found ore; no block entities, no worker thread. The
  block list is a fastutil reference set, because the scan tests every visited block
  against it and identity hashing keeps that O(1).
- Rescans on the *Rescan* interval (default 40 ticks): chunk coordinates in a
  `(range >> 4) + 1` radius around the player, `mc.level.hasChunk(x, z)` first, then
  `scanChunk(level.getChunk(x, z))`. The first tick after enabling scans immediately, so the
  ESP is not empty for two seconds.
- `scanChunk` clamps Y to `[max(-64, level.getMinY()), min(320, level.getMaxY())]` and
  caps each column with the `WORLD_SURFACE` heightmap, so nothing above ground is visited.
  One reusable `BlockPos.MutableBlockPos`, `mp.immutable()` on a match.
- Clears on enable, on disable, and on dimension change (compared by
  `level.dimension().hashCode()`).
- Draws blocks within *Range* (default 64) of the eye position, one stroked cuboid each,
  at *Line width*, optionally fading with distance.
- Settings: `Range`, `Rescan`, `Line width`, `Fade with distance`, plus one switch and one
  colour per ore type.

`ore/OreType.java` is the ore table — stone and deepslate variants are one type, because a
player looking for diamonds does not care which stone the ore sits in:

| Type | Blocks | Default colour | On by default |
|---|---|---|---|
| Diamond | diamond, deepslate diamond | `0xFF4AE0D9` | yes |
| Emerald | emerald, deepslate emerald | `0xFF4ADE80` | yes |
| Ancient Debris | ancient debris | `0xFFB08CFF` | yes |
| Gold | gold, deepslate gold, nether gold | `0xFFFFC66B` | yes |
| Redstone | redstone, deepslate redstone | `0xFFFF5A6E` | yes |
| Lapis | lapis, deepslate lapis | `0xFF5AA8FF` | yes |
| Coal | coal, **deepslate coal** | `0xFF9AA0AE` | no |
| Copper | copper, deepslate copper | `0xFFE0875A` | no |
| Iron | iron, deepslate iron | `0xFFD8B49A` | no |
| Nether Quartz | nether quartz | `0xFFF2F3F5` | no |

The four common ones are off by default only because they are everywhere; one click in the
ClickGUI turns them on, and the HUD's ore-count pill follows the same switches.

## SoundESP (F8)

Markers are a ring of 512 slots; the oldest is overwritten when it is full, and `tick()`
compacts the ring by age. Each marker is drawn as one stroked cuboid that grows from
`0.25` to `1.0` blocks and fades to alpha 0 over *Marker life* (default 1500 ms).

Three sources:

1. `ClientLevelMixin` forwards `ClientLevel#playLocalSound` — everything the client starts
   itself: level events, and blocks and entities playing into the level.
2. `SoundManagerMixin` forwards `SoundManager#play(SoundInstance)` and
   `playDelayed(SoundInstance, int)` — the real funnel. Server sound packets
   (`ClientboundSoundPacket`, `ClientboundSoundEntityPacket`) are turned into a
   `SoundInstance` and handed to the sound engine without ever touching `ClientLevel`, so
   this is what covers a chest, piston or door operated by *another* player. A
   `SoundInstance` already carries `getIdentifier()` and `getX/getY/getZ()`, so an
   entity-attached sound arrives with its position resolved.
3. `tick()` scans `mc.level.entitiesForRendering()` every 2 ticks for an
   `AbstractMinecart` with `getDeltaMovement().lengthSqr() > 0.001` inside range,
   because a cart's rolling sound is started by the client and never arrives as a packet.

Hooks 1 and 2 are on the same path for a locally played sound, so `add()` drops a marker
that duplicates one from the last 60 ms within 0.35 blocks.

Sounds are sorted into families by ID keyword, one switch and one colour each:

| Family | Keywords | Default colour |
|---|---|---|
| Minecarts | `minecart`, `rail` | `0xFFFFB347` |
| Containers | `chest`, `barrel`, `shulker`, `ender` | `0xFF4AE0D9` |
| Mechanisms | `piston`, `door`, `lever`, `button`, `dispenser`, `hopper` | `0xFFB08CFF` |
| Explosives | `tnt`, `creeper.primed`, `fuse` | `0xFFFF5A6E` |
| Portals | `portal` | `0xFF5AA8FF` |
| Anvils | `anvil` | `0xFFD8DAE0` |
| Players | `player` | `0xFF4ADE80` |
| Everything else | *(off by default)* | `0xFFFFDC00` |

Y must be inside `-64..320` and the distance at most *Range* (default 48). Settings also
cover *Marker life*, *Line width*, *Mark unmatched sounds*, and two alerts that are off by
default: *Chat message* (one line per alert through `Gui#getChat().addMessage(...)`) and
*Alert beep* (a local `pling`). Alerts outlive their markers and feed the HUD's alert list.

**Version note.** 1.21.11 has exactly one positional `playLocalSound` —
`(double, double, double, SoundEvent, SoundSource, float, float, boolean)`. The
`Holder<SoundEvent>` overload older versions had is gone, and a mixin naming it would not
fail at compile time (descriptors are strings): under `defaultRequire: 1` it would crash the
game at startup.

## Freecam (F6)

`Vector3d pos` / `prev` (JOML) hold the camera; `Vec3 anchor` holds the body.

- **Enable** bails out through `toggle()` when there is no player, stores the anchor,
  seeds `pos`/`prev` from `mc.gameRenderer.mainCamera().getPosition()`, forces first
  person and asks the level renderer to rebuild every chunk.
- **Tick** reads the vanilla key states (`keyUp/keyDown/keyLeft/keyRight/keyJump/keyShift`,
  `keySprint` for the sprint multiplier), moves at *Speed* blocks per tick (default 0.5) on
  the flat plane built from `Vec3.directionFromRotation(0, player.getYRot())` and `+90`,
  then snaps the body back: `player.setPos(anchor)`, `player.setDeltaMovement(Vec3.ZERO)`,
  `player.resetFallDistance()`.
- **Camera rotation stays vanilla.** The mouse still turns the player, so only the position
  is overridden — that is why there is no `setRotation` hook and no mouse-look mixin.
- Snapping the body instead of swallowing input is also why there is no `KeyboardInput`
  mixin, and why the server keeps seeing a player that stands still. The visible cost is
  that the body jitters at the anchor in third person; nobody else can see it, because
  nothing is sent.
- `getX/getY/getZ(float tickDelta)` interpolate manually between `prev` and `pos`.
- Settings: `Speed`, `Sprint multiplier`, `Smooth camera`.

## Mapping-sensitive names

Written against Mojang mappings for 1.21.11. These are the names most likely to differ
between versions or mapping flavours; each one is also flagged in a comment where it is
used. Verify all of them at once with:

```
./gradlew genSources
```

then open `build/loom-cache/minecraft-merged-*-sources.jar` (or let your IDE attach it)
and check:

| Used here | Status for the mapped 1.21.11 jar | Notes |
|---|---|---|
| `Minecraft#tick()V` | verified | `MinecraftMixin` injects at its tail |
| `Gui#render(GuiGraphics, DeltaTracker)` | verified | `GuiMixin` injects at its tail for the HUD |
| `Minecraft#levelRenderer` + `LevelRenderer#allChanged()` | verified | public field; the spec's `levelExtractor` name does not exist here |
| `Minecraft#isWindowActive()`, `getWindow()`, `getDeltaTracker()`, `getSoundManager()`, `getTextureManager()`, `options`, `gameRenderer`, `level`, `player`, `screen`, `font` | verified | — |
| `Minecraft#getFps()` | verified | **instance** method, not static |
| `Window#handle()` | verified | record-style accessor; older versions used `getWindow()` / `getHandle()` |
| `Window#getGuiScaledWidth()/getGuiScaledHeight()/getWidth()` | verified | the HUD takes them as parameters instead of reading them off `GuiGraphics` |
| `DeltaTracker#getGameTimeDeltaPartialTick(boolean)` | verified | singular `Tick`; `getGameTimeDeltaTicks()` and `getRealtimeDeltaTicks()` are the other two |
| `Options#keyUp/keyDown/keyLeft/keyRight/keyJump/keyShift/keySprint`, `getCameraType()`, `setCameraType(...)`, field `hideGui` | verified | all `KeyMapping` fields, so `isDown()` reads them |
| `CameraType#FIRST_PERSON`, `isFirstPerson()` | verified | — |
| `Camera#setup(Level, Entity, boolean, boolean, float)` | verified | no `alignWithEntity` in this version; Yarn calls it `update` |
| `Camera#getMaxZoom(F)F` | verified | `private`, one float parameter — hooked by ordinal, not by name |
| `Camera#setPosition(DDD)`, `setPosition(Vec3)`, field `detached` | verified | both overloads are hooked with `require = 0` |
| `Camera#position()` | verified | `getPosition()` in some Mojang-mapped versions, `getPos()` in Yarn |
| `GameRenderer#getMainCamera()` | verified | not `mainCamera()` in this version |
| `net.minecraft.resources.Identifier` | verified | **not** `ResourceLocation`; `fromNamespaceAndPath(String, String)`, `withDefaultNamespace(String)`, `parse(String)`, `getPath()`, `getNamespace()` |
| `ResourceKey#identifier()` | verified | **not** `location()`; `registry()` and `registryKey()` are the others |
| `GuiGraphics#pose()` | verified | returns `org.joml.Matrix3x2fStack` — JOML's 2D stack, not `PoseStack`; `pushMatrix()/popMatrix()/translate()` |
| `GuiGraphics#blit(RenderPipeline, Identifier, x, y, u, v, w, h, tw, th[, color])` | verified | `u, v` come **before** width and height; `blitSprite` has the plain-sprite variants |
| `GuiGraphics#fill/fillGradient/hLine/vLine/renderOutline/enableScissor/disableScissor/drawString/drawCenteredString/guiWidth()/guiHeight()` | verified | `drawString` takes a `Font` first and a `String`, `Component` or `FormattedCharSequence` |
| `GuiGraphics#applyBlur` | **does not exist** | the pass is `Screen#renderBlurredBackground(GuiGraphics)`; `blurBeforeThisStratum()` and `nextStratum()` are the stratum controls |
| `com.mojang.blaze3d.pipeline.RenderPipeline` constants in `RenderPipelines` | verified | `GUI`, `GUI_TEXT`, `GUI_TEXTURED`, `GUI_TEXTURED_PREMULTIPLIED_ALPHA`, … |
| `net.minecraft.client.gui.Font` | verified | an **interface**: `lineHeight`, `SHADOW_DEPTH`, `width(String|FormattedText|FormattedCharSequence)`, `split`, `getSplitter()` |
| `Style#withFont(FontDescription)` | verified | takes a `FontDescription`, not an `Identifier` |
| `net.minecraft.network.chat.FontDescription` | verified | an **interface** with `CODEC` and `DEFAULT`; the font-definition case is the nested record `FontDescription.Resource(Identifier)` — `new FontDescription.Resource(id)` |
| `Component#literal`, `MutableComponent#setStyle`, `Component#getVisualOrderText()` | verified | `FormattedCharSequence` is the laid-out form, and it carries the style that selects the font |
| `net.minecraft.client.input.KeyEvent` | verified | record `(key, scancode, modifiers)`, accessors `key()`, `scancode()`, `modifiers()` — **not** `KeyInput`, and not the old `(int, int, int)` parameters |
| `net.minecraft.client.input.CharacterEvent` | verified | record `(codepoint, modifiers)` + `isAllowedChatCharacter()`, `codepointAsString()` — **not** `CharInput` |
| `net.minecraft.client.input.MouseButtonEvent` | verified | record `(x, y, MouseButtonInfo)` + `x()`, `y()`, `button()`, `modifiers()` — there is **no** `net.minecraft.client.gui.Click` |
| `GuiEventListener` | verified | declares `mouseClicked(MouseButtonEvent, boolean)`, `mouseReleased(MouseButtonEvent)`, `mouseDragged(MouseButtonEvent, double, double)`, `mouseScrolled(double, double, double, double)`, `keyPressed(KeyEvent)`, `keyReleased(KeyEvent)`, `charTyped(CharacterEvent)`, `isMouseOver(double, double)`; `Screen` inherits them through `AbstractContainerEventHandler` |
| `Screen#renderBackground(GuiGraphics, int, int, float)`, `isPauseScreen()`, `shouldCloseOnEsc()`, `init()`, `resize(int, int)`, `width`, `height`, `minecraft` | verified | — |
| `NativeImage#setPixel(int, int, int)` | verified | **not** `setPixelRGBA`; also `setPixelABGR`, `getPixel`, `fillRect`, `mappedCopy` |
| `DynamicTexture(Supplier<String>, NativeImage)` + `upload()` | verified | the constructor that takes an image also wants a name supplier |
| `TextureManager#register(Identifier, AbstractTexture)` | verified | `release(Identifier)` frees it; `getTexture(Identifier)` reads it back |
| `SimpleSoundInstance#forUI(SoundEvent, float)` | verified | also `forUI(Holder<SoundEvent>, float)`; `PositionedSoundInstance.ui` is the Yarn name |
| `SoundEvent(Identifier, Optional<Float>)` | verified | a record, so `new SoundEvent(id, Optional.empty())` builds one without `SoundEvents`, whose fields mix `SoundEvent` and `Holder<SoundEvent>` |
| `SoundManager#play(SoundInstance)`, `#playDelayed(SoundInstance, int)` | verified | `play` returns `SoundEngine$PlayResult`; both are hooked by `SoundManagerMixin` |
| `Gui#getChat()` → `ChatComponent#addMessage(Component)` | verified | how SoundESP's optional chat alert is printed |
| `SoundInstance#getIdentifier()/getX()/getY()/getZ()` | verified | interface, so positions arrive already resolved |
| `ClientLevel#playLocalSound(DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V` | verified | the only positional overload; the `Holder` variant does not exist in 1.21.11 |
| `ClientLevel#entitiesForRendering()` | verified | returns `Iterable<Entity>` |
| `net.minecraft.gizmos.{Gizmos,GizmoStyle,GizmoProperties}` | verified | Fabric API has no gizmo package, and `net.minecraft.world.debug.gizmo` does not exist under Mojang mappings |
| `net.minecraft.world.entity.vehicle.minecart.AbstractMinecart` | verified | it used to sit directly in `vehicle` |
| `Level#getMinY()/getMaxY()/hasChunk(int,int)/getChunk(int,int)`, `Heightmap.Types.WORLD_SURFACE`, `Heightmap#getFirstAvailable(int,int)`, `Entity#getDeltaMovement()/position()/getY()/setPos/resetFallDistance`, `BlockPos#equals`, `Vec3#distanceToSqr`, `Component#literal` | compiled clean | javac resolved every one of them |
| `WorldRenderContext` | verified | Fabric API 16.2.x: `gameRenderer()`, `worldRenderer()`, `worldState()`, `matrices()`, `consumers()`, `commandQueue()`, `sectionState()` — and no tick delta |

Three things that are not names but will still break a build or a startup if they change:

- **`@Local(argsOnly = true, ordinal = 4)`** in `CameraMixin` captures the float parameter
  of `setup` by position instead of by name, because parameter names need the local
  variable table or `-parameters`. If capture fails, drop the annotation and pass `1.0f` —
  the camera is then one tick behind while flying, which is barely noticeable at 0.5 blocks
  per tick.
- **Which `setPosition` overload `setup` calls** is an implementation detail, so both are
  hooked with `require = 0`. If neither applies, Freecam enables but the camera does not
  move; that is the symptom to look for.
- **`defaultRequire: 1`** in `f1.mixins.json` means a mixin that does not apply crashes the
  game at startup instead of silently doing nothing. That is what you want while porting
  names; raise it to `0` per-injection only if you need the mod to survive a mapping drift.

## Checking a name against the real jar

`./gradlew probeApi` writes `build/probe-api.txt`: it walks the compile classpath — exactly
what `javac` saw — lists every class matching `-PprobePattern` (default: the client GUI,
input, screen, blaze3d platform, texture, render-pipeline, sound, chat and Fabric client
packages) together with the jars they live in, and prints `javap -p` output for the classes
matching `-PprobeDumpPattern` (default: `GuiGraphics`, `Font`, `Screen`, `FontDescription`).
`-PprobeDumpLimit` caps how many classes are dumped, because `javap` output for every
rendering class would be megabytes.

```
./gradlew probeApi -PprobePattern='client\.input' -PprobeDumpPattern='client\.input\.KeyEvent$'
```

It does not depend on compiling, so it still reports when the build is broken — which is
the moment it is useful. CI runs it after every build, and a **failed** build commits the
probe output, the compile errors and the filtered Gradle log back to the branch as
`build-report/README.md` (with the skip-ci mark, so that commit does not retrigger the
workflow). A green build just uploads the jar. That directory is CI output, not source.

The Build step pipes Gradle through `tee` with `set -o pipefail`, so a failed compile fails
the job instead of hiding behind a successful `tee`.

## Unused lambda parameters

The toolchain is Java 21, so an unnamed parameter `_` does not compile (that is Java 22).
Unused parameters keep a real name everywhere in this mod.

## License

MIT, see `LICENSE`.
