package com.neko.usefulmod.registry;

import com.neko.usefulmod.registry.items.test.TestItem;
import com.neko.usefulmod.UsefulMod;
import net.neoforged.bus.api.IEventBus;

public class registry {
    public static void registry_all(IEventBus eventBus) {
        TestItem.register(eventBus);
    }
}
