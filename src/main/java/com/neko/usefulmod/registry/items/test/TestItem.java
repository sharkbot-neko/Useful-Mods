package com.neko.usefulmod.registry.items.test;

import com.neko.usefulmod.UsefulMod;
import net.minecraft.world.item.Item;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TestItem {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(UsefulMod.MODID);

    public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerItem(
            "test_item",
            Item::new, // The factory that the properties will be passed into.
            new Item.Properties() // The properties to use.
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
