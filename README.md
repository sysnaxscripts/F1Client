# F1Client

A client-side Fabric mod for Minecraft **1.21.11** with an account gate, a glass-style
ClickGUI, and three modules: **OreDetection** (ore ESP), **SoundDetection** (finds ores
other players mine from the sounds they cause) and **Freecam**.

Everything is client-side. The mod never creates, changes or suppresses a packet; the
sound and block hooks only read what the server already sent.

| | |
|---|---|
| Minecraft | 1.21.11 |
| Loader | Fabric Loader ≥ 0.17.0, Fabric API |
| Java | 21 |
| Client key | Right Shift (rebindable in Settings) |

## Build and install

```
./gradlew build
```

The mod jar is `build/libs/f1client-<version>.jar`. Put it in `.minecraft/mods` together
with Fabric API.

## Accounts

The client is locked until you are signed in. While it is locked:

- the client key opens the register / sign-in screen instead of the ClickGUI;
- no module can be enabled, ticked or rendered, and module keybinds do nothing;
- the HUD draws nothing and `config.json` is not read.

Files live in `.minecraft/config/f1client/`:

| File | Content |
|---|---|
| `auth.json` | Pre-login settings: `apiBaseUrl`, `backend`, last username, "stay signed in". No secrets. |
| `session.dat` | The session tokens, AES-256-GCM encrypted with a key derived (PBKDF2, 210,000 rounds) from a device fingerprint. Copying it to another machine does not work. Written only with "Stay signed in" on. |
| `config.json` | One profile per account: module states, settings, keybinds, favourites, theme. Loaded after sign-in, saved half a second after the last change and on exit. |
| `mock-accounts.json` | Accounts of the built-in mock backend (salted PBKDF2 hashes, never plain passwords). |

Passwords are held in memory only while the form is open, are sent as a `char[]` that is
wiped after the request, are never logged and never written to disk.

### Connecting your account server

`auth.json` ships with `"apiBaseUrl": "[YOUR API URL]"`. Until you put a real HTTPS URL
there, the client uses a **local mock backend** so it can be used and tested without a
server; both screens say so. `backend` may be `auto` (default: mock until a URL is set),
`http` or `mock`.

The server must implement:

| Request | Body | Success |
|---|---|---|
| `POST /auth/register` | `{"username","password"}` | 200/201 token response |
| `POST /auth/login` | `{"username","password"}` | 200 token response |
| `POST /auth/refresh` | `{"refreshToken"}` | 200 token response (rotate the refresh token) |
| `GET /auth/me` | `Authorization: Bearer <access>` | 200 `{"username"}` |
| `POST /auth/logout` | Bearer + `{"refreshToken"}` | 200/204 |

Token response: `{"username","accessToken","refreshToken","expiresIn": <seconds>}`.
Status codes map to messages: 401/403 wrong credentials or expired session, 409 name
taken, 429 rate limited, 5xx server error, no connection → offline. Plain `http://` is
refused except for `localhost`.

The access token is refreshed shortly before it expires. If the server cannot be reached
the client keeps working in **offline mode** for up to 7 days after the last successful
validation; if the server rejects the session, the gate closes at once: every module is
switched off and the profile is unloaded.

## Using the client

Press **Right Shift**. Sidebar: Favorites, the categories, Settings, and your account
with a sign-out button. Main area: search bar and module cards (click a card for its
settings, the star to pin it, the switch to toggle it).

| Input | Action |
|---|---|
| Type, Ctrl+F | Search modules |
| Tab / arrows | Move the highlight |
| Enter | Open the highlighted module's settings |
| Space | Toggle the highlighted module |
| Right click on a setting | Reset it |
| Esc | Close the settings panel, then the GUI |

Settings → Client: client key, accent colour, interface sounds.

## Modules

### OreDetection (World)

Draws boxes and optional tracers on ores through walls: diamond, deepslate diamond,
ancient debris, emerald, deepslate emerald, gold, deepslate gold, iron, redstone, lapis,
nether gold, nether quartz, copper. Each ore has its own switch, colour and range.

