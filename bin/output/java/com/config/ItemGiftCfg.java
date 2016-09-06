package com.config;

import java.util.HashMap;

/***
 * ItemGiftTbl.java
 * ItemGiftCfg.java
 *
 * @Author: abaojin
 */
public class ItemGiftTbl {

	// #主键
	private ﻿int Id;
	// 道具id列表
	private string ItemList;
	// 道具数量列表
	private string ItemCount;
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
	// 该礼包中获得的装备的强化等级
	private int EquipLevel;
	
	
	public ﻿int getId(){
		return Id
	}
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	public string getItemList(){
		return ItemList
	}
	public void setItemList(string ItemList){
		this.ItemList = ItemList
	}
	
	public string getItemCount(){
		return ItemCount
	}
	public void setItemCount(string ItemCount){
		this.ItemCount = ItemCount
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
	
	public int getEquipLevel(){
		return EquipLevel
	}
	public void setEquipLevel(int EquipLevel){
		this.EquipLevel = EquipLevel
	}
	
}

public class ItemGiftCfg {
	public const string FILENAME = "ItemGift";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			ItemGiftTbl record = new ItemGiftTbl();
			
			record.ItemList = table.GetString(i, "ItemList");
			record.ItemCount = table.GetString(i, "ItemCount");
			record.EquipmentRarity1Chance = table.GetInt(i, "EquipmentRarity1Chance");
			record.EquipmentRarity2Chance = table.GetInt(i, "EquipmentRarity2Chance");
			record.EquipmentRarity3Chance = table.GetInt(i, "EquipmentRarity3Chance");
			record.EquipmentRarity4Chance = table.GetInt(i, "EquipmentRarity4Chance");
			record.EquipmentRarity5Chance = table.GetInt(i, "EquipmentRarity5Chance");
			record.EquipLevel = table.GetInt(i, "EquipLevel");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}