package com.doulospy.potatoclan.blocks;

import com.doulospy.potatoclan.Main;
import com.doulospy.potatoclan.init.ModMaterials;
import net.minecraft.block.SoundType;

public class BlockPotatoBlocks extends BlockBase {

    private static final int RESISTANCE_MULTIPLIER = 5;

    public BlockPotatoBlocks(String name, float level) {
        super(name, ModMaterials.SOLID_POTATO, Main.creativeTab);

        setSoundType(SoundType.CLOTH);
        setHardness(Math.max(1, level));
        setResistance(level * RESISTANCE_MULTIPLIER);
        setHarvestLevel("pickaxe", 0);
    }
}
