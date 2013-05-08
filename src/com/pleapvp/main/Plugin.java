package com.pleapvp.main;


import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
    @Override
    public void onEnable(){
    	getLogger().info("Enabled Sucessfully.");
    }
 
    @Override
    public void onDisable() {
    	getLogger().info("Disabled.");
    }
}