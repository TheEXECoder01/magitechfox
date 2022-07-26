package coder.magitech.magitechfox.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class magitechModClientConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<String> NAME_OF_MOD;

    static {
        BUILDER.push("Configs for Magitech mod");

        NAME_OF_MOD = BUILDER.comment("Name of Mod Use")
                .define("NAME", "TEST");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
