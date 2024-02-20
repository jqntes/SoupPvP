package me.elb1to.souppvp.commands.user;

import me.elb1to.souppvp.SoupPvP;
import me.elb1to.souppvp.utils.ColorHelper;
import me.elb1to.souppvp.utils.command.BaseCommand;
import me.elb1to.souppvp.utils.command.Command;
import me.elb1to.souppvp.utils.command.CommandArgs;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import static me.elb1to.souppvp.utils.PlayerUtil.resetHotbar;
import static me.elb1to.souppvp.utils.PlayerUtil.resetPlayer;

public class SpawnCommand extends BaseCommand {
    private final SoupPvP plugin = SoupPvP.getInstance();


    @Override @Command(name = "spawn", aliases = "s")
    public void onCommand(CommandArgs command) {
        Player player = command.getPlayer();
        if (plugin.getCombatManager().isCombat(command.getPlayer())){
            player.sendMessage(ColorHelper.translate("&l&7You cannot teleport to spawn whilst in combat"));
            return;
        }
            player.teleport(player.getWorld().getSpawnLocation());
            resetPlayer(player);
            resetHotbar(player);
            player.sendMessage(ChatColor.GRAY + "&7You have been teleported back to spawn");
        }




    }

