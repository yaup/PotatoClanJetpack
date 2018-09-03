package com.doulospy.potatoclan.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPotatoBlocks extends BlockBase {

    public BlockPotatoBlocks(String name, Material material) {
        super(name, material);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS); //TODO: update to custom tab
    }
}
