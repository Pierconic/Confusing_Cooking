package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModBlocks;

public class CornPatchSpreadProcedure {
	public static boolean execute(LevelAccessor world, double x, double z) {
		double sx = 0;
		double sz = 0;
		for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 5, 9); index0++) {
			sx = Mth.nextDouble(RandomSource.create(), -5, 5);
			sz = Mth.nextDouble(RandomSource.create(), -5, 5);
			if (((world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sx)), z + sx))).getBlock() == Blocks.COARSE_DIRT
					|| (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sx)), z + sx))).getBlock() == Blocks.GRASS_BLOCK)
					&& world.isEmptyBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sx)) + 1, z + sx))
					&& world.isEmptyBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sx)) + 2, z + sx))) {
				world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sx)), z + sx), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				if (Math.random() < 0.2) {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sx)) + 2, z + sx), CookingWithMindthemoodsModBlocks.CORN_STAGE_6_TOP.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sx)) + 1, z + sx), CookingWithMindthemoodsModBlocks.CORN_STAGE_6_LOWER.get().defaultBlockState(), 3);
				} else if (Math.random() < 0.3) {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sx)) + 2, z + sx), CookingWithMindthemoodsModBlocks.CORN_STAGE_5_TOP.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sx)) + 1, z + sx), CookingWithMindthemoodsModBlocks.CORN_STAGE_5_LOWER.get().defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sx)) + 1, z + sx), CookingWithMindthemoodsModBlocks.CORN_STAGE_3.get().defaultBlockState(), 3);
				}
			}
		}
		return true;
	}
}
