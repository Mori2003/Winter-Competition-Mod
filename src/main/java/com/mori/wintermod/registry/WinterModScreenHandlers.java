package com.mori.wintermod.registry;

import com.mori.wintermod.WinterMod;
import com.mori.wintermod.client.screens.handlers.PresentScreenHandler;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class WinterModScreenHandlers 
{
    public static ScreenHandlerType<PresentScreenHandler> PRESENT_SCREEN_HANDLER;

    public static void registerScreenHandlers() {
        PRESENT_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(WinterMod.MOD_ID, "present"),
                PresentScreenHandler::new);
    }

    
}