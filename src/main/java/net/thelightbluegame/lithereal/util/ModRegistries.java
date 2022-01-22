package net.thelightbluegame.lithereal.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.thelightbluegame.lithereal.block.ModBlocks;

public class ModRegistries {
    public static void registerModStuffs() {
        registerStrippables();
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.SHIFTED_LOG, ModBlocks.STRIPPED_SHIFTED_LOG);
        StrippableBlockRegistry.register(ModBlocks.SHIFTED_WOOD, ModBlocks.STRIPPED_SHIFTED_WOOD);
        StrippableBlockRegistry.register(ModBlocks.MANGLED_LOG, ModBlocks.STRIPPED_MANGLED_LOG);
        StrippableBlockRegistry.register(ModBlocks.MANGLED_WOOD, ModBlocks.STRIPPED_MANGLED_WOOD);
    }
}
