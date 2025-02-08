
package net.mcreator.cookingwithmindthemoods.block;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.InteractionResult;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.procedures.BristlesproutGrowthProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.Bristlesprout1PlantBonemealProcedure;

public class Bristlesprout5Block extends DoublePlantBlock {
	public Bristlesprout5Block() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.GRASS).randomTicks().sound(SoundType.GRASS).instabreak().noCollission().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public PathType getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return PathType.OPEN;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	private boolean canPlantTypeSurvive(BlockState state, LevelReader world, BlockPos pos) {
		return state.is(Blocks.FARMLAND);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader world, BlockPos pos) {
		BlockPos posbelow = pos.below();
		BlockState statebelow = world.getBlockState(posbelow);
		if (blockstate.getValue(HALF) != DoubleBlockHalf.UPPER) {
			if (blockstate.getBlock() == this)
				return this.canPlantTypeSurvive(statebelow, world, posbelow);
			return this.mayPlaceOn(statebelow, world, posbelow);
		} else {
			return statebelow.is(this) && statebelow.getValue(HALF) == DoubleBlockHalf.LOWER;
		}
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		BristlesproutGrowthProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		Bristlesprout1PlantBonemealProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate, entity);
		return InteractionResult.SUCCESS;
	}
}
