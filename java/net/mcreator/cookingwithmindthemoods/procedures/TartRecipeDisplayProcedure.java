package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;

public class TartRecipeDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.MELON)) : false)
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.WHEAT)) : false)
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.EGG)) : false)
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.SUGAR)) : false) && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookpage == 12) {
			return true;
		}
		return false;
	}
}
