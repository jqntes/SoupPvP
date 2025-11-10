package me.jqntes.souppvp;

import lombok.Getter;
import me.jqntes.souppvp.controller.ClassRegistrationController;
import me.jqntes.souppvp.controller.SpawnController;
import me.jqntes.souppvp.database.MongoSrv;
import me.jqntes.souppvp.layout.ServerScoreboard;
import me.jqntes.souppvp.user.CombatManager;
import me.jqntes.souppvp.loadout.ability.AbilityManager;
import me.jqntes.souppvp.loadout.kit.KitManager;
import me.jqntes.souppvp.user.User;
import me.jqntes.souppvp.user.UserManager;
import me.jqntes.souppvp.utils.command.CommandFramework;
import me.jqntes.souppvp.utils.scoreboard.BoardManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


import static me.jqntes.souppvp.utils.ColorHelper.translate;

/**
 * Created by Elb1to
 * Project: SoupPvP
 * Date: 5/6/2021 @ 11:25 AM
 */
@Getter
public final class SoupPvP extends JavaPlugin implements Listener {

	@Getter private static SoupPvP instance;

	private final CommandFramework commandFramework = new CommandFramework(this);
	private final ClassRegistrationController crc = new ClassRegistrationController();

	private MongoSrv mongoSrv;
	private KitManager kitManager;
	private UserManager userManager;
	private AbilityManager abilityManager;
	private SpawnController spawnController;
	private CombatManager combatManager;
    private net.j4c0b3y.api.menu.MenuHandler menuHandler;

	@Override
	public void onEnable() {
		instance = this;
		this.saveDefaultConfig();

		Bukkit.getConsoleSender().sendMessage("------------------------------------------------");
		Bukkit.getConsoleSender().sendMessage(translate("&bSoupPvP has been loaded successfully &8- &fv" + getDescription().getVersion()));
        Bukkit.getConsoleSender().sendMessage(translate("&7"));
		Bukkit.getConsoleSender().sendMessage("------------------------------------------------");
		this.loadManagers();
		combatManager.runTaskTimer(this, 0, 20);
		crc.loadListeners("me.elb1to.souppvp.listeners");
		crc.loadCommands("me.elb1to.souppvp.commands");

		new BoardManager(new ServerScoreboard(), 20);
	}

    @Override
    public void onDisable() {
        for (User user : this.getUserManager().getAllUsers()) {
            this.userManager.saveUser(user);
        }

        for (Entity entity : this.getServer().getWorld("world").getEntities()) {
            if (entity.getType() == EntityType.DROPPED_ITEM) {
                entity.remove();
            }
        }

        this.mongoSrv.disconnect();
    }

	private void loadManagers() {
	    this.mongoSrv = new MongoSrv();
		this.kitManager = new KitManager();
		this.userManager = new UserManager();
		this.abilityManager = new AbilityManager();
		this.spawnController = new SpawnController();
		this.combatManager = new CombatManager();
        this.menuHandler = new net.j4c0b3y.api.menu.MenuHandler(this);
	}


}
