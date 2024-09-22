
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paladium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.paladium.block.entity.PaladiumFurnaceBlockEntity;
import net.mcreator.paladium.PaladiumMod;

public class PaladiumModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, PaladiumMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> PALADIUM_FURNACE = register("paladium_furnace", PaladiumModBlocks.PALADIUM_FURNACE, PaladiumFurnaceBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
