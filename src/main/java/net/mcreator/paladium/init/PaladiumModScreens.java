
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paladium.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.paladium.client.gui.PaladiumLuckyBlockGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PaladiumModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PaladiumModMenus.PALADIUM_LUCKY_BLOCK_GUI.get(), PaladiumLuckyBlockGuiScreen::new);
		});
	}
}
