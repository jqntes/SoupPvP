package me.elb1to.souppvp.user.buttons;

import gg.voided.api.menu.button.Button;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlaceholderButton  extends Button {
    @Override
    public ItemStack getItem(Player player) {
        ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE);
        item.setDurability((short) 8);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("");

        item.setItemMeta(meta);
        return item;
    }
}
