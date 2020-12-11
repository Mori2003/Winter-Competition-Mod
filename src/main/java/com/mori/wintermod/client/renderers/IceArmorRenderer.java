package com.mori.wintermod.client.renderers;

import com.mori.wintermod.client.models.IceArmorModel;
import com.mori.wintermod.items.armor.IceArmorItem;

import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;

public class IceArmorRenderer extends GeoArmorRenderer<IceArmorItem> {
    public IceArmorRenderer() {
        super(new IceArmorModel());

        //These values are what each bone name is in blockbench. So if your head bone is named "bone545", make sure to do this.headBone = "bone545";
        // The default values are the ones that come with the default armor template in the geckolib blockbench plugin.
        this.headBone = "helmet";
        this.bodyBone = "chestplate";
        this.rightArmBone = "rightArm";
        this.leftArmBone = "leftArm";
        this.rightLegBone = "rightLeg";
        this.leftLegBone = "leftLeg";
        this.rightBootBone = "rightBoot";
        this.leftBootBone = "leftBoot";
    }
}