package fr.nirbose.framacraft.api.views;

import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class View {

    private final List<Slot> slots = new ArrayList<>();

    public View() {

    }

    public Slot slot(int index, ItemStack itemStack) {
        Slot slot = new Slot(index, itemStack);

        this.slots.add(slot);
        return slot;
    }

    public Inventory create() {

        return Bukkit.createInventory(null, InventoryType.CHEST);
    }

}
