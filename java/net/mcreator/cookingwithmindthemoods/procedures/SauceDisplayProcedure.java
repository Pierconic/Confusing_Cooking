package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;

public class SauceDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.GLASS_BOTTLE)) : false)
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.CRIMSON_FUNGUS)) : false)
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.WARPED_FUNGUS)) : false)
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.HONEYCOMB)) : false) && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookpage == 10) {
			return true;
		}
		return false;
	}
}
