package me.jqntes.souppvp.commands.user;

import me.jqntes.souppvp.SoupPvP;
import me.jqntes.souppvp.utils.command.BaseCommand;
import me.jqntes.souppvp.utils.command.Command;
import me.jqntes.souppvp.utils.command.CommandArgs;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import static me.jqntes.souppvp.utils.PlayerUtil.resetHotbar;
import static me.jqntes.souppvp.utils.PlayerUtil.resetPlayer;

public class SpawnCommand extends BaseCommand {
    private final SoupPvP plugin = SoupPvP.getInstance();


    @Override @Command(name = "restart", aliases = "rst")
    public void onCommand(CommandArgs command) {
        Player player = command.getPlayer();
        if (!plugin.getCombatManager().isCombat(command.getPlayer())){
            player.teleport(player.getWorld().getSpawnLocation());
            plugin.getCombatManager().setCombatSet(player, false);
            resetPlayer(player);
            resetHotbar(player);
            player.sendMessage(ChatColor.GRAY + "&7You have been teleported back to spawn");


            return;
        }
            if (plugin.getCombatManager().isCombat(player)){
                player.sendMessage(ChatColor.GRAY + "You cannot return to spawn due to being in combat still");
            }
        }




    }

