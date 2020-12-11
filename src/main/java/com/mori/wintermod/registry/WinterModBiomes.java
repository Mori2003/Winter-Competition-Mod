package com.mori.wintermod.registry;

import com.mori.wintermod.world.biomes.CrystalPlains;

import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;

public class WinterModBiomes 
{

    public static final RegistryKey<Biome> CRYSTALPLAINS_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("wintermod", "crystalplains"));

    public static void registerBiomes() {

        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier("wintermod", "crystalplainssurface"), CrystalPlains.CRYSTALPLAINS_SURFACE_BUILDER);

        Registry.register(BuiltinRegistries.BIOME, CRYSTALPLAINS_KEY.getValue(), CrystalPlains.CRYSTALPLAINS);

        
        OverworldBiomes.addBiomeVariant(BiomeKeys.SNOWY_TUNDRA, CRYSTALPLAINS_KEY, 0.1);
    }
}