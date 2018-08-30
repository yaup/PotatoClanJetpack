package com.doulospy.potatoclanjetpack.init;

import com.doulospy.potatoclanjetpack.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block BLOCK_SOLID_POTATO = new BlockBase("solid_potato", Material.GRASS);
}
