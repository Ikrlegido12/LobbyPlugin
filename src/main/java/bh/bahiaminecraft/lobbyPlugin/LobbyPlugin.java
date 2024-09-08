package bh.bahiaminecraft.lobbyPlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class LobbyPlugin extends JavaPlugin {
    public final String prefix = "&7[&bBahiaMinecraft&7] ";
    public String version = getDescription().getVersion();
    @Override
    public void onEnable() {
        Bukkit.getConsoleSender(ChatColor.translateAlternateColorCodes('&',prefix+"&ePlugin iniciado correctamente, version:&3 "));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
