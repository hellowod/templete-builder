package com.config;

import java.util.HashMap;

/***
 * StreamLightTbl.java
 * StreamLightCfg.java
 *
 * @Author: abaojin
 */
public class StreamLightTbl
{
	// #主键
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 描述
	private string Des;
	
	public string getDes(){
		return Des
	}
	
	public void setDes(string Des){
		this.Des = Des
	}
	
	// 材质球路径
	private string MaterialPath;
	
	public string getMaterialPath(){
		return MaterialPath
	}
	
	public void setMaterialPath(string MaterialPath){
		this.MaterialPath = MaterialPath
	}
	
	
}

public class StreamLightCfg
{
	public const string FILENAME = "StreamLight";
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
			StreamLightTbl record = new StreamLightTbl();
			
			record.Des = table.GetString(i, "Des");
			record.MaterialPath = table.GetString(i, "MaterialPath");
			
			if(!dict.ContainsKey(record.Id))
			{
				continue;
			}
			dict.Add(record.Id, record);
		}
		return dict;
	}	
}