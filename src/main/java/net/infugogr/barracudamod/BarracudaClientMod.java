package net.infugogr.barracudamod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.infugogr.barracudamod.block.ModBlocks;
import net.infugogr.barracudamod.screen.ModScreenHandlers;
import net.infugogr.barracudamod.screen.PoseidonScreen;
import net.minecraft.client.render.RenderLayer;

public class BarracudaClientMod implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POSEIDON, RenderLayer.getCutout());

		ScreenRegistry.register(ModScreenHandlers.POSEIDON_SCREEN_HANDLER, PoseidonScreen::new);
	}
}
