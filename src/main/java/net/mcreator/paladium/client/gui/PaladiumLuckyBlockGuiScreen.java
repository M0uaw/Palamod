package net.mcreator.paladium.client.gui;

public class PaladiumLuckyBlockGuiScreen extends AbstractContainerScreen<PaladiumLuckyBlockGuiMenu> {

	private final static HashMap<String, Object> guistate = PaladiumLuckyBlockGuiMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	ImageButton imagebutton_lancer;

	public PaladiumLuckyBlockGuiScreen(PaladiumLuckyBlockGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("paladium:textures/screens/paladium_lucky_block_gui.png");

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

		imagebutton_lancer = new ImageButton(this.leftPos + -304, this.topPos + -361, 768, 567, 0, 0, 567, new ResourceLocation("paladium:textures/screens/atlas/imagebutton_lancer.png"), 768, 1134, e -> {
		});

		guistate.put("button:imagebutton_lancer", imagebutton_lancer);
		this.addRenderableWidget(imagebutton_lancer);

	}

}
