using System;
using System.Collections.Generic;

/***
 * SuitPrototypeTbl.cs
 * SuitPrototypeCfg.cs
 *
 * @Author: abaojin
 */
namespace Config
{
	public class SuitPrototypeTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 套装名称
		public string Name {get; set; }
		// 套装id
		public int SuitId {get; set; }
		// 对应的套装穿戴数量
		public int Count {get; set; }
		// 力量
		public int Str {get; set; }
		// 敏捷
		public int Dex {get; set; }
		// 智力
		public int Wit {get; set; }
		// 体力
		public int Vit {get; set; }
		// 物攻下限
		public int AtkMin {get; set; }
		// 物攻上限
		public int AtkMax {get; set; }
		// 物理防御
		public int Def {get; set; }
		// 魔法防御
		public int Mdef {get; set; }
		// 魔攻下限
		public int MtkMin {get; set; }
		// 魔攻上限
		public int MtkMax {get; set; }
		// 生命上限
		public int Hp {get; set; }
		// 幸运一击概率
		public int CrtChance {get; set; }
		// 幸运一击倍率
		public int CrtBonus {get; set; }
		// 卓越一击概率
		public int BrilliantChance {get; set; }
		// 物理护甲穿透
		public int DefPierce {get; set; }
		// 魔法护甲穿透
		public int MdefPierce {get; set; }
		// 无视防御概率
		public int IgnoreAllDef {get; set; }
		// 双倍伤害概率
		public int DoubleChance {get; set; }
		// 移动速度
		public int MoveSpeed {get; set; }
		// 对BOSS护甲伤害提升
		public int BonusToArmor {get; set; }
		// 对怪物伤害提升
		public int BonusToMonster {get; set; }
		// 经验提升
		public int ExpUp {get; set; }
		// 抗幸运一击概率
		public int CrtChanceResist {get; set; }
		// 抗幸运一击伤害
		public int CrtBonusResist {get; set; }
		// 反伤比例
		public int ReboundDmg {get; set; }
		// 生命值提升百分比
		public int HpBonus {get; set; }
		// 伤害减少百分比
		public int DmgReduce {get; set; }
		// 击杀怪物后恢复生命
		public int KillCure {get; set; }
		// 攻击力增加百分比
		public int AllAtkBonus {get; set; }
		// 掉宝加成值
		public int MF {get; set; }
		
	}
	
    public class SuitPrototypeCfg
    {
		public const string FILENAME = "SuitPrototype";
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
				SuitPrototypeTbl record = new SuitPrototypeTbl();
				
				record.Name = table.GetString(i, "Name");
				record.SuitId = table.GetInt(i, "SuitId");
				record.Count = table.GetInt(i, "Count");
				record.Str = table.GetInt(i, "Str");
				record.Dex = table.GetInt(i, "Dex");
				record.Wit = table.GetInt(i, "Wit");
				record.Vit = table.GetInt(i, "Vit");
				record.AtkMin = table.GetInt(i, "AtkMin");
				record.AtkMax = table.GetInt(i, "AtkMax");
				record.Def = table.GetInt(i, "Def");
				record.Mdef = table.GetInt(i, "Mdef");
				record.MtkMin = table.GetInt(i, "MtkMin");
				record.MtkMax = table.GetInt(i, "MtkMax");
				record.Hp = table.GetInt(i, "Hp");
				record.CrtChance = table.GetInt(i, "CrtChance");
				record.CrtBonus = table.GetInt(i, "CrtBonus");
				record.BrilliantChance = table.GetInt(i, "BrilliantChance");
				record.DefPierce = table.GetInt(i, "DefPierce");
				record.MdefPierce = table.GetInt(i, "MdefPierce");
				record.IgnoreAllDef = table.GetInt(i, "IgnoreAllDef");
				record.DoubleChance = table.GetInt(i, "DoubleChance");
				record.MoveSpeed = table.GetInt(i, "MoveSpeed");
				record.BonusToArmor = table.GetInt(i, "BonusToArmor");
				record.BonusToMonster = table.GetInt(i, "BonusToMonster");
				record.ExpUp = table.GetInt(i, "ExpUp");
				record.CrtChanceResist = table.GetInt(i, "CrtChanceResist");
				record.CrtBonusResist = table.GetInt(i, "CrtBonusResist");
				record.ReboundDmg = table.GetInt(i, "ReboundDmg");
				record.HpBonus = table.GetInt(i, "HpBonus");
				record.DmgReduce = table.GetInt(i, "DmgReduce");
				record.KillCure = table.GetInt(i, "KillCure");
				record.AllAtkBonus = table.GetInt(i, "AllAtkBonus");
				record.MF = table.GetInt(i, "MF");
				
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