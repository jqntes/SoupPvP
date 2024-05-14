package me.elb1to.souppvp.loadout.kit.impl;

import me.elb1to.souppvp.loadout.ability.Ability;
import me.elb1to.souppvp.loadout.kit.Kit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class TankKit  extends Kit {
    public TankKit() {
        super("Tank", Material.DIAMOND_CHESTPLATE, new String[]{
            "Use your power to tank through abilties and all sorts of challenges"
        }, 500);
    }

    @Override
    public ItemStack[] getArmor() {
        return new ItemStack[]{
            new ItemStack(Material.DIAMOND_HELMET),
            new ItemStack(Material.DIAMOND_CHESTPLATE),
            new ItemStack(Material.DIAMOND_LEGGINGS),
            new ItemStack(Material.DIAMOND_BOOTS)
        };
    }

    @Override
    public ItemStack getSword() {
        return new ItemStack(Material.IRON_SWORD);
    }

    @Override
    public Ability getAbility() {
        return null;
    }

    @Override
    public PotionEffect[] getPotionEffects() {
        return new PotionEffect[]{
            new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0),
            new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 0)
        };
    }
}
