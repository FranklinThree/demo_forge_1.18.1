package com.github.FranklinThree.demo.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class Green_apple_cake extends Block {
    public Green_apple_cake() {
        super((Properties.of(Material.CAKE))
                .strength(2.0F,4.0F)
        );
    }
}
