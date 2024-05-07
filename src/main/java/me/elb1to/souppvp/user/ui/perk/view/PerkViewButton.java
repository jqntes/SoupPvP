package me.elb1to.souppvp.user.ui.perk.view;

import gg.voided.api.menu.button.Button;
import me.elb1to.souppvp.loadout.perks.Perks;
import me.elb1to.souppvp.user.User;
import me.elb1to.souppvp.utils.ColorHelper;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PerkViewButton extends Button {
    private final User user;
    private final Perks perks;

    public PerkViewButton(User user, Perks perks) {
        this.user = user;
        this.perks = perks;
    }



    @Override
    public ItemStack getItem(Player player) {
        List<String> lore = new ArrayList<>();
        lore.add(ColorHelper.MENU_BAR);
        lore.add(Arrays.toString(perks.getDesc()));
        lore.add(ColorHelper.MENU_BAR);

        return null;
    }

    @Override
    public void onClick(ClickType type) {
        if (!type.equals(ClickType.RIGHT)){
            return;
        }

    }
}
