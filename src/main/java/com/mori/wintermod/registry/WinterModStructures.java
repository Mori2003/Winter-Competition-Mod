package com.mori.wintermod.registry;

import com.mori.wintermod.WinterMod;
import com.mori.wintermod.world.structures.CozyCabinFeature;
import com.mori.wintermod.world.structures.CozyCabinPieces;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.structure.v1.FabricStructureBuilder;
import net.minecraft.structure.StructurePieceType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredStructureFeature;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;

public class WinterModStructures 
{

	public static final StructurePieceType COZYCABIN_PIECE = CozyCabinPieces::new;
	private static final StructureFeature<DefaultFeatureConfig> COZYCABIN_STRUCTURE = new CozyCabinFeature(DefaultFeatureConfig.CODEC);
	private static final ConfiguredStructureFeature<?, ?> COZYCABIN_CONFIGURED = COZYCABIN_STRUCTURE.configure(DefaultFeatureConfig.DEFAULT);

    public static void registerStructures() 
    {
		Registry.register(Registry.STRUCTURE_PIECE, new Identifier(WinterMod.MOD_ID, "cozycabin"), COZYCABIN_PIECE);
	  	FabricStructureBuilder.create(new Identifier(WinterMod.MOD_ID, "cozycabin"), COZYCABIN_STRUCTURE)
		.step(GenerationStep.Feature.SURFACE_STRUCTURES)
		.defaultConfig(15, 8, 52545)		
		.adjustsSurface()
		.register();

		RegistryKey<ConfiguredStructureFeature<?, ?>> CozyCabinConfigured = RegistryKey.of(Registry.CONFIGURED_STRUCTURE_FEATURE_WORLDGEN,
		new Identifier(WinterMod.MOD_ID, "cozycabin"));
		BuiltinRegistries.add(BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE, CozyCabinConfigured.getValue(),COZYCABIN_CONFIGURED);

	  BiomeModifications.addStructure(BiomeSelectors.includeByKey(WinterModBiomes.CRYSTALMOUNTAINS_KEY), CozyCabinConfigured);
    }    
}