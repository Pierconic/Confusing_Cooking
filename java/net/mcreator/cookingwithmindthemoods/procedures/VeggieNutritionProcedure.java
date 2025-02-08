package net.mcreator.cookingwithmindthemoods.procedures;

import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;
import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModMobEffects;
import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModGameRules;

import javax.annotation.Nullable;

@EventBusSubscriber
public class VeggieNutritionProcedure {
	@SubscribeEvent
	public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getItem());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		execute(null, world, x, y, z, entity, itemstack);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(CookingWithMindthemoodsModGameRules.DONUTRITION) == true) {
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:is_veggie")))) {
				if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).lastfoodeaten == entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten
						&& entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten == 2) {
					{
						CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
						_vars.nutrition = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition - 1;
						_vars.syncPlayerVariables(entity);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.slime_block.place")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.slime_block.place")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < -2 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > -9) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.PALLOR_1, 400, 0));
					}
					if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < -8 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > -17) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.PALLOR_1, 400, 1));
					}
					if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < -16 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > -25) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.PALLOR_1, 400, 2));
					}
				} else {
					if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).lastfoodeaten != entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten
							&& entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).lastfoodeaten != 2 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten != 2) {
						{
							CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
							_vars.nutrition = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition + 1;
							_vars.syncPlayerVariables(entity);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.amethyst_block.place")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.amethyst_block.place")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
						if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 2 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < 9) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.VIGOR_1, 400, 0));
						}
						if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 8 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < 17) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.VIGOR_1, 400, 1));
						}
						if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 16 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < 25) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.VIGOR_1, 400, 2));
						}
					}
				}
				{
					CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
					_vars.lastfoodeaten = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten;
					_vars.syncPlayerVariables(entity);
				}
				{
					CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
					_vars.recentfoodeaten = 2;
					_vars.syncPlayerVariables(entity);
				}
			}
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:veggie_meal")))) {
				if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).lastfoodeaten == entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten
						&& entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten == 2) {
					{
						CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
						_vars.nutrition = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition - 1;
						_vars.syncPlayerVariables(entity);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.slime_block.place")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.slime_block.place")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < -2 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > -9) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.PALLOR_1, 1200, 0));
					}
					if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < -8 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > -17) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.PALLOR_1, 1200, 1));
					}
					if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < -16 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > -25) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.PALLOR_1, 1200, 2));
					}
				} else {
					if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).lastfoodeaten != entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten
							&& entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).lastfoodeaten != 2 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten != 2) {
						{
							CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
							_vars.nutrition = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition + 1;
							_vars.syncPlayerVariables(entity);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.amethyst_block.place")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.amethyst_block.place")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
						if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 2 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < 9) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.VIGOR_1, 1200, 0));
						}
						if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 8 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < 17) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.VIGOR_1, 1200, 1));
						}
						if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 16 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < 25) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.VIGOR_1, 1200, 2));
						}
					}
				}
				{
					CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
					_vars.lastfoodeaten = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten;
					_vars.syncPlayerVariables(entity);
				}
				{
					CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
					_vars.recentfoodeaten = 2;
					_vars.syncPlayerVariables(entity);
				}
			}
			if (itemstack.getItem() == Items.GOLDEN_CARROT) {
				if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).lastfoodeaten == entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten
						&& entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten == 2) {
					{
						CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
						_vars.nutrition = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition - 1;
						_vars.syncPlayerVariables(entity);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.slime_block.place")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.slime_block.place")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < -2 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > -9) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.PALLOR_1, 4800, 0));
					}
					if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < -8 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > -17) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.PALLOR_1, 4800, 1));
					}
					if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < -16 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > -25) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.PALLOR_1, 4800, 2));
					}
				} else {
					if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).lastfoodeaten != entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten
							&& entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).lastfoodeaten != 2 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten != 2) {
						{
							CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
							_vars.nutrition = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition + 1;
							_vars.syncPlayerVariables(entity);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.amethyst_block.place")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.amethyst_block.place")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
						if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 2 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < 9) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.VIGOR_1, 4800, 0));
						}
						if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 8 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < 17) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.VIGOR_1, 4800, 1));
						}
						if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 16 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < 25) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.VIGOR_1, 4800, 2));
						}
					}
				}
				{
					CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
					_vars.lastfoodeaten = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recentfoodeaten;
					_vars.syncPlayerVariables(entity);
				}
				{
					CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
					_vars.recentfoodeaten = 2;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}
