
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cookingwithmindthemoods.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CookingWithMindthemoodsModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> DONUTRITION;
	public static GameRules.Key<GameRules.BooleanValue> DOPOTIONSICKNESS;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		DONUTRITION = GameRules.register("doNutrition", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
		DOPOTIONSICKNESS = GameRules.register("doPotionSickness", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
	}
}
