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
  mixin/ClientLevelMixin.java  playLocalSound -> SoundESP (local sounds)
  mixin/SoundManagerMixin.java SoundManager#play -> SoundESP (server sound packets)
  mixin/CameraMixin.java       zoom clip, detached flag, camera position -> Freecam
src/main/resources/
  fabric.mod.json          client entrypoint + mixin config + depends
  f1.mixins.json           JAVA_21, client: [CameraMixin, ClientLevelMixin,
                                             MinecraftMixin, SoundManagerMixin]
```

`Modules.tick()` both polls the keys and ticks the modules, so one mixin drives the whole
client: GLFW is read once per tick with press-edge detection, which is why a tap shorter
than a tick still toggles, and why no `Keyboard` mixin is needed.

There are no unit tests or in-client game tests in this revision; the previous Yarn-mapped
client (which had both) is in git history at `645f13b` on `main`.

`.github/workflows/build.yml` builds on every push and uploads the jar. When the build
fails it also commits the filtered Gradle log and the API probe back to the branch as
`build-report/README.md`, because the Actions log and artifact storage are not reachable
from every environment that works on this repo.

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
   `AbstractMinecart` with `getDeltaMovement().lengthSqr() > 0.001` inside 48 blocks,
   because a cart's rolling sound is started by the client and never arrives as a packet.

Hooks 1 and 2 are on the same path for a locally played sound, so `add()` drops a marker
that duplicates one from the last 60 ms within 0.35 blocks.

**Version note.** 1.21.11 has exactly one positional `playLocalSound` —
`(double, double, double, SoundEvent, SoundSource, float, float, boolean)`. The
`Holder<SoundEvent>` overload older versions had is gone, and a mixin naming it would not
fail at compile time (descriptors are strings): under `defaultRequire: 1` it would crash the
game at startup.

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

| Used here | Status for the mapped 1.21.11 jar | Notes |
|---|---|---|
| `Minecraft#tick()V` | verified | `MinecraftMixin` injects at its tail |
| `Minecraft#levelRenderer` + `LevelRenderer#allChanged()` | verified | public field; the spec's `levelExtractor` name does not exist here |
| `Minecraft#isWindowActive()`, `getWindow()`, `getDeltaTracker()`, `options`, `gameRenderer`, `level`, `player` | verified | — |
| `Window#handle()` | verified | record-style accessor; older versions used `getWindow()` / `getHandle()` |
| `DeltaTracker#getGameTimeDeltaPartialTick(boolean)` | verified | singular `Tick`; `getGameTimeDeltaTicks()` and `getRealtimeDeltaTicks()` are the other two |
| `Options#keyUp/keyDown/keyLeft/keyRight/keyJump/keyShift/keySprint`, `getCameraType()`, `setCameraType(...)` | verified | all `KeyMapping` fields, so `isDown()` reads them |
| `CameraType#FIRST_PERSON`, `isFirstPerson()` | verified | — |
| `Camera#setup(Level, Entity, boolean, boolean, float)` | verified | no `alignWithEntity` in this version; Yarn calls it `update` |
| `Camera#getMaxZoom(F)F` | verified | `private`, one float parameter — hooked by ordinal, not by name |
| `Camera#setPosition(DDD)`, `setPosition(Vec3)`, field `detached` | verified | both overloads are hooked with `require = 0` |
| `Camera#position()` | verified | `getPosition()` in some Mojang-mapped versions, `getPos()` in Yarn |
| `GameRenderer#getMainCamera()` | verified | not `mainCamera()` in this version |
| `net.minecraft.gizmos.{Gizmos,GizmoStyle,GizmoProperties}` | verified | Fabric API has no gizmo package, and `net.minecraft.world.debug.gizmo` does not exist under Mojang mappings |
| `net.minecraft.world.entity.vehicle.minecart.AbstractMinecart` | verified | it used to sit directly in `vehicle` |
| `ClientLevel#playLocalSound(DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V` | verified | the only positional overload; the `Holder` variant does not exist in 1.21.11 |
| `ClientLevel#entitiesForRendering()` | verified | returns `Iterable<Entity>` |
| `SoundManager#play(SoundInstance)`, `#playDelayed(SoundInstance, int)` | verified | `play` returns `SoundEngine$PlayResult`; both are hooked by `SoundManagerMixin` |
| `SoundInstance#getIdentifier()/getX()/getY()/getZ()` | verified | interface, so positions arrive already resolved |
| `ClientPacketListener#handleSoundEvent(ClientboundSoundPacket)` and `#handleSoundEntityEvent(ClientboundSoundEntityPacket)` | verified, not hooked | `SoundManager#play` downstream of them already covers both, without an entity-id lookup |
| `SoundEvent#location()` | verified | `SoundEvent` is a record of `(Identifier location, Optional<Float> fixedRange)` |
| `Level#getMinY()/getMaxY()/hasChunk(int,int)/getChunk(int,int)`, `Heightmap.Types.WORLD_SURFACE`, `Heightmap#getFirstAvailable(int,int)`, `ClientLevel#entitiesForRendering()`, `Entity#getDeltaMovement()/position()/getY()/setPos/resetFallDistance`, `SoundEvent#location()`, `ResourceLocation#toString()` | compiled clean | javac resolved every one of them |
| `WorldRenderContext` | verified | Fabric API 16.2.x: `gameRenderer()`, `worldRenderer()`, `worldState()`, `matrices()`, `consumers()`, `commandQueue()`, `sectionState()` — and no tick delta |

The verified rows were read off `build/probe-api.txt` produced by the `probeApi` task
described below against `minecraft-merged-*-1.21.11-*.jar` on
`loom.mappings.1_21_11.layered+hash.2198-v2`:
`net.minecraft.gizmos.{Gizmos,GizmoStyle,GizmoProperties}`,
`net.minecraft.world.entity.vehicle.minecart.AbstractMinecart`,
`Camera#setup(Level,Entity,boolean,boolean,float)`, `Camera#getMaxZoom(F)F`,
`Camera#setPosition(DDD)`, `Camera#setPosition(Vec3)`, the `Camera#detached` field and
`LevelRenderer#allChanged()`.

Two things that are not names but will still break a build if they change:

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
what `javac` saw — lists every class matching `-PprobePattern`
(default `gizmo|debugrender|minecart|levelrenderer`) together with the packages they live
in, and prints `javap -p` output for the classes matching `-PprobeDumpPattern`
(default `client.Minecraft|WorldRenderContext|GizmoCollector|TemporaryCollection`).

```
./gradlew probeApi -PprobePattern='gizmo' -PprobeDumpPattern='gizmos.Gizmos'
```

It does not depend on compiling, so it still reports when the build is broken — which is
the moment it is useful. CI runs it after every build, and a **failed** build commits the
probe output plus the filtered Gradle log back to the branch as `build-report/README.md`
(with the skip-ci mark, so that commit does not retrigger the workflow). A green build just
uploads the jar. That directory is CI output, not source.

## Unused lambda parameters

The toolchain is Java 21, so an unnamed parameter `_` does not compile (that is Java 22).
Unused parameters keep a real name everywhere in this mod.

## License

MIT, see `LICENSE`.
