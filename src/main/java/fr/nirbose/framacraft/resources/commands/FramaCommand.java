package fr.nirbose.framacraft.resources.commands;

import fr.nirbose.framacraft.resources.views.TestView;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FramaCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            new TestView().open((Player) sender);
        }
        return true;
    }
}
