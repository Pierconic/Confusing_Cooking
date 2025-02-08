package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModBlocks;
import net.mcreator.cookingwithmindthemoods.CookingWithMindthemoodsMod;

import java.util.List;
import java.util.Comparator;

public class BristleSproutPoofProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.BRISTLESPROUT_OPEN_1.get()) {
			CookingWithMindthemoodsMod.queueServerWork(6, () -> {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.BRISTLESPROUT_OPEN_1.get()) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.POOF, (x + 0.5), (y + 1.85), (z + 0.5), 5, 0.2, 0.2, 0.2, 0.1);
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("cooking_with_mindthemoods", "bristlesprout_o2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
									3);
						}
					}
					CookingWithMindthemoodsMod.queueServerWork(6, () -> {
						if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CookingWithMindthemoodsModBlocks.BRISTLESPROUT_OPEN_2.get()) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.POOF, (x + 0.5), (y + 1.85), (z + 0.5), 5, 0.2, 0.2, 0.2, 0.1);
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("cooking_with_mindthemoods", "bristlesprout_o3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof LivingEntity) {
										if ((entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.MOVEMENT_SPEED) ? _livEnt.getEffect(MobEffects.MOVEMENT_SPEED).getDuration() : 0) < 1200) {
											if (entityiterator instanceof LivingEntity _entity)
												_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
										}
										if ((entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.SLOW_FALLING) ? _livEnt.getEffect(MobEffects.SLOW_FALLING).getDuration() : 0) < 1200) {
											if (entityiterator instanceof LivingEntity _entity)
												_entity.removeEffect(MobEffects.SLOW_FALLING);
										}
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0));
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1200, 0));
									}
								}
							}
						}
					});
				}
			});
		}
	}
}
