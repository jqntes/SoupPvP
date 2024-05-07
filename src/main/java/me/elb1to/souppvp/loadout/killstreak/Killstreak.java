package me.elb1to.souppvp.loadout.killstreak;

import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

@Getter
public abstract class Killstreak {
    private final String[] desc;
    private final Material icon;
    private final String name;
    private final int requiredKills;
    private final ItemStack item;




    public Killstreak(String name, Material icon, String[] desc, int requiredKills, ItemStack item){
        this.desc = desc;
        this.icon = icon;
        this.name = name;
        this.requiredKills = requiredKills;
        this.item = item;
    }

    public abstract KillstreakCallable getCallable();
    public abstract void onClickPerkInventory(Player player);



    public abstract Killstreak getKillstreak();


}
