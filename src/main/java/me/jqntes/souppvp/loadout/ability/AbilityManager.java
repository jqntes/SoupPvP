package me.jqntes.souppvp.loadout.ability;

import lombok.Getter;
import me.elb1to.souppvp.loadout.ability.impl.*;
import me.jqntes.souppvp.loadout.ability.impl.*;

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
        abilities.add(new IglooAbility());
        abilities.add(new ZombieAbility());
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
