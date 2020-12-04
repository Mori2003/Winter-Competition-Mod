package com.mori.wintermod;

import com.mori.wintermod.registry.WinterModItems;

import net.fabricmc.api.ModInitializer;

public class WinterMod implements ModInitializer {
	
	public static final String MOD_ID = "wintermod";
	
	@Override
	public void onInitialize() 
	{
		WinterModItems.registerItems();
	}
}
