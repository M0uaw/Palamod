package net.mcreator.paladium.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.paladium.world.inventory.PaladiumFurnaceGuiMenu;

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

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/paladium_furnace_1.png"), this.leftPos + 1, this.topPos + -1, 0, 0, 176, 166, 176, 166);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire.png"), this.leftPos + 57, this.topPos + 36, 0, 0, 14, 13, 14, 13);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_1.png"), this.leftPos + 57, this.topPos + 37, 0, 0, 14, 12, 14, 12);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_2.png"), this.leftPos + 57, this.topPos + 38, 0, 0, 14, 11, 14, 11);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_3.png"), this.leftPos + 57, this.topPos + 39, 0, 0, 14, 10, 14, 10);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_4.png"), this.leftPos + 57, this.topPos + 40, 0, 0, 14, 9, 14, 9);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_5.png"), this.leftPos + 57, this.topPos + 41, 0, 0, 14, 8, 14, 8);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_6.png"), this.leftPos + 57, this.topPos + 42, 0, 0, 14, 7, 14, 7);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_7.png"), this.leftPos + 57, this.topPos + 43, 0, 0, 14, 6, 14, 6);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_8.png"), this.leftPos + 57, this.topPos + 44, 0, 0, 14, 5, 14, 5);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_9.png"), this.leftPos + 57, this.topPos + 45, 0, 0, 14, 4, 14, 4);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_10.png"), this.leftPos + 57, this.topPos + 46, 0, 0, 14, 3, 14, 3);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_11.png"), this.leftPos + 57, this.topPos + 47, 0, 0, 14, 2, 14, 2);

		guiGraphics.blit(new ResourceLocation("paladium:textures/screens/fire_12.png"), this.leftPos + 57, this.topPos + 48, 0, 0, 14, 1, 14, 1);

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
	}

	@Override
	public void init() {
		super.init();
	}
}
