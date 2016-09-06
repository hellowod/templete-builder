package com.config;

import java.util.HashMap;

/***
 * PetLevelTbl.java
 * PetLevelCfg.java
 *
 * @Author: abaojin
 */
public class PetLevelTbl
{
	// #ID
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 升级所需经验
	private int Exp;
	
	public int getExp(){
		return Exp
	}
	
	public void setExp(int Exp){
		this.Exp = Exp
	}
	
	
}

public class PetLevelCfg
{
	public const string FILENAME = "PetLevel";
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
			PetLevelTbl record = new PetLevelTbl();
			
			record.Exp = table.GetInt(i, "Exp");
			
			if(!dict.ContainsKey(record.Id))
			{
				continue;
			}
			dict.Add(record.Id, record);
		}
		return dict;
	}	
}