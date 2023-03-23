package fr.nirbose.framacraft.resources.views;

import fr.nirbose.framacraft.api.inventory.View;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class TestView extends View {

    public TestView() {
        slot(new ItemStack(Material.DIAMOND));
    }

    @Override
    public String getTitle() {
        return "TestView";
    }
}
