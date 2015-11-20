package com.djlc.gfTNT;

import com.djlc.gfTNT.blocks.BlockGFTNT_MK1Core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@Mod(modid="gfTNT")
public class Recipes {
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.addRecipe(
			new ItemStack(BlockGFTNT_MK1Core.blockGFTNT_MK1Core),
			"222",
			"212",
			"222",
			'1', Blocks.tnt,
			'2', Items.clay_ball
		);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
	}
}
