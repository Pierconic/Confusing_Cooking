package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;
import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModItems;

public class LoadedMushroomDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.BROWN_MUSHROOM)) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.RED_MUSHROOM)) : false))
				&& ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CookingWithMindthemoodsModItems.CHEESE.get())) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CookingWithMindthemoodsModItems.AGED_CHEESE.get())) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CookingWithMindthemoodsModItems.ANCIENT_CHEESE.get())) : false))
				&& entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookpage == 6) {
			return true;
		}
		return false;
	}
}
