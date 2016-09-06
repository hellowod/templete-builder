package com.config;

import java.util.HashMap;

/***
 * TestTbl.java
 * TestCfg.java
 *
 * @Author: abaojin
 */
public class TestTbl
{
	// #主键
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 备注
	private string Remark;
	
	public string getRemark(){
		return Remark
	}
	
	public void setRemark(string Remark){
		this.Remark = Remark
	}
	
	// 测试数据ID（多个ID间以英文半角分号分隔，最后一个id不要加分号）
	private string Data;
	
	public string getData(){
		return Data
	}
	
	public void setData(string Data){
		this.Data = Data
	}
	
	
}

public class TestCfg
{
	public const string FILENAME = "Test";
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
			TestTbl record = new TestTbl();
			
			record.Remark = table.GetString(i, "Remark");
			record.Data = table.GetString(i, "Data");
			
			if(!dict.ContainsKey(record.Id))
			{
				continue;
			}
			dict.Add(record.Id, record);
		}
		return dict;
	}	
}