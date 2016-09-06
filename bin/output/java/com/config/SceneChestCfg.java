package com.config;

import java.util.HashMap;

/***
 * SceneChestTbl.java
 * SceneChestCfg.java
 *
 * @Author: abaojin
 */
public class SceneChestTbl {

	// #主键
	private ﻿int Id;
	// 宝箱品质
	private int Rank;
	// 名称
	private string Name;
	// 模型路径
	private string ModelPath;
	// 存在特效id
	private int ExistEffect;
	// 打开特效id
	private int OpenEffect;
	// 打开时间
	private int OpenTime;
	// 掉落道具列表
	private string DropItemList;
	// 掉落道具概率
	private string DropChanceList;
	// 掉落数量列表
	private string DropCountList;
	// 掉落次数
	private int DropCount;
	// 稀有度1装备掉落权重
	private int EquipmentRarity1Chance;
	// 稀有度2装备掉落权重
	private int EquipmentRarity2Chance;
	// 稀有度3装备掉落权重
	private int EquipmentRarity3Chance;
	// 稀有度4装备掉落权重
	private int EquipmentRarity4Chance;
	// 稀有度5装备掉落权重
	private int EquipmentRarity5Chance;
	
	
	public ﻿int getId(){
		return Id
	}
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	public int getRank(){
		return Rank
	}
	public void setRank(int Rank){
		this.Rank = Rank
	}
	
	public string getName(){
		return Name
	}
	public void setName(string Name){
		this.Name = Name
	}
	
	public string getModelPath(){
		return ModelPath
	}
	public void setModelPath(string ModelPath){
		this.ModelPath = ModelPath
	}
	
	public int getExistEffect(){
		return ExistEffect
	}
	public void setExistEffect(int ExistEffect){
		this.ExistEffect = ExistEffect
	}
	
	public int getOpenEffect(){
		return OpenEffect
	}
	public void setOpenEffect(int OpenEffect){
		this.OpenEffect = OpenEffect
	}
	
	public int getOpenTime(){
		return OpenTime
	}
	public void setOpenTime(int OpenTime){
		this.OpenTime = OpenTime
	}
	
	public string getDropItemList(){
		return DropItemList
	}
	public void setDropItemList(string DropItemList){
		this.DropItemList = DropItemList
	}
	
	public string getDropChanceList(){
		return DropChanceList
	}
	public void setDropChanceList(string DropChanceList){
		this.DropChanceList = DropChanceList
	}
	
	public string getDropCountList(){
		return DropCountList
	}
	public void setDropCountList(string DropCountList){
		this.DropCountList = DropCountList
	}
	
	public int getDropCount(){
		return DropCount
	}
	public void setDropCount(int DropCount){
		this.DropCount = DropCount
	}
	
	public int getEquipmentRarity1Chance(){
		return EquipmentRarity1Chance
	}
	public void setEquipmentRarity1Chance(int EquipmentRarity1Chance){
		this.EquipmentRarity1Chance = EquipmentRarity1Chance
	}
	
	public int getEquipmentRarity2Chance(){
		return EquipmentRarity2Chance
	}
	public void setEquipmentRarity2Chance(int EquipmentRarity2Chance){
		this.EquipmentRarity2Chance = EquipmentRarity2Chance
	}
	
	public int getEquipmentRarity3Chance(){
		return EquipmentRarity3Chance
	}
	public void setEquipmentRarity3Chance(int EquipmentRarity3Chance){
		this.EquipmentRarity3Chance = EquipmentRarity3Chance
	}
	
	public int getEquipmentRarity4Chance(){
		return EquipmentRarity4Chance
	}
	public void setEquipmentRarity4Chance(int EquipmentRarity4Chance){
		this.EquipmentRarity4Chance = EquipmentRarity4Chance
	}
	
	public int getEquipmentRarity5Chance(){
		return EquipmentRarity5Chance
	}
	public void setEquipmentRarity5Chance(int EquipmentRarity5Chance){
		this.EquipmentRarity5Chance = EquipmentRarity5Chance
	}
	
}

public class SceneChestCfg {
	public const string FILENAME = "SceneChest";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			SceneChestTbl record = new SceneChestTbl();
			
			record.Rank = table.GetInt(i, "Rank");
			record.Name = table.GetString(i, "Name");
			record.ModelPath = table.GetString(i, "ModelPath");
			record.ExistEffect = table.GetInt(i, "ExistEffect");
			record.OpenEffect = table.GetInt(i, "OpenEffect");
			record.OpenTime = table.GetInt(i, "OpenTime");
			record.DropItemList = table.GetString(i, "DropItemList");
			record.DropChanceList = table.GetString(i, "DropChanceList");
			record.DropCountList = table.GetString(i, "DropCountList");
			record.DropCount = table.GetInt(i, "DropCount");
			record.EquipmentRarity1Chance = table.GetInt(i, "EquipmentRarity1Chance");
			record.EquipmentRarity2Chance = table.GetInt(i, "EquipmentRarity2Chance");
			record.EquipmentRarity3Chance = table.GetInt(i, "EquipmentRarity3Chance");
			record.EquipmentRarity4Chance = table.GetInt(i, "EquipmentRarity4Chance");
			record.EquipmentRarity5Chance = table.GetInt(i, "EquipmentRarity5Chance");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}