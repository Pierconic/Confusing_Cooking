package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModBlocks;

public class EmptyPlateNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getBlockState(BlockPos.containing(x, y - 1, z)).isFaceSturdy(world, BlockPos.containing(x, y - 1, z), Direction.UP) || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER) {
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.EMPTY_PLATE.get())) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			} else {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
