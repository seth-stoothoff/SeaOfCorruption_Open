package ru.liahim.mist.init;

import static ru.liahim.mist.api.block.MistBlocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import ru.liahim.mist.api.block.IShiftPlaceable;
import ru.liahim.mist.api.registry.MistRegistry;
import ru.liahim.mist.block.MistAcidSand;
import ru.liahim.mist.block.MistBlock;
import ru.liahim.mist.block.MistFloatingMat;
import ru.liahim.mist.block.MistAcidDirt;
import ru.liahim.mist.block.MistAcidGrass;
import ru.liahim.mist.block.MistBlockSlabStone;
import ru.liahim.mist.block.MistBlockSlabWood;
import ru.liahim.mist.block.MistBlockStairs;
import ru.liahim.mist.block.MistBlockStairsColored;
import ru.liahim.mist.block.MistBlockStep;
import ru.liahim.mist.block.MistBlockStepColored;
import ru.liahim.mist.block.MistBlockBranch;
import ru.liahim.mist.block.MistClay;
import ru.liahim.mist.block.MistCobblestone;
import ru.liahim.mist.block.MistDirt;
import ru.liahim.mist.block.MistFarmland;
import ru.liahim.mist.block.MistFarmland_H;
import ru.liahim.mist.block.MistFilterCoalBlock;
import ru.liahim.mist.block.MistGrass;
import ru.liahim.mist.block.MistGravel;
import ru.liahim.mist.block.MistHumus_Dirt;
import ru.liahim.mist.block.MistHumus_Grass;
import ru.liahim.mist.block.MistLatexBlock;
import ru.liahim.mist.block.MistLooseRock;
import ru.liahim.mist.block.MistMulchBlock;
import ru.liahim.mist.block.MistNiobiumBlock;
import ru.liahim.mist.block.MistOre;
import ru.liahim.mist.block.MistPeat;
import ru.liahim.mist.block.MistPortal;
import ru.liahim.mist.block.MistPortalStone;
import ru.liahim.mist.block.MistRubberBlock;
import ru.liahim.mist.block.MistSaltpeterOre;
import ru.liahim.mist.block.MistSand;
import ru.liahim.mist.block.MistSapropel;
import ru.liahim.mist.block.MistSoapBlock;
import ru.liahim.mist.block.MistStoneUpper;
import ru.liahim.mist.block.MistTallowBlock;
import ru.liahim.mist.block.MistStoneBasic;
import ru.liahim.mist.block.MistStonePorous;
import ru.liahim.mist.block.MistTreeLeaves;
import ru.liahim.mist.block.MistTreeLeavesConifers;
import ru.liahim.mist.block.MistTreeLeavesSpreading;
import ru.liahim.mist.block.MistTreeLeavesWeeping;
import ru.liahim.mist.block.MistTreeSapling;
import ru.liahim.mist.block.MistTreeTrunk;
import ru.liahim.mist.block.MistOreUpper;
import ru.liahim.mist.block.MistAcidBlock;
import ru.liahim.mist.block.MistWoodBlock;
import ru.liahim.mist.block.downplant.MistSponge;
import ru.liahim.mist.block.gizmos.Remains;
import ru.liahim.mist.block.gizmos.MistFurnace;
import ru.liahim.mist.block.gizmos.MistLatexPot;
import ru.liahim.mist.block.gizmos.MistChest;
import ru.liahim.mist.block.gizmos.MistCampStick;
import ru.liahim.mist.block.gizmos.MistCampfire;
import ru.liahim.mist.block.gizmos.MistCompostHeap;
import ru.liahim.mist.block.gizmos.MistFlowerPot;
import ru.liahim.mist.block.gizmos.MistUrn;
import ru.liahim.mist.block.tree.*;
import ru.liahim.mist.block.upperplant.MistDesertCotton;
import ru.liahim.mist.block.upperplant.MistMushroom;
import ru.liahim.mist.block.upperplant.MistMushroom_0;
import ru.liahim.mist.block.upperplant.MistMushroom_1;
import ru.liahim.mist.block.upperplant.MistMycelium;
import ru.liahim.mist.block.upperplant.MistNightberry;
import ru.liahim.mist.block.upperplant.MistTinderFungus;
import ru.liahim.mist.common.Mist;
import ru.liahim.mist.fluid.MistAcid;
import ru.liahim.mist.item.ItemMistBranchBlock;
import ru.liahim.mist.item.ItemMistClay;
import ru.liahim.mist.item.ItemMistMossy;
import ru.liahim.mist.item.ItemMistFloatingMat;
import ru.liahim.mist.item.ItemMistGenderNameBlock;
import ru.liahim.mist.item.ItemMistMycelium;
import ru.liahim.mist.item.ItemMistPortalStone;
import ru.liahim.mist.item.ItemMistSaltpeterOre;
import ru.liahim.mist.item.ItemMistSand;
import ru.liahim.mist.item.ItemMistSapropel;
import ru.liahim.mist.item.ItemMistSingleNameBlock;
import ru.liahim.mist.item.ItemMistSlab;
import ru.liahim.mist.item.ItemMistSlabMoss;
import ru.liahim.mist.item.ItemMistSponge;
import ru.liahim.mist.item.ItemMistStairs;
import ru.liahim.mist.item.ItemMistStep;
import ru.liahim.mist.item.ItemMistTreeSapling;
import ru.liahim.mist.item.ItemMistUrn;
import ru.liahim.mist.item.ItemMistWoodBlock;
import ru.liahim.mist.world.MistWorld;

public class ModBlocks {

	static CreativeTabs tab = Mist.mistTab;

