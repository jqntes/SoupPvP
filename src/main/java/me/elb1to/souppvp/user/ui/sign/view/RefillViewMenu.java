package me.elb1to.souppvp.user.ui.sign.view;

import gg.voided.api.menu.Menu;
import gg.voided.api.menu.button.Button;
import me.elb1to.souppvp.user.ui.sign.RefillMenu;
import me.elb1to.souppvp.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import javax.swing.*;

public class RefillViewMenu extends Button {
    private ItemStack stack = new ItemStack(Material.MUSHROOM_SOUP);
    private final Menu menu;
    private final ItemBuilder builder = new ItemBuilder(Material.MUSHROOM_SOUP).name("Soup").hideFlags();

    public RefillViewMenu(Menu menu) {
        this.menu = menu;
    }


    @Override
    public ItemStack getItem(Player player) {
        if (player.getInventory().getName().equalsIgnoreCase("Refill")){
            for (int i = 0; i < player.getInventory().getSize(); i++) {
                if (player.getInventory().getItem(i) == null) {
                    player.getInventory().setItem(i, builder.build());
                 }

            }

        }
        return null;
    }
}


