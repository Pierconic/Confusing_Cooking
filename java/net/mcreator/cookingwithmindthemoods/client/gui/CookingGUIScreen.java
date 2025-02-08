package net.mcreator.cookingwithmindthemoods.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cookingwithmindthemoods.world.inventory.CookingGUIMenu;
import net.mcreator.cookingwithmindthemoods.procedures.WholegrainbreadRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.VeggieTacoRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.VeggieSushiRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.VeggieSkewerDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.VeggieSandwichRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.TortillaRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.TastysandwichDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.TartRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.SyrupRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.SweetbreadRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.SweetJamDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.SuspiciousStewRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.SuspiciousSkewerDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.SushiRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.SuperVeggieSandwichRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.SuperMeatSandwichRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.SuperFishSandwichDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.SuperChocolateBreadRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.StrangeStewDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.StrangeSkewerDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.StickybreadRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.SimmeredFruitDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ShowPreviousButtonProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ShowNextButtonProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ShowButtonFProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ShowButtonEProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ShowButtonDProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ShowButtonCProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ShowButtonBProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ShowButtonAProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.SeafoodDinnerDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.SauceDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.RabbitStewDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.PotatoStewDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.PieRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.NutBreadRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.NutBarRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.MushroomStewDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.MeatTacoRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.MeatSkewerDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.MeatSandwichRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.LoadedPotatoRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.LoadedMushroomDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.HummusDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.HardCandyDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.GrilledcheeseRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.FruitSkewerDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.FishTacoRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.FishSushiRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.FishSkewerDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.FishSandwichRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.FieryDinnerDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ExtraSweetBreadRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ExtraStickybreadRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayTab9Procedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayTab9BProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayTab7Procedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayTab6Procedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayTab5Procedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayTab4Procedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayTab3Procedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayTab2Procedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayTab1Procedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayTab11Procedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayTab10Procedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayTab0Procedure;
import net.mcreator.cookingwithmindthemoods.procedures.DisplayTab0BProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.DillDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.DIsplayTab8Procedure;
import net.mcreator.cookingwithmindthemoods.procedures.CrispRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.CornbreadRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.CookieRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ChocolatebreadRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ChocolateRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ChocolateDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.ChickenDinnerDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.CarrotbreadRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.CarrotbreadDeluxeRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.BreadRecipeDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.BeetrootStewDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.BeefStewDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.AncientStewDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.AncientSkewerDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.procedures.AncientJellyDisplayProcedure;
import net.mcreator.cookingwithmindthemoods.network.CookingGUIButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CookingGUIScreen extends AbstractContainerScreen<CookingGUIMenu> {
	private final static HashMap<String, Object> guistate = CookingGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_prepare;
	ImageButton imagebutton_guirecipebookoff;
	ImageButton imagebutton_buttontab1;
	ImageButton imagebutton_buttontab3;
	ImageButton imagebutton_buttontab2;
	ImageButton imagebutton_buttontab4;
	ImageButton imagebutton_buttontab5;
	ImageButton imagebutton_buttontab6;
	ImageButton imagebutton_arrowleftup;
	ImageButton imagebutton_arrowrightup;

	public CookingGUIScreen(CookingGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/cooking_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/arrow.png"), this.leftPos + 121, this.topPos + 25, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/longarrow.png"), this.leftPos + 77, this.topPos + 27, 0, 0, 16, 32, 16, 32);

		if (DisplayTab0Procedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/tab1page1.png"), this.leftPos + -120, this.topPos + -29, 0, 0, 120, 230, 120, 230);
		}
		if (DisplayTab1Procedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/tab2page1.png"), this.leftPos + -120, this.topPos + -29, 0, 0, 120, 230, 120, 230);
		}
		if (DisplayTab2Procedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/tab2page2.png"), this.leftPos + -120, this.topPos + -29, 0, 0, 120, 230, 120, 230);
		}
		if (DisplayTab3Procedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/tab2page3.png"), this.leftPos + -120, this.topPos + -29, 0, 0, 120, 230, 120, 230);
		}
		if (DisplayTab4Procedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/tab2page4.png"), this.leftPos + -120, this.topPos + -29, 0, 0, 120, 230, 120, 230);
		}
		if (DisplayTab5Procedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/tab3page1.png"), this.leftPos + -120, this.topPos + -29, 0, 0, 120, 230, 120, 230);
		}
		if (DisplayTab6Procedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/tab3page2.png"), this.leftPos + -120, this.topPos + -29, 0, 0, 120, 230, 120, 230);
		}
		if (DisplayTab7Procedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/tab4page1.png"), this.leftPos + -120, this.topPos + -29, 0, 0, 120, 230, 120, 230);
		}
		if (DIsplayTab8Procedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/tab4page2.png"), this.leftPos + -120, this.topPos + -29, 0, 0, 120, 230, 120, 230);
		}
		if (DisplayTab9Procedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/tab5page1.png"), this.leftPos + -120, this.topPos + -29, 0, 0, 120, 230, 120, 230);
		}
		if (DisplayTab10Procedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/tab6page1.png"), this.leftPos + -120, this.topPos + -29, 0, 0, 120, 230, 120, 230);
		}
		if (DisplayTab11Procedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/tab6page2.png"), this.leftPos + -120, this.topPos + -29, 0, 0, 120, 230, 120, 230);
		}

		guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/guicons.png"), this.leftPos + 24, this.topPos + 52, 0, 0, 80, 16, 80, 16);

		if (MeatSkewerDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/meatskewercomplete.png"), this.leftPos + -109, this.topPos + 8, 0, 0, 96, 26, 96, 26);
		}
		if (FishSkewerDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/fishskewercomplete.png"), this.leftPos + -109, this.topPos + 34, 0, 0, 96, 26, 96, 26);
		}
		if (FruitSkewerDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/fruitskewercomplete.png"), this.leftPos + -109, this.topPos + 60, 0, 0, 96, 26, 96, 26);
		}
		if (VeggieSkewerDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/veggieskewercomplete.png"), this.leftPos + -109, this.topPos + 86, 0, 0, 96, 26, 96, 26);
		}
		if (StrangeSkewerDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/strangeskewercomplete.png"), this.leftPos + -109, this.topPos + 112, 0, 0, 96, 26, 96, 26);
		}
		if (MeatSandwichRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/meatsandwichcomplete.png"), this.leftPos + -109, this.topPos + 8, 0, 0, 96, 26, 96, 26);
		}
		if (FishSandwichRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/fishsandwichcomplete.png"), this.leftPos + -109, this.topPos + 34, 0, 0, 96, 26, 96, 26);
		}
		if (VeggieSandwichRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/veggiesandwichcomplete.png"), this.leftPos + -109, this.topPos + 60, 0, 0, 96, 26, 96, 26);
		}
		if (GrilledcheeseRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/grilledcheesecomplete.png"), this.leftPos + -109, this.topPos + 86, 0, 0, 96, 26, 96, 26);
		}
		if (TastysandwichDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/tastysandwichcomplete.png"), this.leftPos + -109, this.topPos + 112, 0, 0, 96, 26, 96, 26);
		}
		if (CarrotbreadRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/carrotbreadcomplete.png"), this.leftPos + -109, this.topPos + 8, 0, 0, 96, 26, 96, 26);
		}
		if (SweetbreadRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/sweetbreadcomplete.png"), this.leftPos + -109, this.topPos + 34, 0, 0, 96, 26, 96, 26);
		}
		if (ChocolatebreadRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/slightlychocolatebreadcomplete.png"), this.leftPos + -109, this.topPos + 60, 0, 0, 96, 26, 96, 26);
		}
		if (StickybreadRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/slightlystickybreadcomplete.png"), this.leftPos + -109, this.topPos + 86, 0, 0, 96, 26, 96, 26);
		}
		if (WholegrainbreadRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/wholegrainbreadcomplete.png"), this.leftPos + -109, this.topPos + 112, 0, 0, 96, 26, 96, 26);
		}
		if (SuperMeatSandwichRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/supermeatsandwichcomplete.png"), this.leftPos + -109, this.topPos + 8, 0, 0, 96, 26, 96, 26);
		}
		if (SuperFishSandwichDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/superfishsandwichcomplete.png"), this.leftPos + -109, this.topPos + 34, 0, 0, 96, 26, 96, 26);
		}
		if (SuperVeggieSandwichRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/superveggiesandwichcomplete.png"), this.leftPos + -109, this.topPos + 60, 0, 0, 96, 26, 96, 26);
		}
		if (CarrotbreadDeluxeRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/carrotbreaddeluxecomplete.png"), this.leftPos + -109, this.topPos + 86, 0, 0, 96, 26, 96, 26);
		}
		if (ExtraSweetBreadRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/extrasweetbreadcomplete.png"), this.leftPos + -109, this.topPos + 112, 0, 0, 96, 26, 96, 26);
		}
		if (SuperChocolateBreadRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/superchocolatebreadcomplete.png"), this.leftPos + -109, this.topPos + 8, 0, 0, 96, 26, 96, 26);
		}
		if (ExtraStickybreadRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/extremelystickybreadcomplete.png"), this.leftPos + -109, this.topPos + 34, 0, 0, 96, 26, 96, 26);
		}
		if (NutBreadRecipeDisplayProcedure.execute(world, entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/nutbreadcomplete.png"), this.leftPos + -109, this.topPos + 60, 0, 0, 96, 26, 96, 26);
		}
		if (DisplayTab9BProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/tab5page2.png"), this.leftPos + -120, this.topPos + -29, 0, 0, 120, 230, 120, 230);
		}
		if (ChickenDinnerDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/chickendinnercomplete.png"), this.leftPos + -109, this.topPos + 34, 0, 0, 96, 26, 96, 26);
		}
		if (FieryDinnerDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/fieryfiletcomplete.png"), this.leftPos + -109, this.topPos + 8, 0, 0, 96, 26, 96, 26);
		}
		if (SeafoodDinnerDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/seafooddinnercomplete.png"), this.leftPos + -109, this.topPos + 60, 0, 0, 96, 26, 96, 26);
		}
		if (LoadedMushroomDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/stuffedmushroomscomplete.png"), this.leftPos + -109, this.topPos + 86, 0, 0, 96, 26, 96, 26);
		}
		if (SushiRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/sushicomplete.png"), this.leftPos + -109, this.topPos + 112, 0, 0, 96, 26, 96, 26);
		}
		if (VeggieSushiRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/veggiesushicomplete.png"), this.leftPos + -109, this.topPos + 8, 0, 0, 96, 26, 96, 26);
		}
		if (FishSushiRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/fishsushicomplete.png"), this.leftPos + -109, this.topPos + 34, 0, 0, 96, 26, 96, 26);
		}
		if (BeetrootStewDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/beetrootsoupcomplete.png"), this.leftPos + -109, this.topPos + 8, 0, 0, 96, 26, 96, 26);
		}
		if (MushroomStewDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/mushroomstewcomplete.png"), this.leftPos + -109, this.topPos + 34, 0, 0, 96, 26, 96, 26);
		}
		if (PotatoStewDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/potatosoupcomplete.png"), this.leftPos + -109, this.topPos + 60, 0, 0, 96, 26, 96, 26);
		}
		if (BeefStewDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/beefstewcomplete.png"), this.leftPos + -109, this.topPos + 112, 0, 0, 96, 26, 96, 26);
		}
		if (SimmeredFruitDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/simmeredfruitcomplete.png"), this.leftPos + -109, this.topPos + 86, 0, 0, 96, 26, 96, 26);
		}
		if (RabbitStewDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/rabbitstewcomplete.png"), this.leftPos + -109, this.topPos + 8, 0, 0, 96, 26, 96, 26);
		}
		if (SuspiciousStewRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/suspiciousstewcomplete.png"), this.leftPos + -109, this.topPos + 34, 0, 0, 96, 26, 96, 26);
		}
		if (SyrupRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/syrupcomplete.png"), this.leftPos + -109, this.topPos + 60, 0, 0, 96, 26, 96, 26);
		}
		if (StrangeStewDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/strangestewcomplete.png"), this.leftPos + -109, this.topPos + 86, 0, 0, 96, 26, 96, 26);
		}
		if (DillDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/dillrelishcomplete.png"), this.leftPos + -109, this.topPos + 34, 0, 0, 96, 26, 96, 26);
		}
		if (SweetJamDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/sweetjamcomplete.png"), this.leftPos + -109, this.topPos + 112, 0, 0, 96, 26, 96, 26);
		}
		if (SauceDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/savorysaucecomplete.png"), this.leftPos + -109, this.topPos + 8, 0, 0, 96, 26, 96, 26);
		}
		if (HummusDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/hummuscomplete.png"), this.leftPos + -109, this.topPos + 60, 0, 0, 96, 26, 96, 26);
		}
		if (ChocolateDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/chocolatesaucecomplete.png"), this.leftPos + -109, this.topPos + 86, 0, 0, 96, 26, 96, 26);
		}
		if (BreadRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/breadcomplete.png"), this.leftPos + -109, this.topPos + 8, 0, 0, 96, 26, 96, 26);
		}
		if (CookieRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/cookiecomplete.png"), this.leftPos + -109, this.topPos + 34, 0, 0, 96, 26, 96, 26);
		}
		if (HardCandyDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/hardcandycomplete.png"), this.leftPos + -109, this.topPos + 60, 0, 0, 96, 26, 96, 26);
		}
		if (ChocolateRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/chocolatecomplete.png"), this.leftPos + -109, this.topPos + 112, 0, 0, 96, 26, 96, 26);
		}
		if (LoadedPotatoRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/loadedpotatocomplete.png"), this.leftPos + -109, this.topPos + 86, 0, 0, 96, 26, 96, 26);
		}
		if (PieRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/piecomplete.png"), this.leftPos + -109, this.topPos + 8, 0, 0, 96, 26, 96, 26);
		}
		if (TartRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/tartcomplete.png"), this.leftPos + -109, this.topPos + 34, 0, 0, 96, 26, 96, 26);
		}
		if (CrispRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/crispcomplete.png"), this.leftPos + -109, this.topPos + 60, 0, 0, 96, 26, 96, 26);
		}
		if (NutBarRecipeDisplayProcedure.execute(world, entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/nutbarcomplete.png"), this.leftPos + -109, this.topPos + 86, 0, 0, 96, 26, 96, 26);
		}
		if (TortillaRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/corntortillacomplete.png"), this.leftPos + -109, this.topPos + 112, 0, 0, 96, 26, 96, 26);
		}
		if (CornbreadRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/cornbreadcomplete.png"), this.leftPos + -109, this.topPos + 86, 0, 0, 96, 26, 96, 26);
		}
		if (DisplayTab0BProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/tab1page2.png"), this.leftPos + -120, this.topPos + -29, 0, 0, 120, 230, 120, 230);
		}
		if (FishTacoRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/fishtacocomplete.png"), this.leftPos + -109, this.topPos + 60, 0, 0, 96, 26, 96, 26);
		}
		if (VeggieTacoRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/veggietacocomplete.png"), this.leftPos + -109, this.topPos + 112, 0, 0, 96, 26, 96, 26);
		}
		if (MeatTacoRecipeDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/meattacocomplete.png"), this.leftPos + -109, this.topPos + 86, 0, 0, 96, 26, 96, 26);
		}
		if (AncientSkewerDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/ancientskewercomplete.png"), this.leftPos + -108, this.topPos + 35, 0, 0, 95, 25, 95, 25);
		}
		if (SuspiciousSkewerDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/suspiciousskewercomplete.png"), this.leftPos + -108, this.topPos + 9, 0, 0, 95, 25, 95, 25);
		}
		if (AncientJellyDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/ancientjamcomplete.png"), this.leftPos + -108, this.topPos + 9, 0, 0, 95, 25, 95, 25);
		}
		if (AncientStewDisplayProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/ancientstewcomplete.png"), this.leftPos + -108, this.topPos + 113, 0, 0, 95, 25, 95, 25);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.cooking_with_mindthemoods.cooking_gui.label_cooking"), 7, 9, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cooking_with_mindthemoods.cooking_gui.label_inventory"), 10, 73, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_prepare = Button.builder(Component.translatable("gui.cooking_with_mindthemoods.cooking_gui.button_prepare"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new CookingGUIButtonMessage(0, x, y, z));
				CookingGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 107, this.topPos + 51, 61, 20).build();
		guistate.put("button:button_prepare", button_prepare);
		this.addRenderableWidget(button_prepare);
		imagebutton_guirecipebookoff = new ImageButton(this.leftPos + 10, this.topPos + 50, 20, 18,
				new WidgetSprites(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/guirecipebookoff.png"), ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/guirecipebookon.png")), e -> {
					if (true) {
						PacketDistributor.sendToServer(new CookingGUIButtonMessage(1, x, y, z));
						CookingGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_guirecipebookoff", imagebutton_guirecipebookoff);
		this.addRenderableWidget(imagebutton_guirecipebookoff);
		imagebutton_buttontab1 = new ImageButton(this.leftPos + -74, this.topPos + -24, 26, 24,
				new WidgetSprites(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/buttontab1.png"), ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/buttontab1.png")), e -> {
					if (ShowButtonBProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CookingGUIButtonMessage(2, x, y, z));
						CookingGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (ShowButtonBProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_buttontab1", imagebutton_buttontab1);
		this.addRenderableWidget(imagebutton_buttontab1);
		imagebutton_buttontab3 = new ImageButton(this.leftPos + -110, this.topPos + -24, 26, 24,
				new WidgetSprites(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/buttontab3.png"), ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/buttontab3.png")), e -> {
					if (ShowButtonAProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CookingGUIButtonMessage(3, x, y, z));
						CookingGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (ShowButtonAProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_buttontab3", imagebutton_buttontab3);
		this.addRenderableWidget(imagebutton_buttontab3);
		imagebutton_buttontab2 = new ImageButton(this.leftPos + -37, this.topPos + -24, 26, 24,
				new WidgetSprites(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/buttontab2.png"), ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/buttontab2.png")), e -> {
					if (ShowButtonCProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CookingGUIButtonMessage(4, x, y, z));
						CookingGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (ShowButtonCProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_buttontab2", imagebutton_buttontab2);
		this.addRenderableWidget(imagebutton_buttontab2);
		imagebutton_buttontab4 = new ImageButton(this.leftPos + -110, this.topPos + 166, 26, 22,
				new WidgetSprites(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/buttontab4.png"), ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/buttontab4.png")), e -> {
					if (ShowButtonDProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CookingGUIButtonMessage(5, x, y, z));
						CookingGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (ShowButtonDProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_buttontab4", imagebutton_buttontab4);
		this.addRenderableWidget(imagebutton_buttontab4);
		imagebutton_buttontab5 = new ImageButton(this.leftPos + -74, this.topPos + 166, 26, 22,
				new WidgetSprites(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/buttontab5.png"), ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/buttontab5.png")), e -> {
					if (ShowButtonEProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CookingGUIButtonMessage(6, x, y, z));
						CookingGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (ShowButtonEProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_buttontab5", imagebutton_buttontab5);
		this.addRenderableWidget(imagebutton_buttontab5);
		imagebutton_buttontab6 = new ImageButton(this.leftPos + -37, this.topPos + 166, 26, 22,
				new WidgetSprites(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/buttontab6.png"), ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/buttontab6.png")), e -> {
					if (ShowButtonFProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CookingGUIButtonMessage(7, x, y, z));
						CookingGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (ShowButtonFProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_buttontab6", imagebutton_buttontab6);
		this.addRenderableWidget(imagebutton_buttontab6);
		imagebutton_arrowleftup = new ImageButton(this.leftPos + -87, this.topPos + 138, 11, 17,
				new WidgetSprites(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/arrowleftup.png"), ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/arrowleftdown.png")), e -> {
					if (ShowPreviousButtonProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CookingGUIButtonMessage(8, x, y, z));
						CookingGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (ShowPreviousButtonProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_arrowleftup", imagebutton_arrowleftup);
		this.addRenderableWidget(imagebutton_arrowleftup);
		imagebutton_arrowrightup = new ImageButton(this.leftPos + -48, this.topPos + 138, 11, 17,
				new WidgetSprites(ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/arrowrightup.png"), ResourceLocation.parse("cooking_with_mindthemoods:textures/screens/arrowrightdown.png")), e -> {
					if (ShowNextButtonProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CookingGUIButtonMessage(9, x, y, z));
						CookingGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (ShowNextButtonProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_arrowrightup", imagebutton_arrowrightup);
		this.addRenderableWidget(imagebutton_arrowrightup);
	}
}
