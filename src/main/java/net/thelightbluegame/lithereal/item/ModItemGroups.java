package net.thelightbluegame.lithereal.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.thelightbluegame.lithereal.LitherealMod;

public class ModItemGroups {
    public static final ItemGroup LITHEREAL = FabricItemGroupBuilder.build(new Identifier(LitherealMod.MOD_ID, "lithereal"),
            () -> new ItemStack(ModItems.PURE_LITHERITE));
}
