package net.Fae.flowery_moos.datagen;

import net.Fae.flowery_moos.Flowery_Moos;
import net.Fae.flowery_moos.item.Moditems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Flowery_Moos.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        basicItem(Moditems.ANCIENT_PETAL.get());
        basicItem(Moditems.FROZEN_PETAL.get());

        basicItem(Moditems.NECTAR_BOTTLE.get());
    }
}
