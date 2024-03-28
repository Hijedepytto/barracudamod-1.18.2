package net.infugogr.barracudamod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.infugogr.barracudamod.BarracudaMod;
import net.infugogr.barracudamod.block.custom.AquaticSand;
import net.infugogr.barracudamod.block.custom.PoseidonBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block AQUATIC_SAND = registerBlock("aquatic_sand",
            new AquaticSand(FabricBlockSettings.of(Material.AGGREGATE).strength(1.5F, 6.0F).requiresTool().sounds(BlockSoundGroup.SAND)), ItemGroup.MISC);
    public static final Block POSEIDON = registerBlock("poseidon",
            new PoseidonBlock(FabricBlockSettings.of(Material.METAL).strength(1.5F, 6.0F).requiresTool().nonOpaque().sounds(BlockSoundGroup.METAL)), ItemGroup.MISC);
    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(BarracudaMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(BarracudaMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks(){
        BarracudaMod.LOGGER.info("Registering ModBlocks for " + BarracudaMod.MOD_ID);
    }
}
