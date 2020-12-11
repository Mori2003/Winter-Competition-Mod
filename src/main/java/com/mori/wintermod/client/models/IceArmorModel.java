package com.mori.wintermod.client.models;

import com.mori.wintermod.WinterMod;
import com.mori.wintermod.items.armor.IceArmorItem;

import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IceArmorModel extends AnimatedGeoModel<IceArmorItem> {
    @Override
    public Identifier getModelLocation(IceArmorItem object) {
        return new Identifier(WinterMod.MOD_ID, "geo/ice_armor.geo.json");
    }

    @Override
    public Identifier getTextureLocation(IceArmorItem object) {
        return new Identifier(WinterMod.MOD_ID, "textures/armor/ice_armor.png");
    }

    @Override
    public Identifier getAnimationFileLocation(IceArmorItem animatable) {
        return new Identifier(WinterMod.MOD_ID, "animations/ice_armor.animation.json");
    }
    
}