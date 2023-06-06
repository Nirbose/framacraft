package fr.nirbose.framacraft.api.views;

import org.bukkit.inventory.ItemStack;

public class Slot {

    private final int index;

    private final ItemStack itemStack;

    private SlotAnimation slotAnimation = null;

    public Slot(int index, ItemStack itemStack) {
        this.index = index;
        this.itemStack = itemStack;
    }

    public ItemStack getItemStack() {
        return this.itemStack;
    }

    public int getIndex() {
        return index;
    }

    public void setAnimation(int tick, ItemStack ...items) {
        this.slotAnimation = new SlotAnimation(tick, items);
    }

    public boolean isAnimated() {
        return this.slotAnimation != null;
    }

}
