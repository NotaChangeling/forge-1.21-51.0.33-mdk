package net.Fae.flowery_moos.item;

import net.Fae.flowery_moos.Flowery_Moos;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Flowery_Moos.MOD_ID);

    public static final RegistryObject<Item> ANCIENT_PETAL = ITEMS.register("ancient_petal",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
