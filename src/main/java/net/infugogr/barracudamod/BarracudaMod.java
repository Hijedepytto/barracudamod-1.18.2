package net.infugogr.barracudamod;

import net.fabricmc.api.ModInitializer;
import net.infugogr.barracudamod.block.ModBlocks;
import net.infugogr.barracudamod.item.ModItems;
import net.infugogr.barracudamod.world.feature.ModConfiguredFeatures;
import net.infugogr.barracudamod.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BarracudaMod implements ModInitializer {

	public static final String MOD_ID = "barracudamod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.reigsterConfiguredFeatures();
		ModWorldGen.generateModWorldGen();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
