package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;

public class NextSlideProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookpage < 13) {
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.recipebookpage = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookpage + 1;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