	public static void registerBlocks() {
		Mist.logger.info("Start to initialize Blocks");
		STONE = registerBlock(new MistStoneUpper(), "stone", tab);
		STONE_POROUS = registerBlock(new MistStonePorous(), "stone_porous", tab);
		STONE_BASIC = registerBlock(new MistStoneBasic(), "stone_basic", tab);
		LOOSE_ROCK = registerBlockWithoutItem(new MistLooseRock(), "loose_rock", null);
		COBBLESTONE = registerBlockWithoutItem(new MistCobblestone(), "cobblestone", tab);
		registerItemBlock(new ItemMistMossy(COBBLESTONE));
		GRAVEL = registerBlock(new MistGravel(), "gravel", tab);
		SAND = (MistSand) registerBlockWithoutItem(new MistSand(), "sand", tab);
		registerItemBlock(new ItemMistSand(SAND));
		ACID_SAND = (MistAcidSand) registerBlockWithoutItem(new MistAcidSand(), "acid_sand", tab);
		registerItemBlock(new ItemMistGenderNameBlock(ACID_SAND));
		CLAY = (MistClay) registerBlockWithoutItem(new MistClay(), "clay", tab);
		registerItemBlock(new ItemMistClay(CLAY));
		FLOATING_MAT = (MistFloatingMat) registerBlockWithoutItem(new MistFloatingMat(), "floating_mat", tab);
		registerItemBlock(new ItemMistFloatingMat(FLOATING_MAT));
		PEAT = (MistPeat) registerBlockWithoutItem(new MistPeat(), "peat", tab);
		registerItemBlock(new ItemMistGenderNameBlock(PEAT));
		SAPROPEL = (MistSapropel) registerBlockWithoutItem(new MistSapropel(), "sapropel", tab);
		registerItemBlock(new ItemMistSapropel(SAPROPEL));
		/**Ore*/
		FILTER_COAL_ORE = registerBlock(new MistOreUpper(100.0F, 1000.0F, 2), "filter_coal_ore", tab);
		BIO_SHALE_ORE = registerBlock(new MistOre(5.0F, 20.0F, 1), "bio_shale_ore", tab);
		IRON_ORE = registerBlock(new MistOreUpper(100.0F, 1000.0F, 1), "iron_ore", tab);
		GOLD_ORE = registerBlock(new MistOre(5.0F, 20.0F, 2), "gold_ore", tab);
		NIOBIUM_ORE = registerBlock(new MistOre(5.0F, 20.0F, 1), "niobium_ore", tab);
		LAPIS_ORE = registerBlock(new MistOreUpper(100.0F, 1000.0F, 1), "lapis_ore", tab);
		SULFUR_ORE = registerBlock(new MistOre(5.0F, 20.0F, 1), "sulfur_ore", tab);
		SALTPETER_ORE = registerBlockWithoutItem(new MistSaltpeterOre(), "saltpeter_ore", tab);
		registerItemBlock(new ItemMistSaltpeterOre(SALTPETER_ORE));
		/**Ore Block*/
		FILTER_COAL_BLOCK = registerBlockWithoutItem(new MistFilterCoalBlock(), "filter_coal_block", tab);
		registerItemBlock(new ItemMistSingleNameBlock(FILTER_COAL_BLOCK));
		BIO_SHALE_BLOCK = registerBlock(new MistBlock(Material.ROCK, MapColor.LIME).setHardness(5.0F).setResistance(10.0F), "bio_shale_block", tab);
		NIOBIUM_BLOCK = registerBlock(new MistNiobiumBlock(), "niobium_block", tab);
		SULFUR_BLOCK = registerBlock(new MistBlock(Material.ROCK, MapColor.YELLOW).setHardness(5.0F).setResistance(10.0F), "sulfur_block", tab);
		SALTPETER_BLOCK = registerBlock(new MistBlock(Material.ROCK, MapColor.QUARTZ).setHardness(5.0F).setResistance(10.0F), "saltpeter_block", tab);
		TALLOW_BLOCK = registerBlock(new MistTallowBlock(), "tallow_block", tab);
		SOAP_BLOCK = registerBlock(new MistSoapBlock(), "soap_block", tab);
		LATEX_BLOCK = registerBlock(new MistLatexBlock(), "latex_block", tab);
		RUBBER_BLOCK = registerBlock(new MistRubberBlock(), "rubber_block", tab);
		/**Dirt*/
		COMPOST_HEAP = registerBlockWithoutItem(new MistCompostHeap(), "compost_heap", null);
		HUMUS_DIRT = (MistHumus_Dirt) registerBlockWithoutItem(new MistHumus_Dirt(0.6F, 2), "humus_dirt", tab);
		registerItemBlock(new ItemMistGenderNameBlock(HUMUS_DIRT));
		DIRT_F = (MistDirt) registerBlockWithoutItem(new MistDirt(0.5F, 2, MapColor.DIRT), "dirt_f", tab);
		registerItemBlock(new ItemMistGenderNameBlock(DIRT_F));
		DIRT_S = (MistDirt) registerBlockWithoutItem(new MistDirt(0.4F, 3, MapColor.YELLOW_STAINED_HARDENED_CLAY), "dirt_s", tab);
		registerItemBlock(new ItemMistGenderNameBlock(DIRT_S));
		DIRT_C = (MistDirt) registerBlockWithoutItem(new MistDirt(0.6F, 1, MapColor.SILVER_STAINED_HARDENED_CLAY), "dirt_c", tab);
		registerItemBlock(new ItemMistGenderNameBlock(DIRT_C));
		DIRT_R = (MistDirt) registerBlockWithoutItem(new MistDirt(0.7F, 3, MapColor.OBSIDIAN), "dirt_r", tab);
		registerItemBlock(new ItemMistGenderNameBlock(DIRT_R));
		DIRT_T = (MistDirt) registerBlockWithoutItem(new MistDirt(0.5F, 2, MapColor.ORANGE_STAINED_HARDENED_CLAY), "dirt_t", tab);
		registerItemBlock(new ItemMistGenderNameBlock(DIRT_T));
		ACID_DIRT_0 = (MistAcidDirt) registerBlockWithoutItem(new MistAcidDirt(0.7F, 1), "acid_dirt_0", tab);
		registerItemBlock(new ItemMistGenderNameBlock(ACID_DIRT_0));
		ACID_DIRT_1 = (MistAcidDirt) registerBlockWithoutItem(new MistAcidDirt(0.6F, 2), "acid_dirt_1", tab);
		registerItemBlock(new ItemMistGenderNameBlock(ACID_DIRT_1));
		ACID_DIRT_2 = (MistAcidDirt) registerBlockWithoutItem(new MistAcidDirt(0.5F, 3), "acid_dirt_2", tab);
		registerItemBlock(new ItemMistGenderNameBlock(ACID_DIRT_2));
		/**Grass*/
		HUMUS_GRASS = (MistHumus_Grass) registerBlockWithoutItem(new MistHumus_Grass(0.6F, 2), "humus_grass", tab);
		registerItemBlock(new ItemMistGenderNameBlock(HUMUS_GRASS));
		GRASS_F = (MistGrass) registerBlockWithoutItem(new MistGrass(0.5F, 2), "grass_f", tab);
		registerItemBlock(new ItemMistGenderNameBlock(GRASS_F));
		GRASS_S = (MistGrass) registerBlockWithoutItem(new MistGrass(0.4F, 3), "grass_s", tab);
		registerItemBlock(new ItemMistGenderNameBlock(GRASS_S));
		GRASS_C = (MistGrass) registerBlockWithoutItem(new MistGrass(0.6F, 1), "grass_c", tab);
		registerItemBlock(new ItemMistGenderNameBlock(GRASS_C));
		GRASS_R = (MistGrass) registerBlockWithoutItem(new MistGrass(0.7F, 3), "grass_r", tab);
		registerItemBlock(new ItemMistGenderNameBlock(GRASS_R));
		GRASS_T = (MistGrass) registerBlockWithoutItem(new MistGrass(0.5F, 2), "grass_t", tab);
		registerItemBlock(new ItemMistGenderNameBlock(GRASS_T));
		ACID_GRASS_0 = (MistAcidGrass) registerBlockWithoutItem(new MistAcidGrass(0.7F, 1), "acid_grass_0", tab);
		registerItemBlock(new ItemMistGenderNameBlock(ACID_GRASS_0));
		ACID_GRASS_1 = (MistAcidGrass) registerBlockWithoutItem(new MistAcidGrass(0.6F, 2), "acid_grass_1", tab);
		registerItemBlock(new ItemMistGenderNameBlock(ACID_GRASS_1));
		ACID_GRASS_2 = (MistAcidGrass) registerBlockWithoutItem(new MistAcidGrass(0.5F, 3), "acid_grass_2", tab);
		registerItemBlock(new ItemMistGenderNameBlock(ACID_GRASS_2));
		MULCH_BLOCK = registerBlock(new MistMulchBlock(), "mulch_block", tab);
		/**Mycelium*/
		MYCELIUM = (MistMycelium)registerBlockWithoutItem(new MistMycelium(), "mycelium", tab);
		registerItemBlock(new ItemMistMycelium(MYCELIUM));
		/**Farmland*/
		FARMLAND_H = (MistFarmland_H) registerBlockWithoutItem(new MistFarmland_H(0.6F, 2), "farmland_h", tab);
		FARMLAND_F = (MistFarmland) registerBlockWithoutItem(new MistFarmland(0.5F, 2), "farmland_f", null);
		FARMLAND_S = (MistFarmland) registerBlockWithoutItem(new MistFarmland(0.4F, 3), "farmland_s", null);
		FARMLAND_C = (MistFarmland) registerBlockWithoutItem(new MistFarmland(0.6F, 1), "farmland_c", null);
		FARMLAND_R = (MistFarmland) registerBlockWithoutItem(new MistFarmland(0.7F, 3), "farmland_r", null);
		FARMLAND_T = (MistFarmland) registerBlockWithoutItem(new MistFarmland(0.5F, 2), "farmland_t", null);
		/**Grass connect*/
		HUMUS_DIRT.setGrassBlock(HUMUS_GRASS);
		DIRT_F.setGrassBlock(GRASS_F);
		DIRT_S.setGrassBlock(GRASS_S);
		DIRT_C.setGrassBlock(GRASS_C);
		DIRT_R.setGrassBlock(GRASS_R);
		DIRT_T.setGrassBlock(GRASS_T);
		ACID_DIRT_0.setGrassBlock(ACID_GRASS_0);
		ACID_DIRT_1.setGrassBlock(ACID_GRASS_1);
		ACID_DIRT_2.setGrassBlock(ACID_GRASS_2);
		/**Soil connect*/
		HUMUS_GRASS.setSoilBlock(HUMUS_DIRT);
		GRASS_F.setSoilBlock(DIRT_F);
		GRASS_S.setSoilBlock(DIRT_S);
		GRASS_C.setSoilBlock(DIRT_C);
		GRASS_R.setSoilBlock(DIRT_R);
		GRASS_T.setSoilBlock(DIRT_T);
		ACID_GRASS_0.setSoilBlock(ACID_DIRT_0);
		ACID_GRASS_1.setSoilBlock(ACID_DIRT_1);
		ACID_GRASS_2.setSoilBlock(ACID_DIRT_2);
		FARMLAND_H.setSoilBlock(HUMUS_DIRT);
		FARMLAND_F.setSoilBlock(DIRT_F);
		FARMLAND_S.setSoilBlock(DIRT_S);
		FARMLAND_C.setSoilBlock(DIRT_C);
		FARMLAND_R.setSoilBlock(DIRT_R);
		FARMLAND_T.setSoilBlock(DIRT_T);
		/**Acid connect*/
		SAND.setAcidBlock(ACID_SAND);
		CLAY.setAcidBlock(GRAVEL);
		PEAT.setAcidBlock(ACID_DIRT_1);
		HUMUS_DIRT.setAcidBlock(ACID_DIRT_1);
		DIRT_F.setAcidBlock(ACID_DIRT_1);
		DIRT_S.setAcidBlock(ACID_DIRT_2);
		DIRT_C.setAcidBlock(ACID_DIRT_0);
		DIRT_R.setAcidBlock(ACID_DIRT_2);
		DIRT_T.setAcidBlock(ACID_DIRT_1);
		HUMUS_GRASS.setAcidBlock(ACID_DIRT_1);
		GRASS_F.setAcidBlock(ACID_DIRT_1);
		GRASS_S.setAcidBlock(ACID_DIRT_2);
		GRASS_C.setAcidBlock(ACID_DIRT_0);
		GRASS_R.setAcidBlock(ACID_DIRT_2);
		GRASS_T.setAcidBlock(ACID_DIRT_1);
		FARMLAND_H.setAcidBlock(ACID_DIRT_1);
		FARMLAND_F.setAcidBlock(ACID_DIRT_1);
		FARMLAND_S.setAcidBlock(ACID_DIRT_2);
		FARMLAND_C.setAcidBlock(ACID_DIRT_0);
		FARMLAND_R.setAcidBlock(ACID_DIRT_2);
		FARMLAND_T.setAcidBlock(ACID_DIRT_1);
		/**Farm connect*/
		HUMUS_DIRT.setFarmBlock(FARMLAND_H);
		DIRT_F.setFarmBlock(FARMLAND_F);
		DIRT_S.setFarmBlock(FARMLAND_S);
		DIRT_C.setFarmBlock(FARMLAND_C);
		DIRT_R.setFarmBlock(FARMLAND_R);
		DIRT_T.setFarmBlock(FARMLAND_T);
		HUMUS_GRASS.setFarmBlock(FARMLAND_H);
		GRASS_F.setFarmBlock(FARMLAND_F);
		GRASS_S.setFarmBlock(FARMLAND_S);
		GRASS_C.setFarmBlock(FARMLAND_C);
		GRASS_R.setFarmBlock(FARMLAND_R);
		GRASS_T.setFarmBlock(FARMLAND_T);
		/**Tree leaves*/
		ACACIA_LEAVES = registerBlock(new MistTreeLeavesSpreading(0xa2cb4b, 1, 3, false), "acacia_leaves", tab);
		ASPEN_LEAVES = registerBlock(new MistTreeLeaves(0xdad665, 8, 10), "aspen_leaves", tab);
		A_TREE_LEAVES = registerBlock(new MistTreeLeaves(0xc6ce68, 2, 4), "a_tree_leaves", tab);
		BIRCH_LEAVES = registerBlock(new MistTreeLeavesWeeping(0x9cb66f, 1, 4, 6), "birch_leaves", tab);
		OAK_LEAVES = registerBlock(new MistTreeLeaves(0x6fa93a, 6, 8), "oak_leaves", tab);
		PINE_LEAVES = registerBlock(new MistTreeLeaves(0x529158, 5, 9), "pine_leaves", tab);
		POPLAR_LEAVES = registerBlock(new MistTreeLeaves(0x9ac275, 4, 6), "poplar_leaves", tab);
		SNOW_LEAVES = registerBlock(new MistTreeLeaves(0x984b4b, false, 0, 2), "snow_leaves", tab);
		SPRUSE_LEAVES = registerBlock(new MistTreeLeavesConifers(0x5ba665, 8, 11), "spruce_leaves", tab);
		S_TREE_LEAVES = registerBlock(new MistTreeLeaves(0x539b71, 1, 2), "s_tree_leaves", tab);
		T_TREE_LEAVES = registerBlock(new MistTreeLeavesSpreading(0x549c7b, 5, 7, true), "t_tree_leaves", tab);
		WILLOW_LEAVES = registerBlock(new MistTreeLeavesWeeping(0x78c085, 4, 3, 5), "willow_leaves", tab);
		R_TREE_LEAVES = registerBlock(new MistTreeLeavesSpreading(0x78c085, 6, 8, false), "r_tree_leaves", tab);
		/**Tree trunks*/
		ACACIA_TRUNK = registerBlock(new MistTrunkAcacia(), "acacia_trunk", tab);
		ASPEN_TRUNK = registerBlock(new MistTrunkAspen(), "aspen_trunk", tab);
		A_TREE_TRUNK = registerBlock(new MistTrunkATree(), "a_tree_trunk", tab);
		BIRCH_TRUNK = registerBlock(new MistTrunkBirch(), "birch_trunk", tab);
		OAK_TRUNK = registerBlock(new MistTrunkOak(), "oak_trunk", tab);
		PINE_TRUNK = registerBlock(new MistTrunkPine(), "pine_trunk", tab);
		POPLAR_TRUNK = registerBlock(new MistTrunkPoplar(), "poplar_trunk", tab);
		SNOW_TRUNK = registerBlock(new MistTrunkSnow(), "snow_trunk", tab);
		SPRUSE_TRUNK = registerBlock(new MistTrunkSpruce(), "spruce_trunk", tab);
		S_TREE_TRUNK = registerBlock(new MistTrunkSTree(), "s_tree_trunk", tab);
		T_TREE_TRUNK = registerBlock(new MistTrunkTTree(), "t_tree_trunk", tab);
		WILLOW_TRUNK = registerBlock(new MistTrunkWillow(), "willow_trunk", tab);
		R_TREE_TRUNK = registerBlock(new MistTrunkRTree(), "r_tree_trunk", tab);
		/**Tree trunk connect*/
		((MistTreeLeaves)ACACIA_LEAVES).setTrunkBlock((MistTreeTrunk)ACACIA_TRUNK);
		((MistTreeLeaves)ASPEN_LEAVES).setTrunkBlock((MistTreeTrunk)ASPEN_TRUNK);
		((MistTreeLeaves)A_TREE_LEAVES).setTrunkBlock((MistTreeTrunk)A_TREE_TRUNK);
		((MistTreeLeaves)BIRCH_LEAVES).setTrunkBlock((MistTreeTrunk)BIRCH_TRUNK);
		((MistTreeLeaves)OAK_LEAVES).setTrunkBlock((MistTreeTrunk)OAK_TRUNK);
		((MistTreeLeaves)PINE_LEAVES).setTrunkBlock((MistTreeTrunk)PINE_TRUNK);
		((MistTreeLeaves)POPLAR_LEAVES).setTrunkBlock((MistTreeTrunk)POPLAR_TRUNK);
		((MistTreeLeaves)SNOW_LEAVES).setTrunkBlock((MistTreeTrunk)SNOW_TRUNK);
		((MistTreeLeaves)SPRUSE_LEAVES).setTrunkBlock((MistTreeTrunk)SPRUSE_TRUNK);
		((MistTreeLeaves)S_TREE_LEAVES).setTrunkBlock((MistTreeTrunk)S_TREE_TRUNK);
		((MistTreeLeaves)T_TREE_LEAVES).setTrunkBlock((MistTreeTrunk)T_TREE_TRUNK);
		((MistTreeLeaves)WILLOW_LEAVES).setTrunkBlock((MistTreeTrunk)WILLOW_TRUNK);
		((MistTreeLeaves)R_TREE_LEAVES).setTrunkBlock((MistTreeTrunk)R_TREE_TRUNK);
		/**Sapling*/
		TREE_SAPLING = registerBlockWithoutItem(new MistTreeSapling(), "tree_sapling", tab);
		registerItemBlock(new ItemMistTreeSapling(TREE_SAPLING));
		/**Wood block*/
		ACACIA_BLOCK = registerBlockWithoutItem(new MistWoodBlock(4.0F), "acacia_block", tab);
		registerItemBlock(new ItemMistWoodBlock(ACACIA_BLOCK));
		ASPEN_BLOCK = registerBlockWithoutItem(new MistWoodBlock(4.0F), "aspen_block", tab);
		registerItemBlock(new ItemMistWoodBlock(ASPEN_BLOCK));
		A_TREE_BLOCK = registerBlockWithoutItem(new MistWoodBlock(3.0F), "a_tree_block", tab);
		registerItemBlock(new ItemMistWoodBlock(A_TREE_BLOCK));
		BIRCH_BLOCK = registerBlockWithoutItem(new MistWoodBlock(4.0F), "birch_block", tab);
		registerItemBlock(new ItemMistWoodBlock(BIRCH_BLOCK));
		OAK_BLOCK = registerBlockWithoutItem(new MistWoodBlock(5.0F), "oak_block", tab);
		registerItemBlock(new ItemMistWoodBlock(OAK_BLOCK));
		PINE_BLOCK = registerBlockWithoutItem(new MistWoodBlock(4.0F, 30, 8), "pine_block", tab);
		registerItemBlock(new ItemMistWoodBlock(PINE_BLOCK));
		POPLAR_BLOCK = registerBlockWithoutItem(new MistWoodBlock(3.0F), "poplar_block", tab);
		registerItemBlock(new ItemMistWoodBlock(POPLAR_BLOCK));
		SNOW_BLOCK = registerBlockWithoutItem(new MistWoodBlock(5.0F, 15, 3), "snow_block", tab);
		registerItemBlock(new ItemMistWoodBlock(SNOW_BLOCK));
		SPRUCE_BLOCK = registerBlockWithoutItem(new MistWoodBlock(4.0F, 25, 7), "spruce_block", tab);
		registerItemBlock(new ItemMistWoodBlock(SPRUCE_BLOCK));
		S_TREE_BLOCK = registerBlockWithoutItem(new MistWoodBlock(10.0F, 5, 1), "s_tree_block", tab);
		registerItemBlock(new ItemMistWoodBlock(S_TREE_BLOCK));
		T_TREE_BLOCK = registerBlockWithoutItem(new MistWoodBlock(6.0F), "t_tree_block", tab);
		registerItemBlock(new ItemMistWoodBlock(T_TREE_BLOCK));
		WILLOW_BLOCK = registerBlockWithoutItem(new MistWoodBlock(4.0F, 10, 2), "willow_block", tab);
		registerItemBlock(new ItemMistWoodBlock(WILLOW_BLOCK));
		R_TREE_BLOCK = registerBlockWithoutItem(new MistWoodBlock(5.0F), "r_tree_block", tab);
		registerItemBlock(new ItemMistWoodBlock(R_TREE_BLOCK));
		/**Stairs*/
		COBBLESTONE_STAIRS = registerBlockWithoutItem(new MistBlockStairs(COBBLESTONE.getDefaultState(), true), "cobblestone_stairs", tab);
		registerItemBlock(new ItemMistStairs(COBBLESTONE_STAIRS));
		COBBLESTONE_MOSS_STAIRS = registerBlockWithoutItem(new MistBlockStairsColored(COBBLESTONE.getDefaultState().withProperty(MistCobblestone.VARIANT, MistCobblestone.EnumType.MOSSY), true), "cobblestone_moss_stairs", tab);
		registerItemBlock(new ItemMistStairs(COBBLESTONE_MOSS_STAIRS));
		ACACIA_STAIRS = registerBlockWithoutItem(new MistBlockStairs(ACACIA_BLOCK.getDefaultState()), "acacia_stairs", tab);
		registerItemBlock(new ItemMistStairs(ACACIA_STAIRS));
		ASPEN_STAIRS = registerBlockWithoutItem(new MistBlockStairs(ASPEN_BLOCK.getDefaultState()), "aspen_stairs", tab);
		registerItemBlock(new ItemMistStairs(ASPEN_STAIRS));
		A_TREE_STAIRS = registerBlockWithoutItem(new MistBlockStairs(A_TREE_BLOCK.getDefaultState()), "a_tree_stairs", tab);
		registerItemBlock(new ItemMistStairs(A_TREE_STAIRS));
		BIRCH_STAIRS = registerBlockWithoutItem(new MistBlockStairs(BIRCH_BLOCK.getDefaultState()), "birch_stairs", tab);
		registerItemBlock(new ItemMistStairs(BIRCH_STAIRS));
		OAK_STAIRS = registerBlockWithoutItem(new MistBlockStairs(OAK_BLOCK.getDefaultState()), "oak_stairs", tab);
		registerItemBlock(new ItemMistStairs(OAK_STAIRS));
		PINE_STAIRS = registerBlockWithoutItem(new MistBlockStairs(PINE_BLOCK.getDefaultState()), "pine_stairs", tab);
		registerItemBlock(new ItemMistStairs(PINE_STAIRS));
		POPLAR_STAIRS = registerBlockWithoutItem(new MistBlockStairs(POPLAR_BLOCK.getDefaultState()), "poplar_stairs", tab);
		registerItemBlock(new ItemMistStairs(POPLAR_STAIRS));
		SNOW_STAIRS = registerBlockWithoutItem(new MistBlockStairs(SNOW_BLOCK.getDefaultState()), "snow_stairs", tab);
		registerItemBlock(new ItemMistStairs(SNOW_STAIRS));
		SPRUCE_STAIRS = registerBlockWithoutItem(new MistBlockStairs(SPRUCE_BLOCK.getDefaultState()), "spruce_stairs", tab);
		registerItemBlock(new ItemMistStairs(SPRUCE_STAIRS));
		S_TREE_STAIRS = registerBlockWithoutItem(new MistBlockStairs(S_TREE_BLOCK.getDefaultState()), "s_tree_stairs", tab);
		registerItemBlock(new ItemMistStairs(S_TREE_STAIRS));
		T_TREE_STAIRS = registerBlockWithoutItem(new MistBlockStairs(T_TREE_BLOCK.getDefaultState()), "t_tree_stairs", tab);
		registerItemBlock(new ItemMistStairs(T_TREE_STAIRS));
		WILLOW_STAIRS = registerBlockWithoutItem(new MistBlockStairs(WILLOW_BLOCK.getDefaultState()), "willow_stairs", tab);
		registerItemBlock(new ItemMistStairs(WILLOW_STAIRS));
		R_TREE_STAIRS = registerBlockWithoutItem(new MistBlockStairs(R_TREE_BLOCK.getDefaultState()), "r_tree_stairs", tab);
		registerItemBlock(new ItemMistStairs(R_TREE_STAIRS));
		/**Slab*/
		COBBLESTONE_SLAB = registerBlockWithoutItem(new MistBlockSlabStone(COBBLESTONE, 3.0F, 10.0F), "cobblestone_slab", tab);
		registerItemBlock(new ItemMistSlabMoss(COBBLESTONE_SLAB));
		ACACIA_SLAB = registerBlockWithoutItem(new MistBlockSlabWood(ACACIA_BLOCK, 4.0F), "acacia_slab", tab);
		registerItemBlock(new ItemMistSlab(ACACIA_SLAB));
		ASPEN_SLAB = registerBlockWithoutItem(new MistBlockSlabWood(ASPEN_BLOCK, 4.0F), "aspen_slab", tab);
		registerItemBlock(new ItemMistSlab(ASPEN_SLAB));
		A_TREE_SLAB = registerBlockWithoutItem(new MistBlockSlabWood(A_TREE_BLOCK, 3.0F), "a_tree_slab", tab);
		registerItemBlock(new ItemMistSlab(A_TREE_SLAB));
		BIRCH_SLAB = registerBlockWithoutItem(new MistBlockSlabWood(BIRCH_BLOCK, 4.0F), "birch_slab", tab);
		registerItemBlock(new ItemMistSlab(BIRCH_SLAB));
		OAK_SLAB = registerBlockWithoutItem(new MistBlockSlabWood(OAK_BLOCK, 5.0F), "oak_slab", tab);
		registerItemBlock(new ItemMistSlab(OAK_SLAB));
		PINE_SLAB = registerBlockWithoutItem(new MistBlockSlabWood(PINE_BLOCK, 4.0F), "pine_slab", tab);
		registerItemBlock(new ItemMistSlab(PINE_SLAB));
		POPLAR_SLAB = registerBlockWithoutItem(new MistBlockSlabWood(POPLAR_BLOCK, 3.0F), "poplar_slab", tab);
		registerItemBlock(new ItemMistSlab(POPLAR_SLAB));
		SNOW_SLAB = registerBlockWithoutItem(new MistBlockSlabWood(SNOW_BLOCK, 5.0F), "snow_slab", tab);
		registerItemBlock(new ItemMistSlab(SNOW_SLAB));
		SPRUCE_SLAB = registerBlockWithoutItem(new MistBlockSlabWood(SPRUCE_BLOCK, 4.0F), "spruce_slab", tab);
		registerItemBlock(new ItemMistSlab(SPRUCE_SLAB));
		S_TREE_SLAB = registerBlockWithoutItem(new MistBlockSlabWood(S_TREE_BLOCK, 10.0F), "s_tree_slab", tab);
		registerItemBlock(new ItemMistSlab(S_TREE_SLAB));
		T_TREE_SLAB = registerBlockWithoutItem(new MistBlockSlabWood(T_TREE_BLOCK, 6.0F), "t_tree_slab", tab);
		registerItemBlock(new ItemMistSlab(T_TREE_SLAB));
		WILLOW_SLAB = registerBlockWithoutItem(new MistBlockSlabWood(WILLOW_BLOCK, 4.0F), "willow_slab", tab);
		registerItemBlock(new ItemMistSlab(WILLOW_SLAB));
		R_TREE_SLAB = registerBlockWithoutItem(new MistBlockSlabWood(R_TREE_BLOCK, 4.0F), "r_tree_slab", tab);
		registerItemBlock(new ItemMistSlab(R_TREE_SLAB));
		/**Step*/
		COBBLESTONE_STEP = registerBlockWithoutItem(new MistBlockStep(COBBLESTONE.getDefaultState(), true), "cobblestone_step", tab);
		registerItemBlock(new ItemMistStep(COBBLESTONE_STEP));
		COBBLESTONE_MOSS_STEP = registerBlockWithoutItem(new MistBlockStepColored(COBBLESTONE.getDefaultState().withProperty(MistCobblestone.VARIANT, MistCobblestone.EnumType.MOSSY), true), "cobblestone_moss_step", tab);
		registerItemBlock(new ItemMistStep(COBBLESTONE_MOSS_STEP));
		ACACIA_STEP = registerBlockWithoutItem(new MistBlockStep(ACACIA_BLOCK.getDefaultState()), "acacia_step", tab);
		registerItemBlock(new ItemMistStep(ACACIA_STEP));
		ASPEN_STEP = registerBlockWithoutItem(new MistBlockStep(ASPEN_BLOCK.getDefaultState()), "aspen_step", tab);
		registerItemBlock(new ItemMistStep(ASPEN_STEP));
		A_TREE_STEP = registerBlockWithoutItem(new MistBlockStep(A_TREE_BLOCK.getDefaultState()), "a_tree_step", tab);
		registerItemBlock(new ItemMistStep(A_TREE_STEP));
		BIRCH_STEP = registerBlockWithoutItem(new MistBlockStep(BIRCH_BLOCK.getDefaultState()), "birch_step", tab);
		registerItemBlock(new ItemMistStep(BIRCH_STEP));
		OAK_STEP = registerBlockWithoutItem(new MistBlockStep(OAK_BLOCK.getDefaultState()), "oak_step", tab);
		registerItemBlock(new ItemMistStep(OAK_STEP));
		PINE_STEP = registerBlockWithoutItem(new MistBlockStep(PINE_BLOCK.getDefaultState()), "pine_step", tab);
		registerItemBlock(new ItemMistStep(PINE_STEP));
		POPLAR_STEP = registerBlockWithoutItem(new MistBlockStep(POPLAR_BLOCK.getDefaultState()), "poplar_step", tab);
		registerItemBlock(new ItemMistStep(POPLAR_STEP));
		SNOW_STEP = registerBlockWithoutItem(new MistBlockStep(SNOW_BLOCK.getDefaultState()), "snow_step", tab);
		registerItemBlock(new ItemMistStep(SNOW_STEP));
		SPRUCE_STEP = registerBlockWithoutItem(new MistBlockStep(SPRUCE_BLOCK.getDefaultState()), "spruce_step", tab);
		registerItemBlock(new ItemMistStep(SPRUCE_STEP));
		S_TREE_STEP = registerBlockWithoutItem(new MistBlockStep(S_TREE_BLOCK.getDefaultState()), "s_tree_step", tab);
		registerItemBlock(new ItemMistStep(S_TREE_STEP));
		T_TREE_STEP = registerBlockWithoutItem(new MistBlockStep(T_TREE_BLOCK.getDefaultState()), "t_tree_step", tab);
		registerItemBlock(new ItemMistStep(T_TREE_STEP));
		WILLOW_STEP = registerBlockWithoutItem(new MistBlockStep(WILLOW_BLOCK.getDefaultState()), "willow_step", tab);
		registerItemBlock(new ItemMistStep(WILLOW_STEP));
		R_TREE_STEP = registerBlockWithoutItem(new MistBlockStep(R_TREE_BLOCK.getDefaultState()), "r_tree_step", tab);
		registerItemBlock(new ItemMistStep(R_TREE_STEP));
		/**Wood connect*/
		((MistWoodBlock)ACACIA_BLOCK).setStairsBlock(ACACIA_STAIRS);
		((MistWoodBlock)ACACIA_BLOCK).setSlabBlock(ACACIA_SLAB);
		((MistWoodBlock)ACACIA_BLOCK).setStepBlock(ACACIA_STEP);
		((MistWoodBlock)ASPEN_BLOCK).setStairsBlock(ASPEN_STAIRS);
		((MistWoodBlock)ASPEN_BLOCK).setSlabBlock(ASPEN_SLAB);
		((MistWoodBlock)ASPEN_BLOCK).setStepBlock(ASPEN_STEP);
		((MistWoodBlock)A_TREE_BLOCK).setStairsBlock(A_TREE_STAIRS);
		((MistWoodBlock)A_TREE_BLOCK).setSlabBlock(A_TREE_SLAB);
		((MistWoodBlock)A_TREE_BLOCK).setStepBlock(A_TREE_STEP);
		((MistWoodBlock)BIRCH_BLOCK).setStairsBlock(BIRCH_STAIRS);
		((MistWoodBlock)BIRCH_BLOCK).setSlabBlock(BIRCH_SLAB);
		((MistWoodBlock)BIRCH_BLOCK).setStepBlock(BIRCH_STEP);
		((MistWoodBlock)OAK_BLOCK).setStairsBlock(OAK_STAIRS);
		((MistWoodBlock)OAK_BLOCK).setSlabBlock(OAK_SLAB);
		((MistWoodBlock)OAK_BLOCK).setStepBlock(OAK_STEP);
		((MistWoodBlock)PINE_BLOCK).setStairsBlock(PINE_STAIRS);
		((MistWoodBlock)PINE_BLOCK).setSlabBlock(PINE_SLAB);
		((MistWoodBlock)PINE_BLOCK).setStepBlock(PINE_STEP);
		((MistWoodBlock)POPLAR_BLOCK).setStairsBlock(POPLAR_STAIRS);
		((MistWoodBlock)POPLAR_BLOCK).setSlabBlock(POPLAR_SLAB);
		((MistWoodBlock)POPLAR_BLOCK).setStepBlock(POPLAR_STEP);
		((MistWoodBlock)SNOW_BLOCK).setStairsBlock(SNOW_STAIRS);
		((MistWoodBlock)SNOW_BLOCK).setSlabBlock(SNOW_SLAB);
		((MistWoodBlock)SNOW_BLOCK).setStepBlock(SNOW_STEP);
		((MistWoodBlock)SPRUCE_BLOCK).setStairsBlock(SPRUCE_STAIRS);
		((MistWoodBlock)SPRUCE_BLOCK).setSlabBlock(SPRUCE_SLAB);
		((MistWoodBlock)SPRUCE_BLOCK).setStepBlock(SPRUCE_STEP);
		((MistWoodBlock)S_TREE_BLOCK).setStairsBlock(S_TREE_STAIRS);
		((MistWoodBlock)S_TREE_BLOCK).setSlabBlock(S_TREE_SLAB);
		((MistWoodBlock)S_TREE_BLOCK).setStepBlock(S_TREE_STEP);
		((MistWoodBlock)T_TREE_BLOCK).setStairsBlock(T_TREE_STAIRS);
		((MistWoodBlock)T_TREE_BLOCK).setSlabBlock(T_TREE_SLAB);
		((MistWoodBlock)T_TREE_BLOCK).setStepBlock(T_TREE_STEP);
		((MistWoodBlock)WILLOW_BLOCK).setStairsBlock(WILLOW_STAIRS);
		((MistWoodBlock)WILLOW_BLOCK).setSlabBlock(WILLOW_SLAB);
		((MistWoodBlock)WILLOW_BLOCK).setStepBlock(WILLOW_STEP);
		((MistWoodBlock)R_TREE_BLOCK).setStairsBlock(R_TREE_STAIRS);
		((MistWoodBlock)R_TREE_BLOCK).setSlabBlock(R_TREE_SLAB);
		((MistWoodBlock)R_TREE_BLOCK).setStepBlock(R_TREE_STEP);
		/**Branch*/
		ACACIA_BRANCH = registerBlockWithoutItem(new MistBlockBranch(4.0F), "acacia_branch", tab);
		registerItemBlock(new ItemMistBranchBlock(ACACIA_BRANCH));
		ASPEN_BRANCH = registerBlockWithoutItem(new MistBlockBranch(4.0F), "aspen_branch", tab);
		registerItemBlock(new ItemMistBranchBlock(ASPEN_BRANCH));
		A_TREE_BRANCH = registerBlockWithoutItem(new MistBlockBranch(3.0F), "a_tree_branch", tab);
		registerItemBlock(new ItemMistBranchBlock(A_TREE_BRANCH));
		BIRCH_BRANCH = registerBlockWithoutItem(new MistBlockBranch(4.0F), "birch_branch", tab);
		registerItemBlock(new ItemMistBranchBlock(BIRCH_BRANCH));
		OAK_BRANCH = registerBlockWithoutItem(new MistBlockBranch(5.0F), "oak_branch", tab);
		registerItemBlock(new ItemMistBranchBlock(OAK_BRANCH));
		PINE_BRANCH = registerBlockWithoutItem(new MistBlockBranch(4.0F, 30, 8), "pine_branch", tab);
		registerItemBlock(new ItemMistBranchBlock(PINE_BRANCH));
		POPLAR_BRANCH = registerBlockWithoutItem(new MistBlockBranch(3.0F), "poplar_branch", tab);
		registerItemBlock(new ItemMistBranchBlock(POPLAR_BRANCH));
		SNOW_BRANCH = registerBlockWithoutItem(new MistBlockBranch(5.0F, 15, 3), "snow_branch", tab);
		registerItemBlock(new ItemMistBranchBlock(SNOW_BRANCH));
		SPRUCE_BRANCH = registerBlockWithoutItem(new MistBlockBranch(4.0F, 25, 7), "spruce_branch", tab);
		registerItemBlock(new ItemMistBranchBlock(SPRUCE_BRANCH));
		S_TREE_BRANCH = registerBlockWithoutItem(new MistBlockBranch(10.0F, 5, 1), "s_tree_branch", tab);
		registerItemBlock(new ItemMistBranchBlock(S_TREE_BRANCH));
		T_TREE_BRANCH = registerBlockWithoutItem(new MistBlockBranch(6.0F), "t_tree_branch", tab);
		registerItemBlock(new ItemMistBranchBlock(T_TREE_BRANCH));
		WILLOW_BRANCH = registerBlockWithoutItem(new MistBlockBranch(4.0F, 10, 2), "willow_branch", tab);
		registerItemBlock(new ItemMistBranchBlock(WILLOW_BRANCH));
		R_TREE_BRANCH = registerBlockWithoutItem(new MistBlockBranch(4.0F, 10, 2), "r_tree_branch", tab);
		registerItemBlock(new ItemMistBranchBlock(R_TREE_BRANCH));

		/**Upper plants*/
		MUSHROOMS_0 = (MistMushroom)registerBlockWithoutItem(new MistMushroom_0(), "mushrooms_0", null);
		MUSHROOMS_1 = (MistMushroom)registerBlockWithoutItem(new MistMushroom_1(), "mushrooms_1", null);
		TINDER_FUNGUS = registerBlockWithoutItem(new MistTinderFungus(), "tinder_fungus", null);
		NIGHTBERRY = registerBlockWithoutItem(new MistNightberry(), "nightberry", null);
		DESERT_COTTON = (MistDesertCotton)registerBlockWithoutItem(new MistDesertCotton(), "desert_cotton", null);

		/**Down plants*/
		SPONGE = registerBlockWithoutItem(new MistSponge(), "sponge", tab);
		registerItemBlock(new ItemMistSponge(SPONGE));
		/**Portal*/
		PORTAL = registerBlockWithoutItem(new MistPortal(), "portal", null);
		PORTAL_BASE = registerBlockWithoutItem(new MistPortalStone(false), "portal_base", tab);
		registerItemBlock(new ItemMistPortalStone(PORTAL_BASE));
		PORTAL_WORK = registerBlockWithoutItem(new MistPortalStone(true), "portal_work", null);
		/**Fluids*/
		ACID = MistAcid.instance;
		FluidRegistry.registerFluid(ACID);
		FluidRegistry.addBucketForFluid(ACID);
		ACID_BLOCK = registerFluidBlock(ACID, new MistAcidBlock(ACID), "acid_block");
		/**Gizmos*/
		CAMPFIRE = registerBlockWithoutItem(new MistCampfire(), "campfire", null);
		CAMP_STICK = registerBlockWithoutItem(new MistCampStick(), "camp_stick", null);
		FLOWER_POT = registerBlockWithoutItem(new MistFlowerPot(), "flower_pot", null);
		NIOBIUM_CHEST = registerBlock(new MistChest(MistChest.ChestType.NIOBIUM_BASIC, Material.IRON).setHardness(2).setResistance(10).setLightLevel(0.125F), "niobium_chest", tab);
		NIOBIUM_TRAPPED_CHEST = registerBlock(new MistChest(MistChest.ChestType.NIOBIUM_TRAP, Material.IRON).setHardness(2).setResistance(10).setLightLevel(0.125F), "niobium_chest_trapped", tab);
		FURNACE = registerBlock(new MistFurnace(), "furnace", tab);
		REMAINS = registerBlockWithoutItem(new Remains(), "remains_block", tab);
		registerItemBlock(new ItemMistSingleNameBlock(REMAINS));
		URN = registerBlockWithoutItem(new MistUrn(), "urn", tab);
		registerItemBlock(new ItemMistUrn(URN));
		LATEX_POT = registerBlock(new MistLatexPot(), "latex_pot", tab);
		MistWorld.setWorldBlocks();
		Mist.logger.info("Finished initializing Blocks");
	}

