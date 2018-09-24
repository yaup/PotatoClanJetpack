package com.doulospy.potatoclan.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void init() {
        GameRegistry.addSmelting(ModBlocks.BLOCK_SOLID_POTATO, new ItemStack(ModItems.ITEM_POTATO_BRICK, 9), 1f);
    }
}
