package com.doulospy.potatoclan.init;

import com.doulospy.potatoclan.util.Reference;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterials {

    public static final Material SOLID_POTATO = new Material(MapColor.YELLOW_STAINED_HARDENED_CLAY);
    public static final Material POTATO_BRICKS = new Material(MapColor.BROWN);

    // Armor material
    public static final ItemArmor.ArmorMaterial MATERIAL_TUBEROUS_JETPACK =
            EnumHelper.addArmorMaterial("TUBEROUS", Reference.MOD_ID + ":tuberous_material", 15, new int[]{2, 5, 8, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);


}
