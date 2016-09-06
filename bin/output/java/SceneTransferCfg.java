package com.config;

import java.util.HashMap;

/***
 * SceneTransferTbl.java
 * SceneTransferCfg.java
 *
 * @Author: abaojin
 */
public class SceneTransferTbl
{
	// #主键
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 传送点名称
	private string Name;
	
	public string getName(){
		return Name
	}
	
	public void setName(string Name){
		this.Name = Name
	}
	
	// 非程序用注释
	private string Des;
	
	public string getDes(){
		return Des
	}
	
	public void setDes(string Des){
		this.Des = Des
	}
	
	// 传送目标副本的id列表
	private string TargetList;
	
	public string getTargetList(){
		return TargetList
	}
	
	public void setTargetList(string TargetList){
		this.TargetList = TargetList
	}
	
	
}

public class SceneTransferCfg
{
	public const string FILENAME = "SceneTransfer";
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
			SceneTransferTbl record = new SceneTransferTbl();
			
			record.Name = table.GetString(i, "Name");
			record.Des = table.GetString(i, "Des");
			record.TargetList = table.GetString(i, "TargetList");
			
			if(!dict.ContainsKey(record.Id))
			{
				continue;
			}
			dict.Add(record.Id, record);
		}
		return dict;
	}	
}