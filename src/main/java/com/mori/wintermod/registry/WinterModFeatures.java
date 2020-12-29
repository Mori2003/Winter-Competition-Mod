package com.mori.wintermod.registry;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class WinterModFeatures 
{
    private static ConfiguredFeature<?, ?> ORE_ICEDCRYSTAL_OVERWORLD = Feature.ORE
    .configure(new OreFeatureConfig(
      OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
      WinterModBlocks.ICEDCRYSTAL_ORE.getDefaultState(),
      10)) // vein size
    .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
      0, // bottom offset
      50, // min y level
      200))) // max y level
    .spreadHorizontally()
    .repeat(15); // number of veins per chunk


    public static void registerFeatures() 
    {
        RegistryKey<ConfiguredFeature<?, ?>> oreIcedCrystalOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
        new Identifier("wintermod", "ore_icedcrystal_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreIcedCrystalOverworld.getValue(), ORE_ICEDCRYSTAL_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(WinterModBiomes.CRYSTALMOUNTAINS_KEY), GenerationStep.Feature.UNDERGROUND_ORES, oreIcedCrystalOverworld);
    }
}