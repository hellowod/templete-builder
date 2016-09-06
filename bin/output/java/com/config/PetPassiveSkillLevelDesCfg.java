package com.config;

import java.util.HashMap;

/***
 * PetPassiveSkillLevelDesTbl.java
 * PetPassiveSkillLevelDesCfg.java
 *
 * @Author: abaojin
 */
public class PetPassiveSkillLevelDesTbl {

	// #索引id格式为被动技能表id+数字0+技能等级
	private ﻿int Id;
	// 以备查询需要,技能id
	private int SkillId;
	// 以备查询需要,技能等级
	private int SkillLevel;
	// 该等级的技能描述文字
	private string Des;
	
	
	public ﻿int getId(){
		return Id
	}
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	public int getSkillId(){
		return SkillId
	}
	public void setSkillId(int SkillId){
		this.SkillId = SkillId
	}
	
	public int getSkillLevel(){
		return SkillLevel
	}
	public void setSkillLevel(int SkillLevel){
		this.SkillLevel = SkillLevel
	}
	
	public string getDes(){
		return Des
	}
	public void setDes(string Des){
		this.Des = Des
	}
	
}

public class PetPassiveSkillLevelDesCfg {
	public const string FILENAME = "PetPassiveSkillLevelDes";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			PetPassiveSkillLevelDesTbl record = new PetPassiveSkillLevelDesTbl();
			
			record.SkillId = table.GetInt(i, "SkillId");
			record.SkillLevel = table.GetInt(i, "SkillLevel");
			record.Des = table.GetString(i, "Des");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}