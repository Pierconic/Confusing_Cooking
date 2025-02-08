package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModBlocks;

public class RiceGenerationConditionsProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean FoundWater = false;
		boolean ProperHeight = false;
		FoundWater = false;
		ProperHeight = false;
		if (y >= 60 && y <= 63) {
			ProperHeight = true;
		}
		if (ProperHeight == true) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER) {
				FoundWater = true;
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER) {
				FoundWater = true;
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BUBBLE_COLUMN) {
				FoundWater = true;
			}
		}
		if (FoundWater == true) {
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DIRT && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_2.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y + 1, z), CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_2.get().defaultBlockState(), 3);
				return true;
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.MUD && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(x, y + 1, z), CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_2.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_2.get().defaultBlockState(), 3);
				return true;
			}
		}
		return false;
	}
}
