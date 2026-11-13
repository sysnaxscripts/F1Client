package dev.f1client.module;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.gson.JsonObject;
import dev.f1client.setting.BoolSetting;
import dev.f1client.setting.IntSetting;
import org.junit.Before;
import org.junit.Test;

public class ModuleManagerTest {
	private static class Probe extends Module {
		final BoolSetting flag = add(new BoolSetting("Flag", false));
		final IntSetting amount = add(new IntSetting("Amount", 5, 0, 10));
		int enables;
		int disables;
		int ticks;
		int renders;

		Probe(String name) {
			super(name, "test module", Category.MISC);
		}

		@Override
		protected void onEnable() {
			enables++;
		}

		@Override
		protected void onDisable() {
			disables++;
		}

		@Override
		public void onTick() {
			ticks++;
		}

		@Override
		public void onRender(float tickDelta) {
			renders++;
		}
	}

	private static final class DefaultOn extends Probe {
		DefaultOn() {
			super("DefaultOn");
		}

		@Override
		public boolean enabledByDefault() {
			return true;
		}
	}

	private static final class Volatile extends Probe {
		Volatile() {
			super("Volatile");
		}

		@Override
		public boolean persistsEnabledState() {
			return false;
		}
	}

	private boolean unlocked;
	private int changes;
	private ModuleManager manager;
	private Probe probe;
	private DefaultOn defaultOn;
	private Volatile unsaved;

	@Before
	public void setUp() {
		unlocked = true;
		changes = 0;
		manager = new ModuleManager(() -> unlocked, () -> changes++);
		probe = manager.register(new Probe("Probe"));
		defaultOn = manager.register(new DefaultOn());
		unsaved = manager.register(new Volatile());
	}

	@Test
	public void lookupIsCaseInsensitiveAndNamesAreUnique() {
		assertSame(probe, manager.get("pRoBe"));
		assertSame(defaultOn, manager.get(DefaultOn.class));
		assertNull(manager.get("missing"));
		try {
			manager.register(new Probe("PROBE"));
			throw new AssertionError("duplicate name accepted");
		} catch (IllegalArgumentException expected) {
			// expected
		}
	}

	@Test
	public void lockedGateRefusesEnabling() {
		unlocked = false;
		probe.setEnabled(true);
		probe.toggle();
		assertFalse(probe.isEnabled());
		assertEquals(0, probe.enables);
		assertEquals(0, changes);
	}

	@Test
	public void lockedGateStillAllowsDisabling() {
		probe.setEnabled(true);
		unlocked = false;
		probe.setEnabled(false);
		assertFalse(probe.isEnabled());
		assertEquals(1, probe.disables);
	}

	@Test
	public void hooksRunOnlyForEnabledModulesWhileUnlocked() {
		probe.setEnabled(true);
		manager.tick();
		manager.render(0.5f);
		assertEquals(1, probe.ticks);
		assertEquals(1, probe.renders);
		assertEquals(0, defaultOn.ticks);

		unlocked = false;
		manager.tick();
		manager.render(0.5f);
		assertEquals(1, probe.ticks);
		assertEquals(1, probe.renders);
	}

	@Test
	public void enablingTwiceCallsTheHookOnce() {
		probe.setEnabled(true);
		probe.setEnabled(true);
		assertEquals(1, probe.enables);
		assertEquals(1, changes);
	}

	@Test
	public void disableAllSwitchesEverythingOff() {
		probe.setEnabled(true);
		defaultOn.setEnabled(true);
		manager.disableAll();
		assertFalse(probe.isEnabled());
		assertFalse(defaultOn.isEnabled());
		assertEquals(1, probe.disables);
	}

	@Test
	public void resetAllRestoresDefaultsIncludingDefaultOnModules() {
		probe.setEnabled(true);
		probe.flag.set(true);
		probe.amount.set(9);
		probe.keybind().set(70);
		changes = 0;

		manager.resetAll();

		assertFalse(probe.isEnabled());
		assertFalse(probe.flag.get());
		assertEquals(5, (int) probe.amount.get());
		assertFalse(probe.keybind().isBound());
		assertTrue(defaultOn.isEnabled());
		assertEquals("one save for the whole reset", 1, changes);
	}

	@Test
	public void resetAllKeepsDefaultOnModulesOffWhileLocked() {
		unlocked = false;
		manager.resetAll();
		assertFalse(defaultOn.isEnabled());
	}

	@Test
	public void jsonRoundTripRestoresStateWithoutSaving() {
		probe.setEnabled(true);
		probe.flag.set(true);
		probe.amount.set(7);
		probe.keybind().set(82);
		unsaved.setEnabled(true);
		JsonObject stored = manager.toJson();

		manager.disableAll();
		manager.resetAll();
		changes = 0;
		manager.fromJson(stored);

		assertTrue(probe.isEnabled());
		assertTrue(probe.flag.get());
		assertEquals(7, (int) probe.amount.get());
		assertEquals(82, probe.keybind().get().intValue());
		assertFalse("a module that opts out is never restored as enabled", unsaved.isEnabled());
		assertEquals("loading must not schedule a save", 0, changes);
	}

	@Test
	public void modulesMissingFromStoredProfileStartFromDefaults() {
		probe.setEnabled(true);
		JsonObject stored = manager.toJson();
		stored.remove("DefaultOn");
		stored.remove("Probe");
		probe.amount.set(1);
		manager.disableAll();

		manager.fromJson(stored);

		assertTrue(defaultOn.isEnabled());
		assertFalse(probe.isEnabled());
		assertEquals(5, (int) probe.amount.get());
	}

	@Test
	public void storedProfileCannotEnableModulesWhileLocked() {
		probe.setEnabled(true);
		JsonObject stored = manager.toJson();
		manager.disableAll();
		unlocked = false;

		manager.fromJson(stored);

		assertFalse(probe.isEnabled());
		assertFalse(defaultOn.isEnabled());
	}
}
