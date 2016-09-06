/***
 * CopyDifficultyTbl.cpp
 * CopyDifficultyCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct CopyDifficultyTbl
    {
		// #主键
		public ﻿int Id;
		// 程序不用的注释数据
		public string MarkDes;
		// 所属副本ID
		public int CopyId;
		// 副本难度标识
		public int DifficultyIndex;
		// 建议战力值
		public int BattleScore;
		// BOSS生命值上限加成比例
		public int BossHPBonus;
		// BOSS攻击力加成比例
		public int BossAtkBonus;
		// 普通怪物生命值上限加成比例
		public int MonsterHPBonus;
		// 普通怪物攻击力加成比例
		public int MonsterAtkBonus;
		// 体力消耗
		public int FocusCost;
		// SS评级时间要求(秒)
		public int SSTime;
		// S评级时间要求(秒)
		public int STime;
		// A评级时间要求(秒)
		public int ATime;
		// B评级时间要求(秒)
		public int BTime;
		// 副本失败时间限制(秒)
		public int FailTime;
		// 随机NPC出现概率
		public int RandomNpcChance;
		// 随机NPC商店商品数量
		public int RandomNpcGoodsCount;
		// 飞贼怪物出现概率
		public int ThiefChance;
		// 飞贼携带金币数量
		public int ThiefGold;
		// 飞贼生命值上限
		public int ThiefHP;
		// 副本内通用怪物掉落道具列表
		public string MonsterDropItemList;
		// 副本内通用怪物掉落道具概率
		public string MonsterDropChanceList;
		// 副本内通用怪物掉落数量列表
		public string MonsterDropCountList;
		// 副本内通用怪物掉落计算次数
		public int MonsterDropCount;
		// 副本通关翻牌奖励道具列表
		public string CompleteItemList;
		// 副本通关翻牌奖励道具概率列表(万分之)
		public string CompleteItemChance;
		// 副本通关翻牌奖励道具数量列表
		public string CompleteItemCount;
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
		// 蓝色精英BOSS概率/万分之
		public int BlueEliteBossChance;
		// 金色精英BOSS概率/万分之
		public int GoldEliteBossChance;
		// 蓝色精英怪数量
		public int BlueEliteMonsterCount;
		// 金色精英怪数量
		public int GoldEliteMonsterCount;
		// 宝箱可能最小数量
		public int ChestMin;
		// 宝箱可能最大数量
		public int ChestMax;
		// 宝箱Id列表
		public string ChestList;
		// 宝箱出现概率,与ChestList一一对应,表示/10000,总和应该=10000
		public string ChestChance;
		// 宠物可能出现最小数量
		public int PetMin;
		// 宠物可能出现最大数量
		public int PetMax;
		// 可用宠物列表
		public string PetList;
		// 宠物出现概率,与PetList一一对应,表示/10000,总和应该=10000
		public string PetChance;
		// 通关奖励经验值
		public int CompleteExp;
		// 通关奖励金币数量
		public int CompleteGold;
		
	}
	
    public class CopyDifficultyCfg
    {
		public const string FILENAME = "CopyDifficulty";
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
				CopyDifficultyTbl record = new CopyDifficultyTbl();
				
				record.MarkDes = table.GetString(i, "MarkDes");
				record.CopyId = table.GetInt(i, "CopyId");
				record.DifficultyIndex = table.GetInt(i, "DifficultyIndex");
				record.BattleScore = table.GetInt(i, "BattleScore");
				record.BossHPBonus = table.GetInt(i, "BossHPBonus");
				record.BossAtkBonus = table.GetInt(i, "BossAtkBonus");
				record.MonsterHPBonus = table.GetInt(i, "MonsterHPBonus");
				record.MonsterAtkBonus = table.GetInt(i, "MonsterAtkBonus");
				record.FocusCost = table.GetInt(i, "FocusCost");
				record.SSTime = table.GetInt(i, "SSTime");
				record.STime = table.GetInt(i, "STime");
				record.ATime = table.GetInt(i, "ATime");
				record.BTime = table.GetInt(i, "BTime");
				record.FailTime = table.GetInt(i, "FailTime");
				record.RandomNpcChance = table.GetInt(i, "RandomNpcChance");
				record.RandomNpcGoodsCount = table.GetInt(i, "RandomNpcGoodsCount");
				record.ThiefChance = table.GetInt(i, "ThiefChance");
				record.ThiefGold = table.GetInt(i, "ThiefGold");
				record.ThiefHP = table.GetInt(i, "ThiefHP");
				record.MonsterDropItemList = table.GetString(i, "MonsterDropItemList");
				record.MonsterDropChanceList = table.GetString(i, "MonsterDropChanceList");
				record.MonsterDropCountList = table.GetString(i, "MonsterDropCountList");
				record.MonsterDropCount = table.GetInt(i, "MonsterDropCount");
				record.CompleteItemList = table.GetString(i, "CompleteItemList");
				record.CompleteItemChance = table.GetString(i, "CompleteItemChance");
				record.CompleteItemCount = table.GetString(i, "CompleteItemCount");
				record.EquipmentRarity1Chance = table.GetInt(i, "EquipmentRarity1Chance");
				record.EquipmentRarity2Chance = table.GetInt(i, "EquipmentRarity2Chance");
				record.EquipmentRarity3Chance = table.GetInt(i, "EquipmentRarity3Chance");
				record.EquipmentRarity4Chance = table.GetInt(i, "EquipmentRarity4Chance");
				record.EquipmentRarity5Chance = table.GetInt(i, "EquipmentRarity5Chance");
				record.BlueEliteBossChance = table.GetInt(i, "BlueEliteBossChance");
				record.GoldEliteBossChance = table.GetInt(i, "GoldEliteBossChance");
				record.BlueEliteMonsterCount = table.GetInt(i, "BlueEliteMonsterCount");
				record.GoldEliteMonsterCount = table.GetInt(i, "GoldEliteMonsterCount");
				record.ChestMin = table.GetInt(i, "ChestMin");
				record.ChestMax = table.GetInt(i, "ChestMax");
				record.ChestList = table.GetString(i, "ChestList");
				record.ChestChance = table.GetString(i, "ChestChance");
				record.PetMin = table.GetInt(i, "PetMin");
				record.PetMax = table.GetInt(i, "PetMax");
				record.PetList = table.GetString(i, "PetList");
				record.PetChance = table.GetString(i, "PetChance");
				record.CompleteExp = table.GetInt(i, "CompleteExp");
				record.CompleteGold = table.GetInt(i, "CompleteGold");
				
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