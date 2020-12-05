package com.mori.wintermod.items.food;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.HoneyBottleItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HotChocolateItem extends HoneyBottleItem
{

    public HotChocolateItem(Settings settings) {
        super(settings);
        // TODO Auto-generated constructor stub
    }   

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        if (!world.isClient) 
        {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 30, 3));
        }
        return user instanceof PlayerEntity && ((PlayerEntity)user).abilities.creativeMode ? itemStack : new ItemStack(null);
    }
}
