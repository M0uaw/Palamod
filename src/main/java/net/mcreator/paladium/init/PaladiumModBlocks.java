
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paladium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.paladium.block.TrixiumOreBlock;
import net.mcreator.paladium.block.TrixiumBlockBlock;
import net.mcreator.paladium.block.TitaneOreBlock;
import net.mcreator.paladium.block.TitaneBlockBlock;
import net.mcreator.paladium.block.PaladiumOreBlock;
import net.mcreator.paladium.block.PaladiumBlockBlock;
import net.mcreator.paladium.block.GreenPaladiumOreBlock;
import net.mcreator.paladium.block.GreenPaladiumBlockBlock;
import net.mcreator.paladium.block.FindiumOreBlock;
import net.mcreator.paladium.block.FindiumBlockBlock;
import net.mcreator.paladium.block.EndiumOreBlock;
import net.mcreator.paladium.block.EndiumBlockBlock;
import net.mcreator.paladium.block.AmethystOreBlock;
import net.mcreator.paladium.block.AmethystBlockBlock;
import net.mcreator.paladium.PaladiumMod;

public class PaladiumModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PaladiumMod.MODID);
	public static final RegistryObject<Block> AMETHYST_ORE = REGISTRY.register("amethyst_ore", () -> new AmethystOreBlock());
	public static final RegistryObject<Block> TITANE_ORE = REGISTRY.register("titane_ore", () -> new TitaneOreBlock());
	public static final RegistryObject<Block> PALADIUM_ORE = REGISTRY.register("paladium_ore", () -> new PaladiumOreBlock());
	public static final RegistryObject<Block> FINDIUM_ORE = REGISTRY.register("findium_ore", () -> new FindiumOreBlock());
	public static final RegistryObject<Block> GREEN_PALADIUM_ORE = REGISTRY.register("green_paladium_ore", () -> new GreenPaladiumOreBlock());
	public static final RegistryObject<Block> ENDIUM_ORE = REGISTRY.register("endium_ore", () -> new EndiumOreBlock());
	public static final RegistryObject<Block> TRIXIUM_ORE = REGISTRY.register("trixium_ore", () -> new TrixiumOreBlock());
	public static final RegistryObject<Block> AMETHYST_BLOCK = REGISTRY.register("amethyst_block", () -> new AmethystBlockBlock());
	public static final RegistryObject<Block> TITANE_BLOCK = REGISTRY.register("titane_block", () -> new TitaneBlockBlock());
	public static final RegistryObject<Block> PALADIUM_BLOCK = REGISTRY.register("paladium_block", () -> new PaladiumBlockBlock());
	public static final RegistryObject<Block> FINDIUM_BLOCK = REGISTRY.register("findium_block", () -> new FindiumBlockBlock());
	public static final RegistryObject<Block> GREEN_PALADIUM_BLOCK = REGISTRY.register("green_paladium_block", () -> new GreenPaladiumBlockBlock());
	public static final RegistryObject<Block> ENDIUM_BLOCK = REGISTRY.register("endium_block", () -> new EndiumBlockBlock());
	public static final RegistryObject<Block> TRIXIUM_BLOCK = REGISTRY.register("trixium_block", () -> new TrixiumBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
