package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SmallAppleTreeGenConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x + 2, y, z)).canOcclude() && world.getBlockState(BlockPos.containing(x + 2, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x - 2, y, z)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x - 2, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y, z - 2)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z - 2)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x, y, z + 2)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z + 2)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x, y + 2, z))
				&& world.isEmptyBlock(BlockPos.containing(x + 1, y + 2, z)) && world.isEmptyBlock(BlockPos.containing(x - 1, y + 2, z)) && world.isEmptyBlock(BlockPos.containing(x, y + 2, z + 1))
				&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x, y + 2, z - 1))) {
			return true;
		}
		return false;
	}
}
