
package net.mcreator.paladium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SpeedModifierItem extends Item {
	public SpeedModifierItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
