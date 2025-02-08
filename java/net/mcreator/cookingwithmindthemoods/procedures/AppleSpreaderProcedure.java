package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModBlocks;

public class AppleSpreaderProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -4;
		found = false;
		for (int index0 = 0; index0 < 9; index0++) {
			sy = 0;
			for (int index1 = 0; index1 < 6; index1++) {
				sz = -4;
				for (int index2 = 0; index2 < 9; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + 5 + sy, z + sz))).getBlock() == Blocks.OAK_LEAVES && Math.random() < 0.14) {
						if (Math.random() < 0.2) {
							{
								BlockPos _bp = BlockPos.containing(x + sx, y + 5 + sy, z + sz);
								BlockState _bs = CookingWithMindthemoodsModBlocks.APPLE_BLOSSOMS_MATURE.get().defaultBlockState();
								BlockState _bso = world.getBlockState(_bp);
								for (Property<?> _propertyOld : _bso.getProperties()) {
									Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
									if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
										try {
											_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
										} catch (Exception e) {
										}
								}
								world.setBlock(_bp, _bs, 3);
							}
						} else if (Math.random() < 0.5) {
							{
								BlockPos _bp = BlockPos.containing(x + sx, y + 5 + sy, z + sz);
								BlockState _bs = CookingWithMindthemoodsModBlocks.APPLE_BLOSSOMS_STAGE_3.get().defaultBlockState();
								BlockState _bso = world.getBlockState(_bp);
								for (Property<?> _propertyOld : _bso.getProperties()) {
									Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
									if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
										try {
											_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
										} catch (Exception e) {
										}
								}
								world.setBlock(_bp, _bs, 3);
							}
						} else {
							{
								BlockPos _bp = BlockPos.containing(x + sx, y + 5 + sy, z + sz);
								BlockState _bs = CookingWithMindthemoodsModBlocks.APPLE_BLOSSOMS_STAGE_2.get().defaultBlockState();
								BlockState _bso = world.getBlockState(_bp);
								for (Property<?> _propertyOld : _bso.getProperties()) {
									Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
									if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
										try {
											_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
										} catch (Exception e) {
										}
								}
								world.setBlock(_bp, _bs, 3);
							}
						}
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		return true;
	}
}
