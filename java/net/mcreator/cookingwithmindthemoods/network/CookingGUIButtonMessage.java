
package net.mcreator.cookingwithmindthemoods.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.cookingwithmindthemoods.world.inventory.CookingGUIMenu;
import net.mcreator.cookingwithmindthemoods.procedures.ToggleRecipeBookProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.SearchrecipesProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.PreviousSlideProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.NextSlideProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ButtonFPressedProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ButtonEpressedProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ButtonDPressedProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ButtonCPressedProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ButtonBPressedProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ButtonAPressedProcedure;
import net.mcreator.cookingwithmindthemoods.CookingWithMindthemoodsMod;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record CookingGUIButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<CookingGUIButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(CookingWithMindthemoodsMod.MODID, "cooking_gui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, CookingGUIButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, CookingGUIButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new CookingGUIButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<CookingGUIButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final CookingGUIButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = CookingGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			SearchrecipesProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			ToggleRecipeBookProcedure.execute(entity);
		}
		if (buttonID == 2) {

			ButtonBPressedProcedure.execute(entity);
		}
		if (buttonID == 3) {

			ButtonAPressedProcedure.execute(entity);
		}
		if (buttonID == 4) {

			ButtonCPressedProcedure.execute(entity);
		}
		if (buttonID == 5) {

			ButtonDPressedProcedure.execute(entity);
		}
		if (buttonID == 6) {

			ButtonEpressedProcedure.execute(entity);
		}
		if (buttonID == 7) {

			ButtonFPressedProcedure.execute(entity);
		}
		if (buttonID == 8) {

			PreviousSlideProcedure.execute(entity);
		}
		if (buttonID == 9) {

			NextSlideProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CookingWithMindthemoodsMod.addNetworkMessage(CookingGUIButtonMessage.TYPE, CookingGUIButtonMessage.STREAM_CODEC, CookingGUIButtonMessage::handleData);
	}
}
