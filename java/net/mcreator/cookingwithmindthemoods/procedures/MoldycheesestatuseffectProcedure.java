package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModMobEffects;

public class MoldycheesestatuseffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(CookingWithMindthemoodsModMobEffects.VIGOR_1);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.NIGHT_VISION);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.ABSORPTION);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.DAMAGE_BOOST);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.REGENERATION);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.JUMP);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.DOLPHINS_GRACE);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.WATER_BREATHING);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.FIRE_RESISTANCE);
		if (entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.MOVEMENT_SLOWDOWN) ? _livEnt.getEffect(MobEffects.MOVEMENT_SLOWDOWN).getDuration() : 0, 1));
		}
		if (entity instanceof LivingEntity _livEnt13 && _livEnt13.hasEffect(MobEffects.WEAKNESS)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.WEAKNESS) ? _livEnt.getEffect(MobEffects.WEAKNESS).getDuration() : 0, 1));
		}
		if (entity instanceof LivingEntity _livEnt16 && _livEnt16.hasEffect(MobEffects.WITHER)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.WITHER) ? _livEnt.getEffect(MobEffects.WITHER).getDuration() : 0, 1));
		}
		if (entity instanceof LivingEntity _livEnt19 && _livEnt19.hasEffect(MobEffects.POISON)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.POISON) ? _livEnt.getEffect(MobEffects.POISON).getDuration() : 0, 1));
		}
		if (entity instanceof LivingEntity _livEnt22 && _livEnt22.hasEffect(MobEffects.DIG_SLOWDOWN)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DIG_SLOWDOWN) ? _livEnt.getEffect(MobEffects.DIG_SLOWDOWN).getDuration() : 0, 1));
		}
		if (entity instanceof LivingEntity _livEnt25 && _livEnt25.hasEffect(MobEffects.BLINDNESS)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.BLINDNESS) ? _livEnt.getEffect(MobEffects.BLINDNESS).getDuration() : 0, 1));
		}
		if (entity instanceof LivingEntity _livEnt28 && _livEnt28.hasEffect(MobEffects.HUNGER)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HUNGER) ? _livEnt.getEffect(MobEffects.HUNGER).getDuration() : 0, 1));
		}
		if (entity instanceof LivingEntity _livEnt31 && _livEnt31.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.PALLOR_1,
						entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1) ? _livEnt.getEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1).getDuration() : 0, 0));
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 800, 1));
	}
}
