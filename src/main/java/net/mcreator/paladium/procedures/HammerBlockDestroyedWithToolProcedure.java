package net.mcreator.paladium.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

public class HammerBlockDestroyedWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double CoosX = 0;
		double coosY = 0;
		double CoosZ = 0;
		CoosX = x - 1;
		coosY = y - 1;
		CoosZ = z - 1;
		if (y <= entity.getY() || entity.getXRot() <= -42.5) {
			for (int index0 = 0; index0 < 3; index0++) {
				for (int index1 = 0; index1 < 3; index1++) {
					if (!((world.getBlockState(BlockPos.containing(CoosX, y, CoosZ))).is(BlockTags.create(new ResourceLocation("forge:air")))
							|| (world.getBlockState(BlockPos.containing(CoosX, y, CoosZ))).is(BlockTags.create(new ResourceLocation("minecraft:indestructible"))))) {
						{
							BlockPos _pos = BlockPos.containing(CoosX, y, CoosZ);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(CoosX, y, CoosZ), null);
							world.destroyBlock(_pos, false);
						}
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
								} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							{
								ItemStack _ist = itemstack;
								if (_ist.hurt(1, RandomSource.create(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
						}
					}
					CoosZ = CoosZ + 1;
				}
				CoosX = CoosX + 1;
				CoosZ = CoosZ - 3;
			}
		} else if ((entity.getDirection()) == Direction.NORTH || (entity.getDirection()) == Direction.SOUTH) {
			for (int index2 = 0; index2 < 3; index2++) {
				for (int index3 = 0; index3 < 3; index3++) {
					if (!((world.getBlockState(BlockPos.containing(CoosX, coosY, z))).is(BlockTags.create(new ResourceLocation("forge:air")))
							|| (world.getBlockState(BlockPos.containing(CoosX, coosY, z))).is(BlockTags.create(new ResourceLocation("minecraft:indestructible"))))) {
						{
							BlockPos _pos = BlockPos.containing(CoosX, coosY, z);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(CoosX, coosY, z), null);
							world.destroyBlock(_pos, false);
						}
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
								} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							{
								ItemStack _ist = itemstack;
								if (_ist.hurt(1, RandomSource.create(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
						}
					}
					coosY = coosY + 1;
				}
				CoosX = CoosX + 1;
				coosY = coosY - 3;
			}
		} else if ((entity.getDirection()) == Direction.EAST || (entity.getDirection()) == Direction.WEST) {
			for (int index4 = 0; index4 < 3; index4++) {
				for (int index5 = 0; index5 < 3; index5++) {
					if (!((world.getBlockState(BlockPos.containing(x, coosY, CoosZ))).is(BlockTags.create(new ResourceLocation("forge:air")))
							|| (world.getBlockState(BlockPos.containing(x, coosY, CoosZ))).is(BlockTags.create(new ResourceLocation("minecraft:indestructible"))))) {
						{
							BlockPos _pos = BlockPos.containing(x, coosY, CoosZ);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, coosY, CoosZ), null);
							world.destroyBlock(_pos, false);
						}
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
								} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							{
								ItemStack _ist = itemstack;
								if (_ist.hurt(1, RandomSource.create(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
						}
					}
					coosY = coosY + 1;
				}
				CoosZ = CoosZ + 1;
				coosY = coosY - 3;
			}
		}
	}
}
