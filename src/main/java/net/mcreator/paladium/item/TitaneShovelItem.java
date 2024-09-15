
package net.mcreator.paladium.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class TitaneShovelItem extends ShovelItem {
	public TitaneShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1999;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 3.5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PaladiumModItems.TITANE_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
