
package net.mcreator.paladium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AutoRepairModifierItem extends Item {
	public AutoRepairModifierItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
