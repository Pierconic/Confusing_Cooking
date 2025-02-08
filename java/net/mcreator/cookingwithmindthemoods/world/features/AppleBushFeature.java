
package net.mcreator.cookingwithmindthemoods.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.SimpleRandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.SimpleRandomSelectorFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.mcreator.cookingwithmindthemoods.procedures.AppleBushGenConditionProcedure;

public class AppleBushFeature extends SimpleRandomSelectorFeature {
	public AppleBushFeature() {
		super(SimpleRandomFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<SimpleRandomFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!AppleBushGenConditionProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