Settings: outline, filled, tracers, line width, fill alpha, max distance, min/max Y,
only exposed ores, skip ores in the view frustum, max boxes.

How it stays cheap: chunks are scanned once when they load, a few per tick inside a
1.5 ms budget and nearest first; sections whose palette has no ore are skipped without
touching their blocks; single block changes update the index in place. The draw list is
rebuilt at most twice a second and capped ("Max boxes", nearest first).

### SoundDetection (World)

Reports ores that *other players* break (optionally place, walk on, hit).

Two sources are read:

1. the block-break world event, which is what a vanilla server sends to bystanders when a
   block is broken, and names the block exactly;
2. positional sound packets (`minecraft:block.*.break/place/step/hit`), classified with
   the table in `assets/f1client/sounds/ore_map.json`.

A sound packet is then pinned to a real ore block next to its origin, scored
(pitch match 30 %, proximity 15 %, block resolution 55 %), filtered by the confidence
threshold and de-duplicated. Stone and deepslate ores share their sounds with plain
stone and deepslate, so those are only reported when an actual ore block is found at
the position; nether gold, nether quartz and ancient debris have sounds of their own.

Each alert is added to the HUD list, highlighted in the world for a few seconds, and can
beep (higher = closer), be spoken, and be printed to chat as a line that copies the
coordinates when clicked. Chat lines are local; nothing is sent.

Limits you should know: a server only sends sounds and block events within its own
broadcast range (16 blocks × volume for sounds, 64 blocks for block breaks), so the
"Detection radius" setting can narrow that range but never widen it. Anti-xray servers
that hide ores also hide them from this module until they are exposed.

### Freecam (Player)

Detaches the camera. Your player does not move or turn and no packet is touched; the
server cannot tell the difference from standing still. WASD, jump and sneak fly the
camera, sprint is faster.

Settings: speed, sprint multiplier, hide hand, freeze player input, return on damage,
return on key release (hold-to-use), extra render distance (client-side only: it can
show more of what the server already sent, never more than that).

Freecam is never restored as "on" from the config.

### HUD (Visuals)

Watermark, list of enabled modules, ore counts, sound alert list, Freecam read-out. Each
part has its own switch.

## Design notes

- **Layout.** The original brief described draggable category panels; the reference
  screenshots show one fixed window with a sidebar, card grid and settings panel. The
  screenshots were followed.
- **Scaling.** The GUI is laid out in its own units and scaled from the window size, so
  it looks the same at every vanilla GUI scale. Text uses the bundled Inter typeface
  (SIL OFL 1.1), rasterised at the exact on-screen size.
- **ESP rendering** uses the game's own world-gizmo pass, so boxes are depth-sorted by
  the game and need no custom shaders.
- **Keybinds** are handled from key events, so a quick tap is never missed. A module bind
  equal to the client key is ignored.

## Tests

```
./gradlew test               # 79 unit tests: auth, session store, settings, modules, config, sound pipeline
./gradlew runClientGameTest  # starts a real client and drives it (needs a display; Loom uses xvfb on CI)
```

The client game test (`src/gametest`) registers an account by typing into the form,
checks that nothing works while locked, opens the ClickGUI, places ores and checks the
ESP, breaks an ore and plays ore sounds and checks the alerts, flies Freecam and checks
that the player did not move, audits every mixin, signs out and back in. It saves
screenshots of each step to `build/run/clientGameTest/screenshots`.

GitHub Actions runs both on every push and uploads the mod jar and the screenshots as
artifacts. Publishing a GitHub release builds the tagged commit and attaches the mod jar
and a source zip to it (`.github/workflows/release.yml`).

## License

MIT, see `LICENSE`. Inter is © The Inter Project Authors, SIL Open Font License 1.1
(`src/main/resources/assets/f1client/font/OFL.txt`).
