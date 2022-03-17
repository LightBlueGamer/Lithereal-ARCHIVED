package net.raylightstudios.lithereal.core;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.raylightstudios.lithereal.Lithereal;

@Mod.EventBusSubscriber(modid = Lithereal.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockRegistry{
    public static final DeferredRegister <Block> BLOCKS = DeferredRegister.create( ForgeRegistries.BLOCKS, Lithereal.MOD_ID );
    public static final RegistryObject<Block> PURE_LITHERITE_BLOCK = BLOCKS.register( "pure_litherite_block",
                                                                      () -> new Block( BlockBehaviour.Properties.of( Material.AMETHYST ).strength( 5f ).requiresCorrectToolForDrops()) );

    public static final RegistryObject<Block> LITHERITE_ORE = BLOCKS.register( "litherite_ore",
                                                               () -> new Block(BlockBehaviour.Properties.of( Material.STONE ).strength( 3f ).requiresCorrectToolForDrops()) );

    public static final RegistryObject<Block> DEEPSLATE_LITHERITE_ORE = BLOCKS.register("deepslate_litherite_ore",
                                                                        () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GRASS_BLOCK = BLOCKS.register("grass_block",
                                                            () -> new Block(BlockBehaviour.Properties.of(Material.GRASS).strength(0.6f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DIRT_BLOCK = BLOCKS.register("dirt_block",
                                                           () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_STONE = BLOCKS.register("aether_stone",
                                                             () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_STONE = BLOCKS.register("coarsite_stone",
                                                               () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_DEEPSLATE = BLOCKS.register("aether_deepslate",
                                                                 () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_DEEPSLATE = BLOCKS.register("coarsite_deepslate",
                                                                   () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_COBBLESTONE = BLOCKS.register("aether_cobblestone",
                                                                   () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_COBBLESTONE = BLOCKS.register("coarsite_cobblestone",
                                                                     () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_AETHER_DEEPSLATE = BLOCKS.register("cobbled_aether_deepslate",
                                                                         () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_COARSITE_DEEPSLATE = BLOCKS.register("cobbled_coarsite_deepslate",
                                                                           () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_SMOOTH_STONE = BLOCKS.register("aether_smooth_stone",
                                                                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_SMOOTH_STONE = BLOCKS.register("coarsite_smooth_stone",
                                                                      () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_SMOOTH_STONE_BRICKS = BLOCKS.register("aether_smooth_stone_bricks",
                                                                           () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_SMOOTH_STONE_BRICKS = BLOCKS.register("coarsite_smooth_stone_bricks",
                                                                             () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_STONE_BRICKS = BLOCKS.register("aether_stone_bricks",
                                                                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_STONE_BRICKS = BLOCKS.register("coarsite_stone_bricks",
                                                                      () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_DEEPSLATE_BRICKS = BLOCKS.register("coarsite_deepslate_bricks",
                                                                          () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_DEEPSLATE_BRICKS = BLOCKS.register("aether_deepslate_bricks",
                                                                        () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_COARSITE_DEEPSLATE = BLOCKS.register("polished_coarsite_deepslate",
                                                                            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_AETHER_DEEPSLATE = BLOCKS.register("polished_aether_deepslate",
                                                                          () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_DEEPSLATE_BRICK_STAIRS = BLOCKS.register( "coarsite_deepslate_brick_stairs",
                                                                                 () -> new StairBlock( COARSITE_DEEPSLATE_BRICKS.get()::defaultBlockState , BlockBehaviour.Properties.of( Material.STONE ).strength( 3.5f ).requiresCorrectToolForDrops()) );

    public static final RegistryObject<Block> AETHER_DEEPSLATE_BRICK_STAIRS = BLOCKS.register( "aether_deepslate_brick_stairs",
                                                                               () -> new StairBlock( AETHER_DEEPSLATE_BRICKS.get()::defaultBlockState , BlockBehaviour.Properties.of( Material.STONE ).strength( 3.5f ).requiresCorrectToolForDrops()) );

    public static final RegistryObject<Block> POLISHED_COARSITE_DEEPSLATE_STAIRS = BLOCKS.register( "polished_coarsite_deepslate_stairs",
                                                                                    () -> new StairBlock( POLISHED_COARSITE_DEEPSLATE.get()::defaultBlockState , BlockBehaviour.Properties.of( Material.STONE ).strength( 3.5f ).requiresCorrectToolForDrops()) );

    public static final RegistryObject<Block> POLISHED_AETHER_DEEPSLATE_STAIRS = BLOCKS.register( "polished_aether_deepslate_stairs",
                                                                                  () -> new StairBlock( POLISHED_AETHER_DEEPSLATE.get()::defaultBlockState , BlockBehaviour.Properties.of( Material.STONE ).strength( 3.5f ).requiresCorrectToolForDrops()) );

    public static final RegistryObject<Block> COARSITE_DEEPSLATE_BRICK_SLAB = BLOCKS.register("coarsite_deepslate_brick_slab",
                                                                              () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_DEEPSLATE_BRICK_SLAB = BLOCKS.register("aether_deepslate_brick_slab",
                                                                            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_COARSITE_DEEPSLATE_SLAB = BLOCKS.register("polished_coarsite_deepslate_slab",
                                                                                 () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_AETHER_DEEPSLATE_SLAB = BLOCKS.register("polished_aether_deepslate_slab",
                                                                               () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_DEEPSLATE_BRICK_BUTTON = BLOCKS.register("coarsite_deepslate_brick_button",
                                                                                () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_DEEPSLATE_BRICK_BUTTON = BLOCKS.register("aether_deepslate_brick_button",
                                                                              () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_COARSITE_DEEPSLATE_BUTTON = BLOCKS.register("polished_coarsite_deepslate_button",
                                                                                   () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_AETHER_DEEPSLATE_BUTTON = BLOCKS.register("polished_aether_deepslate_button",
                                                                                 () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_DEEPSLATE_BRICK_PRESSURE_PLATE = BLOCKS.register("coarsite_deepslate_brick_pressure_plate",
                                                                                        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS,
                                                                                                                BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_DEEPSLATE_BRICK_PRESSURE_PLATE = BLOCKS.register("aether_deepslate_brick_pressure_plate",
                                                                                      () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS,
                                                                                                              BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_COARSITE_DEEPSLATE_PRESSURE_PLATE = BLOCKS.register("polished_coarsite_deepslate_pressure_plate",
                                                                                           () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS,
                                                                                                                   BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_AETHER_DEEPSLATE_PRESSURE_PLATE = BLOCKS.register("polished_aether_deepslate_pressure_plate",
                                                                                         () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS,
                                                                                                                 BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_DEEPSLATE_BRICK_WALL = BLOCKS.register("coarsite_deepslate_brick_wall",
                                                                              () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_DEEPSLATE_BRICK_WALL = BLOCKS.register("aether_deepslate_brick_wall",
                                                                            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_COARSITE_DEEPSLATE_WALL = BLOCKS.register("polished_coarsite_deepslate_wall",
                                                                                 () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_AETHER_DEEPSLATE_WALL = BLOCKS.register("polished_aether_deepslate_wall",
                                                                               () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PORTAL_FRAME = BLOCKS.register("portal_frame",
                                                             () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(20f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_STONE_STAIRS = BLOCKS.register("coarsite_stone_stairs",
                                                                      () -> new StairBlock( COARSITE_STONE.get()::defaultBlockState ,
                                                                                            BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_STONE_STAIRS = BLOCKS.register("aether_stone_stairs",
                                                                    () -> new StairBlock( AETHER_STONE.get()::defaultBlockState ,
                                                                                          BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_SMOOTH_STONE_STAIRS = BLOCKS.register("coarsite_smooth_stone_stairs",
                                                                             () -> new StairBlock( COARSITE_SMOOTH_STONE.get()::defaultBlockState ,
                                                                                                   BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_SMOOTH_STONE_STAIRS = BLOCKS.register("aether_smooth_stone_stairs",
                                                                           () -> new StairBlock( AETHER_SMOOTH_STONE.get()::defaultBlockState ,
                                                                                                 BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_STONE_BRICK_STAIRS = BLOCKS.register("coarsite_stone_brick_stairs",
                                                                            () -> new StairBlock( COARSITE_STONE_BRICKS.get()::defaultBlockState ,
                                                                                                  BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_STONE_BRICK_STAIRS = BLOCKS.register("aether_stone_brick_stairs",
                                                                          () -> new StairBlock( AETHER_STONE_BRICKS.get()::defaultBlockState ,
                                                                                                BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_SMOOTH_STONE_BRICK_STAIRS = BLOCKS.register("coarsite_smooth_stone_brick_stairs",
                                                                                   () -> new StairBlock( COARSITE_SMOOTH_STONE_BRICKS.get()::defaultBlockState ,
                                                                                                         BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_SMOOTH_STONE_BRICK_STAIRS = BLOCKS.register("aether_smooth_stone_brick_stairs",
                                                                                 () -> new StairBlock( AETHER_SMOOTH_STONE_BRICKS.get()::defaultBlockState ,
                                                                                                       BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_DEEPSLATE_STAIRS = BLOCKS.register("aether_deepslate_stairs",
                                                                        () -> new StairBlock( AETHER_DEEPSLATE.get()::defaultBlockState ,
                                                                                              BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_DEEPSLATE_STAIRS = BLOCKS.register("coarsite_deepslate_stairs",
                                                                          () -> new StairBlock( COARSITE_DEEPSLATE.get()::defaultBlockState ,
                                                                                                BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_AETHER_DEEPSLATE_STAIRS = BLOCKS.register("cobbled_aether_deepslate_stairs",
                                                                                () -> new StairBlock( COBBLED_AETHER_DEEPSLATE.get()::defaultBlockState ,
                                                                                                      BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_COARSITE_DEEPSLATE_STAIRS = BLOCKS.register("cobbled_coarsite_deepslate_stairs",
                                                                                  () -> new StairBlock( COBBLED_COARSITE_DEEPSLATE.get()::defaultBlockState ,
                                                                                                        BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_COBBLESTONE_STAIRS = BLOCKS.register("aether_cobblestone_stairs",
                                                                          () -> new StairBlock( AETHER_COBBLESTONE.get()::defaultBlockState ,
                                                                                                BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_COBBLESTONE_STAIRS = BLOCKS.register("coarsite_cobblestone_stairs",
                                                                            () -> new StairBlock( COARSITE_COBBLESTONE.get()::defaultBlockState ,
                                                                                                  BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_STONE_SLAB = BLOCKS.register("aether_stone_slab",
                                                                  () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_STONE_SLAB = BLOCKS.register("coarsite_stone_slab",
                                                                    () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_SMOOTH_STONE_SLAB = BLOCKS.register("aether_smooth_stone_slab",
                                                                         () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_SMOOTH_STONE_SLAB = BLOCKS.register("coarsite_smooth_stone_slab",
                                                                           () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_COBBLESTONE_SLAB = BLOCKS.register("coarsite_cobblestone_slab",
                                                                          () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_COBBLESTONE_SLAB = BLOCKS.register("aether_cobblestone_slab",
                                                                        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_STONE_BRICK_SLAB = BLOCKS.register("coarsite_stone_brick_slab",
                                                                          () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_STONE_BRICK_SLAB = BLOCKS.register("aether_stone_brick_slab",
                                                                        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_SMOOTH_STONE_BRICK_SLAB = BLOCKS.register("aether_smooth_stone_brick_slab",
                                                                               () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_SMOOTH_STONE_BRICK_SLAB = BLOCKS.register("coarsite_smooth_stone_brick_slab",
                                                                                 () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    static final        RegistryObject<Block> AETHER_DEEPSLATE_SLAB = BLOCKS.register("aether_deepslate_slab",
                                                               () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_DEEPSLATE_SLAB = BLOCKS.register("coarsite_deepslate_slab",
                                                                        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).requiresCorrectToolForDrops()));

    static final        RegistryObject<Block> COBBLED_AETHER_DEEPSLATE_SLAB = BLOCKS.register("cobbled_aether_deepslate_slab",
                                                                       () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_COARSITE_DEEPSLATE_SLAB = BLOCKS.register("cobbled_coarsite_deepslate_slab",
                                                                                () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_STONE_BUTTON = BLOCKS.register("aether_stone_button",
                                                                    () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_STONE_PRESSURE_PLATE = BLOCKS.register("aether_stone_pressure_plate",
                                                                            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS,
                                                                                                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_STONE_BUTTON = BLOCKS.register("coarsite_stone_button",
                                                                      () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_STONE_PRESSURE_PLATE = BLOCKS.register("coarsite_stone_pressure_plate",
                                                                              () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS,
                                                                                                      BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_COBBLESTONE_BUTTON = BLOCKS.register("aether_cobblestone_button",
                                                                          () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_COBBLESTONE_PRESSURE_PLATE = BLOCKS.register("aether_cobblestone_pressure_plate",
                                                                                  () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS,
                                                                                                          BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_COBBLESTONE_BUTTON = BLOCKS.register("coarsite_cobblestone_button",
                                                                            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_COBBLESTONE_PRESSURE_PLATE = BLOCKS.register("coarsite_cobblestone_pressure_plate",
                                                                                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS,
                                                                                                            BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_SMOOTH_STONE_BUTTON = BLOCKS.register("aether_smooth_stone_button",
                                                                           () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_SMOOTH_STONE_PRESSURE_PLATE = BLOCKS.register("aether_smooth_stone_pressure_plate",
                                                                                   () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS,
                                                                                                           BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_SMOOTH_STONE_BUTTON = BLOCKS.register("coarsite_smooth_stone_button",
                                                                             () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_SMOOTH_STONE_PRESSURE_PLATE = BLOCKS.register("coarsite_smooth_stone_pressure_plate",
                                                                                     () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS,
                                                                                                             BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_STONE_BRICK_BUTTON = BLOCKS.register("aether_stone_brick_button",
                                                                          () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_STONE_BRICK_PRESSURE_PLATE = BLOCKS.register("aether_stone_brick_pressure_plate",
                                                                                  () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS,
                                                                                                          BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_STONE_BRICK_BUTTON = BLOCKS.register("coarsite_stone_brick_button",
                                                                            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_STONE_BRICK_PRESSURE_PLATE = BLOCKS.register("coarsite_stone_brick_pressure_plate",
                                                                                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS,
                                                                                                            BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_SMOOTH_STONE_BRICK_BUTTON = BLOCKS.register("aether_smooth_stone_brick_button",
                                                                                 () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_SMOOTH_STONE_BRICK_PRESSURE_PLATE = BLOCKS.register("aether_smooth_stone_brick_pressure_plate",
                                                                                         () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS,
                                                                                                                 BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_SMOOTH_STONE_BRICK_BUTTON = BLOCKS.register("coarsite_smooth_stone_brick_button",
                                                                                   () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_SMOOTH_STONE_BRICK_PRESSURE_PLATE = BLOCKS.register("coarsite_smooth_stone_brick_pressure_plate",
                                                                                           () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS,
                                                                                                                   BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_DEEPSLATE_BUTTON = BLOCKS.register("aether_deepslate_button",
                                                                        () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_DEEPSLATE_PRESSURE_PLATE = BLOCKS.register("aether_deepslate_pressure_plate",
                                                                                () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS,
                                                                                                        BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_DEEPSLATE_BUTTON = BLOCKS.register("coarsite_deepslate_button",
                                                                          () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_DEEPSLATE_PRESSURE_PLATE = BLOCKS.register("coarsite_deepslate_pressure_plate",
                                                                                  () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS,
                                                                                                          BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_AETHER_DEEPSLATE_BUTTON = BLOCKS.register("cobbled_aether_deepslate_button",
                                                                                () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_AETHER_DEEPSLATE_PRESSURE_PLATE = BLOCKS.register("cobbled_aether_deepslate_pressure_plate",
                                                                                        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS,
                                                                                                                BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_COARSITE_DEEPSLATE_BUTTON = BLOCKS.register("cobbled_coarsite_deepslate_button",
                                                                                  () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_COARSITE_DEEPSLATE_PRESSURE_PLATE = BLOCKS.register("cobbled_coarsite_deepslate_pressure_plate",
                                                                                          () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS,
                                                                                                                  BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_STONE_WALL = BLOCKS.register("aether_stone_wall",
                                                                  () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_STONE_WALL = BLOCKS.register("coarsite_stone_wall",
                                                                    () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_SMOOTH_STONE_WALL = BLOCKS.register("aether_smooth_stone_wall",
                                                                         () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_SMOOTH_STONE_WALL = BLOCKS.register("coarsite_smooth_stone_wall",
                                                                           () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_STONE_BRICK_WALL = BLOCKS.register("aether_stone_brick_wall",
                                                                        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_STONE_BRICK_WALL = BLOCKS.register("coarsite_stone_brick_wall",
                                                                          () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_SMOOTH_STONE_BRICK_WALL = BLOCKS.register("aether_smooth_stone_brick_wall",
                                                                               () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_SMOOTH_STONE_BRICK_WALL = BLOCKS.register("coarsite_smooth_stone_brick_wall",
                                                                                 () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_COBBLESTONE_WALL = BLOCKS.register("aether_cobblestone_wall",
                                                                        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_COBBLESTONE_WALL = BLOCKS.register("coarsite_cobblestone_wall",
                                                                          () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AETHER_DEEPSLATE_WALL = BLOCKS.register("aether_deepslate_wall",
                                                                      () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COARSITE_DEEPSLATE_WALL = BLOCKS.register("coarsite_deepslate_wall",
                                                                        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_AETHER_DEEPSLATE_WALL = BLOCKS.register("cobbled_aether_deepslate_wall",
                                                                              () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_COARSITE_DEEPSLATE_WALL = BLOCKS.register("cobbled_coarsite_deepslate_wall",
                                                                                () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SHIFTED_LOG = BLOCKS.register("shifted_log",
                                                            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> SHIFTED_WOOD = BLOCKS.register( "shifted_wood",
                                                              () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy( Blocks.OAK_WOOD )) );

    public static final RegistryObject<Block> STRIPPED_SHIFTED_LOG = BLOCKS.register("stripped_shifted_log",
                                                                     () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_SHIFTED_WOOD = BLOCKS.register("stripped_shifted_wood",
                                                                      () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> MANGLED_LOG = BLOCKS.register("mangled_log",
                                                            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> MANGLED_WOOD = BLOCKS.register("mangled_wood",
                                                             () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> STRIPPED_MANGLED_LOG = BLOCKS.register("stripped_mangled_log",
                                                                     () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_MANGLED_WOOD = BLOCKS.register("stripped_mangled_wood",
                                                                      () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> IMBUED_LOG = BLOCKS.register("imbued_log",
                                                           () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> IMBUED_WOOD = BLOCKS.register("imbued_wood",
                                                            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> STRIPPED_IMBUED_LOG = BLOCKS.register("stripped_imbued_log",
                                                                    () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_IMBUED_WOOD = BLOCKS.register("stripped_imbued_wood",
                                                                     () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> SHIFTED_LEAVES = BLOCKS.register("shifted_leaves",
                                                               () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> MANGLED_LEAVES = BLOCKS.register("mangled_leaves",
                                                               () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> IMBUED_LEAVES = BLOCKS.register( "imbued_leaves",
                                                               () -> new LeavesBlock( BlockBehaviour.Properties.copy( Blocks.OAK_LEAVES )) );

    public static final RegistryObject<Block> SHIFTED_PLANKS = BLOCKS.register("shifted_planks",
                                                               () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject <Block> MANGLED_PLANKS = BLOCKS.register( "mangled_planks",
                                                                                 () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) );

    public static final RegistryObject<Block> IMBUED_PLANKS = BLOCKS.register("imbued_planks",
                                                              () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    /*

    public static final RegistryObject<Block> SHIFTED_SAPLING = BLOCKS.register("shifted_sapling",
                                                                () -> new SaplingBlock(new ShiftedSaplingGenerator(),
                                                                                  BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> MANGLED_SAPLING = BLOCKS.register("mangled_sapling",
                                                                () -> new SaplingBlock(new MangledSaplingGenerator(),
                                                                                  BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> IMBUED_SAPLING = BLOCKS.register("imbued_sapling",
                                                               () -> new SaplingBlock( new ImbuedSaplingGenerator(),
                                                                               BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    public static final RegistryObject<Block> PURIFIER = BLOCKS.register("purifier",
                                                         () -> new PurifierBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4.5f).requiresCorrectToolForDrops()));

     */

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event ) {
        BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> event.getRegistry().register( new BlockItem( block, new Item.Properties().tab( ModItemGroup.LITHEREAL ))
                                             .setRegistryName(block.getRegistryName()) ) );
    }
}
