package com.config;

import java.util.HashMap;

/***
 * PetSkillInfoTbl.java
 * PetSkillInfoCfg.java
 *
 * @Author: abaojin
 */
public class PetSkillInfoTbl
{
	// #主键
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 技能ID
	private int SkillId;
	
	public int getSkillId(){
		return SkillId
	}
	
	public void setSkillId(int SkillId){
		this.SkillId = SkillId
	}
	
	// 1主动2被动
	private int SkillType;
	
	public int getSkillType(){
		return SkillType
	}
	
	public void setSkillType(int SkillType){
		this.SkillType = SkillType
	}
	
	// 技能是否可领悟,1是0否
	private int IsAutoGet;
	
	public int getIsAutoGet(){
		return IsAutoGet
	}
	
	public void setIsAutoGet(int IsAutoGet){
		this.IsAutoGet = IsAutoGet
	}
	
	// 技能领悟权重, 某个技能的领悟概率 = 该技能领悟权重/所有其他可领悟技能权重之和
	private int AutoGetWeight;
	
	public int getAutoGetWeight(){
		return AutoGetWeight
	}
	
	public void setAutoGetWeight(int AutoGetWeight){
		this.AutoGetWeight = AutoGetWeight
	}
	
	// 学习1级该技能所需道具id, 0表示不能通过道具学习
	private int LearnItem1;
	
	public int getLearnItem1(){
		return LearnItem1
	}
	
	public void setLearnItem1(int LearnItem1){
		this.LearnItem1 = LearnItem1
	}
	
	// 学习2级该技能所需道具id, 0表示不能通过道具学习
	private int LearnItem2;
	
	public int getLearnItem2(){
		return LearnItem2
	}
	
	public void setLearnItem2(int LearnItem2){
		this.LearnItem2 = LearnItem2
	}
	
	// 学习3级该技能所需道具id, 0表示不能通过道具学习
	private int LearnItem3;
	
	public int getLearnItem3(){
		return LearnItem3
	}
	
	public void setLearnItem3(int LearnItem3){
		this.LearnItem3 = LearnItem3
	}
	
	
}

public class PetSkillInfoCfg
{
	public const string FILENAME = "PetSkillInfo";
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
			PetSkillInfoTbl record = new PetSkillInfoTbl();
			
			record.SkillId = table.GetInt(i, "SkillId");
			record.SkillType = table.GetInt(i, "SkillType");
			record.IsAutoGet = table.GetInt(i, "IsAutoGet");
			record.AutoGetWeight = table.GetInt(i, "AutoGetWeight");
			record.LearnItem1 = table.GetInt(i, "LearnItem1");
			record.LearnItem2 = table.GetInt(i, "LearnItem2");
			record.LearnItem3 = table.GetInt(i, "LearnItem3");
			
			if(!dict.ContainsKey(record.Id))
			{
				continue;
			}
			dict.Add(record.Id, record);
		}
		return dict;
	}	
}