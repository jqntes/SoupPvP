package me.jqntes.souppvp.commands.admin.commands;

import me.jqntes.souppvp.utils.command.BaseCommand;
import me.jqntes.souppvp.utils.command.Command;
import me.jqntes.souppvp.utils.command.CommandArgs;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ClearChatCommand extends BaseCommand {
    @Override @Command(name = "clear", permission = "staff.clearchat")

    public void onCommand(CommandArgs command) {
        Player player = command.getPlayer();
        String[] args = command.getArgs();
        if (args.length == 0) {
            for (Player onlinePlayers : Bukkit.getOnlinePlayers()){
               player.sendMessage(ChatColor.GRAY  + "");
                player.sendMessage(ChatColor.GRAY  + "");
                player.sendMessage(ChatColor.GRAY  + "");
                player.sendMessage(ChatColor.GRAY  + "");
                player.sendMessage(ChatColor.GRAY  + "");
                player.sendMessage(ChatColor.GRAY  + "");
                player.sendMessage(ChatColor.GRAY  + "");
                player.sendMessage(ChatColor.GRAY  + "");
                player.sendMessage(ChatColor.GRAY  + "");
                player.sendMessage(ChatColor.GRAY  + "");
                player.sendMessage(ChatColor.GRAY  + "");
                player.sendMessage(ChatColor.GRAY  + "");
                player.sendMessage(ChatColor.GRAY  + "");
                player.sendMessage(ChatColor.GRAY  + "");
                player.sendMessage(ChatColor.GRAY  + "");
                player.sendMessage(ChatColor.GRAY  + "");
                player.sendMessage(ChatColor.GRAY  + "");
                player.sendMessage(ChatColor.GRAY  + "");
                player.sendMessage("The chat has been cleared");

            }
        }
    }
}
