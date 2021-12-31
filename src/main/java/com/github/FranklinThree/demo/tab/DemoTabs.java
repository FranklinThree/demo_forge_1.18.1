package com.github.FranklinThree.demo.tab;

import com.github.FranklinThree.demo.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class DemoTabs {
    public static final CreativeModeTab TAB_GREEN = (new CreativeModeTab("GREEN"){
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.GREEN_ENERGY_DUST.get());
        }
    }).setRecipeFolderName("Green");
//    public static final CreativeModeTab TAB_RED = (new CreativeModeTab(15,"RED"){
//        @Override
//        public @NotNull ItemStack makeIcon() {
//            return new ItemStack(ItemRegistry.GREEN_ENERGY_DUST.get());
//        }
//    }).setRecipeFolderName("Red");
//    public static final CreativeModeTab TAB_BLUE = (new CreativeModeTab(15,"BLUE"){
//        @Override
//        public @NotNull ItemStack makeIcon() {
//            return new ItemStack(ItemRegistry.GREEN_ENERGY_DUST.get());
//        }
//    }).setRecipeFolderName("Blue");
}
