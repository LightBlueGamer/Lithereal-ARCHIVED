package net.thelightbluegame.lithereal;

import net.fabricmc.api.ModInitializer;
import net.thelightbluegame.lithereal.block.ModBlocks;
import net.thelightbluegame.lithereal.item.ModItems;
import net.thelightbluegame.lithereal.util.ModRegistries;
import net.thelightbluegame.lithereal.world.dimension.ModDimensions;
import net.thelightbluegame.lithereal.world.feature.ModConfiguredFeatures;
import net.thelightbluegame.lithereal.world.gen.ModWorldGen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LitherealMod implements ModInitializer {
	public static final String MOD_ID = "lithereal";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGen.generateModWorldGen();
		ModDimensions.register();
		ModRegistries.registerModStuffs();
	}
}
