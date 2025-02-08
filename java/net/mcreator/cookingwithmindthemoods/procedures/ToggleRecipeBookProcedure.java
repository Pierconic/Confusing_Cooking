package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;

public class ToggleRecipeBookProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (true == entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookopen) {
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.recipebookopen = false;
				_vars.syncPlayerVariables(entity);
			}
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.recipebookpage = 0;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.recipebookopen = true;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
