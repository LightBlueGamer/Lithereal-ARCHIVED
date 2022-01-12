package net.thelightbluegame.lithereal.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thelightbluegame.lithereal.LitherealMod;

public class ModItems {

    public static final Item PURE_LITHERITE = registerItem("pure_litherite",
            new Item(new FabricItemSettings().group(ModItemGroups.LITHEREAL)));

    public static final Item RAW_LITHERITE = registerItem("raw_litherite",
            new Item(new FabricItemSettings().group(ModItemGroups.LITHEREAL)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(LitherealMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering items for Lithereal");
    }
}
