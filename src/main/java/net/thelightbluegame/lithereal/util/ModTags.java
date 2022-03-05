package net.thelightbluegame.lithereal.util;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.thelightbluegame.lithereal.LitherealMod;

public class ModTags {
    public static class Blocks {

        public static final Tag.Identified<Block> ENERGY_ABSORBENTS = createTag("energy_absorbents");
        public static final Tag.Identified<Block> LITHERITE_BLOCKS = createCommonTag("litherite_blocks");
        public static final Tag.Identified<Block> LITHERITE_ORES = createCommonTag("litherite_ores");
        public static final Tag.Identified<Block> WOODEN_PLANKS = createCommonTag("wooden_planks");
        public static final Tag.Identified<Block> COBBLESTONE = createCommonTag("cobblestone");


        private static Tag.Identified<Block> createTag(String name) {
            return TagFactory.BLOCK.create(new Identifier(LitherealMod.MOD_ID, name));
        }

        private static Tag.Identified<Block> createCommonTag(String name) {
            return TagFactory.BLOCK.create(new Identifier("c", name));
        }
    }

    public static class Items {

        public static final Tag.Identified<Item> LITHERITE_INGOTS = createCommonTag("litherite_ingots");
        public static final Tag.Identified<Item> WOOD_STICKS = createCommonTag("wood_sticks");

        private static Tag.Identified<Item> createTag(String name) {
            return TagFactory.ITEM.create(new Identifier(LitherealMod.MOD_ID, name));
        }

        private static Tag.Identified<Item> createCommonTag(String name) {
            return TagFactory.ITEM.create(new Identifier("c", name));
        }
    }
}
