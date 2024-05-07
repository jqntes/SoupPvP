package me.elb1to.souppvp.loadout.perk.impl;

import me.elb1to.souppvp.SoupPvP;
import me.elb1to.souppvp.loadout.perk.Perks;
import me.elb1to.souppvp.loadout.perk.PerksCallable;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class DoubleHealthPerk extends Perks {
    public DoubleHealthPerk() {
        super("Double Health Perk", Material.DIODE, new String[]{
            "To purchase this perk you require 5 kills "
        }, 5);
    }


    @Override
    public PerksCallable getCallable() {
        return null;
    }

    @Override
    public void onClickPerkInventory(Player player) {



    }

    @Override
    public Perks getPerk() {

        return null;
    }
}
