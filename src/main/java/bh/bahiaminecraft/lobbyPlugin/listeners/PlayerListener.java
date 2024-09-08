package bh.bahiaminecraft.lobbyPlugin.listeners;


import bh.bahiaminecraft.lobbyPlugin.LobbyPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {
    private LobbyPlugin plugin;

    public PlayerListener(LobbyPlugin plugin){
        this.plugin = plugin;
    }
    @EventHandler
    public void teleportLobby(PlayerJoinEvent event){
        Location location = new Location(Bukkit.getWorld(plugin.getMainConfigManager().getLobbyworld()), plugin.getMainConfigManager().getCoordX(), plugin.getMainConfigManager().getCoordY()+0.5, plugin.getMainConfigManager().getCoordZ(), plugin.getMainConfigManager().getYaw(), plugin.getMainConfigManager().getPitch());
        Player player = event.getPlayer();
        player.teleport(location);
    }
}
