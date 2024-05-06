package me.elb1to.souppvp.user.ui.kit;

import gg.voided.api.menu.Menu;
import gg.voided.api.menu.MenuSize;
import me.elb1to.souppvp.SoupPvP;
import me.elb1to.souppvp.loadout.kit.Kit;
import me.elb1to.souppvp.user.User;
import me.elb1to.souppvp.user.buttons.PlaceholderButton;
import me.elb1to.souppvp.user.ui.kit.selection.KitSelectionButton;
import org.bukkit.entity.Player;

public class KitSelectionMenu extends Menu {



    public KitSelectionMenu(Player player) {
        super("Kit Selection", MenuSize.SIX, player);

    }

    @Override
    public void setupButtons() {
        fillBorder(new PlaceholderButton());
        User user = SoupPvP.getInstance().getUserManager().getByUuid(getPlayer().getUniqueId());

        for (Kit kit : SoupPvP.getInstance().getKitManager().getKits()) {
            add(new KitSelectionButton(kit, user, this));
        }
    }


}
