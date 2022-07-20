package coder.magitech.magitechfox.client.init.items;

import coder.magitech.magitechfox.CONSTS;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CONSTS.MODID);
    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
