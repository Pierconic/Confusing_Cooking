
package net.mcreator.cookingwithmindthemoods.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class ChocolateItem extends Item {
	public ChocolateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationModifier(1f).alwaysEdible().build()));
	}
}
