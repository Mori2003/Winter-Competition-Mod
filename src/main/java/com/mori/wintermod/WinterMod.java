package com.mori.wintermod;

import com.mori.wintermod.registry.WinterModBiomes;
import com.mori.wintermod.registry.WinterModBlocks;
import com.mori.wintermod.registry.WinterModEntities;
import com.mori.wintermod.registry.WinterModFeatures;
import com.mori.wintermod.registry.WinterModItems;

import net.fabricmc.api.ModInitializer;

public class WinterMod implements ModInitializer {
	
	public static final String MOD_ID = "wintermod";
	
	@Override
	public void onInitialize() 
	{
		WinterModItems.registerItems();
		WinterModBlocks.registerBlocks();
		WinterModBiomes.registerBiomes();
		WinterModEntities.registerEntites();
		WinterModFeatures.registerFeatures();
	}
}
