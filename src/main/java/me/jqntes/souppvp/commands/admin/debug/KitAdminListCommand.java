package me.jqntes.souppvp.commands.admin.debug;

import me.jqntes.souppvp.SoupPvP;
import me.jqntes.souppvp.loadout.kit.Kit;
import me.jqntes.souppvp.utils.ColorHelper;
import me.jqntes.souppvp.utils.command.BaseCommand;
import me.jqntes.souppvp.utils.command.Command;
import me.jqntes.souppvp.utils.command.CommandArgs;
import org.bukkit.entity.Player;

/**
 * Created by Elb1to
 * Project: SoupPvP
 * Date: 5/6/2021 @ 9:55 PM
 */
public class KitAdminListCommand extends BaseCommand {

    private final SoupPvP plugin = SoupPvP.getInstance();

    @Override @Command(name = "kitadmin.list", permission = "soup-pvp.admin")
    public void onCommand(CommandArgs command) {
        Player player = command.getPlayer();

        player.sendMessage(ColorHelper.translate("&aTotal kits: " + SoupPvP.getInstance().getKitManager().getKits().size()));
        for (Kit kits : this.plugin.getKitManager().getKits()) {
            player.sendMessage(ColorHelper.translate("&a * " + kits.getName()));
        }
    }
}
