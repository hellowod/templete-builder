/***
 * RoleInitialTbl.cpp
 * RoleInitialCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct RoleInitialTbl
    {
		// #初始力量
		public ﻿int InitialStr;
		// 初始敏捷
		public int InitialDex;
		// 初始智力
		public int InitialWit;
		// 初始体力
		public int InitialVit;
		// 初始物攻下限
		public int InitialAtkMin;
		// 初始物攻上限
		public int InitialAtkMax;
		// 初始物理防御
		public int InitialDef;
		// 初始魔法防御
		public int InitialMdef;
		// 初始魔攻下限
		public int InitialMtkMin;
		// 初始魔攻上限
		public int InitialMtkMax;
		// 初始生命上限
		public int InitialHp;
		// 初始幸运一击概率
		public int InitialCrtChance;
		// 初始幸运一击倍率
		public int InitialCrtBonus;
		// 初始卓越一击
		public int InitialBrilliantChance;
		// 初始物理护甲穿透
		public int InitialDefPierce;
		// 初始魔法护甲穿透
		public int InitialMdefPierce;
		// 初始无视防御概率
		public int InitialIgnoreAllDef;
		// 初始双倍伤害概率
		public int InitialDoubleChance;
		// 初始移动速度(厘米/秒)
		public int InitialMoveSpeed;
		// 初始对BOSS护甲伤害提升
		public int InitialBonusToArmor;
		// 初始对怪物伤害提升
		public int InitialBonusToMonster;
		// 初始经验提升
		public int InitialExpUp;
		// 初始抗幸运一击概率
		public int InitialCrtChanceResist;
		// 初始抗幸运一击伤害
		public int InitialCrtBonusResist;
		// 初始反伤比例
		public int InitialReboundDmg;
		// 初始生命值提升百分比
		public int InitialHpBonus;
		// 初始伤害减少百分比
		public int InitialDmgReduce;
		// 初始击杀怪物后恢复生命
		public int InitialKillCure;
		// 初始攻击力增加百分比
		public int InitialAllAtkBonus;
		// 初始mf值
		public int InitialMF;
		
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