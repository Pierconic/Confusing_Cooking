
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.cookingwithmindthemoods.init;

import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@EventBusSubscriber
public class CookingWithMindthemoodsModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(Items.STICK), new ItemStack(CookingWithMindthemoodsModItems.SUSPICIOUS_SKEWER.get()), 5, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(CookingWithMindthemoodsModItems.SAVORYSAUCE.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(CookingWithMindthemoodsModItems.DILL_RELISH.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(CookingWithMindthemoodsModItems.HARD_CANDY.get(), 3), 5, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(CookingWithMindthemoodsModItems.RICE.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(CookingWithMindthemoodsModItems.COLORFUL_SUSPICIOUS_STEW.get()), 10, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.SHEPHERD) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(CookingWithMindthemoodsModItems.CHEESE_WHEEL_ITEM.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(CookingWithMindthemoodsModItems.AGED_CHEESE_WHEEL_ITEM.get()), 6, 5, 0.08f));
		}
		if (event.getType() == VillagerProfession.BUTCHER) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.STICK, 2), new ItemStack(CookingWithMindthemoodsModItems.MEAT_SKEWER.get(), 2), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(CookingWithMindthemoodsModItems.MEAT_SANDWICH.get()), 8, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.STICK, 2), new ItemStack(CookingWithMindthemoodsModItems.VEGGIE_SKEWER.get(), 2), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(CookingWithMindthemoodsModItems.VEGGIE_SANDWICH.get()), 8, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(CookingWithMindthemoodsModItems.POTATO_SOUP.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 7), new ItemStack(CookingWithMindthemoodsModItems.CARROT_BREAD_DELUXE.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(CookingWithMindthemoodsModItems.CARROT_BREAD.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.STICK, 2), new ItemStack(CookingWithMindthemoodsModItems.FISH_SKEWER.get(), 2), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(CookingWithMindthemoodsModItems.FISH_SANDWICH.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6), new ItemStack(CookingWithMindthemoodsModItems.TRIPLE_FISH_SUSHI.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(CookingWithMindthemoodsModItems.SINGLE_SUSHI.get(), 2), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(CookingWithMindthemoodsModItems.SPARKLY_SUSPICIOUS_STEW.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(CookingWithMindthemoodsModItems.INDIGO_SUSPICIOUS_STEW.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.MASON) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(CookingWithMindthemoodsModItems.PORCELAIN_PLATE.get(), 3), 5, 5, 0.05f));
		}
	}
}
