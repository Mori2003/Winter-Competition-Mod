package com.mori.wintermod.registry;

import com.mori.wintermod.WinterMod;

import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WinterModPaintings 
{

    public static final PaintingMotive WINTER = new PaintingMotive(32, 16);

    public static void registerPaintings() 
    {
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier(WinterMod.MOD_ID, "winter"), WINTER);
    }
}