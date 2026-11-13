package dev.f1client.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.text.ClickEvent;
import net.minecraft.text.HoverEvent;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;

/** Client-side chat lines with the {@code [F1Client]} prefix. Nothing here is sent to a server. */
public final class Chat {
	private static final int PREFIX_COLOR = 0xF2F3F5;
	private static final int BODY_COLOR = 0xB4B7BF;

	private Chat() {
	}

	/** Shows a prefixed line in the local chat HUD. */
	public static void info(String message) {
		send(prefix().append(Text.literal(message).withColor(BODY_COLOR)));
	}

	/**
	 * Shows a prefixed line whose text copies {@code clipboard} when clicked.
	 *
	 * @param message   visible text
	 * @param color     RGB colour of the text
	 * @param clipboard text placed on the clipboard on click
	 */
	public static void copyable(String message, int color, String clipboard) {
		MutableText body = Text.literal(message).withColor(color & 0xFFFFFF);
		body.styled(style -> style
				.withClickEvent(new ClickEvent.CopyToClipboard(clipboard))
				.withHoverEvent(new HoverEvent.ShowText(Text.literal("Click to copy " + clipboard))));
		send(prefix().append(body));
	}

	private static MutableText prefix() {
		return Text.literal("[F1Client] ").withColor(PREFIX_COLOR);
	}

	private static void send(Text text) {
		MinecraftClient client = MinecraftClient.getInstance();
		if (client.inGameHud != null && client.world != null) {
			client.inGameHud.getChatHud().addMessage(text);
		}
	}
}
