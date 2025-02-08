package net.mcreator.cookingwithmindthemoods.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class PlantriceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.BUBBLE_COLUMN || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER)
				&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ROOTED_DIRT || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIRT
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SOUL_SAND
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.RED_SAND || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MUD
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CLAY)) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("cooking_with_mindthemoods", "small_rice_plant"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
							3);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.crop.plant")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.crop.plant")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if ((entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) == false) {
				itemstack.shrink(1);
			}
		}
	}
}
