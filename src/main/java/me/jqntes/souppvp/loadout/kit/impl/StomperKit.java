package me.jqntes.souppvp.loadout.kit.impl;

import me.jqntes.souppvp.SoupPvP;
import me.jqntes.souppvp.loadout.ability.Ability;
import me.jqntes.souppvp.loadout.kit.Kit;
import me.jqntes.souppvp.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class StomperKit extends Kit {
    public StomperKit() {
        super("Stomper", Material.ANVIL, new String[]{
            "&7&oUse the anvil to damage players",
            "&7&oon fall when right clicked",
        }, 250);
    }

    @Override
    public ItemStack[] getArmor() {
        return new ItemStack[]{
                new ItemStack(Material.CHAINMAIL_BOOTS),
                new ItemStack(Material.IRON_LEGGINGS),
                new ItemStack(Material.LEATHER_CHESTPLATE),
                new ItemStack(Material.IRON_HELMET)
        };
    }

    @Override
    public ItemStack getSword() {
        return new ItemBuilder(Material.IRON_SWORD).build();
    }

    @Override
    public Ability getAbility() {
        return SoupPvP.getInstance().getAbilityManager().getAbilityByName("Slam");
    }

    @Override
    public PotionEffect[] getPotionEffects() {
        return new PotionEffect[]{
                new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0),
            new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 0)
        };

    }
}
