package com.github.FranklinThree.demo.item;



import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import static com.github.FranklinThree.demo.tab.DemoTabs.TAB_GREEN;

public class Green_apple_cake extends Item {
    public Green_apple_cake(){
        super((new Properties())
                .tab(new CreativeModeTab("TEST") {
                    @Override
                    public @NotNull ItemStack makeIcon() {
                        return new ItemStack(Items.SEA_LANTERN);
                    }
                })

        );
    }


}
