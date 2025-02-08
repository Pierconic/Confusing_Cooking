package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class PlantBreakageProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getBlockState(BlockPos.containing(x, y - 1, z)).isFaceSturdy(world, BlockPos.containing(x, y - 1, z), Direction.UP) && !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FARMLAND)
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() instanceof LiquidBlock || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() instanceof LiquidBlock
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() instanceof LiquidBlock || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() instanceof LiquidBlock
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() instanceof LiquidBlock || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getFluidState().isSource()
				|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).getFluidState().isSource() || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getFluidState().isSource()
				|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getFluidState().isSource() || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getFluidState().isSource()) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y, z + 0.5), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}
