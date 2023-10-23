package dev.kippenboutske;

import dev.kippenboutske.listeners.joinListener;
import dev.kippenboutske.listeners.leaveListener;
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
        Bukkit.getPluginManager().registerEvents(new leaveListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Disabling LunarisMC...");
    }
}
