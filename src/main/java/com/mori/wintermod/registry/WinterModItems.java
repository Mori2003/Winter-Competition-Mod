package com.mori.wintermod.registry;

import com.mori.wintermod.WinterMod;
import com.mori.wintermod.items.armor.IceArmorItem;
import com.mori.wintermod.items.armor.IceArmorMaterial;
import com.mori.wintermod.items.food.HotChocolateItem;
import com.mori.wintermod.items.icon.SnowflakeItem;
import com.mori.wintermod.items.tools.IceAxe;
import com.mori.wintermod.items.tools.IceHoe;
import com.mori.wintermod.items.tools.IcePickaxe;
import com.mori.wintermod.items.tools.IceSword;
import com.mori.wintermod.items.tools.IceToolMaterial;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WinterModItems 
{
    //Icon (for Itemgroup)
    public static final Item SNOWFLAKE = new SnowflakeItem(new FabricItemSettings());
    
    //Item
    public static final Item ICEDCRYSTAL = new Item(new FabricItemSettings().group(WinterModItemGroup.ITEM_GROUP).maxCount(16));

    //Drink/Food
    public static final Item HOT_CHOCOLATE = new HotChocolateItem(new FabricItemSettings().group(WinterModItemGroup.ITEM_GROUP).food(FoodComponents.POTATO).maxCount(1));

    //Tools
    public static final Item ICE_SWORD = new IceSword(IceToolMaterial.INSTANCE, 3, -2.4F, new FabricItemSettings().group(WinterModItemGroup.ITEM_GROUP));
    public static final Item ICE_SHOVEL = new ShovelItem(IceToolMaterial.INSTANCE, 1.5F, -3.0F, new FabricItemSettings().group(WinterModItemGroup.ITEM_GROUP));

    public static final Item ICE_HOE = new IceHoe(IceToolMaterial.INSTANCE, -2, -1.0F, new FabricItemSettings().group(WinterModItemGroup.ITEM_GROUP));
    public static final Item ICE_AXE = new IceAxe(IceToolMaterial.INSTANCE, 6.0F, -3.1F, new FabricItemSettings().group(WinterModItemGroup.ITEM_GROUP));
    public static final Item ICE_PICKAXE = new IcePickaxe(IceToolMaterial.INSTANCE, 1, -2.8F, new FabricItemSettings().group(WinterModItemGroup.ITEM_GROUP));

    //Armor
    public static final ArmorMaterial IceArmorMaterial = new IceArmorMaterial();

    public static final Item ICE_HELMET = new IceArmorItem(IceArmorMaterial, EquipmentSlot.HEAD, new FabricItemSettings().group(WinterModItemGroup.ITEM_GROUP));
    public static final Item ICE_CHESTPLACE = new IceArmorItem(IceArmorMaterial, EquipmentSlot.CHEST, new FabricItemSettings().group(WinterModItemGroup.ITEM_GROUP));
    public static final Item ICE_LEGGINGS = new IceArmorItem(IceArmorMaterial, EquipmentSlot.LEGS, new FabricItemSettings().group(WinterModItemGroup.ITEM_GROUP));
    public static final Item ICE_BOOTS = new IceArmorItem(IceArmorMaterial, EquipmentSlot.FEET, new FabricItemSettings().group(WinterModItemGroup.ITEM_GROUP));
    
    public static void registerItems() 
    {
        //Icon
        Registry.register(Registry.ITEM, new Identifier(WinterMod.MOD_ID, "snowflake"), SNOWFLAKE);
        
        //Item
        Registry.register(Registry.ITEM, new Identifier(WinterMod.MOD_ID, "iced_crystal"), ICEDCRYSTAL);

        //Drink/Food
        Registry.register(Registry.ITEM, new Identifier(WinterMod.MOD_ID, "hot_chocolate"), HOT_CHOCOLATE);

        //Tools
        Registry.register(Registry.ITEM, new Identifier(WinterMod.MOD_ID, "ice_sword"), ICE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(WinterMod.MOD_ID, "ice_shovel"), ICE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(WinterMod.MOD_ID, "ice_hoe"), ICE_HOE);
        Registry.register(Registry.ITEM, new Identifier(WinterMod.MOD_ID, "ice_axe"), ICE_AXE);
        Registry.register(Registry.ITEM, new Identifier(WinterMod.MOD_ID, "ice_pickaxe"), ICE_PICKAXE);

        //Armor
        Registry.register(Registry.ITEM, new Identifier(WinterMod.MOD_ID, "ice_helmet"), ICE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(WinterMod.MOD_ID, "ice_chestplace"), ICE_CHESTPLACE);
        Registry.register(Registry.ITEM, new Identifier(WinterMod.MOD_ID, "ice_leggings"), ICE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(WinterMod.MOD_ID, "ice_boots"), ICE_BOOTS);
    }
}