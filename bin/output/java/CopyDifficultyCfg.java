package com.config;

import java.util.HashMap;

/***
 * CopyDifficultyTbl.java
 * CopyDifficultyCfg.java
 *
 * @Author: abaojin
 */
public class CopyDifficultyTbl
{
	// #主键
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 程序不用的注释数据
	private string MarkDes;
	
	public string getMarkDes(){
		return MarkDes
	}
	
	public void setMarkDes(string MarkDes){
		this.MarkDes = MarkDes
	}
	
	// 所属副本ID
	private int CopyId;
	
	public int getCopyId(){
		return CopyId
	}
	
	public void setCopyId(int CopyId){
		this.CopyId = CopyId
	}
	
	// 副本难度标识
	private int DifficultyIndex;
	
	public int getDifficultyIndex(){
		return DifficultyIndex
	}
	
	public void setDifficultyIndex(int DifficultyIndex){
		this.DifficultyIndex = DifficultyIndex
	}
	
	// 建议战力值
	private int BattleScore;
	
	public int getBattleScore(){
		return BattleScore
	}
	
	public void setBattleScore(int BattleScore){
		this.BattleScore = BattleScore
	}
	
	// BOSS生命值上限加成比例
	private int BossHPBonus;
	
	public int getBossHPBonus(){
		return BossHPBonus
	}
	
	public void setBossHPBonus(int BossHPBonus){
		this.BossHPBonus = BossHPBonus
	}
	
	// BOSS攻击力加成比例
	private int BossAtkBonus;
	
	public int getBossAtkBonus(){
		return BossAtkBonus
	}
	
	public void setBossAtkBonus(int BossAtkBonus){
		this.BossAtkBonus = BossAtkBonus
	}
	
	// 普通怪物生命值上限加成比例
	private int MonsterHPBonus;
	
	public int getMonsterHPBonus(){
		return MonsterHPBonus
	}
	
	public void setMonsterHPBonus(int MonsterHPBonus){
		this.MonsterHPBonus = MonsterHPBonus
	}
	
	// 普通怪物攻击力加成比例
	private int MonsterAtkBonus;
	
	public int getMonsterAtkBonus(){
		return MonsterAtkBonus
	}
	
	public void setMonsterAtkBonus(int MonsterAtkBonus){
		this.MonsterAtkBonus = MonsterAtkBonus
	}
	
	// 体力消耗
	private int FocusCost;
	
	public int getFocusCost(){
		return FocusCost
	}
	
	public void setFocusCost(int FocusCost){
		this.FocusCost = FocusCost
	}
	
	// SS评级时间要求(秒)
	private int SSTime;
	
	public int getSSTime(){
		return SSTime
	}
	
	public void setSSTime(int SSTime){
		this.SSTime = SSTime
	}
	
	// S评级时间要求(秒)
	private int STime;
	
	public int getSTime(){
		return STime
	}
	
	public void setSTime(int STime){
		this.STime = STime
	}
	
	// A评级时间要求(秒)
	private int ATime;
	
	public int getATime(){
		return ATime
	}
	
	public void setATime(int ATime){
		this.ATime = ATime
	}
	
	// B评级时间要求(秒)
	private int BTime;
	
	public int getBTime(){
		return BTime
	}
	
	public void setBTime(int BTime){
		this.BTime = BTime
	}
	
	// 副本失败时间限制(秒)
	private int FailTime;
	
	public int getFailTime(){
		return FailTime
	}
	
	public void setFailTime(int FailTime){
		this.FailTime = FailTime
	}
	
	// 随机NPC出现概率
	private int RandomNpcChance;
	
	public int getRandomNpcChance(){
		return RandomNpcChance
	}
	
	public void setRandomNpcChance(int RandomNpcChance){
		this.RandomNpcChance = RandomNpcChance
	}
	
	// 随机NPC商店商品数量
	private int RandomNpcGoodsCount;
	
	public int getRandomNpcGoodsCount(){
		return RandomNpcGoodsCount
	}
	
	public void setRandomNpcGoodsCount(int RandomNpcGoodsCount){
		this.RandomNpcGoodsCount = RandomNpcGoodsCount
	}
	
