package com.doulospy.potatoclan.blocks;

import com.doulospy.potatoclan.Main;
import com.doulospy.potatoclan.init.ModBlocks;
import com.doulospy.potatoclan.init.ModItems;
import com.doulospy.potatoclan.util.IHasModel;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{

    public BlockBase(String name, Material material) {
        super(material);

        setUnlocalizedName(name);
        setRegistryName(name);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
