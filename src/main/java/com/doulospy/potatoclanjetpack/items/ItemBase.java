package com.doulospy.potatoclanjetpack.items;

import com.doulospy.potatoclanjetpack.Main;
import com.doulospy.potatoclanjetpack.init.ModItems;
import com.doulospy.potatoclanjetpack.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TRANSPORTATION);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
