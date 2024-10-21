package net.lrks89.gagmod.item;

import net.lrks89.gagmod.GizmosAndGadgets;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GizmosAndGadgets.MOD_ID);

    public static final Supplier<CreativeModeTab> GIZMOS_AND_GADGETS_TAB =
            CREATIVE_MODE_TABS.register("gizmos_and_gadgets_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.gagmod.gizmos_and_gadgets_tab"))
                    .icon(() -> new ItemStack(Items.ELYTRA.asItem()))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept((ModItems.CHORUS_CORD));
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
