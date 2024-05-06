package me.elb1to.souppvp.user.ui.perk;

import gg.voided.api.menu.Menu;
import gg.voided.api.menu.MenuSize;
import me.elb1to.souppvp.SoupPvP;
import me.elb1to.souppvp.loadout.killstreaks.Perks;
import me.elb1to.souppvp.user.User;
import me.elb1to.souppvp.user.buttons.PlaceholderButton;
import me.elb1to.souppvp.user.ui.perk.view.PerkViewButton;
import org.bukkit.entity.Player;

import java.util.*;

/**
 * Created by Elb1to
 * Project: SoupPvP
 * Date: 5/13/2021 @ 12:38 PM
 */
public class PerkViewMenu extends Menu {
    private Perks perks;
    private User user;

    public PerkViewMenu(Player player) {
        super("Perks", MenuSize.FOUR, player);
    }


    @Override
    public void setupButtons() {
        fillBorder(new PlaceholderButton());
        User user = SoupPvP.getInstance().getUserManager().getByUuid(getPlayer().getUniqueId());
        for (Perks perks : SoupPvP.getInstance().getPerksManager().getPerks()){
            add(new PerkViewButton(user, perks));
        }
    }

}
