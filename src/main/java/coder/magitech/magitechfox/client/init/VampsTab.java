package coder.magitech.magitechfox.client.init;

import coder.magitech.magitechfox.client.init.items.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class VampsTab extends CreativeModeTab {
    private VampsTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemInit.BLESSED_SALT.get());
    }

    public static final VampsTab instance2 = new VampsTab(CreativeModeTab.TABS.length, "magitechfoxvamps");

}
