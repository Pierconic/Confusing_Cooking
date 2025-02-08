
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cookingwithmindthemoods.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.core.registries.Registries;

import net.mcreator.cookingwithmindthemoods.world.features.YoungricestructureFeatureFeature;
import net.mcreator.cookingwithmindthemoods.world.features.TallRiceFeatureFeature;
import net.mcreator.cookingwithmindthemoods.world.features.TallGrownRiceFeatureFeature;
import net.mcreator.cookingwithmindthemoods.world.features.RiverriceFeatureFeature;
import net.mcreator.cookingwithmindthemoods.world.features.RiceshootFeatureFeature;
import net.mcreator.cookingwithmindthemoods.world.features.CornPlantFeatureFeature;
import net.mcreator.cookingwithmindthemoods.world.features.AppleTreeGeneratorFeature;
import net.mcreator.cookingwithmindthemoods.world.features.AppleBushFeature;
import net.mcreator.cookingwithmindthemoods.CookingWithMindthemoodsMod;

public class CookingWithMindthemoodsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(Registries.FEATURE, CookingWithMindthemoodsMod.MODID);
	public static final DeferredHolder<Feature<?>, Feature<?>> YOUNGRICESTRUCTURE_FEATURE = REGISTRY.register("youngricestructure_feature", YoungricestructureFeatureFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> RIVERRICE_FEATURE = REGISTRY.register("riverrice_feature", RiverriceFeatureFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> RICESHOOT_FEATURE = REGISTRY.register("riceshoot_feature", RiceshootFeatureFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> TALL_RICE_FEATURE = REGISTRY.register("tall_rice_feature", TallRiceFeatureFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> TALL_GROWN_RICE_FEATURE = REGISTRY.register("tall_grown_rice_feature", TallGrownRiceFeatureFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> CORN_PLANT_FEATURE = REGISTRY.register("corn_plant_feature", CornPlantFeatureFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> APPLE_BUSH = REGISTRY.register("apple_bush", AppleBushFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> APPLE_TREE_GENERATOR = REGISTRY.register("apple_tree_generator", AppleTreeGeneratorFeature::new);
}
