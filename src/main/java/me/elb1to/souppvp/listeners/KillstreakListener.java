package me.elb1to.souppvp.listeners;

import me.elb1to.souppvp.SoupPvP;
import me.elb1to.souppvp.loadout.killstreak.Killstreak;
import me.elb1to.souppvp.loadout.killstreak.impl.DebuffKillstreak;
import me.elb1to.souppvp.user.User;
import me.elb1to.souppvp.utils.ColorHelper;
import me.elb1to.souppvp.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public class KillstreakListener implements Listener {

    private final SoupPvP plugin = SoupPvP.getInstance();
    private User user;
    private ItemStack stack;
    private Killstreak killstreak;

    @EventHandler
    public void onInteract(PlayerInteractEvent event){
        Player player = event.getPlayer();
        if (event.getItem() == null) {
            return;
        }

        if (event.getAction().name().startsWith("RIGHT_")) {
            if (event.getItem().isSimilar(this.plugin.getPerksManager().getKillstreakByName("Wizardly").getItem())){
                this.plugin.getPerksManager().getKillstreakByName("Wizardly").getCallable().execute(player);
            }

            }

    }



}

