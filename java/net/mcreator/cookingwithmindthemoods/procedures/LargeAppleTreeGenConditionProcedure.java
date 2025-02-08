package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class LargeAppleTreeGenConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x + 6, y, z)).canOcclude() && world.getBlockState(BlockPos.containing(x - 6, y, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y, z - 6)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x, y, z + 6)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x, y + 2, z)) && world.isEmptyBlock(BlockPos.containing(x + 6, y + 2, z))
				&& world.isEmptyBlock(BlockPos.containing(x - 6, y + 2, z)) && world.isEmptyBlock(BlockPos.containing(x, y + 2, z + 6)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z))
				&& world.isEmptyBlock(BlockPos.containing(x, y + 2, z - 6))) {
			return true;
		}
		return false;
	}
}
