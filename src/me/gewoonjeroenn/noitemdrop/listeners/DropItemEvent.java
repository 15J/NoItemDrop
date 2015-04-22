package me.gewoonjeroenn.noitemdrop;

import java.util.Arrays;

import me.gewoonjeroenn.noitemdrop.listeners.DropItemEvent;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	public void onEnable(){
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new DropItemEvent(), this);
	     
		loadConfiguration();
	}
	
	public void loadConfiguration(){
	     getConfig().options().copyDefaults(true); 
	     String[] list = {"world"};
	     getConfig().set("worlds", Arrays.asList(list));
	     saveConfig();

}
	

}
