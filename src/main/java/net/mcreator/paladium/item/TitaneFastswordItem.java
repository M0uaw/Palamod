
package net.mcreator.paladium.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.paladium.init.PaladiumModItems;

public class TitaneFastswordItem extends SwordItem {
	public TitaneFastswordItem() {
		super(new Tier() {
			public int getUses() {
				return 2999;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 1.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PaladiumModItems.TITANE_INGOT.get()));
			}
		}, 3, -1.7f, new Item.Properties());
	}
}
