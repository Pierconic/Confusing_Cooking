
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cookingwithmindthemoods.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.cookingwithmindthemoods.world.inventory.CookingGUIMenu;
import net.mcreator.cookingwithmindthemoods.CookingWithMindthemoodsMod;

public class CookingWithMindthemoodsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, CookingWithMindthemoodsMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<CookingGUIMenu>> COOKING_GUI = REGISTRY.register("cooking_gui", () -> IMenuTypeExtension.create(CookingGUIMenu::new));
}
