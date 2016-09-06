/***
 * SummonMonsterTbl.cpp
 * SummonMonsterCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct SummonMonsterTbl
    {
		// #主键
		public ﻿int Id;
		// 召唤物名称
		public string Name;
		// 怪物伤害类型1物理2魔法
		public int DamageType;
		// 模型文件路径
		public string Model;
		// 召唤物拥有的技能
		public int SkillId;
		// 死亡效果（没有为空）
		public string DeadEffect;
		// 死亡音效（音效表ID）
		public int DeadSound;
		// 攻击音效（音效表ID）
		public int AttackSound;
		// 待机音效（音效表ID）
		public int WaitSound;
		// 被击音效(音效ID)
		public int HitSound;
		// 力量
		public int Str;
		// 等级加值
		public int StrLevelup;
		// 敏捷
		public int Dex;
		// 等级加值
		public int DexLevelup;
		// 智力
		public int Wit;
		// 等级加值
		public int WitLevelup;
		// 体力
		public int Vit;
		// 等级加值
		public int VitLevelup;
		// 物攻下限
		public int AtkMin;
		// 等级加值
		public int AtkMinLevelup;
		// 物攻上限
		public int AtkMax;
		// 等级加值
		public int AtkMaxLevelup;
		// 物理防御
		public int Def;
		// 等级加值
		public int DefLevelup;
		// 魔法防御
		public int Mdef;
		// 等级加值
		public int MdefLevelup;
		// 魔攻下限
		public int MtkMin;
		// 等级加值
		public int MtkMinLevelup;
		// 魔攻上限
		public int MtkMax;
		// 等级加值
		public int MtkMaxLevelup;
		// 生命上限
		public int Hp;
		// 等级加值
		public int HpLevelup;
		// 幸运一击概率
		public int CrtChance;
		// 等级加值
		public int CrtChanceLevelup;
		// 幸运一击倍率
		public int CrtBonus;
		// 等级加值
		public int CrtBonusLevelup;
		// 卓越一击概率
		public int BrilliantChance;
		// 等级加值
		public int BrilliantChanceLevelup;
		// 物理护甲穿透
		public int DefPierce;
		// 等级加值
		public int DefPierceLevelup;
		// 魔法护甲穿透
		public int MdefPierce;
		// 等级加值
		public int MdefPierceLevelup;
		// 无视防御概率
		public int IgnoreAllDef;
		// 等级加值
		public int IgnoreAllDefLevelup;
		// 双倍伤害概率
		public int DoubleChance;
		// 等级加值
		public int DoubleChanceLevelup;
		// 移动速度
		public int MoveSpeed;
		// 等级加值
		public int MoveSpeedLevelup;
		// 对BOSS护甲伤害提升
		public int BonusToArmor;
		// 等级加值
		public int BonusToArmorLevelup;
		// 对怪物伤害提升
		public int BonusToMonster;
		// 等级加值
		public int BonusToMonsterLevelup;
		// 经验提升
		public int ExpUp;
		// 等级加值
		public int ExpUpLevelup;
		// 抗幸运一击概率
		public int CrtChanceResist;
		// 等级加值
		public int CrtChanceResistLevelup;
		// 抗幸运一击伤害
		public int CrtBonusResist;
		// 等级加值
		public int CrtBonusResistLevelup;
		// 反伤比例
		public int ReboundDmg;
		// 等级加值
		public int ReboundDmgLevelup;
		// 生命值提升百分比
		public int HpBonus;
		// 等级加值
		public int HpBonusLevelup;
		// 伤害减少百分比
		public int DmgReduce;
		// 等级加值
		public int DmgReduceLevelup;
		// 击杀怪物后恢复生命
		public int KillCure;
		// 等级加值
		public int KillCureLevelup;
		// 攻击力增加百分比
		public int AllAtkBonus;
		// 等级加值
		public int AllAtkBonusLevelup;
		// 掉宝加成值
		public int MF;
		// 等级加值
		public int MFLevelup;
		
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