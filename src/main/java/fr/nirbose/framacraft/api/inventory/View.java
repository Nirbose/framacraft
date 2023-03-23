package fr.nirbose.framacraft.api.inventory;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class View {

    final private Inventory inventory;

    public View() {
        this.inventory = Bukkit.createInventory(null, this.getAmount(), this.getTitle());
    }

    public SlotIventory slot(ItemStack item) {
        inventory.addItem(item);
        return new SlotIventory(item);
    }

    public SlotIventory slot(int index, ItemStack item) {
        inventory.setItem(index, item);
        return new SlotIventory(item);
    }

    public void open(Player player) {
        player.openInventory(this.inventory);
    }

    protected String getTitle() {
        return "Menu";
    }

    protected int getAmount() {
        return 27;
    }

}
