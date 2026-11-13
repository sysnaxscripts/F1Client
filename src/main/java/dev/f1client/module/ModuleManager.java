package dev.f1client.module;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BooleanSupplier;

/**
 * Registry and dispatcher of all modules.
 *
 * <p>The manager is where the account gate meets the module system: enabling, ticking
 * and rendering are skipped while {@code unlocked} is false, and {@link #disableAll()}
 * is invoked on logout and session expiry.
 */
public final class ModuleManager implements Module.Host {
	private final Map<String, Module> byName = new LinkedHashMap<>();
	private final List<Module> modules = new ArrayList<>();
	private final BooleanSupplier unlocked;
	private final Runnable changeListener;
	private boolean loading;

	/**
	 * @param unlocked       whether client features are currently permitted
	 * @param changeListener invoked after any module state or setting change (config save hook)
	 */
	public ModuleManager(BooleanSupplier unlocked, Runnable changeListener) {
		this.unlocked = unlocked;
		this.changeListener = changeListener;
	}

	/** Adds a module. Names are unique, case-insensitively. */
	public <M extends Module> M register(M module) {
		String key = key(module.name());
		if (byName.containsKey(key)) {
			throw new IllegalArgumentException("Duplicate module: " + module.name());
		}
		byName.put(key, module);
		modules.add(module);
		module.attach(this);
		return module;
	}

	/** @return the module with that name (case-insensitive), or {@code null}. */
	public Module get(String name) {
		return byName.get(key(name));
	}

	/** @return the registered module of the given class, or {@code null}. */
	public <M extends Module> M get(Class<M> type) {
		for (Module module : modules) {
			if (type.isInstance(module)) {
				return type.cast(module);
			}
		}
		return null;
	}

	/** @return all modules in registration order (read-only view). */
	public List<Module> all() {
		return Collections.unmodifiableList(modules);
	}

	/** @return the modules of one category in registration order. */
	public List<Module> byCategory(Category category) {
		List<Module> result = new ArrayList<>();
		for (Module module : modules) {
			if (module.category() == category) {
				result.add(module);
			}
		}
		return result;
	}

	/** Switches every module off. Used on logout, expiry, disconnect of the gate. */
	public void disableAll() {
		for (Module module : modules) {
			module.setEnabled(false);
		}
	}

	/** Dispatches the client tick to enabled modules while the gate is open. */
	public void tick() {
		if (!unlocked.getAsBoolean()) {
			return;
		}
		for (int i = 0; i < modules.size(); i++) {
			Module module = modules.get(i);
			if (module.isEnabled()) {
				module.onTick();
			}
		}
	}

	/** Dispatches the world-render hook to enabled modules while the gate is open. */
	public void render(float tickDelta) {
		if (!unlocked.getAsBoolean()) {
			return;
		}
		for (int i = 0; i < modules.size(); i++) {
			Module module = modules.get(i);
			if (module.isEnabled()) {
				module.onRender(tickDelta);
			}
		}
	}

	/** Tells every module that the client world was swapped or closed. */
	public void worldChanged() {
		for (Module module : modules) {
			module.onWorldChange();
		}
	}

	/** Restores all settings and keybinds to defaults and switches everything off. */
	public void resetAll() {
		loading = true;
		try {
			for (Module module : modules) {
				module.setEnabled(false);
				module.resetSettings();
				module.keybind().reset();
			}
		} finally {
			loading = false;
		}
		changeListener.run();
	}

	/** @return every module's persisted form keyed by module name. */
	public JsonObject toJson() {
		JsonObject json = new JsonObject();
		for (Module module : modules) {
			json.add(module.name(), module.toJson());
		}
		return json;
	}

	/** Applies persisted module data without triggering a save for each restored value. */
	public void fromJson(JsonObject json) {
		if (json == null) {
			return;
		}
		loading = true;
		try {
			for (Module module : modules) {
				JsonElement element = json.get(module.name());
				if (element != null && element.isJsonObject()) {
					module.fromJson(element.getAsJsonObject());
				}
			}
		} finally {
			loading = false;
		}
	}

	@Override
	public boolean featuresUnlocked() {
		return unlocked.getAsBoolean();
	}

	@Override
	public void moduleChanged(Module module) {
		if (!loading) {
			changeListener.run();
		}
	}

	private static String key(String name) {
		return name.toLowerCase(Locale.ROOT);
	}
}
