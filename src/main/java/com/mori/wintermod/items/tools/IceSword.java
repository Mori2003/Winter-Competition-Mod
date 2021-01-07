package com.mori.wintermod.items.tools;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class IceSword extends SwordItem {

    public IceSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // TODO Auto-generated method stub

        target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 60, 1));
    
        return super.postHit(stack, target, attacker);
    }

}