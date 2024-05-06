package me.elb1to.souppvp.listeners;

import me.elb1to.souppvp.SoupPvP;
import me.elb1to.souppvp.loadout.ability.impl.ChemistAbility;
import me.elb1to.souppvp.utils.ColorHelper;
import org.bukkit.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

/**
 * Created by Elb1to
 * Project: SoupPvP
 * Date: 5/6/2021 @ 5:02 PM
 */
public class ServerListener implements Listener {


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage(null);
        player.sendMessage(ColorHelper.CHAT_BAR);
        player.sendMessage(ColorHelper.translate(ChatColor.DARK_GREEN + "Welcome to TBD Soup " ));
        player.sendMessage(ColorHelper.translate(ChatColor.WHITE + "Make sure to respect all the rules in the discord which is provided below"));
        player.sendMessage(ColorHelper.translate(ChatColor.DARK_GREEN + "The discord is discord.gg/link"));
        player.sendMessage(ColorHelper.translate(ChatColor.GRAY + "This is still in early development so bugs may be visible until fixed"));
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.setQuitMessage(null);
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        if (event.getPlayer().getGameMode() != GameMode.CREATIVE) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        if (event.getPlayer().getGameMode() != GameMode.CREATIVE) {
            event.setCancelled(true);


        }


}

    @EventHandler
    public void onExplosion(ExplosionPrimeEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void onFoodConsumption(FoodLevelChangeEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void onPortalEnter(PlayerPortalEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void onMobSpawn(CreatureSpawnEvent event) {
        if (event.getEntityType() != EntityType.ARMOR_STAND) {
            event.setCancelled(true);
        }
    }
}
