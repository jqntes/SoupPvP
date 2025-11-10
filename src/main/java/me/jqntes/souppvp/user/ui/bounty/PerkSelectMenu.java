package me.jqntes.souppvp.user.ui.bounty;

import gg.voided.api.menu.Menu;
import gg.voided.api.menu.MenuSize;
import org.bukkit.entity.Player;

public class PerkSelectMenu extends Menu {
    public PerkSelectMenu(Player player) {
        super("Perk Selector", MenuSize.TWO, player);
    }
}
