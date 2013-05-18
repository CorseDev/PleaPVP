package com.pleapvp.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Owner extends JavaPlugin implements Listener {
	// For future reference, never define Location as loc in the variables. *facepalm* on me.
	public void onPlayerJoin(PlayerJoinEvent event) {
		// Tell staff the IP Address of the player; prevents two accounts on one IP.
		Player player = event.getPlayer();
		Bukkit.getServer().broadcast(ChatColor.GRAY + player.getName() + "'s IP: " + player.getAddress(), "pleapvp.owner");
	}
}
