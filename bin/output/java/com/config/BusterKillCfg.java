package com.config;

import java.util.HashMap;

/***
 * BusterKillTbl.java
 * BusterKillCfg.java
 *
 * @Author: abaojin
 */
public class BusterKillTbl {

	// #主键
	private ﻿int Id;
	// 需要击杀怪物数量
	private int MonsterCount;
	// 普通屠魔经验
	private int ExpRank1;
	// 优质屠魔经验
	private int ExpRank2;
	// 精良屠魔经验
	private int ExpRank3;
	// 传说屠魔经验
	private int ExpRank4;
	// 史诗屠魔经验
	private int ExpRank5;
	
	
	public ﻿int getId(){
		return Id
	}
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	public int getMonsterCount(){
		return MonsterCount
	}
	public void setMonsterCount(int MonsterCount){
		this.MonsterCount = MonsterCount
	}
	
	public int getExpRank1(){
		return ExpRank1
	}
	public void setExpRank1(int ExpRank1){
		this.ExpRank1 = ExpRank1
	}
	
	public int getExpRank2(){
		return ExpRank2
	}
	public void setExpRank2(int ExpRank2){
		this.ExpRank2 = ExpRank2
	}
	
	public int getExpRank3(){
		return ExpRank3
	}
	public void setExpRank3(int ExpRank3){
		this.ExpRank3 = ExpRank3
	}
	
	public int getExpRank4(){
		return ExpRank4
	}
	public void setExpRank4(int ExpRank4){
		this.ExpRank4 = ExpRank4
	}
	
	public int getExpRank5(){
		return ExpRank5
	}
	public void setExpRank5(int ExpRank5){
		this.ExpRank5 = ExpRank5
	}
	
}

public class BusterKillCfg {
	public const string FILENAME = "BusterKill";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			BusterKillTbl record = new BusterKillTbl();
			
			record.MonsterCount = table.GetInt(i, "MonsterCount");
			record.ExpRank1 = table.GetInt(i, "ExpRank1");
			record.ExpRank2 = table.GetInt(i, "ExpRank2");
			record.ExpRank3 = table.GetInt(i, "ExpRank3");
			record.ExpRank4 = table.GetInt(i, "ExpRank4");
			record.ExpRank5 = table.GetInt(i, "ExpRank5");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}