package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModItems;
import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModBlocks;

public class PieRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double raytrace_y = 0;
		double raytrace_x = 0;
		double raytrace_z = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PUMPKIN_PIE && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
				&& world.getBlockState(BlockPos.containing(x, y, z)).isFaceSturdy(world, BlockPos.containing(x, y, z), Direction.UP)) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			world.setBlock(BlockPos.containing(x, y + 1, z), CookingWithMindthemoodsModBlocks.SINGLE_PUMPKIN_PIE.get().defaultBlockState(), 3);
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.coral_block.place")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.coral_block.place")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.SINGLE_PUMPKIN_PIE.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PUMPKIN_PIE)) {
				DropPieProcedure.execute(world, x, y, z);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.DOUBLE_PUMPKIN_PIE.get().defaultBlockState(), 3);
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.coral_block.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.coral_block.place")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.DOUBLE_PUMPKIN_PIE.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PUMPKIN_PIE)) {
				ShrinkPieProcedure.execute(world, x, y, z);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.TRIPLE_PUMPKIN_PIE.get().defaultBlockState(), 3);
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.coral_block.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.coral_block.place")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.TRIPLE_PUMPKIN_PIE.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PUMPKIN_PIE)) {
				ShrinkTriplePieProcedure.execute(world, x, y, z);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.QUADRUPLE_PUMPKIN_PIE.get().defaultBlockState(), 3);
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.coral_block.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.coral_block.place")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.QUADRUPLE_PUMPKIN_PIE.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PUMPKIN_PIE)) {
				ShrinkQuadruplePieProcedure.execute(world, x, y, z);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.MEGA_PUMPKIN_PIE.get().defaultBlockState(), 3);
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.coral_block.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.coral_block.place")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.MEGA_PUMPKIN_PIE.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PUMPKIN_PIE)) {
				ShrinkMegaPieProcedure.execute(world, x, y, z);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CookingWithMindthemoodsModItems.MELON_TART.get() && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
				&& world.getBlockState(BlockPos.containing(x, y, z)).isFaceSturdy(world, BlockPos.containing(x, y, z), Direction.UP)) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			world.setBlock(BlockPos.containing(x, y + 1, z), CookingWithMindthemoodsModBlocks.SINGLE_MELON_TART.get().defaultBlockState(), 3);
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.place")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.place")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.SINGLE_MELON_TART.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CookingWithMindthemoodsModItems.MELON_TART.get())) {
				DropPieProcedure.execute(world, x, y, z);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.DOUBLE_MELON_TART.get().defaultBlockState(), 3);
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.place")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.DOUBLE_MELON_TART.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CookingWithMindthemoodsModItems.MELON_TART.get())) {
				ShrinkTartProcedure.execute(world, x, y, z);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.TRIPLE_MELON_TART.get().defaultBlockState(), 3);
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.place")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.TRIPLE_MELON_TART.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CookingWithMindthemoodsModItems.MELON_TART.get())) {
				ShrinkTripleTartProcedure.execute(world, x, y, z);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.QUADRUPLE_TART.get().defaultBlockState(), 3);
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.place")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.QUADRUPLE_TART.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CookingWithMindthemoodsModItems.MELON_TART.get())) {
				ShrinkQuadrupleTartProcedure.execute(world, x, y, z);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.MEGA_MELON_TART.get().defaultBlockState(), 3);
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.place")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.MEGA_MELON_TART.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CookingWithMindthemoodsModItems.MELON_TART.get())) {
				ShrinkMegaTartProcedure.execute(world, x, y, z);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CookingWithMindthemoodsModItems.APPLE_CRISP.get() && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
				&& world.getBlockState(BlockPos.containing(x, y, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y, z)).isFaceSturdy(world, BlockPos.containing(x, y, z), Direction.UP)) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			world.setBlock(BlockPos.containing(x, y + 1, z), CookingWithMindthemoodsModBlocks.SINGLE_APPLE_CRISP.get().defaultBlockState(), 3);
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wool.place")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wool.place")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.SINGLE_APPLE_CRISP.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CookingWithMindthemoodsModItems.APPLE_CRISP.get())) {
				DropPieProcedure.execute(world, x, y, z);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.DOUBLE_APPLE_CRISP.get().defaultBlockState(), 3);
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wool.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wool.place")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.DOUBLE_APPLE_CRISP.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CookingWithMindthemoodsModItems.APPLE_CRISP.get())) {
				ShrinkCrispProcedure.execute(world, x, y, z);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.TRIPLE_APPLE_CRISP.get().defaultBlockState(), 3);
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wool.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wool.place")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.TRIPLE_APPLE_CRISP.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CookingWithMindthemoodsModItems.APPLE_CRISP.get())) {
				ShrinkTripleCrispProcedure.execute(world, x, y, z);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.QUADRUPLE_APPLE_CRISP.get().defaultBlockState(), 3);
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wool.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wool.place")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.QUADRUPLE_APPLE_CRISP.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CookingWithMindthemoodsModItems.APPLE_CRISP.get())) {
				ShrinkQuadrupleCrispProcedure.execute(world, x, y, z);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.MEGA_APPLE_CRISP.get().defaultBlockState(), 3);
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wool.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wool.place")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.MEGA_APPLE_CRISP.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CookingWithMindthemoodsModItems.APPLE_CRISP.get())) {
				ShrinkMegaCrispProcedure.execute(world, x, y, z);
			}
		}
	}
}
