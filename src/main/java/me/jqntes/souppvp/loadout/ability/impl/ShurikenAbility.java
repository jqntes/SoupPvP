package me.jqntes.souppvp.loadout.ability.impl;

import me.jqntes.souppvp.SoupPvP;
import me.jqntes.souppvp.loadout.ability.Ability;
import me.jqntes.souppvp.loadout.ability.AbilityCallable;
import me.jqntes.souppvp.utils.ItemBuilder;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import java.util.Arrays;

/**
 * Created by Elb1to
 * Project: SoupPvP
 * Date: 7/23/2021 @ 3:48 PM
 */
public class ShurikenAbility extends Ability {

    public ShurikenAbility() {
        super("Shuriken",
            new ItemBuilder(Material.NETHER_STAR).name("&9Shuriken").lore(Arrays.asList("&7Right click to throw a Shuriken", "&7that makes people go blind.")).build()
        );
    }

    @Override
    public long getCooldown() {
        return 20L;
    }

    @Override // This ability is unfinished, so don't fuckin spam my dms.
    public AbilityCallable getCallable() {
        return player -> {
            ArmorStand shuriken = (ArmorStand) player.getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
            shuriken.setItemInHand(getItem());
            shuriken.setVisible(false);
            shuriken.setGravity(false);
            shuriken.setMarker(true);
            for (Entity e : player.getNearbyEntities(10, 10, 10)) {
                Player target = (Player) e;
                target.damage(1);
                target.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3, 3));

                player.getItemInHand().setAmount(0);

                Location location = player.getLocation().add(player.getLocation().getDirection().multiply(10));
                Vector vector = location.subtract(player.getLocation()).toVector();


                new BukkitRunnable() {
                    final int dist = 15;
                    int distTraveled = 0;

                    @Override
                    public void run() {
                        for (Entity e : player.getNearbyEntities(10, 10, 10)) {
                            Player target = (Player) e;
                            target.damage(2);
                            target.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3, 3));
                        }


                        shuriken.teleport(shuriken.getLocation().add(vector.normalize()));
                        if (distTraveled > dist) {
                            shuriken.remove();
                            cancel();
                        }

                        distTraveled++;
                    }
                }.runTaskTimer(SoupPvP.getInstance(), 1L, 1L);
            }
            ;
        };
    }
}


