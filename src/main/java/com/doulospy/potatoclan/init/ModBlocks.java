package com.doulospy.potatoclan.init;

import com.doulospy.potatoclan.blocks.BlockPotatoBlocks;
import com.doulospy.potatoclan.blocks.BlockPotatoBricks;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();

    // The basic "solid potato" block
    public static final Block BLOCK_SOLID_POTATO = new BlockPotatoBlocks("solid_potato", 0);

    // Levels of compressed potatoes
    public static final Block BLOCK_COMPRESSED_POTATO_1 = new BlockPotatoBlocks("compressed_potato1", 1);
    public static final Block BLOCK_COMPRESSED_POTATO_2 = new BlockPotatoBlocks("compressed_potato2", 2);
    public static final Block BLOCK_COMPRESSED_POTATO_3 = new BlockPotatoBlocks("compressed_potato3", 3);
    public static final Block BLOCK_COMPRESSED_POTATO_4 = new BlockPotatoBlocks("compressed_potato4", 4);
    public static final Block BLOCK_COMPRESSED_POTATO_5 = new BlockPotatoBlocks("compressed_potato5", 5);
    public static final Block BLOCK_COMPRESSED_POTATO_6 = new BlockPotatoBlocks("compressed_potato6", 6);
    public static final Block BLOCK_COMPRESSED_POTATO_7 = new BlockPotatoBlocks("compressed_potato7", 7);
    public static final Block BLOCK_COMPRESSED_POTATO_8 = new BlockPotatoBlocks("compressed_potato8", 8);
    public static final Block BLOCK_COMPRESSED_POTATO_9 = new BlockPotatoBlocks("compressed_potato9", 9);

    // Potato Brick
    public static final Block BLOCK_POTATO_BRICKS = new BlockPotatoBricks();
}
