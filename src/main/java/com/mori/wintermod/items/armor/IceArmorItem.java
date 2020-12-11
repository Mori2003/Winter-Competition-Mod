package com.mori.wintermod.items.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;

public class IceArmorItem extends GeoArmorItem implements IAnimatable {
    private final AnimationFactory factory = new AnimationFactory(this);

    public IceArmorItem(ArmorMaterial materialIn, EquipmentSlot slot, Item.Settings builder) {
        super(materialIn, slot, builder);
    }

    // Predicate runs every frame
    private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event) {
        //This is all the extradata this event carries. The livingentity is the entity that's wearing the armor. The itemstack and equipmentslottype are self explanatory.
        
        return PlayState.CONTINUE;
    }

    //All you need to do here is add your animation controllers to the AnimationData
    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller", 20, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }
}