package com.mori.wintermod.world.biomes;

import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext.Default;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class CrystalMountains 
{
    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> CRYSTALMOUNTAINS_SURFACE_BUILDER = SurfaceBuilder.DEFAULT
    .withConfig(new TernarySurfaceConfig(
      Blocks.SNOW_BLOCK.getDefaultState(),
      Blocks.STONE.getDefaultState(),
      Blocks.GRAVEL.getDefaultState()));
 
    public static final Biome CRYSTALMOUNTAINS = createCrystalMountains();
 
    private static Biome createCrystalMountains() {
    // We specify what entities spawn and what features generate in the biome.
    // Aside from some structures, trees, rocks, plants and
    //   custom entities, these are mostly the same for each biome.
    // Vanilla configured features for biomes are defined in DefaultBiomeFeatures.
 
    SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
    DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
    DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);

    DefaultBiomeFeatures.addSnowyMobs(spawnSettings);
 
    GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
    generationSettings.surfaceBuilder(CRYSTALMOUNTAINS_SURFACE_BUILDER);
    DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
    DefaultBiomeFeatures.addLandCarvers(generationSettings);

    //DefaultBiomeFeatures.addDefaultLakes(generationSettings);
    //DefaultBiomeFeatures.addMountainTrees(generationSettings);
    DefaultBiomeFeatures.addBlueIce(generationSettings);
    //DefaultBiomeFeatures.addIcebergs(generationSettings);

    DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
    DefaultBiomeFeatures.addDungeons(generationSettings);
    DefaultBiomeFeatures.addMineables(generationSettings);
    DefaultBiomeFeatures.addDefaultOres(generationSettings);
    DefaultBiomeFeatures.addDefaultDisks(generationSettings);
    DefaultBiomeFeatures.addSprings(generationSettings);
 
    return (new Biome.Builder())
      .precipitation(Biome.Precipitation.SNOW)
      .category(Category.ICY)
      .depth(3.5F)
      .scale(0.02F)
      .temperature(0.0F)
      .downfall(0.5F)
      .effects((new BiomeEffects.Builder())
        .waterColor(0x3f76e4)
        .waterFogColor(0x050533)
        .fogColor(0xc0d8ff)
        .skyColor(0x77adff)
        .build())
      .spawnSettings(spawnSettings.build())
      .generationSettings(generationSettings.build())
      .build();
  }
}