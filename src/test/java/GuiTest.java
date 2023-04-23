import fr.nirbose.framacraft.api.gui.View;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class GuiTest extends Assertions {

    @Test
    void testCreateGui() {
        View view = new View(new MockInventory());

        assertInstanceOf(Inventory.class, view.create());
    }

    private static class MockInventory implements Inventory {

        private final ItemStack[] contents = new ItemStack[54];

        @Override
        public int getSize() {
            return contents.length;
        }

        @Override
        public int getMaxStackSize() {
            return 0;
        }

        @Override
        public void setMaxStackSize(int size) {

        }

        @Nullable
        @Override
        public ItemStack getItem(int index) {
            return contents[index];
        }

        @Override
        public void setItem(int index, @Nullable ItemStack item) {
            contents[index] = item;
        }

        @NotNull
        @Override
        public HashMap<Integer, ItemStack> addItem(@NotNull ItemStack... items) throws IllegalArgumentException {
            return null;
        }

        @NotNull
        @Override
        public HashMap<Integer, ItemStack> removeItem(@NotNull ItemStack... items) throws IllegalArgumentException {
            return null;
        }

        @NotNull
        @Override
        public ItemStack[] getContents() {
            return new ItemStack[0];
        }

        @Override
        public void setContents(@NotNull ItemStack[] items) throws IllegalArgumentException {

        }

        @NotNull
        @Override
        public ItemStack[] getStorageContents() {
            return new ItemStack[0];
        }

        @Override
        public void setStorageContents(@NotNull ItemStack[] items) throws IllegalArgumentException {

        }

        @Override
        public boolean contains(@NotNull Material material) throws IllegalArgumentException {
            return false;
        }

        @Override
        public boolean contains(@Nullable ItemStack item) {
            return false;
        }

        @Override
        public boolean contains(@NotNull Material material, int amount) throws IllegalArgumentException {
            return false;
        }

        @Override
        public boolean contains(@Nullable ItemStack item, int amount) {
            return false;
        }

        @Override
        public boolean containsAtLeast(@Nullable ItemStack item, int amount) {
            return false;
        }

        @NotNull
        @Override
        public HashMap<Integer, ? extends ItemStack> all(@NotNull Material material) throws IllegalArgumentException {
            return null;
        }

        @NotNull
        @Override
        public HashMap<Integer, ? extends ItemStack> all(@Nullable ItemStack item) {
            return null;
        }

        @Override
        public int first(@NotNull Material material) throws IllegalArgumentException {
            return 0;
        }

        @Override
        public int first(@NotNull ItemStack item) {
            return 0;
        }

        @Override
        public int firstEmpty() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public void remove(@NotNull Material material) throws IllegalArgumentException {

        }

        @Override
        public void remove(@NotNull ItemStack item) {

        }

        @Override
        public void clear(int index) {

        }

        @Override
        public void clear() {

        }

        @NotNull
        @Override
        public List<HumanEntity> getViewers() {
            return null;
        }

        @NotNull
        @Override
        public InventoryType getType() {
            return null;
        }

        @Nullable
        @Override
        public InventoryHolder getHolder() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<ItemStack> iterator() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<ItemStack> iterator(int index) {
            return null;
        }

        @Nullable
        @Override
        public Location getLocation() {
            return null;
        }
    }

}

