package net.thelightbluegame.lithereal.world.feature;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.thelightbluegame.lithereal.LitherealMod;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> SHIFTED_PLACED = PlacedFeatures.register("shifted_placed",
            ModConfiguredFeatures.SHIFTED_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 0)));

    public static final RegistryEntry<PlacedFeature> IMBUED_PLACED = PlacedFeatures.register("imbued_placed",
            ModConfiguredFeatures.IMBUED_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 0)));

    public static final RegistryEntry<PlacedFeature> MANGLED_PLACED = PlacedFeatures.register("mangled_placed",
            ModConfiguredFeatures.MANGLED_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 0)));

    public static final RegistryEntry<PlacedFeature> LITHERITE_ORE_PLACED = PlacedFeatures.register("litherite_ore_placed",
            ModConfiguredFeatures.LITHERITE_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static final RegistryEntry<PlacedFeature> AETHER_STONE_PLACED = PlacedFeatures.register("aether_stone_placed",
            ModConfiguredFeatures.AETHER_STONE, ModOreFeatures.modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static final RegistryEntry<PlacedFeature> COARSITE_STONE_PLACED = PlacedFeatures.register("coarsite_stone_placed",
            ModConfiguredFeatures.COARSITE_STONE, ModOreFeatures.modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
}
