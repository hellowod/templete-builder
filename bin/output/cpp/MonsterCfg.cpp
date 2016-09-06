/***
 * MonsterTbl.cpp
 * MonsterCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct MonsterTbl
    {
		// #主键
		public ﻿int Id;
		// 等级
		public int Levle;
		// 程序不用的数据备注
		public string Des;
		// 提供经验值
		public int Exp;
		// 名称
		public string Name;
		// 模型文件路径
		public string Model;
		// 怪物拥有的技能
		public string SkillId;
		// 死亡效果（没有为空）
		public int DeadEffect;
		// 死亡音效（音效表ID）
		public int DeadSound;
		// 攻击音效（音效表ID）
		public int AttackSound;
		// 待机音效（音效表ID）
		public int WaitSound;
		// 被击音效(音效ID)
		public int HitSound;
		// 是否使用世界掉落数据
		public int IsUseWorldDrop;
		// 掉落道具列表
		public string DropItemList;
		// 掉落道具概率(/10000)
		public string DropChanceList;
		// 掉落数量列表
		public string DropCountList;
		// 掉落次数
		public int DropCount;
		// 蓝色精英掉落道具列表
		public string BlueDropItemList;
		// 蓝色精英掉落道具概率(/10000)
		public string BlueDropChanceList;
		// 蓝色精英掉落数量列表
		public string BlueDropCountList;
		// 蓝色精英掉落次数
		public int BlueDropCount;
		// 蓝色精英怪额外附加的掉宝值, 同角色的MF值作用
		public int BlueMfBouns;
		// 金色精英掉落道具列表
		public string GoldDropItemList;
		// 金色精英掉落道具概率(/10000)
		public string GoldDropChanceList;
		// 金色精英掉落数量列表
		public string GoldDropCountList;
		// 金色精英掉落次数
		public int GoldDropCount;
		// 金色精英怪额外附加的掉宝值, 同角色的MF值作用
		public int GoldMfBouns;
		// 稀有度1装备掉落权重
		public int EquipmentRarity1Chance;
		// 稀有度2装备掉落权重
		public int EquipmentRarity2Chance;
		// 稀有度3装备掉落权重
		public int EquipmentRarity3Chance;
		// 稀有度4装备掉落权重
		public int EquipmentRarity4Chance;
		// 稀有度5装备掉落权重
		public int EquipmentRarity5Chance;
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
		// 血条数量
		public int HpNum;
		// 抗幸运一击概率
		public int CrtChanceResist;
		// 抗幸运一击伤害
		public int CrtBonusResist;
		// 生命值提升百分比
		public int HpBonus;
		// 伤害减少百分比
		public int DmgReduce;
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
		// 怪物伤害类型1物理2魔法
		public int DamageType;
		// BOO怪护盾(护甲)最大值
		public int BossShield;
		// 特效缩放
		public float EffectScale;
		// 视野范围半径, 单位米, 对于该范围内的敌对目标进行攻击AI
		public int ViewRange;
		// 阴影缩放值
		public float ShadowScale;
		// 怪物追击最大范围(米)
		public int FollowRange;
		// 移动速度(厘米/秒)
		public int MoveSpeed;
		// 动画速度
		public float AnimationSpeed;
		// 精英怪缩放尺寸
		public float EliteScale;
		// 怪物包含的光环列表, 多个光环使用下划线分隔, 刷新时随机取1个
		public string HaloList;
		// 光环尺寸
		public int HaloScaleType;
		
	}
	
    public class MonsterCfg
    {
		public const string FILENAME = "Monster";
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
				MonsterTbl record = new MonsterTbl();
				
				record.Levle = table.GetInt(i, "Levle");
				record.Des = table.GetString(i, "Des");
				record.Exp = table.GetInt(i, "Exp");
				record.Name = table.GetString(i, "Name");
				record.Model = table.GetString(i, "Model");
				record.SkillId = table.GetString(i, "SkillId");
				record.DeadEffect = table.GetInt(i, "DeadEffect");
				record.DeadSound = table.GetInt(i, "DeadSound");
				record.AttackSound = table.GetInt(i, "AttackSound");
				record.WaitSound = table.GetInt(i, "WaitSound");
				record.HitSound = table.GetInt(i, "HitSound");
				record.IsUseWorldDrop = table.GetInt(i, "IsUseWorldDrop");
				record.DropItemList = table.GetString(i, "DropItemList");
				record.DropChanceList = table.GetString(i, "DropChanceList");
				record.DropCountList = table.GetString(i, "DropCountList");
				record.DropCount = table.GetInt(i, "DropCount");
				record.BlueDropItemList = table.GetString(i, "BlueDropItemList");
				record.BlueDropChanceList = table.GetString(i, "BlueDropChanceList");
				record.BlueDropCountList = table.GetString(i, "BlueDropCountList");
				record.BlueDropCount = table.GetInt(i, "BlueDropCount");
				record.BlueMfBouns = table.GetInt(i, "BlueMfBouns");
				record.GoldDropItemList = table.GetString(i, "GoldDropItemList");
				record.GoldDropChanceList = table.GetString(i, "GoldDropChanceList");
				record.GoldDropCountList = table.GetString(i, "GoldDropCountList");
				record.GoldDropCount = table.GetInt(i, "GoldDropCount");
				record.GoldMfBouns = table.GetInt(i, "GoldMfBouns");
				record.EquipmentRarity1Chance = table.GetInt(i, "EquipmentRarity1Chance");
				record.EquipmentRarity2Chance = table.GetInt(i, "EquipmentRarity2Chance");
				record.EquipmentRarity3Chance = table.GetInt(i, "EquipmentRarity3Chance");
				record.EquipmentRarity4Chance = table.GetInt(i, "EquipmentRarity4Chance");
				record.EquipmentRarity5Chance = table.GetInt(i, "EquipmentRarity5Chance");
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
				record.HpNum = table.GetInt(i, "HpNum");
				record.CrtChanceResist = table.GetInt(i, "CrtChanceResist");
				record.CrtBonusResist = table.GetInt(i, "CrtBonusResist");
				record.HpBonus = table.GetInt(i, "HpBonus");
				record.DmgReduce = table.GetInt(i, "DmgReduce");
				record.ReboundDmg = table.GetInt(i, "ReboundDmg");
				record.BonusToArmor = table.GetInt(i, "BonusToArmor");
				record.BonusToMonster = table.GetInt(i, "BonusToMonster");
				record.ExpUp = table.GetInt(i, "ExpUp");
				record.KillCure = table.GetInt(i, "KillCure");
				record.MF = table.GetInt(i, "MF");
				record.DamageType = table.GetInt(i, "DamageType");
				record.BossShield = table.GetInt(i, "BossShield");
				record.EffectScale = table.GetFloat(i, "EffectScale");
				record.ViewRange = table.GetInt(i, "ViewRange");
				record.ShadowScale = table.GetFloat(i, "ShadowScale");
				record.FollowRange = table.GetInt(i, "FollowRange");
				record.MoveSpeed = table.GetInt(i, "MoveSpeed");
				record.AnimationSpeed = table.GetFloat(i, "AnimationSpeed");
				record.EliteScale = table.GetFloat(i, "EliteScale");
				record.HaloList = table.GetString(i, "HaloList");
				record.HaloScaleType = table.GetInt(i, "HaloScaleType");
				
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