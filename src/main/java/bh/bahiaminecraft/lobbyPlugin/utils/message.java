package bh.bahiaminecraft.lobbyPlugin.utils;

import bh.bahiaminecraft.lobbyPlugin.LobbyPlugin;
import org.bukkit.ChatColor;

public class message {
    private static LobbyPlugin plugin;

    private static String prefix = plugin.getMainConfigManager().getPrefix();
    public static String sendMsg(String Message){
        return ChatColor.translateAlternateColorCodes('&',prefix + " " + Message);
    }
    public static String sendMsgWoP(String Message){
        return ChatColor.translateAlternateColorCodes('&', Message);
    }

}