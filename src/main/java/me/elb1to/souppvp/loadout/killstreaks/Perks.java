package me.elb1to.souppvp.loadout.killstreaks;

import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.entity.Player;

@Getter
public abstract class Perks {


    private final String[] desc;
    private final Material icon;
    private final String name;




    public Perks(String name, Material icon, String[] desc){
        this.desc = desc;
        this.icon = icon;
        this.name = name;
    }


    public void onClickPerkInventory(Player player){


    }

    public abstract Perks getPerk();


}
