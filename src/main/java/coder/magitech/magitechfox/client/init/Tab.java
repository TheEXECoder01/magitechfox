package coder.magitech.magitechfox.client.init;

import coder.magitech.magitechfox.client.init.items.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class Tab extends CreativeModeTab {
    private Tab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemInit.VAMPIRE_FANG.get());
    }

    public static final Tab instance1 = new Tab(CreativeModeTab.TABS.length, "magitechfoxwolves");
    public static final Tab instance2 = new Tab(CreativeModeTab.TABS.length, "magitechfoxvamps");

}
