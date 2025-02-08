package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;
import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModItems;

public class FishSushiRecipeDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CookingWithMindthemoodsModItems.STICKY_RICE.get())) : false)
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.DRIED_KELP)) : false)
				&& ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.SALMON)) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.COD)) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.COOKED_SALMON)) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.COOKED_COD)) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.TROPICAL_FISH)) : false))
				&& entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookpage == 7) {
			return true;
		}
		return false;
	}
}
