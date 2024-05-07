package me.elb1to.souppvp.loadout.perk;

import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.entity.Player;
@Getter
public abstract class Killstreak {
    private final String[] desc;
    private final Material icon;
    private final String name;
    private final int requiredKills;




    public Killstreak(String name, Material icon, String[] desc, int requiredKills){
        this.desc = desc;
        this.icon = icon;
        this.name = name;
        this.requiredKills = requiredKills;
    }

    public abstract KillstreakCallable getCallable();
    public abstract void onClickPerkInventory(Player player);



    public abstract Killstreak getKillstreak();


}
