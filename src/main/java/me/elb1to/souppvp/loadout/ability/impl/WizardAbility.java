package me.elb1to.souppvp.loadout.ability.impl;

import me.elb1to.souppvp.loadout.ability.Ability;
import me.elb1to.souppvp.loadout.ability.AbilityCallable;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class WizardAbility extends Ability {
    public WizardAbility() {
        super("Pearl", new ItemStack(Material.ENDER_PEARL, 3));
    }

    @Override
    public long getCooldown() {
        return 2;
    }

    @Override
    public AbilityCallable getCallable() {
        return null;
    }
}
