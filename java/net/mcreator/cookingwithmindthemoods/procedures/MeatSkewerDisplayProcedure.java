package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;

public class MeatSkewerDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.STICK)) : false)
				&& ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.COOKED_PORKCHOP)) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.COOKED_MUTTON)) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.COOKED_BEEF)) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.COOKED_CHICKEN)) : false))
				&& entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookpage == 0 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookopen == true) {
			return true;
		}
		return false;
	}
}
