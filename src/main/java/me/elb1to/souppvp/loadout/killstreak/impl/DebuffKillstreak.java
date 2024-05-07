package me.elb1to.souppvp.loadout.killstreak.impl;

import me.elb1to.souppvp.SoupPvP;
import me.elb1to.souppvp.loadout.killstreak.Killstreak;
import me.elb1to.souppvp.loadout.killstreak.KillstreakCallable;
import me.elb1to.souppvp.user.User;
import me.elb1to.souppvp.utils.ItemBuilder;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class DebuffKillstreak extends Killstreak {
    private  Player player;
    public DebuffKillstreak() {
        super("Debuff", Material.BEACON, new String[]{
            ChatColor.BOLD + "To activate this killstreak / power you require the amount of kills provided below"
        }, 5, new ItemBuilder(Material.BEACON).name("Debuff").build());
    }

    @Override
    public KillstreakCallable getCallable() {
        User user = SoupPvP.getInstance().getUserManager().getByUuid(player.getUniqueId());
        return player ->{
            if (user.getCurrentKillstreak() == 5){
                if (player.getInventory().getItemInHand().isSimilar(new DebuffKillstreak().getItem())){
                    for(Entity e : player.getNearbyEntities(10, 10, 20)) {
                        if (e instanceof Player){
                            Player victim = (Player) e;
                            victim.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 7*12, 2));
                            victim.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 7*12, 2));
                }



                        }

                    }

                }


            return null;
        };
    }


    @Override
    public void onClickPerkInventory(Player player) {


    }

    @Override
    public Killstreak getKillstreak() {
        return this;
    }
}
