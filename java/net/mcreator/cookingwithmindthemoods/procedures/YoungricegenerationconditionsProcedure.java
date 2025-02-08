package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModBlocks;

public class YoungricegenerationconditionsProcedure {
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
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.ROOTED_DIRT) {
				return true;
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.SAND) {
				return true;
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.RED_SAND) {
				return true;
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.CLAY) {
				return true;
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.SOUL_SAND) {
				return true;
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DIRT) {
				world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.YOUNGISH_RICE_PLANT.get().defaultBlockState(), 3);
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
				}
				return true;
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.MUD) {
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.YOUNGISH_RICE_PLANT.get().defaultBlockState(), 3);
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
				}
				return true;
			}
		}
		return false;
	}
}
