package com.config;

import java.util.HashMap;

/***
 * RoleAttrSetTbl.java
 * RoleAttrSetCfg.java
 *
 * @Author: abaojin
 */
public class RoleAttrSetTbl
{
	// #职业
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 每级力量加点
	private int StrSet;
	
	public int getStrSet(){
		return StrSet
	}
	
	public void setStrSet(int StrSet){
		this.StrSet = StrSet
	}
	
	// 每级敏捷加点
	private int DexSet;
	
	public int getDexSet(){
		return DexSet
	}
	
	public void setDexSet(int DexSet){
		this.DexSet = DexSet
	}
	
	// 每级智力加点
	private int WitSet;
	
	public int getWitSet(){
		return WitSet
	}
	
	public void setWitSet(int WitSet){
		this.WitSet = WitSet
	}
	
	// 每级体力加点
	private int VItSet;
	
	public int getVItSet(){
		return VItSet
	}
	
	public void setVItSet(int VItSet){
		this.VItSet = VItSet
	}
	
	
}

public class RoleAttrSetCfg
{
	public const string FILENAME = "RoleAttrSet";
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
			RoleAttrSetTbl record = new RoleAttrSetTbl();
			
			record.StrSet = table.GetInt(i, "StrSet");
			record.DexSet = table.GetInt(i, "DexSet");
			record.WitSet = table.GetInt(i, "WitSet");
			record.VItSet = table.GetInt(i, "VItSet");
			
			if(!dict.ContainsKey(record.Id))
			{
				continue;
			}
			dict.Add(record.Id, record);
		}
		return dict;
	}	
}