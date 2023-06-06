package fr.nirbose.framacraft.api.views;

import org.bukkit.inventory.ItemStack;

public class SlotAnimation {

    private final int tick;

    private final ItemStack[] items;

    public SlotAnimation(int tick, ItemStack ...items) {
        this.tick = tick;
        this.items = items;
    }

    public int getTick() {
        return this.tick;
    }

    public ItemStack[] getItems() {
        return this.items;
    }

}
