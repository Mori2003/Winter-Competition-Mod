package com.mori.wintermod.registry;

import com.mori.wintermod.WinterMod;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class WinterModItemGroup 
{
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
		new Identifier(WinterMod.MOD_ID, "general"),
		() -> new ItemStack(WinterModItems.SNOWFLAKE));
}