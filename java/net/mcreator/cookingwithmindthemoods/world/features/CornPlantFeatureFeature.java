
package net.mcreator.cookingwithmindthemoods.world.features;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.mcreator.cookingwithmindthemoods.world.features.configurations.StructureFeatureConfiguration;
import net.mcreator.cookingwithmindthemoods.procedures.CornPatchSpreadProcedure;

public class CornPlantFeatureFeature extends StructureFeature {
	public CornPlantFeatureFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!CornPatchSpreadProcedure.execute(world, x, z))
			return false;
		return super.place(context);
	}
}
