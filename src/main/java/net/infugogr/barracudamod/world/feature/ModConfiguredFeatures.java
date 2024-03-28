package net.infugogr.barracudamod.world.feature;

import net.infugogr.barracudamod.BarracudaMod;
import net.infugogr.barracudamod.ModBlockTags;
import net.infugogr.barracudamod.block.ModBlocks;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;


import java.util.List;

public class ModConfiguredFeatures {

    public static final RuleTest SAND_ORE_REPLACEABLES = new TagMatchRuleTest(ModBlockTags.SAND_ORE_REPLACEABLES);
    public static final List<OreFeatureConfig.Target> OVERWORLD_AQUATIC_DUST = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.SAND_ORE_REPLACEABLES,
                    ModBlocks.AQUATIC_SAND.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> AQUATIC_SAND =
            ConfiguredFeatures.register("aquatic_sand", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_AQUATIC_DUST, 17));

    public static void reigsterConfiguredFeatures(){
        System.out.println("Registering ModConfiguredFeatures for " + BarracudaMod.MOD_ID);
    }
}
