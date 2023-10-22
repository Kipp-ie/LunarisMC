package dev.kippenboutske.listeners;

import net.kyori.adventure.bossbar.BossBar;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.awt.*;

public class joinListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        final Component name = net.kyori.adventure.text.Component.text("BossBar");
        final BossBar bossbar = BossBar.bossBar( name, 1, BossBar.Color.BLUE, BossBar.Overlay.NOTCHED_20);
        e.getPlayer().showBossBar(bossbar);
        e.getPlayer().sendMessage("Hello " + e.getPlayer().getDisplayName() + "! Welcome in LunarisMC !");
        e.getPlayer().sendMessage("Your current ping is: " + e.getPlayer().getPing() + "MS!");
        e.setJoinMessage(ChatColor.GRAY + "[ų] " + e.getPlayer().getDisplayName());
        final Component header = (Component) net.kyori.adventure.text.Component.text("My Cool Server", NamedTextColor.BLUE);
        final Component footer = (Component) net.kyori.adventure.text.Component.text("Have a great time!" + "/n" + "Cheese");
        e.getPlayer().sendPlayerListHeaderAndFooter( header, footer);

    }
}
