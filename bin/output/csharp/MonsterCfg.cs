using System;
using System.Collections.Generic;

/***
 * MonsterTbl.cs
 * MonsterCfg.cs
 *
 * @Author: abaojin
 */
namespace Config
{
	public class MonsterTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 等级
		public int Levle {get; set; }
		// 程序不用的数据备注
		public string Des {get; set; }
		// 提供经验值
		public int Exp {get; set; }
		// 名称
		public string Name {get; set; }
		// 模型文件路径
		public string Model {get; set; }
		// 怪物拥有的技能
		public string SkillId {get; set; }
		// 死亡效果（没有为空）
		public int DeadEffect {get; set; }
		// 死亡音效（音效表ID）
		public int DeadSound {get; set; }
		// 攻击音效（音效表ID）
		public int AttackSound {get; set; }
		// 待机音效（音效表ID）
		public int WaitSound {get; set; }
		// 被击音效(音效ID)
		public int HitSound {get; set; }
		// 是否使用世界掉落数据
		public int IsUseWorldDrop {get; set; }
		// 掉落道具列表
		public string DropItemList {get; set; }
		// 掉落道具概率(/10000)
		public string DropChanceList {get; set; }
		// 掉落数量列表
		public string DropCountList {get; set; }
		// 掉落次数
		public int DropCount {get; set; }
		// 蓝色精英掉落道具列表
		public string BlueDropItemList {get; set; }
		// 蓝色精英掉落道具概率(/10000)
		public string BlueDropChanceList {get; set; }
		// 蓝色精英掉落数量列表
		public string BlueDropCountList {get; set; }
		// 蓝色精英掉落次数
		public int BlueDropCount {get; set; }
		// 蓝色精英怪额外附加的掉宝值, 同角色的MF值作用
		public int BlueMfBouns {get; set; }
		// 金色精英掉落道具列表
		public string GoldDropItemList {get; set; }
		// 金色精英掉落道具概率(/10000)
		public string GoldDropChanceList {get; set; }
		// 金色精英掉落数量列表
		public string GoldDropCountList {get; set; }
		// 金色精英掉落次数
		public int GoldDropCount {get; set; }
		// 金色精英怪额外附加的掉宝值, 同角色的MF值作用
		public int GoldMfBouns {get; set; }
		// 稀有度1装备掉落权重
		public int EquipmentRarity1Chance {get; set; }
		// 稀有度2装备掉落权重
		public int EquipmentRarity2Chance {get; set; }
		// 稀有度3装备掉落权重
		public int EquipmentRarity3Chance {get; set; }
		// 稀有度4装备掉落权重
		public int EquipmentRarity4Chance {get; set; }
		// 稀有度5装备掉落权重
		public int EquipmentRarity5Chance {get; set; }
		// 力量
		public int Str {get; set; }
		// 智力
		public int Wit {get; set; }
		// 物攻下限
		public int AtkMin {get; set; }
		// 物攻上限
		public int AtkMax {get; set; }
		// 魔攻下限
		public int MtkMin {get; set; }
		// 魔攻上限
		public int MtkMax {get; set; }
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
		// 攻击力增加百分比
		public int AllAtkBonus {get; set; }
		// 敏捷
		public int Dex {get; set; }
		// 体力
		public int Vit {get; set; }
		// 物理防御
		public int Def {get; set; }
		// 魔法防御
		public int Mdef {get; set; }
		// 生命值上限
		public int Hp {get; set; }
		// 血条数量
		public int HpNum {get; set; }
		// 抗幸运一击概率
		public int CrtChanceResist {get; set; }
		// 抗幸运一击伤害
		public int CrtBonusResist {get; set; }
		// 生命值提升百分比
		public int HpBonus {get; set; }
		// 伤害减少百分比
		public int DmgReduce {get; set; }
		// 反伤比例
		public int ReboundDmg {get; set; }
		// 对BOSS护甲伤害提升
		public int BonusToArmor {get; set; }
		// 对怪物伤害提升
		public int BonusToMonster {get; set; }
		// 经验提升
		public int ExpUp {get; set; }
		// 击杀怪物后恢复生命
		public int KillCure {get; set; }
		// 掉宝加成值
		public int MF {get; set; }
		// 怪物伤害类型1物理2魔法
		public int DamageType {get; set; }
		// BOO怪护盾(护甲)最大值
		public int BossShield {get; set; }
		// 特效缩放
		public float EffectScale {get; set; }
		// 视野范围半径, 单位米, 对于该范围内的敌对目标进行攻击AI
		public int ViewRange {get; set; }
		// 阴影缩放值
		public float ShadowScale {get; set; }
		// 怪物追击最大范围(米)
		public int FollowRange {get; set; }
		// 移动速度(厘米/秒)
		public int MoveSpeed {get; set; }
		// 动画速度
		public float AnimationSpeed {get; set; }
		// 精英怪缩放尺寸
		public float EliteScale {get; set; }
		// 怪物包含的光环列表, 多个光环使用下划线分隔, 刷新时随机取1个
		public string HaloList {get; set; }
		// 光环尺寸
		public int HaloScaleType {get; set; }
		
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