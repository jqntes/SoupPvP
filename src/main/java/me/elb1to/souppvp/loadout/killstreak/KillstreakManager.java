package me.elb1to.souppvp.loadout.killstreak;

import lombok.Getter;
import me.elb1to.souppvp.loadout.killstreak.impl.DebuffKillstreak;


import java.util.ArrayList;
import java.util.List;
@Getter
public class KillstreakManager {

    private final List<Killstreak> killstreaks = new ArrayList<>();

    public KillstreakManager() {
        killstreaks.add(new DebuffKillstreak());


    }

    public Killstreak getKillstreakByName(String name) {
        for (Killstreak killstreak : killstreaks) {
            if (name.equals(killstreak.getName())) {
                return killstreak;
            }
        }

        return null;
    }
}
