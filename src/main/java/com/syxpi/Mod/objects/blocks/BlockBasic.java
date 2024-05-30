package com.syxpi.Mod.objects.blocks;


import com.syxpi.Mod.ModLoad;
import com.syxpi.Mod.Util.interfaces.IHasModel;
import com.syxpi.Mod.init.BlockInit;
import com.syxpi.Mod.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBasic extends Block implements IHasModel {
    public BlockBasic(String name, Material material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ModLoad.CreativeTab);
        setHardness(2.0F);
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    public void registerModels()
    {
        ModLoad.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
    }
}
