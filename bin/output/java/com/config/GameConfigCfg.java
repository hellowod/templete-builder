package com.config;

import java.util.HashMap;

/***
 * GameConfigTbl.java
 * GameConfigCfg.java
 *
 * @Author: abaojin
 */
public class GameConfigTbl {

	// #主键
	private ﻿string Key;
	// 值
	private string Value;
	// 值类型(作为数据检查依据)
	private string ValueType;
	// 备注
	private string Remark;
	
	
	public ﻿string getKey(){
		return Key
	}
	public void setKey(﻿string Key){
		this.Key = Key
	}
	
	public string getValue(){
		return Value
	}
	public void setValue(string Value){
		this.Value = Value
	}
	
	public string getValueType(){
		return ValueType
	}
	public void setValueType(string ValueType){
		this.ValueType = ValueType
	}
	
	public string getRemark(){
		return Remark
	}
	public void setRemark(string Remark){
		this.Remark = Remark
	}
	
}

public class GameConfigCfg {
	public const string FILENAME = "GameConfig";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			GameConfigTbl record = new GameConfigTbl();
			
			record.Value = table.GetString(i, "Value");
			record.ValueType = table.GetString(i, "ValueType");
			record.Remark = table.GetString(i, "Remark");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}