	// 飞贼怪物出现概率
	private int ThiefChance;
	
	public int getThiefChance(){
		return ThiefChance
	}
	
	public void setThiefChance(int ThiefChance){
		this.ThiefChance = ThiefChance
	}
	
	// 飞贼携带金币数量
	private int ThiefGold;
	
	public int getThiefGold(){
		return ThiefGold
	}
	
	public void setThiefGold(int ThiefGold){
		this.ThiefGold = ThiefGold
	}
	
	// 飞贼生命值上限
	private int ThiefHP;
	
	public int getThiefHP(){
		return ThiefHP
	}
	
	public void setThiefHP(int ThiefHP){
		this.ThiefHP = ThiefHP
	}
	
	// 副本内通用怪物掉落道具列表
	private string MonsterDropItemList;
	
	public string getMonsterDropItemList(){
		return MonsterDropItemList
	}
	
	public void setMonsterDropItemList(string MonsterDropItemList){
		this.MonsterDropItemList = MonsterDropItemList
	}
	
	// 副本内通用怪物掉落道具概率
	private string MonsterDropChanceList;
	
	public string getMonsterDropChanceList(){
		return MonsterDropChanceList
	}
	
	public void setMonsterDropChanceList(string MonsterDropChanceList){
		this.MonsterDropChanceList = MonsterDropChanceList
	}
	
	// 副本内通用怪物掉落数量列表
	private string MonsterDropCountList;
	
	public string getMonsterDropCountList(){
		return MonsterDropCountList
	}
	
	public void setMonsterDropCountList(string MonsterDropCountList){
		this.MonsterDropCountList = MonsterDropCountList
	}
	
	// 副本内通用怪物掉落计算次数
	private int MonsterDropCount;
	
	public int getMonsterDropCount(){
		return MonsterDropCount
	}
	
	public void setMonsterDropCount(int MonsterDropCount){
		this.MonsterDropCount = MonsterDropCount
	}
	
	// 副本通关翻牌奖励道具列表
	private string CompleteItemList;
	
	public string getCompleteItemList(){
		return CompleteItemList
	}
	
	public void setCompleteItemList(string CompleteItemList){
		this.CompleteItemList = CompleteItemList
	}
	
	// 副本通关翻牌奖励道具概率列表(万分之)
	private string CompleteItemChance;
	
	public string getCompleteItemChance(){
		return CompleteItemChance
	}
	
	public void setCompleteItemChance(string CompleteItemChance){
		this.CompleteItemChance = CompleteItemChance
	}
	
	// 副本通关翻牌奖励道具数量列表
	private string CompleteItemCount;
	
	public string getCompleteItemCount(){
		return CompleteItemCount
	}
	
	public void setCompleteItemCount(string CompleteItemCount){
		this.CompleteItemCount = CompleteItemCount
	}
	
	// 稀有度1装备掉落权重
	private int EquipmentRarity1Chance;
	
	public int getEquipmentRarity1Chance(){
		return EquipmentRarity1Chance
	}
	
	public void setEquipmentRarity1Chance(int EquipmentRarity1Chance){
		this.EquipmentRarity1Chance = EquipmentRarity1Chance
	}
	
	// 稀有度2装备掉落权重
	private int EquipmentRarity2Chance;
	
	public int getEquipmentRarity2Chance(){
		return EquipmentRarity2Chance
	}
	
	public void setEquipmentRarity2Chance(int EquipmentRarity2Chance){
		this.EquipmentRarity2Chance = EquipmentRarity2Chance
	}
	
	// 稀有度3装备掉落权重
	private int EquipmentRarity3Chance;
	
	public int getEquipmentRarity3Chance(){
		return EquipmentRarity3Chance
	}
	
	public void setEquipmentRarity3Chance(int EquipmentRarity3Chance){
		this.EquipmentRarity3Chance = EquipmentRarity3Chance
	}
	
	// 稀有度4装备掉落权重
	private int EquipmentRarity4Chance;
	
	public int getEquipmentRarity4Chance(){
		return EquipmentRarity4Chance
	}
	
	public void setEquipmentRarity4Chance(int EquipmentRarity4Chance){
		this.EquipmentRarity4Chance = EquipmentRarity4Chance
	}
	
