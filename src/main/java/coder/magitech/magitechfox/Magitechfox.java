package coder.magitech.magitechfox;

import coder.magitech.magitechfox.init.items.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CONSTS.MODID)
public class Magitechfox {
    public Magitechfox() {

        MinecraftForge.EVENT_BUS.register(this);
    }
}
