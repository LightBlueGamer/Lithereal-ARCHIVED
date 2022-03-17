package net.raylightstudios.lithereal.core;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup extends CreativeModeTab{
    public static final ModItemGroup LITHEREAL = new ModItemGroup( CreativeModeTab.TABS.length, "lithereal.lithereal" );

    public ModItemGroup( int pId , String pLangId ){
        super( pId , pLangId );
    }

    @Override
    public ItemStack makeIcon(){
        return ItemRegistry.RAW_LITHERITE.get().getDefaultInstance();
    }
}
