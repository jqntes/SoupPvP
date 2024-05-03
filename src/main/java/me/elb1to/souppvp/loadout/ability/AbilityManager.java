package me.elb1to.souppvp.loadout.ability;

import lombok.Getter;
import me.elb1to.souppvp.loadout.ability.impl.ChemistAbility;
import me.elb1to.souppvp.loadout.ability.impl.PearlAbility;
import me.elb1to.souppvp.loadout.ability.impl.ShurikenAbility;
import me.elb1to.souppvp.loadout.ability.impl.StompAbility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elb1to
 * Project: SoupPvP
 * Date: 7/23/2021 @ 3:45 PM
 */
@Getter
public class AbilityManager {

    private final List<Ability> abilities = new ArrayList<>();

    public AbilityManager() {
        abilities.add(new ShurikenAbility());
        abilities.add(new ChemistAbility());
        abilities.add(new StompAbility());
    }

    public Ability getAbilityByName(String name) {
        for (Ability ability : abilities) {
            if (name.equals(ability.getName())) {
                return ability;
            }
        }

        return null;
    }
}
