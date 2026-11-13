package dev.f1client.module;

/**
 * Sidebar groups of the ClickGUI. Version 1 ships modules in {@link #PLAYER},
 * {@link #VISUALS} and {@link #WORLD}; the rest are reserved for future modules and
 * stay hidden while empty.
 */
public enum Category {
	COMBAT("Combat"),
	MOVEMENT("Movement"),
	PLAYER("Player"),
	VISUALS("Visuals"),
	WORLD("World"),
	MISC("Misc");

	private final String label;

	Category(String label) {
		this.label = label;
	}

	/** @return display name. */
	public String label() {
		return label;
	}
}
