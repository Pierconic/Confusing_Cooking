package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;
import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModMobEffects;

public class MeatstrengthchanceProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.65 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 0 && !(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CookingWithMindthemoodsModMobEffects.MEAT_DIGESTION))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.MEAT_DIGESTION, 1200, 0, false, false));
		}
	}
}
