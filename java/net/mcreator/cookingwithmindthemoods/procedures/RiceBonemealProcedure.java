package net.mcreator.cookingwithmindthemoods.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
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
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class RiceBonemealProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getLevel().getBlockState(event.getPos()), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		execute(null, world, x, y, z, blockstate, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL && Math.random() < 0.3) {
			if (blockstate.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _getbp3 && blockstate.getValue(_getbp3) && blockstate.getBlock() == CookingWithMindthemoodsModBlocks.RICE_SHOOTS.get()) {
				world.setBlock(BlockPos.containing(x, y, z),
						(CookingWithMindthemoodsModBlocks.YOUNGISH_RICE_PLANT.get().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp6
								? CookingWithMindthemoodsModBlocks.YOUNGISH_RICE_PLANT.get().defaultBlockState().setValue(_withbp6, true)
								: CookingWithMindthemoodsModBlocks.YOUNGISH_RICE_PLANT.get().defaultBlockState()),
						3);
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.bone_meal.use")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.bone_meal.use")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 15, 0.5, 2, 0.5, 4);
			} else if (blockstate.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _getbp15 && blockstate.getValue(_getbp15) && blockstate.getBlock() == CookingWithMindthemoodsModBlocks.YOUNGISH_RICE_PLANT.get()
					&& (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER)) {
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER) {
					world.setBlock(BlockPos.containing(x, y + 1, z),
							(CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_1.get().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp23
									? CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_1.get().defaultBlockState().setValue(_withbp23, true)
									: CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_1.get().defaultBlockState()),
							3);
				} else {
					world.setBlock(BlockPos.containing(x, y + 1, z), CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_1.get().defaultBlockState(), 3);
				}
				world.setBlock(BlockPos.containing(x, y, z),
						(CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_1.get().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp26
								? CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_1.get().defaultBlockState().setValue(_withbp26, true)
								: CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_1.get().defaultBlockState()),
						3);
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.bone_meal.use")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.bone_meal.use")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 15, 0.5, 2, 0.5, 4);
			} else if (blockstate.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _getbp35 && blockstate.getValue(_getbp35)
					&& blockstate.getBlock() == CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_1.get()) {
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _getbp39
						&& (world.getBlockState(BlockPos.containing(x, y + 1, z))).getValue(_getbp39)) {
					world.setBlock(BlockPos.containing(x, y + 1, z),
							(CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_2.get().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp40
									? CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_2.get().defaultBlockState().setValue(_withbp40, true)
									: CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_2.get().defaultBlockState()),
							3);
				} else {
					world.setBlock(BlockPos.containing(x, y + 1, z), CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_2.get().defaultBlockState(), 3);
				}
				world.setBlock(BlockPos.containing(x, y, z),
						(CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_2.get().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp43
								? CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_2.get().defaultBlockState().setValue(_withbp43, true)
								: CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_2.get().defaultBlockState()),
						3);
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.bone_meal.use")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.bone_meal.use")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 15, 0.5, 2, 0.5, 4);
			} else if (blockstate.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _getbp52 && blockstate.getValue(_getbp52)
					&& blockstate.getBlock() == CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_2.get()) {
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _getbp56
						&& (world.getBlockState(BlockPos.containing(x, y + 1, z))).getValue(_getbp56)) {
					world.setBlock(BlockPos.containing(x, y + 1, z),
							(CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_3.get().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp57
									? CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_3.get().defaultBlockState().setValue(_withbp57, true)
									: CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_3.get().defaultBlockState()),
							3);
				} else {
					world.setBlock(BlockPos.containing(x, y + 1, z), CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_3.get().defaultBlockState(), 3);
				}
				world.setBlock(BlockPos.containing(x, y, z),
						(CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_3.get().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp60
								? CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_3.get().defaultBlockState().setValue(_withbp60, true)
								: CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_3.get().defaultBlockState()),
						3);
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.bone_meal.use")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.bone_meal.use")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 15, 0.5, 2, 0.5, 4);
			} else {
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _getbp69 && (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getbp69)
						&& blockstate.getBlock() == CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_1.get() && (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER)) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER) {
						world.setBlock(BlockPos.containing(x, y, z),
								(CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_2.get().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp77
										? CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_2.get().defaultBlockState().setValue(_withbp77, true)
										: CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_2.get().defaultBlockState()),
								3);
					} else {
						world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_2.get().defaultBlockState(), 3);
					}
					world.setBlock(BlockPos.containing(x, y - 1, z),
							(CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_2.get().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp80
									? CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_2.get().defaultBlockState().setValue(_withbp80, true)
									: CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_2.get().defaultBlockState()),
							3);
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.bone_meal.use")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.bone_meal.use")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 15, 0.5, 2, 0.5, 4);
				} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _getbp89
						&& (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getbp89) && blockstate.getBlock() == CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_2.get()
						&& (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER)) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER) {
						world.setBlock(BlockPos.containing(x, y, z),
								(CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_3.get().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp97
										? CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_3.get().defaultBlockState().setValue(_withbp97, true)
										: CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_3.get().defaultBlockState()),
								3);
					} else {
						world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.RICE_TOP_STAGE_3.get().defaultBlockState(), 3);
					}
					world.setBlock(BlockPos.containing(x, y - 1, z),
							(CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_3.get().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp100
									? CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_3.get().defaultBlockState().setValue(_withbp100, true)
									: CookingWithMindthemoodsModBlocks.RICE_BOTTOM_STAGE_3.get().defaultBlockState()),
							3);
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.bone_meal.use")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.bone_meal.use")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 15, 0.5, 2, 0.5, 4);
				}
			}
		}
	}
}
