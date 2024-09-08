package bh.bahiaminecraft.lobbyPlugin;

import bh.bahiaminecraft.lobbyPlugin.config.MainConfigManager;
import bh.bahiaminecraft.lobbyPlugin.listeners.PlayerListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class LobbyPlugin extends JavaPlugin {
    public String prefix = "&7[&3BahiaMinecraft&7] ";
    public String version = getDescription().getVersion();
    private MainConfigManager mainConfigManager;
    @Override
    public void onEnable() {
        registerEvents();
        getMainConfigManager();
        mainConfigManager = new MainConfigManager(this);
        Bukkit.getConsoleSender().sendMessage(
                ChatColor.translateAlternateColorCodes(
                        '&',prefix + "&eEl módulo de &b&lLOBBY &eha sido habilitado&e correctamente. (Version "+ version + ")"));

    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(
                ChatColor.translateAlternateColorCodes(
                        '&',prefix + "&eEl módulo de &b&lLOBBY &eha sido deshabilitado&e correctamente. (Version "+ version + ")"));

    }
    public void registerEvents(){
        getServer().getPluginManager().registerEvents(new PlayerListener(this),this);
    }
    public MainConfigManager getMainConfigManager() {
        return mainConfigManager;
    }
}
