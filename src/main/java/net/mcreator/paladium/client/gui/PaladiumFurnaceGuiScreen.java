package net.mcreator.paladium.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.paladium.world.inventory.PaladiumFurnaceGuiMenu;
import net.mcreator.paladium.procedures.FireTestProcedure;
import net.mcreator.paladium.procedures.FireTest9Procedure;
import net.mcreator.paladium.procedures.FireTest8Procedure;
import net.mcreator.paladium.procedures.FireTest7Procedure;
import net.mcreator.paladium.procedures.FireTest6Procedure;
import net.mcreator.paladium.procedures.FireTest5Procedure;
import net.mcreator.paladium.procedures.FireTest4Procedure;
import net.mcreator.paladium.procedures.FireTest3Procedure;
import net.mcreator.paladium.procedures.FireTest2Procedure;
import net.mcreator.paladium.procedures.FireTest1Procedure;
import net.mcreator.paladium.procedures.FireTest12Procedure;
import net.mcreator.paladium.procedures.FireTest11Procedure;
import net.mcreator.paladium.procedures.FireTest10Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class PaladiumFurnaceGuiScreen extends AbstractContainerScreen<PaladiumFurnaceGuiMenu> {
	private final static HashMap<String, Object> guistate = PaladiumFurnaceGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public PaladiumFurnaceGuiScreen(PaladiumFurnaceGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("paladium:textures/screens/paladium_furnace_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/paladium_furnace_1.png"), this.leftPos + 1, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		if (FireTestProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire.png"), this.leftPos + 57, this.topPos + 36, 0, 0, 14, 13, 14, 13);
		}
		if (FireTest1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_1.png"), this.leftPos + 57, this.topPos + 37, 0, 0, 14, 12, 14, 12);
		}
		if (FireTest2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_2.png"), this.leftPos + 57, this.topPos + 38, 0, 0, 14, 11, 14, 11);
		}
		if (FireTest3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_3.png"), this.leftPos + 57, this.topPos + 39, 0, 0, 14, 10, 14, 10);
		}
		if (FireTest4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_4.png"), this.leftPos + 57, this.topPos + 40, 0, 0, 14, 9, 14, 9);
		}
		if (FireTest5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_5.png"), this.leftPos + 57, this.topPos + 41, 0, 0, 14, 8, 14, 8);
		}
		if (FireTest6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_6.png"), this.leftPos + 57, this.topPos + 42, 0, 0, 14, 7, 14, 7);
		}
		if (FireTest7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_7.png"), this.leftPos + 57, this.topPos + 43, 0, 0, 14, 6, 14, 6);
		}
		if (FireTest8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_8.png"), this.leftPos + 57, this.topPos + 44, 0, 0, 14, 5, 14, 5);
		}
		if (FireTest9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_9.png"), this.leftPos + 57, this.topPos + 45, 0, 0, 14, 4, 14, 4);
		}
		if (FireTest10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_10.png"), this.leftPos + 57, this.topPos + 46, 0, 0, 14, 3, 14, 3);
		}
		if (FireTest11Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_11.png"), this.leftPos + 57, this.topPos + 47, 0, 0, 14, 2, 14, 2);
		}
		if (FireTest12Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_12.png"), this.leftPos + 57, this.topPos + 48, 0, 0, 14, 1, 14, 1);
		}

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_1.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 2, 16, 2, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_2.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 3, 16, 3, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_3.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 4, 16, 4, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_4.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 5, 16, 5, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_5.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 6, 16, 6, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_6.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 7, 16, 7, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_7.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 8, 16, 8, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_8.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 9, 16, 9, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_9.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 10, 16, 10, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_10.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 11, 16, 11, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_11.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 12, 16, 12, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_12.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 13, 16, 13, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_13.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 14, 16, 14, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_14.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 15, 16, 15, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_15.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_16.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 17, 16, 17, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_17.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 18, 16, 18, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_18.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 19, 16, 19, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_19.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 20, 16, 20, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_20.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 21, 16, 21, 16);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/arrow_21.png"), this.leftPos + 81, this.topPos + 34, 0, 0, 22, 16, 22, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.paladium.paladium_furnace_gui.label_paladium_furnace"), 44, 4, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
