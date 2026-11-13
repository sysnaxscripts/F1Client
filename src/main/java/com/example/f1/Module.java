package com.example.f1;

/**
 * Base class of every feature of this client.
 *
 * <p>A module owns a name, an optional GLFW keycode and an enabled flag. {@link Modules}
 * drives it: it polls the key once per client tick, toggles on the press edge, and calls
 * {@link #tick()} and {@link #render(float)} only while the module is enabled.
 *
 * <p>Implementations must tolerate being ticked or rendered with no world loaded, so every
 * hook starts with a null check on {@code mc.level} / {@code mc.player}.
 */
public abstract class Module {
	/**
	 * The client instance. Valid from mod initialisation onwards, which is when modules are
	 * constructed; spelled out so this base class needs no imports of its own.
	 */
	protected static final net.minecraft.client.Minecraft mc = net.minecraft.client.Minecraft.getInstance();

	private final String name;
	private final int key;
	private boolean enabled;

	/**
	 * @param name name shown in the log and used to identify the module
	 * @param key  GLFW keycode that toggles it, or {@code GLFW_KEY_UNKNOWN} for none
	 */
	protected Module(String name, int key) {
		this.name = name;
		this.key = key;
	}

	/** @return the module's name. */
	public String getName() {
		return name;
	}

	/** @return the GLFW keycode that toggles this module, or 0 when unbound. */
	public int getKey() {
		return key;
	}

	/** @return whether the module is currently enabled. */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Switches the module on or off without looking at its key.
	 *
	 * <p>Fails safely: an {@link #onEnable()} that throws (most often because no world is
	 * loaded) leaves the module disabled and logs, rather than leaving a half-enabled
	 * module behind.
	 *
	 * @return the resulting state
	 */
	public boolean toggle() {
		if (enabled) {
			enabled = false;
			try {
				onDisable();
			} catch (RuntimeException e) {
				F1Client.LOGGER.error("Error disabling {}", name, e);
			}
			return false;
		}
		try {
			onEnable();
			enabled = true;
		} catch (RuntimeException e) {
			enabled = false;
			F1Client.LOGGER.error("Error enabling {}", name, e);
		}
		return enabled;
	}

	/** Switches the module on. */
	public void setEnabled(boolean value) {
		if (value != enabled) {
			toggle();
		}
	}

	/** Called after the module became enabled. */
	protected void onEnable() {
	}

	/** Called after the module became disabled. */
	protected void onDisable() {
	}

	/**
	 * Called once per client tick while enabled, from the tail of {@code Minecraft#tick},
	 * so it runs on the render thread with the world ticked for this frame.
	 */
	public void tick() {
	}

	/**
	 * Called once per frame while enabled, from
	 * {@code WorldRenderEvents.AFTER_ENTITIES}.
	 *
	 * @param tickDelta partial tick in {@code [0,1)}
	 */
	public void render(float tickDelta) {
	}

	@Override
	public String toString() {
		return name + "(" + (enabled ? "on" : "off") + ")";
	}
}
