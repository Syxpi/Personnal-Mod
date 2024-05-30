package com.syxpi.Mod.tabs;

import com.syxpi.Mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs {
    public CreativeTab(String label) {
        super(label);
        this.setBackgroundImageName("syxpimod.png");

    }
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.SYXPI_INGOT);
    }
}