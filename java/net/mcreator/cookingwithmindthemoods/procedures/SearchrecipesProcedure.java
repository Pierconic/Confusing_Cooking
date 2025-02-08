package net.mcreator.cookingwithmindthemoods.procedures;

import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModItems;

public class SearchrecipesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 3)).getItem() == Items.BREAD) {
			GrilledCheeseRecipeProcedure.execute(world, x, y, z);
			ExtremelystickybreadrecipeProcedure.execute(world, x, y, z, entity);
			SweetbreadrecipeProcedure.execute(world, x, y, z);
			ExtrasweetbreadrecipeProcedure.execute(world, x, y, z, entity);
			SlightlychocolatebreadrecipeProcedure.execute(world, x, y, z);
			SuperchocolatebreadrecipeProcedure.execute(world, x, y, z, entity);
			CarrotbreadrecipeProcedure.execute(world, x, y, z);
			CarrotbreaddeluxerecipeProcedure.execute(world, x, y, z);
			MeatSandwichrecipesProcedure.execute(world, x, y, z);
			VeggieSandwichrecipesProcedure.execute(world, x, y, z);
			FishSandwichrecipesProcedure.execute(world, x, y, z);
			RottenSandwichRecipesProcedure.execute(world, x, y, z);
			WholeGrainRecipeProcedure.execute(world, x, y, z);
			StickybreadrecipeProcedure.execute(world, x, y, z, entity);
			TastyRecipeProcedure.execute(world, x, y, z);
			NutBarRecipeProcedure.execute(world, x, y, z);
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 3)).getItem() == CookingWithMindthemoodsModItems.CORN_TORTILLA.get()) {
			VeggieTacoRecipesProcedure.execute(world, x, y, z);
			MeatTacoRecipesProcedure.execute(world, x, y, z);
			FishTacoRecipesProcedure.execute(world, x, y, z);
			RottenTacoRecipesProcedure.execute(world, x, y, z);
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 3)).getItem() == Items.STICK) {
			SkewerRecipesProcedure.execute(world, x, y, z);
			AncientRecipesProcedure.execute(world, x, y, z);
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 3)).getItem() == Items.BOWL) {
			PotatoSoupRecipeProcedure.execute(world, x, y, z);
			MushroomstewrecipeProcedure.execute(world, x, y, z);
			BeetrootstewrecipeProcedure.execute(world, x, y, z);
			RabbitstewrecipeProcedure.execute(world, x, y, z);
			SyruprecipeProcedure.execute(world, x, y, z, entity);
			SimmeredFruitRecipeProcedure.execute(world, x, y, z);
			SuspiciousStewRecipesProcedure.execute(world, x, y, z);
			AncientRecipesProcedure.execute(world, x, y, z);
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 3)).getItem() == CookingWithMindthemoodsModItems.PORCELAIN_PLATE.get()) {
			DinnerRecipesProcedure.execute(world, x, y, z);
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 3)).getItem() == Items.GLASS_BOTTLE) {
			SweetjamrecipeProcedure.execute(world, x, y, z);
			SpicyhumusrecipeProcedure.execute(world, x, y, z);
			SavorysaucerecipeProcedure.execute(world, x, y, z);
			ChocolateAndDillRecipesProcedure.execute(world, x, y, z);
			AncientRecipesProcedure.execute(world, x, y, z);
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 3)).getItem() == Items.DRIED_KELP) {
			SushiRecipeProcedure.execute(world, x, y, z);
			FishSushiRecipeProcedure.execute(world, x, y, z);
			VeggieSushiRecipeProcedure.execute(world, x, y, z);
		} else {
			TartrecipeProcedure.execute(world, x, y, z, entity);
			CrisprecipeProcedure.execute(world, x, y, z);
			CookierecipeProcedure.execute(world, x, y, z);
			ChocolaterecipeProcedure.execute(world, x, y, z, entity);
			PierecipeProcedure.execute(world, x, y, z, entity);
			BreadrecipeProcedure.execute(world, x, y, z, entity);
			HardCandyRecipeProcedure.execute(world, x, y, z);
			LoadedPotatoRecipeProcedure.execute(world, x, y, z);
			StuffedMushroomRecipeProcedure.execute(world, x, y, z);
			NutBarRecipeProcedure.execute(world, x, y, z);
			TortillaRecipeProcedure.execute(world, x, y, z);
			CornbreadRecipesProcedure.execute(world, x, y, z);
		}
	}
}
