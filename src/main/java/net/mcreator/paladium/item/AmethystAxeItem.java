
package net.mcreator.paladium.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.paladium.init.PaladiumModItems;

public class AmethystAxeItem extends AxeItem {
	public AmethystAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1999;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 6.5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PaladiumModItems.AMETHYST_INGOT.get()));
			}
		}, 1, -2.8f, new Item.Properties());
	}
}
