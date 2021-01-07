package com.mori.wintermod;

import com.mori.wintermod.client.renderers.IceArmorRenderer;
//import com.mori.wintermod.client.renderers.IceWolfRenderer;
import com.mori.wintermod.client.screens.PresentScreen;
import com.mori.wintermod.items.armor.IceArmorItem;
import com.mori.wintermod.registry.WinterModBlocks;
//import com.mori.wintermod.registry.WinterModEntities;
import com.mori.wintermod.registry.WinterModScreenHandlers;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;

@Environment(EnvType.CLIENT)
public class WinterClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient() 
    {

        //EntityRendererRegistry.INSTANCE.register(WinterModEntities.ICEWOLF, (entityRenderDispatcher, context) -> new IceWolfRenderer(entityRenderDispatcher));



        GeoArmorRenderer.registerArmorRenderer(IceArmorItem.class, new IceArmorRenderer());

        ScreenRegistry.register(WinterModScreenHandlers.PRESENT_SCREEN_HANDLER, PresentScreen::new);

        BlockRenderLayerMap.INSTANCE.putBlock(WinterModBlocks.PRESENT, RenderLayer.getTranslucent());
    }
}