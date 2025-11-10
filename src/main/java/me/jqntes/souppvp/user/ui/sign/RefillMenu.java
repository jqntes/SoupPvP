package me.jqntes.souppvp.user.ui.sign;

import gg.voided.api.menu.Menu;
import gg.voided.api.menu.MenuSize;
import me.jqntes.souppvp.user.buttons.PlaceholderButton;
import me.jqntes.souppvp.user.ui.sign.view.RefillViewMenu;
import org.bukkit.entity.Player;

public class RefillMenu  extends Menu {


    public RefillMenu(Player player) {
        super("Refill", MenuSize.SIX, player);
    }

    @Override
    public void setupButtons() {
        fillBorder(new PlaceholderButton());
        add(new RefillViewMenu(this));


    }
}

