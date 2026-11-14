package com.example.f1;

/**
 * The sidebar categories of the ClickGUI.
 *
 * <p>The icon drawn next to each name comes from the bundled set under
 * {@code assets/f1/textures/gui/}; {@code ClickGuiScreen#iconOf} makes that pairing, so a
 * category stays a plain enum with no dependency on the icon atlas.
 */
public enum Category {
	/** World scanning: ore and sound ESP. */
	WORLD("World"),
	/** Player and camera. */
	PLAYER("Player"),
	/** Combat. Reserved; no module ships in it yet. */
	COMBAT("Combat"),
	/** Movement. Reserved; no module ships in it yet. */
	MOVEMENT("Movement"),
	/** On-screen drawing: HUD and overlays. */
	VISUALS("Visuals"),
	/** Client configuration. */
	MISC("Misc");

	private static final Category[] VALUES = values();

	private final String label;

	Category(String label) {
		this.label = label;
	}

	/** @return the sidebar label. */
	public String label() {
		return label;
	}

	/** @return the constants without the defensive copy made by {@link #values()}. */
	public static Category[] all() {
		return VALUES;
	}
}
