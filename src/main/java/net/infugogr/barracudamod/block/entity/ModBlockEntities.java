package net.infugogr.barracudamod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.infugogr.barracudamod.BarracudaMod;
import net.infugogr.barracudamod.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlockEntities {
    public static BlockEntityType<PoseidonEntity> POSEIDON;

    public static void registerALLBlockEntities() {
        POSEIDON = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(BarracudaMod.MOD_ID, "poseidon"),
                FabricBlockEntityTypeBuilder.create(PoseidonEntity::new,
                        ModBlocks.POSEIDON).build(null));
    }
}
