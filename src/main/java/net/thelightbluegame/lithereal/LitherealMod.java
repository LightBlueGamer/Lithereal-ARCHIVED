package net.thelightbluegame.lithereal;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LitherealMod implements ModInitializer {
	public static final String MOD_ID = "lithereal";
	public static final Logger LOGGER = LogManager.getLogger("modid");

	@Override
	public void onInitialize() {
		LOGGER.info("Loading Lithereal");
	}
}
