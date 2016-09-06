package com.config;

import java.util.HashMap;

/***
 * RoleLevelPrototypeTbl.java
 * RoleLevelPrototypeCfg.java
 *
 * @Author: abaojin
 */
public class RoleLevelPrototypeTbl {

	// #主键
	private ﻿int Id;
	// 升级所需经验值(消耗式升级)
	private int LevelupExp;
	// 当前等级精力上限
	private int ForceLimit;
	// 攻击减伤系数
	private int ReduceArgument;
	// 可携带宠物数量上限
	private int PetCarryLimit;
	
	
	public ﻿int getId(){
		return Id
	}
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	public int getLevelupExp(){
		return LevelupExp
	}
	public void setLevelupExp(int LevelupExp){
		this.LevelupExp = LevelupExp
	}
	
	public int getForceLimit(){
		return ForceLimit
	}
	public void setForceLimit(int ForceLimit){
		this.ForceLimit = ForceLimit
	}
	
	public int getReduceArgument(){
		return ReduceArgument
	}
	public void setReduceArgument(int ReduceArgument){
		this.ReduceArgument = ReduceArgument
	}
	
	public int getPetCarryLimit(){
		return PetCarryLimit
	}
	public void setPetCarryLimit(int PetCarryLimit){
		this.PetCarryLimit = PetCarryLimit
	}
	
}

public class RoleLevelPrototypeCfg {
	public const string FILENAME = "RoleLevelPrototype";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			RoleLevelPrototypeTbl record = new RoleLevelPrototypeTbl();
			
			record.LevelupExp = table.GetInt(i, "LevelupExp");
			record.ForceLimit = table.GetInt(i, "ForceLimit");
			record.ReduceArgument = table.GetInt(i, "ReduceArgument");
			record.PetCarryLimit = table.GetInt(i, "PetCarryLimit");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}