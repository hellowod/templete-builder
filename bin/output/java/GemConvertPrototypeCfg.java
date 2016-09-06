package com.config;

import java.util.HashMap;

/***
 * GemConvertPrototypeTbl.java
 * GemConvertPrototypeCfg.java
 *
 * @Author: abaojin
 */
public class GemConvertPrototypeTbl
{
	// #主键
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 转换目标列表
	private string TargetList;
	
	public string getTargetList(){
		return TargetList
	}
	
	public void setTargetList(string TargetList){
		this.TargetList = TargetList
	}
	
	// 金币价格
	private int GoldPrice;
	
	public int getGoldPrice(){
		return GoldPrice
	}
	
	public void setGoldPrice(int GoldPrice){
		this.GoldPrice = GoldPrice
	}
	
	
}

public class GemConvertPrototypeCfg
{
	public const string FILENAME = "GemConvertPrototype";
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
			GemConvertPrototypeTbl record = new GemConvertPrototypeTbl();
			
			record.TargetList = table.GetString(i, "TargetList");
			record.GoldPrice = table.GetInt(i, "GoldPrice");
			
			if(!dict.ContainsKey(record.Id))
			{
				continue;
			}
			dict.Add(record.Id, record);
		}
		return dict;
	}	
}