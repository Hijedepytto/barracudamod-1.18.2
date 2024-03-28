package net.infugogr.barracudamod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.infugogr.barracudamod.BarracudaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item AQUATIC_DUST = registerItem("aquatic_dust",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item SEA_INGOT = registerItem("sea_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item SEA_MINERAL = registerItem("sea_mineral",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(BarracudaMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        BarracudaMod.LOGGER.info("Registering Mod Items for" + BarracudaMod.MOD_ID);
    }
}
