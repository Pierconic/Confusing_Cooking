package net.mcreator.cookingwithmindthemoods.procedures;

import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModItems;

import javax.annotation.Nullable;

import java.util.Collections;

@EventBusSubscriber
public class GiveSushiRecipesProcedure {
	@SubscribeEvent
	public static void onUseItemStart(LivingEntityUseItemEvent.Start event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity(), event.getItem());
		}
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == CookingWithMindthemoodsModItems.SINGLE_SUSHI.get()) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("cooking_with_mindthemoods:sushi_assemble_2")));
		}
		if (itemstack.getItem() == CookingWithMindthemoodsModItems.SINGLE_VEGGIE_SUSHI.get()) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("cooking_with_mindthemoods:veggie_sushi_assemble_2")));
		}
		if (itemstack.getItem() == CookingWithMindthemoodsModItems.SINGLE_FISH_SUSHI.get()) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("cooking_with_mindthemoods:fish_sushi_assemble_2")));
		}
	}
}
