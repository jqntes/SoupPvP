package me.elb1to.souppvp.user.ui.perk;

import gg.voided.api.menu.Menu;
import gg.voided.api.menu.MenuSize;
import me.elb1to.souppvp.SoupPvP;
import me.elb1to.souppvp.loadout.perk.Killstreak;
import me.elb1to.souppvp.user.User;
import me.elb1to.souppvp.user.buttons.PlaceholderButton;
import me.elb1to.souppvp.user.ui.perk.view.KillstreakViewButton;
import org.bukkit.entity.Player;

/**
 * Created by Elb1to
 * Project: SoupPvP
 * Date: 5/13/2021 @ 12:38 PM
 */
public class KillstreakViewMenu extends Menu {
    private Killstreak killstreak;
    private User user;

    public KillstreakViewMenu(Player player) {
        super("Killstreaks", MenuSize.FIVE, player);
    }


    @Override
    public void setupButtons() {
        fillBorder(new PlaceholderButton());
        User user = SoupPvP.getInstance().getUserManager().getByUuid(getPlayer().getUniqueId());
        for (Killstreak killstreak : SoupPvP.getInstance().getPerksManager().getPerks()){
            add(new KillstreakViewButton(user, killstreak, this));
        }
    }

}
