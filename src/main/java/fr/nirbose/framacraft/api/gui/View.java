package fr.nirbose.framacraft.api.gui;

import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class View {

    final private Inventory inventory;

    public View() {
        this.inventory = Bukkit.createInventory(null, InventoryType.CHEST);
    }

    public View(Inventory inventory) {
        this.inventory = inventory;
    }

    public void add(int slot, ItemStack itemStack) {
        inventory.setItem(slot, itemStack);
    }

    public Inventory create() {
        return this.inventory;
    }

}
