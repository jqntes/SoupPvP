package me.elb1to.souppvp.user.ui.perk.view;

import gg.voided.api.menu.Menu;
import gg.voided.api.menu.button.Button;
import me.elb1to.souppvp.loadout.killstreak.Killstreak;
import me.elb1to.souppvp.user.User;
import me.elb1to.souppvp.utils.ColorHelper;
import me.elb1to.souppvp.utils.ItemBuilder;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KillstreakViewButton extends Button {
    private final User user;
    private final Killstreak killstreak;
    private final Menu menu;
    public KillstreakViewButton(User user, Killstreak killstreak, Menu menu) {
        this.user = user;
        this.killstreak = killstreak;
        this.menu = menu;
    }



    @Override
    public ItemStack getItem(Player player) {
        List<String> lore = new ArrayList<>();
        lore.add(ColorHelper.MENU_BAR);
        lore.add(Arrays.toString(killstreak.getDesc()));
        lore.add(ColorHelper.MENU_BAR);
        if (!user.getUnlockedKillstreaks().contains(killstreak.getKillstreak().getName())){
            lore.add("&eRequired Kills: " + killstreak.getRequiredKills() + "&e.");
            lore.add("&aThe killstreak will automatically activate when you get the required kills while alive");
        }

        return new ItemBuilder(killstreak.getIcon()).name(ColorHelper.translate("&a" + killstreak.getName())).lore(ColorHelper.translate(lore)).hideFlags().build();
    }

    @Override
    public void onClick(ClickType type) {
        if (!type.equals(ClickType.LEFT)){
            return;
        }



        }


    }

