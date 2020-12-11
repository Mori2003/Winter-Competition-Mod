package com.mori.wintermod;

import com.mori.wintermod.client.renderers.IceArmorRenderer;
import com.mori.wintermod.items.armor.IceArmorItem;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;

@Environment(EnvType.CLIENT)
public class WinterClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient() 
    {
        GeoArmorRenderer.registerArmorRenderer(IceArmorItem.class, new IceArmorRenderer());
    }
}