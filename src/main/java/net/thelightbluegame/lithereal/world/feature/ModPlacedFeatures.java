package net.thelightbluegame.lithereal.world.feature;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.thelightbluegame.lithereal.LitherealMod;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> SHIFTED_PLACED_KEY = registerKey("shifted_placed");
    public static final RegistryKey<PlacedFeature> MANGLED_PLACED_KEY = registerKey("mangled_placed");
    public static final RegistryKey<PlacedFeature> IMBUED_PLACED_KEY = registerKey("imbued_placed");

    public static final PlacedFeature SHIFTED_PLACED = registerPlacedFeature("shifted_placed",
            ModConfiguredFeatures.SHIFTED_TREE_RANDOM.withPlacement(VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2))));

    public static final PlacedFeature MANGLED_PLACED = registerPlacedFeature("mangled_placed",
            ModConfiguredFeatures.MANGLED_TREE_RANDOM.withPlacement(VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2))));

    public static final PlacedFeature IMBUED_PLACED = registerPlacedFeature("imbued_placed",
            ModConfiguredFeatures.IMBUED_TREE_RANDOM.withPlacement(VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2))));

    public static final RegistryKey<PlacedFeature> LITHERITE_ORE_PLACED_KEY = registerKey("litherite_ore_placed");
    public static final RegistryKey<PlacedFeature> AETHER_STONE_PLACED_KEY = registerKey("aether_stone_placed");
    public static final RegistryKey<PlacedFeature> COARSITE_STONE_PLACED_KEY = registerKey("coarsite_stone_placed");

    public static final PlacedFeature LITHERITE_ORE_PLACED = registerPlacedFeature("litherite_ore_placed",
            ModConfiguredFeatures.LITHERITE_ORE.withPlacement(ModOreFeatures.modifiersWithCount(5,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)))));

    public static final PlacedFeature AETHER_STONE_PLACED = registerPlacedFeature("aether_stone_placed",
            ModConfiguredFeatures.AETHER_STONE.withPlacement(ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)))));

    public static final PlacedFeature COARSITE_STONE_PLACED = registerPlacedFeature("coarsite_stone_placed",
            ModConfiguredFeatures.COARSITE_STONE.withPlacement(ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)))));

    private static PlacedFeature registerPlacedFeature(String name, PlacedFeature placedFeature) {
        return Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(LitherealMod.MOD_ID, name), placedFeature);
    }

    private static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(LitherealMod.MOD_ID, name));
    }
}
