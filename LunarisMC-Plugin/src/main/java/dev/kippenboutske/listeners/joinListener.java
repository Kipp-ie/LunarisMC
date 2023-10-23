package dev.kippenboutske.listeners;

import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.bossbar.BossBar;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.awt.*;

public class joinListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Audience player = e.getPlayer();
        MiniMessage mm = MiniMessage.miniMessage();
        final Component name = mm.deserialize("<blue>Welcome in <bold>testing</bold></blue>");
        final BossBar bossbar = BossBar.bossBar( name, 1, BossBar.Color.BLUE, BossBar.Overlay.NOTCHED_20);
        e.getPlayer().showBossBar(bossbar);
        e.getPlayer().sendMessage("Hello " + e.getPlayer().getDisplayName() + "! Welcome in LunarisMC !");
        e.getPlayer().sendMessage("Your current ping is: " + e.getPlayer().getPing() + "MS!");
        e.setJoinMessage(ChatColor.GRAY + "[ų] " + e.getPlayer().getDisplayName());
        final Component header = mm.deserialize("<blue>\n Welcome in \n </blue>" + "<bold>testing</bold>");
        final Component footer = mm.deserialize("<blue>Have a great time!</blue>" + "\n" + "<aqua>Cheese</aqua>");
        e.getPlayer().sendPlayerListHeaderAndFooter( header, footer);

    }
}
