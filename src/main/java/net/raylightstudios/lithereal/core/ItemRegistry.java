package net.raylightstudios.lithereal.core;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.raylightstudios.lithereal.Lithereal;
import net.raylightstudios.lithereal.common.materials.ModArmorMaterials;
import net.raylightstudios.lithereal.common.materials.ModToolMaterial;
import org.jetbrains.annotations.Nullable;

public class ItemRegistry{
    public static final DeferredRegister <Item> ITEMS = DeferredRegister.create( ForgeRegistries.ITEMS, Lithereal.MOD_ID );

    public static final RegistryObject <Item> PURE_LITHERITE = ITEMS.register( "pure_litherite",
                                                                               () -> new Item(new Item.Properties().tab(ModItemGroup.LITHEREAL)) );

    public static final RegistryObject<Item> RAW_LITHERITE = ITEMS.register("raw_litherite",
                                                                            () -> new Item(new Item.Properties().tab(ModItemGroup.LITHEREAL)));

    public static final RegistryObject<Item> INFUSED_COAL = ITEMS.register("infused_coal",
                                                                           () -> new Item(new Item.Properties().tab(ModItemGroup.LITHEREAL)){
                                                                               @Override
                                                                               public int getBurnTime( ItemStack itemStack , @Nullable RecipeType <?> recipeType ){
                                                                                   return 2400;
                                                                               }
                                                                           } );

    public static final RegistryObject<Item> LITHERITE_PICKAXE = ITEMS.register("litherite_pickaxe",
                                                                                () -> new PickaxeItem( ModToolMaterial.LITHERITE, 1, -2.8f,
                                                                               new Item.Properties().tab(ModItemGroup.LITHEREAL)));

    public static final RegistryObject<Item> LITHERITE_AXE = ITEMS.register("litherite_axe",
                                                                            () -> new AxeItem( ModToolMaterial.LITHERITE, 8.5f, -3.05f,
                                                                       new Item.Properties().tab(ModItemGroup.LITHEREAL)));

    public static final RegistryObject<Item> LITHERITE_HOE = ITEMS.register("litherite_hoe",
                                                                            () -> new HoeItem( ModToolMaterial.LITHERITE, 2, -0.5f,
                                                                       new Item.Properties().tab(ModItemGroup.LITHEREAL)));

    public static final RegistryObject<Item> LITHERITE_SHOVEL = ITEMS.register("litherite_shovel",
                                                                               () -> new ShovelItem( ModToolMaterial.LITHERITE, 1.5f, -3.0f,
                                                                             new Item.Properties().tab(ModItemGroup.LITHEREAL)));

    public static final RegistryObject<Item> LITHERITE_SWORD = ITEMS.register("litherite_sword",
                                                                              () -> new SwordItem( ModToolMaterial.LITHERITE, 3, -2.4f,
                                                                           new Item.Properties().tab(ModItemGroup.LITHEREAL)));

    public static final RegistryObject<Item> LITHERITE_HELMET = ITEMS.register("litherite_helmet",
                                                                               () -> new ArmorItem( ModArmorMaterials.LITHERITE, EquipmentSlot.HEAD,
                                                                            new Item.Properties().tab(ModItemGroup.LITHEREAL)));
    public static final RegistryObject<Item> LITHERITE_CHESTPLATE = ITEMS.register("litherite_chestplate",
                                                                                   () -> new ArmorItem(ModArmorMaterials.LITHERITE, EquipmentSlot.CHEST,
                                                                               new Item.Properties().tab(ModItemGroup.LITHEREAL)));
    public static final RegistryObject<Item> LITHERITE_LEGGINGS = ITEMS.register("litherite_leggings",
                                                                                 () -> new ArmorItem(ModArmorMaterials.LITHERITE, EquipmentSlot.LEGS,
                                                                             new Item.Properties().tab(ModItemGroup.LITHEREAL)));
    public static final RegistryObject<Item> LITHERITE_BOOTS = ITEMS.register("litherite_boots",
                                                                              () -> new ArmorItem( ModArmorMaterials.LITHERITE, EquipmentSlot.FEET,
                                                                           new Item.Properties().tab(ModItemGroup.LITHEREAL)));

}
