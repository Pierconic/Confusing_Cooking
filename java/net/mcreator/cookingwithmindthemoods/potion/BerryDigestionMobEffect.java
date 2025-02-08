
package net.mcreator.cookingwithmindthemoods.potion;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientMobEffectExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModMobEffects;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class BerryDigestionMobEffect extends MobEffect {
	public BerryDigestionMobEffect() {
		super(MobEffectCategory.NEUTRAL, -6750208);
	}

	@SubscribeEvent
	public static void registerMobEffectExtensions(RegisterClientExtensionsEvent event) {
		event.registerMobEffect(new IClientMobEffectExtensions() {
			@Override
			public boolean isVisibleInGui(MobEffectInstance effect) {
				return false;
			}
		}, CookingWithMindthemoodsModMobEffects.BERRY_DIGESTION.get());
	}
}
