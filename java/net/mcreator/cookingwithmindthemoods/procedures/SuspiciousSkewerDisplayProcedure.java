package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;

public class SuspiciousSkewerDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.STICK)) : false)
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.RED_MUSHROOM)) : false)
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.BROWN_MUSHROOM)) : false) && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookpage == 1
				&& entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookopen == true) {
			return true;
		}
		return false;
	}
}
