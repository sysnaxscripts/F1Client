# Changelog

## 0.03

The interface layer of 0.01 is back, rebuilt on Mojang mappings for 1.21.11 and restyled:
the near-black monochrome of 0.01 is now **glass** — translucent panels over a blurred
world, a gloss sweep across every raised surface, hairline highlights and a switchable
accent colour. The module logic of 0.02 is untouched apart from gaining settings.

- **ClickGUI** on `Right Shift` (changeable in the client settings): sidebar of favourites,
  the six categories and the client's own settings; a two-column grid of module cards with
  a favourite star, an enable switch and a key pill; a settings panel for whatever is
  selected; a search box that matches module names, descriptions and setting names; profile create, duplicate,
  delete and switch in the footer; hover descriptions; a 680x420 design surface that
  scales to the window and centres itself.
- **Settings system**: `Setting<T>` plus `BoolSetting`, `IntSetting`, `DoubleSetting`,
  `ColorSetting`, `EnumSetting`, `KeybindSetting` and `StringSetting`, each with a range or
  option list, a description, a default to reset to and JSON persistence. One `SettingControl`
  subclass per type draws and edits it: glossy pill toggle, draggable slider with a live value
  pill, cycle pill, key-capture pill, swatch that unfolds RGBA sliders, text field.
- **Config profiles**: `config/f1client/config.json` holds any number of named profiles and
  the active one; each profile carries a `global` section (client settings) and a `modules`
  section (enabled flag, favourite pin and every setting of every module), so switching
  profile swaps the whole client at once. Saving is debounced at 500 ms, snapshots are taken
  on the calling thread, the write runs on a daemon thread and lands through a temporary
  file, and the client flushes on exit.
- **HUD**, drawn from a tail injection into `Gui#render`: glass pills for the watermark and
  frame rate, coordinates and dimension, per-ore counts, a sound-alert list, a Freecam
  read-out, plus a module list on its own corner. Two independent corner settings, one panel
  opacity, optional shadows, and every part switchable from the HUD module's own settings.
- **Custom rendering**: Inter bundled as 44 font definitions (4 roles x 11 rasterisation
  densities) because glyph textures are sampled unfiltered and a glyph rasterised at the
  wrong size loses its thin strokes; `RoundedRenderer` generates and caches one disc, ring
  and shadow `NativeImage` per radius and draws a rounded rectangle as nine blits;
  `BlurRenderer` dims and tints behind screens; `Anim` eases values with cubic ease-out;
  `SmoothScroll` glides a scroll offset; `Icons` bundles 24 white line icons, tinted at draw
  time; `UiSounds` plays local interface cues that never reach the server.
- **Theme**: one place for every colour and radius, with seven accents (Aurora, Ice, Violet,
  Mint, Amber, Rose, White) and helpers for fading, mixing, lightening and darkening.
- OreESP now covers coal and deepslate coal (plus copper, iron and nether quartz, off by
  default), and SoundESP sorts sounds into eight families with a colour each; both, and
  Freecam and the HUD, expose their tunables as settings instead of constants.
- SoundESP can also announce an alert in chat and play a beep, both off by default.
- Assets moved to the `f1` namespace; the unused `assets/f1/sounds/ore_map.json` is gone,
  the ore table now being `ore/OreType.java`.

Mapped names this revision had to learn the hard way, all verified against
`minecraft-merged-*-1.21.11-*.jar` with `./gradlew probeApi`: `ResourceLocation` is
`Identifier`, the GUI matrix stack is `org.joml.Matrix3x2fStack` from `GuiGraphics#pose()`,
the input events are `KeyEvent` / `CharacterEvent` / `MouseButtonEvent` records,
`Style#withFont` takes a `FontDescription.Resource`, `NativeImage` writes with
`setPixel(x, y, argb)`, `DynamicTexture` wants a name supplier with its image,
`ResourceKey` reaches its identifier through `identifier()`, the blur pass is
`Screen#renderBlurredBackground` rather than anything on `GuiGraphics`, and `Minecraft#getFps`
is an instance method.

## 0.02

Rewritten as a standalone Fabric mod on **Mojang mappings** for Minecraft 1.21.11. The
account gate, ClickGUI, HUD, config profiles and the Yarn-mapped module system of 0.01 are
gone; they live on in git at `645f13b` (branch `main`).

- `com.example.f1.Module` / `Modules`: module base and static registry. Keys are polled
  from GLFW once per tick with press-edge detection, so no `Keyboard` mixin is needed and a
  tap shorter than a tick is still seen.
- `OreESP` (F7): ore boxes through terrain. Rescans the chunks around the player every 40
  ticks, heightmap-capped columns, Y from -64 to 320, cleared on enable, disable and
  dimension change.
- `SoundESP` (F8): 1500 ms rings on sounds that pass an ID filter, fed from both
  `ClientLevel#playLocalSound` overloads, plus a 2-tick entity scan for moving minecarts
  whose rolling sound never reaches the network.
- `Freecam` (F6): camera detached through `CameraMixin` (zoom clip, detached flag,
  position), body snapped back to its anchor every tick so nothing is sent to the server.
- Rendering goes through the gizmo pass with always-on-top; no `RenderSystem` depth calls
  and no line-of-sight checks anywhere.
- MixinExtras declared `compileOnly` + `annotationProcessor` + `include` for `@ModifyArgs`
  and `@Local`.
- The in-client game test and the unit tests of 0.01 were removed with the code they tested;
  CI builds the mod.

## 0.01

- Account gate: register / sign-in screen, encrypted device-bound session, silent
  refresh, offline grace period, mock backend until an API URL was configured.
- ClickGUI: sidebar, search, favourites, module cards, settings panel, keyboard
  navigation, theme accents.
- Modules: OreDetection, SoundDetection, Freecam, HUD (Yarn mappings).
- Ore table covered coal and deepslate coal in both the ESP and the sound table.
- Per-account config profiles with debounced saving.
- Unit tests and an in-client game test, both run in CI.
