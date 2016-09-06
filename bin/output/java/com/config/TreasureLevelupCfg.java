package com.config;

import java.util.HashMap;

/***
 * TreasureLevelupTbl.java
 * TreasureLevelupCfg.java
 *
 * @Author: abaojin
 */
public class TreasureLevelupTbl {

	// #主键
	private ﻿int Id;
	// 法宝装备等级下限
	private int EquipLevelMin;
	// 法宝装备等级上限
	private int EquipLevelMax;
	// 法宝等级
	private int Level;
	// 法宝升级所需经验
	private int Exp;
	
	
	public ﻿int getId(){
		return Id
	}
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	public int getEquipLevelMin(){
		return EquipLevelMin
	}
	public void setEquipLevelMin(int EquipLevelMin){
		this.EquipLevelMin = EquipLevelMin
	}
	
	public int getEquipLevelMax(){
		return EquipLevelMax
	}
	public void setEquipLevelMax(int EquipLevelMax){
		this.EquipLevelMax = EquipLevelMax
	}
	
	public int getLevel(){
		return Level
	}
	public void setLevel(int Level){
		this.Level = Level
	}
	
	public int getExp(){
		return Exp
	}
	public void setExp(int Exp){
		this.Exp = Exp
	}
	
}

public class TreasureLevelupCfg {
	public const string FILENAME = "TreasureLevelup";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			TreasureLevelupTbl record = new TreasureLevelupTbl();
			
			record.EquipLevelMin = table.GetInt(i, "EquipLevelMin");
			record.EquipLevelMax = table.GetInt(i, "EquipLevelMax");
			record.Level = table.GetInt(i, "Level");
			record.Exp = table.GetInt(i, "Exp");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}