using System;
using System.Collections.Generic;

/***
 * RoleInitialTbl.cs
 * RoleInitialCfg.cs
 *
 * @Author: abaojin
 */
namespace Config
{
	public class RoleInitialTbl
    {
		// #初始力量
		public ﻿int InitialStr {get; set; }
		// 初始敏捷
		public int InitialDex {get; set; }
		// 初始智力
		public int InitialWit {get; set; }
		// 初始体力
		public int InitialVit {get; set; }
		// 初始物攻下限
		public int InitialAtkMin {get; set; }
		// 初始物攻上限
		public int InitialAtkMax {get; set; }
		// 初始物理防御
		public int InitialDef {get; set; }
		// 初始魔法防御
		public int InitialMdef {get; set; }
		// 初始魔攻下限
		public int InitialMtkMin {get; set; }
		// 初始魔攻上限
		public int InitialMtkMax {get; set; }
		// 初始生命上限
		public int InitialHp {get; set; }
		// 初始幸运一击概率
		public int InitialCrtChance {get; set; }
		// 初始幸运一击倍率
		public int InitialCrtBonus {get; set; }
		// 初始卓越一击
		public int InitialBrilliantChance {get; set; }
		// 初始物理护甲穿透
		public int InitialDefPierce {get; set; }
		// 初始魔法护甲穿透
		public int InitialMdefPierce {get; set; }
		// 初始无视防御概率
		public int InitialIgnoreAllDef {get; set; }
		// 初始双倍伤害概率
		public int InitialDoubleChance {get; set; }
		// 初始移动速度(厘米/秒)
		public int InitialMoveSpeed {get; set; }
		// 初始对BOSS护甲伤害提升
		public int InitialBonusToArmor {get; set; }
		// 初始对怪物伤害提升
		public int InitialBonusToMonster {get; set; }
		// 初始经验提升
		public int InitialExpUp {get; set; }
		// 初始抗幸运一击概率
		public int InitialCrtChanceResist {get; set; }
		// 初始抗幸运一击伤害
		public int InitialCrtBonusResist {get; set; }
		// 初始反伤比例
		public int InitialReboundDmg {get; set; }
		// 初始生命值提升百分比
		public int InitialHpBonus {get; set; }
		// 初始伤害减少百分比
		public int InitialDmgReduce {get; set; }
		// 初始击杀怪物后恢复生命
		public int InitialKillCure {get; set; }
		// 初始攻击力增加百分比
		public int InitialAllAtkBonus {get; set; }
		// 初始mf值
		public int InitialMF {get; set; }
		
	}
	
    public class RoleInitialCfg
    {
		public const string FILENAME = "RoleInitial";
		public Dictionary<int, BaseTbl> Init()
		{
			Table table = TableLoad.LoadTbl(FILENAME);
			if(table == null)
			{
				return null;
			}
			var dict = new Dictionary<int, BaseTbl>();
			int count = table.records.Count;
			for(int i = 0; i < count; ++i)
			{
				RoleInitialTbl record = new RoleInitialTbl();
				
				record.InitialDex = table.GetInt(i, "InitialDex");
				record.InitialWit = table.GetInt(i, "InitialWit");
				record.InitialVit = table.GetInt(i, "InitialVit");
				record.InitialAtkMin = table.GetInt(i, "InitialAtkMin");
				record.InitialAtkMax = table.GetInt(i, "InitialAtkMax");
				record.InitialDef = table.GetInt(i, "InitialDef");
				record.InitialMdef = table.GetInt(i, "InitialMdef");
				record.InitialMtkMin = table.GetInt(i, "InitialMtkMin");
				record.InitialMtkMax = table.GetInt(i, "InitialMtkMax");
				record.InitialHp = table.GetInt(i, "InitialHp");
				record.InitialCrtChance = table.GetInt(i, "InitialCrtChance");
				record.InitialCrtBonus = table.GetInt(i, "InitialCrtBonus");
				record.InitialBrilliantChance = table.GetInt(i, "InitialBrilliantChance");
				record.InitialDefPierce = table.GetInt(i, "InitialDefPierce");
				record.InitialMdefPierce = table.GetInt(i, "InitialMdefPierce");
				record.InitialIgnoreAllDef = table.GetInt(i, "InitialIgnoreAllDef");
				record.InitialDoubleChance = table.GetInt(i, "InitialDoubleChance");
				record.InitialMoveSpeed = table.GetInt(i, "InitialMoveSpeed");
				record.InitialBonusToArmor = table.GetInt(i, "InitialBonusToArmor");
				record.InitialBonusToMonster = table.GetInt(i, "InitialBonusToMonster");
				record.InitialExpUp = table.GetInt(i, "InitialExpUp");
				record.InitialCrtChanceResist = table.GetInt(i, "InitialCrtChanceResist");
				record.InitialCrtBonusResist = table.GetInt(i, "InitialCrtBonusResist");
				record.InitialReboundDmg = table.GetInt(i, "InitialReboundDmg");
				record.InitialHpBonus = table.GetInt(i, "InitialHpBonus");
				record.InitialDmgReduce = table.GetInt(i, "InitialDmgReduce");
				record.InitialKillCure = table.GetInt(i, "InitialKillCure");
				record.InitialAllAtkBonus = table.GetInt(i, "InitialAllAtkBonus");
				record.InitialMF = table.GetInt(i, "InitialMF");
				
				if(!dict.ContainsKey(record.Id))
				{
					continue;
				}
				dict.Add(record.Id, record);
			}
			return dict;
		}	
	}
}