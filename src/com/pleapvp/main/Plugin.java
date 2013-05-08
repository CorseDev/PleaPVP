package com.pleapvp.main;


import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
    @Override
    public void onEnable(){
    	getLogger().info("Enabled Sucessfully.");
    	getServer().getPluginManager().registerEvents(new Welcome(), this);
    }
 
    @Override
    public void onDisable() {
    	getLogger().info("Disabled.");
    }
}