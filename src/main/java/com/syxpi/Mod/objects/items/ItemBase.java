package com.syxpi.Mod.objects.items;

import com.syxpi.Mod.ModLoad;
import com.syxpi.Mod.Util.interfaces.IHasModel;
import net.minecraft.item.Item;
import com.syxpi.Mod.init.ItemInit;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ModLoad.CreativeTab);
        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        ModLoad.proxy.registerItemRenderer(this, 0);
    }
}
