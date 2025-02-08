package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;
import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModItems;

public class WholegrainbreadRecipeDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.BREAD)) : false)
				&& ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CookingWithMindthemoodsModItems.RICE.get())) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CookingWithMindthemoodsModItems.CORN.get())) : false))
				&& entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookpage == 3) {
			return true;
		}
		return false;
	}
}
