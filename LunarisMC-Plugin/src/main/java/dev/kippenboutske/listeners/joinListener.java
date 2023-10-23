package dev.kippenboutske.listeners;

import net.kyori.adventure.bossbar.BossBar;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class joinListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        MiniMessage mm = MiniMessage.miniMessage();
        final Component name = mm.deserialize("<blue>Welcome in <bold>testing</bold></blue>");
        final BossBar bossbar = BossBar.bossBar( name, 1, BossBar.Color.BLUE, BossBar.Overlay.NOTCHED_20);
        player.showBossBar(bossbar);
        player.sendMessage("Hello " + PlainTextComponentSerializer.plainText().serialize(player.displayName()) + "! Welcome in LunarisMC !");
        player.sendMessage("Your current ping is: " + player.getPing() + "MS!");
        e.joinMessage(mm.deserialize("<gray>[ų] " + PlainTextComponentSerializer.plainText().serialize(player.displayName())+ "</gray>"));
        final Component header = mm.deserialize("<blue>\n Welcome in \n </blue>" + "<bold>testing</bold>");
        final Component footer = mm.deserialize("<blue>Have a great time!</blue>" + "\n" + "<aqua>Cheese</aqua>");
        player.sendPlayerListHeaderAndFooter( header, footer);

    }
}
