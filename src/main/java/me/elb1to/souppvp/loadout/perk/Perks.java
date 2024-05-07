package me.elb1to.souppvp.loadout.perk;

import lombok.Getter;
import me.elb1to.souppvp.loadout.ability.AbilityCallable;
import org.bukkit.Material;
import org.bukkit.entity.Player;

@Getter
public abstract class Perks {


    private final String[] desc;
    private final Material icon;
    private final String name;
    private final int requiredKills;




    public Perks(String name, Material icon, String[] desc, int requiredKills){
        this.desc = desc;
        this.icon = icon;
        this.name = name;
        this.requiredKills = requiredKills;
    }

    public abstract PerksCallable getCallable();
    public abstract void onClickPerkInventory(Player player);



    public abstract Perks getPerk();


}
