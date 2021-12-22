package com.github.FranklinThree.demo.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.ObjectHolder;

import static com.github.FranklinThree.demo.DemoMain.TAB_GREEN;

public class Green_energy_dust extends Item {
    public Green_energy_dust() {
        super((new Properties())
                .tab(TAB_GREEN)
                .stacksTo(64)
                .rarity(Rarity.RARE)
        );
    }
}
