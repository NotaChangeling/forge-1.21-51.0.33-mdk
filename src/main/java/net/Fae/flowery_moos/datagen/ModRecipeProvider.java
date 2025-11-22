package net.Fae.flowery_moos.datagen;


import net.Fae.flowery_moos.Flowery_Moos;
import net.Fae.flowery_moos.item.Moditems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SmokingRecipe;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.ANCIENT_PETAL.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A', Moditems.ANCIENT_PETAL.get())
                .define('B', Items.DANDELION)
                .unlockedBy(getHasName(Moditems.ANCIENT_PETAL.get()), has(Moditems.ANCIENT_PETAL.get())).save(pRecipeOutput);



    }
}
