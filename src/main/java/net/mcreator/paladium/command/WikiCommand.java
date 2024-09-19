
package net.mcreator.paladium.command;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterClientCommandsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.commands.Commands;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class WikiCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterClientCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("wiki")

		);
	}
}
