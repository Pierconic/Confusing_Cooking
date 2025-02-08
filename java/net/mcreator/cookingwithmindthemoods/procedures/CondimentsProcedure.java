package net.mcreator.cookingwithmindthemoods.procedures;

import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModMobEffects;
import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class CondimentsProcedure {
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
		if (itemstack.has(DataComponents.FOOD)) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CookingWithMindthemoodsModItems.SWEETBERRYJAM.get() && itemstack.is(ItemTags.create(ResourceLocation.parse("forge:jam_flavor")))) {
				if (Math.random() < 0.4 && !(entity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(CookingWithMindthemoodsModMobEffects.BERRY_DIGESTION))) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.BERRY_DIGESTION, 1000, 1, false, false));
				}
				if (world instanceof ServerLevel _level) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
					});
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CookingWithMindthemoodsModItems.SPICYHUMUS.get() && itemstack.is(ItemTags.create(ResourceLocation.parse("forge:humus_flavor")))) {
				if (Math.random() < 0.5 && !(entity instanceof LivingEntity _livEnt15 && _livEnt15.hasEffect(CookingWithMindthemoodsModMobEffects.MEAT_DIGESTION))) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.MEAT_DIGESTION, 1000, 1, false, false));
				}
				if (world instanceof ServerLevel _level) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
					});
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CookingWithMindthemoodsModItems.SAVORYSAUCE.get() && itemstack.is(ItemTags.create(ResourceLocation.parse("forge:sauce_flavor")))) {
				if (Math.random() < 0.7) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 0));
				}
				if (world instanceof ServerLevel _level) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
					});
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CookingWithMindthemoodsModItems.CHOCOLATESAUCE.get()
					&& itemstack.is(ItemTags.create(ResourceLocation.parse("forge:chocolate_flavor")))) {
				if (Math.random() < 0.35 && !(entity instanceof LivingEntity _livEnt32 && _livEnt32.hasEffect(CookingWithMindthemoodsModMobEffects.CHOCOLATE_DIGESTION))) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.CHOCOLATE_DIGESTION, 1000, 1, false, false));
				}
				if (world instanceof ServerLevel _level) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
					});
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CookingWithMindthemoodsModItems.DILL_RELISH.get() && itemstack.is(ItemTags.create(ResourceLocation.parse("forge:dill_flavor")))) {
				if (Math.random() < 0.6) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1200, 0));
				}
				if (world instanceof ServerLevel _level) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
					});
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CookingWithMindthemoodsModItems.ANCIENT_JAM.get() && !(itemstack.getItem() == CookingWithMindthemoodsModItems.ANCIENT_SKEWER.get())
					&& !(itemstack.getItem() == CookingWithMindthemoodsModItems.ANCIENT_STEW.get())) {
				if (Math.random() < 0.5 && !(entity instanceof LivingEntity _livEnt51 && _livEnt51.hasEffect(CookingWithMindthemoodsModMobEffects.ANCIENT_DIGESTION))) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.ANCIENT_DIGESTION, 1200, 0, false, false));
				}
				if (world instanceof ServerLevel _level) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
					});
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
	}
}
