package com.djlc.gfTNT;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

@Mod(modid="gfTNT", name="GFTNT", version="1.0")
public class SampleBlockCore {

	public static Block blockSample;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		// ブロックのインスタンスを生成
		blockSample = new SampleBlock();

		// ブロックの登録
		GameRegistry.registerBlock(blockSample, "blockSample");
	}
}
