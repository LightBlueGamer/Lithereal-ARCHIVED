package net.thelightbluegame.lithereal.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MiningToolItem;
import net.thelightbluegame.lithereal.item.custom.ModAiotItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MiningToolItem.class)
public abstract class MiningToolItemMixin {

    @Inject(method = "getMiningSpeedMultiplier",
            at = @At("HEAD"),
            cancellable = true)
    public void getMiningSpeedMultiplier(ItemStack stack, BlockState state, CallbackInfoReturnable<Float> cir) {
        MiningToolItem mti = ((MiningToolItem) (Object) this);

        cir.setReturnValue(state.isIn(((MiningToolAccessor) mti).getEffectiveBlocks()) || mti instanceof ModAiotItem ? ((MiningToolAccessor) mti).getMiningSpeed() : 1.0F);
    }
}
