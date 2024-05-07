package me.elb1to.souppvp.loadout.kit.impl;

import me.elb1to.souppvp.SoupPvP;
import me.elb1to.souppvp.loadout.ability.Ability;
import me.elb1to.souppvp.loadout.kit.Kit;
import me.elb1to.souppvp.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class IceageKit extends Kit {
    public IceageKit() {
        super("Igloo", Material.ICE,  new String[]{
            "Right click the Igloo in your inventory to trap your enemies inside an certain radius for five seconds"
        }, 500);
    }

    @Override
    public ItemStack[] getArmor() {
        return new ItemStack[]{
            new ItemStack(Material.IRON_BOOTS),
            new ItemStack(Material.CHAINMAIL_LEGGINGS),
            new ItemStack(Material.IRON_CHESTPLATE),
            new ItemStack(Material.CHAINMAIL_HELMET)
        };

    }

    @Override
    public ItemStack getSword() {
        return new ItemBuilder(Material.GOLD_SWORD).enchantment(Enchantment.DAMAGE_ALL, 1).enchantment(Enchantment.DAMAGE_ALL, 1).build();
    }

    @Override
    public Ability getAbility() {
        return SoupPvP.getInstance().getAbilityManager().getAbilityByName("Igloo");
    }

    @Override
    public PotionEffect[] getPotionEffects() {
        return new PotionEffect[]{
            new PotionEffect(PotionEffectType.REGENERATION, Integer.MAX_VALUE, 1),
            new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 3)
        };

    }
}
