package com.config;

import java.util.HashMap;

/***
 * EquipmentExtraAttrTbl.java
 * EquipmentExtraAttrCfg.java
 *
 * @Author: abaojin
 */
public class EquipmentExtraAttrTbl {

	// #主键
	private ﻿int Id;
	// 职业
	private int Occupation;
	// 装备等级下限
	private int LevelMin;
	// 装备等级上限
	private int LevelMax;
	// 属性枚举
	private int AttrIndex;
	// 属性值下限
	private int ValueMin;
	// 属性值上限
	private int ValueMax;
	
	
	public ﻿int getId(){
		return Id
	}
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	public int getOccupation(){
		return Occupation
	}
	public void setOccupation(int Occupation){
		this.Occupation = Occupation
	}
	
	public int getLevelMin(){
		return LevelMin
	}
	public void setLevelMin(int LevelMin){
		this.LevelMin = LevelMin
	}
	
	public int getLevelMax(){
		return LevelMax
	}
	public void setLevelMax(int LevelMax){
		this.LevelMax = LevelMax
	}
	
	public int getAttrIndex(){
		return AttrIndex
	}
	public void setAttrIndex(int AttrIndex){
		this.AttrIndex = AttrIndex
	}
	
	public int getValueMin(){
		return ValueMin
	}
	public void setValueMin(int ValueMin){
		this.ValueMin = ValueMin
	}
	
	public int getValueMax(){
		return ValueMax
	}
	public void setValueMax(int ValueMax){
		this.ValueMax = ValueMax
	}
	
}

public class EquipmentExtraAttrCfg {
	public const string FILENAME = "EquipmentExtraAttr";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			EquipmentExtraAttrTbl record = new EquipmentExtraAttrTbl();
			
			record.Occupation = table.GetInt(i, "Occupation");
			record.LevelMin = table.GetInt(i, "LevelMin");
			record.LevelMax = table.GetInt(i, "LevelMax");
			record.AttrIndex = table.GetInt(i, "AttrIndex");
			record.ValueMin = table.GetInt(i, "ValueMin");
			record.ValueMax = table.GetInt(i, "ValueMax");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}