package me.elb1to.souppvp.loadout.kit.impl;

import me.elb1to.souppvp.loadout.ability.Ability;
import me.elb1to.souppvp.loadout.kit.Kit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class GhostKit extends Kit {
    public GhostKit() {
        super("Ghost", Material.FEATHER, new String[]{
            ""
        }, 20);
    }

    @Override
    public ItemStack[] getArmor() {
        return null;
    }

    @Override
    public ItemStack getSword() {
        return new ItemStack(Material.DIAMOND_SWORD);
    }

    @Override
    public Ability getAbility() {
        return null;
    }

    @Override
    public PotionEffect[] getPotionEffects() {
        return new PotionEffect[]{
            new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2),
            new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1)

        };
    }
}
