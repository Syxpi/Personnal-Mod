package com.syxpi.Mod.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerItemRenderer(Item item, int meta)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
    @Override
    public void registerVariantRenderer(Item item, int meta, String filename, String id)
    {
        super.registerVariantRenderer(item, meta, filename, id);
    }

    public void regsiterEntityRenderers()
    {
        super.registerEntityRenderers();
    }

    @Override
    public void preInit() {

        super.preInit();
    }
}
