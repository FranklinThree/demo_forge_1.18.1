package com.github.FranklinThree.demo;

import com.github.FranklinThree.demo.block.Green_apple_cake;
import com.github.FranklinThree.demo.block.Green_energy_ore;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,"demo");
    public static RegistryObject<Block> GREEN_APPLE_CAKE =  BLOCKS.register("green_apple_cake", Green_apple_cake::new);
    public static RegistryObject<Block> GREEN_ENERGY_ORE =  BLOCKS.register("green_energy_ore", Green_energy_ore::new);

}
