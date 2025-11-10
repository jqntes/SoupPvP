package me.jqntes.souppvp.user.ui.kit;
import me.jqntes.souppvp.SoupPvP;
import me.jqntes.souppvp.loadout.kit.Kit;
import me.jqntes.souppvp.user.User;
import me.jqntes.souppvp.user.buttons.PlaceholderButton;
import me.jqntes.souppvp.user.ui.kit.selection.KitSelectionButton;
import net.j4c0b3y.api.menu.Menu;
import net.j4c0b3y.api.menu.MenuSize;
import org.bukkit.entity.Player;

public class KitSelectionMenu extends Menu {



    public KitSelectionMenu(Player player) {
        super("Kit Selection", MenuSize.SIX, player);

    }

    @Override
    public void setupButtons() {
        fillBorder(new PlaceholderButton());
        User user = SoupPvP.getInstance().getUserManager().getByUuid(getPlayer().getUniqueId());

        for (Kit kit : SoupPvP.getInstance().getKitManager().getKits()) {
            add(new KitSelectionButton(kit, user, this));
        }
    }


}
