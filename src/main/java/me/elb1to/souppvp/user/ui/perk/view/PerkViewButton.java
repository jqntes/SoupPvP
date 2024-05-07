package me.elb1to.souppvp.user.ui.perk.view;

import gg.voided.api.menu.button.Button;
import me.elb1to.souppvp.loadout.perk.Perks;
import me.elb1to.souppvp.user.User;
import me.elb1to.souppvp.utils.ColorHelper;
import me.elb1to.souppvp.utils.ItemBuilder;
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
        if (!user.getUnlockedPerks().contains(perks.getName())){
            lore.add("&eRequired Kills: " + perks.getRequiredKills() + "&e.");
            lore.add("&aClick here to activate the perk when you have the amount of kills.");
        }

        return new ItemBuilder(perks.getIcon()).name(ColorHelper.translate("&a" + perks.getName())).lore(ColorHelper.translate(lore)).hideFlags().build();
    }

    @Override
    public void onClick(ClickType type) {
        if (!type.equals(ClickType.RIGHT)){
            return;
        }


    }
}
