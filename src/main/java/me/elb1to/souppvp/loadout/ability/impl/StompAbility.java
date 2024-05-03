package me.elb1to.souppvp.loadout.ability.impl;

import me.elb1to.souppvp.SoupPvP;
import me.elb1to.souppvp.loadout.ability.Ability;
import me.elb1to.souppvp.loadout.ability.AbilityCallable;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.util.Vector;

import java.util.Iterator;

public class StompAbility extends Ability {

    public StompAbility() {
        super("Slam", new ItemStack(Material.ANVIL));
    }

    @Override
    public long getCooldown() {
        return 0;
    }

    @Override
    public AbilityCallable getCallable() {

        return player -> {
            EntityDamageEvent event = (EntityDamageEvent) player.getPlayer();
            if (!(event.getEntity() instanceof Player)) {
                return;

            }




            if (event.getCause() == EntityDamageEvent.DamageCause.FALL) {
                if (event.getDamage() > 4) {
                    player.damage(4);
                    player.getWorld().createExplosion(player.getLocation(), 0);
                }

                for (Entity entity : player.getNearbyEntities(5.0D, 1.0D, 5.0D)) {

                    if (entity instanceof Player) {
                        Player target = (Player) entity;
                        if (target.isSneaking()) {
                            target.damage(event.getDamage() / 2, player);
                        } else {
                            target.damage(event.getDamage(), player);
                        }
                    } else if (entity instanceof LivingEntity) {
                        LivingEntity target = (LivingEntity) entity;
                        target.damage(event.getDamage(), player);
                        return;
                    }


                }
                ;
            }

        };
    }
}
