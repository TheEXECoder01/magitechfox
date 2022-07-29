package coder.magitech.magitechfox.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class magitechModServerConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<String> TOKEN;

    static {
        BUILDER.push("Configs for Magitech Mod");

        TOKEN = BUILDER.comment("Token of the discord api")
                .define("TOKEN", "0");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
