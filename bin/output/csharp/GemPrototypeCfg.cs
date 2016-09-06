using System;
using System.Collections.Generic;

/***
 * GemPrototypeTbl.cs
 * GemPrototypeCfg.cs
 *
 * @Author: abaojin
 */
namespace Config
{
	public class GemPrototypeTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 宝石类型
		public int GemType {get; set; }
		// 宝石等级(1-10)
		public int GemRank {get; set; }
		// 宝石属性值
		public string GemAttrList {get; set; }
		// 宝石属性值
		public string GemAttrValueList {get; set; }
		
	}
	
    public class GemPrototypeCfg
    {
		public const string FILENAME = "GemPrototype";
		public Dictionary<int, BaseTbl> Init()
		{
			Table table = TableLoad.LoadTbl(FILENAME);
			if(table == null)
			{
				return null;
			}
			var dict = new Dictionary<int, BaseTbl>();
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
}