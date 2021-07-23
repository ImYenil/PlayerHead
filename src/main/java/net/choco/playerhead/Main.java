package net.choco.playerhead;

import me.mattstudios.mf.base.CommandManager;
import net.choco.playerhead.command.PlayerHeadCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private CommandManager commandManager;

    @Override
    public void onEnable() {

        commandManager = new CommandManager(this);
        commandManager.register(new PlayerHeadCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
