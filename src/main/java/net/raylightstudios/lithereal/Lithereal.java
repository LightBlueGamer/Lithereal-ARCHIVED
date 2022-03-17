package net.raylightstudios.lithereal;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.AxeItem;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.raylightstudios.lithereal.core.BlockRegistry;
import org.slf4j.Logger;

import static net.raylightstudios.lithereal.core.BlockRegistry.BLOCKS;
import static net.raylightstudios.lithereal.core.ItemRegistry.ITEMS;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Lithereal.MOD_ID)
public class Lithereal
{
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "lithereal";

    public Lithereal()
    {
        IEventBus bus =  FMLJavaModLoadingContext.get().getModEventBus();

        ITEMS.register( bus );
        BLOCKS.register( bus );

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener( this::registerStrippables );
    }

    public void registerStrippables( FMLLoadCompleteEvent event ){
        AxeItem.STRIPPABLES = Maps.newHashMap(AxeItem.STRIPPABLES);
        AxeItem.STRIPPABLES.put( BlockRegistry.SHIFTED_LOG.get(), BlockRegistry.STRIPPED_SHIFTED_LOG.get() );
        AxeItem.STRIPPABLES.put( BlockRegistry.SHIFTED_WOOD.get(), BlockRegistry.STRIPPED_SHIFTED_WOOD.get() );
        AxeItem.STRIPPABLES.put( BlockRegistry.MANGLED_LOG.get(), BlockRegistry.STRIPPED_MANGLED_LOG.get() );
        AxeItem.STRIPPABLES.put( BlockRegistry.MANGLED_WOOD.get(), BlockRegistry.STRIPPED_MANGLED_WOOD.get() );
        AxeItem.STRIPPABLES.put( BlockRegistry.IMBUED_LOG.get(), BlockRegistry.STRIPPED_IMBUED_LOG.get() );
        AxeItem.STRIPPABLES.put( BlockRegistry.IMBUED_WOOD.get(), BlockRegistry.STRIPPED_IMBUED_WOOD.get() );
    }
}
