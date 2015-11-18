package com.djlc.gfTNT.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockGFTNT_MK1 extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon TopIcon;

	@SideOnly(Side.CLIENT)
	private IIcon SideIcon;

	public BlockGFTNT_MK1() {
		super(Material.tnt);

		// クリエイティブのタブ
		setCreativeTab(CreativeTabs.tabBlock);

		// システム名
		setBlockName("blockGFTNT_MK1Core");

		// ブロックのテクスチャ
		setBlockTextureName("gftnt:gftnt_mk1");

		// 硬度
		setHardness(6.0F);
		// 爆破耐性
		setResistance(1.0F);
		// 透過度
		setLightOpacity(1);
		// 光度
		setLightLevel(1.0F);
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float posX, float posY, float posZ) {
		// ブロックを右クリックした時の動作
		final int r = 2;
		for (int i = -r; i <= r; i++) {
			for (int j = -r; j <= r; j++) {
				for (int k = -r; k <= r; k++) {
					if (world.getBlock(x + i, y + j, z + k) != Blocks.bedrock) {
						if (i !=0 || j !=0 || k !=0) world.getBlock(x + i, y + j, z + k).dropBlockAsItem(world, x, y, z, 0, 0);
						world.setBlockToAir(x + i, y + j, z + k);
					}
				}
			}
		}
		return true;
	}

	@Override
	public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player) {
		// ブロックを左クリックした時の動作
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, Block neighborBlock) {
		// 周囲のブロックが更新された際の動作
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
		// ドロップするアイテムを返す
		return quantityDroppedWithBonus(fortune, random);
	}

	@Override
	public int quantityDropped(Random random) {
		//ドロップさせる量を返す
		return 1;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		this.TopIcon = par1IconRegister.registerIcon("gf_tnt:block_sample");
		this.SideIcon = par1IconRegister.registerIcon("gf_tnt:block_sample");
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2) {
		if(par1 == 0 || par1 == 1) {
			return TopIcon;
		} else {
			return SideIcon;
		}
	}
}
