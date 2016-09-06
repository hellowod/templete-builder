/***
 * EquipmentPrototypeTbl.cpp
 * EquipmentPrototypeCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct EquipmentPrototypeTbl
    {
		// #主键和外键
		public ﻿int Id;
		// 程序不用的注释数据
		public string MarkDes;
		// 装备模型文件
		public string Model;
		// 可穿戴职业枚举
		public string Occupation;
		// 装备类型
		public int EquipType;
		// 所属套装id
		public int SuitId;
		// 装备稀有度下限
		public int RarityMin;
		// 装备稀有度上限
		public int RarityMax;
		// 是否有红色凹槽
		public int ExistRedGem;
		// 是否有绿色凹槽
		public int ExistGreenGem;
		// 是否有蓝色凹槽
		public int ExistBlueGem;
		// 是否有橙色凹槽
		public int ExistOrangeGem;
		// 力量
		public int Str;
		// 智力
		public int Wit;
		// 物攻下限
		public int AtkMin;
		// 物攻上限
		public int AtkMax;
		// 魔攻下限
		public int MtkMin;
		// 魔攻上限
		public int MtkMax;
		// 幸运一击概率
		public int CrtChance;
		// 幸运一击倍率
		public int CrtBonus;
		// 卓越一击概率
		public int BrilliantChance;
		// 物理护甲穿透
		public int DefPierce;
		// 魔法护甲穿透
		public int MdefPierce;
		// 无视防御概率
		public int IgnoreAllDef;
		// 双倍伤害概率
		public int DoubleChance;
		// 攻击力增加百分比
		public int AllAtkBonus;
		// 敏捷
		public int Dex;
		// 体力
		public int Vit;
		// 物理防御
		public int Def;
		// 魔法防御
		public int Mdef;
		// 生命值上限
		public int Hp;
		// 抗幸运一击概率
		public int CrtChanceResist;
		// 抗幸运一击伤害
		public int CrtBonusResist;
		// 生命值提升百分比
		public int HpBonus;
		// 伤害减少百分比
		public int DmgReduce;
		// 移动速度
		public int MoveSpeed;
		// 反伤比例
		public int ReboundDmg;
		// 对BOSS护甲伤害提升
		public int BonusToArmor;
		// 对怪物伤害提升
		public int BonusToMonster;
		// 经验提升
		public int ExpUp;
		// 击杀怪物后恢复生命
		public int KillCure;
		// 掉宝加成值
		public int MF;
		// 力量强化值
		public int StrIntensify;
		// 智力强化值
		public int WitIntensify;
		// 物攻下限强化值
		public int AtkMinIntensify;
		// 物攻上限强化值
		public int AtkMaxIntensify;
		// 魔攻下限强化值
		public int MtkMinIntensify;
		// 魔攻上限强化值
		public int MtkMaxIntensify;
		// 幸运一击概率/10000强化值
		public int CrtChanceIntensify;
		// 幸运一击倍率强化值
		public int CrtBonusIntensify;
		// 卓越一击概率/10000强化值
		public int BrilliantChanceIntensify;
		// 物理护甲穿透强化值
		public int DefPierceIntensify;
		// 魔法护甲穿透强化值
		public int MdefPierceIntensify;
		// 无视防御概率强化值
		public int IgnoreAllDefIntensify;
		// 双倍伤害概率强化值
		public int DoubleChanceIntensify;
		// 攻击力增加百分比强化值
		public int AllAtkBonusIntensify;
		// 敏捷强化值
		public int DexIntensify;
		// 体力强化值
		public int VitIntensify;
		// 物理防御强化值
		public int DefIntensify;
		// 魔法防御强化值
		public int MdefIntensify;
		// 生命上限强化值
		public int HpIntensify;
		// 抗幸运一击概率强化值
		public int CrtChanceResistIntensify;
		// 抗幸运一击伤害强化值
		public int CrtBonusResistIntensify;
		// 生命值提升百分比强化值
		public int HpBonusIntensify;
		// 伤害减少百分比强化值
		public int DmgReduceIntensify;
		// 移动速度强化值
		public int MoveSpeedIntensify;
		// 反伤比例强化值
		public int ReboundDmgIntensify;
		// 对BOSS护甲伤害提升强化值
		public int BonusToArmorIntensify;
		// 对怪物伤害提升强化值
		public int BonusToMonsterIntensify;
		// 经验提升强化值
		public int ExpUpIntensify;
		// 击杀怪物后恢复生命强化值
		public int KillCureIntensify;
		// 掉宝加成值强化值
		public int MFIntensify;
		// 流光ID组(ID不能为0)如n,则n至n+13表示该装备的+0至+13的流光效果数据的id
		public int StreamLightId;
		
	}
	
    public class EquipmentPrototypeCfg
    {
		public const string FILENAME = "EquipmentPrototype";
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
				EquipmentPrototypeTbl record = new EquipmentPrototypeTbl();
				
				record.MarkDes = table.GetString(i, "MarkDes");
				record.Model = table.GetString(i, "Model");
				record.Occupation = table.GetString(i, "Occupation");
				record.EquipType = table.GetInt(i, "EquipType");
				record.SuitId = table.GetInt(i, "SuitId");
				record.RarityMin = table.GetInt(i, "RarityMin");
				record.RarityMax = table.GetInt(i, "RarityMax");
				record.ExistRedGem = table.GetInt(i, "ExistRedGem");
				record.ExistGreenGem = table.GetInt(i, "ExistGreenGem");
				record.ExistBlueGem = table.GetInt(i, "ExistBlueGem");
				record.ExistOrangeGem = table.GetInt(i, "ExistOrangeGem");
				record.Str = table.GetInt(i, "Str");
				record.Wit = table.GetInt(i, "Wit");
				record.AtkMin = table.GetInt(i, "AtkMin");
				record.AtkMax = table.GetInt(i, "AtkMax");
				record.MtkMin = table.GetInt(i, "MtkMin");
				record.MtkMax = table.GetInt(i, "MtkMax");
				record.CrtChance = table.GetInt(i, "CrtChance");
				record.CrtBonus = table.GetInt(i, "CrtBonus");
				record.BrilliantChance = table.GetInt(i, "BrilliantChance");
				record.DefPierce = table.GetInt(i, "DefPierce");
				record.MdefPierce = table.GetInt(i, "MdefPierce");
				record.IgnoreAllDef = table.GetInt(i, "IgnoreAllDef");
				record.DoubleChance = table.GetInt(i, "DoubleChance");
				record.AllAtkBonus = table.GetInt(i, "AllAtkBonus");
				record.Dex = table.GetInt(i, "Dex");
				record.Vit = table.GetInt(i, "Vit");
				record.Def = table.GetInt(i, "Def");
				record.Mdef = table.GetInt(i, "Mdef");
				record.Hp = table.GetInt(i, "Hp");
				record.CrtChanceResist = table.GetInt(i, "CrtChanceResist");
				record.CrtBonusResist = table.GetInt(i, "CrtBonusResist");
				record.HpBonus = table.GetInt(i, "HpBonus");
				record.DmgReduce = table.GetInt(i, "DmgReduce");
				record.MoveSpeed = table.GetInt(i, "MoveSpeed");
				record.ReboundDmg = table.GetInt(i, "ReboundDmg");
				record.BonusToArmor = table.GetInt(i, "BonusToArmor");
				record.BonusToMonster = table.GetInt(i, "BonusToMonster");
				record.ExpUp = table.GetInt(i, "ExpUp");
				record.KillCure = table.GetInt(i, "KillCure");
				record.MF = table.GetInt(i, "MF");
				record.StrIntensify = table.GetInt(i, "StrIntensify");
				record.WitIntensify = table.GetInt(i, "WitIntensify");
				record.AtkMinIntensify = table.GetInt(i, "AtkMinIntensify");
				record.AtkMaxIntensify = table.GetInt(i, "AtkMaxIntensify");
				record.MtkMinIntensify = table.GetInt(i, "MtkMinIntensify");
				record.MtkMaxIntensify = table.GetInt(i, "MtkMaxIntensify");
				record.CrtChanceIntensify = table.GetInt(i, "CrtChanceIntensify");
				record.CrtBonusIntensify = table.GetInt(i, "CrtBonusIntensify");
				record.BrilliantChanceIntensify = table.GetInt(i, "BrilliantChanceIntensify");
				record.DefPierceIntensify = table.GetInt(i, "DefPierceIntensify");
				record.MdefPierceIntensify = table.GetInt(i, "MdefPierceIntensify");
				record.IgnoreAllDefIntensify = table.GetInt(i, "IgnoreAllDefIntensify");
				record.DoubleChanceIntensify = table.GetInt(i, "DoubleChanceIntensify");
				record.AllAtkBonusIntensify = table.GetInt(i, "AllAtkBonusIntensify");
				record.DexIntensify = table.GetInt(i, "DexIntensify");
				record.VitIntensify = table.GetInt(i, "VitIntensify");
				record.DefIntensify = table.GetInt(i, "DefIntensify");
				record.MdefIntensify = table.GetInt(i, "MdefIntensify");
				record.HpIntensify = table.GetInt(i, "HpIntensify");
				record.CrtChanceResistIntensify = table.GetInt(i, "CrtChanceResistIntensify");
				record.CrtBonusResistIntensify = table.GetInt(i, "CrtBonusResistIntensify");
				record.HpBonusIntensify = table.GetInt(i, "HpBonusIntensify");
				record.DmgReduceIntensify = table.GetInt(i, "DmgReduceIntensify");
				record.MoveSpeedIntensify = table.GetInt(i, "MoveSpeedIntensify");
				record.ReboundDmgIntensify = table.GetInt(i, "ReboundDmgIntensify");
				record.BonusToArmorIntensify = table.GetInt(i, "BonusToArmorIntensify");
				record.BonusToMonsterIntensify = table.GetInt(i, "BonusToMonsterIntensify");
				record.ExpUpIntensify = table.GetInt(i, "ExpUpIntensify");
				record.KillCureIntensify = table.GetInt(i, "KillCureIntensify");
				record.MFIntensify = table.GetInt(i, "MFIntensify");
				record.StreamLightId = table.GetInt(i, "StreamLightId");
				
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