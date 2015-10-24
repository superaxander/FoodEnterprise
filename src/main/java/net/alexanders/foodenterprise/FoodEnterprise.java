package net.alexanders.foodenterprise;

import net.alexanders.foodenterprise.proxy.IProxy;
import net.alexanders.foodenterprise.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION)
public class FoodEnterprise {
    @Mod.Instance("FoodEnterprise")
    public static FoodEnterprise instance = new FoodEnterprise();

    @SidedProxy(clientSide="net.alexanders.foodenterprise.proxy.ClientProxy", serverSide="net.alexanders.foodenterprise.ServerProxy")
    public static IProxy proxy;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        registerItems();
        registerBlocks();
        registerRecipes();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

    public void registerItems()
    {

    }

    public void registerBlocks()
    {

    }

    public void registerRecipes()
    {

    }
}
