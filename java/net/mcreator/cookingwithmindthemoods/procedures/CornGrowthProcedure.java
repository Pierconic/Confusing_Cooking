package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModBlocks;

public class CornGrowthProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		double growthchance = 0;
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) > 7) {
			growthchance = 0.3;
		} else {
			growthchance = 0;
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.POTATOES || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.POTATOES
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.POTATOES || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.POTATOES) {
			growthchance = growthchance + 0.25;
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.ATTACHED_PUMPKIN_STEM || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.ATTACHED_PUMPKIN_STEM
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.ATTACHED_PUMPKIN_STEM || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.ATTACHED_PUMPKIN_STEM) {
			growthchance = growthchance + 0.25;
		}
		if (Math.random() < growthchance) {
			if (blockstate.getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_1.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.CORN_STAGE_2.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_2.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.CORN_STAGE_3.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_3.get() && world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.CORN_STAGE_4_LOWER.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y + 1, z), CookingWithMindthemoodsModBlocks.CORN_STAGE_4_TOP.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_4_LOWER.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.CORN_STAGE_5_LOWER.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y + 1, z), CookingWithMindthemoodsModBlocks.CORN_STAGE_5_TOP.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_5_LOWER.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.CORN_STAGE_6_LOWER.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y + 1, z), CookingWithMindthemoodsModBlocks.CORN_STAGE_6_TOP.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == CookingWithMindthemoodsModBlocks.CORN_STAGE_6_LOWER.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.CORN_STAGE_7_LOWER.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y + 1, z), CookingWithMindthemoodsModBlocks.CORN_STAGE_7_TOP.get().defaultBlockState(), 3);
			}
		}
	}
}
