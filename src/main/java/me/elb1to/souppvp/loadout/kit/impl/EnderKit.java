package me.elb1to.souppvp.loadout.kit.impl;

import me.elb1to.souppvp.SoupPvP;
import me.elb1to.souppvp.loadout.ability.Ability;
import me.elb1to.souppvp.loadout.kit.Kit;
import me.elb1to.souppvp.utils.ItemBuilder;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

public class EnderKit extends Kit {
    public EnderKit() {
        super("Enderman", Material.ENDER_PEARL, new String[]{
            "&7&oDefault PvP kit."
            }, 0);

    }

    @Override
    public ItemStack[] getArmor() {
         return new ItemStack[]{
            new ItemBuilder(Material.LEATHER_BOOTS).color(Color.AQUA).enchantment(Enchantment.DURABILITY, 20).enchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2).build(),
            new ItemBuilder(Material.LEATHER_LEGGINGS).color(Color.AQUA).enchantment(Enchantment.DURABILITY, 20).enchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2).build(),
            new ItemBuilder(Material.LEATHER_CHESTPLATE).color(Color.AQUA).enchantment(Enchantment.DURABILITY, 20).enchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2).build(),
            new ItemBuilder(Material.LEATHER_HELMET).color(Color.AQUA).enchantment(Enchantment.DURABILITY, 20).enchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2).build()
        };
    }

    @Override
    public ItemStack getSword() {
        return new ItemBuilder(Material.IRON_SWORD).build();
    }

    @Override
    public Ability getAbility() {
        return SoupPvP.getInstance().getAbilityManager().getAbilityByName("Pearl");
    }

    @Override
    public PotionEffect[] getPotionEffects() {
        return new PotionEffect[0];
    }
}
