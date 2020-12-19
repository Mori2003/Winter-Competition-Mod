package com.mori.wintermod.items.armor;

import com.mori.wintermod.registry.WinterModItems;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class IceArmorMaterial implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
	private static final int[] PROTECTION_VALUES = new int[] {2, 5, 7, 2};
 
	@Override
	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[slot.getEntitySlotId()] * 22;
	}
 
	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return PROTECTION_VALUES[slot.getEntitySlotId()];
	}
 
	@Override
	public int getEnchantability() {
		return 10;
	}
 
	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_CHAIN;
	}
 
	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(WinterModItems.ICEDCRYSTAL);
	}
 
	@Override
	public String getName() {
		return "icedcrystal";
	}
 
	@Override
	public float getToughness() {
		return 0.75F;
	}
 
	@Override
	public float getKnockbackResistance() {
		return 0.1F;
	}
    
}