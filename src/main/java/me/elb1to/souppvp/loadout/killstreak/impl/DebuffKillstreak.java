package me.elb1to.souppvp.loadout.killstreak.impl;

import me.elb1to.souppvp.SoupPvP;
import me.elb1to.souppvp.loadout.killstreak.Killstreak;
import me.elb1to.souppvp.loadout.killstreak.KillstreakCallable;
import me.elb1to.souppvp.user.User;
import me.elb1to.souppvp.utils.ColorHelper;
import me.elb1to.souppvp.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class DebuffKillstreak extends Killstreak {
    private User user;

    public DebuffKillstreak() {
        super("Wizardly", Material.BEACON, new String[]{
            ChatColor.BOLD + ""
        }, 5, new ItemBuilder(Material.BEACON).name("Wizardly").build());
    }


    @Override
    public void onClickPerkInventory(Player player) {

    }

    @Override
    public Killstreak getKillstreak() {
        return SoupPvP.getInstance().getPerksManager().getKillstreakByName("Wizardly");
    }

    @Override
    public KillstreakCallable getCallable() {
        return player -> {
                for (Player p : Bukkit.getOnlinePlayers()) {
                    Bukkit.getServer().broadcastMessage(ColorHelper.CHAT_BAR);
                    Bukkit.getServer().broadcastMessage(ColorHelper.translate(player.getDisplayName() + "has reached the killstreak of " + user.getCurrentKillstreak() + "and has received the " + getName()));
                    Bukkit.getServer().broadcastMessage(ColorHelper.CHAT_BAR);
                    player.getInventory().setItem(1, new ItemBuilder(Material.BEACON).name("Wizardly").build());
                        for (Entity e : player.getNearbyEntities(10, 10, 10)) {
                            Player found = (Player) e;
                            found.addPotionEffect(new PotionEffect(PotionEffectType.HARM, 8 * 12, 0));
                            found.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 8 * 12, 0));
                            found.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 8 * 12, 0));


                        }
                    }

                };

            }
            ;
        };


