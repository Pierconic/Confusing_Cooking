package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;

public class ShowPreviousButtonProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookpage == 0 || !entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookopen) {
			return false;
		}
		return true;
	}
}
