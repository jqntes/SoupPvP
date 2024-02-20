package me.elb1to.souppvp.loadout.killstreaks.impl;

import me.elb1to.souppvp.loadout.killstreaks.Killstreak;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class DebuffKillstreak extends Killstreak {
    public DebuffKillstreak() {
        super("Debuff", Material.POTION, new String[]{
            "To recieve this killstreak you require an 5 killstreak"
        });
    }




    @Override
    public Killstreak getKillstreak() {
        return null;
    }
}
