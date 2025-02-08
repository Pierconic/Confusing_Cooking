
package net.mcreator.cookingwithmindthemoods.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.neoforged.neoforge.client.event.ScreenEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.cookingwithmindthemoods.procedures.VeggieHungerBarCheckProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.VeggieHalfCheckProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.SweetHungerBarCheckProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.SweetHalfCheckProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.NeutralHungerBarCheckProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.NeutralHalfCheckProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.MeatHungerBarCheckProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.MeatHalfCheckProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.FruitHungerBarCheckProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.FruitHalfCheckProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.FishHungerBarCheckProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.FishHalfCheckProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayWorstNutritionProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayTerribleNutritionProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayNeutralNutritionProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayGreatNutritionProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayGoodNutritionProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayBestNutritionProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayBadNutritionProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.AncientHungerBarCheckProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.AncientHalfCheckProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@EventBusSubscriber({Dist.CLIENT})
public class NutritionOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void eventHandler(ScreenEvent.Render.Post event) {
		if (event.getScreen() instanceof InventoryScreen) {
			int w = event.getGuiGraphics().guiWidth();
			int h = event.getGuiGraphics().guiHeight();
			Level world = null;
			double x = 0;
			double y = 0;
			double z = 0;
			Player entity = Minecraft.getInstance().player;
			if (entity != null) {
				world = entity.level();
				x = entity.getX();
				y = entity.getY();
				z = entity.getZ();
			}
			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.enableBlend();
			RenderSystem.setShader(GameRenderer::getPositionTexShader);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.setShaderColor(1, 1, 1, 1);
			if (true) {
				if (DisplayNeutralNutritionProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/nutritionneutral.png"), w / 2 + -10, h / 2 + -44, 0, 0, 15, 19, 15, 19);
				}
				if (DisplayGoodNutritionProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/nutritiongood.png"), w / 2 + -10, h / 2 + -44, 0, 0, 15, 19, 15, 19);
				}
				if (DisplayGreatNutritionProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/nutritiongreat.png"), w / 2 + -10, h / 2 + -44, 0, 0, 15, 19, 15, 19);
				}
				if (DisplayBestNutritionProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/nutritionbest.png"), w / 2 + -10, h / 2 + -44, 0, 0, 15, 19, 15, 19);
				}
				if (DisplayBadNutritionProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/nutritionbad.png"), w / 2 + -10, h / 2 + -44, 0, 0, 15, 19, 15, 19);
				}
				if (DisplayTerribleNutritionProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/nutritionterrible.png"), w / 2 + -10, h / 2 + -44, 0, 0, 15, 19, 15, 19);
				}
				if (DisplayWorstNutritionProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/nutritionworst.png"), w / 2 + -10, h / 2 + -44, 0, 0, 15, 19, 15, 19);
				}
				if (NeutralHungerBarCheckProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/neutral_full.png"), w / 2 + -7, h / 2 + -54, 0, 0, 9, 9, 9, 9);
				}
				if (NeutralHalfCheckProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/neutral_half.png"), w / 2 + -7, h / 2 + -64, 0, 0, 9, 9, 9, 9);
				}
				if (FishHungerBarCheckProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/fish_full.png"), w / 2 + -7, h / 2 + -54, 0, 0, 9, 9, 9, 9);
				}
				if (FishHalfCheckProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/fish_half.png"), w / 2 + -7, h / 2 + -64, 0, 0, 9, 9, 9, 9);
				}
				if (FruitHungerBarCheckProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/fruit_full.png"), w / 2 + -7, h / 2 + -54, 0, 0, 9, 9, 9, 9);
				}
				if (FruitHalfCheckProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/fruit_half.png"), w / 2 + -7, h / 2 + -64, 0, 0, 9, 9, 9, 9);
				}
				if (SweetHungerBarCheckProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/sweet_full.png"), w / 2 + -7, h / 2 + -54, 0, 0, 9, 9, 9, 9);
				}
				if (SweetHalfCheckProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/sweet_half.png"), w / 2 + -7, h / 2 + -64, 0, 0, 9, 9, 9, 9);
				}
				if (VeggieHungerBarCheckProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/vegetable_full.png"), w / 2 + -7, h / 2 + -54, 0, 0, 9, 9, 9, 9);
				}
				if (VeggieHalfCheckProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/vegetable_half.png"), w / 2 + -7, h / 2 + -64, 0, 0, 9, 9, 9, 9);
				}
				if (MeatHungerBarCheckProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/meat_full.png"), w / 2 + -7, h / 2 + -54, 0, 0, 9, 9, 9, 9);
				}
				if (MeatHalfCheckProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/meat_half.png"), w / 2 + -7, h / 2 + -64, 0, 0, 9, 9, 9, 9);
				}
				if (AncientHungerBarCheckProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/ancient_full.png"), w / 2 + -7, h / 2 + -54, 0, 0, 16, 16, 16, 16);
				}
				if (AncientHalfCheckProcedure.execute(entity)) {
					event.getGuiGraphics().blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/ancient_half.png"), w / 2 + -7, h / 2 + -64, 0, 0, 16, 16, 16, 16);
				}
			}
			RenderSystem.depthMask(true);
			RenderSystem.defaultBlendFunc();
			RenderSystem.enableDepthTest();
			RenderSystem.disableBlend();
			RenderSystem.setShaderColor(1, 1, 1, 1);
		}
	}
}
