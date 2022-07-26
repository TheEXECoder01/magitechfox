package coder.magitech.magitechfox.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class magitechModServerConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Configs for Magitech Mod");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
