package me.jqntes.souppvp.commands.user;

import me.jqntes.souppvp.SoupPvP;
import me.jqntes.souppvp.utils.command.BaseCommand;
import me.jqntes.souppvp.utils.command.Command;
import me.jqntes.souppvp.utils.command.CommandArgs;
import org.bukkit.entity.Player;

/**
 * Created by Elb1to
 * Project: SoupPvP
 * Date: 5/13/2021 @ 11:09 AM
 */
public class BalanceTopCommand extends BaseCommand {

    private final SoupPvP plugin = SoupPvP.getInstance();

    @Override @Command(name = "balancetop", aliases = {"creditstop", "credittop"})
    public void onCommand(CommandArgs command) {
        Player player = command.getPlayer();
        String[] args = command.getArgs();


    }
}
