package net.mcreator.cookingwithmindthemoods.procedures;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class AncientPlantsTriggerProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity) {
			if ((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == Blocks.TORCHFLOWER) {
				world.setBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), CookingWithMindthemoodsModBlocks.TORCHFLOWER_OPEN_1.get().defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.big_dripleaf.break")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.big_dripleaf.break")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == Blocks.PITCHER_PLANT
					&& world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 1, entity.getZ())).canOcclude()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.big_dripleaf.break")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.big_dripleaf.break")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				world.setBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), Blocks.AIR.defaultBlockState(), 3);
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("cooking_with_mindthemoods", "pitcherplant_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == CookingWithMindthemoodsModBlocks.BRISTLESPROUT_6.get()
					&& world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 1, entity.getZ())).canOcclude()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.big_dripleaf.break")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.big_dripleaf.break")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				world.setBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), Blocks.AIR.defaultBlockState(), 3);
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("cooking_with_mindthemoods", "bristlesprout_o1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		}
	}
}
