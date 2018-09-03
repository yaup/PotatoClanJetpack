package com.doulospy.potatoclan.init;

import com.doulospy.potatoclan.blocks.BlockPotatoBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    // The basic "solid potato" block
    public static final Block BLOCK_SOLID_POTATO = new BlockPotatoBlocks("solid_potato", Material.GROUND);

    // Levels of compressed potatoes
    public static final Block BLOCK_COMPRESSED_POTATO_1 = new BlockPotatoBlocks("compressed_potato1", Material.GROUND);
    public static final Block BLOCK_COMPRESSED_POTATO_2 = new BlockPotatoBlocks("compressed_potato2", Material.GROUND);
    public static final Block BLOCK_COMPRESSED_POTATO_3 = new BlockPotatoBlocks("compressed_potato3", Material.GROUND);
    public static final Block BLOCK_COMPRESSED_POTATO_4 = new BlockPotatoBlocks("compressed_potato4", Material.GROUND);
    public static final Block BLOCK_COMPRESSED_POTATO_5 = new BlockPotatoBlocks("compressed_potato5", Material.GROUND);
    public static final Block BLOCK_COMPRESSED_POTATO_6 = new BlockPotatoBlocks("compressed_potato6", Material.GROUND);
    public static final Block BLOCK_COMPRESSED_POTATO_7 = new BlockPotatoBlocks("compressed_potato7", Material.GROUND);
    public static final Block BLOCK_COMPRESSED_POTATO_8 = new BlockPotatoBlocks("compressed_potato8", Material.GROUND);
    public static final Block BLOCK_COMPRESSED_POTATO_9 = new BlockPotatoBlocks("compressed_potato9", Material.GROUND);
}
