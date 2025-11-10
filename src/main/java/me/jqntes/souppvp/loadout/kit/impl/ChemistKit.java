package me.jqntes.souppvp.loadout.kit.impl;

import me.jqntes.souppvp.SoupPvP;
import me.jqntes.souppvp.loadout.ability.Ability;
import me.jqntes.souppvp.loadout.kit.Kit;
import me.jqntes.souppvp.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

public class ChemistKit extends Kit {
    public ChemistKit() {
        super("Chemist", Material.NETHER_BRICK_ITEM , new String[]{
            "&7&oPoison Bomb gives",
            "&7&oplayers other effects",
            "&7&when used."
            }, 0)

    ;}

    @Override
    public ItemStack[] getArmor() {
        return new ItemStack[]{
            new ItemStack(Material.LEATHER_BOOTS),
            new ItemStack(Material.CHAINMAIL_LEGGINGS),
            new ItemStack(Material.LEATHER_CHESTPLATE),
            new ItemStack(Material.IRON_HELMET)

        };
    }

    @Override
    public ItemStack getSword() {
        return new ItemBuilder(Material.IRON_AXE).enchantment(Enchantment.DAMAGE_ALL, 1).enchantment(Enchantment.DURABILITY, 3).build();
    }

    @Override
    public Ability getAbility() {
        return SoupPvP.getInstance().getAbilityManager().getAbilityByName("Poison Bomb");
    }

    @Override
    public PotionEffect[] getPotionEffects() {
        return new PotionEffect[0];
    }
}
