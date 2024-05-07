package me.elb1to.souppvp.loadout.perk.impl;

import me.elb1to.souppvp.loadout.perk.Perks;
import org.bukkit.Material;

public class DoubleHealthPerk extends Perks {
    public DoubleHealthPerk() {
        super("Double Health Perk", Material.DIODE, new String[]{
            "To recieve this perk you require "
        });
    }






    @Override
    public Perks getPerk() {
        return null;
    }
}
