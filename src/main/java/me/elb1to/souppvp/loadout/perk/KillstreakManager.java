package me.elb1to.souppvp.loadout.perk;

import lombok.Getter;


import java.util.ArrayList;
import java.util.List;
@Getter
public class KillstreakManager {

    private final List<Killstreak> perks = new ArrayList<>();

    public KillstreakManager(){
        perks.add(new DoubleHealthPerk());


    }

}
