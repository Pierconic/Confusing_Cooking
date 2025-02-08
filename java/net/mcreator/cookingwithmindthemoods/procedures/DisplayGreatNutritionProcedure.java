package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;

public class DisplayGreatNutritionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 8 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition <= 16) {
			return true;
		}
		return false;
	}
}
