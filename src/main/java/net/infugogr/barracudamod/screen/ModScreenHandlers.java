package net.infugogr.barracudamod.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.infugogr.barracudamod.BarracudaMod;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static ScreenHandlerType<PoseidonScreenHandler> POSEIDON_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(BarracudaMod.MOD_ID, "poseidon"),
                    PoseidonScreenHandler::new);
}
