package com.djlc.gfTNT;

import com.djlc.gfTNT.blocks.GFTNTBlocks;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = GFTNT.MODID, version = GFTNT.VERSION)
public class GFTNT {

	@Instance("GFTNT")
	public static final String MODID = "gftnt";
	public static final String VERSION = "1.0.0";

	@EventHandler
	public void preInit( FMLPreInitializationEvent e ) {
		// Resister """"GFTNT"""" Blocks
		GFTNTBlocks.resister();
	}

	@EventHandler
	public void Init( FMLInitializationEvent e ) {
		// Resister """"GFTNT"""" Recipes
		Recipes.register();
	}
}