	// 稀有度5装备掉落权重
	private int EquipmentRarity5Chance;
	
	public int getEquipmentRarity5Chance(){
		return EquipmentRarity5Chance
	}
	
	public void setEquipmentRarity5Chance(int EquipmentRarity5Chance){
		this.EquipmentRarity5Chance = EquipmentRarity5Chance
	}
	
	// 蓝色精英BOSS概率/万分之
	private int BlueEliteBossChance;
	
	public int getBlueEliteBossChance(){
		return BlueEliteBossChance
	}
	
	public void setBlueEliteBossChance(int BlueEliteBossChance){
		this.BlueEliteBossChance = BlueEliteBossChance
	}
	
	// 金色精英BOSS概率/万分之
	private int GoldEliteBossChance;
	
	public int getGoldEliteBossChance(){
		return GoldEliteBossChance
	}
	
	public void setGoldEliteBossChance(int GoldEliteBossChance){
		this.GoldEliteBossChance = GoldEliteBossChance
	}
	
	// 蓝色精英怪数量
	private int BlueEliteMonsterCount;
	
	public int getBlueEliteMonsterCount(){
		return BlueEliteMonsterCount
	}
	
	public void setBlueEliteMonsterCount(int BlueEliteMonsterCount){
		this.BlueEliteMonsterCount = BlueEliteMonsterCount
	}
	
	// 金色精英怪数量
	private int GoldEliteMonsterCount;
	
	public int getGoldEliteMonsterCount(){
		return GoldEliteMonsterCount
	}
	
	public void setGoldEliteMonsterCount(int GoldEliteMonsterCount){
		this.GoldEliteMonsterCount = GoldEliteMonsterCount
	}
	
	// 宝箱可能最小数量
	private int ChestMin;
	
	public int getChestMin(){
		return ChestMin
	}
	
	public void setChestMin(int ChestMin){
		this.ChestMin = ChestMin
	}
	
	// 宝箱可能最大数量
	private int ChestMax;
	
	public int getChestMax(){
		return ChestMax
	}
	
	public void setChestMax(int ChestMax){
		this.ChestMax = ChestMax
	}
	
	// 宝箱Id列表
	private string ChestList;
	
	public string getChestList(){
		return ChestList
	}
	
	public void setChestList(string ChestList){
		this.ChestList = ChestList
	}
	
	// 宝箱出现概率,与ChestList一一对应,表示/10000,总和应该=10000
	private string ChestChance;
	
	public string getChestChance(){
		return ChestChance
	}
	
	public void setChestChance(string ChestChance){
		this.ChestChance = ChestChance
	}
	
	// 宠物可能出现最小数量
	private int PetMin;
	
	public int getPetMin(){
		return PetMin
	}
	
	public void setPetMin(int PetMin){
		this.PetMin = PetMin
	}
	
	// 宠物可能出现最大数量
	private int PetMax;
	
	public int getPetMax(){
		return PetMax
	}
	
	public void setPetMax(int PetMax){
		this.PetMax = PetMax
	}
	
	// 可用宠物列表
	private string PetList;
	
	public string getPetList(){
		return PetList
	}
	
	public void setPetList(string PetList){
		this.PetList = PetList
	}
	
	// 宠物出现概率,与PetList一一对应,表示/10000,总和应该=10000
	private string PetChance;
	
	public string getPetChance(){
		return PetChance
	}
	
	public void setPetChance(string PetChance){
		this.PetChance = PetChance
	}
	
	// 通关奖励经验值
	private int CompleteExp;
	
	public int getCompleteExp(){
		return CompleteExp
	}
	
	public void setCompleteExp(int CompleteExp){
		this.CompleteExp = CompleteExp
	}
	
	// 通关奖励金币数量
	private int CompleteGold;
	
	public int getCompleteGold(){
		return CompleteGold
	}
	
	public void setCompleteGold(int CompleteGold){
		this.CompleteGold = CompleteGold
	}
	
	
}

public class CopyDifficultyCfg
{
	public const string FILENAME = "CopyDifficulty";
	public HashMap<int, BaseTbl> Init()
	{
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null)
		{
			return null;
		}
		var dict = new HashMap<int, BaseTbl>();
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