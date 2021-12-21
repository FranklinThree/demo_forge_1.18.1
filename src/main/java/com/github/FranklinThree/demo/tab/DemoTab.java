package com.github.FranklinThree.demo.tab;

import com.github.FranklinThree.demo.item.Green_apple;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

public class DemoTab {
    public static final CreativeModeTab TAB_GREEN = (new CreativeModeTab(0, "GREEN") {
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(Green_apple::new);
        }
    }).setRecipeFolderName("Green");
}
