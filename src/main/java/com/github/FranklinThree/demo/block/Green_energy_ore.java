package com.github.FranklinThree.demo.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.ToIntFunction;


public class Green_energy_ore extends Block {
    private final UniformInt xpRange = UniformInt.of(1,5);
    public Green_energy_ore() {
        super(Properties.of(Material.STONE, MaterialColor.STONE)
                .strength(1.3f,30.0f)
                .lightLevel(new ToIntFunction<BlockState>() {
                    @Override
                    public int applyAsInt(BlockState value) {
                        return 1;
                    }
                })

        );
    }
    @Override
    public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
            return tieredItem.getTier().getLevel() >= 2;
        return false;
    }


//
//    public void spawnAfterBreak(BlockState p_55142_, ServerLevel p_55143_, BlockPos p_55144_, ItemStack p_55145_) {
//        super.spawnAfterBreak(p_55142_, p_55143_, p_55144_, p_55145_);
//    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.level.LevelReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.xpRange.sample(RANDOM) : 0;
    }

}
