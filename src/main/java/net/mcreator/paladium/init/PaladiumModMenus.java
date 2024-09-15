
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paladium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.paladium.world.inventory.PaladiumLuckyBlockGuiMenu;
import net.mcreator.paladium.PaladiumMod;

public class PaladiumModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PaladiumMod.MODID);
	public static final RegistryObject<MenuType<PaladiumLuckyBlockGuiMenu>> PALADIUM_LUCKY_BLOCK_GUI = REGISTRY.register("paladium_lucky_block_gui", () -> IForgeMenuType.create(PaladiumLuckyBlockGuiMenu::new));
}
