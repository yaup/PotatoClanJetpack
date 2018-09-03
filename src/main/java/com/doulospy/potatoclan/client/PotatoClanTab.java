package com.doulospy.potatoclan.client;

import com.doulospy.potatoclan.init.ModBlocks;
import com.doulospy.potatoclan.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PotatoClanTab extends CreativeTabs {

    public PotatoClanTab() {
        super(Reference.MOD_ID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModBlocks.BLOCK_SOLID_POTATO);
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }
}
