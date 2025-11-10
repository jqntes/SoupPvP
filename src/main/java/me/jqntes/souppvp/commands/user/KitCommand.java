package me.jqntes.souppvp.commands.user;

import me.jqntes.souppvp.SoupPvP;
import me.jqntes.souppvp.user.ui.kit.KitSelectionMenu;
import me.jqntes.souppvp.utils.ColorHelper;
import me.jqntes.souppvp.utils.command.BaseCommand;
import me.jqntes.souppvp.utils.command.Command;
import me.jqntes.souppvp.utils.command.CommandArgs;
import org.bukkit.entity.Player;

/**
 * Created by Elb1to
 * Project: SoupPvP
 * Date: 5/13/2021 @ 11:15 AM
 */
public class KitCommand extends BaseCommand {

    private final SoupPvP plugin = SoupPvP.getInstance();

    @Override @Command(name = "kit", aliases = {"kits"})
    public void onCommand(CommandArgs command) {
        Player player = command.getPlayer();

        if (plugin.getCombatManager().isCombat(player)) {
            player.sendMessage(ColorHelper.translate("&cYou can't use commands whilst in combat."));
            return;
        }
        new KitSelectionMenu(player).open();
    }
}
