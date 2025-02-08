
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cookingwithmindthemoods.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.cookingwithmindthemoods.CookingWithMindthemoodsMod;

public class CookingWithMindthemoodsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, CookingWithMindthemoodsMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> FOODPLACE = REGISTRY.register("foodplace", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("cooking_with_mindthemoods", "foodplace")));
	public static final DeferredHolder<SoundEvent, SoundEvent> PORCELAINPLACED = REGISTRY.register("porcelainplaced", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("cooking_with_mindthemoods", "porcelainplaced")));
	public static final DeferredHolder<SoundEvent, SoundEvent> PLATESHATTER = REGISTRY.register("plateshatter", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("cooking_with_mindthemoods", "plateshatter")));
	public static final DeferredHolder<SoundEvent, SoundEvent> PLATESTEP = REGISTRY.register("platestep", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("cooking_with_mindthemoods", "platestep")));
}
