package net.mcreator.cookingwithmindthemoods.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class CheesetheDragonProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof EnderDragon) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("forge:is_cheesy")))) {
				{
					CookingWithMindthemoodsModVariables.PlayerVariables _vars = sourceentity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
					_vars.chessiness = sourceentity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).chessiness + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else {
				{
					CookingWithMindthemoodsModVariables.PlayerVariables _vars = sourceentity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
					_vars.chessiness = 0;
					_vars.syncPlayerVariables(sourceentity);
				}
			}
		}
	}
}
