package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModBlocks;
import net.mcreator.cookingwithmindthemoods.CookingWithMindthemoodsMod;

import java.util.Comparator;

public class DestroyThePieProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity == ((Entity) world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null)))) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.SINGLE_PUMPKIN_PIE.get()) {
				CookingWithMindthemoodsMod.queueServerWork(5, () -> {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				});
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.DOUBLE_PUMPKIN_PIE.get()) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				CookingWithMindthemoodsMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.SINGLE_PUMPKIN_PIE.get().defaultBlockState(), 3);
				});
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.TRIPLE_PUMPKIN_PIE.get()) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				CookingWithMindthemoodsMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.DOUBLE_PUMPKIN_PIE.get().defaultBlockState(), 3);
				});
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.QUADRUPLE_PUMPKIN_PIE.get()) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				CookingWithMindthemoodsMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.TRIPLE_PUMPKIN_PIE.get().defaultBlockState(), 3);
				});
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.MEGA_PUMPKIN_PIE.get()) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				CookingWithMindthemoodsMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.QUADRUPLE_PUMPKIN_PIE.get().defaultBlockState(), 3);
				});
			}
		}
		if (!(entity == ((Entity) world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null)))) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.SINGLE_MELON_TART.get()) {
				CookingWithMindthemoodsMod.queueServerWork(5, () -> {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				});
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.DOUBLE_MELON_TART.get()) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				CookingWithMindthemoodsMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.SINGLE_MELON_TART.get().defaultBlockState(), 3);
				});
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.TRIPLE_MELON_TART.get()) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				CookingWithMindthemoodsMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.DOUBLE_MELON_TART.get().defaultBlockState(), 3);
				});
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.QUADRUPLE_TART.get()) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				CookingWithMindthemoodsMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.TRIPLE_MELON_TART.get().defaultBlockState(), 3);
				});
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.MEGA_MELON_TART.get()) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				CookingWithMindthemoodsMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.QUADRUPLE_TART.get().defaultBlockState(), 3);
				});
			}
		}
		if (!(entity == ((Entity) world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null)))) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.SINGLE_APPLE_CRISP.get()) {
				CookingWithMindthemoodsMod.queueServerWork(5, () -> {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				});
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.DOUBLE_APPLE_CRISP.get()) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				CookingWithMindthemoodsMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.SINGLE_APPLE_CRISP.get().defaultBlockState(), 3);
				});
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.TRIPLE_APPLE_CRISP.get()) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				CookingWithMindthemoodsMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.DOUBLE_APPLE_CRISP.get().defaultBlockState(), 3);
				});
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.QUADRUPLE_APPLE_CRISP.get()) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				CookingWithMindthemoodsMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.TRIPLE_APPLE_CRISP.get().defaultBlockState(), 3);
				});
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.MEGA_APPLE_CRISP.get()) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				CookingWithMindthemoodsMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.QUADRUPLE_APPLE_CRISP.get().defaultBlockState(), 3);
				});
			}
		}
	}
}
