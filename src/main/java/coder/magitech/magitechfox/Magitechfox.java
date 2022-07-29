package coder.magitech.magitechfox;

import coder.magitech.magitechfox.client.init.blocks.BlockInit;
import coder.magitech.magitechfox.client.init.items.ItemInit;
import coder.magitech.magitechfox.config.magitechModClientConfigs;
import coder.magitech.magitechfox.config.magitechModCommonConfigs;
import coder.magitech.magitechfox.config.magitechModServerConfigs;
import discord4j.core.DiscordClient;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.event.domain.lifecycle.ReadyEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// The value here should match an entry in the META-INF/mods.toml file
@Mod(REFERENCE.MODID)
public class Magitechfox {
    public static final Logger LOGGER = LogManager.getLogger();

    public Magitechfox() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.register(eventBus);

        ItemInit.register(eventBus);

        eventBus.addListener(this::setup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT,
                magitechModClientConfigs.SPEC,
                "magitech-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON,
                magitechModCommonConfigs.SPEC,
                "magitech-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER,
                magitechModServerConfigs.SPEC,
                "magitech-server.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }

    
    @OnlyIn(Dist.DEDICATED_SERVER)
    private void setup(final FMLCommonSetupEvent event) {
        final String Token = magitechModServerConfigs.TOKEN.get();
        final DiscordClient client = DiscordClient.create(Token);
        final GatewayDiscordClient gateway = client.login().block();

        gateway.on(ReadyEvent.class).subscribe(readyEvent -> {
            LOGGER.info("Testing");
        });

        LOGGER.info("HELLO FROM PREINIT!");
    }
}
