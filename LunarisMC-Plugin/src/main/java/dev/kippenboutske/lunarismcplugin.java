package dev.kippenboutske;

import dev.kippenboutske.listeners.joinListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class lunarismcplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("██╗░░░░░██╗░░░██╗███╗░░██╗░█████╗░██████╗░██╗░██████╗███╗░░░███╗░█████╗░");
        Bukkit.getLogger().info("██║░░░░░██║░░░██║████╗░██║██╔══██╗██╔══██╗██║██╔════╝████╗░████║██╔══██╗");
        Bukkit.getLogger().info("██║░░░░░██║░░░██║██╔██╗██║███████║██████╔╝██║╚█████╗░██╔████╔██║██║░░╚═╝");
        Bukkit.getLogger().info("██║░░░░░██║░░░██║██║╚████║██╔══██║██╔══██╗██║░╚═══██╗██║╚██╔╝██║██║░░██╗");
        Bukkit.getLogger().info("███████╗╚██████╔╝██║░╚███║██║░░██║██║░░██║██║██████╔╝██║░╚═╝░██║╚█████╔╝");
        Bukkit.getLogger().info("╚══════╝░╚═════╝░╚═╝░░╚══╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝╚═════╝░╚═╝░░░░░╚═╝░╚════╝░");
        Bukkit.getPluginManager().registerEvents(new joinListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
