package me.elb1to.souppvp.layout;

import me.elb1to.souppvp.SoupPvP;
import me.elb1to.souppvp.user.User;
import me.elb1to.souppvp.utils.scoreboard.BoardAdapter;
import me.elb1to.souppvp.utils.scoreboard.BoardStyle;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

import java.util.ArrayList;
import java.util.List;

import static me.elb1to.souppvp.utils.ColorHelper.translate;

/**
 * Created by Elb1to
 * Project: SoupPvP
 * Date: 5/6/2021 @ 2:24 PM
 */
public class ServerScoreboard implements BoardAdapter {

    private final SoupPvP plugin = SoupPvP.getInstance();
    ScoreboardManager sm = Bukkit.getScoreboardManager();
    Scoreboard s = sm.getNewScoreboard();
    public void registerHealthTag(){
        Objective h = s.registerNewObjective("showhealth", Criterias.HEALTH);
        h.setDisplaySlot(DisplaySlot.BELOW_NAME);
        h.setDisplayName(ChatColor.DARK_RED + "❤");
    }

    @Override
    public String getTitle(Player player) {
        return translate("&9Soup &7&l- &bNA");
    }

    @Override
    public List<String> getLines(Player player) {
        User user = SoupPvP.getInstance().getUserManager().getByUuid(player.getUniqueId());
        List<String> strings = new ArrayList<>();


        strings.add(translate("&7&m----------------------"));
        strings.add(translate("&fKills: &9" + user.getKills()));
        strings.add(translate("&fCredits: &9" + user.getCredits()));
        strings.add(translate("&fKillstreak: &9" + user.getCurrentKillstreak()));
        strings.add(translate("&fDeaths: &9" + user.getDeaths()));


        if (plugin.getCombatManager().isCombat(player)) {
            strings.add(translate("&cCombat Tag&7: &f" + plugin.getCombatManager().getCombatTime(player) + "s"));
        }
        strings.add(translate(" "));
        strings.add(translate("&6&owinterlegends.club"));
        strings.add(translate("&7&m----------------------"));

        return strings;
    }


    @Override
    public BoardStyle getBoardStyle(Player player) {
        return BoardStyle.MODERN;
    }
}
