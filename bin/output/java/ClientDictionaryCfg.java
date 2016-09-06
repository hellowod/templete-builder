package com.config;

import java.util.HashMap;

/***
 * ClientDictionaryTbl.java
 * ClientDictionaryCfg.java
 *
 * @Author: abaojin
 */
public class ClientDictionaryTbl
{
	// #主键
	private ﻿string Key;
	
	public ﻿string getKey(){
		return Key
	}
	
	public void setKey(﻿string Key){
		this.Key = Key
	}
	
	// 值
	private string DictionaryCH;
	
	public string getDictionaryCH(){
		return DictionaryCH
	}
	
	public void setDictionaryCH(string DictionaryCH){
		this.DictionaryCH = DictionaryCH
	}
	
	// 备注说明
	private string Des;
	
	public string getDes(){
		return Des
	}
	
	public void setDes(string Des){
		this.Des = Des
	}
	
	
}

public class ClientDictionaryCfg
{
	public const string FILENAME = "ClientDictionary";
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
			ClientDictionaryTbl record = new ClientDictionaryTbl();
			
			record.DictionaryCH = table.GetString(i, "DictionaryCH");
			record.Des = table.GetString(i, "Des");
			
			if(!dict.ContainsKey(record.Id))
			{
				continue;
			}
			dict.Add(record.Id, record);
		}
		return dict;
	}	
}