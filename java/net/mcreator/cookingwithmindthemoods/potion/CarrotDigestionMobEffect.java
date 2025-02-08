
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
public class CarrotDigestionMobEffect extends MobEffect {
	public CarrotDigestionMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16738048);
	}

	@SubscribeEvent
	public static void registerMobEffectExtensions(RegisterClientExtensionsEvent event) {
		event.registerMobEffect(new IClientMobEffectExtensions() {
			@Override
			public boolean isVisibleInGui(MobEffectInstance effect) {
				return false;
			}
		}, CookingWithMindthemoodsModMobEffects.CARROT_DIGESTION.get());
	}
}
