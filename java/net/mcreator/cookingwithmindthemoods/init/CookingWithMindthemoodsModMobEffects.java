
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cookingwithmindthemoods.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.cookingwithmindthemoods.procedures.VeggieDigestionEffectExpiresProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.MeatDigestionEffectExpiresProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.FishDigestionEffectExpiresProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ChocolateDigestionEffectExpiresProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.CarrotDigestionEffectExpiresProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.BerryDigestionEffectExpiresProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.AncientDigestionEffectExpiresProcedure;
import net.mcreator.cookingwithmindthemoods.potion.Vigor1MobEffect;
import net.mcreator.cookingwithmindthemoods.potion.VeggieDigestionMobEffect;
import net.mcreator.cookingwithmindthemoods.potion.PotionSicknessMobEffect;
import net.mcreator.cookingwithmindthemoods.potion.Pallor1MobEffect;
import net.mcreator.cookingwithmindthemoods.potion.MeatDigestionMobEffect;
import net.mcreator.cookingwithmindthemoods.potion.FishDigestionMobEffect;
import net.mcreator.cookingwithmindthemoods.potion.ChocolateDigestionMobEffect;
import net.mcreator.cookingwithmindthemoods.potion.CarrotDigestionMobEffect;
import net.mcreator.cookingwithmindthemoods.potion.BerryDigestionMobEffect;
import net.mcreator.cookingwithmindthemoods.potion.AncientDigestionMobEffect;
import net.mcreator.cookingwithmindthemoods.CookingWithMindthemoodsMod;

@EventBusSubscriber
public class CookingWithMindthemoodsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, CookingWithMindthemoodsMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> VIGOR_1 = REGISTRY.register("vigor_1", () -> new Vigor1MobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> PALLOR_1 = REGISTRY.register("pallor_1", () -> new Pallor1MobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> POTION_SICKNESS = REGISTRY.register("potion_sickness", () -> new PotionSicknessMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> BERRY_DIGESTION = REGISTRY.register("berry_digestion", () -> new BerryDigestionMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> CHOCOLATE_DIGESTION = REGISTRY.register("chocolate_digestion", () -> new ChocolateDigestionMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> MEAT_DIGESTION = REGISTRY.register("meat_digestion", () -> new MeatDigestionMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> VEGGIE_DIGESTION = REGISTRY.register("veggie_digestion", () -> new VeggieDigestionMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> FISH_DIGESTION = REGISTRY.register("fish_digestion", () -> new FishDigestionMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> CARROT_DIGESTION = REGISTRY.register("carrot_digestion", () -> new CarrotDigestionMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ANCIENT_DIGESTION = REGISTRY.register("ancient_digestion", () -> new AncientDigestionMobEffect());

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		if (effectInstance.getEffect().is(BERRY_DIGESTION)) {
			BerryDigestionEffectExpiresProcedure.execute(entity);
		} else if (effectInstance.getEffect().is(CHOCOLATE_DIGESTION)) {
			ChocolateDigestionEffectExpiresProcedure.execute(entity);
		} else if (effectInstance.getEffect().is(MEAT_DIGESTION)) {
			MeatDigestionEffectExpiresProcedure.execute(entity);
		} else if (effectInstance.getEffect().is(VEGGIE_DIGESTION)) {
			VeggieDigestionEffectExpiresProcedure.execute(entity);
		} else if (effectInstance.getEffect().is(FISH_DIGESTION)) {
			FishDigestionEffectExpiresProcedure.execute(entity);
		} else if (effectInstance.getEffect().is(CARROT_DIGESTION)) {
			CarrotDigestionEffectExpiresProcedure.execute(entity);
		} else if (effectInstance.getEffect().is(ANCIENT_DIGESTION)) {
			AncientDigestionEffectExpiresProcedure.execute(entity, effectInstance.getAmplifier());
		}
	}
}
