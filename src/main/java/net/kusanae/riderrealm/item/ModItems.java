package net.kusanae.riderrealm.item;

import net.kusanae.riderrealm.RidersAssemble;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RidersAssemble.RIDERREALM);

    public static final DeferredItem<Item> HIDENMETAL = ITEMS.register("hiden_metal",
            () -> new Item(new Item.Properties()));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
