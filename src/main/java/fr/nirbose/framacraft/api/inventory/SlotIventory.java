package fr.nirbose.framacraft.api.inventory;

import fr.nirbose.framacraft.api.collections.Collection;
import org.bukkit.inventory.ItemStack;

public class SlotIventory {

    final private ItemStack item;

    public SlotIventory(ItemStack item) {
        this.item = item;
    }

    public SlotIventory click(View view) {
        Collection.add(this.item, view);
        return this;
    }

}
