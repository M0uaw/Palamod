
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paladium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.paladium.item.TrixiumIngotItem;
import net.mcreator.paladium.item.TitaneSwordItem;
import net.mcreator.paladium.item.TitaneShovelItem;
import net.mcreator.paladium.item.TitanePickaxeItem;
import net.mcreator.paladium.item.TitaneIngotItem;
import net.mcreator.paladium.item.TitaneAxeItem;
import net.mcreator.paladium.item.TitaneArmorItem;
import net.mcreator.paladium.item.PaladiumSwordItem;
import net.mcreator.paladium.item.PaladiumIngotItem;
import net.mcreator.paladium.item.PaladiumArmorItem;
import net.mcreator.paladium.item.GreenPaladiumSwordItem;
import net.mcreator.paladium.item.GreenPaladiumIngotItem;
import net.mcreator.paladium.item.GreenPaladiumArmorItem;
import net.mcreator.paladium.item.FindiumIngotItem;
import net.mcreator.paladium.item.EndiumSwordItem;
import net.mcreator.paladium.item.EndiumNuggetItem;
import net.mcreator.paladium.item.EndiumIngotItem;
import net.mcreator.paladium.item.EndiumFragmentItem;
import net.mcreator.paladium.item.EndiumArmorItem;
import net.mcreator.paladium.item.AmethystSwordItem;
import net.mcreator.paladium.item.AmethystShovelItem;
import net.mcreator.paladium.item.AmethystPickaxeItem;
import net.mcreator.paladium.item.AmethystItem;
import net.mcreator.paladium.item.AmethystIngotItem;
import net.mcreator.paladium.item.AmethystHammerItem;
import net.mcreator.paladium.item.AmethystAxeItem;
import net.mcreator.paladium.PaladiumMod;

