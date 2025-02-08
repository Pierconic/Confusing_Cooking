
package net.mcreator.cookingwithmindthemoods.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.NoOpFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.mcreator.cookingwithmindthemoods.procedures.RiceGenerationConditionsProcedure;

public class TallRiceFeatureFeature extends NoOpFeature {
	public TallRiceFeatureFeature() {
		super(NoneFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!RiceGenerationConditionsProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
