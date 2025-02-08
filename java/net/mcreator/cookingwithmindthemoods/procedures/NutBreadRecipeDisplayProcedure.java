package net.mcreator.cookingwithmindthemoods.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;

public class NutBreadRecipeDisplayProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		boolean found = false;
		if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).recipebookpage == 5 && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.BREAD)) : false)) {
			found = false;
			if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerIter) {
				for (int _idx = 0; _idx < _modHandlerIter.getSlots(); _idx++) {
					ItemStack itemstackiterator = _modHandlerIter.getStackInSlot(_idx).copy();
					if (itemstackiterator.is(ItemTags.create(ResourceLocation.parse("forge:is_nutty"))) || itemstackiterator.is(ItemTags.create(ResourceLocation.parse("forge:is_nutish")))) {
						found = true;
					}
				}
			}
		}
		if (found == true) {
			return true;
		}
		return false;
	}
}
