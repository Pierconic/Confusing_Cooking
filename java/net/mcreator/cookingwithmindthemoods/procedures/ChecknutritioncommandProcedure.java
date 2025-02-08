package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;

public class ChecknutritioncommandProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition == 0) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Current nutrition level is neutral"), false);
		} else {
			if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 0 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < 9) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Current nutrition level is good"), false);
			} else {
				if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 8 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < 17) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Current nutrition level is very good"), false);
				} else {
					if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 16 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < 25) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Current nutrition level is extremely good"), false);
					} else {
						if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < 0 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > -9) {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Current nutrition level is poor"), false);
						} else {
							if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < -8 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > -17) {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("Current nutrition level is very poor"), false);
							} else {
								if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < -16 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > -25) {
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal("Current nutrition level is extremely poor"), false);
								} else {
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal("Current nutrition level is broken, somehow."), false);
								}
							}
						}
					}
				}
			}
		}
	}
}
