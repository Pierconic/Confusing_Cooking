package net.mcreator.cookingwithmindthemoods.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerWakeUpEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import net.mcreator.cookingwithmindthemoods.network.CookingWithMindthemoodsModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class NutritionresetProcedure {
	@SubscribeEvent
	public static void onEntityEndSleep(PlayerWakeUpEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition >= 8 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition < 16) {
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.nutrition = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition - 2;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition >= 16) {
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.nutrition = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition - 4;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition <= -8 && entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition > -16) {
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.nutrition = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition + 2;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition <= -16) {
			{
				CookingWithMindthemoodsModVariables.PlayerVariables _vars = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES);
				_vars.nutrition = entity.getData(CookingWithMindthemoodsModVariables.PLAYER_VARIABLES).nutrition + 4;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
