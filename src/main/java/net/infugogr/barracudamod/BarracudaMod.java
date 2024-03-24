package net.infugogr.barracudamod;

import net.fabricmc.api.ModInitializer;
import net.infugogr.barracudamod.block.ModBlocks;
import net.infugogr.barracudamod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BarracudaMod implements ModInitializer {

	public static final String MOD_ID = "barracudamod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
