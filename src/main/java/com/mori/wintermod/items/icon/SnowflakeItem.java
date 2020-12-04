package com.mori.wintermod.items.icon;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SnowflakeItem extends Item
{

    public SnowflakeItem(Settings settings) {
        super(settings);
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public boolean hasGlint(ItemStack stack) {
        // TODO Auto-generated method stub
        return true;
    }
}