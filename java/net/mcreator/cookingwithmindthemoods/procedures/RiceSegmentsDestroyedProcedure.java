package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModBlocks;

public class RiceSegmentsDestroyedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_1.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_2.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_3.get()) {
			if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_1.get()
					|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_2.get()
					|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_3.get())) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_1.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_2.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_3.get()) {
			if (!world.getBlockState(BlockPos.containing(x, y - 1, z)).isFaceSturdy(world, BlockPos.containing(x, y - 1, z), Direction.UP)
					|| !(blockstate.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _getbp21 && blockstate.getValue(_getbp21))
					|| !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_1.get()
							|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_2.get()
							|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_3.get())) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			}
		}
	}
}
