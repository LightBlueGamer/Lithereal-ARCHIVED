package net.thelightbluegame.lithereal.world.feature;

import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.foliage.MegaPineFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;
import net.minecraft.world.gen.trunk.GiantTrunkPlacer;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.thelightbluegame.lithereal.LitherealMod;
import net.thelightbluegame.lithereal.block.ModBlocks;

import java.util.List;

public class  ModConfiguredFeatures {

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> SHIFTED_TREE =
            ConfiguredFeatures.register("shifted_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.SHIFTED_LOG),
                    new StraightTrunkPlacer(4, 6, 3),
                    BlockStateProvider.of(ModBlocks.SHIFTED_LEAVES),
                    new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<PlacedFeature> SHIFTED_CHECKED =
            PlacedFeatures.register("shifted_checked", SHIFTED_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.SHIFTED_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> SHIFTED_SPAWN =
            ConfiguredFeatures.register("shifted_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(SHIFTED_CHECKED, 0.5f)),
                            SHIFTED_CHECKED));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> MANGLED_TREE =
            ConfiguredFeatures.register("mangled_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.MANGLED_LOG),
                    new StraightTrunkPlacer(4, 6, 3),
                    BlockStateProvider.of(ModBlocks.MANGLED_LEAVES),
                    new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<PlacedFeature> MANGLED_CHECKED =
            PlacedFeatures.register("mangled_checked", MANGLED_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.MANGLED_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> MANGLED_SPAWN =
            ConfiguredFeatures.register("mangled_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(MANGLED_CHECKED, 0.5f)),
                            MANGLED_CHECKED));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> IMBUED_TREE =
            ConfiguredFeatures.register("imbued_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.IMBUED_LOG),
                    new StraightTrunkPlacer(4, 6, 3),
                    BlockStateProvider.of(ModBlocks.IMBUED_LEAVES),
                    new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<PlacedFeature> IMBUED_CHECKED =
            PlacedFeatures.register("imbued_checked", IMBUED_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.IMBUED_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> IMBUED_SPAWN =
            ConfiguredFeatures.register("imbued_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(IMBUED_CHECKED, 0.5f)),
                            IMBUED_CHECKED));

    public static final List<OreFeatureConfig.Target> OVERWORLD_LITHERITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.LITHERITE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_LITHERITE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> LITHERITE_ORE =
            ConfiguredFeatures.register("litherite_ore",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_LITHERITE_ORES, 8));

    public static final List<OreFeatureConfig.Target> OVERWORLD_AETHER_STONE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.AETHER_STONE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.AETHER_DEEPSLATE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> AETHER_STONE =
            ConfiguredFeatures.register("aether_stone",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_AETHER_STONE, 35));

    public static final List<OreFeatureConfig.Target> OVERWORLD_COARSITE_STONE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.COARSITE_STONE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.COARSITE_DEEPSLATE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> COARSITE_STONE =
            ConfiguredFeatures.register("coarsite_stone",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_COARSITE_STONE, 35));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + LitherealMod.MOD_ID);
    }
}