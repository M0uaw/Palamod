
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paladium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.paladium.PaladiumMod;

public class PaladiumModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PaladiumMod.MODID);
	public static final RegistryObject<CreativeModeTab> PALADIUM = REGISTRY.register("paladium",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.paladium.paladium")).icon(() -> new ItemStack(PaladiumModBlocks.PALADIUM_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PaladiumModBlocks.AMETHYST_ORE.get().asItem());
				tabData.accept(PaladiumModBlocks.TITANE_ORE.get().asItem());
				tabData.accept(PaladiumModBlocks.PALADIUM_ORE.get().asItem());
				tabData.accept(PaladiumModBlocks.FINDIUM_ORE.get().asItem());
				tabData.accept(PaladiumModBlocks.GREEN_PALADIUM_ORE.get().asItem());
				tabData.accept(PaladiumModBlocks.ENDIUM_ORE.get().asItem());
				tabData.accept(PaladiumModBlocks.TRIXIUM_ORE.get().asItem());
				tabData.accept(PaladiumModBlocks.AMETHYST_BLOCK.get().asItem());
				tabData.accept(PaladiumModBlocks.TITANE_BLOCK.get().asItem());
				tabData.accept(PaladiumModBlocks.PALADIUM_BLOCK.get().asItem());
				tabData.accept(PaladiumModBlocks.GREEN_PALADIUM_BLOCK.get().asItem());
				tabData.accept(PaladiumModBlocks.ENDIUM_BLOCK.get().asItem());
				tabData.accept(PaladiumModBlocks.FINDIUM_BLOCK.get().asItem());
				tabData.accept(PaladiumModBlocks.TRIXIUM_BLOCK.get().asItem());
				tabData.accept(PaladiumModItems.AMETHYST_INGOT.get());
				tabData.accept(PaladiumModItems.TITANE_INGOT.get());
				tabData.accept(PaladiumModItems.PALADIUM_INGOT.get());
				tabData.accept(PaladiumModItems.GREEN_PALADIUM_INGOT.get());
				tabData.accept(PaladiumModItems.ENDIUM_INGOT.get());
				tabData.accept(PaladiumModItems.ENDIUM_NUGGET.get());
				tabData.accept(PaladiumModItems.ENDIUM_FRAGMENT.get());
				tabData.accept(PaladiumModItems.FINDIUM.get());
				tabData.accept(PaladiumModItems.TRIXIUM.get());
				tabData.accept(PaladiumModItems.AMETHYST_STICK.get());
				tabData.accept(PaladiumModItems.TITANE_STICK.get());
				tabData.accept(PaladiumModItems.PALADIUM_STICK.get());
				tabData.accept(PaladiumModItems.AMETHYST_ARMOR_HELMET.get());
				tabData.accept(PaladiumModItems.AMETHYST_ARMOR_CHESTPLATE.get());
				tabData.accept(PaladiumModItems.AMETHYST_ARMOR_LEGGINGS.get());
				tabData.accept(PaladiumModItems.AMETHYST_ARMOR_BOOTS.get());
				tabData.accept(PaladiumModItems.TITANE_ARMOR_HELMET.get());
				tabData.accept(PaladiumModItems.TITANE_ARMOR_CHESTPLATE.get());
				tabData.accept(PaladiumModItems.TITANE_ARMOR_LEGGINGS.get());
				tabData.accept(PaladiumModItems.TITANE_ARMOR_BOOTS.get());
				tabData.accept(PaladiumModItems.PALADIUM_ARMOR_HELMET.get());
				tabData.accept(PaladiumModItems.PALADIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(PaladiumModItems.PALADIUM_ARMOR_LEGGINGS.get());
				tabData.accept(PaladiumModItems.PALADIUM_ARMOR_BOOTS.get());
				tabData.accept(PaladiumModItems.GREEN_PALADIUM_ARMOR_HELMET.get());
				tabData.accept(PaladiumModItems.GREEN_PALADIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(PaladiumModItems.GREEN_PALADIUM_ARMOR_LEGGINGS.get());
				tabData.accept(PaladiumModItems.GREEN_PALADIUM_ARMOR_BOOTS.get());
				tabData.accept(PaladiumModItems.ENDIUM_ARMOR_HELMET.get());
				tabData.accept(PaladiumModItems.ENDIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(PaladiumModItems.ENDIUM_ARMOR_LEGGINGS.get());
				tabData.accept(PaladiumModItems.ENDIUM_ARMOR_BOOTS.get());
				tabData.accept(PaladiumModItems.AMETHYST_SWORD.get());
				tabData.accept(PaladiumModItems.AMETHYST_AXE.get());
				tabData.accept(PaladiumModItems.AMETHYST_PICKAXE.get());
				tabData.accept(PaladiumModItems.AMETHYST_SHOVEL.get());
				tabData.accept(PaladiumModItems.TITANE_SWORD.get());
				tabData.accept(PaladiumModItems.TITANE_PICKAXE.get());
				tabData.accept(PaladiumModItems.TITANE_AXE.get());
				tabData.accept(PaladiumModItems.TITANE_SHOVEL.get());
				tabData.accept(PaladiumModItems.PALADIUM_SWORD.get());
				tabData.accept(PaladiumModItems.PALADIUM_PICKAXE.get());
				tabData.accept(PaladiumModItems.PALADIUM_AXE.get());
				tabData.accept(PaladiumModItems.PALADIUM_SHOVEL.get());
				tabData.accept(PaladiumModItems.GREEN_PALADIUM_SWORD.get());
				tabData.accept(PaladiumModItems.GREEN_PALADIUM_PICKAXE.get());
				tabData.accept(PaladiumModItems.GREEN_PALADIUM_AXE.get());
				tabData.accept(PaladiumModItems.GREEN_PALADIUM_SHOVEL.get());
				tabData.accept(PaladiumModItems.ENDIUM_SWORD.get());
				tabData.accept(PaladiumModItems.ENDIUM_PICKAXE.get());
				tabData.accept(PaladiumModItems.ENDIUM_AXE.get());
				tabData.accept(PaladiumModItems.AMETHYST_HAMMER.get());
				tabData.accept(PaladiumModItems.TITANE_HAMMER.get());
				tabData.accept(PaladiumModItems.PALADIUM_HAMMER.get());
				tabData.accept(PaladiumModItems.AMETHYST_EXCAVATOR.get());
				tabData.accept(PaladiumModItems.TITANE_EXCAVATOR.get());
				tabData.accept(PaladiumModItems.PALADIUM_EXCAVATOR.get());
				tabData.accept(PaladiumModBlocks.PALADIUM_FURNACE.get().asItem());
				tabData.accept(PaladiumModItems.FURNACE_UPGRADE.get());
				tabData.accept(PaladiumModBlocks.PALADIUM_LUCKY_BLOCK.get().asItem());
			}).withSearchBar().build());
}
