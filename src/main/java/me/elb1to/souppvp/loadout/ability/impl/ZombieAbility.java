package me.elb1to.souppvp.loadout.ability.impl;

import me.elb1to.souppvp.loadout.ability.Ability;
import me.elb1to.souppvp.loadout.ability.AbilityCallable;
import me.elb1to.souppvp.loadout.kit.impl.ZombieKit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
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
