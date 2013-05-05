package com.pleapvp.main;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class bancommand extends JavaPlugin implements CommandExecutor {
public void run(Server server, CommandSender sender, String commandLabel, String[] args)
	  {
	    if (args.length < 1)
	    {
	      sender.sendMessage(ChatColor.RED + "Not enough arguments." + ChatColor.BLUE + " Usage: " + ChatColor.YELLOW + "/ban username reason");
	    }
	  }
}
