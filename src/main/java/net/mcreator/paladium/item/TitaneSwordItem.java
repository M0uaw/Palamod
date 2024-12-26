
package net.mcreator.paladium.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.paladium.init.PaladiumModItems;

public class TitaneSwordItem extends SwordItem {
	public TitaneSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2999;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 3.5f;
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
		}, 3, -2.4f, new Item.Properties());
	}
}
