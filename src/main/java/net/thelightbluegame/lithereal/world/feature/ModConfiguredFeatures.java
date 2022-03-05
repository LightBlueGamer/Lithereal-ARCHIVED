package net.thelightbluegame.lithereal.world.feature;

import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
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

    public static final ConfiguredFeature<TreeFeatureConfig, ?> SHIFTED_TREE =
            register("shifted", Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.SHIFTED_LOG),
                    new StraightTrunkPlacer(4, 6, 3),
                    BlockStateProvider.of(ModBlocks.SHIFTED_LEAVES),
                    new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 5),
                    new TwoLayersFeatureSize(1, 0, 2)).build()));

    public static final ConfiguredFeature<RandomFeatureConfig, ?> SHIFTED_TREE_RANDOM = register("shifted_feature",
            Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(List.of(new RandomFeatureEntry(
                    SHIFTED_TREE.withWouldSurviveFilter(ModBlocks.SHIFTED_SAPLING), 0.1f)),
                    SHIFTED_TREE.withWouldSurviveFilter(ModBlocks.SHIFTED_SAPLING))));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> MANGLED_TREE =
            register("mangled", Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.MANGLED_LOG),
                    new DarkOakTrunkPlacer(8, 4, 4),
                    BlockStateProvider.of(ModBlocks.MANGLED_LEAVES),
                    new MegaPineFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), ConstantIntProvider.create(3)),
                    new TwoLayersFeatureSize(1, 0, 2)).build()));

    public static final ConfiguredFeature<RandomFeatureConfig, ?> MANGLED_TREE_RANDOM = register("mangled_feature",
            Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(List.of(new RandomFeatureEntry(
                    MANGLED_TREE.withWouldSurviveFilter(ModBlocks.MANGLED_SAPLING), 0.1f)),
                    MANGLED_TREE.withWouldSurviveFilter(ModBlocks.MANGLED_SAPLING))));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> IMBUED_TREE =
            register("imbued", Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.IMBUED_LOG),
                    new MegaJungleTrunkPlacer(15, 5, 4),
                    BlockStateProvider.of(ModBlocks.IMBUED_LEAVES),
                    new MegaPineFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(0), ConstantIntProvider.create(3)),
                    new TwoLayersFeatureSize(1, 0, 2)).build()));

    public static final ConfiguredFeature<RandomFeatureConfig, ?> IMBUED_TREE_RANDOM = register("imbued_feature",
            Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(List.of(new RandomFeatureEntry(
                    IMBUED_TREE.withWouldSurviveFilter(ModBlocks.IMBUED_SAPLING), 0.1f)),
                    IMBUED_TREE.withWouldSurviveFilter(ModBlocks.IMBUED_SAPLING))));

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