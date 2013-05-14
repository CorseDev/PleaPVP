package com.pleapvp.main;


import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
    @Override
    public void onEnable(){
    	getServer().getPluginManager().registerEvents(new Welcome(), this);
    	getServer().getPluginManager().registerEvents(new Owner(), this);
    	getLogger().info("Enabled Sucessfully.");
    }
 
    @Override
    public void onDisable() {
    	getLogger().info("Disabled.");
    }
}