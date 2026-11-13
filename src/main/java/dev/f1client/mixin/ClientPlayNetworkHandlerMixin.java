package dev.f1client.mixin;

import dev.f1client.F1Client;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Observes incoming sound packets for SoundDetection. The packets are only read; they are
 * never cancelled or changed, and nothing is sent in response.
 */
@Mixin(ClientPlayNetworkHandler.class)
public abstract class ClientPlayNetworkHandlerMixin {
	@Inject(method = "onPlaySound", at = @At("HEAD"))
	private void f1client$onPlaySound(PlaySoundS2CPacket packet, CallbackInfo ci) {
		if (MinecraftClient.getInstance().isOnThread()) {
			F1Client.get().onSoundPacket(packet.getSound().value().id().toString(), packet.getCategory().name(),
					packet.getVolume(), packet.getPitch(), packet.getX(), packet.getY(), packet.getZ(), null);
		}
	}

	@Inject(method = "onPlaySoundFromEntity", at = @At("HEAD"))
	private void f1client$onPlaySoundFromEntity(PlaySoundFromEntityS2CPacket packet, CallbackInfo ci) {
		MinecraftClient client = MinecraftClient.getInstance();
		if (client.isOnThread() && client.world != null) {
			Entity entity = client.world.getEntityById(packet.getEntityId());
			if (entity != null) {
				F1Client.get().onSoundPacket(packet.getSound().value().id().toString(), packet.getCategory().name(),
						packet.getVolume(), packet.getPitch(), entity.getX(), entity.getY(), entity.getZ(), entity);
			}
		}
	}
}
