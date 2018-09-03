package com.doulospy.potatoclan.blocks;

import com.doulospy.potatoclan.Main;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockPotatoBlocks extends BlockBase {

    private static final int RESISTANCE_MULTIPLIER = 5;

    public BlockPotatoBlocks(String name, Material material, float level) {
        super(name, material, Main.creativeTab);

        setSoundType(SoundType.CLOTH);
        setHardness(Math.max(1, level));
        setResistance(level * RESISTANCE_MULTIPLIER);
        setHarvestLevel("pickaxe", 0);
    }
}
