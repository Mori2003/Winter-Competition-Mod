package com.mori.wintermod;

import com.mori.wintermod.registry.WinterModBiomes;
import com.mori.wintermod.registry.WinterModBlocks;
//import com.mori.wintermod.registry.WinterModEntities;
import com.mori.wintermod.registry.WinterModFeatures;
import com.mori.wintermod.registry.WinterModItems;
import com.mori.wintermod.registry.WinterModPaintings;
import com.mori.wintermod.registry.WinterModScreenHandlers;
import com.mori.wintermod.registry.WinterModStructures;
import com.mori.wintermod.registry.WinterModTileEntities;

import net.fabricmc.api.ModInitializer;

public class WinterMod implements ModInitializer {
	
	public static final String MOD_ID = "wintermod";
	
	@Override
	public void onInitialize() 
	{
		WinterModItems.registerItems();
		WinterModBlocks.registerBlocks();
		WinterModBiomes.registerBiomes();
		//WinterModEntities.registerEntites();
		WinterModFeatures.registerFeatures();
		WinterModPaintings.registerPaintings();
		WinterModStructures.registerStructures();
		WinterModTileEntities.registerTileEntites();
		WinterModScreenHandlers.registerScreenHandlers();
	}
}
