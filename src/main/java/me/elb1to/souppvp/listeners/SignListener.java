package me.elb1to.souppvp.listeners;

import gg.voided.api.menu.Menu;
import me.elb1to.souppvp.SoupPvP;
import me.elb1to.souppvp.user.ui.sign.RefillMenu;
import me.elb1to.souppvp.user.ui.sign.view.RefillViewMenu;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class SignListener implements Listener {
    private SoupPvP plugin = SoupPvP.getInstance();

    @EventHandler
    public void onRightClickSign(PlayerInteractEvent event){
        Player player = event.getPlayer();

        if (event.getAction() == Action.RIGHT_CLICK_BLOCK){
            Block i = event.getClickedBlock();

            if (i.getState() instanceof Sign){
                BlockState state = i.getState();
                Sign sign = (Sign) state;
                if (sign.getLine(0).equalsIgnoreCase("[Refill Soup]")){
                    new RefillMenu(player).open();



                }
            }
        }
    }
}
