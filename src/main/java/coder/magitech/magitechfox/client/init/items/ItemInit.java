package coder.magitech.magitechfox.client.init.items;

import coder.magitech.magitechfox.REFERENCE;
import coder.magitech.magitechfox.client.init.VampsTab;
import coder.magitech.magitechfox.client.init.items.moditems.Blessed_salt;
import coder.magitech.magitechfox.client.init.items.moditems.Vampire_Fang;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, REFERENCE.MODID);
    public static final RegistryObject<Item> VAMPIRE_FANG = ITEMS.register("vampire_fang",
            () -> new Vampire_Fang(new Item.Properties().tab(VampsTab.instance2)));
    public static final RegistryObject<Item> BLESSED_SALT = ITEMS.register("blessed_salt",
            () -> new Blessed_salt(new Item.Properties().tab(VampsTab.instance2)));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
