package me.elb1to.souppvp.bounty;

import lombok.Getter;
import me.elb1to.souppvp.loadout.kit.Kit;
import me.elb1to.souppvp.user.User;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

@Getter
public abstract class Bounty {
    private final User user;
    private final Material icon;
    private final String[] description;
    private final Kit kit;
    private final String name;
    private final int bountyTokens;
    private final ItemStack item;


    public Bounty(User user, Material icon, String[] description, Kit kit, String name, int bountyTokens, ItemStack item) {
        this.user = user;
        this.icon = icon;
        this.description = description;
        this.kit = kit;
        this.name = name;
        this.bountyTokens = user.getBounty();
        this.item = item;
    }

    public void bountyItem(Player player){

        ItemStack item = this.getItem();
      if (getBounty() != null) player.getInventory().setItem(1, getItem());

    }

    public abstract ItemStack getBountyItem();

    public abstract Bounty getBounty();


}
