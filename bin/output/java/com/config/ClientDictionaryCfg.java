package com.config;

import java.util.HashMap;

/***
 * ClientDictionaryTbl.java
 * ClientDictionaryCfg.java
 *
 * @Author: abaojin
 */
public class ClientDictionaryTbl {

	// #主键
	private ﻿string Key;
	// 值
	private string DictionaryCH;
	// 备注说明
	private string Des;
	
	
	public ﻿string getKey(){
		return Key
	}
	public void setKey(﻿string Key){
		this.Key = Key
	}
	
	public string getDictionaryCH(){
		return DictionaryCH
	}
	public void setDictionaryCH(string DictionaryCH){
		this.DictionaryCH = DictionaryCH
	}
	
	public string getDes(){
		return Des
	}
	public void setDes(string Des){
		this.Des = Des
	}
	
}

public class ClientDictionaryCfg {
	public const string FILENAME = "ClientDictionary";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			ClientDictionaryTbl record = new ClientDictionaryTbl();
			
			record.DictionaryCH = table.GetString(i, "DictionaryCH");
			record.Des = table.GetString(i, "Des");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}