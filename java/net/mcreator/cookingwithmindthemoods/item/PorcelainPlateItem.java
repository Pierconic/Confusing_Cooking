
package net.mcreator.cookingwithmindthemoods.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResult;

import net.mcreator.cookingwithmindthemoods.procedures.PorcelainPlateRightclickedOnBlockProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.PorcelainPlateLivingEntityIsHitWithItemProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.PorcelainPlateItemIsDroppedByPlayerProcedure;

public class PorcelainPlateItem extends Item {
	public PorcelainPlateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		PorcelainPlateRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getClickedFace(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		PorcelainPlateLivingEntityIsHitWithItemProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), itemstack);
		return retval;
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		PorcelainPlateItemIsDroppedByPlayerProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
		return true;
	}
}
