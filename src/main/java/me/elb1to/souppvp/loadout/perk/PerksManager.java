package me.elb1to.souppvp.loadout.perk;

import lombok.Getter;
import me.elb1to.souppvp.loadout.perk.impl.DoubleHealthPerk;


import java.util.ArrayList;
import java.util.List;
@Getter
public class PerksManager {

    private final List<Perks> perks = new ArrayList<>();

    public PerksManager(){
        perks.add(new DoubleHealthPerk());


    }

}
