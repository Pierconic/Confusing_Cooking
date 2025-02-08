package net.mcreator.cookingwithmindthemoods.procedures;

import net.neoforged.neoforge.event.entity.player.ItemEntityPickupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.cookingwithmindthemoods.init.CookingWithMindthemoodsModItems;

import javax.annotation.Nullable;

import java.util.Collections;

@EventBusSubscriber
public class GivecheeserecipeProcedure {
	@SubscribeEvent
	public static void onPickup(ItemEntityPickupEvent.Pre event) {
		execute(event, event.getPlayer(), event.getItemEntity().getItem());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.MILK_BUCKET) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("cooking_with_mindthemoods:cheese_wheel_recipe")));
		}
		if (itemstack.getItem() == CookingWithMindthemoodsModItems.CHEESE.get()) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("cooking_with_mindthemoods:cheese_wheel_assemble")));
		}
		if (itemstack.getItem() == CookingWithMindthemoodsModItems.AGED_CHEESE.get()) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("cooking_with_mindthemoods:aged_cheese_wheel_assemble")));
		}
		if (itemstack.getItem() == CookingWithMindthemoodsModItems.ANCIENT_CHEESE.get()) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("cooking_with_mindthemoods:ancient_cheese_wheel_assemble")));
		}
		if (itemstack.getItem() == CookingWithMindthemoodsModItems.MOLDY_CHEESE.get()) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("cooking_with_mindthemoods:moldy_cheese_wheel_assemble")));
		}
	}
}
