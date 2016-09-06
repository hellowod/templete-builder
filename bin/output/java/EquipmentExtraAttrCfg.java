package com.config;

import java.util.HashMap;

/***
 * EquipmentExtraAttrTbl.java
 * EquipmentExtraAttrCfg.java
 *
 * @Author: abaojin
 */
public class EquipmentExtraAttrTbl
{
	// #主键
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 职业
	private int Occupation;
	
	public int getOccupation(){
		return Occupation
	}
	
	public void setOccupation(int Occupation){
		this.Occupation = Occupation
	}
	
	// 装备等级下限
	private int LevelMin;
	
	public int getLevelMin(){
		return LevelMin
	}
	
	public void setLevelMin(int LevelMin){
		this.LevelMin = LevelMin
	}
	
	// 装备等级上限
	private int LevelMax;
	
	public int getLevelMax(){
		return LevelMax
	}
	
	public void setLevelMax(int LevelMax){
		this.LevelMax = LevelMax
	}
	
	// 属性枚举
	private int AttrIndex;
	
	public int getAttrIndex(){
		return AttrIndex
	}
	
	public void setAttrIndex(int AttrIndex){
		this.AttrIndex = AttrIndex
	}
	
	// 属性值下限
	private int ValueMin;
	
	public int getValueMin(){
		return ValueMin
	}
	
	public void setValueMin(int ValueMin){
		this.ValueMin = ValueMin
	}
	
	// 属性值上限
	private int ValueMax;
	
	public int getValueMax(){
		return ValueMax
	}
	
	public void setValueMax(int ValueMax){
		this.ValueMax = ValueMax
	}
	
	
}

public class EquipmentExtraAttrCfg
{
	public const string FILENAME = "EquipmentExtraAttr";
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
			EquipmentExtraAttrTbl record = new EquipmentExtraAttrTbl();
			
			record.Occupation = table.GetInt(i, "Occupation");
			record.LevelMin = table.GetInt(i, "LevelMin");
			record.LevelMax = table.GetInt(i, "LevelMax");
			record.AttrIndex = table.GetInt(i, "AttrIndex");
			record.ValueMin = table.GetInt(i, "ValueMin");
			record.ValueMax = table.GetInt(i, "ValueMax");
			
			if(!dict.ContainsKey(record.Id))
			{
				continue;
			}
			dict.Add(record.Id, record);
		}
		return dict;
	}	
}