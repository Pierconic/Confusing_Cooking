package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;

public class ShowButtonBProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!(entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookpage == 2) && !(entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookpage == 3)
				&& !(entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookpage == 4) && !(entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookpage == 5)
				&& entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookopen == true) {
			return true;
		}
		return false;
	}
}
