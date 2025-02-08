package net.mcreator.cookingwithmindthemoods.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModBlocks;

public class DispenserBlossomHarvestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean success = false;
		success = false;
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.DISPENSER && (new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				else if (_bs.hasProperty(BlockStateProperties.AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(BlockPos.containing(x + 1, y, z))) == Direction.WEST && world instanceof Level _level4 && _level4.hasNeighborSignal(BlockPos.containing(x + 1, y, z))) {
			if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x + 1, y, z), 0)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + 1, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 0;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x + 1, y, z), 1)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + 1, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 1;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x + 1, y, z), 2)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + 1, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 2;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x + 1, y, z), 3)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + 1, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 3;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x + 1, y, z), 4)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + 1, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 4;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x + 1, y, z), 5)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + 1, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 5;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x + 1, y, z), 6)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + 1, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 6;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x + 1, y, z), 7)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + 1, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 7;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x + 1, y, z), 8)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + 1, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 8;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			}
			if (success == true) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x - 0.5), (y + 0.5), (z + 0.5), new ItemStack(Items.APPLE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.APPLE_BLOSSOMS_STAGE_1.get().defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.crop.break")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.crop.break")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.DISPENSER && (new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				else if (_bs.hasProperty(BlockStateProperties.AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(BlockPos.containing(x - 1, y, z))) == Direction.EAST && world instanceof Level _level39 && _level39.hasNeighborSignal(BlockPos.containing(x - 1, y, z))) {
			if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x - 1, y, z), 0)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x - 1, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 0;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x - 1, y, z), 1)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x - 1, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 1;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x - 1, y, z), 2)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x - 1, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 2;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x - 1, y, z), 3)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x - 1, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 3;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x - 1, y, z), 4)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x - 1, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 4;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x - 1, y, z), 5)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x - 1, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 5;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x - 1, y, z), 6)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x - 1, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 6;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x - 1, y, z), 7)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x - 1, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 7;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x - 1, y, z), 8)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x - 1, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 8;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			}
			if (success == true) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 1.5), (y + 0.5), (z + 0.5), new ItemStack(Items.APPLE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.APPLE_BLOSSOMS_STAGE_1.get().defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.crop.break")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.crop.break")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.DISPENSER && (new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				else if (_bs.hasProperty(BlockStateProperties.AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(BlockPos.containing(x, y, z - 1))) == Direction.SOUTH && world instanceof Level _level74 && _level74.hasNeighborSignal(BlockPos.containing(x, y, z - 1))) {
			if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z - 1), 0)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z - 1), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 0;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z - 1), 1)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z - 1), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 1;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z - 1), 2)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z - 1), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 2;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z - 1), 3)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z - 1), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 3;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z - 1), 4)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z - 1), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 4;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z - 1), 5)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z - 1), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 5;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z - 1), 6)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z - 1), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 6;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z - 1), 7)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z - 1), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 7;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z - 1), 8)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z - 1), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 8;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			}
			if (success == true) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 1.5), new ItemStack(Items.APPLE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.APPLE_BLOSSOMS_STAGE_1.get().defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.crop.break")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.crop.break")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.DISPENSER && (new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				else if (_bs.hasProperty(BlockStateProperties.AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(BlockPos.containing(x, y, z + 1))) == Direction.NORTH && world instanceof Level _level109 && _level109.hasNeighborSignal(BlockPos.containing(x, y, z + 1))) {
			if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z + 1), 0)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z + 1), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 0;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z + 1), 1)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z + 1), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 1;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z + 1), 2)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z + 1), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 2;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z + 1), 3)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z + 1), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 3;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z + 1), 4)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z + 1), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 4;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z + 1), 5)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z + 1), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 5;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z + 1), 6)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z + 1), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 6;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z + 1), 7)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z + 1), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 7;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z + 1), 8)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z + 1), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 8;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			}
			if (success == true) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z - 0.5), new ItemStack(Items.APPLE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.APPLE_BLOSSOMS_STAGE_1.get().defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.crop.break")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.crop.break")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.DISPENSER && (new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				else if (_bs.hasProperty(BlockStateProperties.AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(BlockPos.containing(x, y + 1, z))) == Direction.DOWN && world instanceof Level _level144 && _level144.hasNeighborSignal(BlockPos.containing(x, y + 1, z))) {
			if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y + 1, z), 0)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y + 1, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 0;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y + 1, z), 1)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y + 1, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 1;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y + 1, z), 2)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y + 1, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 2;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y + 1, z), 3)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y + 1, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 3;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y + 1, z), 4)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y + 1, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 4;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y + 1, z), 5)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y + 1, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 5;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y + 1, z), 6)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y + 1, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 6;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y + 1, z), 7)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y + 1, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 7;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y + 1, z), 8)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y + 1, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 8;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			}
			if (success == true) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y - 0.5), (z + 0.5), new ItemStack(Items.APPLE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.APPLE_BLOSSOMS_STAGE_1.get().defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.crop.break")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.crop.break")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DISPENSER && (new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				else if (_bs.hasProperty(BlockStateProperties.AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(BlockPos.containing(x, y - 1, z))) == Direction.UP && world instanceof Level _level179 && _level179.hasNeighborSignal(BlockPos.containing(x, y - 1, z))) {
			if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y - 1, z), 0)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y - 1, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 0;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y - 1, z), 1)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y - 1, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 1;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y - 1, z), 2)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y - 1, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 2;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y - 1, z), 3)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y - 1, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 3;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y - 1, z), 4)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y - 1, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 4;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y - 1, z), 5)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y - 1, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 5;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y - 1, z), 6)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y - 1, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 6;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y - 1, z), 7)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y - 1, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 7;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y - 1, z), 8)).getItem() == Items.SHEARS) {
				success = true;
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y - 1, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 8;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
			}
			if (success == true) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 1.5), (z + 0.5), new ItemStack(Items.APPLE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				world.setBlock(BlockPos.containing(x, y, z), CookingWithMindthemoodsModBlocks.APPLE_BLOSSOMS_STAGE_1.get().defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.crop.break")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.crop.break")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
	}
}
