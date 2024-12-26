
package net.mcreator.paladium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FortuneModifierItem extends Item {
	public FortuneModifierItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
