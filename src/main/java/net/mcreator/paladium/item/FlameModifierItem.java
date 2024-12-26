
package net.mcreator.paladium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FlameModifierItem extends Item {
	public FlameModifierItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
