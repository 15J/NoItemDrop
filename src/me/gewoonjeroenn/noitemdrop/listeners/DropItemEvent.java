package me.gewoonjeroenn.noitemdrop.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class DropItemEvent extends JavaPlugin implements Listener {
	
	@EventHandler
	public void onItemDrop(PlayerDropItemEvent event){
		Player p = event.getPlayer();
		if(p.getWorld().equals(getConfig().getList("world"))){
			event.setCancelled(true);
			
		}
		
	}

}
