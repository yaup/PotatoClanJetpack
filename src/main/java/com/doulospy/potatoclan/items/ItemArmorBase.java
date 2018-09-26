package com.doulospy.potatoclan.items;

import com.doulospy.potatoclan.Main;
import com.doulospy.potatoclan.init.ModArmor;
import com.doulospy.potatoclan.util.IHasModel;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

import static com.doulospy.potatoclan.Main.creativeTab;

public class ItemArmorBase extends ItemArmor implements IHasModel{

    public ItemArmorBase(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
        super(material, 0, slot);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(creativeTab);

        ModArmor.ARMORS.add(this);
    }

    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
