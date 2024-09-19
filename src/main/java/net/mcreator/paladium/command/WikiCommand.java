
package net.mcreator.paladium.command;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class WikiCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterClientCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("wiki")

				.then(Commands.argument("player", EntityArgument.player()).then(Commands.argument("wiki_de_paladium", StringArgumentType.string()))));
	}

}
