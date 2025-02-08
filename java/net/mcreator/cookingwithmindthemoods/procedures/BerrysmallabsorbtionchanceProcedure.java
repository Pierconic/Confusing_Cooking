package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;
import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModMobEffects;

public class BerrysmallabsorbtionchanceProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.4 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 0 && !(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CookingWithMindthemoodsModMobEffects.BERRY_DIGESTION))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(CookingWithMindthemoodsModMobEffects.BERRY_DIGESTION, 1600, 0, false, false));
		}
	}
}
