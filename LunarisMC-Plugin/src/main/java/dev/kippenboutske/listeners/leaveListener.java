package dev.kippenboutske.listeners;

import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class leaveListener implements Listener {
    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        MiniMessage mm = MiniMessage.miniMessage();
        e.quitMessage(mm.deserialize("<gray>[ť] " + PlainTextComponentSerializer.plainText().serialize(player.displayName()) + "</gray>"));

    }
}
