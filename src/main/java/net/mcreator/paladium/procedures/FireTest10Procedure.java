package net.mcreator.paladium.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.paladium.network.PaladiumModVariables;

public class FireTest10Procedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean test = false;
		if (PaladiumModVariables.MapVariables.get(world).animation == 11 && new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "aminFlamme")) {
			test = true;
		} else {
			test = false;
		}
		return test;
	}
}
