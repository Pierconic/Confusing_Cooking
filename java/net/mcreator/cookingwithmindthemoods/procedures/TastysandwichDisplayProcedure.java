package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;
import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModItems;

public class TastysandwichDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.BREAD)) : false)
				&& ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.CARROT)) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.POTATO)) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.BEETROOT)) : false))
				&& ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CookingWithMindthemoodsModItems.CHEESE.get())) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CookingWithMindthemoodsModItems.AGED_CHEESE.get())) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CookingWithMindthemoodsModItems.ANCIENT_CHEESE.get())) : false))
				&& ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.COOKED_BEEF)) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.COOKED_PORKCHOP)) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.COOKED_CHICKEN)) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.COOKED_MUTTON)) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.SALMON)) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.COD)) : false))
				&& entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookpage == 2) {
			return true;
		}
		return false;
	}
}
