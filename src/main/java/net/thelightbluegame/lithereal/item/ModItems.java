package net.thelightbluegame.lithereal.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thelightbluegame.lithereal.LitherealMod;
import net.thelightbluegame.lithereal.item.custom.*;

public class ModItems {

    public static final Item PURE_LITHERITE = registerItem("pure_litherite",
            new Item(new FabricItemSettings().group(ModItemGroups.LITHEREAL)));

    public static final Item RAW_LITHERITE = registerItem("raw_litherite",
            new Item(new FabricItemSettings().group(ModItemGroups.LITHEREAL)));

    public static final Item INFUSED_COAL = registerItem("infused_coal",
            new Item(new FabricItemSettings().group(ModItemGroups.LITHEREAL)));

    public static final Item PULVERIZED_LITHERITE = registerItem("pulverized_litherite",
            new Item(new FabricItemSettings().group(ModItemGroups.LITHEREAL)));

    public static final Item IRON_PLATE = registerItem("iron_plate",
            new Item(new FabricItemSettings().group(ModItemGroups.LITHEREAL)));

    public static final Item COPPER_PLATE = registerItem("copper_plate",
            new Item(new FabricItemSettings().group(ModItemGroups.LITHEREAL)));

    public static final Item GOLD_PLATE = registerItem("gold_plate",
            new Item(new FabricItemSettings().group(ModItemGroups.LITHEREAL)));

    public static final Item DIAMOND_PLATE = registerItem("diamond_plate",
            new Item(new FabricItemSettings().group(ModItemGroups.LITHEREAL)));

    public static Item LITHERITE_HAMMER;

    static {
        LITHERITE_HAMMER = registerItem("litherite_hammer",
                new ModHammerItem(new FabricItemSettings().group(ModItemGroups.LITHEREAL).recipeRemainder(LITHERITE_HAMMER).maxDamage(500)));
    }

    public static final Item LITHERITE_AIOT = registerItem("litherite_aiot",
            new ModAiotItem(7, -2.4F, ModToolMaterial.LITHERITE, new FabricItemSettings().group(ModItemGroups.LITHEREAL).maxDamage(1030*5)));

    public static final Item LITHERITE_PICKAXE = registerItem("litherite_pickaxe",
            new ModPickaxeItem(ModToolMaterial.LITHERITE, 1, -2.8f,
                    new FabricItemSettings().group(ModItemGroups.LITHEREAL)));

    public static final Item LITHERITE_AXE = registerItem("litherite_axe",
            new ModAxeItem(ModToolMaterial.LITHERITE, 8.5f, -3.05f,
                    new FabricItemSettings().group(ModItemGroups.LITHEREAL)));

    public static final Item LITHERITE_HOE = registerItem("litherite_hoe",
            new ModHoeItem(ModToolMaterial.LITHERITE, 2.5f, -0.5f,
                    new FabricItemSettings().group(ModItemGroups.LITHEREAL)));

    public static final Item LITHERITE_SHOVEL = registerItem("litherite_shovel",
            new ShovelItem(ModToolMaterial.LITHERITE, 1.5f, -3.0f,
                    new FabricItemSettings().group(ModItemGroups.LITHEREAL)));

    public static final Item LITHERITE_SWORD = registerItem("litherite_sword",
            new SwordItem(ModToolMaterial.LITHERITE, 3, -2.4f,
                    new FabricItemSettings().group(ModItemGroups.LITHEREAL)));

    public static final Item LITHERITE_HELMET = registerItem("litherite_helmet",
            new ArmorItem(ModArmorMaterials.LITHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.LITHEREAL)));
    public static final Item LITHERITE_CHESTPLATE = registerItem("litherite_chestplate",
            new ArmorItem(ModArmorMaterials.LITHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.LITHEREAL)));
    public static final Item LITHERITE_LEGGINGS = registerItem("litherite_leggings",
            new ArmorItem(ModArmorMaterials.LITHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.LITHEREAL)));
    public static final Item LITHERITE_BOOTS = registerItem("litherite_boots",
            new ArmorItem(ModArmorMaterials.LITHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.LITHEREAL)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(LitherealMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering items for Lithereal");
    }
}
