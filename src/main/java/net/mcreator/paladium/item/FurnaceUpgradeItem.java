
package net.mcreator.paladium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FurnaceUpgradeItem extends Item {
	public FurnaceUpgradeItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
