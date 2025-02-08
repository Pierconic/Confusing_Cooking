package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;
import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModMobEffects;
import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModBlocks;

public class EatDinnerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.CHICKEN_DINNER_PLATE.get()) {
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 20) {
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 5));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 3));
			}
			if (Math.random() < 0.3) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 0) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.VIGOR_1, 120, 0));
			}
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.CARROTS.defaultBlockState()));
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CookingWithMindthemoodsModBlocks.NIBBLED_CHICKEN_DINNER_PLATE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.NIBBLED_CHICKEN_DINNER_PLATE.get()) {
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 20) {
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 5));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 3));
			}
			if (Math.random() < 0.3) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 0) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.VIGOR_1, 120, 0));
			}
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.CARROTS.defaultBlockState()));
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CookingWithMindthemoodsModBlocks.MUNCHED_CHICKEN_DINNER_PLATE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.MUNCHED_CHICKEN_DINNER_PLATE.get()) {
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 20) {
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 5));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 3));
			}
			if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 0) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.VIGOR_1, 120, 0));
			}
			if (Math.random() < 0.3) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.CARROTS.defaultBlockState()));
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CookingWithMindthemoodsModBlocks.CRUMBY_CHICKEN_DINNER_PLATE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.CRUMBY_CHICKEN_DINNER_PLATE.get()) {
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 20) {
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 5));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 3));
			}
			if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 0) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.VIGOR_1, 120, 0));
			}
			if (Math.random() < 0.3) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.CARROTS.defaultBlockState()));
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CookingWithMindthemoodsModBlocks.EMPTY_PLATE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.FIERY_FILET_PLATE.get()) {
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 20) {
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 5));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 3));
			}
			if (Math.random() < 0.3) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 0) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 120, 0));
			}
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.NETHER_WART.defaultBlockState()));
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CookingWithMindthemoodsModBlocks.NIBBLED_FIERY_FILET_PLATE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.lastfoodeaten = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten;
				_vars.syncPlayerVariables(entity);
			}
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.recentfoodeaten = 3;
				_vars.syncPlayerVariables(entity);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.NIBBLED_FIERY_FILET_PLATE.get()) {
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 20) {
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 5));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 3));
			}
			if (Math.random() < 0.3) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 0) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 120, 0));
			}
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.NETHER_WART.defaultBlockState()));
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CookingWithMindthemoodsModBlocks.MUNCHED_FIERY_FILET_PLATE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.lastfoodeaten = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten;
				_vars.syncPlayerVariables(entity);
			}
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.recentfoodeaten = 3;
				_vars.syncPlayerVariables(entity);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.MUNCHED_FIERY_FILET_PLATE.get()) {
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 20) {
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 5));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 3));
			}
			if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 0) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 120, 0));
			}
			if (Math.random() < 0.3) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.NETHER_WART.defaultBlockState()));
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CookingWithMindthemoodsModBlocks.CRUMBY_FIERY_FILET_PLATE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.lastfoodeaten = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten;
				_vars.syncPlayerVariables(entity);
			}
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.recentfoodeaten = 3;
				_vars.syncPlayerVariables(entity);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.CRUMBY_FIERY_FILET_PLATE.get()) {
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 20) {
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 5));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 3));
			}
			if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 0) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 120, 0));
			}
			if (Math.random() < 0.3) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.NETHER_WART.defaultBlockState()));
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CookingWithMindthemoodsModBlocks.EMPTY_PLATE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.lastfoodeaten = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten;
				_vars.syncPlayerVariables(entity);
			}
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.recentfoodeaten = 3;
				_vars.syncPlayerVariables(entity);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.SEAFOOD_DINNER_PLATE.get()) {
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 20) {
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 5));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 3));
			}
			if (Math.random() < 0.3) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 0) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 120, 0));
			}
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.SEA_PICKLE.defaultBlockState()));
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CookingWithMindthemoodsModBlocks.NIBBLED_SEAFOOD_DINNER_PLATE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.lastfoodeaten = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten;
				_vars.syncPlayerVariables(entity);
			}
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.recentfoodeaten = 5;
				_vars.syncPlayerVariables(entity);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.NIBBLED_SEAFOOD_DINNER_PLATE.get()) {
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 20) {
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 5));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 3));
			}
			if (Math.random() < 0.3) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 0) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 120, 0));
			}
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.SEA_PICKLE.defaultBlockState()));
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CookingWithMindthemoodsModBlocks.MUNCHED_SEAFOOD_DINNER_PLATE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.lastfoodeaten = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten;
				_vars.syncPlayerVariables(entity);
			}
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.recentfoodeaten = 5;
				_vars.syncPlayerVariables(entity);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.MUNCHED_SEAFOOD_DINNER_PLATE.get()) {
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 20) {
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 5));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 3));
			}
			if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 0) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 120, 0));
			}
			if (Math.random() < 0.3) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.SEA_PICKLE.defaultBlockState()));
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CookingWithMindthemoodsModBlocks.CRUMBY_SEAFOOD_DINNER_PLATE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.lastfoodeaten = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten;
				_vars.syncPlayerVariables(entity);
			}
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.recentfoodeaten = 5;
				_vars.syncPlayerVariables(entity);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.CRUMBY_SEAFOOD_DINNER_PLATE.get()) {
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 20) {
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 5));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 3));
			}
			if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 0) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 120, 0));
			}
			if (Math.random() < 0.3) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.SEA_PICKLE.defaultBlockState()));
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CookingWithMindthemoodsModBlocks.EMPTY_PLATE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.lastfoodeaten = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten;
				_vars.syncPlayerVariables(entity);
			}
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.recentfoodeaten = 5;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
