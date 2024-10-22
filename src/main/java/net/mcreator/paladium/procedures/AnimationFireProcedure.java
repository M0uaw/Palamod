package net.mcreator.paladium.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.paladium.network.PaladiumModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AnimationFireProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (PaladiumModVariables.MapVariables.get(world).animation < 13) {
			PaladiumModVariables.MapVariables.get(world).animation = PaladiumModVariables.MapVariables.get(world).animation + 1;
			PaladiumModVariables.MapVariables.get(world).syncData(world);
		} else {
			PaladiumModVariables.MapVariables.get(world).animation = 1;
			PaladiumModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
