package net.raylightstudios.lithereal.common.materials;

import cpw.mods.util.Lazy;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.raylightstudios.lithereal.core.ItemRegistry;

import java.util.function.Supplier;

public enum ModToolMaterial implements Tier{
    LITHERITE(3, 1030, 7f, 2.5f, 12, () ->
            Ingredient.of( ItemRegistry.PURE_LITHERITE.get() ));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient.get();
    }

    @Override
    public int getUses(){
        return this.itemDurability;
    }

    @Override
    public float getSpeed(){
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamageBonus(){
        return this.attackDamage;
    }

    @Override
    public int getLevel(){
        return this.miningLevel;
    }

    @Override
    public int getEnchantmentValue(){
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
