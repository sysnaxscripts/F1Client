package com.example.f1.mixin;

import com.example.f1.Modules;
import com.example.f1.modules.SoundESP;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * The sound hook for {@link SoundESP}.
 *
 * <p>{@code ClientLevel#playLocalSound} is where everything the client starts itself ends
 * up: level events, blocks and entities playing into the level, and — the reason this
 * module needs it — a minecart's rolling sound, which never arrives as a packet.
 *
 * <p>Verified against the mapped 1.21.11 jar, {@code ClientLevel} has exactly one
 * positional {@code playLocalSound}:
 *
 * <pre>{@code
 * public void playLocalSound(double, double, double, SoundEvent, SoundSource, float, float, boolean)
 * }</pre>
 *
 * There is no {@code Holder<SoundEvent>} overload in this version (older ones had both, and
 * a mixin naming one that is not there fails at startup under {@code defaultRequire: 1}),
 * and the entity-attached {@code playLocalSound(Entity, SoundEvent, SoundSource, float,
 * float)} carries no position of its own, so it is left alone.
 *
 * <p>What this hook does <em>not</em> see: {@code ClientboundSoundPacket} and
 * {@code ClientboundSoundEntityPacket} from the server are handed to the sound engine by
 * {@code ClientPacketListener} without going through {@code ClientLevel}. Chests, pistons
 * and doors opened by <em>other</em> players therefore need that handler hooked as well;
 * this one covers everything the local client plays.
 *
 * <p>Nothing is cancelled and no packet is created; the hook only reads coordinates and the
 * sound's registry ID.
 */
@Mixin(ClientLevel.class)
public abstract class ClientLevelMixin {
	@Inject(method = "playLocalSound(DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V",
			at = @At("HEAD"))
	private void f1$onPlayLocalSound(double x, double y, double z, SoundEvent sound, SoundSource source,
			float volume, float pitch, boolean distanceDelay, CallbackInfo ci) {
		SoundESP soundEsp = SoundESP.INSTANCE;
		if (soundEsp != null && Modules.enabled(SoundESP.class) && sound != null) {
			soundEsp.onSound(x, y, z, sound.location().toString());
		}
	}
}
