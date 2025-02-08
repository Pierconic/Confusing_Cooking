package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;
import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModMobEffects;

public class SuperRottenEffectsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, Mth.nextInt(RandomSource.create(), 800, 4800), 0, true, true));
		{
			CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
			_vars.nutrition = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition - 6;
			_vars.syncPlayerVariables(entity);
		}
		if (Math.random() < 0.2) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 1200, 0, true, true));
		}
		if (Math.random() < 0.3) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1200, 2, true, true));
		}
		if (Math.random() < 0.3) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1200, 1, true, true));
		}
		if (Math.random() < 0.5) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.PALLOR_1, 1600, 2, true, true));
		}
		if (Math.random() < 0.2) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 900, 2, true, true));
		}
	}
}
