using System;
using System.Collections.Generic;

/***
 * PetPassiveSkillTbl.cs
 * PetPassiveSkillCfg.cs
 *
 * @Author: AutoCode
 */
namespace Config
{
	public class PetPassiveSkillTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 技能名称
		public string Name {get; set; }
		// 静态描述
		public string Des {get; set; }
		// 技能图标
		public string Icon {get; set; }
		// 作用效果目标1 主人2 宠物自身
		public int Target {get; set; }
		// 力量
		public int Str {get; set; }
		// 升级加值
		public int StrIntensify {get; set; }
		// 敏捷
		public int Dex {get; set; }
		// 升级加值
		public int DexIntensify {get; set; }
		// 智力
		public int Wit {get; set; }
		// 升级加值
		public int WitIntensify {get; set; }
		// 体力
		public int Vit {get; set; }
		// 升级加值
		public int VitIntensify {get; set; }
		// 物攻下限
		public int AtkMin {get; set; }
		// 升级加值
		public int AtkMinIntensify {get; set; }
		// 物攻上限
		public int AtkMax {get; set; }
		// 升级加值
		public int AtkMaxIntensify {get; set; }
		// 物理防御
		public int Def {get; set; }
		// 升级加值
		public int DefIntensify {get; set; }
		// 魔法防御
		public int Mdef {get; set; }
		// 升级加值
		public int MdefIntensify {get; set; }
		// 魔攻下限
		public int MtkMin {get; set; }
		// 升级加值
		public int MtkMinIntensify {get; set; }
		// 魔攻上限
		public int MtkMax {get; set; }
		// 升级加值
		public int MtkMaxIntensify {get; set; }
		// 生命上限
		public int Hp {get; set; }
		// 升级加值
		public int HpIntensify {get; set; }
		// 幸运一击概率
		public int CrtChance {get; set; }
		// 升级加值
		public int CrtChanceIntensify {get; set; }
		// 幸运一击倍率
		public int CrtBonus {get; set; }
		// 升级加值
		public int CrtBonusIntensify {get; set; }
		// 卓越一击概率
		public int BrilliantChance {get; set; }
		// 升级加值
		public int BrilliantChanceIntensify {get; set; }
		// 物理护甲穿透
		public int DefPierce {get; set; }
		// 升级加值
		public int DefPierceIntensify {get; set; }
		// 魔法护甲穿透
		public int MdefPierce {get; set; }
		// 升级加值
		public int MdefPierceIntensify {get; set; }
		// 无视防御概率
		public int IgnoreAllDef {get; set; }
		// 升级加值
		public int IgnoreAllDefIntensify {get; set; }
		// 双倍伤害概率
		public int DoubleChance {get; set; }
		// 升级加值
		public int DoubleChanceIntensify {get; set; }
		// 移动速度
		public int MoveSpeed {get; set; }
		// 升级加值
		public int MoveSpeedIntensify {get; set; }
		// 对BOSS护甲伤害提升
		public int BonusToArmor {get; set; }
		// 升级加值
		public int BonusToArmorIntensify {get; set; }
		// 对怪物伤害提升
		public int BonusToMonster {get; set; }
		// 升级加值
		public int BonusToMonsterIntensify {get; set; }
		// 经验提升
		public int ExpUp {get; set; }
		// 升级加值
		public int ExpUpIntensify {get; set; }
		// 抗幸运一击概率
		public int CrtChanceResist {get; set; }
		// 升级加值
		public int CrtChanceResistIntensify {get; set; }
		// 抗幸运一击伤害
		public int CrtBonusResist {get; set; }
		// 升级加值
		public int CrtBonusResistIntensify {get; set; }
		// 反伤比例
		public int ReboundDmg {get; set; }
		// 升级加值
		public int ReboundDmgIntensify {get; set; }
		// 生命值提升百分比
		public int HpBonus {get; set; }
		// 升级加值
		public int HpBonusIntensify {get; set; }
		// 伤害减少百分比
		public int DmgReduce {get; set; }
		// 升级加值
		public int DmgReduceIntensify {get; set; }
		// 击杀怪物后恢复生命
		public int KillCure {get; set; }
		// 升级加值
		public int KillCureIntensify {get; set; }
		// 攻击力增加百分比
		public int AllAtkBonus {get; set; }
		// 升级加值
		public int AllAtkBonusIntensify {get; set; }
		// 掉宝加成值
		public int MF {get; set; }
		// 升级加值
		public int MFIntensify {get; set; }
		// 技能等级基础战斗力, 最终技能战斗力 = BaseBattleScore * 技能等级
		public int BaseBattleScore {get; set; }
		
	}
	
    public class PetPassiveSkillCfg
    {
		public const string FILENAME = "PetPassiveSkill";
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
				PetPassiveSkillTbl record = new PetPassiveSkillTbl();
				
				record.Name = table.GetString(i, "Name");
				record.Des = table.GetString(i, "Des");
				record.Icon = table.GetString(i, "Icon");
				record.Target = table.GetInt(i, "Target");
				record.Str = table.GetInt(i, "Str");
				record.StrIntensify = table.GetInt(i, "StrIntensify");
				record.Dex = table.GetInt(i, "Dex");
				record.DexIntensify = table.GetInt(i, "DexIntensify");
				record.Wit = table.GetInt(i, "Wit");
				record.WitIntensify = table.GetInt(i, "WitIntensify");
				record.Vit = table.GetInt(i, "Vit");
				record.VitIntensify = table.GetInt(i, "VitIntensify");
				record.AtkMin = table.GetInt(i, "AtkMin");
				record.AtkMinIntensify = table.GetInt(i, "AtkMinIntensify");
				record.AtkMax = table.GetInt(i, "AtkMax");
				record.AtkMaxIntensify = table.GetInt(i, "AtkMaxIntensify");
				record.Def = table.GetInt(i, "Def");
				record.DefIntensify = table.GetInt(i, "DefIntensify");
				record.Mdef = table.GetInt(i, "Mdef");
				record.MdefIntensify = table.GetInt(i, "MdefIntensify");
				record.MtkMin = table.GetInt(i, "MtkMin");
				record.MtkMinIntensify = table.GetInt(i, "MtkMinIntensify");
				record.MtkMax = table.GetInt(i, "MtkMax");
				record.MtkMaxIntensify = table.GetInt(i, "MtkMaxIntensify");
				record.Hp = table.GetInt(i, "Hp");
				record.HpIntensify = table.GetInt(i, "HpIntensify");
				record.CrtChance = table.GetInt(i, "CrtChance");
				record.CrtChanceIntensify = table.GetInt(i, "CrtChanceIntensify");
				record.CrtBonus = table.GetInt(i, "CrtBonus");
				record.CrtBonusIntensify = table.GetInt(i, "CrtBonusIntensify");
				record.BrilliantChance = table.GetInt(i, "BrilliantChance");
				record.BrilliantChanceIntensify = table.GetInt(i, "BrilliantChanceIntensify");
				record.DefPierce = table.GetInt(i, "DefPierce");
				record.DefPierceIntensify = table.GetInt(i, "DefPierceIntensify");
				record.MdefPierce = table.GetInt(i, "MdefPierce");
				record.MdefPierceIntensify = table.GetInt(i, "MdefPierceIntensify");
				record.IgnoreAllDef = table.GetInt(i, "IgnoreAllDef");
				record.IgnoreAllDefIntensify = table.GetInt(i, "IgnoreAllDefIntensify");
				record.DoubleChance = table.GetInt(i, "DoubleChance");
				record.DoubleChanceIntensify = table.GetInt(i, "DoubleChanceIntensify");
				record.MoveSpeed = table.GetInt(i, "MoveSpeed");
				record.MoveSpeedIntensify = table.GetInt(i, "MoveSpeedIntensify");
				record.BonusToArmor = table.GetInt(i, "BonusToArmor");
				record.BonusToArmorIntensify = table.GetInt(i, "BonusToArmorIntensify");
				record.BonusToMonster = table.GetInt(i, "BonusToMonster");
				record.BonusToMonsterIntensify = table.GetInt(i, "BonusToMonsterIntensify");
				record.ExpUp = table.GetInt(i, "ExpUp");
				record.ExpUpIntensify = table.GetInt(i, "ExpUpIntensify");
				record.CrtChanceResist = table.GetInt(i, "CrtChanceResist");
				record.CrtChanceResistIntensify = table.GetInt(i, "CrtChanceResistIntensify");
				record.CrtBonusResist = table.GetInt(i, "CrtBonusResist");
				record.CrtBonusResistIntensify = table.GetInt(i, "CrtBonusResistIntensify");
				record.ReboundDmg = table.GetInt(i, "ReboundDmg");
				record.ReboundDmgIntensify = table.GetInt(i, "ReboundDmgIntensify");
				record.HpBonus = table.GetInt(i, "HpBonus");
				record.HpBonusIntensify = table.GetInt(i, "HpBonusIntensify");
				record.DmgReduce = table.GetInt(i, "DmgReduce");
				record.DmgReduceIntensify = table.GetInt(i, "DmgReduceIntensify");
				record.KillCure = table.GetInt(i, "KillCure");
				record.KillCureIntensify = table.GetInt(i, "KillCureIntensify");
				record.AllAtkBonus = table.GetInt(i, "AllAtkBonus");
				record.AllAtkBonusIntensify = table.GetInt(i, "AllAtkBonusIntensify");
				record.MF = table.GetInt(i, "MF");
				record.MFIntensify = table.GetInt(i, "MFIntensify");
				record.BaseBattleScore = table.GetInt(i, "BaseBattleScore");
				
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