package com.config;

import java.util.HashMap;

/***
 * MonsterDropWorldTbl.java
 * MonsterDropWorldCfg.java
 *
 * @Author: abaojin
 */
public class MonsterDropWorldTbl
{
	// #id
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 怪物等级下限
	private int MonsterLevelMin;
	
	public int getMonsterLevelMin(){
		return MonsterLevelMin
	}
	
	public void setMonsterLevelMin(int MonsterLevelMin){
		this.MonsterLevelMin = MonsterLevelMin
	}
	
	// 怪物等级上限
	private int MonsterLevelMax;
	
	public int getMonsterLevelMax(){
		return MonsterLevelMax
	}
	
	public void setMonsterLevelMax(int MonsterLevelMax){
		this.MonsterLevelMax = MonsterLevelMax
	}
	
	// 掉落道具列表
	private string DropItemList;
	
	public string getDropItemList(){
		return DropItemList
	}
	
	public void setDropItemList(string DropItemList){
		this.DropItemList = DropItemList
	}
	
	// 掉落道具概率万分比
	private string DropChanceList;
	
	public string getDropChanceList(){
		return DropChanceList
	}
	
	public void setDropChanceList(string DropChanceList){
		this.DropChanceList = DropChanceList
	}
	
	// 掉落数量列表
	private string DropCountList;
	
	public string getDropCountList(){
		return DropCountList
	}
	
	public void setDropCountList(string DropCountList){
		this.DropCountList = DropCountList
	}
	
	// 掉落次数
	private int DropCount;
	
	public int getDropCount(){
		return DropCount
	}
	
	public void setDropCount(int DropCount){
		this.DropCount = DropCount
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
	
	
}

public class MonsterDropWorldCfg
{
	public const string FILENAME = "MonsterDropWorld";
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
			MonsterDropWorldTbl record = new MonsterDropWorldTbl();
			
			record.MonsterLevelMin = table.GetInt(i, "MonsterLevelMin");
			record.MonsterLevelMax = table.GetInt(i, "MonsterLevelMax");
			record.DropItemList = table.GetString(i, "DropItemList");
			record.DropChanceList = table.GetString(i, "DropChanceList");
			record.DropCountList = table.GetString(i, "DropCountList");
			record.DropCount = table.GetInt(i, "DropCount");
			record.EquipmentRarity1Chance = table.GetInt(i, "EquipmentRarity1Chance");
			record.EquipmentRarity2Chance = table.GetInt(i, "EquipmentRarity2Chance");
			record.EquipmentRarity3Chance = table.GetInt(i, "EquipmentRarity3Chance");
			record.EquipmentRarity4Chance = table.GetInt(i, "EquipmentRarity4Chance");
			record.EquipmentRarity5Chance = table.GetInt(i, "EquipmentRarity5Chance");
			
			if(!dict.ContainsKey(record.Id))
			{
				continue;
			}
			dict.Add(record.Id, record);
		}
		return dict;
	}	
}