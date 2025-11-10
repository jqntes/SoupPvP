package me.jqntes.souppvp.loadout.ability.impl;

import me.jqntes.souppvp.loadout.ability.Ability;
import me.jqntes.souppvp.loadout.ability.AbilityCallable;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ZombieAbility extends Ability {
    public ZombieAbility() {
        super("Flesh", new ItemStack(Material.FLOWER_POT));
    }

    @Override
    public long getCooldown() {
        return 0;
    }

    @Override
    public AbilityCallable getCallable() {
        return player -> {

        };
    }
}
