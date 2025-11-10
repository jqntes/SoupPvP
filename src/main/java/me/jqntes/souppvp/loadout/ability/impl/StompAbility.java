package me.jqntes.souppvp.loadout.ability.impl;

import me.jqntes.souppvp.loadout.ability.Ability;
import me.jqntes.souppvp.loadout.ability.AbilityCallable;
import me.jqntes.souppvp.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class StompAbility extends Ability {
    private EntityDamageEvent event;
    private PlayerInteractEvent event1;

    public StompAbility() {
        super("Slam", new ItemBuilder(Material.ANVIL).name("&9Slam").lore("Right click this to damage players in an five block radius when back on floor").build());
    }

    @Override
    public long getCooldown() {
        return 0;
    }

    @Override
    public AbilityCallable getCallable() {

        return player -> {
            if (!(event.getEntity() instanceof Player)) {
                return;

            }
            if (event1.getAction() == Action.RIGHT_CLICK_BLOCK){
                player.setVelocity(player.getLocation().getDirection().multiply(4));
            }
                if (event.getCause() == EntityDamageEvent.DamageCause.FALL){
                    if (event.getDamage() < 4){
                        event.setCancelled(true);
                        player.damage(4);
                        player.getWorld().createExplosion(player.getLocation(), 0);


                    }
                    for (Entity entity : player.getNearbyEntities(0.5, 0.5, 1)){
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
                    }
                }
            }







                }
                ;
            }

        };

