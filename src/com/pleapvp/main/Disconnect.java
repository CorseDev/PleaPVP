package com.pleapvp.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Disconnect extends JavaPlugin implements Listener {
	public void onPlayerLeave(PlayerQuitEvent event) {
		Player player = Bukkit.getServer().getPlayer(event.getPlayer().getName());
			// Resetting times and weather, just to make sure no players get crash errors
			// when they join the server. It's happened before.
			player.resetPlayerTime();
			player.resetPlayerWeather();
			
			// We've got to set a non-vanilla leave message too, yes?
			event.setQuitMessage(ChatColor.GRAY + "[" + ChatColor.RED + "-" + ChatColor.GRAY + "] " + player.getName() + " disconnected.");
		}
	}