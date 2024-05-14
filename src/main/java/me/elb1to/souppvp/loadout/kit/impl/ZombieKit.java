package me.elb1to.souppvp.loadout.kit.impl;

import me.elb1to.souppvp.SoupPvP;
import me.elb1to.souppvp.loadout.ability.Ability;
import me.elb1to.souppvp.loadout.kit.Kit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ZombieKit extends Kit {
    public ZombieKit() {
        super("Zombie", Material.ROTTEN_FLESH, new String[]{
            ""
        }, 50);
    }

    @Override
    public ItemStack[] getArmor() {
        return new ItemStack[]{
            new ItemStack(Material.CHAINMAIL_HELMET),
            new ItemStack(Material.LEATHER_CHESTPLATE),
            new ItemStack(Material.IRON_LEGGINGS),
            new ItemStack(Material.DIAMOND_BOOTS)
        };
    }

    @Override
    public ItemStack getSword() {
        return new ItemStack(Material.IRON_SWORD);
    }

    @Override
    public Ability getAbility() {
        return SoupPvP.getInstance().getAbilityManager().getAbilityByName("Flesh");
    }

    @Override
    public PotionEffect[] getPotionEffects() {
        return new PotionEffect[]{
            new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 0),
            new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 1)
        };
    }
}
