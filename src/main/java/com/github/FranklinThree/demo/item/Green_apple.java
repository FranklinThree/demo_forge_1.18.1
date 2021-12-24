package com.github.FranklinThree.demo.item;


import net.minecraft.world.effect.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ObjectHolder;


import static com.github.FranklinThree.demo.tab.DemoTabs.TAB_GREEN;
@ObjectHolder("demo")

public class Green_apple extends Item {
    public Green_apple(){
        super((new Properties())
                .tab(TAB_GREEN)
                .stacksTo(1)
                .food(((new FoodProperties.Builder())
                        .nutrition(6)
                        .saturationMod(0.8F))
                        .effect(()->{
                            return new MobEffectInstance(MobEffects.MOVEMENT_SPEED,16*20,0);
                        },1)
                        .build()
                )
        );
    }

}
