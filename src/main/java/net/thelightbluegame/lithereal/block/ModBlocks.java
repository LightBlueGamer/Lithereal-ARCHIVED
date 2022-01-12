package net.thelightbluegame.lithereal.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thelightbluegame.lithereal.LitherealMod;
import net.thelightbluegame.lithereal.block.custom.ModPressurePlateBlock;
import net.thelightbluegame.lithereal.block.custom.ModStairsBlock;
import net.thelightbluegame.lithereal.block.custom.ModStoneButtonBlock;
import net.thelightbluegame.lithereal.item.ModItemGroups;

public class ModBlocks {

    public static final Block PURE_LITHERITE_BLOCK = registerBlock("pure_litherite_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block LITHERITE_ORE = registerBlock("litherite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block DEEPSLATE_LITHERITE_ORE = registerBlock("deepslate_litherite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block GRASS_BLOCK = registerBlock("grass_block",
            new Block(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(0.6f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block DIRT_BLOCK = registerBlock("dirt_block",
            new Block(FabricBlockSettings.of(Material.SOIL).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_STONE = registerBlock("aether_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_STONE = registerBlock("coarsite_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_DEEPSLATE = registerBlock("aether_deepslate",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_DEEPSLATE = registerBlock("coarsite_deepslate",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_COBBLESTONE = registerBlock("aether_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_COBBLESTONE = registerBlock("coarsite_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COBBLED_AETHER_DEEPSLATE = registerBlock("cobbled_aether_deepslate",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COBBLED_COARSITE_DEEPSLATE = registerBlock("cobbled_coarsite_deepslate",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_SMOOTH_STONE = registerBlock("aether_smooth_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_SMOOTH_STONE = registerBlock("coarsite_smooth_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_SMOOTH_STONE_BRICKS = registerBlock("aether_smooth_stone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_SMOOTH_STONE_BRICKS = registerBlock("coarsite_smooth_stone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_STONE_BRICKS = registerBlock("aether_stone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_STONE_BRICKS = registerBlock("coarsite_stone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block PORTAL_FRAME = registerBlock("portal_frame",
            new Block(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_STONE_STAIRS = registerBlock("coarsite_stone_stairs",
            new ModStairsBlock(ModBlocks.COARSITE_STONE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_STONE_STAIRS = registerBlock("aether_stone_stairs",
            new ModStairsBlock(ModBlocks.AETHER_STONE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_SMOOTH_STONE_STAIRS = registerBlock("coarsite_smooth_stone_stairs",
            new ModStairsBlock(ModBlocks.COARSITE_SMOOTH_STONE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_SMOOTH_STONE_STAIRS = registerBlock("aether_smooth_stone_stairs",
            new ModStairsBlock(ModBlocks.AETHER_SMOOTH_STONE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_STONE_BRICK_STAIRS = registerBlock("coarsite_stone_brick_stairs",
            new ModStairsBlock(ModBlocks.COARSITE_STONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_STONE_BRICK_STAIRS = registerBlock("aether_stone_brick_stairs",
            new ModStairsBlock(ModBlocks.AETHER_STONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_SMOOTH_STONE_BRICK_STAIRS = registerBlock("coarsite_smooth_stone_brick_stairs",
            new ModStairsBlock(ModBlocks.COARSITE_SMOOTH_STONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_SMOOTH_STONE_BRICK_STAIRS = registerBlock("aether_smooth_stone_brick_stairs",
            new ModStairsBlock(ModBlocks.AETHER_SMOOTH_STONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_DEEPSLATE_STAIRS = registerBlock("aether_deepslate_stairs",
            new ModStairsBlock(ModBlocks.AETHER_DEEPSLATE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(3.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_DEEPSLATE_STAIRS = registerBlock("coarsite_deepslate_stairs",
            new ModStairsBlock(ModBlocks.COARSITE_DEEPSLATE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(3.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COBBLED_AETHER_DEEPSLATE_STAIRS = registerBlock("cobbled_aether_deepslate_stairs",
            new ModStairsBlock(ModBlocks.COBBLED_AETHER_DEEPSLATE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(3.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COBBLED_COARSITE_DEEPSLATE_STAIRS = registerBlock("cobbled_coarsite_deepslate_stairs",
            new ModStairsBlock(ModBlocks.COBBLED_COARSITE_DEEPSLATE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(3.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_COBBLESTONE_STAIRS = registerBlock("aether_cobblestone_stairs",
            new ModStairsBlock(ModBlocks.AETHER_COBBLESTONE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_COBBLESTONE_STAIRS = registerBlock("coarsite_cobblestone_stairs",
            new ModStairsBlock(ModBlocks.COARSITE_COBBLESTONE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_STONE_SLAB = registerBlock("aether_stone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_STONE_SLAB = registerBlock("coarsite_stone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_SMOOTH_STONE_SLAB = registerBlock("aether_smooth_stone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_SMOOTH_STONE_SLAB = registerBlock("coarsite_smooth_stone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_COBBLESTONE_SLAB = registerBlock("coarsite_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_COBBLESTONE_SLAB = registerBlock("aether_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_STONE_BRICK_SLAB = registerBlock("coarsite_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_STONE_BRICK_SLAB = registerBlock("aether_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_SMOOTH_STONE_BRICK_SLAB = registerBlock("aether_smooth_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_SMOOTH_STONE_BRICK_SLAB = registerBlock("coarsite_smooth_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroups.LITHEREAL);

    static final Block AETHER_DEEPSLATE_SLAB = registerBlock("aether_deepslate_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(3.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_DEEPSLATE_SLAB = registerBlock("coarsite_deepslate_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(3.5f).requiresTool()), ModItemGroups.LITHEREAL);

    static final Block COBBLED_AETHER_DEEPSLATE_SLAB = registerBlock("cobbled_aether_deepslate_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(3.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COBBLED_COARSITE_DEEPSLATE_SLAB = registerBlock("cobbled_coarsite_deepslate_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(3.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_STONE_BUTTON = registerBlock("aether_stone_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_STONE_PRESSURE_PLATE = registerBlock("aether_stone_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_STONE_BUTTON = registerBlock("coarsite_stone_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_STONE_PRESSURE_PLATE = registerBlock("coarsite_stone_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_COBBLESTONE_BUTTON = registerBlock("aether_cobblestone_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_COBBLESTONE_PRESSURE_PLATE = registerBlock("aether_cobblestone_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_COBBLESTONE_BUTTON = registerBlock("coarsite_cobblestone_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_COBBLESTONE_PRESSURE_PLATE = registerBlock("coarsite_cobblestone_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_SMOOTH_STONE_BUTTON = registerBlock("aether_smooth_stone_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_SMOOTH_STONE_PRESSURE_PLATE = registerBlock("aether_smooth_stone_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_SMOOTH_STONE_BUTTON = registerBlock("coarsite_smooth_stone_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_SMOOTH_STONE_PRESSURE_PLATE = registerBlock("coarsite_smooth_stone_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_STONE_BRICK_BUTTON = registerBlock("aether_stone_brick_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_STONE_BRICK_PRESSURE_PLATE = registerBlock("aether_stone_brick_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_STONE_BRICK_BUTTON = registerBlock("coarsite_stone_brick_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_STONE_BRICK_PRESSURE_PLATE = registerBlock("coarsite_stone_brick_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_SMOOTH_STONE_BRICK_BUTTON = registerBlock("aether_smooth_stone_brick_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_SMOOTH_STONE_BRICK_PRESSURE_PLATE = registerBlock("aether_smooth_stone_brick_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_SMOOTH_STONE_BRICK_BUTTON = registerBlock("coarsite_smooth_stone_brick_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_SMOOTH_STONE_BRICK_PRESSURE_PLATE = registerBlock("coarsite_smooth_stone_brick_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_DEEPSLATE_BUTTON = registerBlock("aether_deepslate_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_DEEPSLATE_PRESSURE_PLATE = registerBlock("aether_deepslate_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_DEEPSLATE_BUTTON = registerBlock("coarsite_deepslate_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_DEEPSLATE_PRESSURE_PLATE = registerBlock("coarsite_deepslate_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COBBLED_AETHER_DEEPSLATE_BUTTON = registerBlock("cobbled_aether_deepslate_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COBBLED_AETHER_DEEPSLATE_PRESSURE_PLATE = registerBlock("cobbled_aether_deepslate_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COBBLED_COARSITE_DEEPSLATE_BUTTON = registerBlock("cobbled_coarsite_deepslate_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COBBLED_COARSITE_DEEPSLATE_PRESSURE_PLATE = registerBlock("cobbled_coarsite_deepslate_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block AETHER_STONE_WALL = registerBlock("aether_stone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroups.LITHEREAL);

    public static final Block COARSITE_STONE_WALL = registerBlock("aether_stone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroups.LITHEREAL);



    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(LitherealMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(LitherealMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering blocks for Lithereal");
    }
}