package net.thelightbluegame.lithereal.world.feature;

import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.thelightbluegame.lithereal.LitherealMod;
import net.thelightbluegame.lithereal.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_LITHERITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.LITHERITE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_LITHERITE_ORE.getDefaultState()));

    public static final ConfiguredFeature<?, ?> LITHERITE_ORE = register("litherite_ore",
            Feature.ORE.configure(new OreFeatureConfig(OVERWORLD_LITHERITE_ORES, 8)));

    public static final List<OreFeatureConfig.Target> OVERWORLD_AETHER_STONE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.AETHER_STONE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.AETHER_DEEPSLATE.getDefaultState()));

    public static final ConfiguredFeature<?, ?> AETHER_STONE = register("aether_stone",
            Feature.ORE.configure(new OreFeatureConfig(OVERWORLD_AETHER_STONE, 50)));

    public static final List<OreFeatureConfig.Target> OVERWORLD_COARSITE_STONE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.COARSITE_STONE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.COARSITE_DEEPSLATE.getDefaultState()));

    public static final ConfiguredFeature<?, ?> COARSITE_STONE = register("coarsite_stone",
            Feature.ORE.configure(new OreFeatureConfig(OVERWORLD_COARSITE_STONE, 50)));
    

    public static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(LitherealMod.MOD_ID, name),
                configuredFeature);
    }

    private static RandomPatchFeatureConfig createRandomPatchFeatureConfig(BlockStateProvider block, int tries) {
        return ConfiguredFeatures.createRandomPatchFeatureConfig(tries,
                Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(block)).withInAirFilter());
    }

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + LitherealMod.MOD_ID);
    }
}