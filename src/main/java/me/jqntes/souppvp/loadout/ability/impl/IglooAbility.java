package me.jqntes.souppvp.loadout.ability.impl;

import me.jqntes.souppvp.loadout.ability.Ability;
import me.jqntes.souppvp.loadout.ability.AbilityCallable;
import me.jqntes.souppvp.utils.ItemBuilder;
import org.bukkit.Material;

public class IglooAbility extends Ability {
    public IglooAbility() {
        super("Igloo", new ItemBuilder(Material.ICE).name("Enclosure").lore("Right click this to box in nearby players or an enemy you are fighting inside an 10x10").build());
    }

    @Override
    public long getCooldown() {
        return 20L;
    }

    @Override
    public AbilityCallable getCallable() {
        return player -> {

        };
    }
}
