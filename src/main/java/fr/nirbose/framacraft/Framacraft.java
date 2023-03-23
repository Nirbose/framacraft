package fr.nirbose.framacraft;

import fr.nirbose.framacraft.resources.commands.FramaCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Framacraft extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("framacmd").setExecutor(new FramaCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
