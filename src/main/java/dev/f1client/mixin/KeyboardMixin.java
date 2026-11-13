package dev.f1client.mixin;

import dev.f1client.F1Client;
import net.minecraft.client.Keyboard;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.input.KeyInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/** Feeds key events to the client's keybind dispatcher before the game handles them. */
@Mixin(Keyboard.class)
public abstract class KeyboardMixin {
	@Inject(method = "onKey", at = @At("HEAD"), cancellable = true)
	private void f1client$onKey(long window, int action, KeyInput input, CallbackInfo ci) {
		MinecraftClient client = MinecraftClient.getInstance();
		if (window == client.getWindow().getHandle() && F1Client.get().keybinds().onKey(input.key(), action)) {
			ci.cancel();
		}
	}
}
