package me.elb1to.souppvp.listeners;

import me.elb1to.souppvp.SoupPvP;
import me.elb1to.souppvp.loadout.killstreak.Killstreak;
import me.elb1to.souppvp.loadout.killstreak.impl.DebuffKillstreak;
import me.elb1to.souppvp.user.User;
import me.elb1to.souppvp.utils.ColorHelper;
import me.elb1to.souppvp.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class KillstreakListener implements Listener {

    private final SoupPvP plugin = SoupPvP.getInstance();
    private User user;
    private ItemStack stack;

    @EventHandler
    public void onGrantKillstreak(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getItem() == null) {
            return;
        }
        if (user.getKillstreak().getRequiredKills() == 5){
            if (event.getAction() == Action.RIGHT_CLICK_AIR){
                user.setKillstreak(new DebuffKillstreak());
                player.getInventory().setItem(1, new ItemBuilder(new ItemStack(Material.BEACON)).name("Debuff").build());
                for (Player p : Bukkit.getOnlinePlayers()){
                    Bukkit.broadcastMessage(ColorHelper.translate(player.getDisplayName() + "has gotten an killstreak of 5 and has received an killstreak item" ));
            }

            }

        }

    }
}

