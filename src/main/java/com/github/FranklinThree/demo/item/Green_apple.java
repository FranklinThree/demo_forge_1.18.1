package com.github.FranklinThree.demo.item;


import net.minecraft.world.effect.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import static com.github.FranklinThree.demo.tab.DemoTab.TAB_GREEN;

public class Green_apple extends Item {
    public Green_apple(){
        super((new Properties())
                .tab(TAB_GREEN)
                .stacksTo(1)
                .food(((new FoodProperties.Builder())
                        .nutrition(6)
                        .saturationMod(4.0F))
                        .effect(()->{
                            return new MobEffectInstance(MobEffects.MOVEMENT_SPEED,16*20,0);
                        },1)
                        .build()
                )
        );
    }

}
