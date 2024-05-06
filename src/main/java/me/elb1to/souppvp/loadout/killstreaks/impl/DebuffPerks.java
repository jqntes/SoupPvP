package me.elb1to.souppvp.loadout.killstreaks.impl;

import me.elb1to.souppvp.loadout.killstreaks.Perks;
import org.bukkit.Material;

public class DebuffPerks extends Perks {
    public DebuffPerks() {
        super("Debuff", Material.POTION, new String[]{
            "To recieve this killstreak you require an 5 killstreaks"
        });
    }




    @Override
    public Perks getKillstreak() {
        return getKillstreak();
    }
}
