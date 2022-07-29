package coder.magitech.magitechfox.client.init;

import coder.magitech.magitechfox.client.init.items.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class WolvesTab extends CreativeModeTab {
    private WolvesTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemInit.VAMPIRE_FANG.get());
    }

    public static final WolvesTab instance1 = new WolvesTab(CreativeModeTab.TABS.length, "magitechfoxwolves");
}
