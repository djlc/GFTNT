package com.djlc.gfTNT.blocks;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

@Mod(modid="gfTNT", name="GFTNT", version="1.0")
public class BlockGFTNT_MK1Core {

	public static Block blockGFTNT_MK1Core;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		// ブロックのインスタンスを生成
		blockGFTNT_MK1Core = new BlockGFTNT_MK1();

		// ブロックの登録
		GameRegistry.registerBlock(blockGFTNT_MK1Core, "blockGFTNT_MK1Core");
	}
}
