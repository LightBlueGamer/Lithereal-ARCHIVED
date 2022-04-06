package net.thelightbluegame.lithereal.item.custom;

import com.kwpugh.pugh_lib.api.CustomRecipeRemainder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModHammerItem extends Item implements CustomRecipeRemainder {
    public ModHammerItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasRecipeRemainder() {
        return true;
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stackIn) {
        final ItemStack stack = stackIn.copy();
        stack.setDamage(stack.getDamage() + 1);

        if (stack.getDamage() >= stack.getMaxDamage()) {
            stack.decrement(1);
        }
        return stack;
    }
}
