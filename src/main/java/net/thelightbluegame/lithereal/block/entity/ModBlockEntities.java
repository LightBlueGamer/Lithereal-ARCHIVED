package net.thelightbluegame.lithereal.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thelightbluegame.lithereal.LitherealMod;
import net.thelightbluegame.lithereal.block.ModBlocks;

public class ModBlockEntities {
    public static BlockEntityType<PurifierEntity> PURIFIER;

    public static void registerAllEntities() {
        PURIFIER = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(LitherealMod.MOD_ID, "purifier"),
                FabricBlockEntityTypeBuilder.create(PurifierEntity::new,
                        ModBlocks.PURIFIER).build(null));
    }
}
