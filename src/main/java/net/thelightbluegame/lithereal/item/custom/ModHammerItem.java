package net.thelightbluegame.lithereal.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;

import java.util.Random;

public class ModHammerItem extends Item {
    public ModHammerItem(Item.Settings settings, Item remainder, int damage) {
        super(settings.maxDamage(damage).recipeRemainder(remainder));
    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        stack.damage(1, new Random(), (ServerPlayerEntity) player);
        ItemStack newStack = stack.copy();
        super.onCraft(stack, world, player);
        player.giveItemStack(newStack);
    }
}
