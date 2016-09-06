package com.config;

import java.util.HashMap;

/***
 * WorldFarmExpLimitTbl.java
 * WorldFarmExpLimitCfg.java
 *
 * @Author: abaojin
 */
public class WorldFarmExpLimitTbl {

	// #主键
	private ﻿int Id;
	// 100%经验条件值
	private int ExpStep1;
	// 50%经验条件值
	private int ExpStep2;
	// 25%经验条件值
	private int ExpStep3;
	
	
	public ﻿int getId(){
		return Id
	}
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	public int getExpStep1(){
		return ExpStep1
	}
	public void setExpStep1(int ExpStep1){
		this.ExpStep1 = ExpStep1
	}
	
	public int getExpStep2(){
		return ExpStep2
	}
	public void setExpStep2(int ExpStep2){
		this.ExpStep2 = ExpStep2
	}
	
	public int getExpStep3(){
		return ExpStep3
	}
	public void setExpStep3(int ExpStep3){
		this.ExpStep3 = ExpStep3
	}
	
}

public class WorldFarmExpLimitCfg {
	public const string FILENAME = "WorldFarmExpLimit";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			WorldFarmExpLimitTbl record = new WorldFarmExpLimitTbl();
			
			record.ExpStep1 = table.GetInt(i, "ExpStep1");
			record.ExpStep2 = table.GetInt(i, "ExpStep2");
			record.ExpStep3 = table.GetInt(i, "ExpStep3");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}