package com.mori.wintermod.items.tools;

import com.mori.wintermod.registry.WinterModItems;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class IceToolMaterial implements ToolMaterial {

    public static final IceToolMaterial INSTANCE = new IceToolMaterial();

    @Override
    public int getDurability() {
        // TODO Auto-generated method stub
        return 600;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        // TODO Auto-generated method stub
        return 7.0F;
    }

    @Override
    public float getAttackDamage() {
        // TODO Auto-generated method stub
        return 2.5F;
    }

    @Override
    public int getMiningLevel() {
        // TODO Auto-generated method stub
        return 2;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 12;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return Ingredient.ofItems(WinterModItems.ICEDCRYSTAL);
    }
    
}