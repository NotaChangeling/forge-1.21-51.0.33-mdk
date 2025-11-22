package net.Fae.flowery_moos.item;

import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import net.Fae.flowery_moos.Flowery_Moos;
import net.Fae.flowery_moos.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Flowery_Moos.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOOS_ITEMS_TAB = CREATIVE_MODE_TABS.register("moos_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.ANCIENT_PETAL.get()))
                    .title(Component.translatable("creativetab.flowery_moos.moos_items"))
                    .displayItems((itemDisplayPerameters, output) -> {
                        output.accept(Moditems.ANCIENT_PETAL.get());
                        output.accept(Moditems.FROZEN_PETAL.get());

                        output.accept(Moditems.NECTAR_BOTTLE.get());


                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
