package com.config;

import java.util.HashMap;

/***
 * EffectTbl.java
 * EffectCfg.java
 *
 * @Author: abaojin
 */
public class EffectTbl {

	// #主键
	private ﻿int Id;
	// 描述
	private string Desc;
	// 路径
	private string Path;
	// 制作人员
	private string Author;
	
	
	public ﻿int getId(){
		return Id
	}
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	public string getDesc(){
		return Desc
	}
	public void setDesc(string Desc){
		this.Desc = Desc
	}
	
	public string getPath(){
		return Path
	}
	public void setPath(string Path){
		this.Path = Path
	}
	
	public string getAuthor(){
		return Author
	}
	public void setAuthor(string Author){
		this.Author = Author
	}
	
}

public class EffectCfg {
	public const string FILENAME = "Effect";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			EffectTbl record = new EffectTbl();
			
			record.Desc = table.GetString(i, "Desc");
			record.Path = table.GetString(i, "Path");
			record.Author = table.GetString(i, "Author");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}