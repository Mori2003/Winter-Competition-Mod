package com.mori.wintermod.registry;

import com.mori.wintermod.WinterMod;
import com.mori.wintermod.blocks.PresentTileEntity;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WinterModTileEntities 
{
    public static BlockEntityType<PresentTileEntity> PRESENT_TILE;

    public static void registerTileEntites() 
    {

        PRESENT_TILE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(WinterMod.MOD_ID, "present"), BlockEntityType.Builder.create(PresentTileEntity::new, WinterModBlocks.PRESENT).build(null));

    }


}