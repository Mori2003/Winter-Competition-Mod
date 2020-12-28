package com.mori.wintermod.registry;

import com.mori.wintermod.WinterMod;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WinterModBlocks 
{

    public static final Block ICEDCRYSTAL_ORE = new Block(FabricBlockSettings.of(Material.METAL).hardness(3.0f).sounds(BlockSoundGroup.NETHER_GOLD_ORE).breakByTool(FabricToolTags.PICKAXES, 2));

    public static void registerBlocks() 
    {
        Registry.register(Registry.BLOCK, new Identifier(WinterMod.MOD_ID, "icedcrystal_ore"), ICEDCRYSTAL_ORE);
        Registry.register(Registry.ITEM, new Identifier(WinterMod.MOD_ID, "icedcrystal_ore"), new BlockItem(ICEDCRYSTAL_ORE, new Item.Settings().group(WinterModItemGroup.ITEM_GROUP)));
    }
}