# F1Client

A standalone client-side **Fabric** mod for Minecraft **1.21.11**, written against
**Mojang mappings** (`loom.officialMojangMappings()`), Java 21. It is not a Meteor Client
addon and imports nothing from `meteordevelopment.*` — every class here is its own.

Three modules, each on one function key:

| Key | Module | What it does |
|---|---|---|
| `F7` | **OreESP** | Boxes on ore blocks, visible through terrain |
| `F8` | **SoundESP** | Expanding, fading rings on interesting sounds and on moving minecarts |
| `F6` | **Freecam** | Detached camera; the player stays exactly where it was |

Everything is client-side. No packet is created, changed or suppressed; the hooks only
read what the client already has.

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
  F1Client.java            client entrypoint: registers modules, hooks AFTER_ENTITIES
  Module.java              abstract base: name, key, enabled, toggle, tick, render
  Modules.java             static registry: key polling with press edges, tick, render
  modules/OreESP.java      F7
  modules/SoundESP.java    F8
  modules/Freecam.java     F6
  mixin/MinecraftMixin.java    tail of Minecraft#tick -> Modules.tick()
  mixin/ClientLevelMixin.java  both playLocalSound overloads -> SoundESP
  mixin/CameraMixin.java       zoom clip, detached flag, camera position -> Freecam
src/main/resources/
  fabric.mod.json          client entrypoint + mixin config + depends
  f1.mixins.json           JAVA_21, client: [CameraMixin, ClientLevelMixin, MinecraftMixin]
```

`Modules.tick()` both polls the keys and ticks the modules, so one mixin drives the whole
client: GLFW is read once per tick with press-edge detection, which is why a tap shorter
than a tick still toggles, and why no `Keyboard` mixin is needed.

There are no unit tests or in-client game tests in this revision; the previous Yarn-mapped
client (which had both) is in git history at `645f13b` on `main`.

## How the ESP sees through walls

All 3D shapes go through the gizmo pass with **always-on-top** set:

```java
Gizmos.setAlwaysOnTop(true);
Gizmos.cuboid(new AABB(pos), GizmoStyle.stroke(0xFF35E0D0));   // ARGB
Gizmos.setAlwaysOnTop(false);
```

There is deliberately **no** `RenderSystem.disableDepthTest()` anywhere: on 1.21.9+ depth
state lives in the render pipeline, so that call does nothing. There is also **no**
raycast, `canSee()` or any other line-of-sight test in either ESP module — shapes are
submitted regardless of what is between them and the camera, and the gizmo pass decides
what is visible. Both modules reset always-on-top afterwards so the flag does not leak
into whatever renders next.

## OreESP (F7)

- `ObjectOpenHashSet<BlockPos>` of found ore; no block entities, no worker thread. The
  block list is a fastutil reference set, because the scan tests every visited block
  against it and identity hashing keeps that O(1).
- Rescans every 40 ticks: chunk coordinates in a `(RANGE >> 4) + 1` radius around the
  player, `mc.level.hasChunk(x, z)` first, then `scanChunk(level.getChunk(x, z))`. The
  first tick after enabling scans immediately, so the ESP is not empty for two seconds.
- `scanChunk` clamps Y to `[max(-64, level.getMinY()), min(320, level.getMaxY())]` and
  caps each column with the `WORLD_SURFACE` heightmap, so nothing above ground is visited.
  One reusable `BlockPos.MutableBlockPos`, `mp.immutable()` on a match.
- Clears on enable, on disable, and on dimension change (compared by
  `level.dimension().hashCode()`).
- Draws blocks within 64 of the eye position, one stroked cuboid each.
- Default ores: diamond, deepslate diamond, emerald, deepslate emerald, ancient debris,
  gold, deepslate gold, redstone, deepslate redstone, lapis, deepslate lapis. Coal and
  deepslate coal are one line away — add `Blocks.COAL_ORE` and `Blocks.DEEPSLATE_COAL_ORE`
  to `ORE_BLOCKS`.

No settings GUI: the tunables are `private static final` constants at the top of the class.

## SoundESP (F8)

Markers are a ring of 512 slots; the oldest is overwritten when it is full, and `tick()`
compacts the ring by age. Each marker is drawn as one stroked cuboid that grows from
`0.25` to `1.0` blocks and fades to alpha 0 over 1500 ms.

Two sources:

1. `ClientLevelMixin` forwards both `ClientLevel#playLocalSound` overloads — the funnel
   point where sound packets, level events and client-started sounds all meet, which is
   what catches chests, pistons, doors, levers, buttons, TNT, anvils and portals.
2. `tick()` scans `mc.level.entitiesForRendering()` every 2 ticks for an
   `AbstractMinecart` with `getDeltaMovement().lengthSqr() > 0.001` inside 48 blocks,
   because a cart's rolling sound is started by the client and never arrives as a packet.

Filters: sound ID (lowercased) must contain one of `minecart, rail, piston, chest, door,
lever, button, tnt, anvil, portal`; Y must be inside `-64..320`; distance at most 48
blocks.

## Freecam (F6)

