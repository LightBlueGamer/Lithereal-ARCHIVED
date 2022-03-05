package net.thelightbluegame.lithereal.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.thelightbluegame.lithereal.LitherealMod;
import net.thelightbluegame.lithereal.block.ModBlocks;
import net.thelightbluegame.lithereal.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerStrippables();
        registerFuels();
    }

    private static void registerFuels() {
        System.out.println("Registering Fuels for + " + LitherealMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.INFUSED_COAL, 2400);
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.SHIFTED_LOG, ModBlocks.STRIPPED_SHIFTED_LOG);
        StrippableBlockRegistry.register(ModBlocks.SHIFTED_WOOD, ModBlocks.STRIPPED_SHIFTED_WOOD);
        StrippableBlockRegistry.register(ModBlocks.MANGLED_LOG, ModBlocks.STRIPPED_MANGLED_LOG);
        StrippableBlockRegistry.register(ModBlocks.MANGLED_WOOD, ModBlocks.STRIPPED_MANGLED_WOOD);
        StrippableBlockRegistry.register(ModBlocks.IMBUED_LOG, ModBlocks.STRIPPED_IMBUED_LOG);
        StrippableBlockRegistry.register(ModBlocks.IMBUED_WOOD, ModBlocks.STRIPPED_IMBUED_WOOD);
    }
}
