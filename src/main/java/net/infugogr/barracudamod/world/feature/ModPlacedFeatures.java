package net.infugogr.barracudamod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> AQUATIC_SAND_PLACED = PlacedFeatures.register("aquatic_sand_placed", ModConfiguredFeatures.AQUATIC_SAND, ModOreFeatures.modifiersWithCount(30, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(62))));
    public static final RegistryEntry<PlacedFeature> AQUATIC_SAND_LOWER = PlacedFeatures.register("aquatic_sand_lower", OreConfiguredFeatures.ORE_COAL_BURIED,  ModOreFeatures.modifiersWithCount(20, HeightRangePlacementModifier.trapezoid(YOffset.fixed(30), YOffset.fixed(62))));
}
