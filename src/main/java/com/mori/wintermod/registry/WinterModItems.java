package com.mori.wintermod.registry;

import com.mori.wintermod.WinterMod;
import com.mori.wintermod.items.icon.SnowflakeItem;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WinterModItems 
{
    //Icon (for Itemgroup)
    public static final Item SNOWFLAKE = new SnowflakeItem(new FabricItemSettings());
    
    //Item

    //Tools

    public static void registerItems() 
    {
        //Icon
        Registry.register(Registry.ITEM, new Identifier(WinterMod.MOD_ID, "snowflake"), SNOWFLAKE);   
        
        //Item

        //Tools
    }
}