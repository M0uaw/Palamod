
package net.mcreator.paladium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SmeltModifierItem extends Item {
	public SmeltModifierItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
