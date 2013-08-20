package com.pleapvp.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Info extends JavaPlugin implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player player = Bukkit.getPlayerExact(args[0]);
		if(cmd.getName().equalsIgnoreCase("info")){ 
			if (args.length == 1) {
				sender.sendMessage(ChatColor.GOLD + "======== " + ChatColor.GRAY + args[0] + ChatColor.GOLD + "========");
				if(player == null) {
					sender.sendMessage(ChatColor.ITALIC + "That player is currently offline.");
				}
				else if(player != null) {
					sender.sendMessage(ChatColor.GOLD + "Display Name: " + ChatColor.GRAY + player.getDisplayName());
					sender.sendMessage(ChatColor.GOLD + "Current Potions: " + ChatColor.GRAY + player.getActivePotionEffects().toString());
					sender.sendMessage(ChatColor.GOLD + "Entity ID: " + ChatColor.GRAY + player.getEntityId());
					sender.sendMessage(ChatColor.GOLD + "Exaustion Level: " + ChatColor.GRAY + player.getExhaustion());
					sender.sendMessage(ChatColor.GOLD + "Current EXP: " + ChatColor.GRAY + player.getExp());
					sender.sendMessage(ChatColor.GOLD + "Current XP Level: " + ChatColor.GRAY + player.getExpToLevel());
					sender.sendMessage(ChatColor.GOLD + "First Played: " + ChatColor.GRAY + player.getFirstPlayed());
				}
				
			} else {
				
			}
			return true;
		} 
		
		return false; 
	}
}
