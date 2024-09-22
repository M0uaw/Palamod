package net.mcreator.paladium.procedures;

public class SmeltingItemsInPFProcedure {
	public static void execute() {
		// Vérifie si le four a un combustible
if (entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).orElse(null).getStackInSlot(1).getItem() == Items.COAL.getItem()) {

    // Si l'objet à cuire est un minerai (par exemple, un lingot de fer)
    if (entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).orElse(null).getStackInSlot(0).getItem() == Items.IRON_ORE.getItem()) {
        
        // Déclencher la cuisson (simuler un délai)
        if (world instanceof ServerWorld) {
            ServerWorld serverWorld = (ServerWorld) world;
            serverWorld.getServer().getTickScheduler().schedule(new TickScheduler.Action(() -> {

                // Une fois la cuisson terminée, remplacer le minerai par un lingot de fer
                entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).orElse(null).getStackInSlot(0).shrink(1);  // Retirer un minerai
                entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).getStackInSlot(2).grow(1);  // Ajouter un lingot dans le slot de sortie

            }, 200));  // Délai de 10 secondes (200 ticks)
        }

        // Consommer le combustible (charbon)
        entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).orElse(null).getStackInSlot(1).shrink(1);
    }
}
	}
}
