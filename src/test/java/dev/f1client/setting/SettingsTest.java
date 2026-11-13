package dev.f1client.setting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.gson.JsonPrimitive;
import org.junit.Test;

public class SettingsTest {
	private enum Mode {
		ONE, TWO, THREE
	}

	@Test
	public void doubleSnapsToStepAndClamps() {
		DoubleSetting speed = new DoubleSetting("Speed", 3.0, 1.0, 10.0, 0.5);
		speed.set(3.26);
		assertEquals(3.5, speed.get(), 1e-9);
		speed.set(99.0);
		assertEquals(10.0, speed.get(), 1e-9);
		speed.set(-4.0);
		assertEquals(1.0, speed.get(), 1e-9);
		assertEquals(1, speed.decimals());
	}

	@Test
	public void intClamps() {
		IntSetting distance = new IntSetting("Distance", 64, 8, 128);
		distance.set(500);
		assertEquals(128, (int) distance.get());
		distance.set(0);
		assertEquals(8, (int) distance.get());
	}

	@Test
	public void jsonRoundTrip() {
		DoubleSetting d = new DoubleSetting("D", 1.0, 0.0, 2.0, 0.01);
		d.set(1.37);
		DoubleSetting d2 = new DoubleSetting("D", 1.0, 0.0, 2.0, 0.01);
		d2.fromJson(d.toJson());
		assertEquals(1.37, d2.get(), 1e-9);

		EnumSetting<Mode> e = new EnumSetting<>("Mode", Mode.ONE);
		e.cycle(1);
		assertEquals(Mode.TWO, e.get());
		e.cycle(-2);
		assertEquals(Mode.THREE, e.get());
		EnumSetting<Mode> e2 = new EnumSetting<>("Mode", Mode.ONE);
		e2.fromJson(e.toJson());
		assertEquals(Mode.THREE, e2.get());

		ColorSetting c = new ColorSetting("Color", 0xFF112233);
		c.set(0x80ABCDEF);
		ColorSetting c2 = new ColorSetting("Color", 0xFF112233);
		c2.fromJson(c.toJson());
		assertEquals(0x80ABCDEF, (int) c2.get());

		KeybindSetting k = new KeybindSetting("Key", KeybindSetting.UNBOUND);
		assertFalse(k.isBound());
		k.set(70);
		KeybindSetting k2 = new KeybindSetting("Key", KeybindSetting.UNBOUND);
		k2.fromJson(k.toJson());
		assertTrue(k2.matches(70));

		StringSetting s = new StringSetting("Name", "", 4);
		s.set("abcdefgh");
		assertEquals("abcd", s.get());

		BoolSetting b = new BoolSetting("Flag", false);
		b.toggle();
		BoolSetting b2 = new BoolSetting("Flag", false);
		b2.fromJson(b.toJson());
		assertTrue(b2.get());
	}

	@Test
	public void malformedJsonKeepsCurrentValue() {
		IntSetting i = new IntSetting("I", 5, 0, 10);
		i.fromJson(new JsonPrimitive("not a number"));
		assertEquals(5, (int) i.get());

		EnumSetting<Mode> e = new EnumSetting<>("Mode", Mode.TWO);
		e.fromJson(new JsonPrimitive("NOPE"));
		assertEquals(Mode.TWO, e.get());

		assertNull(ColorSetting.parse("zzz"));
	}

	@Test
	public void changeListenerFiresOnlyOnRealChange() {
		int[] calls = {0};
		BoolSetting b = new BoolSetting("Flag", false);
		b.onChange(() -> calls[0]++);
		b.set(false);
		assertEquals(0, calls[0]);
		b.set(true);
		assertEquals(1, calls[0]);
		b.reset();
		assertEquals(2, calls[0]);
	}
}
