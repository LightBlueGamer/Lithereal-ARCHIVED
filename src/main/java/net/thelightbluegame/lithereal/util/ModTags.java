package net.thelightbluegame.lithereal.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thelightbluegame.lithereal.LitherealMod;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> LOGS = createCommonTag("logs");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(LitherealMod.MOD_ID, name));
        }

        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> WOODEN_PLANKS = createCommonTag("wooden_planks");
        public static final TagKey<Item> LOGS = createCommonTag("logs");
        public static final TagKey<Item> COBBLESTONE = createCommonTag("cobblestone");
        public static final TagKey<Item> WOOD_STICKS = createCommonTag("wood_sticks");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(LitherealMod.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}
