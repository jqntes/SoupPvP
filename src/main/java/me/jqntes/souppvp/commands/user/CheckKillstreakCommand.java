package me.jqntes.souppvp.commands.user;

import me.jqntes.souppvp.user.User;
import me.jqntes.souppvp.utils.command.BaseCommand;
import me.jqntes.souppvp.utils.command.CommandArgs;
import org.bukkit.entity.Player;

public class CheckKillstreakCommand extends BaseCommand {
    private User user;
    @Override
    public void onCommand(CommandArgs command) {
        Player player = command.getPlayer();
        String[] args = command.getArgs();
        
    }
}
