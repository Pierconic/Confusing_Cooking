package net.mcreator.cookingwithmindthemoods.procedures;

import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModMobEffects;
import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModGameRules;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PotionCheckProcedure {
	@SubscribeEvent
	public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getItem());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		execute(null, world, entity, itemstack);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == Items.POTION) {
			if (world.getLevelData().getGameRules().getBoolean(CookingWithMindthemoodsModGameRules.DOPOTIONSICKNESS) == true) {
				if (entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(CookingWithMindthemoodsModMobEffects.POTION_SICKNESS)) {
					if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(MobEffects.HUNGER)) {
						if (entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, Mth.nextInt(RandomSource.create(), 300, 600), 0, false, false));
						} else {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, Mth.nextInt(RandomSource.create(), 600, 1200), 0, false, false));
						}
					} else {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, Mth.nextInt(RandomSource.create(), 600, 1200), 0, false, false));
					}
				} else {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.POTION_SICKNESS, 3600, 0, false, false));
				}
			}
		}
	}
}
