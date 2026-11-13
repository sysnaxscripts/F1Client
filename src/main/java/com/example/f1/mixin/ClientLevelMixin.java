package com.example.f1.mixin;

import com.example.f1.Modules;
import com.example.f1.modules.SoundESP;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * The sound hook for {@link SoundESP}.
 *
 * <p>{@code ClientLevel#playLocalSound} is the funnel point every locally played sound
 * passes through: sound packets from the server, {@code LevelEvent}s, and the sounds
 * entities and blocks start on the client. Reading it therefore catches chests, pistons,
 * doors, portals and minecarts without touching the network. Both overloads are hooked
 * because callers are split between them.
 *
 * <p>Nothing is cancelled and no packet is created; the hook only reads coordinates and
 * the sound's registry ID.
 *
 * <p>MAPPING NOTE: the two descriptors below are the Mojang-mapped signatures of
 * {@code ClientLevel#playLocalSound} ({@code Holder} overload and {@code SoundEvent}
 * overload, both ending in the distance-delay flag). They are spelled out because the two
 * overloads are ambiguous to Mixin otherwise. Confirm them with {@code ./gradlew genSources}
 * if the mixin fails to apply: search {@code ClientLevel.java} for {@code playLocalSound}.
 */
@Mixin(ClientLevel.class)
public abstract class ClientLevelMixin {
	@Inject(method = "playLocalSound(DDDLnet/minecraft/core/Holder;Lnet/minecraft/sounds/SoundSource;FFZ)V",
			at = @At("HEAD"))
	private void f1$onPlayLocalSoundHolder(double x, double y, double z, Holder<SoundEvent> sound, SoundSource source,
			float volume, float pitch, boolean distanceDelay, CallbackInfo ci) {
		SoundESP soundEsp = SoundESP.INSTANCE;
		if (soundEsp != null && Modules.enabled(SoundESP.class) && sound != null && sound.value() != null) {
			soundEsp.onSound(x, y, z, sound.value().location().toString());
		}
	}

	@Inject(method = "playLocalSound(DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V",
			at = @At("HEAD"))
	private void f1$onPlayLocalSoundEvent(double x, double y, double z, SoundEvent sound, SoundSource source,
			float volume, float pitch, boolean distanceDelay, CallbackInfo ci) {
		SoundESP soundEsp = SoundESP.INSTANCE;
		if (soundEsp != null && Modules.enabled(SoundESP.class) && sound != null) {
			soundEsp.onSound(x, y, z, sound.location().toString());
		}
	}
}
