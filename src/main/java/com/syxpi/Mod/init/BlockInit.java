package com.syxpi.Mod.init;

import com.syxpi.Mod.objects.blocks.BlockBasic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block SYXPI_BLOCK = new BlockBasic("syxpi_block", Material.ROCK);
    public static final Block TEST_BLOCK = new BlockBasic("test_block", Material.WOOD);
    public static final Block RACK_18U = new BlockBasic("rack_18u", Material.ROCK);
}
