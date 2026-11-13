# Changelog

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
