package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;

public class ButtonAPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
			_vars.recipebookpage = 0;
			_vars.syncPlayerVariables(entity);
		}
	}
}