public class PaladiumModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PaladiumMod.MODID);
	public static final RegistryObject<Item> AMETHYST_ORE = block(PaladiumModBlocks.AMETHYST_ORE);
	public static final RegistryObject<Item> TITANE_ORE = block(PaladiumModBlocks.TITANE_ORE);
	public static final RegistryObject<Item> PALADIUM_ORE = block(PaladiumModBlocks.PALADIUM_ORE);
	public static final RegistryObject<Item> FINDIUM_ORE = block(PaladiumModBlocks.FINDIUM_ORE);
	public static final RegistryObject<Item> GREEN_PALADIUM_ORE = block(PaladiumModBlocks.GREEN_PALADIUM_ORE);
	public static final RegistryObject<Item> ENDIUM_ORE = block(PaladiumModBlocks.ENDIUM_ORE);
	public static final RegistryObject<Item> TRIXIUM_ORE = block(PaladiumModBlocks.TRIXIUM_ORE);
	public static final RegistryObject<Item> AMETHYST_INGOT = REGISTRY.register("amethyst_ingot", () -> new AmethystIngotItem());
	public static final RegistryObject<Item> TITANE_INGOT = REGISTRY.register("titane_ingot", () -> new TitaneIngotItem());
	public static final RegistryObject<Item> PALADIUM_INGOT = REGISTRY.register("paladium_ingot", () -> new PaladiumIngotItem());
	public static final RegistryObject<Item> FINDIUM_INGOT = REGISTRY.register("findium_ingot", () -> new FindiumIngotItem());
	public static final RegistryObject<Item> GREEN_PALADIUM_INGOT = REGISTRY.register("green_paladium_ingot", () -> new GreenPaladiumIngotItem());
	public static final RegistryObject<Item> ENDIUM_FRAGMENT = REGISTRY.register("endium_fragment", () -> new EndiumFragmentItem());
	public static final RegistryObject<Item> ENDIUM_NUGGET = REGISTRY.register("endium_nugget", () -> new EndiumNuggetItem());
	public static final RegistryObject<Item> ENDIUM_INGOT = REGISTRY.register("endium_ingot", () -> new EndiumIngotItem());
	public static final RegistryObject<Item> TRIXIUM_INGOT = REGISTRY.register("trixium_ingot", () -> new TrixiumIngotItem());
	public static final RegistryObject<Item> AMETHYST_BLOCK = block(PaladiumModBlocks.AMETHYST_BLOCK);
	public static final RegistryObject<Item> TITANE_BLOCK = block(PaladiumModBlocks.TITANE_BLOCK);
	public static final RegistryObject<Item> PALADIUM_BLOCK = block(PaladiumModBlocks.PALADIUM_BLOCK);
	public static final RegistryObject<Item> FINDIUM_BLOCK = block(PaladiumModBlocks.FINDIUM_BLOCK);
	public static final RegistryObject<Item> GREEN_PALADIUM_BLOCK = block(PaladiumModBlocks.GREEN_PALADIUM_BLOCK);
	public static final RegistryObject<Item> ENDIUM_BLOCK = block(PaladiumModBlocks.ENDIUM_BLOCK);
	public static final RegistryObject<Item> TRIXIUM_BLOCK = block(PaladiumModBlocks.TRIXIUM_BLOCK);
	public static final RegistryObject<Item> AMETHYST_SWORD = REGISTRY.register("amethyst_sword", () -> new AmethystSwordItem());
	public static final RegistryObject<Item> TITANE_SWORD = REGISTRY.register("titane_sword", () -> new TitaneSwordItem());
	public static final RegistryObject<Item> PALADIUM_SWORD = REGISTRY.register("paladium_sword", () -> new PaladiumSwordItem());
	public static final RegistryObject<Item> GREEN_PALADIUM_SWORD = REGISTRY.register("green_paladium_sword", () -> new GreenPaladiumSwordItem());
	public static final RegistryObject<Item> ENDIUM_SWORD = REGISTRY.register("endium_sword", () -> new EndiumSwordItem());
	public static final RegistryObject<Item> AMETHYST_ARMOR_HELMET = REGISTRY.register("amethyst_armor_helmet", () -> new AmethystItem.Helmet());
	public static final RegistryObject<Item> AMETHYST_ARMOR_CHESTPLATE = REGISTRY.register("amethyst_armor_chestplate", () -> new AmethystItem.Chestplate());
	public static final RegistryObject<Item> AMETHYST_ARMOR_LEGGINGS = REGISTRY.register("amethyst_armor_leggings", () -> new AmethystItem.Leggings());
	public static final RegistryObject<Item> AMETHYST_ARMOR_BOOTS = REGISTRY.register("amethyst_armor_boots", () -> new AmethystItem.Boots());
	public static final RegistryObject<Item> TITANE_ARMOR_HELMET = REGISTRY.register("titane_armor_helmet", () -> new TitaneArmorItem.Helmet());
	public static final RegistryObject<Item> TITANE_ARMOR_CHESTPLATE = REGISTRY.register("titane_armor_chestplate", () -> new TitaneArmorItem.Chestplate());
	public static final RegistryObject<Item> TITANE_ARMOR_LEGGINGS = REGISTRY.register("titane_armor_leggings", () -> new TitaneArmorItem.Leggings());
	public static final RegistryObject<Item> TITANE_ARMOR_BOOTS = REGISTRY.register("titane_armor_boots", () -> new TitaneArmorItem.Boots());
	public static final RegistryObject<Item> PALADIUM_ARMOR_HELMET = REGISTRY.register("paladium_armor_helmet", () -> new PaladiumArmorItem.Helmet());
	public static final RegistryObject<Item> PALADIUM_ARMOR_CHESTPLATE = REGISTRY.register("paladium_armor_chestplate", () -> new PaladiumArmorItem.Chestplate());
	public static final RegistryObject<Item> PALADIUM_ARMOR_LEGGINGS = REGISTRY.register("paladium_armor_leggings", () -> new PaladiumArmorItem.Leggings());
	public static final RegistryObject<Item> PALADIUM_ARMOR_BOOTS = REGISTRY.register("paladium_armor_boots", () -> new PaladiumArmorItem.Boots());
	public static final RegistryObject<Item> GREEN_PALADIUM_ARMOR_HELMET = REGISTRY.register("green_paladium_armor_helmet", () -> new GreenPaladiumArmorItem.Helmet());
	public static final RegistryObject<Item> GREEN_PALADIUM_ARMOR_CHESTPLATE = REGISTRY.register("green_paladium_armor_chestplate", () -> new GreenPaladiumArmorItem.Chestplate());
	public static final RegistryObject<Item> GREEN_PALADIUM_ARMOR_LEGGINGS = REGISTRY.register("green_paladium_armor_leggings", () -> new GreenPaladiumArmorItem.Leggings());
	public static final RegistryObject<Item> GREEN_PALADIUM_ARMOR_BOOTS = REGISTRY.register("green_paladium_armor_boots", () -> new GreenPaladiumArmorItem.Boots());
	public static final RegistryObject<Item> ENDIUM_ARMOR_HELMET = REGISTRY.register("endium_armor_helmet", () -> new EndiumArmorItem.Helmet());
	public static final RegistryObject<Item> ENDIUM_ARMOR_CHESTPLATE = REGISTRY.register("endium_armor_chestplate", () -> new EndiumArmorItem.Chestplate());
	public static final RegistryObject<Item> ENDIUM_ARMOR_LEGGINGS = REGISTRY.register("endium_armor_leggings", () -> new EndiumArmorItem.Leggings());
	public static final RegistryObject<Item> ENDIUM_ARMOR_BOOTS = REGISTRY.register("endium_armor_boots", () -> new EndiumArmorItem.Boots());
	public static final RegistryObject<Item> AMETHYST_AXE = REGISTRY.register("amethyst_axe", () -> new AmethystAxeItem());
	public static final RegistryObject<Item> AMETHYST_PICKAXE = REGISTRY.register("amethyst_pickaxe", () -> new AmethystPickaxeItem());
	public static final RegistryObject<Item> AMETHYST_SHOVEL = REGISTRY.register("amethyst_shovel", () -> new AmethystShovelItem());
	public static final RegistryObject<Item> AMETHYST_HAMMER = REGISTRY.register("amethyst_hammer", () -> new AmethystHammerItem());
	public static final RegistryObject<Item> TITANE_AXE = REGISTRY.register("titane_axe", () -> new TitaneAxeItem());
	public static final RegistryObject<Item> TITANE_PICKAXE = REGISTRY.register("titane_pickaxe", () -> new TitanePickaxeItem());
	public static final RegistryObject<Item> TITANE_SHOVEL = REGISTRY.register("titane_shovel", () -> new TitaneShovelItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
