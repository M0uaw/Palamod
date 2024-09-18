
package net.mcreator.paladium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FindiumItem extends Item {
	public FindiumItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
