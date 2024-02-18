package me.elb1to.souppvp.loadout.killstreaks;

import lombok.Getter;
import me.elb1to.souppvp.loadout.killstreaks.impl.DebuffKillstreak;

import java.util.ArrayList;
import java.util.List;
@Getter
public class KillstreakManager {

    private final List<Killstreak> killstreaks = new ArrayList<>();

    public KillstreakManager(){
        killstreaks.add(new DebuffKillstreak());

    }

}
