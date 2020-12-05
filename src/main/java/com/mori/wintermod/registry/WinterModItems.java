package com.mori.wintermod.registry;

import com.mori.wintermod.WinterMod;
import com.mori.wintermod.items.food.HotChocolateItem;
import com.mori.wintermod.items.icon.SnowflakeItem;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WinterModItems 
{
    //Icon (for Itemgroup)
    public static final Item SNOWFLAKE = new SnowflakeItem(new FabricItemSettings());
    
    //Item

    //Drink/Food
    public static final Item HOT_CHOCOLATE = new HotChocolateItem(new FabricItemSettings().group(WinterModItemGroup.ITEM_GROUP).food(FoodComponents.POTATO).maxCount(2));

    //Tools

    public static void registerItems() 
    {
        //Icon
        Registry.register(Registry.ITEM, new Identifier(WinterMod.MOD_ID, "snowflake"), SNOWFLAKE);
        
        //Item

        //Drink/Food
        Registry.register(Registry.ITEM, new Identifier(WinterMod.MOD_ID, "hot_chocolate"), HOT_CHOCOLATE);

        //Tools
    }
}