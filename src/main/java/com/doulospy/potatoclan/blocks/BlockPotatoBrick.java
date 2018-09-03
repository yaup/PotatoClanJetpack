package com.doulospy.potatoclan.blocks;

import com.doulospy.potatoclan.Main;
import com.doulospy.potatoclan.init.ModMaterials;
import net.minecraft.block.SoundType;

public class BlockPotatoBrick extends BlockBase {

    public BlockPotatoBrick() {
        super("potato_brick", ModMaterials.POTATO_BRICK, Main.creativeTab);

        setSoundType(SoundType.STONE);
        setHardness(2);
        setResistance(40);  // almost obsidian!
        setHarvestLevel("pickaxe", 0);
    }
}
