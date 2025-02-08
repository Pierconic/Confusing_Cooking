
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cookingwithmindthemoods.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.cookingwithmindthemoods.CookingWithMindthemoodsMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CookingWithMindthemoodsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CookingWithMindthemoodsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {

			tabData.accept(CookingWithMindthemoodsModItems.SWEETBERRYJAM.get());
			tabData.accept(CookingWithMindthemoodsModItems.SPICYHUMUS.get());
			tabData.accept(CookingWithMindthemoodsModItems.SAVORYSAUCE.get());
			tabData.accept(CookingWithMindthemoodsModItems.CHOCOLATESAUCE.get());
			tabData.accept(CookingWithMindthemoodsModItems.DILL_RELISH.get());
			tabData.accept(CookingWithMindthemoodsModItems.ANCIENT_JAM.get());
			tabData.accept(CookingWithMindthemoodsModItems.CHOCOLATE.get());
			tabData.accept(CookingWithMindthemoodsModItems.RICE.get());
			tabData.accept(CookingWithMindthemoodsModItems.CORN.get());
			tabData.accept(CookingWithMindthemoodsModItems.CORN_COB.get());
			tabData.accept(CookingWithMindthemoodsModItems.FRIED_EGG.get());
			tabData.accept(CookingWithMindthemoodsModItems.LOADED_POTATO.get());
			tabData.accept(CookingWithMindthemoodsModItems.STICKY_RICE.get());
			tabData.accept(CookingWithMindthemoodsModItems.NUT_BAR.get());
			tabData.accept(CookingWithMindthemoodsModItems.STUFFED_MUSHROOMS.get());
			tabData.accept(CookingWithMindthemoodsModItems.HARD_CANDY.get());
			tabData.accept(CookingWithMindthemoodsModItems.CHEESE.get());
			tabData.accept(CookingWithMindthemoodsModItems.CHEESE_WHEEL_ITEM.get());
			tabData.accept(CookingWithMindthemoodsModItems.AGED_CHEESE.get());
			tabData.accept(CookingWithMindthemoodsModItems.AGED_CHEESE_WHEEL_ITEM.get());
			tabData.accept(CookingWithMindthemoodsModItems.ANCIENT_CHEESE.get());
			tabData.accept(CookingWithMindthemoodsModItems.ANCIENT_CHEESE_WHEEL_ITEM.get());
			tabData.accept(CookingWithMindthemoodsModItems.MOLDY_CHEESE.get());
			tabData.accept(CookingWithMindthemoodsModItems.MOLDY_CHEESE_WHEEL_ITEM.get());
			tabData.accept(CookingWithMindthemoodsModItems.CHEESE_BUCKET.get());
			tabData.accept(CookingWithMindthemoodsModItems.APPLE_CRISP.get());
			tabData.accept(CookingWithMindthemoodsModItems.MELON_TART.get());
			tabData.accept(CookingWithMindthemoodsModItems.VIOLET_SUSPICIOUS_STEW.get());
			tabData.accept(CookingWithMindthemoodsModItems.AZURE_SUSPICIOUS_STEW.get());
			tabData.accept(CookingWithMindthemoodsModItems.INDIGO_SUSPICIOUS_STEW.get());
			tabData.accept(CookingWithMindthemoodsModItems.CRISPY_SUSPICIOUS_STEW.get());
			tabData.accept(CookingWithMindthemoodsModItems.COLORFUL_SUSPICIOUS_STEW.get());
			tabData.accept(CookingWithMindthemoodsModItems.FADED_SUSPICIOUS_STEW.get());
			tabData.accept(CookingWithMindthemoodsModItems.PALE_SUSPICIOUS_STEW.get());
			tabData.accept(CookingWithMindthemoodsModItems.SPARKLY_SUSPICIOUS_STEW.get());
			tabData.accept(CookingWithMindthemoodsModItems.FRAGRANT_SUSPICIOUS_STEW.get());
			tabData.accept(CookingWithMindthemoodsModItems.POTATO_SOUP.get());
			tabData.accept(CookingWithMindthemoodsModItems.SIMMERED_FRUIT.get());
			tabData.accept(CookingWithMindthemoodsModItems.SYRUP.get());
			tabData.accept(CookingWithMindthemoodsModItems.BEEF_STEW.get());
			tabData.accept(CookingWithMindthemoodsModItems.STRANGE_STEW.get());
			tabData.accept(CookingWithMindthemoodsModItems.ANCIENT_STEW.get());
			tabData.accept(CookingWithMindthemoodsModItems.NUT_BREAD.get());
			tabData.accept(CookingWithMindthemoodsModItems.STICKYBREAD.get());
			tabData.accept(CookingWithMindthemoodsModItems.EXTREMELYSTICKYBREAD.get());
			tabData.accept(CookingWithMindthemoodsModItems.SWEETBREAD.get());
			tabData.accept(CookingWithMindthemoodsModItems.EXTRASWEETBREAD.get());
			tabData.accept(CookingWithMindthemoodsModItems.SLIGHTLY_CHOCOLATE_BREAD.get());
			tabData.accept(CookingWithMindthemoodsModItems.SUPER_CHOCOLATE_BREAD.get());
			tabData.accept(CookingWithMindthemoodsModItems.CARROT_BREAD.get());
			tabData.accept(CookingWithMindthemoodsModItems.CARROT_BREAD_DELUXE.get());
			tabData.accept(CookingWithMindthemoodsModItems.MEAT_SANDWICH.get());
			tabData.accept(CookingWithMindthemoodsModItems.SUPER_MEAT_SANDWICH.get());
			tabData.accept(CookingWithMindthemoodsModItems.VEGGIE_SANDWICH.get());
			tabData.accept(CookingWithMindthemoodsModItems.SUPER_VEGGIE_SANDWICH.get());
			tabData.accept(CookingWithMindthemoodsModItems.FISH_SANDWICH.get());
			tabData.accept(CookingWithMindthemoodsModItems.SUPER_FISH_SANDWICH.get());
			tabData.accept(CookingWithMindthemoodsModItems.ROTTEN_SANDWICH.get());
			tabData.accept(CookingWithMindthemoodsModItems.EXTREMELY_ROTTEN_SANDWICH.get());
			tabData.accept(CookingWithMindthemoodsModItems.WHOLE_GRAIN_BREAD.get());
			tabData.accept(CookingWithMindthemoodsModItems.GRILLED_CHEESE.get());
			tabData.accept(CookingWithMindthemoodsModItems.TASTY_SANDWICH.get());
			tabData.accept(CookingWithMindthemoodsModItems.CHICKEN_DINNER.get());
			tabData.accept(CookingWithMindthemoodsModItems.SEAFOOD_DINNER.get());
			tabData.accept(CookingWithMindthemoodsModItems.FIERY_FILET.get());
			tabData.accept(CookingWithMindthemoodsModItems.FRUIT_SKEWER.get());
			tabData.accept(CookingWithMindthemoodsModItems.VEGGIE_SKEWER.get());
			tabData.accept(CookingWithMindthemoodsModItems.FISH_SKEWER.get());
			tabData.accept(CookingWithMindthemoodsModItems.MEAT_SKEWER.get());
			tabData.accept(CookingWithMindthemoodsModItems.SUSPICIOUS_SKEWER.get());
			tabData.accept(CookingWithMindthemoodsModItems.STRANGE_SKEWER.get());
			tabData.accept(CookingWithMindthemoodsModItems.ROTTEN_SKEWER.get());
			tabData.accept(CookingWithMindthemoodsModItems.ANCIENT_SKEWER.get());
			tabData.accept(CookingWithMindthemoodsModItems.SINGLE_SUSHI.get());
			tabData.accept(CookingWithMindthemoodsModItems.DOUBLE_SUSHI.get());
			tabData.accept(CookingWithMindthemoodsModItems.TRIPLE_SUSHI.get());
			tabData.accept(CookingWithMindthemoodsModItems.SINGLE_VEGGIE_SUSHI.get());
			tabData.accept(CookingWithMindthemoodsModItems.DOUBLE_VEGGIE_SUSHI.get());
			tabData.accept(CookingWithMindthemoodsModItems.TRIPPLE_VEGGIE_SUSHI.get());
			tabData.accept(CookingWithMindthemoodsModItems.SINGLE_FISH_SUSHI.get());
			tabData.accept(CookingWithMindthemoodsModItems.DOUBLE_FISH_SUSHI.get());
			tabData.accept(CookingWithMindthemoodsModItems.TRIPLE_FISH_SUSHI.get());
			tabData.accept(CookingWithMindthemoodsModItems.PORCELAIN_PLATE.get());
			tabData.accept(CookingWithMindthemoodsModItems.CORN_TORTILLA.get());
			tabData.accept(CookingWithMindthemoodsModItems.CORNBREAD.get());
			tabData.accept(CookingWithMindthemoodsModItems.FISH_TACO.get());
			tabData.accept(CookingWithMindthemoodsModItems.VEGGIE_TACO.get());
			tabData.accept(CookingWithMindthemoodsModItems.MEAT_TACO.get());
			tabData.accept(CookingWithMindthemoodsModItems.ROTTEN_TACO.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

			tabData.accept(CookingWithMindthemoodsModBlocks.COOKINGTABLE.get().asItem());
			tabData.accept(CookingWithMindthemoodsModBlocks.RICE_SHOOTS.get().asItem());
			tabData.accept(CookingWithMindthemoodsModBlocks.YOUNGISH_RICE_PLANT.get().asItem());
			tabData.accept(CookingWithMindthemoodsModBlocks.APPLE_BLOSSOMS_STAGE_1.get().asItem());
			tabData.accept(CookingWithMindthemoodsModBlocks.APPLE_BLOSSOMS_STAGE_2.get().asItem());
			tabData.accept(CookingWithMindthemoodsModBlocks.APPLE_BLOSSOMS_STAGE_3.get().asItem());
			tabData.accept(CookingWithMindthemoodsModBlocks.APPLE_BLOSSOMS_MATURE.get().asItem());
			tabData.accept(CookingWithMindthemoodsModBlocks.BRISTLESPROUT_1.get().asItem());
			tabData.accept(CookingWithMindthemoodsModBlocks.BRISTLESPROUT_6.get().asItem());
			tabData.accept(CookingWithMindthemoodsModBlocks.STAR_PETALS_1_PURPLE.get().asItem());
			tabData.accept(CookingWithMindthemoodsModBlocks.STAR_CROP_1.get().asItem());

		}
	}
}
