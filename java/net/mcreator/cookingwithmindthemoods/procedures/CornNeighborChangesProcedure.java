package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModBlocks;

public class CornNeighborChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y, z + 0.5), null);
				world.destroyBlock(_pos, false);
			}
		}
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_1.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_2.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_3.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_4_LOWER.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_5_LOWER.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_6_LOWER.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_7_LOWER.get())
				&& (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DIRT || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.COARSE_DIRT
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.PACKED_MUD || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FARMLAND)
						|| ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_4_LOWER.get()
								|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_5_LOWER.get()
								|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_6_LOWER.get()
								|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_7_LOWER.get())
								&& !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_4_TOP.get()
										|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_5_TOP.get()
										|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_6_TOP.get()
										|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_7_TOP.get()))
				|| ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_4_TOP.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_5_TOP.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_6_TOP.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_7_TOP.get())
						&& !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_4_LOWER.get()
								|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_5_LOWER.get()
								|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_6_LOWER.get()
								|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_7_LOWER.get())) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y, z + 0.5), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}
