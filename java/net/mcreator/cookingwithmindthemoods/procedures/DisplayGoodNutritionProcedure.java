package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;

public class DisplayGoodNutritionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > 2 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition <= 8) {
			return true;
		}
		return false;
	}
}
