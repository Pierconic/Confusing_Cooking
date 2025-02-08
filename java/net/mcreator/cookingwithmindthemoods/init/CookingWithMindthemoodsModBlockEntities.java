
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cookingwithmindthemoods.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.cookingwithmindthemoods.block.entity.CookingtableBlockEntity;
import net.mcreator.cookingwithmindthemoods.block.entity.CheeseWheelBlockEntity;
import net.mcreator.cookingwithmindthemoods.block.entity.AncientCheeseWheelBlockEntity;
import net.mcreator.cookingwithmindthemoods.block.entity.AgedCheeseWheelBlockEntity;
import net.mcreator.cookingwithmindthemoods.CookingWithMindthemoodsMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CookingWithMindthemoodsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, CookingWithMindthemoodsMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> COOKINGTABLE = register("cookingtable", CookingWithMindthemoodsModBlocks.COOKINGTABLE, CookingtableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> CHEESE_WHEEL = register("cheese_wheel", CookingWithMindthemoodsModBlocks.CHEESE_WHEEL, CheeseWheelBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> AGED_CHEESE_WHEEL = register("aged_cheese_wheel", CookingWithMindthemoodsModBlocks.AGED_CHEESE_WHEEL, AgedCheeseWheelBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ANCIENT_CHEESE_WHEEL = register("ancient_cheese_wheel", CookingWithMindthemoodsModBlocks.ANCIENT_CHEESE_WHEEL, AncientCheeseWheelBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, COOKINGTABLE.get(), (blockEntity, side) -> ((CookingtableBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CHEESE_WHEEL.get(), (blockEntity, side) -> ((CheeseWheelBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, AGED_CHEESE_WHEEL.get(), (blockEntity, side) -> ((AgedCheeseWheelBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANCIENT_CHEESE_WHEEL.get(), (blockEntity, side) -> ((AncientCheeseWheelBlockEntity) blockEntity).getItemHandler());
	}
}
