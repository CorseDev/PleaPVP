package com.pleapvp.main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class Welcome extends JavaPlugin implements Listener {
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onJoinEvent(PlayerJoinEvent event) {
		// I hate getting players from events, so I get their player info from the server instead.
		Player player = Bukkit.getServer().getPlayerExact(event.getPlayer().getName());
		
		// Set the Player's Texture Pack to the Server Texture
		player.setTexturePack("http://www.xboxjtag.com/JehkobasFantasy.zip");
		
		// What we will broadcast to everyone when the player joins the game.
		event.setJoinMessage(ChatColor.GRAY + "[ " + ChatColor.GREEN + "+" + ChatColor.GRAY + "] " + player.getName() + "joined.");
		
		// Setting the player's name in the Tablist, set it to the player rank.
		String owner = ChatColor.RED + player.getName();
		String admin = ChatColor.GOLD + player.getName();
		String normplayer = ChatColor.AQUA + player.getName();
		
		if(player.hasPermission("pleapvp.owner")) {
			player.setPlayerListName(owner);
		}
		if(player.hasPermission("pleapvp.admin")) {
			player.setPlayerListName(admin);
		}
		if(player.hasPermission("pleapvp.normplayer")) {
			player.setPlayerListName(normplayer);
		}
	}
}
