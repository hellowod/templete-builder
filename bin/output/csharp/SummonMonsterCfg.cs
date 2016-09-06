using System;
using System.Collections.Generic;

/***
 * SummonMonsterTbl.cs
 * SummonMonsterCfg.cs
 *
 * @Author: abaojin
 */
namespace Config
{
	public class SummonMonsterTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 召唤物名称
		public string Name {get; set; }
		// 怪物伤害类型1物理2魔法
		public int DamageType {get; set; }
		// 模型文件路径
		public string Model {get; set; }
		// 召唤物拥有的技能
		public int SkillId {get; set; }
		// 死亡效果（没有为空）
		public string DeadEffect {get; set; }
		// 死亡音效（音效表ID）
		public int DeadSound {get; set; }
		// 攻击音效（音效表ID）
		public int AttackSound {get; set; }
		// 待机音效（音效表ID）
		public int WaitSound {get; set; }
		// 被击音效(音效ID)
		public int HitSound {get; set; }
		// 力量
		public int Str {get; set; }
		// 等级加值
		public int StrLevelup {get; set; }
		// 敏捷
		public int Dex {get; set; }
		// 等级加值
		public int DexLevelup {get; set; }
		// 智力
		public int Wit {get; set; }
		// 等级加值
		public int WitLevelup {get; set; }
		// 体力
		public int Vit {get; set; }
		// 等级加值
		public int VitLevelup {get; set; }
		// 物攻下限
		public int AtkMin {get; set; }
		// 等级加值
		public int AtkMinLevelup {get; set; }
		// 物攻上限
		public int AtkMax {get; set; }
		// 等级加值
		public int AtkMaxLevelup {get; set; }
		// 物理防御
		public int Def {get; set; }
		// 等级加值
		public int DefLevelup {get; set; }
		// 魔法防御
		public int Mdef {get; set; }
		// 等级加值
		public int MdefLevelup {get; set; }
		// 魔攻下限
		public int MtkMin {get; set; }
		// 等级加值
		public int MtkMinLevelup {get; set; }
		// 魔攻上限
		public int MtkMax {get; set; }
		// 等级加值
		public int MtkMaxLevelup {get; set; }
		// 生命上限
		public int Hp {get; set; }
		// 等级加值
		public int HpLevelup {get; set; }
		// 幸运一击概率
		public int CrtChance {get; set; }
		// 等级加值
		public int CrtChanceLevelup {get; set; }
		// 幸运一击倍率
		public int CrtBonus {get; set; }
		// 等级加值
		public int CrtBonusLevelup {get; set; }
		// 卓越一击概率
		public int BrilliantChance {get; set; }
		// 等级加值
		public int BrilliantChanceLevelup {get; set; }
		// 物理护甲穿透
		public int DefPierce {get; set; }
		// 等级加值
		public int DefPierceLevelup {get; set; }
		// 魔法护甲穿透
		public int MdefPierce {get; set; }
		// 等级加值
		public int MdefPierceLevelup {get; set; }
		// 无视防御概率
		public int IgnoreAllDef {get; set; }
		// 等级加值
		public int IgnoreAllDefLevelup {get; set; }
		// 双倍伤害概率
		public int DoubleChance {get; set; }
		// 等级加值
		public int DoubleChanceLevelup {get; set; }
		// 移动速度
		public int MoveSpeed {get; set; }
		// 等级加值
		public int MoveSpeedLevelup {get; set; }
		// 对BOSS护甲伤害提升
		public int BonusToArmor {get; set; }
		// 等级加值
		public int BonusToArmorLevelup {get; set; }
		// 对怪物伤害提升
		public int BonusToMonster {get; set; }
		// 等级加值
		public int BonusToMonsterLevelup {get; set; }
		// 经验提升
		public int ExpUp {get; set; }
		// 等级加值
		public int ExpUpLevelup {get; set; }
		// 抗幸运一击概率
		public int CrtChanceResist {get; set; }
		// 等级加值
		public int CrtChanceResistLevelup {get; set; }
		// 抗幸运一击伤害
		public int CrtBonusResist {get; set; }
		// 等级加值
		public int CrtBonusResistLevelup {get; set; }
		// 反伤比例
		public int ReboundDmg {get; set; }
		// 等级加值
		public int ReboundDmgLevelup {get; set; }
		// 生命值提升百分比
		public int HpBonus {get; set; }
		// 等级加值
		public int HpBonusLevelup {get; set; }
		// 伤害减少百分比
		public int DmgReduce {get; set; }
		// 等级加值
		public int DmgReduceLevelup {get; set; }
		// 击杀怪物后恢复生命
		public int KillCure {get; set; }
		// 等级加值
		public int KillCureLevelup {get; set; }
		// 攻击力增加百分比
		public int AllAtkBonus {get; set; }
		// 等级加值
		public int AllAtkBonusLevelup {get; set; }
		// 掉宝加成值
		public int MF {get; set; }
		// 等级加值
		public int MFLevelup {get; set; }
		
	}
	
    public class SummonMonsterCfg
    {
		public const string FILENAME = "SummonMonster";
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
				SummonMonsterTbl record = new SummonMonsterTbl();
				
				record.Name = table.GetString(i, "Name");
				record.DamageType = table.GetInt(i, "DamageType");
				record.Model = table.GetString(i, "Model");
				record.SkillId = table.GetInt(i, "SkillId");
				record.DeadEffect = table.GetString(i, "DeadEffect");
				record.DeadSound = table.GetInt(i, "DeadSound");
				record.AttackSound = table.GetInt(i, "AttackSound");
				record.WaitSound = table.GetInt(i, "WaitSound");
				record.HitSound = table.GetInt(i, "HitSound");
				record.Str = table.GetInt(i, "Str");
				record.StrLevelup = table.GetInt(i, "StrLevelup");
				record.Dex = table.GetInt(i, "Dex");
				record.DexLevelup = table.GetInt(i, "DexLevelup");
				record.Wit = table.GetInt(i, "Wit");
				record.WitLevelup = table.GetInt(i, "WitLevelup");
				record.Vit = table.GetInt(i, "Vit");
				record.VitLevelup = table.GetInt(i, "VitLevelup");
				record.AtkMin = table.GetInt(i, "AtkMin");
				record.AtkMinLevelup = table.GetInt(i, "AtkMinLevelup");
				record.AtkMax = table.GetInt(i, "AtkMax");
				record.AtkMaxLevelup = table.GetInt(i, "AtkMaxLevelup");
				record.Def = table.GetInt(i, "Def");
				record.DefLevelup = table.GetInt(i, "DefLevelup");
				record.Mdef = table.GetInt(i, "Mdef");
				record.MdefLevelup = table.GetInt(i, "MdefLevelup");
				record.MtkMin = table.GetInt(i, "MtkMin");
				record.MtkMinLevelup = table.GetInt(i, "MtkMinLevelup");
				record.MtkMax = table.GetInt(i, "MtkMax");
				record.MtkMaxLevelup = table.GetInt(i, "MtkMaxLevelup");
				record.Hp = table.GetInt(i, "Hp");
				record.HpLevelup = table.GetInt(i, "HpLevelup");
				record.CrtChance = table.GetInt(i, "CrtChance");
				record.CrtChanceLevelup = table.GetInt(i, "CrtChanceLevelup");
				record.CrtBonus = table.GetInt(i, "CrtBonus");
				record.CrtBonusLevelup = table.GetInt(i, "CrtBonusLevelup");
				record.BrilliantChance = table.GetInt(i, "BrilliantChance");
				record.BrilliantChanceLevelup = table.GetInt(i, "BrilliantChanceLevelup");
				record.DefPierce = table.GetInt(i, "DefPierce");
				record.DefPierceLevelup = table.GetInt(i, "DefPierceLevelup");
				record.MdefPierce = table.GetInt(i, "MdefPierce");
				record.MdefPierceLevelup = table.GetInt(i, "MdefPierceLevelup");
				record.IgnoreAllDef = table.GetInt(i, "IgnoreAllDef");
				record.IgnoreAllDefLevelup = table.GetInt(i, "IgnoreAllDefLevelup");
				record.DoubleChance = table.GetInt(i, "DoubleChance");
				record.DoubleChanceLevelup = table.GetInt(i, "DoubleChanceLevelup");
				record.MoveSpeed = table.GetInt(i, "MoveSpeed");
				record.MoveSpeedLevelup = table.GetInt(i, "MoveSpeedLevelup");
				record.BonusToArmor = table.GetInt(i, "BonusToArmor");
				record.BonusToArmorLevelup = table.GetInt(i, "BonusToArmorLevelup");
				record.BonusToMonster = table.GetInt(i, "BonusToMonster");
				record.BonusToMonsterLevelup = table.GetInt(i, "BonusToMonsterLevelup");
				record.ExpUp = table.GetInt(i, "ExpUp");
				record.ExpUpLevelup = table.GetInt(i, "ExpUpLevelup");
				record.CrtChanceResist = table.GetInt(i, "CrtChanceResist");
				record.CrtChanceResistLevelup = table.GetInt(i, "CrtChanceResistLevelup");
				record.CrtBonusResist = table.GetInt(i, "CrtBonusResist");
				record.CrtBonusResistLevelup = table.GetInt(i, "CrtBonusResistLevelup");
				record.ReboundDmg = table.GetInt(i, "ReboundDmg");
				record.ReboundDmgLevelup = table.GetInt(i, "ReboundDmgLevelup");
				record.HpBonus = table.GetInt(i, "HpBonus");
				record.HpBonusLevelup = table.GetInt(i, "HpBonusLevelup");
				record.DmgReduce = table.GetInt(i, "DmgReduce");
				record.DmgReduceLevelup = table.GetInt(i, "DmgReduceLevelup");
				record.KillCure = table.GetInt(i, "KillCure");
				record.KillCureLevelup = table.GetInt(i, "KillCureLevelup");
				record.AllAtkBonus = table.GetInt(i, "AllAtkBonus");
				record.AllAtkBonusLevelup = table.GetInt(i, "AllAtkBonusLevelup");
				record.MF = table.GetInt(i, "MF");
				record.MFLevelup = table.GetInt(i, "MFLevelup");
				
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