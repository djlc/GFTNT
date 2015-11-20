package com.djlc.gfTNT;

import com.djlc.gfTNT.blocks.GFTNTBlocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {

	// add recipes
	public static void register() {
		// Basic GFTNT MK1
		GameRegistry.addRecipe(
			new ItemStack(GFTNTBlocks.basicGFTNT_MK1),
			"222",
			"212",
			"222",
			'1', Blocks.tnt,
			'2', Items.clay_ball
		);

		// Basic GFTNT MK2
		GameRegistry.addRecipe(
			new ItemStack(GFTNTBlocks.basicGFTNT_MK2),
			"222",
			"212",
			"222",
			'1', GFTNTBlocks.basicGFTNT_MK1,
			'2', new ItemStack(Items.dye, 1, 4)
		);

		// Basic GFTNT MK3
		GameRegistry.addRecipe(
			new ItemStack(GFTNTBlocks.basicGFTNT_MK3),
			"222",
			"212",
			"222",
			'1', GFTNTBlocks.basicGFTNT_MK2,
			'2', Blocks.gold_block
		);

		// Basic GFTNT MK4
		GameRegistry.addRecipe(
			new ItemStack(GFTNTBlocks.basicGFTNT_MK4),
			"222",
			"212",
			"222",
			'1', GFTNTBlocks.basicGFTNT_MK3,
			'2', Blocks.diamond_block
		);
	}
}
