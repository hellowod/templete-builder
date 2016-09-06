package com.config;

import java.util.HashMap;

/***
 * EquipmentRarityTbl.java
 * EquipmentRarityCfg.java
 *
 * @Author: abaojin
 */
public class EquipmentRarityTbl {

	// #主键
	private ﻿int Id;
	// 装备稀有度
	private int Rarity;
	// 卓越附加属性数量下限
	private int RemarkableCountMin;
	// 卓越附加属性数量上限
	private int RemarkableCountMax;
	// 宝石槽数量下限
	private int GemSlotMin;
	// 宝石槽数量上限
	private int GemSlotMax;
	
	
	public ﻿int getId(){
		return Id
	}
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	public int getRarity(){
		return Rarity
	}
	public void setRarity(int Rarity){
		this.Rarity = Rarity
	}
	
	public int getRemarkableCountMin(){
		return RemarkableCountMin
	}
	public void setRemarkableCountMin(int RemarkableCountMin){
		this.RemarkableCountMin = RemarkableCountMin
	}
	
	public int getRemarkableCountMax(){
		return RemarkableCountMax
	}
	public void setRemarkableCountMax(int RemarkableCountMax){
		this.RemarkableCountMax = RemarkableCountMax
	}
	
	public int getGemSlotMin(){
		return GemSlotMin
	}
	public void setGemSlotMin(int GemSlotMin){
		this.GemSlotMin = GemSlotMin
	}
	
	public int getGemSlotMax(){
		return GemSlotMax
	}
	public void setGemSlotMax(int GemSlotMax){
		this.GemSlotMax = GemSlotMax
	}
	
}

public class EquipmentRarityCfg {
	public const string FILENAME = "EquipmentRarity";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			EquipmentRarityTbl record = new EquipmentRarityTbl();
			
			record.Rarity = table.GetInt(i, "Rarity");
			record.RemarkableCountMin = table.GetInt(i, "RemarkableCountMin");
			record.RemarkableCountMax = table.GetInt(i, "RemarkableCountMax");
			record.GemSlotMin = table.GetInt(i, "GemSlotMin");
			record.GemSlotMax = table.GetInt(i, "GemSlotMax");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}