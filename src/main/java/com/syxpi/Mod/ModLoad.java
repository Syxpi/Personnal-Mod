package com.syxpi.Mod;

import com.syxpi.Mod.Util.Reference;
import com.syxpi.Mod.Util.handlers.RegistryHandler;
import com.syxpi.Mod.proxy.CommonProxy;
import com.syxpi.Mod.tabs.CreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class ModLoad
{

    public static final CreativeTabs CreativeTab = new CreativeTab("syxpimod");

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    public static Logger logger;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent init)
    {
        logger = init.getModLog();

        proxy.preInit();
    }
    @Mod.EventHandler
    public static void init(FMLInitializationEvent init)
    {
        RegistryHandler.InitRegistries();
    }
    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent init)
    {
    }
}