`Vector3d pos` / `prev` (JOML) hold the camera; `Vec3 anchor` holds the body.

- **Enable** bails out through `toggle()` when there is no player, stores the anchor,
  seeds `pos`/`prev` from `mc.gameRenderer.mainCamera().getPosition()`, forces first
  person and asks the level renderer to rebuild every chunk.
- **Tick** reads the vanilla key states (`keyUp/keyDown/keyLeft/keyRight/keyJump/keyShift`,
  `keySprint` for ×3), moves at 0.5 blocks per tick on the flat plane built from
  `Vec3.directionFromRotation(0, player.getYRot())` and `+90`, then snaps the body back:
  `player.setPos(anchor)`, `player.setDeltaMovement(Vec3.ZERO)`, `player.resetFallDistance()`.
- **Camera rotation stays vanilla.** The mouse still turns the player, so only the position
  is overridden — that is why there is no `setRotation` hook and no mouse-look mixin.
- Snapping the body instead of swallowing input is also why there is no `KeyboardInput`
  mixin, and why the server keeps seeing a player that stands still. The visible cost is
  that the body jitters at the anchor in third person; nobody else can see it, because
  nothing is sent.
- `getX/getY/getZ(float tickDelta)` interpolate manually between `prev` and `pos`.

## Mapping-sensitive names

Written against Mojang mappings for 1.21.11. These are the names most likely to differ
between versions or mapping flavours; each one is also flagged in a comment where it is
used. Verify all of them at once with:

```
./gradlew genSources
```

then open `build/loom-cache/minecraft-merged-*-sources.jar` (or let your IDE attach it)
and check:

| Used here | Where to look in the generated sources | Fallback name |
|---|---|---|
| `Minecraft#tick()V` | `net/minecraft/client/Minecraft.java` | — (stable; `runTick` is the frame loop, not this) |
| `Minecraft#levelRenderer` + `allChanged()` | same file, field list | `levelExtractor` in some mappings |
| `Minecraft#isWindowActive()` | same file | `isWindowActive` / window-focus check |
| `mc.options.keyUp/keyDown/keyLeft/keyRight/keyJump/keyShift/keySprint` | `net/minecraft/client/Options.java` | `keyW/keyS/keyA/keyD` style names |
| `Options#getCameraType()/setCameraType`, `CameraType#isFirstPerson` | `Options.java`, `CameraType.java` | `getPerspective()` in Yarn |
| `Camera#alignWithEntity`, `Camera#getMaxZoom`, arg `cameraDist`, field `detached` | `net/minecraft/client/Camera.java` | `setup(BlockGetter, Entity, boolean, boolean, float)` (Yarn `update`) |
| `Camera#getPosition()` | same file | `getPos()` in Yarn |
| `ClientLevel#playLocalSound` — both descriptors | `net/minecraft/client/multiplayer/ClientLevel.java` | check the `Holder` / `SoundEvent` overloads and the trailing `boolean` |
| `SoundEvent#location()`, `ResourceLocation#toString()` | `net/minecraft/sounds/SoundEvent.java` | `getId()` in Yarn |
| `Level#getMinY()/getMaxY()`, `Level#hasChunk(int,int)`, `Level#getChunk(int,int)` | `net/minecraft/world/level/Level.java` | — |
| `Heightmap.Types.WORLD_SURFACE`, `Heightmap#getFirstAvailable(int,int)` | `net/minecraft/world/level/levelgen/Heightmap.java` | `get(int,int)` in Yarn |
| `ClientLevel#entitiesForRendering()` | `ClientLevel.java` | `getEntities()` in Yarn |
| `Entity#getDeltaMovement()`, `position()`, `getY()`, `setPos`, `resetFallDistance` | `net/minecraft/world/entity/Entity.java` | — |
| `AbstractMinecart` | `net/minecraft/world/entity/vehicle/` | check whether it moved to a `minecart` subpackage |
| `Gizmos`, `GizmoStyle` | not Minecraft: `net/fabricmc/fabric/api/client/rendering/v1/gizmo/` in the Fabric API sources jar | the vanilla gizmo pass, `net.minecraft.world.debug.gizmo.GizmoDrawing` with `DrawStyle` |
| `WorldRenderContext#tickDelta()` | `net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext.java` | a `DeltaTracker` accessor; take its game-time partial ticks |

Two things that are not names but will still break a build if they change:

- **`@Local(argsOnly = true, name = "partialTicks")`** in `CameraMixin` needs MixinExtras
  to see a parameter with that exact name. If the parameter is named differently, either
  rename it in the `@Local` or drop the annotation and pass `1.0f` — the camera is then one
  tick behind while flying, which is barely noticeable at 0.5 blocks per tick.
- **`defaultRequire: 1`** in `f1.mixins.json` means a mixin that does not apply crashes the
  game at startup instead of silently doing nothing. That is what you want while porting
  names; raise it to `0` per-injection only if you need the mod to survive a mapping drift.

## Unused lambda parameters

The toolchain is Java 21, so an unnamed parameter `_` does not compile (that is Java 22).
Unused parameters keep a real name everywhere in this mod.

## License

MIT, see `LICENSE`.
