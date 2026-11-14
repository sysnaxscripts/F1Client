package com.example.f1.mixin;

import com.example.f1.Modules;
import com.example.f1.modules.SoundESP;
import net.minecraft.client.resources.sounds.SoundInstance;
import net.minecraft.client.sounds.SoundManager;
import net.minecraft.client.sounds.SoundEngine.PlayResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * The second sound hook for {@link SoundESP}, and the one that covers other players.
 *
 * <p>{@code ClientLevel#playLocalSound} only sees sounds the local client starts itself.
 * Sound packets from the server — {@code ClientboundSoundPacket} and
 * {@code ClientboundSoundEntityPacket} — are turned into a {@link SoundInstance} and handed
 * straight to the sound engine, so a chest, piston or door operated by somebody else never
 * passes through {@code ClientLevel}. Every audible sound does pass through
 * {@code SoundManager#play}, and a {@code SoundInstance} already carries both its identifier
 * and its resolved position, including the position of an entity-attached sound.
 *
 * <p>Verified against the mapped 1.21.11 jar:
 *
 * <pre>{@code
 * public SoundEngine$PlayResult play(SoundInstance)
 * public void playDelayed(SoundInstance, int)
 * interface SoundInstance { Identifier getIdentifier(); double getX(); double getY(); double getZ(); ... }
 * }</pre>
 *
 * <p>Because this is downstream of {@code playLocalSound}, a sound the client plays locally
 * reaches both hooks. {@link SoundESP#onSound} drops a marker that duplicates one it just
 * added at the same spot, so the two never stack.
 *
 * <p>Nothing is cancelled; the sound plays exactly as vanilla intended.
 */
@Mixin(SoundManager.class)
public abstract class SoundManagerMixin {
	@Inject(method = "play(Lnet/minecraft/client/resources/sounds/SoundInstance;)Lnet/minecraft/client/sounds/SoundEngine$PlayResult;",
			at = @At("HEAD"))
	private void f1$onPlay(SoundInstance sound, CallbackInfoReturnable<PlayResult> ci) {
		f1$forward(sound);
	}

	@Inject(method = "playDelayed(Lnet/minecraft/client/resources/sounds/SoundInstance;I)V", at = @At("HEAD"))
	private void f1$onPlayDelayed(SoundInstance sound, int delay, CallbackInfo ci) {
		f1$forward(sound);
	}

	/** Shared body of the two injectors: reads one sound instance and forwards it. */
	private void f1$forward(SoundInstance sound) {
		SoundESP soundEsp = SoundESP.INSTANCE;
		if (soundEsp == null || !Modules.enabled(SoundESP.class) || sound == null || sound.getIdentifier() == null) {
			return;
		}
		soundEsp.onSound(sound.getX(), sound.getY(), sound.getZ(), sound.getIdentifier().toString());
	}
}
