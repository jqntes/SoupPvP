package me.jqntes.souppvp.loadout.ability.impl;

import me.jqntes.souppvp.listeners.ServerListener;
import me.jqntes.souppvp.loadout.ability.Ability;
import me.jqntes.souppvp.loadout.ability.AbilityCallable;
import me.jqntes.souppvp.utils.ItemBuilder;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Collections;

public class ChemistAbility extends Ability {
    private ServerListener listener;

    public ChemistAbility() {
        super("Poison Bomb", new ItemBuilder(Material.REDSTONE).name("&9Poison Bomb").lore(Collections.singletonList("&7Right click to give nearby enemys effects when clicked")).build());
    }

    @Override
    public long getCooldown() {
        return 10;
    }

    @Override
    public AbilityCallable getCallable() {
        return player -> {

            for(Entity e : player.getNearbyEntities(10, 256, 10)) {
                if(e instanceof Player) {
                    Player found = (Player)e;
                    found.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 7*12, 2));
                    found.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 7*12, 1));
                    found.playSound(new Location(player.getWorld(), Sound.BAT_LOOP.ordinal(), 1, 1));
                    player.sendMessage(ChatColor.GRAY + "You have used the chemist ability");

                    }
                }





        };

    }
}




