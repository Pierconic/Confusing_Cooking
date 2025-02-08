package net.mcreator.cookingwithmindthemoods.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.Difficulty;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PallorProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingDamageEvent.Post event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getDifficulty() == Difficulty.HARD) {
			if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1)
					&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1) ? _livEnt.getEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1).getAmplifier() : 0) < 2) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 2));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) - 3));
			}
			if (entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1)
					&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1) ? _livEnt.getEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1).getAmplifier() : 0) == 2) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 3));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) - 4));
			}
			if (entity instanceof LivingEntity _livEnt13 && _livEnt13.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1)
					&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1) ? _livEnt.getEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1).getAmplifier() : 0) >= 3) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 5));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) - 6));
			}
		} else if (world.getDifficulty() == Difficulty.PEACEFUL) {
			if (entity instanceof LivingEntity _livEnt20 && _livEnt20.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1)
					&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1) ? _livEnt.getEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1).getAmplifier() : 0) < 2
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= 8) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 1));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) - 2));
			}
			if (entity instanceof LivingEntity _livEnt27 && _livEnt27.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1)
					&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1) ? _livEnt.getEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1).getAmplifier() : 0) == 2
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= 8) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 2));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) - 3));
			}
			if (entity instanceof LivingEntity _livEnt34 && _livEnt34.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1)
					&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1) ? _livEnt.getEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1).getAmplifier() : 0) >= 3
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= 8) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 3));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) - 4));
			}
		} else {
			if (entity instanceof LivingEntity _livEnt41 && _livEnt41.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1)
					&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1) ? _livEnt.getEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1).getAmplifier() : 0) < 2
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= 6) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 2));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) - 3));
			}
			if (entity instanceof LivingEntity _livEnt48 && _livEnt48.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1)
					&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1) ? _livEnt.getEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1).getAmplifier() : 0) == 2
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= 6) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 3));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) - 4));
			}
			if (entity instanceof LivingEntity _livEnt55 && _livEnt55.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1)
					&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1) ? _livEnt.getEffect(CookingWithMindthemoodsModMobEffects.PALLOR_1).getAmplifier() : 0) >= 3
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= 6) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 5));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) - 6));
			}
		}
	}
}
