package com.github.FranklinThree.demo;

import com.github.FranklinThree.demo.item.Green_apple;
import com.github.FranklinThree.demo.item.Green_apple_cake;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.github.FranklinThree.demo.tab.DemoTab.TAB_GREEN;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "demo");
    public static final RegistryObject<Item> GREEN_APPLE = ITEMS.register("green_apple", Green_apple::new);
    public static final RegistryObject<Item> GREEN_APPLE_CAKE = ITEMS.register("green_apple_cake", ()->{
        return new BlockItem(BlockRegistry.GREEN_APPLE_CAKE.get(),new Item.Properties().tab(TAB_GREEN));
    });
}
