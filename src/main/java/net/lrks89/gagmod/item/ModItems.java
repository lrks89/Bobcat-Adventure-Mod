package net.lrks89.gagmod.item;

import net.lrks89.gagmod.GizmosAndGadgets;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GizmosAndGadgets.MOD_ID);

    public static final DeferredItem<Item> CHORUS_CORD = ITEMS.registerSimpleItem("chorus_cord");


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
