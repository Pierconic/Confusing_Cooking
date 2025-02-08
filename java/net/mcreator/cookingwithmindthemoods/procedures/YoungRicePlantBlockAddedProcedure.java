package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModBlocks;

public class YoungRicePlantBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getFluidState().isSource() && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) == false) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getFluidState().isSource() || world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) == false) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CookingWithMindthemoodsModBlocks.YOUNGISH_RICE_PLANT.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CookingWithMindthemoodsModBlocks.RICE_SHOOTS.get()) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}
