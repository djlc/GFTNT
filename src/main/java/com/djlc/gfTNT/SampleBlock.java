package com.djlc.gfTNT;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class SampleBlock extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon TopIcon;

	@SideOnly(Side.CLIENT)
	private IIcon SideIcon;

	public SampleBlock() {
		super(Material.rock);

		// クリエイティブのタブ
		setCreativeTab(CreativeTabs.tabBlock);

		// システム名
		setBlockName("blockSample");

		// ブロックのテクスチャ
		setBlockTextureName("gf_tnt:block_sample");

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
		return false;
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
