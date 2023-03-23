package fr.nirbose.framacraft.listeners;

import fr.nirbose.framacraft.collections.Collection;
import fr.nirbose.framacraft.inventory.View;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getCurrentItem() != null) {
            View inventory = (View) Collection.get(event.getCurrentItem());

            if (inventory != null) inventory.open((Player) event.getView().getPlayer());
        }
    }

}
