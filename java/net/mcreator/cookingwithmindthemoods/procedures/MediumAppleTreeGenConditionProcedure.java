package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class MediumAppleTreeGenConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x + 4, y, z)).canOcclude() && world.getBlockState(BlockPos.containing(x - 4, y, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y, z - 4)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x, y, z + 4)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x, y + 2, z)) && world.isEmptyBlock(BlockPos.containing(x + 4, y + 2, z))
				&& world.isEmptyBlock(BlockPos.containing(x - 4, y + 2, z)) && world.isEmptyBlock(BlockPos.containing(x, y + 2, z + 4)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z))
				&& world.isEmptyBlock(BlockPos.containing(x, y + 2, z - 4))) {
			return true;
		}
		return false;
	}
}
