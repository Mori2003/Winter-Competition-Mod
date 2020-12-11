package com.mori.wintermod.world.biomes;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class CrystalPlains 
{
    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> CRYSTALPLAINS_SURFACE_BUILDER = SurfaceBuilder.DEFAULT
    .withConfig(new TernarySurfaceConfig(
      Blocks.SAND.getDefaultState(),
      Blocks.SAND.getDefaultState(),
      Blocks.SAND.getDefaultState()));
 
    public static final Biome CRYSTALPLAINS = createCrystalPlains();
 
    private static Biome createCrystalPlains() {
    // We specify what entities spawn and what features generate in the biome.
    // Aside from some structures, trees, rocks, plants and
    //   custom entities, these are mostly the same for each biome.
    // Vanilla configured features for biomes are defined in DefaultBiomeFeatures.
 
    SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
    DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
    DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);
 
    GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
    generationSettings.surfaceBuilder(CRYSTALPLAINS_SURFACE_BUILDER);
    DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
    DefaultBiomeFeatures.addLandCarvers(generationSettings);
    DefaultBiomeFeatures.addDungeons(generationSettings);
    DefaultBiomeFeatures.addMineables(generationSettings);
    DefaultBiomeFeatures.addDefaultOres(generationSettings);
    DefaultBiomeFeatures.addDefaultDisks(generationSettings);
    DefaultBiomeFeatures.addSprings(generationSettings);
 
    return (new Biome.Builder())
      .precipitation(Biome.Precipitation.RAIN)
      .category(Category.BEACH)
      .depth(0.1F)
      .scale(0.1F)
      .temperature(1.6F)
      .downfall(0.2F)
      .effects((new BiomeEffects.Builder())
        .waterColor(0x2bd9d3)
        .waterFogColor(0x050533)
        .fogColor(0xc0d8ff)
        .skyColor(0x77adff)
        .build())
      .spawnSettings(spawnSettings.build())
      .generationSettings(generationSettings.build())
      .build();
  }
}