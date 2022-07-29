package coder.magitech.magitechfox.client.init.items.moditems;

import coder.magitech.magitechfox.client.init.WolvesTab;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Vampire_Fang extends Item {
    public Vampire_Fang() {
        super(new Properties().tab(WolvesTab.instance1));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        return super.use(world, player, hand);
    }
}
