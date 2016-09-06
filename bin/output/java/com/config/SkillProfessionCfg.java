package com.config;

import java.util.HashMap;

/***
 * SkillProfessionTbl.java
 * SkillProfessionCfg.java
 *
 * @Author: abaojin
 */
public class SkillProfessionTbl {

	// #主键
	private ﻿int Id;
	// 职业枚举说明
	private string Desc;
	// 职业枚举
	private int Profession;
	// 技能次序号,1为普攻技能,角色创建自带1级,默认装配在写死的一个技能装配位
	private int Index;
	// 默认技能id
	private int DefaultId;
	// 奥义1技能id
	private int Profound1;
	// 奥义1解锁等级
	private int Profound1UnlockLevel;
	// 奥义1所需道具id
	private int Profound1Item;
	// 奥义1所需道具数量
	private int Profound1ItemCount;
	// 奥义1是否与原技能共存
	private int Profound1Coexist;
	// 奥义2技能id
	private int Profound2;
	// 奥义2解锁等级
	private int Profound2UnlockLevel;
	// 奥义2所需道具id
	private int Profound2Item;
	// 奥义2所需道具数量
	private int Profound2ItemCount;
	// 奥义2是否与原技能共存
	private int Profound2Coexist;
	
	
	public ﻿int getId(){
		return Id
	}
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	public string getDesc(){
		return Desc
	}
	public void setDesc(string Desc){
		this.Desc = Desc
	}
	
	public int getProfession(){
		return Profession
	}
	public void setProfession(int Profession){
		this.Profession = Profession
	}
	
	public int getIndex(){
		return Index
	}
	public void setIndex(int Index){
		this.Index = Index
	}
	
	public int getDefaultId(){
		return DefaultId
	}
	public void setDefaultId(int DefaultId){
		this.DefaultId = DefaultId
	}
	
	public int getProfound1(){
		return Profound1
	}
	public void setProfound1(int Profound1){
		this.Profound1 = Profound1
	}
	
	public int getProfound1UnlockLevel(){
		return Profound1UnlockLevel
	}
	public void setProfound1UnlockLevel(int Profound1UnlockLevel){
		this.Profound1UnlockLevel = Profound1UnlockLevel
	}
	
	public int getProfound1Item(){
		return Profound1Item
	}
	public void setProfound1Item(int Profound1Item){
		this.Profound1Item = Profound1Item
	}
	
	public int getProfound1ItemCount(){
		return Profound1ItemCount
	}
	public void setProfound1ItemCount(int Profound1ItemCount){
		this.Profound1ItemCount = Profound1ItemCount
	}
	
	public int getProfound1Coexist(){
		return Profound1Coexist
	}
	public void setProfound1Coexist(int Profound1Coexist){
		this.Profound1Coexist = Profound1Coexist
	}
	
	public int getProfound2(){
		return Profound2
	}
	public void setProfound2(int Profound2){
		this.Profound2 = Profound2
	}
	
	public int getProfound2UnlockLevel(){
		return Profound2UnlockLevel
	}
	public void setProfound2UnlockLevel(int Profound2UnlockLevel){
		this.Profound2UnlockLevel = Profound2UnlockLevel
	}
	
	public int getProfound2Item(){
		return Profound2Item
	}
	public void setProfound2Item(int Profound2Item){
		this.Profound2Item = Profound2Item
	}
	
	public int getProfound2ItemCount(){
		return Profound2ItemCount
	}
	public void setProfound2ItemCount(int Profound2ItemCount){
		this.Profound2ItemCount = Profound2ItemCount
	}
	
	public int getProfound2Coexist(){
		return Profound2Coexist
	}
	public void setProfound2Coexist(int Profound2Coexist){
		this.Profound2Coexist = Profound2Coexist
	}
	
}

public class SkillProfessionCfg {
	public const string FILENAME = "SkillProfession";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			SkillProfessionTbl record = new SkillProfessionTbl();
			
			record.Desc = table.GetString(i, "Desc");
			record.Profession = table.GetInt(i, "Profession");
			record.Index = table.GetInt(i, "Index");
			record.DefaultId = table.GetInt(i, "DefaultId");
			record.Profound1 = table.GetInt(i, "Profound1");
			record.Profound1UnlockLevel = table.GetInt(i, "Profound1UnlockLevel");
			record.Profound1Item = table.GetInt(i, "Profound1Item");
			record.Profound1ItemCount = table.GetInt(i, "Profound1ItemCount");
			record.Profound1Coexist = table.GetInt(i, "Profound1Coexist");
			record.Profound2 = table.GetInt(i, "Profound2");
			record.Profound2UnlockLevel = table.GetInt(i, "Profound2UnlockLevel");
			record.Profound2Item = table.GetInt(i, "Profound2Item");
			record.Profound2ItemCount = table.GetInt(i, "Profound2ItemCount");
			record.Profound2Coexist = table.GetInt(i, "Profound2Coexist");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}