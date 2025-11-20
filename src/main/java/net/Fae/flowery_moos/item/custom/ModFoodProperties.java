package net.Fae.flowery_moos.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {

    public static final FoodProperties NECTAR_BOTTLE = new FoodProperties.Builder()
            .effect(new MobEffectInstance(MobEffects.ABSORPTION,2400,1), 1).build();
}
