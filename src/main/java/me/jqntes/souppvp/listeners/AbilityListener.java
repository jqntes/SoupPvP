package me.jqntes.souppvp.listeners;

import me.jqntes.souppvp.SoupPvP;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * Created by Elb1to
 * Project: SoupPvP
 * Date: 7/23/2021 @ 4:38 PM
 */
public class AbilityListener implements Listener {

    private final SoupPvP plugin = SoupPvP.getInstance();

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getItem() == null) {
            return;
        }

        if (event.getAction().name().startsWith("RIGHT_")) {
            if (event.getItem().isSimilar(this.plugin.getAbilityManager().getAbilityByName("Shuriken").getItem())) {
                this.plugin.getAbilityManager().getAbilityByName("Shuriken").getCallable().execute(player);
            }
        }
        if (event.getAction().name().startsWith("RIGHT_")) {
            if (event.getItem().isSimilar(this.plugin.getAbilityManager().getAbilityByName("Poison Bomb").getItem())) {
                this.plugin.getAbilityManager().getAbilityByName("Poison Bomb").getCallable().execute(player);
            }


        }
        if (event.getAction().name().startsWith("RIGHT_")) {
            if (event.getItem().isSimilar(this.plugin.getAbilityManager().getAbilityByName("Slam").getItem())) {
                this.plugin.getAbilityManager().getAbilityByName("Slam").getCallable().execute(player);
            }
            if (event.getAction().name().startsWith("RIGHT_")) {
                if (event.getItem().isSimilar(this.plugin.getAbilityManager().getAbilityByName("Flesh").getItem())){
                    this.plugin.getAbilityManager().getAbilityByName("Flesh").getCallable().execute(player);
                }
            }


        }


    }
}


