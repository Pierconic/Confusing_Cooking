package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModMobEffects;

public class AncientcheesestatuseffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.DIG_SLOWDOWN);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.BLINDNESS);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.HUNGER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.WEAKNESS);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.POISON);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.WITHER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.BAD_OMEN);
		if (entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(MobEffects.MOVEMENT_SPEED)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, (int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.MOVEMENT_SPEED) ? _livEnt.getEffect(MobEffects.MOVEMENT_SPEED).getDuration() : 0) * 0.5
						+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.MOVEMENT_SPEED) ? _livEnt.getEffect(MobEffects.MOVEMENT_SPEED).getDuration() : 0)), 1));
		}
		if (entity instanceof LivingEntity _livEnt13 && _livEnt13.hasEffect(MobEffects.DAMAGE_BOOST)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getDuration() : 0) * 0.5
						+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getDuration() : 0)), 1));
		}
		if (entity instanceof LivingEntity _livEnt17 && _livEnt17.hasEffect(MobEffects.JUMP)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, (int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.JUMP) ? _livEnt.getEffect(MobEffects.JUMP).getDuration() : 0) * 0.5
						+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.JUMP) ? _livEnt.getEffect(MobEffects.JUMP).getDuration() : 0)), 1));
		}
		if (entity instanceof LivingEntity _livEnt21 && _livEnt21.hasEffect(MobEffects.REGENERATION)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, (int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.REGENERATION) ? _livEnt.getEffect(MobEffects.REGENERATION).getDuration() : 0) * 0.5
						+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.REGENERATION) ? _livEnt.getEffect(MobEffects.REGENERATION).getDuration() : 0)), 1));
		}
		if (entity instanceof LivingEntity _livEnt25 && _livEnt25.hasEffect(MobEffects.FIRE_RESISTANCE)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(
						new MobEffectInstance(MobEffects.FIRE_RESISTANCE, (int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.FIRE_RESISTANCE) ? _livEnt.getEffect(MobEffects.FIRE_RESISTANCE).getDuration() : 0) * 0.5
								+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.FIRE_RESISTANCE) ? _livEnt.getEffect(MobEffects.FIRE_RESISTANCE).getDuration() : 0)), 1));
		}
		if (entity instanceof LivingEntity _livEnt29 && _livEnt29.hasEffect(MobEffects.WATER_BREATHING)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(
						new MobEffectInstance(MobEffects.WATER_BREATHING, (int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.WATER_BREATHING) ? _livEnt.getEffect(MobEffects.WATER_BREATHING).getDuration() : 0) * 0.5
								+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.WATER_BREATHING) ? _livEnt.getEffect(MobEffects.WATER_BREATHING).getDuration() : 0)), 1));
		}
		if (entity instanceof LivingEntity _livEnt33 && _livEnt33.hasEffect(MobEffects.NIGHT_VISION)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, (int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.NIGHT_VISION) ? _livEnt.getEffect(MobEffects.NIGHT_VISION).getDuration() : 0) * 0.5
						+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.NIGHT_VISION) ? _livEnt.getEffect(MobEffects.NIGHT_VISION).getDuration() : 0)), 1));
		}
		if (entity instanceof LivingEntity _livEnt37 && _livEnt37.hasEffect(MobEffects.ABSORPTION)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, (int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.ABSORPTION) ? _livEnt.getEffect(MobEffects.ABSORPTION).getDuration() : 0) * 0.5
						+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.ABSORPTION) ? _livEnt.getEffect(MobEffects.ABSORPTION).getDuration() : 0)), 1));
		}
		if (entity instanceof LivingEntity _livEnt41 && _livEnt41.hasEffect(MobEffects.SLOW_FALLING)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, (int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.SLOW_FALLING) ? _livEnt.getEffect(MobEffects.SLOW_FALLING).getDuration() : 0) * 0.5
						+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.SLOW_FALLING) ? _livEnt.getEffect(MobEffects.SLOW_FALLING).getDuration() : 0)), 1));
		}
		if (entity instanceof LivingEntity _livEnt45 && _livEnt45.hasEffect(CookingWithMindthemoodsModMobEffects.VIGOR_1)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.VIGOR_1,
						(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CookingWithMindthemoodsModMobEffects.VIGOR_1) ? _livEnt.getEffect(CookingWithMindthemoodsModMobEffects.VIGOR_1).getDuration() : 0) * 0.5
								+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CookingWithMindthemoodsModMobEffects.VIGOR_1) ? _livEnt.getEffect(CookingWithMindthemoodsModMobEffects.VIGOR_1).getDuration() : 0)),
						0));
		}
	}
}
