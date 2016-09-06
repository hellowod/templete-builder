/***
 * PetPassiveSkillTbl.cpp
 * PetPassiveSkillCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct PetPassiveSkillTbl
    {
		// #主键
		public ﻿int Id;
		// 技能名称
		public string Name;
		// 静态描述
		public string Des;
		// 技能图标
		public string Icon;
		// 作用效果目标1 主人2 宠物自身
		public int Target;
		// 力量
		public int Str;
		// 升级加值
		public int StrIntensify;
		// 敏捷
		public int Dex;
		// 升级加值
		public int DexIntensify;
		// 智力
		public int Wit;
		// 升级加值
		public int WitIntensify;
		// 体力
		public int Vit;
		// 升级加值
		public int VitIntensify;
		// 物攻下限
		public int AtkMin;
		// 升级加值
		public int AtkMinIntensify;
		// 物攻上限
		public int AtkMax;
		// 升级加值
		public int AtkMaxIntensify;
		// 物理防御
		public int Def;
		// 升级加值
		public int DefIntensify;
		// 魔法防御
		public int Mdef;
		// 升级加值
		public int MdefIntensify;
		// 魔攻下限
		public int MtkMin;
		// 升级加值
		public int MtkMinIntensify;
		// 魔攻上限
		public int MtkMax;
		// 升级加值
		public int MtkMaxIntensify;
		// 生命上限
		public int Hp;
		// 升级加值
		public int HpIntensify;
		// 幸运一击概率
		public int CrtChance;
		// 升级加值
		public int CrtChanceIntensify;
		// 幸运一击倍率
		public int CrtBonus;
		// 升级加值
		public int CrtBonusIntensify;
		// 卓越一击概率
		public int BrilliantChance;
		// 升级加值
		public int BrilliantChanceIntensify;
		// 物理护甲穿透
		public int DefPierce;
		// 升级加值
		public int DefPierceIntensify;
		// 魔法护甲穿透
		public int MdefPierce;
		// 升级加值
		public int MdefPierceIntensify;
		// 无视防御概率
		public int IgnoreAllDef;
		// 升级加值
		public int IgnoreAllDefIntensify;
		// 双倍伤害概率
		public int DoubleChance;
		// 升级加值
		public int DoubleChanceIntensify;
		// 移动速度
		public int MoveSpeed;
		// 升级加值
		public int MoveSpeedIntensify;
		// 对BOSS护甲伤害提升
		public int BonusToArmor;
		// 升级加值
		public int BonusToArmorIntensify;
		// 对怪物伤害提升
		public int BonusToMonster;
		// 升级加值
		public int BonusToMonsterIntensify;
		// 经验提升
		public int ExpUp;
		// 升级加值
		public int ExpUpIntensify;
		// 抗幸运一击概率
		public int CrtChanceResist;
		// 升级加值
		public int CrtChanceResistIntensify;
		// 抗幸运一击伤害
		public int CrtBonusResist;
		// 升级加值
		public int CrtBonusResistIntensify;
		// 反伤比例
		public int ReboundDmg;
		// 升级加值
		public int ReboundDmgIntensify;
		// 生命值提升百分比
		public int HpBonus;
		// 升级加值
		public int HpBonusIntensify;
		// 伤害减少百分比
		public int DmgReduce;
		// 升级加值
		public int DmgReduceIntensify;
		// 击杀怪物后恢复生命
		public int KillCure;
		// 升级加值
		public int KillCureIntensify;
		// 攻击力增加百分比
		public int AllAtkBonus;
		// 升级加值
		public int AllAtkBonusIntensify;
		// 掉宝加成值
		public int MF;
		// 升级加值
		public int MFIntensify;
		// 技能等级基础战斗力, 最终技能战斗力 = BaseBattleScore * 技能等级
		public int BaseBattleScore;
		
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