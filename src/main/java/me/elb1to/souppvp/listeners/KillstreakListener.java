package me.elb1to.souppvp.listeners;

import me.elb1to.souppvp.SoupPvP;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class KillstreakListener implements Listener {

    private final SoupPvP plugin = SoupPvP.getInstance();

    @EventHandler
    public void onPlayerKillEnemy(PlayerDeathEvent event){
        Player player = event.getEntity();
        Player victim = event.getEntity();


    }
}
