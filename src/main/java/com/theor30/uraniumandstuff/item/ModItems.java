package com.theor30.uraniumandstuff.item;

import com.theor30.uraniumandstuff.UraniumAndStuff;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(UraniumAndStuff.MODID);

    public static final DeferredItem<Item> URANIUM = ITEMS.register("uranium",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_URANIUM = ITEMS.register("raw_uranium",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
