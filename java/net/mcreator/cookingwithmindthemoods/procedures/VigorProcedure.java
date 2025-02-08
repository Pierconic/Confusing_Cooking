package net.mcreator.cookingwithmindthemoods.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class VigorProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingDamageEvent.Post event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CookingWithMindthemoodsModMobEffects.VIGOR_1)) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 14) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1));
			}
		}
		if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(CookingWithMindthemoodsModMobEffects.VIGOR_1)
				&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CookingWithMindthemoodsModMobEffects.VIGOR_1) ? _livEnt.getEffect(CookingWithMindthemoodsModMobEffects.VIGOR_1).getAmplifier() : 0) == 2) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 14) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 2));
			}
		}
		if (entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(CookingWithMindthemoodsModMobEffects.VIGOR_1)
				&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CookingWithMindthemoodsModMobEffects.VIGOR_1) ? _livEnt.getEffect(CookingWithMindthemoodsModMobEffects.VIGOR_1).getAmplifier() : 0) >= 3) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 14) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 4));
			}
		}
	}
}
