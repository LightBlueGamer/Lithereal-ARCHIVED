package net.raylightstudios.lithereal.common.materials;

import cpw.mods.util.Lazy;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.raylightstudios.lithereal.core.ItemRegistry;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial{

    LITHERITE( "litherite", 18, new int[]{3, 5, 7, 3}, 10,
               SoundEvents.ARMOR_EQUIP_DIAMOND, 1.5F, 0.0F,
               () -> Ingredient.of( ItemRegistry.PURE_LITHERITE.get() ));

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Ingredient repairIngredientSupplier;

    ModArmorMaterials( String name , int durabilityMultiplier , int[] protectionAmounts ,
                       int enchantability , SoundEvent equipSound , float toughness ,
                       float knockbackResistance , Supplier <Ingredient> repairIngredientSupplier ) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = repairIngredientSupplier.get();
    }

    @Override
    public int getDurabilityForSlot( EquipmentSlot pSlot ){
        return BASE_DURABILITY[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot( EquipmentSlot pSlot ){
        return this.protectionAmounts[pSlot.getIndex()];
    }

    @Override
    public int getEnchantmentValue(){
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
