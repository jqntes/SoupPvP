package me.elb1to.souppvp.user.ui.perk;

import me.elb1to.souppvp.SoupPvP;
import me.elb1to.souppvp.loadout.killstreaks.Perks;
import me.elb1to.souppvp.user.User;
import me.elb1to.souppvp.utils.menu.Button;
import me.elb1to.souppvp.utils.menu.Menu;
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




    @Override
    public String getTitle(Player player) {
        return "Perk Options";
    }

    @Override
    public Map<Integer, Button> getButtons(Player player) {
        Map<Integer, Button> buttons = new HashMap<>();
        User user = SoupPvP.getInstance().getUserManager().getByUuid(player.getUniqueId());
        for (Perks perks : SoupPvP.getInstance().getPerksManager().getPerks()){
            buttons.put(buttons.size(), new PerkViewMenu().getPlaceholderButton());
        }

        return buttons;
    }
}
