package com.doulospy.potatoclan.items;

import com.doulospy.potatoclan.Main;
import com.doulospy.potatoclan.init.ModItems;
import com.doulospy.potatoclan.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

    public ItemBase(String name, CreativeTabs creativeTab) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(creativeTab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
