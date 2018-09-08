package com.doulospy.potatoclan.blocks;

import com.doulospy.potatoclan.Main;
import com.doulospy.potatoclan.init.ModMaterials;
import net.minecraft.block.SoundType;

public class BlockPotatoBricks extends BlockBase {

    public BlockPotatoBricks() {
        super("potato_bricks", ModMaterials.POTATO_BRICKS, Main.creativeTab);

        setSoundType(SoundType.STONE);
        setHardness(2);
        setResistance(40);  // almost obsidian!
        setHarvestLevel("pickaxe", 0);
    }
}