	private static Block registerBlock(Block block, String name, CreativeTabs tab) {
		ResourceLocation RL = new ResourceLocation(Mist.MODID, name);
		block.setRegistryName(RL).setUnlocalizedName(name).setCreativeTab(tab);
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(RL);
		ForgeRegistries.BLOCKS.register(block);
		ForgeRegistries.ITEMS.register(itemBlock);
		Mist.proxy.registerBlockColored(block);
		return checkBlock(RL);
	}

	private static Block registerBlockWithoutItem(Block block, String name, CreativeTabs tab) {
		ResourceLocation RL = new ResourceLocation(Mist.MODID, name);
		block.setRegistryName(RL).setUnlocalizedName(name).setCreativeTab(tab);
		ForgeRegistries.BLOCKS.register(block);
		Mist.proxy.registerBlockColored(block);
		return checkBlock(RL);
	}

	private static void registerItemBlock(ItemBlock itemBlock) {
		itemBlock.setRegistryName(itemBlock.getBlock().getRegistryName());
		ForgeRegistries.ITEMS.register(itemBlock);
	}

	private static Block registerFluidBlock(Fluid fluid, Block fluidBlock, String name) {
		ResourceLocation RL = new ResourceLocation(Mist.MODID, name);
		Block block = fluidBlock.setRegistryName(RL);
		ForgeRegistries.BLOCKS.register(block);
		Mist.proxy.registerFluidBlockRendering(block, name);
		fluid.setBlock(block);
		return checkBlock(RL);
	}

	private static Block checkBlock(ResourceLocation RL) {
		Block block = ForgeRegistries.BLOCKS.getValue(RL);
		if (block instanceof IShiftPlaceable) MistRegistry.addShiftPlaceableBlocks((IShiftPlaceable) block);
		return block;
	}
}