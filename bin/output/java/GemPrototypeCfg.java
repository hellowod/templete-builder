package com.config;

import java.util.HashMap;

/***
 * GemPrototypeTbl.java
 * GemPrototypeCfg.java
 *
 * @Author: abaojin
 */
public class GemPrototypeTbl
{
	// #主键
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 宝石类型
	private int GemType;
	
	public int getGemType(){
		return GemType
	}
	
	public void setGemType(int GemType){
		this.GemType = GemType
	}
	
	// 宝石等级(1-10)
	private int GemRank;
	
	public int getGemRank(){
		return GemRank
	}
	
	public void setGemRank(int GemRank){
		this.GemRank = GemRank
	}
	
	// 宝石属性值
	private string GemAttrList;
	
	public string getGemAttrList(){
		return GemAttrList
	}
	
	public void setGemAttrList(string GemAttrList){
		this.GemAttrList = GemAttrList
	}
	
	// 宝石属性值
	private string GemAttrValueList;
	
	public string getGemAttrValueList(){
		return GemAttrValueList
	}
	
	public void setGemAttrValueList(string GemAttrValueList){
		this.GemAttrValueList = GemAttrValueList
	}
	
	
}

public class GemPrototypeCfg
{
	public const string FILENAME = "GemPrototype";
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
			GemPrototypeTbl record = new GemPrototypeTbl();
			
			record.GemType = table.GetInt(i, "GemType");
			record.GemRank = table.GetInt(i, "GemRank");
			record.GemAttrList = table.GetString(i, "GemAttrList");
			record.GemAttrValueList = table.GetString(i, "GemAttrValueList");
			
			if(!dict.ContainsKey(record.Id))
			{
				continue;
			}
			dict.Add(record.Id, record);
		}
		return dict;
	}	
}