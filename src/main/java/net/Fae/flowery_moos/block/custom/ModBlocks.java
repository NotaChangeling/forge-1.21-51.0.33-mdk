package net.Fae.flowery_moos.block.custom;

import net.Fae.flowery_moos.Flowery_Moos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Flowery_Moos.MOD_ID);

    public static final RegistryObject<FlowerBlock> ANCIENT_DANDY = BLOCKS.register("ancient_dandy",
            () -> new FlowerBlock(BlockBehaviour.Properties.of()
                    .instabreak().ignitedByLava()));

}
