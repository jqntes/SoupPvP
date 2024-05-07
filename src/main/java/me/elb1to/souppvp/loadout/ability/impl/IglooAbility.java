package me.elb1to.souppvp.loadout.ability.impl;

import me.elb1to.souppvp.loadout.ability.Ability;
import me.elb1to.souppvp.loadout.ability.AbilityCallable;
import me.elb1to.souppvp.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class IglooAbility extends Ability {
    public IglooAbility(String name, ItemStack item) {
        super("Igloo", new ItemBuilder(Material.ICE).name("Enclosure").lore("Right click this to box in nearby players or an enemy you are fighting inside an 10x10").build());
    }

    @Override
    public long getCooldown() {
        return 20L;
    }

    @Override
    public AbilityCallable getCallable() {
        return null;
    }
}
