
package net.mcreator.paladium.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class GreenPaladiumPickaxeItem extends PickaxeItem {
	public GreenPaladiumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 4999;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PaladiumModItems.GREEN_PALADIUM_INGOT.get()));
			}
		}, 1, -2.6f, new Item.Properties());
	}
}
