package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class RiceDestroyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getBlockState(BlockPos.containing(x, y - 1, z)).isFaceSturdy(world, BlockPos.containing(x, y - 1, z), Direction.UP)) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			RiceBottomDestroyedProcedure.execute(world, x, y, z);
		}
	}
}
